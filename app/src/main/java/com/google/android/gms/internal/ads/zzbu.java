package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbu {
    public final int zza;
    private final zzbo zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        int i10 = zzeh.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbu(zzbo zzboVar, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = zzboVar.zza;
        this.zza = i10;
        boolean z11 = true;
        zzcv.zzd(i10 == iArr.length && i10 == zArr.length);
        this.zzb = zzboVar;
        this.zzc = (!z10 || i10 <= 1) ? false : z11;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbu.class == obj.getClass()) {
            zzbu zzbuVar = (zzbu) obj;
            if (this.zzc == zzbuVar.zzc && this.zzb.equals(zzbuVar.zzb) && Arrays.equals(this.zzd, zzbuVar.zzd) && Arrays.equals(this.zze, zzbuVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb.hashCode() * 31) + (this.zzc ? 1 : 0)) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final zzz zzb(int i10) {
        return this.zzb.zzb(i10);
    }

    public final boolean zzc() {
        for (boolean z10 : this.zze) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i10) {
        return this.zze[i10];
    }
}
