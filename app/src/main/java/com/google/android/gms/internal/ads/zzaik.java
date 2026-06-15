package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaik implements zzaip {
    private final zzacu zza;
    private final zzact zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzaik(zzacu zzacuVar, zzact zzactVar) {
        this.zza = zzacuVar;
        this.zzb = zzactVar;
    }

    public final void zza(long j10) {
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaip
    public final long zzd(zzack zzackVar) {
        long j10 = this.zzd;
        if (j10 >= 0) {
            this.zzd = -1L;
            return -(j10 + 2);
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaip
    public final zzadi zze() {
        zzcv.zzf(this.zzc != -1);
        return new zzacs(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaip
    public final void zzg(long j10) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzeh.zzd(jArr, j10, true, true)];
    }
}
