package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeld implements zzerw {
    private final zzgba zza;
    private final zzfap zzb;
    private final zzbyj zzc;

    public zzeld(zzgba zzgbaVar, zzfap zzfapVar, zzbyj zzbyjVar) {
        this.zza = zzgbaVar;
        this.zzb = zzfapVar;
        this.zzc = zzbyjVar;
    }

    public static /* synthetic */ zzele zzc(zzeld zzeldVar) {
        return new zzele(zzeldVar.zzb.zzj, zzeldVar.zzc.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeld.zzc(zzeld.this);
            }
        });
    }
}
