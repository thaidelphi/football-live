package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhm {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhm(float f10, float f11, long j10, float f12, long j11, long j12, float f13, zzhl zzhlVar) {
        this.zza = j11;
        this.zzb = j12;
    }

    private static long zzf(long j10, long j11, float f10) {
        return (((float) j10) * 0.999f) + (((float) j11) * 9.999871E-4f);
    }

    private final void zzg() {
        long j10;
        long j11 = this.zzc;
        if (j11 != -9223372036854775807L) {
            j10 = this.zzd;
            if (j10 == -9223372036854775807L) {
                long j12 = this.zzf;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.zzg;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.zze == j10) {
            return;
        }
        this.zze = j10;
        this.zzh = j10;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    public final float zza(long j10, long j11) {
        long j12;
        if (this.zzc != -9223372036854775807L) {
            long j13 = j10 - j11;
            long j14 = this.zzm;
            if (j14 == -9223372036854775807L) {
                this.zzm = j13;
                this.zzn = 0L;
            } else {
                long max = Math.max(j13, zzf(j14, j13, 0.999f));
                this.zzm = max;
                this.zzn = zzf(this.zzn, Math.abs(j13 - max), 0.999f);
            }
            if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
                return this.zzk;
            }
            this.zzl = SystemClock.elapsedRealtime();
            long j15 = this.zzm + (this.zzn * 3);
            if (this.zzh > j15) {
                float zzs = (float) zzeh.zzs(1000L);
                long[] jArr = {j15, this.zze, this.zzh - (((this.zzk - 1.0f) * zzs) + ((this.zzi - 1.0f) * zzs))};
                j12 = jArr[0];
                for (int i10 = 1; i10 < 3; i10++) {
                    long j16 = jArr[i10];
                    if (j16 > j12) {
                        j12 = j16;
                    }
                }
                this.zzh = j12;
            } else {
                long j17 = this.zzh;
                int i11 = zzeh.zza;
                long max2 = Math.max(j17, Math.min(j10 - (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f), j15));
                this.zzh = max2;
                long j18 = this.zzg;
                if (j18 == -9223372036854775807L || max2 <= j18) {
                    j12 = max2;
                } else {
                    this.zzh = j18;
                    j12 = j18;
                }
            }
            long j19 = j10 - j12;
            if (Math.abs(j19) < this.zza) {
                this.zzk = 1.0f;
                return 1.0f;
            }
            float max3 = Math.max(this.zzj, Math.min((((float) j19) * 1.0E-7f) + 1.0f, this.zzi));
            this.zzk = max3;
            return max3;
        }
        return 1.0f;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j10 = this.zzh;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.zzb;
        this.zzh = j11;
        long j12 = this.zzg;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.zzh = j12;
        }
        this.zzl = -9223372036854775807L;
    }

    public final void zzd(zzaj zzajVar) {
        long j10 = zzajVar.zza;
        this.zzc = zzeh.zzs(-9223372036854775807L);
        this.zzf = zzeh.zzs(-9223372036854775807L);
        this.zzg = zzeh.zzs(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j10) {
        this.zzd = j10;
        zzg();
    }
}
