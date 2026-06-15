package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfzf<V> extends zzgbt implements b6.a<V> {
    private static final Object zzbd;
    private static final zza zzbg;
    static final boolean zze;
    static final zzgay zzf;
    public static final /* synthetic */ int zzg = 0;
    private volatile zze listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public abstract class zza {
        /* synthetic */ zza(zzfzi zzfziVar) {
        }

        abstract zze zza(zzfzf zzfzfVar, zze zzeVar);

        abstract zzk zzb(zzfzf zzfzfVar, zzk zzkVar);

        abstract void zzc(zzk zzkVar, zzk zzkVar2);

        abstract void zzd(zzk zzkVar, Thread thread);

        abstract boolean zze(zzfzf zzfzfVar, zze zzeVar, zze zzeVar2);

        abstract boolean zzf(zzfzf zzfzfVar, Object obj, Object obj2);

        abstract boolean zzg(zzfzf zzfzfVar, zzk zzkVar, zzk zzkVar2);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zzk, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zzk, zzk> zzb = AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzfzf<?>, zzk> zzc;
        private static final AtomicReferenceFieldUpdater<? super zzfzf<?>, zze> zzd;
        private static final AtomicReferenceFieldUpdater<? super zzfzf<?>, Object> zze;

        static {
            int i10 = zzfzf.zzg;
            zzc = AtomicReferenceFieldUpdater.newUpdater(zzfzf.class, zzk.class, "waiters");
            zzd = AtomicReferenceFieldUpdater.newUpdater(zzfzf.class, zze.class, "listeners");
            zze = AtomicReferenceFieldUpdater.newUpdater(zzfzf.class, Object.class, b9.h.X);
        }

        private zzb() {
            throw null;
        }

        /* synthetic */ zzb(zzfzi zzfziVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final zze zza(zzfzf zzfzfVar, zze zzeVar) {
            return zzd.getAndSet(zzfzfVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final zzk zzb(zzfzf zzfzfVar, zzk zzkVar) {
            return zzc.getAndSet(zzfzfVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final boolean zze(zzfzf zzfzfVar, zze zzeVar, zze zzeVar2) {
            return zzfzg.zza(zzd, zzfzfVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final boolean zzf(zzfzf zzfzfVar, Object obj, Object obj2) {
            return zzfzg.zza(zze, zzfzfVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final boolean zzg(zzfzf zzfzfVar, zzk zzkVar, zzk zzkVar2) {
            return zzfzg.zza(zzc, zzfzfVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public final class zzc {
        static final zzc zza;
        static final zzc zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzfzf.zze) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzc(false, null);
            zza = new zzc(true, null);
        }

        zzc(boolean z10, Throwable th) {
            this.zzc = z10;
            this.zzd = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public final class zzd {
        static final zzd zza = new zzd(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfzf.zzd.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzd(Throwable th) {
            Objects.requireNonNull(th);
            this.zzb = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public final class zze {
        static final zze zza = new zze();
        zze next;
        final Runnable zzb;
        final Executor zzc;

        zze() {
            this.zzb = null;
            this.zzc = null;
        }

        zze(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public final class zzf<V> implements Runnable {
        final zzfzf<V> zza;
        final b6.a<? extends V> zzb;

        zzf(zzfzf zzfzfVar, b6.a aVar) {
            this.zza = zzfzfVar;
            this.zzb = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfzf) this.zza).value != this) {
                return;
            }
            b6.a<? extends V> aVar = this.zzb;
            if (zzfzf.zzbg.zzf(this.zza, this, zzfzf.zze(aVar))) {
                zzfzf.zzx(this.zza, false);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    final class zzg extends zza {
        private zzg() {
            throw null;
        }

        /* synthetic */ zzg(zzfzi zzfziVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final zze zza(zzfzf zzfzfVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzfzfVar) {
                zzeVar2 = zzfzfVar.listeners;
                if (zzeVar2 != zzeVar) {
                    zzfzfVar.listeners = zzeVar;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final zzk zzb(zzfzf zzfzfVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzfzfVar) {
                zzkVar2 = zzfzfVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzfzfVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final boolean zze(zzfzf zzfzfVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzfzfVar) {
                if (zzfzfVar.listeners == zzeVar) {
                    zzfzfVar.listeners = zzeVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final boolean zzf(zzfzf zzfzfVar, Object obj, Object obj2) {
            synchronized (zzfzfVar) {
                if (zzfzfVar.value == obj) {
                    zzfzfVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final boolean zzg(zzfzf zzfzfVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzfzfVar) {
                if (zzfzfVar.waiters == zzkVar) {
                    zzfzfVar.waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface zzh<V> extends b6.a<V> {
        @Override // b6.a
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    abstract class zzi<V> extends zzfzf<V> implements zzh<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e8) {
                    throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzfzf.zzj.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        Field[] declaredFields;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzfzf.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzfzf.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzfzf.class.getDeclaredField(b9.h.X));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        }

        private zzj() {
            throw null;
        }

        /* synthetic */ zzj(zzfzi zzfziVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final zze zza(zzfzf zzfzfVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzfzfVar.listeners;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zze(zzfzfVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final zzk zzb(zzfzf zzfzfVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzfzfVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzfzfVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final boolean zze(zzfzf zzfzfVar, zze zzeVar, zze zzeVar2) {
            return zzfzh.zza(zza, zzfzfVar, zzb, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final boolean zzf(zzfzf zzfzfVar, Object obj, Object obj2) {
            return zzfzh.zza(zza, zzfzfVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzf.zza
        final boolean zzg(zzfzf zzfzfVar, zzk zzkVar, zzk zzkVar2) {
            return zzfzh.zza(zza, zzfzfVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        zzk() {
            zzfzf.zzbg.zzd(this, Thread.currentThread());
        }

        zzk(boolean z10) {
        }
    }

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zze = z10;
        zzf = new zzgay(zzfzf.class);
        try {
            zzgVar = new zzj(null);
            th = null;
            th2 = null;
        } catch (Error | Exception e8) {
            try {
                th2 = null;
                th = e8;
                zzgVar = new zzb(null);
            } catch (Error | Exception e10) {
                th = e8;
                th2 = e10;
                zzgVar = new zzg(null);
            }
        }
        zzbg = zzgVar;
        if (th2 != null) {
            zzgay zzgayVar = zzf;
            Logger zza2 = zzgayVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            zzgayVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
        zzbd = new Object();
    }

    private static final Object zzA(Object obj) throws ExecutionException {
        if (!(obj instanceof zzc)) {
            if (!(obj instanceof zzd)) {
                if (obj == zzbd) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((zzd) obj).zzb);
        }
        Throwable th = ((zzc) obj).zzd;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object zze(b6.a aVar) {
        Throwable zzl;
        if (aVar instanceof zzh) {
            Object obj = ((zzfzf) aVar).value;
            if (obj instanceof zzc) {
                zzc zzcVar = (zzc) obj;
                if (zzcVar.zzc) {
                    Throwable th = zzcVar.zzd;
                    if (th != null) {
                        obj = new zzc(false, th);
                    } else {
                        obj = zzc.zzb;
                    }
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((aVar instanceof zzgbt) && (zzl = ((zzgbt) aVar).zzl()) != null) {
            return new zzd(zzl);
        } else {
            boolean isCancelled = aVar.isCancelled();
            if ((!zze) & isCancelled) {
                zzc zzcVar2 = zzc.zzb;
                Objects.requireNonNull(zzcVar2);
                return zzcVar2;
            }
            try {
                Object zzf2 = zzf(aVar);
                if (!isCancelled) {
                    return zzf2 == null ? zzbd : zzf2;
                }
                String valueOf = String.valueOf(aVar);
                return new zzc(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
            } catch (Error e8) {
                e = e8;
                return new zzd(e);
            } catch (CancellationException e10) {
                if (!isCancelled) {
                    return new zzd(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(aVar)), e10));
                }
                return new zzc(false, e10);
            } catch (ExecutionException e11) {
                if (isCancelled) {
                    return new zzc(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)), e11));
                }
                return new zzd(e11.getCause());
            } catch (Exception e12) {
                e = e12;
                return new zzd(e);
            }
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzu(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append("null");
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb.append(b9.i.f16698e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append(b9.i.f16698e);
        } catch (Exception e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzv(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzw(sb, ((zzf) obj).zzb);
            sb.append(b9.i.f16698e);
        } else {
            try {
                concat = zzftm.zza(zza());
            } catch (Exception | StackOverflowError e8) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e8.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append(b9.i.f16698e);
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzu(sb);
        }
    }

    private final void zzw(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e8) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e8.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(zzfzf zzfzfVar, boolean z10) {
        zze zzeVar = null;
        while (true) {
            for (zzk zzb2 = zzbg.zzb(zzfzfVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                zzfzfVar.zzq();
            }
            zzfzfVar.zzb();
            zze zzeVar2 = zzeVar;
            zze zza2 = zzbg.zza(zzfzfVar, zze.zza);
            zze zzeVar3 = zzeVar2;
            while (zza2 != null) {
                zze zzeVar4 = zza2.next;
                zza2.next = zzeVar3;
                zzeVar3 = zza2;
                zza2 = zzeVar4;
            }
            while (zzeVar3 != null) {
                zzeVar = zzeVar3.next;
                Runnable runnable = zzeVar3.zzb;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzfzfVar = zzfVar.zza;
                    if (zzfzfVar.value == zzfVar) {
                        if (zzbg.zzf(zzfzfVar, zzfVar, zze(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzeVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzeVar3 = zzeVar;
            }
            return;
            z10 = false;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            Logger zza2 = zzf.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, (Throwable) e8);
        }
    }

    private final void zzz(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbg.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // b6.a
    public void addListener(Runnable runnable, Executor executor) {
        zze zzeVar;
        zzfsv.zzc(runnable, "Runnable was null.");
        zzfsv.zzc(executor, "Executor was null.");
        if (isDone() || (zzeVar = this.listeners) == zze.zza) {
            zzy(runnable, executor);
        }
        zze zzeVar2 = new zze(runnable, executor);
        do {
            zzeVar2.next = zzeVar;
            if (zzbg.zze(this, zzeVar, zzeVar2)) {
                return;
            }
            zzeVar = this.listeners;
        } while (zzeVar != zze.zza);
        zzy(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzfzf.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.ads.zzfzf.zze
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzfzf$zzc r1 = new com.google.android.gms.internal.ads.zzfzf$zzc
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzfzf$zzc r1 = com.google.android.gms.internal.ads.zzfzf.zzc.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzfzf$zzc r1 = com.google.android.gms.internal.ads.zzfzf.zzc.zzb
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.zzfzf$zza r6 = com.google.android.gms.internal.ads.zzfzf.zzbg
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzx(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfzf.zzf
            if (r4 == 0) goto L56
            com.google.android.gms.internal.ads.zzfzf$zzf r0 = (com.google.android.gms.internal.ads.zzfzf.zzf) r0
            b6.a<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfzf.zzh
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.ads.zzfzf r4 = (com.google.android.gms.internal.ads.zzfzf) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfzf.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r3
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r2 = r3
            goto L5f
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfzf.zzf
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzf.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzA(obj2);
            }
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzbg;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzz(zzkVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzA(obj);
                    }
                    zzkVar = this.waiters;
                } while (zzkVar != zzk.zza);
                Object obj3 = this.value;
                Objects.requireNonNull(obj3);
                return zzA(obj3);
            }
            Object obj32 = this.value;
            Objects.requireNonNull(obj32);
            return zzA(obj32);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzc;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof zzf));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzu(sb);
        } else {
            zzv(sb);
        }
        sb.append(b9.i.f16698e);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String zza() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    protected void zzb() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzbd;
        }
        if (zzbg.zzf(this, null, obj)) {
            zzx(this, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean zzd(Throwable th) {
        Objects.requireNonNull(th);
        if (zzbg.zzf(this, null, new zzd(th))) {
            zzx(this, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgbt
    public final Throwable zzl() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzd) {
                return ((zzd) obj).zzb;
            }
            return null;
        }
        return null;
    }

    protected void zzq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzt());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzs(b6.a aVar) {
        zzd zzdVar;
        Objects.requireNonNull(aVar);
        Object obj = this.value;
        if (obj == null) {
            if (aVar.isDone()) {
                if (zzbg.zzf(this, null, zze(aVar))) {
                    zzx(this, false);
                    return true;
                }
                return false;
            }
            zzf zzfVar = new zzf(this, aVar);
            if (zzbg.zzf(this, null, zzfVar)) {
                try {
                    aVar.addListener(zzfVar, zzgad.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzdVar = new zzd(th);
                    } catch (Error | Exception unused) {
                        zzdVar = zzd.zza;
                    }
                    zzbg.zzf(this, zzfVar, zzdVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzc) {
            aVar.cancel(((zzc) obj).zzc);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzt() {
        Object obj = this.value;
        return (obj instanceof zzc) && ((zzc) obj).zzc;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzA(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    do {
                        zza zzaVar = zzbg;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzA(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzz(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzz(zzkVar2);
                        } else {
                            zzkVar = this.waiters;
                        }
                    } while (zzkVar != zzk.zza);
                    Object obj3 = this.value;
                    Objects.requireNonNull(obj3);
                    return zzA(obj3);
                }
                Object obj32 = this.value;
                Objects.requireNonNull(obj32);
                return zzA(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzA(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzfzfVar = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i10 != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (i10 > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z10) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z10) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + zzfzfVar);
        }
        throw new InterruptedException();
    }
}
