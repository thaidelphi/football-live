package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgbn extends zzgaf {
    private b6.a zza;
    private ScheduledFuture zzb;

    private zzgbn(b6.a aVar) {
        Objects.requireNonNull(aVar);
        this.zza = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b6.a zzf(b6.a aVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgbn zzgbnVar = new zzgbn(aVar);
        zzgbk zzgbkVar = new zzgbk(zzgbnVar);
        zzgbnVar.zzb = scheduledExecutorService.schedule(zzgbkVar, j10, timeUnit);
        aVar.addListener(zzgbkVar, zzgad.INSTANCE);
        return zzgbnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfzf
    public final String zza() {
        b6.a aVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (aVar != null) {
            String str = "inputFuture=[" + aVar.toString() + b9.i.f16698e;
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return str + ", remaining delay=[" + delay + " ms]";
                }
                return str;
            }
            return str;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    protected final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
