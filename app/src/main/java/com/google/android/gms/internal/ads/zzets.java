package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzets implements zzerw {
    public zzets(zzbxt zzbxtVar, zzgba zzgbaVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        final b6.a zzh = zzgap.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfK)).booleanValue()) {
            zzh = zzgap.zzh(null);
        }
        final b6.a zzh2 = zzgap.zzh(null);
        return zzgap.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzetr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzett((String) b6.a.this.get(), (String) zzh2.get());
            }
        }, zzbyp.zza);
    }
}
