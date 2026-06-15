package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdo {
    private int zza;
    private long[] zzb;

    public zzdo() {
        throw null;
    }

    public zzdo(int i10) {
        this.zzb = new long[i10];
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int i10) {
        if (i10 >= 0 && i10 < this.zza) {
            return this.zzb[i10];
        }
        int i11 = this.zza;
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + i11);
    }

    public final void zzc(long j10) {
        int i10 = this.zza;
        long[] jArr = this.zzb;
        if (i10 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = this.zzb;
        int i11 = this.zza;
        this.zza = i11 + 1;
        jArr2[i11] = j10;
    }

    public final void zzd(long[] jArr) {
        int i10 = this.zza;
        int length = jArr.length;
        int i11 = i10 + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i11 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i11));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i11;
    }
}
