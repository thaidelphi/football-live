package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfia {
    private final zzdqf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfia(zzdqf zzdqfVar) {
        this.zza = zzdqfVar;
    }

    private final void zzg(AdFormat adFormat, String str, String str2, long j10, String str3) {
        zzdqe zza = this.zza.zza();
        zza.zzb(str2, Long.toString(j10));
        zza.zzb("ad_format", adFormat == null ? "unknown" : adFormat.name());
        if (str != null) {
            zza.zzb("action", str);
        }
        if (str3 != null) {
            zza.zzb("gqi", str3);
        }
        zza.zzj();
    }

    public final void zza(AdFormat adFormat, long j10, Long l10, String str) {
        zzdqe zza = this.zza.zza();
        zza.zzb("plaac_ts", Long.toString(j10));
        zza.zzb("ad_format", adFormat.name());
        zza.zzb("action", "is_ad_available");
        if (l10 != null) {
            zza.zzb("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            zza.zzb("gqi", str);
        }
        zza.zzj();
    }

    public final void zzb(AdFormat adFormat, long j10, String str) {
        zzg(adFormat, null, "pano_ts", j10, str);
    }

    public final void zzc(AdFormat adFormat, long j10) {
        zzg(adFormat, null, "paeo_ts", j10, null);
    }

    public final void zzd(AdFormat adFormat, long j10) {
        zzg(adFormat, "poll_ad", "ppac_ts", j10, null);
    }

    public final void zze(AdFormat adFormat, long j10, String str) {
        zzg(adFormat, "poll_ad", "ppla_ts", j10, str);
    }

    public final void zzf(Map map, long j10) {
        zzdqe zza = this.zza.zza();
        zza.zzb("action", "start_preload");
        zza.zzb("sp_ts", Long.toString(j10));
        for (AdFormat adFormat : map.keySet()) {
            String valueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zza.zzb(valueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zza.zzj();
    }
}
