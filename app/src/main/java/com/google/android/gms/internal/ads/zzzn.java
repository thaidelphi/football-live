package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzzn implements zzaba {
    final /* synthetic */ zzrw zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzzq zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzn(zzzq zzzqVar, zzrw zzrwVar, int i10, long j10) {
        this.zza = zzrwVar;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = zzzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaba
    public final void zza(long j10) {
        this.zzd.zzao(this.zza, this.zzb, this.zzc, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaba
    public final void zzb() {
        this.zzd.zzaR(this.zza, this.zzb, this.zzc);
    }
}
