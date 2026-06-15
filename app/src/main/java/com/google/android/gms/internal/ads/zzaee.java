package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaee {
    private final zzaed zza;
    private final zzadp zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzaee(int i10, zzaed zzaedVar, zzadp zzadpVar) {
        this.zza = zzaedVar;
        int zzb = zzaedVar.zzb();
        boolean z10 = true;
        if (zzb != 1) {
            if (zzb == 2) {
                zzb = 2;
            } else {
                z10 = false;
            }
        }
        zzcv.zzd(z10);
        this.zzc = zzh(i10, zzb == 2 ? 1667497984 : 1651965952);
        this.zze = zzaedVar.zzc();
        this.zzb = zzadpVar;
        this.zzd = zzb == 2 ? zzh(i10, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.zzn = new int[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.zzf = zzaedVar.zzd;
    }

    private static int zzh(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private final long zzi(int i10) {
        return (this.zze * i10) / this.zzf;
    }

    private final zzadj zzj(int i10) {
        return new zzadj(this.zzn[i10] * zzi(1), this.zzm[i10]);
    }

    public final zzadg zza(long j10) {
        if (this.zzk != 0) {
            int zzi = (int) (j10 / zzi(1));
            int zzc = zzeh.zzc(this.zzn, zzi, true, true);
            if (this.zzn[zzc] == zzi) {
                zzadj zzj = zzj(zzc);
                return new zzadg(zzj, zzj);
            }
            zzadj zzj2 = zzj(zzc);
            int i10 = zzc + 1;
            if (i10 < this.zzm.length) {
                return new zzadg(zzj2, zzj(i10));
            }
            return new zzadg(zzj2, zzj2);
        }
        zzadj zzadjVar = new zzadj(0L, this.zzl);
        return new zzadg(zzadjVar, zzadjVar);
    }

    public final void zzb(long j10, boolean z10) {
        if (this.zzl == -1) {
            this.zzl = j10;
        }
        if (z10) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i10 = this.zzk;
            jArr2[i10] = j10;
            this.zzn[i10] = this.zzj;
            this.zzk = i10 + 1;
        }
        this.zzj++;
    }

    public final void zzc() {
        int i10;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i10 = this.zzk) <= 0) {
            return;
        }
        this.zzf = i10;
    }

    public final void zzd(int i10) {
        this.zzg = i10;
        this.zzh = i10;
    }

    public final void zze(long j10) {
        if (this.zzk == 0) {
            this.zzi = 0;
            return;
        }
        this.zzi = this.zzn[zzeh.zzd(this.zzm, j10, true, true)];
    }

    public final boolean zzf(int i10) {
        return this.zzc == i10 || this.zzd == i10;
    }

    public final boolean zzg(zzack zzackVar) throws IOException {
        int i10 = this.zzh;
        int zzf = i10 - this.zzb.zzf(zzackVar, i10, false);
        this.zzh = zzf;
        boolean z10 = zzf == 0;
        if (z10) {
            if (this.zzg > 0) {
                this.zzb.zzt(zzi(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z10;
    }
}
