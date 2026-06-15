package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzyz implements zzza {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzda zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyz(Executor executor, zzda zzdaVar) {
        this.zza = executor;
        this.zzb = zzdaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
