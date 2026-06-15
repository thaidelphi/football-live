package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdym {
    private final zzdyi zza;
    private final zzgba zzb;

    public zzdym(zzdyi zzdyiVar, zzgba zzgbaVar) {
        this.zza = zzdyiVar;
        this.zzb = zzgbaVar;
    }

    public final void zza(zzfdx zzfdxVar) {
        final zzdyi zzdyiVar = this.zza;
        Objects.requireNonNull(zzdyiVar);
        zzgap.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdyi.this.getWritableDatabase();
            }
        }), new zzdyl(this, zzfdxVar), this.zzb);
    }
}
