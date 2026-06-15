package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzebl {
    private final String zzc;
    private zzezx zzd = null;
    private zzezu zze = null;
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzebl(String str) {
        this.zzc = str;
    }

    private static String zzj(zzezu zzezuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdI)).booleanValue()) {
            return zzezuVar.zzap;
        }
        return zzezuVar.zzw;
    }

    private final synchronized void zzk(zzezu zzezuVar, int i10) {
        Map map = this.zzb;
        String zzj = zzj(zzezuVar);
        if (map.containsKey(zzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzezuVar.zzv.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzezuVar.zzv.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzezuVar.zzE, 0L, null, bundle, zzezuVar.zzF, zzezuVar.zzG, zzezuVar.zzH, zzezuVar.zzI);
        try {
            this.zza.add(i10, zzvVar);
        } catch (IndexOutOfBoundsException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzj, zzvVar);
    }

    private final void zzl(zzezu zzezuVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z10) {
        Map map = this.zzb;
        String zzj = zzj(zzezuVar);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzezuVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) this.zzb.get(zzj);
            zzvVar.zzb = j10;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgE)).booleanValue() && z10) {
                this.zzf = zzvVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzv zza() {
        return this.zzf;
    }

    public final zzcty zzb() {
        return new zzcty(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzezu zzezuVar) {
        zzk(zzezuVar, this.zza.size());
    }

    public final void zze(zzezu zzezuVar) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzezuVar)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) this.zza.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= this.zza.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) this.zza.get(indexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }

    public final void zzf(zzezu zzezuVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzezuVar, j10, zzeVar, false);
    }

    public final void zzg(zzezu zzezuVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzezuVar, j10, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzv) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzezu) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzezx zzezxVar) {
        this.zzd = zzezxVar;
    }
}
