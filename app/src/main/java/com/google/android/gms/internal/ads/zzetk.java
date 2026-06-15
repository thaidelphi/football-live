package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzetk implements zzerw {
    final zzgba zza;

    public zzetk(zzazz zzazzVar, zzgba zzgbaVar, Context context) {
        this.zza = zzgbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzetj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzetl(new JSONObject());
            }
        });
    }
}
