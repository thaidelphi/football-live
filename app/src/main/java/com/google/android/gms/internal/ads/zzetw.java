package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzetw implements zzerw {
    final zzgba zza;
    final List zzb;

    public zzetw(zzbav zzbavVar, zzgba zzgbaVar, List list) {
        this.zza = zzgbaVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzetx(zzetw.this.zzb);
            }
        });
    }
}
