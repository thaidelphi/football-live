package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzv {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzv) {
            zzv zzvVar = (zzv) obj;
            if (zzeh.zza < 24) {
                if (this.zza.size() == zzvVar.zza.size()) {
                    for (int i10 = 0; i10 < this.zza.size(); i10++) {
                        if (zza(i10) != zzvVar.zza(i10)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.zza.equals(zzvVar.zza);
        }
        return false;
    }

    public final int hashCode() {
        if (zzeh.zza < 24) {
            int size = this.zza.size();
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                size = (size * 31) + zza(i10);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza(int i10) {
        zzcv.zza(i10, 0, this.zza.size());
        return this.zza.keyAt(i10);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i10) {
        return this.zza.get(i10);
    }
}
