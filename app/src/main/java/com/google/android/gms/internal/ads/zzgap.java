package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgap extends zzgar {
    public static zzgan zza(Iterable iterable) {
        return new zzgan(false, zzfvv.zzk(iterable), null);
    }

    public static zzgan zzb(Iterable iterable) {
        return new zzgan(true, zzfvv.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgan zzc(b6.a... aVarArr) {
        return new zzgan(true, zzfvv.zzm(aVarArr), null);
    }

    public static b6.a zzd(Iterable iterable) {
        return new zzfzx(zzfvv.zzk(iterable), true);
    }

    public static b6.a zze(b6.a aVar, Class cls, zzfsk zzfskVar, Executor executor) {
        int i10 = zzfze.zzd;
        zzfzd zzfzdVar = new zzfzd(aVar, cls, zzfskVar);
        aVar.addListener(zzfzdVar, zzgbh.zzd(executor, zzfzdVar));
        return zzfzdVar;
    }

    public static b6.a zzf(b6.a aVar, Class cls, zzfzw zzfzwVar, Executor executor) {
        int i10 = zzfze.zzd;
        zzfzc zzfzcVar = new zzfzc(aVar, cls, zzfzwVar);
        aVar.addListener(zzfzcVar, zzgbh.zzd(executor, zzfzcVar));
        return zzfzcVar;
    }

    public static b6.a zzg(Throwable th) {
        Objects.requireNonNull(th);
        return new zzgas(th);
    }

    public static b6.a zzh(Object obj) {
        if (obj == null) {
            return zzgat.zza;
        }
        return new zzgat(obj);
    }

    public static b6.a zzi() {
        return zzgat.zza;
    }

    public static b6.a zzj(Callable callable, Executor executor) {
        zzgbq zzgbqVar = new zzgbq(callable);
        executor.execute(zzgbqVar);
        return zzgbqVar;
    }

    public static b6.a zzk(zzfzv zzfzvVar, Executor executor) {
        zzgbq zzgbqVar = new zzgbq(zzfzvVar);
        executor.execute(zzgbqVar);
        return zzgbqVar;
    }

    @SafeVarargs
    public static b6.a zzl(b6.a... aVarArr) {
        return new zzfzx(zzfvv.zzm(aVarArr), false);
    }

    public static b6.a zzm(b6.a aVar, zzfsk zzfskVar, Executor executor) {
        int i10 = zzfzm.zzc;
        zzfzl zzfzlVar = new zzfzl(aVar, zzfskVar);
        aVar.addListener(zzfzlVar, zzgbh.zzd(executor, zzfzlVar));
        return zzfzlVar;
    }

    public static b6.a zzn(b6.a aVar, zzfzw zzfzwVar, Executor executor) {
        int i10 = zzfzm.zzc;
        Objects.requireNonNull(executor);
        zzfzk zzfzkVar = new zzfzk(aVar, zzfzwVar);
        aVar.addListener(zzfzkVar, zzgbh.zzd(executor, zzfzkVar));
        return zzfzkVar;
    }

    public static b6.a zzo(b6.a aVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return aVar.isDone() ? aVar : zzgbn.zzf(aVar, j10, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgbs.zza(future);
        }
        throw new IllegalStateException(zzftm.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgbs.zza(future);
        } catch (ExecutionException e8) {
            if (e8.getCause() instanceof Error) {
                throw new zzgae((Error) e8.getCause());
            }
            throw new zzgbr(e8.getCause());
        }
    }

    public static void zzr(b6.a aVar, zzgal zzgalVar, Executor executor) {
        Objects.requireNonNull(zzgalVar);
        aVar.addListener(new zzgam(aVar, zzgalVar), executor);
    }
}
