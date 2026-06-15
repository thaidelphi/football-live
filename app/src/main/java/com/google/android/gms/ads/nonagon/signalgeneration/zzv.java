package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzdpz;
import com.google.android.gms.internal.ads.zzdqk;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzv {

    /* renamed from: h  reason: collision with root package name */
    private final zzdqk f11829h;

    /* renamed from: i  reason: collision with root package name */
    private Map f11830i;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f11827f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f11828g = new ArrayDeque();

    /* renamed from: a  reason: collision with root package name */
    private final int f11822a = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgL)).intValue();

    /* renamed from: b  reason: collision with root package name */
    private final long f11823b = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgM)).longValue();

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11824c = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgQ)).booleanValue();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11825d = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgP)).booleanValue();

    /* renamed from: e  reason: collision with root package name */
    private final Map f11826e = Collections.synchronizedMap(new zzt(this));

    public zzv(zzdqk zzdqkVar) {
        this.f11829h = zzdqkVar;
    }

    private final synchronized void c(final zzdpz zzdpzVar) {
        if (this.f11824c) {
            ArrayDeque arrayDeque = this.f11828g;
            final ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f11827f;
            final ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    zzv.zzd(zzv.this, zzdpzVar, clone, clone2);
                }
            });
        }
    }

    private final void d(zzdpz zzdpzVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdpzVar.zzb());
            this.f11830i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f11830i.put("e_r", str);
            this.f11830i.put("e_id", (String) pair2.first);
            if (this.f11825d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                f(this.f11830i, "e_type", (String) pair.first);
                f(this.f11830i, "e_agent", (String) pair.second);
            }
            this.f11829h.zzg(this.f11830i);
        }
    }

    private final synchronized void e() {
        long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
        try {
            Iterator it = this.f11826e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a10 - ((zzu) entry.getValue()).zza.longValue() <= this.f11823b) {
                    break;
                }
                this.f11828g.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void f(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public static /* synthetic */ void zzd(zzv zzvVar, zzdpz zzdpzVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzvVar.d(zzdpzVar, arrayDeque, "to");
        zzvVar.d(zzdpzVar, arrayDeque2, "of");
    }

    public final synchronized String zzb(String str, zzdpz zzdpzVar) {
        zzu zzuVar = (zzu) this.f11826e.get(str);
        zzdpzVar.zzb().put("request_id", str);
        if (zzuVar != null) {
            zzdpzVar.zzb().put("mhit", a.f18924g);
            return zzuVar.zzb;
        }
        zzdpzVar.zzb().put("mhit", "false");
        return null;
    }

    public final synchronized void zze(String str, String str2, zzdpz zzdpzVar) {
        this.f11826e.put(str, new zzu(Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a()), str2, new HashSet()));
        e();
        c(zzdpzVar);
    }

    public final synchronized void zzf(String str) {
        this.f11826e.remove(str);
    }

    public final synchronized boolean zzg(String str, String str2, int i10) {
        zzu zzuVar = (zzu) this.f11826e.get(str);
        if (zzuVar != null) {
            zzuVar.zzc.add(str2);
            return zzuVar.zzc.size() < i10;
        }
        return false;
    }

    public final synchronized boolean zzh(String str, String str2) {
        boolean z10;
        zzu zzuVar = (zzu) this.f11826e.get(str);
        if (zzuVar != null) {
            z10 = zzuVar.zzc.contains(str2);
        }
        return z10;
    }
}
