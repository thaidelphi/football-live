package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaoa implements Runnable {
    final /* synthetic */ zzaop zza;
    final /* synthetic */ zzaob zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoa(zzaob zzaobVar, zzaop zzaopVar) {
        this.zza = zzaopVar;
        this.zzb = zzaobVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
