package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfed {
    public static final zzfej zza(Callable callable, Object obj, zzfel zzfelVar) {
        zzgba zzgbaVar;
        zzgbaVar = zzfelVar.zzb;
        return zzb(callable, zzgbaVar, obj, zzfelVar);
    }

    public static final zzfej zzb(Callable callable, zzgba zzgbaVar, Object obj, zzfel zzfelVar) {
        b6.a aVar;
        aVar = zzfel.zza;
        return new zzfej(zzfelVar, obj, aVar, Collections.emptyList(), zzgbaVar.zzb(callable));
    }

    public static final zzfej zzc(b6.a aVar, Object obj, zzfel zzfelVar) {
        b6.a aVar2;
        aVar2 = zzfel.zza;
        return new zzfej(zzfelVar, obj, aVar2, Collections.emptyList(), aVar);
    }

    public static final zzfej zzd(final zzfdy zzfdyVar, zzgba zzgbaVar, Object obj, zzfel zzfelVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfec
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfdy.this.zza();
                return null;
            }
        }, zzgbaVar, obj, zzfelVar);
    }
}
