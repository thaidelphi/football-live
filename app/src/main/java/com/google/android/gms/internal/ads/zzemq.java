package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzemq implements zzerw {
    private final zzgba zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemq(zzgba zzgbaVar) {
        this.zza = zzgbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzemp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzemr(Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a() - com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zza()).longValue());
            }
        });
    }
}
