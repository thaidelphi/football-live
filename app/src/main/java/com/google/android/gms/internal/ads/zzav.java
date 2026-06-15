package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzav {
    private final zzau[] zza;

    public zzav(long j10, zzau... zzauVarArr) {
        this.zza = zzauVarArr;
    }

    public zzav(List list) {
        this.zza = (zzau[]) list.toArray(new zzau[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzav.class == obj.getClass() && Arrays.equals(this.zza, ((zzav) obj).zza);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zza) * 31) + ((int) (-9223372034707292159L));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zza);
        return "entries=" + arrays + "";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzau zzb(int i10) {
        return this.zza[i10];
    }

    public final zzav zzc(zzau... zzauVarArr) {
        int length = zzauVarArr.length;
        if (length == 0) {
            return this;
        }
        zzau[] zzauVarArr2 = this.zza;
        int i10 = zzeh.zza;
        int length2 = zzauVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzauVarArr2, length2 + length);
        System.arraycopy(zzauVarArr, 0, copyOf, length2, length);
        return new zzav(-9223372036854775807L, (zzau[]) copyOf);
    }

    public final zzav zzd(zzav zzavVar) {
        return zzavVar == null ? this : zzc(zzavVar.zza);
    }
}
