package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbcb {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbcb(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbby zzf() {
        return new zzbby(com.google.android.gms.ads.internal.zzv.zzC().b(), null, null);
    }

    public final zzbca zza() {
        zzbca zzbcaVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbY)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbby zzbbyVar : this.zza) {
                long zza = zzbbyVar.zza();
                String zzc = zzbbyVar.zzc();
                zzbby zzb = zzbbyVar.zzb();
                if (zzb != null && zza > 0) {
                    sb.append(zzc);
                    sb.append('.');
                    sb.append(zza - zzb.zza());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb2.append('+');
                            sb2.append(zzc);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzv.zzC().a() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzv.zzC().b()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbcaVar = new zzbca(sb.toString(), str);
        }
        return zzbcaVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzv.zzp().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbcb zzbcbVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbbr zzg;
        if (TextUtils.isEmpty(str2) || (zzg = com.google.android.gms.ads.internal.zzv.zzp().zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbbx zza = zzg.zza(str);
            Map map = this.zzb;
            map.put(str, zza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbby zzbbyVar, long j10, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbby(j10, strArr[0], zzbbyVar));
        }
        return true;
    }
}
