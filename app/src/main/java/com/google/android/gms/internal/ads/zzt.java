package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzt {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzt zza(int i10) {
        zzcv.zzf(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzv zzb() {
        zzcv.zzf(!this.zzb);
        this.zzb = true;
        return new zzv(this.zza, null);
    }
}
