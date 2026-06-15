package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgam implements Runnable {
    final Future zza;
    final zzgal zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgam(Future future, zzgal zzgalVar) {
        this.zza = future;
        this.zzb = zzgalVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzgbt) && (zza = zzgbu.zza((zzgbt) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgap.zzp(this.zza));
        } catch (ExecutionException e8) {
            this.zzb.zza(e8.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzfsp zza = zzfsr.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
