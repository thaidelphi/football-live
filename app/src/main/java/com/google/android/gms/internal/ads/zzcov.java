package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcov implements zzaxl {
    private final zzcdq zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcov(zzcdq zzcdqVar, Executor executor) {
        this.zza = zzcdqVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final synchronized void zzdn(zzaxk zzaxkVar) {
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmx)).booleanValue()) {
                if (zzaxkVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.zzb;
                        final zzcdq zzcdqVar = this.zza;
                        Objects.requireNonNull(zzcdqVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcot
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcdq.this.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzaxkVar.zzj) {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.zzb;
                        final zzcdq zzcdqVar2 = this.zza;
                        Objects.requireNonNull(zzcdqVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcou
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcdq.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
