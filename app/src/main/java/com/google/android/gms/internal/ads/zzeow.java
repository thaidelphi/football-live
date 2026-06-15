package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeow implements zzerw {
    private final zzgba zza;

    public zzeow(zzgba zzgbaVar) {
        this.zza = zzgbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeov
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeox(com.google.android.gms.ads.internal.zzv.zzt().zzb(), com.google.android.gms.ads.internal.zzv.zzt().zzm());
            }
        });
    }
}
