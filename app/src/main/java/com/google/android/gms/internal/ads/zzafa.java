package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzafa extends zzacv {
    private final long zza;

    public zzafa(zzack zzackVar, long j10) {
        super(zzackVar);
        zzcv.zzd(zzackVar.zzf() >= j10);
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzack
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzack
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzack
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
