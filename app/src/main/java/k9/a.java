package k9;

import com.google.android.gms.common.api.Api;
import d9.s0;
import d9.t0;
import i8.w;
import i9.f0;
import i9.k0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.a0;
/* compiled from: CoroutineScheduler.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a implements Executor, Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final C0308a f27301h = new C0308a(null);

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f27302i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f27303j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27304k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: l  reason: collision with root package name */
    public static final k0 f27305l = new k0("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f27306a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27307b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27308c;
    private volatile long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final String f27309d;

    /* renamed from: e  reason: collision with root package name */
    public final k9.d f27310e;

    /* renamed from: f  reason: collision with root package name */
    public final k9.d f27311f;

    /* renamed from: g  reason: collision with root package name */
    public final f0<c> f27312g;
    private volatile long parkedWorkersStack;

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: k9.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class C0308a {
        private C0308a() {
        }

        public /* synthetic */ C0308a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27313a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27313a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f27306a = i10;
        this.f27307b = i11;
        this.f27308c = j10;
        this.f27309d = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f27310e = new k9.d();
            this.f27311f = new k9.d();
            this.f27312g = new f0<>((i10 + 1) * 2);
            this.controlState = i10 << 42;
            this._isTerminated = 0;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    private final int E(c cVar) {
        Object i10 = cVar.i();
        while (i10 != f27305l) {
            if (i10 == null) {
                return 0;
            }
            c cVar2 = (c) i10;
            int h10 = cVar2.h();
            if (h10 != 0) {
                return h10;
            }
            i10 = cVar2.i();
        }
        return -1;
    }

    private final c F() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27302i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c b10 = this.f27312g.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int E = E(b10);
            if (E >= 0 && f27302i.compareAndSet(this, j10, E | j11)) {
                b10.r(f27305l);
                return b10;
            }
        }
    }

    private final void R(long j10, boolean z10) {
        if (z10 || y0() || n0(j10)) {
            return;
        }
        y0();
    }

    private final h X(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.f27317c == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f27339b.b() == 0 && cVar.f27317c == d.BLOCKING) {
            return hVar;
        }
        cVar.f27321g = true;
        return cVar.f27315a.a(hVar, z10);
    }

    private final boolean b(h hVar) {
        if (hVar.f27339b.b() == 1) {
            return this.f27311f.a(hVar);
        }
        return this.f27310e.a(hVar);
    }

    private final int j() {
        int a10;
        synchronized (this.f27312g) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f27303j;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            a10 = y8.i.a(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (a10 >= this.f27306a) {
                return 0;
            }
            if (i10 >= this.f27307b) {
                return 0;
            }
            int i11 = ((int) (f27303j.get(this) & 2097151)) + 1;
            if (i11 > 0 && this.f27312g.b(i11) == null) {
                c cVar = new c(this, i11);
                this.f27312g.c(i11, cVar);
                if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i12 = a10 + 1;
                    cVar.start();
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final boolean n0(long j10) {
        int a10;
        a10 = y8.i.a(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0);
        if (a10 < this.f27306a) {
            int j11 = j();
            if (j11 == 1 && this.f27306a > 1) {
                j();
            }
            if (j11 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean o0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f27303j.get(aVar);
        }
        return aVar.n0(j10);
    }

    private final c t() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !kotlin.jvm.internal.n.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final boolean y0() {
        c F;
        do {
            F = F();
            if (F == null) {
                return false;
            }
        } while (!c.j().compareAndSet(F, -1, 0));
        LockSupport.unpark(F);
        return true;
    }

    public static /* synthetic */ void z(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f27348g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.w(runnable, iVar, z10);
    }

    public final boolean J(c cVar) {
        long j10;
        long j11;
        int h10;
        if (cVar.i() != f27305l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27302i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (2097151 & j10);
            j11 = (2097152 + j10) & (-2097152);
            h10 = cVar.h();
            if (s0.a()) {
                if (!(h10 != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.r(this.f27312g.b(i10));
        } while (!f27302i.compareAndSet(this, j10, h10 | j11));
        return true;
    }

    public final void K(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27302i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? E(cVar) : i11;
            }
            if (i12 >= 0 && f27302i.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    public final void L(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void P(long j10) {
        int i10;
        h d10;
        if (f27304k.compareAndSet(this, 0, 1)) {
            c t10 = t();
            synchronized (this.f27312g) {
                i10 = (int) (f27303j.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c b10 = this.f27312g.b(i11);
                    kotlin.jvm.internal.n.c(b10);
                    c cVar = b10;
                    if (cVar != t10) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        d dVar = cVar.f27317c;
                        if (s0.a()) {
                            if (!(dVar == d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f27315a.f(this.f27311f);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.f27311f.b();
            this.f27310e.b();
            while (true) {
                if (t10 != null) {
                    d10 = t10.g(true);
                    if (d10 != null) {
                        continue;
                        L(d10);
                    }
                }
                d10 = this.f27310e.d();
                if (d10 == null && (d10 = this.f27311f.d()) == null) {
                    break;
                }
                L(d10);
            }
            if (t10 != null) {
                t10.u(d.TERMINATED);
            }
            if (s0.a()) {
                if (!(((int) ((f27303j.get(this) & 9223367638808264704L) >> 42)) == this.f27306a)) {
                    throw new AssertionError();
                }
            }
            f27302i.set(this, 0L);
            f27303j.set(this, 0L);
        }
    }

    public final void S() {
        if (y0() || o0(this, 0L, 1, null)) {
            return;
        }
        y0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        P(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        z(this, runnable, null, false, 6, null);
    }

    public final boolean isTerminated() {
        return f27304k.get(this) != 0;
    }

    public final h k(Runnable runnable, i iVar) {
        long a10 = l.f27347f.a();
        if (runnable instanceof h) {
            h hVar = (h) runnable;
            hVar.f27338a = a10;
            hVar.f27339b = iVar;
            return hVar;
        }
        return new k(runnable, a10, iVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.f27312g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.f27312g.b(i15);
            if (b10 != null) {
                int e8 = b10.f27315a.e();
                int i16 = b.f27313a[b10.f27317c.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(e8);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e8);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (e8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i16 == 5) {
                    i14++;
                }
            }
        }
        long j10 = f27303j.get(this);
        return this.f27309d + '@' + t0.b(this) + "[Pool Size {core = " + this.f27306a + ", max = " + this.f27307b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f27310e.c() + ", global blocking queue size = " + this.f27311f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f27306a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void w(Runnable runnable, i iVar, boolean z10) {
        d9.c.a();
        h k10 = k(runnable, iVar);
        boolean z11 = false;
        boolean z12 = k10.f27339b.b() == 1;
        long addAndGet = z12 ? f27303j.addAndGet(this, 2097152L) : 0L;
        c t10 = t();
        h X = X(t10, k10, z10);
        if (X != null && !b(X)) {
            throw new RejectedExecutionException(this.f27309d + " was terminated");
        }
        if (z10 && t10 != null) {
            z11 = true;
        }
        if (z12) {
            R(addAndGet, z11);
        } else if (z11) {
        } else {
            S();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class c extends Thread {

        /* renamed from: i  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f27314i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a  reason: collision with root package name */
        public final n f27315a;

        /* renamed from: b  reason: collision with root package name */
        private final a0<h> f27316b;

        /* renamed from: c  reason: collision with root package name */
        public d f27317c;

        /* renamed from: d  reason: collision with root package name */
        private long f27318d;

        /* renamed from: e  reason: collision with root package name */
        private long f27319e;

        /* renamed from: f  reason: collision with root package name */
        private int f27320f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f27321g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f27315a = new n();
            this.f27316b = new a0<>();
            this.f27317c = d.DORMANT;
            this.nextParkedWorker = a.f27305l;
            this.f27320f = w8.c.f32384a.c();
        }

        private final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            a.f27303j.addAndGet(a.this, -2097152L);
            d dVar = this.f27317c;
            if (dVar != d.TERMINATED) {
                if (s0.a()) {
                    if (!(dVar == d.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f27317c = d.DORMANT;
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && u(d.BLOCKING)) {
                a.this.S();
            }
        }

        private final void d(h hVar) {
            int b10 = hVar.f27339b.b();
            k(b10);
            c(b10);
            a.this.L(hVar);
            b(b10);
        }

        private final h e(boolean z10) {
            h o10;
            h o11;
            if (z10) {
                boolean z11 = m(a.this.f27306a * 2) == 0;
                if (z11 && (o11 = o()) != null) {
                    return o11;
                }
                h g10 = this.f27315a.g();
                if (g10 != null) {
                    return g10;
                }
                if (!z11 && (o10 = o()) != null) {
                    return o10;
                }
            } else {
                h o12 = o();
                if (o12 != null) {
                    return o12;
                }
            }
            return v(3);
        }

        private final h f() {
            h h10 = this.f27315a.h();
            if (h10 == null) {
                h d10 = a.this.f27311f.d();
                return d10 == null ? v(1) : d10;
            }
            return h10;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f27314i;
        }

        private final void k(int i10) {
            this.f27318d = 0L;
            if (this.f27317c == d.PARKING) {
                if (s0.a()) {
                    if (!(i10 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f27317c = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f27305l;
        }

        private final void n() {
            if (this.f27318d == 0) {
                this.f27318d = System.nanoTime() + a.this.f27308c;
            }
            LockSupport.parkNanos(a.this.f27308c);
            if (System.nanoTime() - this.f27318d >= 0) {
                this.f27318d = 0L;
                w();
            }
        }

        private final h o() {
            if (m(2) == 0) {
                h d10 = a.this.f27310e.d();
                return d10 != null ? d10 : a.this.f27311f.d();
            }
            h d11 = a.this.f27311f.d();
            return d11 != null ? d11 : a.this.f27310e.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f27317c != d.TERMINATED) {
                    h g10 = g(this.f27321g);
                    if (g10 != null) {
                        this.f27319e = 0L;
                        d(g10);
                    } else {
                        this.f27321g = false;
                        if (this.f27319e == 0) {
                            t();
                        } else if (z10) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f27319e);
                            this.f27319e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            boolean z10;
            if (this.f27317c != d.CPU_ACQUIRED) {
                a aVar = a.this;
                AtomicLongFieldUpdater atomicLongFieldUpdater = a.f27303j;
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(aVar);
                    if (((int) ((9223367638808264704L & j10) >> 42)) != 0) {
                        if (a.f27303j.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f27317c = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.J(this);
                return;
            }
            f27314i.set(this, -1);
            while (l() && f27314i.get(this) == -1 && !a.this.isTerminated() && this.f27317c != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i10) {
            int i11 = (int) (a.f27303j.get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m7 = m(i11);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m7++;
                if (m7 > i11) {
                    m7 = 1;
                }
                c b10 = aVar.f27312g.b(m7);
                if (b10 != null && b10 != this) {
                    long n10 = b10.f27315a.n(i10, this.f27316b);
                    if (n10 == -1) {
                        a0<h> a0Var = this.f27316b;
                        h hVar = a0Var.f27364a;
                        a0Var.f27364a = null;
                        return hVar;
                    } else if (n10 > 0) {
                        j10 = Math.min(j10, n10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f27319e = j10;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f27312g) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (a.f27303j.get(aVar) & 2097151)) <= aVar.f27306a) {
                    return;
                }
                if (f27314i.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    q(0);
                    aVar.K(this, i10, 0);
                    int andDecrement = (int) (a.f27303j.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != i10) {
                        c b10 = aVar.f27312g.b(andDecrement);
                        kotlin.jvm.internal.n.c(b10);
                        c cVar = b10;
                        aVar.f27312g.c(i10, cVar);
                        cVar.q(i10);
                        aVar.K(cVar, andDecrement, i10);
                    }
                    aVar.f27312g.c(andDecrement, null);
                    w wVar = w.f26638a;
                    this.f27317c = d.TERMINATED;
                }
            }
        }

        public final h g(boolean z10) {
            return s() ? e(z10) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i10) {
            int i11 = this.f27320f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f27320f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i10;
        }

        public final void q(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f27309d);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f27317c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.f27303j.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f27317c = dVar;
            }
            return z10;
        }

        public c(a aVar, int i10) {
            this();
            q(i10);
        }
    }
}
