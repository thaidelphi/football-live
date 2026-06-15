package com.google.android.gms.internal.ads;

import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzagr implements zzagu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzagr(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzeh.zzs(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzagr zzb(long j10, zzafw zzafwVar, long j11) {
        int length = zzafwVar.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += zzafwVar.zzb + zzafwVar.zzd[i12];
            j12 += zzafwVar.zzc + zzafwVar.zze[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzagr(jArr, jArr2, j11);
    }

    private static Pair zzf(long j10, long[] jArr, long[] jArr2) {
        int zzd = zzeh.zzd(jArr, j10, true, true);
        long j11 = jArr[zzd];
        long j12 = jArr2[zzd];
        int i10 = zzd + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final long zze(long j10) {
        return zzeh.zzs(((Long) zzf(j10, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        int i10 = zzeh.zza;
        Pair zzf = zzf(zzeh.zzv(Math.max(0L, Math.min(j10, this.zzc))), this.zzb, this.zza);
        zzadj zzadjVar = new zzadj(zzeh.zzs(((Long) zzf.first).longValue()), ((Long) zzf.second).longValue());
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
