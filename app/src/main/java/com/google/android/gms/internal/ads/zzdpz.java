package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdpz {
    private final ConcurrentHashMap zza;
    private final zzbyj zzb;
    private final zzfap zzc;
    private final String zzd;
    private final String zze;
    private final com.google.android.gms.ads.internal.zzk zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdpz(Context context, zzdqk zzdqkVar, zzbyj zzbyjVar, zzfap zzfapVar, String str, String str2, com.google.android.gms.ads.internal.zzk zzkVar) {
        ActivityManager.MemoryInfo zzc;
        ConcurrentHashMap zzc2 = zzdqkVar.zzc();
        this.zza = zzc2;
        this.zzb = zzbyjVar;
        this.zzc = zzfapVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzkVar;
        this.zzh = context;
        zzc2.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjv)).booleanValue()) {
            int zzp = zzkVar.zzp();
            int i10 = zzp - 1;
            if (zzp != 0) {
                zzc2.put("asv", i10 != 0 ? i10 != 1 ? "na" : CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : "1");
            } else {
                throw null;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzc("rt_f", String.valueOf(runtime.freeMemory()));
            zzc("rt_m", String.valueOf(runtime.maxMemory()));
            zzc("rt_t", String.valueOf(runtime.totalMemory()));
            zzc("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzv.zzp().zzb()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcp)).booleanValue() && (zzc = com.google.android.gms.ads.internal.util.client.zzf.zzc(context)) != null) {
                zzc("mem_avl", String.valueOf(zzc.availMem));
                zzc("mem_tt", String.valueOf(zzc.totalMem));
                zzc("low_m", true != zzc.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgN)).booleanValue()) {
            int zzf = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(zzfapVar) - 1;
            if (zzf != 0) {
                if (zzf == 1) {
                    zzc2.put("request_id", str);
                    zzc2.put("se", "query_g");
                } else if (zzf == 2) {
                    zzc2.put("se", "r_adinfo");
                } else if (zzf != 3) {
                    zzc2.put("se", "r_both");
                } else {
                    zzc2.put("se", "r_adstring");
                }
                zzc2.put("scar", com.ironsource.mediationsdk.metadata.a.f18924g);
                zzc("ragent", zzfapVar.zzd.zzp);
                zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfapVar.zzd)));
                return;
            }
            zzc2.put("request_id", str);
            zzc2.put("scar", "false");
        }
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final void zzd(zzfag zzfagVar) {
        if (!zzfagVar.zzb.zza.isEmpty()) {
            zzezu zzezuVar = (zzezu) zzfagVar.zzb.zza.get(0);
            zzc("ad_format", zzezu.zza(zzezuVar.zzb));
            if (zzezuVar.zzb == 6) {
                this.zza.put("as", true != this.zzb.zzm() ? "0" : "1");
            }
        }
        zzc("gqi", zzfagVar.zzb.zzb.zzb);
    }

    public final void zze(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzc("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzc("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
