package androidx.concurrent.futures;

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
/* compiled from: AbstractResolvableFuture.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a<V> implements b6.a<V> {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f1971d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f1972e = Logger.getLogger(a.class.getName());

    /* renamed from: f  reason: collision with root package name */
    static final b f1973f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f1974g;

    /* renamed from: a  reason: collision with root package name */
    volatile Object f1975a;

    /* renamed from: b  reason: collision with root package name */
    volatile e f1976b;

    /* renamed from: c  reason: collision with root package name */
    volatile i f1977c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
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
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f1978c;

        /* renamed from: d  reason: collision with root package name */
        static final c f1979d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f1980a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f1981b;

        static {
            if (a.f1971d) {
                f1979d = null;
                f1978c = null;
                return;
            }
            f1979d = new c(false, null);
            f1978c = new c(true, null);
        }

        c(boolean z10, Throwable th) {
            this.f1980a = z10;
            this.f1981b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f1982b = new d(new C0030a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f1983a;

        /* compiled from: AbstractResolvableFuture.java */
        /* renamed from: androidx.concurrent.futures.a$d$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0030a extends Throwable {
            C0030a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1983a = (Throwable) a.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f1984d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f1985a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f1986b;

        /* renamed from: c  reason: collision with root package name */
        e f1987c;

        e(Runnable runnable, Executor executor) {
            this.f1985a = runnable;
            this.f1986b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f1988a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f1989b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f1990c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f1991d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f1992e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1988a = atomicReferenceFieldUpdater;
            this.f1989b = atomicReferenceFieldUpdater2;
            this.f1990c = atomicReferenceFieldUpdater3;
            this.f1991d = atomicReferenceFieldUpdater4;
            this.f1992e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f1991d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f1992e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f1990c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f1989b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f1988a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a<V> f1993a;

        /* renamed from: b  reason: collision with root package name */
        final b6.a<? extends V> f1994b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1993a.f1975a != this) {
                return;
            }
            if (a.f1973f.b(this.f1993a, this, a.j(this.f1994b))) {
                a.g(this.f1993a);
            }
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1976b == eVar) {
                    aVar.f1976b = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1975a == obj) {
                    aVar.f1975a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1977c == iVar) {
                    aVar.f1977c = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f1997b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f1996a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f1995c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f1996a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f1997b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f1973f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f1996a;
            if (thread != null) {
                this.f1996a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f1973f.e(this, Thread.currentThread());
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
        f1973f = hVar;
        if (th != null) {
            f1972e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1974g = new Object();
    }

    private void a(StringBuilder sb) {
        try {
            Object k10 = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(r(k10));
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

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1976b;
        } while (!f1973f.a(this, eVar2, e.f1984d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1987c;
            eVar4.f1987c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.concurrent.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.concurrent.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.concurrent.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.concurrent.futures.a<V>, androidx.concurrent.futures.a] */
    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e f10 = aVar.f(eVar);
            while (f10 != null) {
                eVar = f10.f1987c;
                Runnable runnable = f10.f1985a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f1993a;
                    if (aVar.f1975a == gVar) {
                        if (f1973f.b(aVar, gVar, j(gVar.f1994b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f10.f1986b);
                }
                f10 = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            Logger logger = f1972e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f1974g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f1983a);
        }
        throw c("Task was cancelled.", ((c) obj).f1981b);
    }

    static Object j(b6.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f1975a;
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f1980a ? cVar.f1981b != null ? new c(false, cVar.f1981b) : c.f1979d : obj;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f1971d) & isCancelled) {
            return c.f1979d;
        }
        try {
            Object k10 = k(aVar);
            return k10 == null ? f1974g : k10;
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

    static <V> V k(Future<V> future) throws ExecutionException {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f1977c;
        } while (!f1973f.c(this, iVar, i.f1995c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f1997b;
        }
    }

    private void o(i iVar) {
        iVar.f1996a = null;
        while (true) {
            i iVar2 = this.f1977c;
            if (iVar2 == i.f1995c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1997b;
                if (iVar2.f1996a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1997b = iVar4;
                    if (iVar3.f1996a == null) {
                        break;
                    }
                } else if (!f1973f.c(this, iVar2, iVar4)) {
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
        e eVar = this.f1976b;
        if (eVar != e.f1984d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1987c = eVar;
                if (f1973f.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f1976b;
            } while (eVar != e.f1984d);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f1975a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f1971d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else if (z10) {
            cVar = c.f1978c;
        } else {
            cVar = c.f1979d;
        }
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f1973f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                b6.a<? extends V> aVar2 = ((g) obj).f1994b;
                if (aVar2 instanceof a) {
                    aVar = (a) aVar2;
                    obj = aVar.f1975a;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    aVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = aVar.f1975a;
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
            Object obj = this.f1975a;
            if ((obj != null) & (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f1977c;
                if (iVar != i.f1995c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f1973f.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f1975a;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.f1977c;
                        }
                    } while (iVar != i.f1995c);
                    return i(this.f1975a);
                }
                return i(this.f1975a);
            }
            while (nanos > 0) {
                Object obj3 = this.f1975a;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return i(obj3);
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
        return this.f1975a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f1975a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void l() {
    }

    protected String m() {
        Object obj = this.f1975a;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f1994b) + b9.i.f16698e;
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(V v10) {
        if (v10 == null) {
            v10 = (V) f1974g;
        }
        if (f1973f.b(this, null, v10)) {
            g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(Throwable th) {
        if (f1973f.b(this, null, new d((Throwable) d(th)))) {
            g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean s() {
        Object obj = this.f1975a;
        return (obj instanceof c) && ((c) obj).f1980a;
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
                str = m();
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
            Object obj2 = this.f1975a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f1977c;
            if (iVar != i.f1995c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1973f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1975a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f1977c;
                } while (iVar != i.f1995c);
                return i(this.f1975a);
            }
            return i(this.f1975a);
        }
        throw new InterruptedException();
    }
}
