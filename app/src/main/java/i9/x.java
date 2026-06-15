package i9;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class x<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f26714e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f26715f = AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, "_next");

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f26716g = AtomicLongFieldUpdater.newUpdater(x.class, "_state");

    /* renamed from: h  reason: collision with root package name */
    public static final k0 f26717h = new k0("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    private final int f26718a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f26719b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26720c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReferenceArray f26721d;

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | (i10 << 0);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (i10 << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f26722a;

        public b(int i10) {
            this.f26722a = i10;
        }
    }

    public x(int i10, boolean z10) {
        this.f26718a = i10;
        this.f26719b = z10;
        int i11 = i10 - 1;
        this.f26720c = i11;
        this.f26721d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final x<E> b(long j10) {
        x<E> xVar = new x<>(this.f26718a * 2, this.f26719b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f26720c;
            if ((i10 & i12) != (i11 & i12)) {
                Object obj = this.f26721d.get(i12 & i10);
                if (obj == null) {
                    obj = new b(i10);
                }
                xVar.f26721d.set(xVar.f26720c & i10, obj);
                i10++;
            } else {
                f26716g.set(xVar, f26714e.d(j10, 1152921504606846976L));
                return xVar;
            }
        }
    }

    private final x<E> c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26715f;
        while (true) {
            x<E> xVar = (x) atomicReferenceFieldUpdater.get(this);
            if (xVar != null) {
                return xVar;
            }
            androidx.concurrent.futures.b.a(f26715f, this, null, b(j10));
        }
    }

    private final x<E> e(int i10, E e8) {
        Object obj = this.f26721d.get(this.f26720c & i10);
        if ((obj instanceof b) && ((b) obj).f26722a == i10) {
            this.f26721d.set(i10 & this.f26720c, e8);
            return this;
        }
        return null;
    }

    private final long h() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26716g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    private final x<E> k(int i10, int i11) {
        long j10;
        a aVar;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26716g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            aVar = f26714e;
            i12 = (int) ((1073741823 & j10) >> 0);
            if (d9.s0.a()) {
                if (!(i12 == i10)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j10) != 0) {
                return i();
            }
        } while (!f26716g.compareAndSet(this, j10, aVar.b(j10, i11)));
        this.f26721d.set(this.f26720c & i12, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = i9.x.f26716g
        L2:
            long r3 = r0.get(r14)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            i9.x$a r15 = i9.x.f26714e
            int r15 = r15.a(r3)
            return r15
        L16:
            i9.x$a r1 = i9.x.f26714e
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            r9 = 0
            long r5 = r5 >> r9
            int r2 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r10 = 30
            long r5 = r5 >> r10
            int r10 = (int) r5
            int r11 = r14.f26720c
            int r5 = r10 + 2
            r5 = r5 & r11
            r6 = r2 & r11
            r12 = 1
            if (r5 != r6) goto L34
            return r12
        L34:
            boolean r5 = r14.f26719b
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r14.f26721d
            r13 = r10 & r11
            java.lang.Object r5 = r5.get(r13)
            if (r5 == 0) goto L53
            int r1 = r14.f26718a
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 < r3) goto L52
            int r10 = r10 - r2
            r2 = r10 & r6
            int r1 = r1 >> 1
            if (r2 <= r1) goto L2
        L52:
            return r12
        L53:
            int r2 = r10 + 1
            r2 = r2 & r6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = i9.x.f26716g
            long r12 = r1.c(r3, r2)
            r1 = r5
            r2 = r14
            r5 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f26721d
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L6d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = i9.x.f26716g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L84
            i9.x r0 = r0.i()
            i9.x r0 = r0.e(r10, r15)
            if (r0 != 0) goto L6d
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.x.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26716g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j10 = f26716g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final boolean g() {
        long j10 = f26716g.get(this);
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final x<E> i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f26716g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f26717h;
            }
            a aVar = f26714e;
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f26720c;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.f26721d.get(i12 & i10);
            if (obj == null) {
                if (this.f26719b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i13 = (i10 + 1) & 1073741823;
                if (f26716g.compareAndSet(this, j10, aVar.b(j10, i13))) {
                    this.f26721d.set(this.f26720c & i10, null);
                    return obj;
                } else if (this.f26719b) {
                    x<E> xVar = this;
                    do {
                        xVar = xVar.k(i10, i13);
                    } while (xVar != null);
                    return obj;
                }
            }
        }
    }
}
