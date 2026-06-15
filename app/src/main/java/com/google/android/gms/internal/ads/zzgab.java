package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzgab extends zzgax {
    private final Executor zza;
    final /* synthetic */ zzgac zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgab(zzgac zzgacVar, Executor executor) {
        this.zzb = zzgacVar;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgax
    final void zzd(Throwable th) {
        this.zzb.zza = null;
        if (th instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e8) {
            this.zzb.zzd(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    final boolean zzg() {
        return this.zzb.isDone();
    }
}
