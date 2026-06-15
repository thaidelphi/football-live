package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzert implements zzerw {
    private final zzgba zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzert(zzgba zzgbaVar, Context context) {
        this.zza = zzgbaVar;
        this.zzb = context;
    }

    public static /* synthetic */ zzers zzc(zzert zzertVar) {
        zzbbd zzbbdVar = zzbbm.zzfY;
        return new zzers(com.google.android.gms.ads.internal.util.zzad.zzb(zzertVar.zzb, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzert.zzc(zzert.this);
            }
        });
    }
}
