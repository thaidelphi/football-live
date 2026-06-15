package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgbh {
    public static zzgba zza(ExecutorService executorService) {
        zzgba zzgbdVar;
        if (executorService instanceof zzgba) {
            return (zzgba) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgbdVar = new zzgbg((ScheduledExecutorService) executorService);
        } else {
            zzgbdVar = new zzgbd(executorService);
        }
        return zzgbdVar;
    }

    public static zzgbb zzb(ScheduledExecutorService scheduledExecutorService) {
        return new zzgbg(scheduledExecutorService);
    }

    public static Executor zzc() {
        return zzgad.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zzd(Executor executor, zzfzf zzfzfVar) {
        Objects.requireNonNull(executor);
        return executor == zzgad.INSTANCE ? executor : new zzgbc(executor, zzfzfVar);
    }
}
