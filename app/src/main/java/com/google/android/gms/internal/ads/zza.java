package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zza {
    public final long zza;
    public final int zzb;
    @Deprecated
    public final Uri[] zzc;
    public final zzap[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final String[] zzg;
    public final long zzh;
    public final boolean zzi;

    static {
        int i10 = zzeh.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
    }

    public zza(long j10) {
        this(0L, -1, -1, new int[0], new zzap[0], new long[0], 0L, false, new String[0], false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zza.class == obj.getClass()) {
            zza zzaVar = (zza) obj;
            if (this.zzb == zzaVar.zzb && Arrays.equals(this.zzd, zzaVar.zzd) && Arrays.equals(this.zze, zzaVar.zze) && Arrays.equals(this.zzf, zzaVar.zzf) && Arrays.equals(this.zzg, zzaVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.zzb * 31) - 1) * 961) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze)) * 31) + Arrays.hashCode(this.zzf)) * 29791) + Arrays.hashCode(this.zzg)) * 31;
    }

    public final int zza(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final zza zzb(int i10) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new zza(0L, 0, -1, copyOf, (zzap[]) Arrays.copyOf(this.zzd, 0), copyOf2, 0L, false, (String[]) Arrays.copyOf(this.zzg, 0), false);
    }

    private zza(long j10, int i10, int i11, int[] iArr, zzap[] zzapVarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzapVarArr.length;
        int i12 = 0;
        zzcv.zzd(length == length2);
        this.zza = 0L;
        this.zzb = i10;
        this.zze = iArr;
        this.zzd = zzapVarArr;
        this.zzf = jArr;
        this.zzh = 0L;
        this.zzi = false;
        this.zzc = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zzc;
            if (i12 >= uriArr.length) {
                this.zzg = strArr;
                return;
            }
            zzap zzapVar = zzapVarArr[i12];
            if (zzapVar == null) {
                uri = null;
            } else {
                zzak zzakVar = zzapVar.zzb;
                Objects.requireNonNull(zzakVar);
                uri = zzakVar.zza;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }
}
