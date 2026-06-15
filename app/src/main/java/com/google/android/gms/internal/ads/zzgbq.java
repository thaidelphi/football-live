package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgbq extends zzgaf implements RunnableFuture {
    private volatile zzgax zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbq(zzfzv zzfzvVar) {
        this.zza = new zzgbo(this, zzfzvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgbq zze(Runnable runnable, Object obj) {
        return new zzgbq(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgax zzgaxVar = this.zza;
        if (zzgaxVar != null) {
            zzgaxVar.run();
        }
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfzf
    public final String zza() {
        zzgax zzgaxVar = this.zza;
        if (zzgaxVar != null) {
            String obj = zzgaxVar.toString();
            return "task=[" + obj + b9.i.f16698e;
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    protected final void zzb() {
        zzgax zzgaxVar;
        if (zzt() && (zzgaxVar = this.zza) != null) {
            zzgaxVar.zzh();
        }
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbq(Callable callable) {
        this.zza = new zzgbp(this, callable);
    }
}
