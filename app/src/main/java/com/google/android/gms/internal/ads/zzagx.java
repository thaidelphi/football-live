package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzagx implements zzagu {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzagx(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzd = i11;
        this.zze = j12;
        this.zzg = jArr;
        this.zzf = j12 != -1 ? j10 + j12 : -1L;
    }

    public static zzagx zzb(zzagw zzagwVar, long j10) {
        long[] jArr;
        long zza = zzagwVar.zza();
        if (zza == -9223372036854775807L) {
            return null;
        }
        long j11 = zzagwVar.zzc;
        if (j11 == -1 || (jArr = zzagwVar.zzf) == null) {
            zzadb zzadbVar = zzagwVar.zza;
            return new zzagx(j10, zzadbVar.zzc, zza, zzadbVar.zzf, -1L, null);
        }
        zzadb zzadbVar2 = zzagwVar.zza;
        return new zzagx(j10, zzadbVar2.zzc, zza, zzadbVar2.zzf, j11, jArr);
    }

    private final long zzf(int i10) {
        return (this.zzc * i10) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final long zze(long j10) {
        if (zzh()) {
            long j11 = j10 - this.zza;
            if (j11 <= this.zzb) {
                return 0L;
            }
            long[] jArr = this.zzg;
            zzcv.zzb(jArr);
            double d10 = (j11 * 256.0d) / this.zze;
            int zzd = zzeh.zzd(jArr, (long) d10, true, true);
            long zzf = zzf(zzd);
            long j12 = jArr[zzd];
            int i10 = zzd + 1;
            long zzf2 = zzf(i10);
            long j13 = zzd == 99 ? 256L : jArr[i10];
            return zzf + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (zzf2 - zzf));
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        if (!zzh()) {
            zzadj zzadjVar = new zzadj(0L, this.zza + this.zzb);
            return new zzadg(zzadjVar, zzadjVar);
        }
        long j11 = this.zzc;
        int i10 = zzeh.zza;
        long max = Math.max(0L, Math.min(j10, j11));
        double d10 = (max * 100.0d) / this.zzc;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i11 = (int) d10;
                long[] jArr = this.zzg;
                zzcv.zzb(jArr);
                double d12 = jArr[i11];
                d11 = d12 + ((d10 - i11) * ((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d12));
            }
        }
        long j12 = this.zze;
        zzadj zzadjVar2 = new zzadj(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d11 / 256.0d) * j12), j12 - 1)));
        return new zzadg(zzadjVar2, zzadjVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return this.zzg != null;
    }
}
