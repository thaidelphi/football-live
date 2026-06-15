package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzerh implements zzerv {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzerh(String str, String str2, String str3, String str4, Long l10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l10;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzfbd.zzc(((zzcth) obj).zzb, "fbs_aeid", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcth) obj).zza;
        zzfbd.zzc(bundle, "gmp_app_id", this.zza);
        zzfbd.zzc(bundle, "fbs_aiid", this.zzb);
        zzfbd.zzc(bundle, "fbs_aeid", this.zzc);
        zzfbd.zzc(bundle, "apm_id_origin", this.zzd);
        Long l10 = this.zze;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
