package d9;

import d9.y0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: EventLoop.common.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class l1 extends m1 implements y0 {

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f24478e = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_queue");

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f24479f = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_delayed");

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f24480g = AtomicIntegerFieldUpdater.newUpdater(l1.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* compiled from: EventLoop.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    private final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        private final n<i8.w> f24481c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, n<? super i8.w> nVar) {
            super(j10);
            this.f24481c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24481c.g(l1.this, i8.w.f26638a);
        }

        @Override // d9.l1.c
        public String toString() {
            return super.toString() + this.f24481c;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    private static final class b extends c {

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f24483c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f24483c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24483c.run();
        }

        @Override // d9.l1.c
        public String toString() {
            return super.toString() + this.f24483c;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static abstract class c implements Runnable, Comparable<c>, g1, i9.r0 {
        private volatile Object _heap;

        /* renamed from: a  reason: collision with root package name */
        public long f24484a;

        /* renamed from: b  reason: collision with root package name */
        private int f24485b = -1;

        public c(long j10) {
            this.f24484a = j10;
        }

        @Override // i9.r0
        public i9.q0<?> b() {
            Object obj = this._heap;
            if (obj instanceof i9.q0) {
                return (i9.q0) obj;
            }
            return null;
        }

        @Override // i9.r0
        public void c(i9.q0<?> q0Var) {
            i9.k0 k0Var;
            Object obj = this._heap;
            k0Var = o1.f24498a;
            if (obj != k0Var) {
                this._heap = q0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // d9.g1
        public final void d() {
            i9.k0 k0Var;
            i9.k0 k0Var2;
            synchronized (this) {
                Object obj = this._heap;
                k0Var = o1.f24498a;
                if (obj == k0Var) {
                    return;
                }
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    dVar.g(this);
                }
                k0Var2 = o1.f24498a;
                this._heap = k0Var2;
                i8.w wVar = i8.w.f26638a;
            }
        }

        @Override // i9.r0
        public void f(int i10) {
            this.f24485b = i10;
        }

        @Override // i9.r0
        public int g() {
            return this.f24485b;
        }

        @Override // java.lang.Comparable
        /* renamed from: h */
        public int compareTo(c cVar) {
            int i10 = ((this.f24484a - cVar.f24484a) > 0L ? 1 : ((this.f24484a - cVar.f24484a) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        public final int i(long j10, d dVar, l1 l1Var) {
            i9.k0 k0Var;
            synchronized (this) {
                Object obj = this._heap;
                k0Var = o1.f24498a;
                if (obj == k0Var) {
                    return 2;
                }
                synchronized (dVar) {
                    c b10 = dVar.b();
                    if (l1Var.b()) {
                        return 1;
                    }
                    if (b10 == null) {
                        dVar.f24486c = j10;
                    } else {
                        long j11 = b10.f24484a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - dVar.f24486c > 0) {
                            dVar.f24486c = j10;
                        }
                    }
                    long j12 = this.f24484a;
                    long j13 = dVar.f24486c;
                    if (j12 - j13 < 0) {
                        this.f24484a = j13;
                    }
                    dVar.a(this);
                    return 0;
                }
            }
        }

        public final boolean j(long j10) {
            return j10 - this.f24484a >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f24484a + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class d extends i9.q0<c> {

        /* renamed from: c  reason: collision with root package name */
        public long f24486c;

        public d(long j10) {
            this.f24486c = j10;
        }
    }

    private final void a1() {
        i9.k0 k0Var;
        i9.k0 k0Var2;
        if (s0.a() && !b()) {
            throw new AssertionError();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24478e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24478e;
                k0Var = o1.f24499b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, null, k0Var)) {
                    return;
                }
            } else if (!(obj instanceof i9.x)) {
                k0Var2 = o1.f24499b;
                if (obj == k0Var2) {
                    return;
                }
                i9.x xVar = new i9.x(8, true);
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                xVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f24478e, this, obj, xVar)) {
                    return;
                }
            } else {
                ((i9.x) obj).d();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        return f24480g.get(this) != 0;
    }

    private final Runnable b1() {
        i9.k0 k0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24478e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof i9.x)) {
                k0Var = o1.f24499b;
                if (obj == k0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f24478e, this, obj, null)) {
                    kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            } else {
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                i9.x xVar = (i9.x) obj;
                Object j10 = xVar.j();
                if (j10 != i9.x.f26717h) {
                    return (Runnable) j10;
                }
                androidx.concurrent.futures.b.a(f24478e, this, obj, xVar.i());
            }
        }
    }

    private final boolean d1(Runnable runnable) {
        i9.k0 k0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24478e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (b()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f24478e, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof i9.x)) {
                k0Var = o1.f24499b;
                if (obj == k0Var) {
                    return false;
                }
                i9.x xVar = new i9.x(8, true);
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                xVar.a((Runnable) obj);
                xVar.a(runnable);
                if (androidx.concurrent.futures.b.a(f24478e, this, obj, xVar)) {
                    return true;
                }
            } else {
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                i9.x xVar2 = (i9.x) obj;
                int a10 = xVar2.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(f24478e, this, obj, xVar2.i());
                } else if (a10 == 2) {
                    return false;
                }
            }
        }
    }

    private final void f1() {
        c i10;
        d9.c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f24479f.get(this);
            if (dVar == null || (i10 = dVar.i()) == null) {
                return;
            }
            X0(nanoTime, i10);
        }
    }

    private final int i1(long j10, c cVar) {
        if (b()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24479f;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, new d(j10));
            Object obj = atomicReferenceFieldUpdater.get(this);
            kotlin.jvm.internal.n.c(obj);
            dVar = (d) obj;
        }
        return cVar.i(j10, dVar, this);
    }

    private final void k1(boolean z10) {
        f24480g.set(this, z10 ? 1 : 0);
    }

    private final boolean l1(c cVar) {
        d dVar = (d) f24479f.get(this);
        return (dVar != null ? dVar.e() : null) == cVar;
    }

    @Override // d9.j0
    public final void G0(m8.g gVar, Runnable runnable) {
        c1(runnable);
    }

    @Override // d9.k1
    protected long O0() {
        c e8;
        long b10;
        i9.k0 k0Var;
        if (super.O0() == 0) {
            return 0L;
        }
        Object obj = f24478e.get(this);
        if (obj != null) {
            if (!(obj instanceof i9.x)) {
                k0Var = o1.f24499b;
                return obj == k0Var ? Long.MAX_VALUE : 0L;
            } else if (!((i9.x) obj).g()) {
                return 0L;
            }
        }
        d dVar = (d) f24479f.get(this);
        if (dVar == null || (e8 = dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = e8.f24484a;
        d9.c.a();
        b10 = y8.i.b(j10 - System.nanoTime(), 0L);
        return b10;
    }

    @Override // d9.y0
    public void R(long j10, n<? super i8.w> nVar) {
        long c10 = o1.c(j10);
        if (c10 < 4611686018427387903L) {
            d9.c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c10 + nanoTime, nVar);
            h1(nanoTime, aVar);
            q.a(nVar, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    @Override // d9.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long T0() {
        /*
            r9 = this;
            boolean r0 = r9.U0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = d9.l1.f24479f
            java.lang.Object r0 = r0.get(r9)
            d9.l1$d r0 = (d9.l1.d) r0
            if (r0 == 0) goto L49
            boolean r3 = r0.d()
            if (r3 != 0) goto L49
            d9.c.a()
            long r3 = java.lang.System.nanoTime()
        L20:
            monitor-enter(r0)
            i9.r0 r5 = r0.b()     // Catch: java.lang.Throwable -> L46
            r6 = 0
            if (r5 != 0) goto L2a
            monitor-exit(r0)
            goto L41
        L2a:
            d9.l1$c r5 = (d9.l1.c) r5     // Catch: java.lang.Throwable -> L46
            boolean r7 = r5.j(r3)     // Catch: java.lang.Throwable -> L46
            r8 = 0
            if (r7 == 0) goto L38
            boolean r5 = r9.d1(r5)     // Catch: java.lang.Throwable -> L46
            goto L39
        L38:
            r5 = r8
        L39:
            if (r5 == 0) goto L40
            i9.r0 r5 = r0.h(r8)     // Catch: java.lang.Throwable -> L46
            r6 = r5
        L40:
            monitor-exit(r0)
        L41:
            d9.l1$c r6 = (d9.l1.c) r6
            if (r6 != 0) goto L20
            goto L49
        L46:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L49:
            java.lang.Runnable r0 = r9.b1()
            if (r0 == 0) goto L53
            r0.run()
            return r1
        L53:
            long r0 = r9.O0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.l1.T0():long");
    }

    @Override // d9.y0
    public g1 X(long j10, Runnable runnable, m8.g gVar) {
        return y0.a.a(this, j10, runnable, gVar);
    }

    public void c1(Runnable runnable) {
        if (d1(runnable)) {
            Y0();
        } else {
            u0.f24520h.c1(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e1() {
        i9.k0 k0Var;
        if (S0()) {
            d dVar = (d) f24479f.get(this);
            if (dVar == null || dVar.d()) {
                Object obj = f24478e.get(this);
                if (obj != null) {
                    if (obj instanceof i9.x) {
                        return ((i9.x) obj).g();
                    }
                    k0Var = o1.f24499b;
                    if (obj != k0Var) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g1() {
        f24478e.set(this, null);
        f24479f.set(this, null);
    }

    public final void h1(long j10, c cVar) {
        int i12 = i1(j10, cVar);
        if (i12 == 0) {
            if (l1(cVar)) {
                Y0();
            }
        } else if (i12 == 1) {
            X0(j10, cVar);
        } else if (i12 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final g1 j1(long j10, Runnable runnable) {
        long c10 = o1.c(j10);
        if (c10 < 4611686018427387903L) {
            d9.c.a();
            long nanoTime = System.nanoTime();
            b bVar = new b(c10 + nanoTime, runnable);
            h1(nanoTime, bVar);
            return bVar;
        }
        return n2.f24492a;
    }

    @Override // d9.k1
    public void shutdown() {
        w2.f24526a.c();
        k1(true);
        a1();
        do {
        } while (T0() <= 0);
        f1();
    }
}
