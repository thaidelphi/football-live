package m9;

import d9.d3;
import d9.n;
import i8.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;
import l9.j;
import t8.l;
import t8.p;
/* compiled from: Semaphore.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27815c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f27816d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27817e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f27818f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27819g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    private final int f27820a;

    /* renamed from: b  reason: collision with root package name */
    private final l<Throwable, w> f27821b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Semaphore.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.l implements p<Long, f, f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f27822a = new a();

        a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f a(long j10, f fVar) {
            f h10;
            h10 = e.h(j10, fVar);
            return h10;
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ f invoke(Long l10, f fVar) {
            return a(l10.longValue(), fVar);
        }
    }

    /* compiled from: Semaphore.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class b extends o implements l<Throwable, w> {
        b() {
            super(1);
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f26638a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            d.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Semaphore.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class c extends kotlin.jvm.internal.l implements p<Long, f, f> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f27824a = new c();

        c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f a(long j10, f fVar) {
            f h10;
            h10 = e.h(j10, fVar);
            return h10;
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ f invoke(Long l10, f fVar) {
            return a(l10.longValue(), fVar);
        }
    }

    public d(int i10, int i11) {
        this.f27820a = i10;
        boolean z10 = true;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if ((i11 < 0 || i11 > i10) ? false : z10) {
            f fVar = new f(0L, null, 2);
            this.head = fVar;
            this.tail = fVar;
            this._availablePermits = i10 - i11;
            this.f27821b = new b();
            return;
        }
        throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0051, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean d(d9.d3 r17) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d.d(d9.d3):boolean");
    }

    private final void e() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        do {
            atomicIntegerFieldUpdater = f27819g;
            i10 = atomicIntegerFieldUpdater.get(this);
            i11 = this.f27820a;
            if (i10 <= i11) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
    }

    private final int f() {
        int andDecrement;
        do {
            andDecrement = f27819g.getAndDecrement(this);
        } while (andDecrement > this.f27820a);
        return andDecrement;
    }

    private final boolean j(Object obj) {
        if (obj instanceof n) {
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            n nVar = (n) obj;
            Object p10 = nVar.p(w.f26638a, null, this.f27821b);
            if (p10 != null) {
                nVar.u(p10);
                return true;
            }
            return false;
        } else if (obj instanceof j) {
            return ((j) obj).f(this, w.f26638a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x004e, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean k() {
        /*
            r15 = this;
            r0 = r15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m9.d.f27815c
            java.lang.Object r2 = r1.get(r15)
            m9.f r2 = (m9.f) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = m9.d.f27816d
            long r3 = r3.getAndIncrement(r15)
            int r5 = m9.e.f()
            long r5 = (long) r5
            long r5 = r3 / r5
            m9.d$c r7 = m9.d.c.f27824a
        L18:
            java.lang.Object r8 = i9.d.c(r2, r5, r7)
            boolean r9 = i9.i0.c(r8)
            if (r9 != 0) goto L5b
            i9.h0 r9 = i9.i0.b(r8)
        L26:
            java.lang.Object r12 = r1.get(r15)
            i9.h0 r12 = (i9.h0) r12
            long r13 = r12.f26659c
            long r10 = r9.f26659c
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 < 0) goto L36
        L34:
            r9 = 1
            goto L4e
        L36:
            boolean r10 = r9.q()
            if (r10 != 0) goto L3e
            r9 = 0
            goto L4e
        L3e:
            boolean r10 = androidx.concurrent.futures.b.a(r1, r15, r12, r9)
            if (r10 == 0) goto L51
            boolean r9 = r12.m()
            if (r9 == 0) goto L34
            r12.k()
            goto L34
        L4e:
            if (r9 == 0) goto L18
            goto L5b
        L51:
            boolean r10 = r9.m()
            if (r10 == 0) goto L26
            r9.k()
            goto L26
        L5b:
            i9.h0 r1 = i9.i0.b(r8)
            m9.f r1 = (m9.f) r1
            r1.b()
            long r7 = r1.f26659c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L6c
            r2 = 0
            return r2
        L6c:
            int r2 = m9.e.f()
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            i9.k0 r3 = m9.e.e()
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto Laf
            int r3 = m9.e.d()
            r10 = 0
        L86:
            if (r10 >= r3) goto L9c
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r4 = r4.get(r2)
            i9.k0 r5 = m9.e.g()
            if (r4 != r5) goto L98
            r4 = 1
            return r4
        L98:
            r4 = 1
            int r10 = r10 + 1
            goto L86
        L9c:
            r4 = 1
            i9.k0 r3 = m9.e.e()
            i9.k0 r5 = m9.e.b()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.r()
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        Laf:
            i9.k0 r1 = m9.e.c()
            if (r3 != r1) goto Lb7
            r1 = 0
            return r1
        Lb7:
            boolean r1 = r15.j(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d.k():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(n<? super w> nVar) {
        while (f() <= 0) {
            kotlin.jvm.internal.n.d(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (d((d3) nVar)) {
                return;
            }
        }
        nVar.d(w.f26638a, this.f27821b);
    }

    public int g() {
        return Math.max(f27819g.get(this), 0);
    }

    public void h() {
        do {
            int andIncrement = f27819g.getAndIncrement(this);
            if (andIncrement >= this.f27820a) {
                e();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f27820a).toString());
            } else if (andIncrement >= 0) {
                return;
            }
        } while (!k());
    }

    public boolean i() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27819g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.f27820a) {
                e();
            } else if (i10 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
