package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzanl implements zzadi {
    private final zzani zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzanl(zzani zzaniVar, int i10, long j10, long j11) {
        this.zza = zzaniVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / zzaniVar.zzd;
        this.zzd = j12;
        this.zze = zzb(j12);
    }

    private final long zzb(long j10) {
        return zzeh.zzu(j10 * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        long j11 = (this.zza.zzc * j10) / (this.zzb * 1000000);
        int i10 = zzeh.zza;
        long max = Math.max(0L, Math.min(j11, this.zzd - 1));
        long zzb = zzb(max);
        zzadj zzadjVar = new zzadj(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb < j10 && max != this.zzd - 1) {
            long j12 = max + 1;
            return new zzadg(zzadjVar, new zzadj(zzb(j12), this.zzc + (j12 * this.zza.zzd)));
        }
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
