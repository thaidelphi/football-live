package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcmm {
    private final zzdqf zza;
    private final zzfag zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmm(zzdqf zzdqfVar, zzfag zzfagVar) {
        this.zza = zzdqfVar;
        this.zzb = zzfagVar;
    }

    public final void zza(long j10, int i10) {
        zzdqe zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j10));
        zza.zzb("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        zza.zzb("acr", i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zza.zzj();
    }
}
