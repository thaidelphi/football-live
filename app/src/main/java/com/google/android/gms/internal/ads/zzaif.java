package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaif {
    public final zzaic zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaif(zzaic zzaicVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzcv.zzd(length == length2);
        int length3 = jArr.length;
        zzcv.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzcv.zzd(length4 == length2);
        this.zza = zzaicVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i10;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j10;
        this.zzb = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int zza(long j10) {
        for (int zzd = zzeh.zzd(this.zzf, j10, true, false); zzd >= 0; zzd--) {
            if ((this.zzg[zzd] & 1) != 0) {
                return zzd;
            }
        }
        return -1;
    }

    public final int zzb(long j10) {
        for (int zza = zzeh.zza(this.zzf, j10, true, false); zza < this.zzf.length; zza++) {
            if ((this.zzg[zza] & 1) != 0) {
                return zza;
            }
        }
        return -1;
    }
}
