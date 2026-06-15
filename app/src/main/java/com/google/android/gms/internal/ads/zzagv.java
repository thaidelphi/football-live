package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzagv implements zzagu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzagv(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
    }

    public static zzagv zzb(long j10, long j11, zzadb zzadbVar, zzdx zzdxVar) {
        int zzg;
        int zzm;
        zzdxVar.zzM(6);
        int zzg2 = zzdxVar.zzg();
        long j12 = zzadbVar.zzc;
        long j13 = zzg2;
        if (zzdxVar.zzg() <= 0) {
            return null;
        }
        long zzt = zzeh.zzt((zzg * zzadbVar.zzg) - 1, zzadbVar.zzd);
        int zzq = zzdxVar.zzq();
        int zzq2 = zzdxVar.zzq();
        int zzq3 = zzdxVar.zzq();
        zzdxVar.zzM(2);
        long[] jArr = new long[zzq];
        long[] jArr2 = new long[zzq];
        long j14 = j11 + zzadbVar.zzc;
        int i10 = 0;
        while (i10 < zzq) {
            long j15 = j13;
            jArr[i10] = (i10 * zzt) / zzq;
            jArr2[i10] = j14;
            if (zzq3 == 1) {
                zzm = zzdxVar.zzm();
            } else if (zzq3 == 2) {
                zzm = zzdxVar.zzq();
            } else if (zzq3 == 3) {
                zzm = zzdxVar.zzo();
            } else if (zzq3 != 4) {
                return null;
            } else {
                zzm = zzdxVar.zzp();
            }
            j14 += zzm * zzq2;
            i10++;
            j13 = j15;
        }
        long j16 = j11 + j12 + j13;
        if (j10 != -1 && j10 != j16) {
            zzdn.zzf("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j16);
        }
        if (j16 != j14) {
            zzdn.zzf("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + j16 + ", " + j14 + "\nSeeking will be inaccurate.");
            j16 = Math.max(j16, j14);
        }
        return new zzagv(jArr, jArr2, zzt, j16, zzadbVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzagu
    public final long zze(long j10) {
        return this.zza[zzeh.zzd(this.zzb, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        long[] jArr = this.zza;
        int zzd = zzeh.zzd(jArr, j10, true, true);
        zzadj zzadjVar = new zzadj(jArr[zzd], this.zzb[zzd]);
        if (zzadjVar.zzb < j10) {
            long[] jArr2 = this.zza;
            if (zzd != jArr2.length - 1) {
                int i10 = zzd + 1;
                return new zzadg(zzadjVar, new zzadj(jArr2[i10], this.zzb[i10]));
            }
        }
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}
