package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzacs implements zzadi {
    private final zzacu zza;
    private final long zzb;

    public zzacs(zzacu zzacuVar, long j10) {
        this.zza = zzacuVar;
        this.zzb = j10;
    }

    private final zzadj zzb(long j10, long j11) {
        return new zzadj((j10 * 1000000) / this.zza.zze, this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        zzcv.zzb(this.zza.zzk);
        zzacu zzacuVar = this.zza;
        zzact zzactVar = zzacuVar.zzk;
        long[] jArr = zzactVar.zza;
        long[] jArr2 = zzactVar.zzb;
        int zzd = zzeh.zzd(jArr, zzacuVar.zzb(j10), true, false);
        zzadj zzb = zzb(zzd == -1 ? 0L : jArr[zzd], zzd != -1 ? jArr2[zzd] : 0L);
        if (zzb.zzb != j10 && zzd != jArr.length - 1) {
            int i10 = zzd + 1;
            return new zzadg(zzb, zzb(jArr[i10], jArr2[i10]));
        }
        return new zzadg(zzb, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
