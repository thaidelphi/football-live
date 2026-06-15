package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgan {
    private final boolean zza;
    private final zzfvv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgan(boolean z10, zzfvv zzfvvVar, zzgao zzgaoVar) {
        this.zza = z10;
        this.zzb = zzfvvVar;
    }

    public final b6.a zza(Callable callable, Executor executor) {
        return new zzgac(this.zzb, this.zza, executor, callable);
    }
}
