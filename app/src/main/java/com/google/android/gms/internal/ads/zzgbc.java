package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgbc implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfzf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbc(Executor executor, zzfzf zzfzfVar) {
        this.zza = executor;
        this.zzb = zzfzfVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e8) {
            this.zzb.zzd(e8);
        }
    }
}
