package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepe implements zzerw {
    private final zzgba zza;
    private final zzfap zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepe(zzgba zzgbaVar, zzfap zzfapVar) {
        this.zza = zzgbaVar;
        this.zzb = zzfapVar;
    }

    public static /* synthetic */ zzepf zzc(zzepe zzepeVar) {
        return new zzepf("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzepeVar.zzb.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepe.zzc(zzepe.this);
            }
        });
    }
}
