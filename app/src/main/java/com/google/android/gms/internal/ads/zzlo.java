package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzlo {
    private final zzv zza;
    private final SparseArray zzb;

    public zzlo(zzv zzvVar, SparseArray sparseArray) {
        this.zza = zzvVar;
        SparseArray sparseArray2 = new SparseArray(zzvVar.zzb());
        for (int i10 = 0; i10 < zzvVar.zzb(); i10++) {
            int zza = zzvVar.zza(i10);
            zzln zzlnVar = (zzln) sparseArray.get(zza);
            Objects.requireNonNull(zzlnVar);
            sparseArray2.append(zza, zzlnVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzln zzc(int i10) {
        zzln zzlnVar = (zzln) this.zzb.get(i10);
        Objects.requireNonNull(zzlnVar);
        return zzlnVar;
    }

    public final boolean zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
