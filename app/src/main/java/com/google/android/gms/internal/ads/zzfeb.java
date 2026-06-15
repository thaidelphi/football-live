package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfeb {
    final /* synthetic */ zzfel zza;
    private final Object zzb;
    private final List zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfeb(zzfel zzfelVar, Object obj, List list, zzfek zzfekVar) {
        this.zza = zzfelVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfej zza(Callable callable) {
        zzgba zzgbaVar;
        zzgan zzb = zzgap.zzb(this.zzc);
        b6.a zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfea
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzbyp.zzg);
        zzgbaVar = this.zza.zzb;
        b6.a zza2 = zzb.zza(callable, zzgbaVar);
        return new zzfej(this.zza, this.zzb, zza, this.zzc, zza2);
    }
}
