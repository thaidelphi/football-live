package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeqk implements zzerv {
    private final String zza;
    private final Integer zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzeqk(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcth) obj).zzb;
        zzfbd.zzc(bundle, "pn", this.zza);
        zzfbd.zzc(bundle, "dl", this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcth) obj).zza;
        zzfbd.zzc(bundle, "pn", this.zza);
        Integer num = this.zzb;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        zzfbd.zzc(bundle, "vnm", this.zzc);
        zzfbd.zzc(bundle, "dl", this.zzd);
        zzfbd.zzc(bundle, "ins_pn", this.zze);
        zzfbd.zzc(bundle, "ini_pn", this.zzf);
    }
}
