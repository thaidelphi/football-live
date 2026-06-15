package androidx.work.impl.utils.futures;

import com.ironsource.b9;
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
/* compiled from: AbstractFuture.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a<V> implements b6.a<V> {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f4767d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f4768e = Logger.getLogger(a.class.getName());

    /* renamed from: f  reason: collision with root package name */
    static final b f4769f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f4770g;

    /* renamed from: a  reason: collision with root package name */
    volatile Object f4771a;

    /* renamed from: b  reason: collision with root package name */
    volatile e f4772b;

    /* renamed from: c  reason: collision with root package name */
    volatile i f4773c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f4774c;

        /* renamed from: d  reason: collision with root package name */
        static final c f4775d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f4776a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f4777b;

        static {
            if (a.f4767d) {
                f4775d = null;
                f4774c = null;
                return;
            }
            f4775d = new c(false, null);
            f4774c = new c(true, null);
        }

        c(boolean z10, Throwable th) {
            this.f4776a = z10;
            this.f4777b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f4778b = new d(new C0087a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f4779a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: androidx.work.impl.utils.futures.a$d$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0087a extends Throwable {
            C0087a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f4779a = (Throwable) a.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f4780d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f4781a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f4782b;

        /* renamed from: c  reason: collision with root package name */
        e f4783c;

        e(Runnable runnable, Executor executor) {
            this.f4781a = runnable;
            this.f4782b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f4784a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f4785b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f4786c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f4787d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f4788e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f4784a = atomicReferenceFieldUpdater;
            this.f4785b = atomicReferenceFieldUpdater2;
            this.f4786c = atomicReferenceFieldUpdater3;
            this.f4787d = atomicReferenceFieldUpdater4;
            this.f4788e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f4787d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f4788e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f4786c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f4785b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f4784a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a<V> f4789a;

        /* renamed from: b  reason: collision with root package name */
        final b6.a<? extends V> f4790b;

        g(a<V> aVar, b6.a<? extends V> aVar2) {
            this.f4789a = aVar;
            this.f4790b = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4789a.f4771a != this) {
                return;
            }
            if (a.f4769f.b(this.f4789a, this, a.i(this.f4790b))) {
                a.f(this.f4789a);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f4772b == eVar) {
                    aVar.f4772b = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4771a == obj) {
                    aVar.f4771a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f4773c == iVar) {
                    aVar.f4773c = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f4793b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f4792a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f4791c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f4792a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f4793b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f4769f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f4792a;
            if (thread != null) {
                this.f4792a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f4769f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f4769f = hVar;
        if (th != null) {
            f4768e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4770g = new Object();
    }

    private void a(StringBuilder sb) {
        try {
            Object j10 = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(r(j10));
            sb.append(b9.i.f16698e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append(b9.i.f16698e);
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T d(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f4772b;
        } while (!f4769f.a(this, eVar2, e.f4780d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f4783c;
            eVar4.f4783c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.work.impl.utils.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.work.impl.utils.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.work.impl.utils.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.work.impl.utils.futures.a<V>, androidx.work.impl.utils.futures.a] */
    static void f(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.m();
            aVar.b();
            e e8 = aVar.e(eVar);
            while (e8 != null) {
                eVar = e8.f4783c;
                Runnable runnable = e8.f4781a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f4789a;
                    if (aVar.f4771a == gVar) {
                        if (f4769f.b(aVar, gVar, i(gVar.f4790b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, e8.f4782b);
                }
                e8 = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            Logger logger = f4768e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f4770g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f4779a);
        }
        throw c("Task was cancelled.", ((c) obj).f4777b);
    }

    static Object i(b6.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f4771a;
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f4776a ? cVar.f4777b != null ? new c(false, cVar.f4777b) : c.f4775d : obj;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f4767d) & isCancelled) {
            return c.f4775d;
        }
        try {
            Object j10 = j(aVar);
            return j10 == null ? f4770g : j10;
        } catch (CancellationException e8) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e8));
            }
            return new c(false, e8);
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V j(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
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
        return v10;
    }

    private void m() {
        i iVar;
        do {
            iVar = this.f4773c;
        } while (!f4769f.c(this, iVar, i.f4791c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f4793b;
        }
    }

    private void n(i iVar) {
        iVar.f4792a = null;
        while (true) {
            i iVar2 = this.f4773c;
            if (iVar2 == i.f4791c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f4793b;
                if (iVar2.f4792a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f4793b = iVar4;
                    if (iVar3.f4792a == null) {
                        break;
                    }
                } else if (!f4769f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // b6.a
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f4772b;
        if (eVar != e.f4780d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f4783c = eVar;
                if (f4769f.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f4772b;
            } while (eVar != e.f4780d);
            g(runnable, executor);
        }
        g(runnable, executor);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f4771a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f4767d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else if (z10) {
            cVar = c.f4774c;
        } else {
            cVar = c.f4775d;
        }
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f4769f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.k();
                }
                f(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                b6.a<? extends V> aVar2 = ((g) obj).f4790b;
                if (aVar2 instanceof a) {
                    aVar = (a) aVar2;
                    obj = aVar.f4771a;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    aVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = aVar.f4771a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f4771a;
            if ((obj != null) & (!(obj instanceof g))) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f4773c;
                if (iVar != i.f4791c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f4769f.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4771a;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    n(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            n(iVar2);
                        } else {
                            iVar = this.f4773c;
                        }
                    } while (iVar != i.f4791c);
                    return h(this.f4771a);
                }
                return h(this.f4771a);
            }
            while (nanos > 0) {
                Object obj3 = this.f4771a;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z10) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z10) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4771a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f4771a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void k() {
    }

    protected String l() {
        Object obj = this.f4771a;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f4790b) + b9.i.f16698e;
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean o(V v10) {
        if (v10 == null) {
            v10 = (V) f4770g;
        }
        if (f4769f.b(this, null, v10)) {
            f(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(Throwable th) {
        if (f4769f.b(this, null, new d((Throwable) d(th)))) {
            f(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(b6.a<? extends V> aVar) {
        d dVar;
        d(aVar);
        Object obj = this.f4771a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (f4769f.b(this, null, i(aVar))) {
                    f(this);
                    return true;
                }
                return false;
            }
            g gVar = new g(this, aVar);
            if (f4769f.b(this, null, gVar)) {
                try {
                    aVar.addListener(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f4778b;
                    }
                    f4769f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f4771a;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f4776a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = l();
            } catch (RuntimeException e8) {
                str = "Exception thrown from implementation: " + e8.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append(b9.i.f16698e);
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(b9.i.f16698e);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4771a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f4773c;
            if (iVar != i.f4791c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f4769f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4771a;
                            } else {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f4773c;
                } while (iVar != i.f4791c);
                return h(this.f4771a);
            }
            return h(this.f4771a);
        }
        throw new InterruptedException();
    }
}
