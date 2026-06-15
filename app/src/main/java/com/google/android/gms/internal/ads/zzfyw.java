package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfyw implements Serializable {
    private final int[] zza;
    private final int zzb;

    private zzfyw(int[] iArr, int i10, int i11) {
        this.zza = iArr;
        this.zzb = i11;
    }

    public static zzfyw zzb(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzfyw(copyOf, 0, copyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfyw) {
            zzfyw zzfywVar = (zzfyw) obj;
            if (this.zzb == zzfywVar.zzb) {
                for (int i10 = 0; i10 < this.zzb; i10++) {
                    if (zza(i10) != zzfywVar.zza(i10)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 = (i10 * 31) + this.zza[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.zzb;
        if (i10 != 0) {
            StringBuilder sb = new StringBuilder(i10 * 5);
            sb.append('[');
            sb.append(this.zza[0]);
            for (int i11 = 1; i11 < this.zzb; i11++) {
                sb.append(", ");
                sb.append(this.zza[i11]);
            }
            sb.append(']');
            return sb.toString();
        }
        return "[]";
    }

    public final int zza(int i10) {
        zzfsv.zza(i10, this.zzb, "index");
        return this.zza[i10];
    }
}
