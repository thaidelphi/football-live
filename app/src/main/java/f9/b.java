package f9;

import androidx.recyclerview.widget.RecyclerView;
import d9.d3;
import d9.s0;
import i8.o;
import i8.w;
import i9.c0;
import i9.h0;
import i9.i0;
import i9.j0;
import i9.k0;
import i9.t0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
/* compiled from: BufferedChannel.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class b<E> implements f9.d<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f25496d = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f25497e = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f25498f = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f25499g = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f25500h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f25501i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f25502j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f25503k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f25504l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a  reason: collision with root package name */
    private final int f25505a;

    /* renamed from: b  reason: collision with root package name */
    public final t8.l<E, w> f25506b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c  reason: collision with root package name */
    private final t8.q<l9.j<?>, Object, Object, t8.l<Throwable, w>> f25507c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BufferedChannel.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class a implements f9.f<E>, d3 {

        /* renamed from: a  reason: collision with root package name */
        private Object f25508a;

        /* renamed from: b  reason: collision with root package name */
        private d9.o<? super Boolean> f25509b;

        public a() {
            k0 k0Var;
            k0Var = f9.c.f25544p;
            this.f25508a = k0Var;
        }

        private final Object f(i<E> iVar, int i10, long j10, m8.d<? super Boolean> dVar) {
            m8.d b10;
            k0 k0Var;
            k0 k0Var2;
            Boolean a10;
            k0 k0Var3;
            k0 k0Var4;
            k0 k0Var5;
            Object c10;
            b<E> bVar = b.this;
            b10 = n8.c.b(dVar);
            d9.o b11 = d9.q.b(b10);
            try {
                this.f25509b = b11;
                Object M0 = bVar.M0(iVar, i10, j10, this);
                k0Var = f9.c.f25541m;
                if (M0 == k0Var) {
                    bVar.t0(this, iVar, i10);
                } else {
                    k0Var2 = f9.c.f25543o;
                    t8.l<Throwable, w> lVar = null;
                    if (M0 == k0Var2) {
                        if (j10 < bVar.U()) {
                            iVar.b();
                        }
                        i iVar2 = (i) b.f25501i.get(bVar);
                        while (true) {
                            if (bVar.b0()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f25497e.getAndIncrement(bVar);
                            int i11 = f9.c.f25530b;
                            long j11 = andIncrement / i11;
                            int i12 = (int) (andIncrement % i11);
                            if (iVar2.f26659c != j11) {
                                i N = bVar.N(j11, iVar2);
                                if (N != null) {
                                    iVar2 = N;
                                }
                            }
                            Object M02 = bVar.M0(iVar2, i12, andIncrement, this);
                            k0Var3 = f9.c.f25541m;
                            if (M02 == k0Var3) {
                                bVar.t0(this, iVar2, i12);
                                break;
                            }
                            k0Var4 = f9.c.f25543o;
                            if (M02 != k0Var4) {
                                k0Var5 = f9.c.f25542n;
                                if (M02 != k0Var5) {
                                    iVar2.b();
                                    this.f25508a = M02;
                                    this.f25509b = null;
                                    a10 = kotlin.coroutines.jvm.internal.b.a(true);
                                    t8.l<E, w> lVar2 = bVar.f25506b;
                                    if (lVar2 != null) {
                                        lVar = c0.a(lVar2, M02, b11.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < bVar.U()) {
                                iVar2.b();
                            }
                        }
                    } else {
                        iVar.b();
                        this.f25508a = M0;
                        this.f25509b = null;
                        a10 = kotlin.coroutines.jvm.internal.b.a(true);
                        t8.l<E, w> lVar3 = bVar.f25506b;
                        if (lVar3 != null) {
                            lVar = c0.a(lVar3, M0, b11.getContext());
                        }
                    }
                    b11.d(a10, lVar);
                }
                Object z10 = b11.z();
                c10 = n8.d.c();
                if (z10 == c10) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return z10;
            } catch (Throwable th) {
                b11.K();
                throw th;
            }
        }

        private final boolean g() {
            this.f25508a = f9.c.z();
            Throwable Q = b.this.Q();
            if (Q == null) {
                return false;
            }
            throw j0.j(Q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            d9.o<? super Boolean> oVar = this.f25509b;
            kotlin.jvm.internal.n.c(oVar);
            this.f25509b = null;
            this.f25508a = f9.c.z();
            Throwable Q = b.this.Q();
            if (Q == null) {
                o.a aVar = i8.o.f26626b;
                oVar.resumeWith(i8.o.b(Boolean.FALSE));
                return;
            }
            if (s0.d() && (oVar instanceof kotlin.coroutines.jvm.internal.e)) {
                Q = j0.i(Q, oVar);
            }
            o.a aVar2 = i8.o.f26626b;
            oVar.resumeWith(i8.o.b(i8.p.a(Q)));
        }

        @Override // f9.f
        public Object a(m8.d<? super Boolean> dVar) {
            i<E> iVar;
            k0 k0Var;
            k0 k0Var2;
            k0 k0Var3;
            b<E> bVar = b.this;
            i<E> iVar2 = (i) b.f25501i.get(bVar);
            while (!bVar.b0()) {
                long andIncrement = b.f25497e.getAndIncrement(bVar);
                int i10 = f9.c.f25530b;
                long j10 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (iVar2.f26659c != j10) {
                    i<E> N = bVar.N(j10, iVar2);
                    if (N == null) {
                        continue;
                    } else {
                        iVar = N;
                    }
                } else {
                    iVar = iVar2;
                }
                Object M0 = bVar.M0(iVar, i11, andIncrement, null);
                k0Var = f9.c.f25541m;
                if (M0 != k0Var) {
                    k0Var2 = f9.c.f25543o;
                    if (M0 != k0Var2) {
                        k0Var3 = f9.c.f25542n;
                        if (M0 == k0Var3) {
                            return f(iVar, i11, andIncrement, dVar);
                        }
                        iVar.b();
                        this.f25508a = M0;
                        return kotlin.coroutines.jvm.internal.b.a(true);
                    }
                    if (andIncrement < bVar.U()) {
                        iVar.b();
                    }
                    iVar2 = iVar;
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g());
        }

        @Override // d9.d3
        public void e(h0<?> h0Var, int i10) {
            d9.o<? super Boolean> oVar = this.f25509b;
            if (oVar != null) {
                oVar.e(h0Var, i10);
            }
        }

        public final boolean i(E e8) {
            boolean B;
            d9.o<? super Boolean> oVar = this.f25509b;
            kotlin.jvm.internal.n.c(oVar);
            this.f25509b = null;
            this.f25508a = e8;
            Boolean bool = Boolean.TRUE;
            t8.l<E, w> lVar = b.this.f25506b;
            B = f9.c.B(oVar, bool, lVar != null ? c0.a(lVar, e8, oVar.getContext()) : null);
            return B;
        }

        public final void j() {
            d9.o<? super Boolean> oVar = this.f25509b;
            kotlin.jvm.internal.n.c(oVar);
            this.f25509b = null;
            this.f25508a = f9.c.z();
            Throwable Q = b.this.Q();
            if (Q == null) {
                o.a aVar = i8.o.f26626b;
                oVar.resumeWith(i8.o.b(Boolean.FALSE));
                return;
            }
            if (s0.d() && (oVar instanceof kotlin.coroutines.jvm.internal.e)) {
                Q = j0.i(Q, oVar);
            }
            o.a aVar2 = i8.o.f26626b;
            oVar.resumeWith(i8.o.b(i8.p.a(Q)));
        }

        @Override // f9.f
        public E next() {
            k0 k0Var;
            k0 k0Var2;
            E e8 = (E) this.f25508a;
            k0Var = f9.c.f25544p;
            if (e8 != k0Var) {
                k0Var2 = f9.c.f25544p;
                this.f25508a = k0Var2;
                if (e8 != f9.c.z()) {
                    return e8;
                }
                throw j0.j(b.this.R());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BufferedChannel.kt */
    /* renamed from: f9.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class C0275b implements d3 {

        /* renamed from: a  reason: collision with root package name */
        private final d9.n<Boolean> f25511a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ d9.o<Boolean> f25512b;

        public final d9.n<Boolean> a() {
            return this.f25511a;
        }

        @Override // d9.d3
        public void e(h0<?> h0Var, int i10) {
            this.f25512b.e(h0Var, i10);
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    /* synthetic */ class c extends kotlin.jvm.internal.l implements t8.q<b<?>, l9.j<?>, Object, w> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f25513a = new c();

        c() {
            super(3, b.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(b<?> bVar, l9.j<?> jVar, Object obj) {
            bVar.A0(jVar, obj);
        }

        @Override // t8.q
        public /* bridge */ /* synthetic */ w invoke(b<?> bVar, l9.j<?> jVar, Object obj) {
            a(bVar, jVar, obj);
            return w.f26638a;
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    /* synthetic */ class d extends kotlin.jvm.internal.l implements t8.q<b<?>, Object, Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f25514a = new d();

        d() {
            super(3, b.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // t8.q
        /* renamed from: a */
        public final Object invoke(b<?> bVar, Object obj, Object obj2) {
            return bVar.v0(obj, obj2);
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class e extends kotlin.jvm.internal.o implements t8.q<l9.j<?>, Object, Object, t8.l<? super Throwable, ? extends w>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b<E> f25515a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BufferedChannel.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a extends kotlin.jvm.internal.o implements t8.l<Throwable, w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Object f25516a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b<E> f25517b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ l9.j<?> f25518c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b<E> bVar, l9.j<?> jVar) {
                super(1);
                this.f25516a = obj;
                this.f25517b = bVar;
                this.f25518c = jVar;
            }

            @Override // t8.l
            public /* bridge */ /* synthetic */ w invoke(Throwable th) {
                invoke2(th);
                return w.f26638a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (this.f25516a != f9.c.z()) {
                    c0.b(this.f25517b.f25506b, this.f25516a, this.f25518c.getContext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b<E> bVar) {
            super(3);
            this.f25515a = bVar;
        }

        @Override // t8.q
        /* renamed from: a */
        public final t8.l<Throwable, w> invoke(l9.j<?> jVar, Object obj, Object obj2) {
            return new a(obj2, this.f25515a, jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedChannel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class f<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f25519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b<E> f25520b;

        /* renamed from: c  reason: collision with root package name */
        int f25521c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b<E> bVar, m8.d<? super f> dVar) {
            super(dVar);
            this.f25520b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            this.f25519a = obj;
            this.f25521c |= RecyclerView.UNDEFINED_DURATION;
            Object x02 = b.x0(this.f25520b, this);
            c10 = n8.d.c();
            return x02 == c10 ? x02 : h.b(x02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedChannel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f25522a;

        /* renamed from: b  reason: collision with root package name */
        Object f25523b;

        /* renamed from: c  reason: collision with root package name */
        int f25524c;

        /* renamed from: d  reason: collision with root package name */
        long f25525d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f25526e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b<E> f25527f;

        /* renamed from: g  reason: collision with root package name */
        int f25528g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b<E> bVar, m8.d<? super g> dVar) {
            super(dVar);
            this.f25527f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            this.f25526e = obj;
            this.f25528g |= RecyclerView.UNDEFINED_DURATION;
            Object y02 = this.f25527f.y0(null, 0, 0L, this);
            c10 = n8.d.c();
            return y02 == c10 ? y02 : h.b(y02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, t8.l<? super E, w> lVar) {
        long A;
        k0 k0Var;
        this.f25505a = i10;
        this.f25506b = lVar;
        if (i10 >= 0) {
            A = f9.c.A(i10);
            this.bufferEnd = A;
            this.completedExpandBuffersAndPauseFlag = P();
            i iVar = new i(0L, null, this, 3);
            this.sendSegment = iVar;
            this.receiveSegment = iVar;
            if (f0()) {
                iVar = f9.c.f25529a;
                kotlin.jvm.internal.n.d(iVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = iVar;
            this.f25507c = lVar != 0 ? new e(this) : null;
            k0Var = f9.c.f25547s;
            this._closeCause = k0Var;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(l9.j<?> jVar, Object obj) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        i iVar = (i) f25501i.get(this);
        while (!b0()) {
            long andIncrement = f25497e.getAndIncrement(this);
            int i10 = f9.c.f25530b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (iVar.f26659c != j10) {
                i N = N(j10, iVar);
                if (N == null) {
                    continue;
                } else {
                    iVar = N;
                }
            }
            Object M0 = M0(iVar, i11, andIncrement, jVar);
            k0Var = f9.c.f25541m;
            if (M0 != k0Var) {
                k0Var2 = f9.c.f25543o;
                if (M0 != k0Var2) {
                    k0Var3 = f9.c.f25542n;
                    if (M0 != k0Var3) {
                        iVar.b();
                        jVar.c(M0);
                        return;
                    }
                    throw new IllegalStateException("unexpected".toString());
                } else if (andIncrement < U()) {
                    iVar.b();
                }
            } else {
                d3 d3Var = jVar instanceof d3 ? (d3) jVar : null;
                if (d3Var != null) {
                    t0(d3Var, iVar, i11);
                    return;
                }
                return;
            }
        }
        o0(jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r12 = (f9.i) r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void B0(f9.i<E> r12) {
        /*
            r11 = this;
            t8.l<E, i8.w> r0 = r11.f25506b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = i9.q.b(r1, r2, r1)
        L8:
            int r4 = f9.c.f25530b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f26659c
            int r8 = f9.c.f25530b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.w(r4)
            i9.k0 r9 = f9.c.f()
            if (r8 == r9) goto Lbb
            i9.k0 r9 = f9.c.f25532d
            if (r8 != r9) goto L48
            long r9 = r11.S()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            i9.k0 r9 = f9.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.v(r4)
            i9.t0 r1 = i9.c0.c(r0, r5, r1)
        L40:
            r12.s(r4)
            r12.p()
            goto Laf
        L48:
            i9.k0 r9 = f9.c.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof d9.d3
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof f9.v
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            i9.k0 r9 = f9.c.p()
            if (r8 == r9) goto Lbb
            i9.k0 r9 = f9.c.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            i9.k0 r9 = f9.c.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.S()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof f9.v
            if (r9 == 0) goto L80
            r9 = r8
            f9.v r9 = (f9.v) r9
            d9.d3 r9 = r9.f25571a
            goto L83
        L80:
            r9 = r8
            d9.d3 r9 = (d9.d3) r9
        L83:
            i9.k0 r10 = f9.c.z()
            boolean r8 = r12.r(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.v(r4)
            i9.t0 r1 = i9.c0.c(r0, r5, r1)
        L97:
            java.lang.Object r3 = i9.q.c(r3, r9)
            r12.s(r4)
            r12.p()
            goto Laf
        La2:
            i9.k0 r9 = f9.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.p()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            i9.e r12 = r12.g()
            f9.i r12 = (f9.i) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            d9.d3 r3 = (d9.d3) r3
            r11.D0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.n.d(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            d9.d3 r0 = (d9.d3) r0
            r11.D0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.b.B0(f9.i):void");
    }

    private final boolean C(long j10) {
        return j10 < P() || j10 < S() + ((long) this.f25505a);
    }

    private final void C0(d3 d3Var) {
        E0(d3Var, true);
    }

    private final void D0(d3 d3Var) {
        E0(d3Var, false);
    }

    private final void E(i<E> iVar, long j10) {
        k0 k0Var;
        Object b10 = i9.q.b(null, 1, null);
        loop0: while (iVar != null) {
            for (int i10 = f9.c.f25530b - 1; -1 < i10; i10--) {
                if ((iVar.f26659c * f9.c.f25530b) + i10 < j10) {
                    break loop0;
                }
                while (true) {
                    Object w10 = iVar.w(i10);
                    if (w10 != null) {
                        k0Var = f9.c.f25533e;
                        if (w10 != k0Var) {
                            if (w10 instanceof v) {
                                if (iVar.r(i10, w10, f9.c.z())) {
                                    b10 = i9.q.c(b10, ((v) w10).f25571a);
                                    iVar.x(i10, true);
                                    break;
                                }
                            } else if (!(w10 instanceof d3)) {
                                break;
                            } else if (iVar.r(i10, w10, f9.c.z())) {
                                b10 = i9.q.c(b10, w10);
                                iVar.x(i10, true);
                                break;
                            }
                        }
                    }
                    if (iVar.r(i10, w10, f9.c.z())) {
                        iVar.p();
                        break;
                    }
                }
            }
            iVar = (i) iVar.g();
        }
        if (b10 != null) {
            if (!(b10 instanceof ArrayList)) {
                C0((d3) b10);
                return;
            }
            kotlin.jvm.internal.n.d(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b10;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                C0((d3) arrayList.get(size));
            }
        }
    }

    private final void E0(d3 d3Var, boolean z10) {
        if (d3Var instanceof C0275b) {
            d9.n<Boolean> a10 = ((C0275b) d3Var).a();
            o.a aVar = i8.o.f26626b;
            a10.resumeWith(i8.o.b(Boolean.FALSE));
        } else if (d3Var instanceof d9.n) {
            m8.d dVar = (m8.d) d3Var;
            o.a aVar2 = i8.o.f26626b;
            dVar.resumeWith(i8.o.b(i8.p.a(z10 ? R() : T())));
        } else if (d3Var instanceof s) {
            d9.o<h<? extends E>> oVar = ((s) d3Var).f25570a;
            o.a aVar3 = i8.o.f26626b;
            oVar.resumeWith(i8.o.b(h.b(h.f25553b.a(Q()))));
        } else if (d3Var instanceof a) {
            ((a) d3Var).j();
        } else if (d3Var instanceof l9.j) {
            ((l9.j) d3Var).f(this, f9.c.z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + d3Var).toString());
        }
    }

    private final i<E> F() {
        i iVar = f25502j.get(this);
        i iVar2 = (i) f25500h.get(this);
        if (iVar2.f26659c > ((i) iVar).f26659c) {
            iVar = iVar2;
        }
        i iVar3 = (i) f25501i.get(this);
        if (iVar3.f26659c > ((i) iVar).f26659c) {
            iVar = iVar3;
        }
        return (i) i9.d.b((i9.e) iVar);
    }

    static /* synthetic */ <E> Object F0(b<E> bVar, E e8, m8.d<? super w> dVar) {
        Object c10;
        Object c11;
        Object c12;
        Object c13;
        i<E> iVar = (i) f25500h.get(bVar);
        while (true) {
            long andIncrement = f25496d.getAndIncrement(bVar);
            long j10 = 1152921504606846975L & andIncrement;
            boolean d02 = bVar.d0(andIncrement);
            int i10 = f9.c.f25530b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (iVar.f26659c != j11) {
                i<E> O = bVar.O(j11, iVar);
                if (O != null) {
                    iVar = O;
                } else if (d02) {
                    Object p02 = bVar.p0(e8, dVar);
                    c13 = n8.d.c();
                    if (p02 == c13) {
                        return p02;
                    }
                }
            }
            int O0 = bVar.O0(iVar, i11, e8, j10, null, d02);
            if (O0 == 0) {
                iVar.b();
                break;
            } else if (O0 == 1) {
                break;
            } else if (O0 != 2) {
                if (O0 == 3) {
                    Object G0 = bVar.G0(iVar, i11, e8, j10, dVar);
                    c11 = n8.d.c();
                    if (G0 == c11) {
                        return G0;
                    }
                } else if (O0 == 4) {
                    if (j10 < bVar.S()) {
                        iVar.b();
                    }
                    Object p03 = bVar.p0(e8, dVar);
                    c12 = n8.d.c();
                    if (p03 == c12) {
                        return p03;
                    }
                } else if (O0 == 5) {
                    iVar.b();
                }
            } else if (d02) {
                iVar.p();
                Object p04 = bVar.p0(e8, dVar);
                c10 = n8.d.c();
                if (p04 == c10) {
                    return p04;
                }
            } else if (s0.a()) {
                throw new AssertionError();
            }
        }
        return w.f26638a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G0(f9.i<E> r21, int r22, E r23, long r24, m8.d<? super i8.w> r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.b.G0(f9.i, int, java.lang.Object, long, m8.d):java.lang.Object");
    }

    private final void H(long j10) {
        B0(I(j10));
    }

    private final boolean H0(long j10) {
        if (d0(j10)) {
            return false;
        }
        return !C(j10 & 1152921504606846975L);
    }

    private final i<E> I(long j10) {
        i<E> F = F();
        if (e0()) {
            long g02 = g0(F);
            if (g02 != -1) {
                K(g02);
            }
        }
        E(F, j10);
        return F;
    }

    private final boolean I0(Object obj, E e8) {
        boolean B;
        boolean B2;
        if (obj instanceof l9.j) {
            return ((l9.j) obj).f(this, e8);
        }
        if (obj instanceof s) {
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            s sVar = (s) obj;
            d9.o<h<? extends E>> oVar = sVar.f25570a;
            h b10 = h.b(h.f25553b.c(e8));
            t8.l<E, w> lVar = this.f25506b;
            B2 = f9.c.B(oVar, b10, lVar != null ? c0.a(lVar, e8, sVar.f25570a.getContext()) : null);
            return B2;
        } else if (obj instanceof a) {
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e8);
        } else if (obj instanceof d9.n) {
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            d9.n nVar = (d9.n) obj;
            t8.l<E, w> lVar2 = this.f25506b;
            B = f9.c.B(nVar, e8, lVar2 != null ? c0.a(lVar2, e8, nVar.getContext()) : null);
            return B;
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    private final void J() {
        s();
    }

    private final boolean J0(Object obj, i<E> iVar, int i10) {
        if (obj instanceof d9.n) {
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f9.c.C((d9.n) obj, w.f26638a, null, 2, null);
        } else if (obj instanceof l9.j) {
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            l9.l C = ((l9.i) obj).C(this, w.f26638a);
            if (C == l9.l.REREGISTER) {
                iVar.s(i10);
            }
            return C == l9.l.SUCCESSFUL;
        } else if (obj instanceof C0275b) {
            return f9.c.C(((C0275b) obj).a(), Boolean.TRUE, null, 2, null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    private final boolean K0(i<E> iVar, int i10, long j10) {
        k0 k0Var;
        k0 k0Var2;
        Object w10 = iVar.w(i10);
        if ((w10 instanceof d3) && j10 >= f25497e.get(this)) {
            k0Var = f9.c.f25535g;
            if (iVar.r(i10, w10, k0Var)) {
                if (!J0(w10, iVar, i10)) {
                    k0Var2 = f9.c.f25538j;
                    iVar.A(i10, k0Var2);
                    iVar.x(i10, false);
                    return false;
                }
                iVar.A(i10, f9.c.f25532d);
                return true;
            }
        }
        return L0(iVar, i10, j10);
    }

    private final void L() {
        if (f0()) {
            return;
        }
        i<E> iVar = (i) f25502j.get(this);
        while (true) {
            long andIncrement = f25498f.getAndIncrement(this);
            int i10 = f9.c.f25530b;
            long j10 = andIncrement / i10;
            if (U() <= andIncrement) {
                if (iVar.f26659c < j10 && iVar.e() != 0) {
                    k0(j10, iVar);
                }
                X(this, 0L, 1, null);
                return;
            }
            if (iVar.f26659c != j10) {
                i<E> M = M(j10, iVar, andIncrement);
                if (M == null) {
                    continue;
                } else {
                    iVar = M;
                }
            }
            if (K0(iVar, (int) (andIncrement % i10), andIncrement)) {
                X(this, 0L, 1, null);
                return;
            }
            X(this, 0L, 1, null);
        }
    }

    private final boolean L0(i<E> iVar, int i10, long j10) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        k0 k0Var4;
        k0 k0Var5;
        k0 k0Var6;
        k0 k0Var7;
        k0 k0Var8;
        while (true) {
            Object w10 = iVar.w(i10);
            if (!(w10 instanceof d3)) {
                k0Var3 = f9.c.f25538j;
                if (w10 != k0Var3) {
                    if (w10 == null) {
                        k0Var4 = f9.c.f25533e;
                        if (iVar.r(i10, w10, k0Var4)) {
                            return true;
                        }
                    } else if (w10 != f9.c.f25532d) {
                        k0Var5 = f9.c.f25536h;
                        if (w10 == k0Var5) {
                            break;
                        }
                        k0Var6 = f9.c.f25537i;
                        if (w10 == k0Var6) {
                            break;
                        }
                        k0Var7 = f9.c.f25539k;
                        if (w10 == k0Var7 || w10 == f9.c.z()) {
                            return true;
                        }
                        k0Var8 = f9.c.f25534f;
                        if (w10 != k0Var8) {
                            throw new IllegalStateException(("Unexpected cell state: " + w10).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else if (j10 >= f25497e.get(this)) {
                k0Var = f9.c.f25535g;
                if (iVar.r(i10, w10, k0Var)) {
                    if (!J0(w10, iVar, i10)) {
                        k0Var2 = f9.c.f25538j;
                        iVar.A(i10, k0Var2);
                        iVar.x(i10, false);
                        return false;
                    }
                    iVar.A(i10, f9.c.f25532d);
                    return true;
                }
            } else if (iVar.r(i10, w10, new v((d3) w10))) {
                return true;
            }
        }
    }

    private final i<E> M(long j10, i<E> iVar, long j11) {
        Object c10;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25502j;
        t8.p pVar = (t8.p) f9.c.y();
        do {
            c10 = i9.d.c(iVar, j10, pVar);
            if (i0.c(c10)) {
                break;
            }
            h0 b10 = i0.b(c10);
            while (true) {
                h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
                if (h0Var.f26659c >= b10.f26659c) {
                    break;
                } else if (!b10.q()) {
                    z10 = false;
                    continue;
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, h0Var, b10)) {
                    if (h0Var.m()) {
                        h0Var.k();
                    }
                } else if (b10.m()) {
                    b10.k();
                }
            }
            z10 = true;
            continue;
        } while (!z10);
        if (i0.c(c10)) {
            J();
            k0(j10, iVar);
            X(this, 0L, 1, null);
            return null;
        }
        i<E> iVar2 = (i) i0.b(c10);
        long j12 = iVar2.f26659c;
        if (j12 > j10) {
            int i10 = f9.c.f25530b;
            if (f25498f.compareAndSet(this, j11 + 1, i10 * j12)) {
                W((iVar2.f26659c * i10) - j11);
                return null;
            }
            X(this, 0L, 1, null);
            return null;
        }
        if (s0.a()) {
            if (!(iVar2.f26659c == j10)) {
                throw new AssertionError();
            }
        }
        return iVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M0(i<E> iVar, int i10, long j10, Object obj) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        Object w10 = iVar.w(i10);
        if (w10 == null) {
            if (j10 >= (f25496d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    k0Var3 = f9.c.f25542n;
                    return k0Var3;
                } else if (iVar.r(i10, w10, obj)) {
                    L();
                    k0Var2 = f9.c.f25541m;
                    return k0Var2;
                }
            }
        } else if (w10 == f9.c.f25532d) {
            k0Var = f9.c.f25537i;
            if (iVar.r(i10, w10, k0Var)) {
                L();
                return iVar.y(i10);
            }
        }
        return N0(iVar, i10, j10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i<E> N(long j10, i<E> iVar) {
        Object c10;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25501i;
        t8.p pVar = (t8.p) f9.c.y();
        do {
            c10 = i9.d.c(iVar, j10, pVar);
            if (i0.c(c10)) {
                break;
            }
            h0 b10 = i0.b(c10);
            while (true) {
                h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
                if (h0Var.f26659c >= b10.f26659c) {
                    break;
                } else if (!b10.q()) {
                    z10 = false;
                    continue;
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, h0Var, b10)) {
                    if (h0Var.m()) {
                        h0Var.k();
                    }
                } else if (b10.m()) {
                    b10.k();
                }
            }
            z10 = true;
            continue;
        } while (!z10);
        if (i0.c(c10)) {
            J();
            if (iVar.f26659c * f9.c.f25530b < U()) {
                iVar.b();
                return null;
            }
            return null;
        }
        i<E> iVar2 = (i) i0.b(c10);
        if (!f0() && j10 <= P() / f9.c.f25530b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f25502j;
            while (true) {
                h0 h0Var2 = (h0) atomicReferenceFieldUpdater2.get(this);
                if (h0Var2.f26659c >= iVar2.f26659c || !iVar2.q()) {
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, h0Var2, iVar2)) {
                    if (h0Var2.m()) {
                        h0Var2.k();
                    }
                } else if (iVar2.m()) {
                    iVar2.k();
                }
            }
        }
        long j11 = iVar2.f26659c;
        if (j11 > j10) {
            int i10 = f9.c.f25530b;
            Q0(j11 * i10);
            if (iVar2.f26659c * i10 < U()) {
                iVar2.b();
                return null;
            }
            return null;
        }
        if (s0.a()) {
            if (!(iVar2.f26659c == j10)) {
                throw new AssertionError();
            }
        }
        return iVar2;
    }

    private final Object N0(i<E> iVar, int i10, long j10, Object obj) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        k0 k0Var4;
        k0 k0Var5;
        k0 k0Var6;
        k0 k0Var7;
        k0 k0Var8;
        k0 k0Var9;
        k0 k0Var10;
        k0 k0Var11;
        k0 k0Var12;
        k0 k0Var13;
        k0 k0Var14;
        k0 k0Var15;
        k0 k0Var16;
        while (true) {
            Object w10 = iVar.w(i10);
            if (w10 != null) {
                k0Var5 = f9.c.f25533e;
                if (w10 != k0Var5) {
                    if (w10 == f9.c.f25532d) {
                        k0Var6 = f9.c.f25537i;
                        if (iVar.r(i10, w10, k0Var6)) {
                            L();
                            return iVar.y(i10);
                        }
                    } else {
                        k0Var7 = f9.c.f25538j;
                        if (w10 == k0Var7) {
                            k0Var8 = f9.c.f25543o;
                            return k0Var8;
                        }
                        k0Var9 = f9.c.f25536h;
                        if (w10 == k0Var9) {
                            k0Var10 = f9.c.f25543o;
                            return k0Var10;
                        } else if (w10 != f9.c.z()) {
                            k0Var12 = f9.c.f25535g;
                            if (w10 != k0Var12) {
                                k0Var13 = f9.c.f25534f;
                                if (iVar.r(i10, w10, k0Var13)) {
                                    boolean z10 = w10 instanceof v;
                                    if (z10) {
                                        w10 = ((v) w10).f25571a;
                                    }
                                    if (J0(w10, iVar, i10)) {
                                        k0Var16 = f9.c.f25537i;
                                        iVar.A(i10, k0Var16);
                                        L();
                                        return iVar.y(i10);
                                    }
                                    k0Var14 = f9.c.f25538j;
                                    iVar.A(i10, k0Var14);
                                    iVar.x(i10, false);
                                    if (z10) {
                                        L();
                                    }
                                    k0Var15 = f9.c.f25543o;
                                    return k0Var15;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            L();
                            k0Var11 = f9.c.f25543o;
                            return k0Var11;
                        }
                    }
                }
            }
            if (j10 < (f25496d.get(this) & 1152921504606846975L)) {
                k0Var = f9.c.f25536h;
                if (iVar.r(i10, w10, k0Var)) {
                    L();
                    k0Var2 = f9.c.f25543o;
                    return k0Var2;
                }
            } else if (obj == null) {
                k0Var3 = f9.c.f25542n;
                return k0Var3;
            } else if (iVar.r(i10, w10, obj)) {
                L();
                k0Var4 = f9.c.f25541m;
                return k0Var4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i<E> O(long j10, i<E> iVar) {
        Object c10;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25500h;
        t8.p pVar = (t8.p) f9.c.y();
        do {
            c10 = i9.d.c(iVar, j10, pVar);
            if (i0.c(c10)) {
                break;
            }
            h0 b10 = i0.b(c10);
            while (true) {
                h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
                if (h0Var.f26659c >= b10.f26659c) {
                    break;
                } else if (!b10.q()) {
                    z10 = false;
                    continue;
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, h0Var, b10)) {
                    if (h0Var.m()) {
                        h0Var.k();
                    }
                } else if (b10.m()) {
                    b10.k();
                }
            }
            z10 = true;
            continue;
        } while (!z10);
        if (i0.c(c10)) {
            J();
            if (iVar.f26659c * f9.c.f25530b < S()) {
                iVar.b();
                return null;
            }
            return null;
        }
        i<E> iVar2 = (i) i0.b(c10);
        long j11 = iVar2.f26659c;
        if (j11 > j10) {
            int i10 = f9.c.f25530b;
            R0(j11 * i10);
            if (iVar2.f26659c * i10 < S()) {
                iVar2.b();
                return null;
            }
            return null;
        }
        if (s0.a()) {
            if (!(iVar2.f26659c == j10)) {
                throw new AssertionError();
            }
        }
        return iVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int O0(i<E> iVar, int i10, E e8, long j10, Object obj, boolean z10) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        iVar.B(i10, e8);
        if (z10) {
            return P0(iVar, i10, e8, j10, obj, z10);
        }
        Object w10 = iVar.w(i10);
        if (w10 == null) {
            if (C(j10)) {
                if (iVar.r(i10, null, f9.c.f25532d)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (iVar.r(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (w10 instanceof d3) {
            iVar.s(i10);
            if (I0(w10, e8)) {
                k0Var3 = f9.c.f25537i;
                iVar.A(i10, k0Var3);
                r0();
                return 0;
            }
            k0Var = f9.c.f25539k;
            Object t10 = iVar.t(i10, k0Var);
            k0Var2 = f9.c.f25539k;
            if (t10 != k0Var2) {
                iVar.x(i10, true);
            }
            return 5;
        }
        return P0(iVar, i10, e8, j10, obj, z10);
    }

    private final long P() {
        return f25498f.get(this);
    }

    private final int P0(i<E> iVar, int i10, E e8, long j10, Object obj, boolean z10) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        k0 k0Var4;
        k0 k0Var5;
        k0 k0Var6;
        k0 k0Var7;
        while (true) {
            Object w10 = iVar.w(i10);
            if (w10 != null) {
                k0Var2 = f9.c.f25533e;
                if (w10 != k0Var2) {
                    k0Var3 = f9.c.f25539k;
                    if (w10 != k0Var3) {
                        k0Var4 = f9.c.f25536h;
                        if (w10 == k0Var4) {
                            iVar.s(i10);
                            return 5;
                        } else if (w10 == f9.c.z()) {
                            iVar.s(i10);
                            J();
                            return 4;
                        } else {
                            if (s0.a()) {
                                if (!((w10 instanceof d3) || (w10 instanceof v))) {
                                    throw new AssertionError();
                                }
                            }
                            iVar.s(i10);
                            if (w10 instanceof v) {
                                w10 = ((v) w10).f25571a;
                            }
                            if (I0(w10, e8)) {
                                k0Var7 = f9.c.f25537i;
                                iVar.A(i10, k0Var7);
                                r0();
                                return 0;
                            }
                            k0Var5 = f9.c.f25539k;
                            Object t10 = iVar.t(i10, k0Var5);
                            k0Var6 = f9.c.f25539k;
                            if (t10 != k0Var6) {
                                iVar.x(i10, true);
                            }
                            return 5;
                        }
                    }
                    iVar.s(i10);
                    return 5;
                } else if (iVar.r(i10, w10, f9.c.f25532d)) {
                    return 1;
                }
            } else if (!C(j10) || z10) {
                if (z10) {
                    k0Var = f9.c.f25538j;
                    if (iVar.r(i10, null, k0Var)) {
                        iVar.x(i10, false);
                        return 4;
                    }
                } else if (obj == null) {
                    return 3;
                } else {
                    if (iVar.r(i10, null, obj)) {
                        return 2;
                    }
                }
            } else if (iVar.r(i10, null, f9.c.f25532d)) {
                return 1;
            }
        }
    }

    private final void Q0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f25497e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f25497e.compareAndSet(this, j11, j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable R() {
        Throwable Q = Q();
        return Q == null ? new m("Channel was closed") : Q;
    }

    private final void R0(long j10) {
        long j11;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f25496d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            long j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
            w10 = f9.c.w(j12, (int) (j11 >> 60));
        } while (!f25496d.compareAndSet(this, j11, w10));
    }

    private final void W(long j10) {
        boolean z10;
        if ((f25499g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
                if ((f25499g.get(this) & 4611686018427387904L) != 0) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
            } while (z10);
        }
    }

    static /* synthetic */ void X(b bVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        bVar.W(j10);
    }

    private final void Y() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25504l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f9.c.f25545q : f9.c.f25546r));
        if (obj == null) {
            return;
        }
        t8.l lVar = (t8.l) e0.a(obj, 1);
        ((t8.l) obj).invoke(Q());
    }

    private final boolean Z(i<E> iVar, int i10, long j10) {
        Object w10;
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        k0 k0Var4;
        k0 k0Var5;
        k0 k0Var6;
        k0 k0Var7;
        do {
            w10 = iVar.w(i10);
            if (w10 != null) {
                k0Var2 = f9.c.f25533e;
                if (w10 != k0Var2) {
                    if (w10 == f9.c.f25532d) {
                        return true;
                    }
                    k0Var3 = f9.c.f25538j;
                    if (w10 == k0Var3 || w10 == f9.c.z()) {
                        return false;
                    }
                    k0Var4 = f9.c.f25537i;
                    if (w10 == k0Var4) {
                        return false;
                    }
                    k0Var5 = f9.c.f25536h;
                    if (w10 == k0Var5) {
                        return false;
                    }
                    k0Var6 = f9.c.f25535g;
                    if (w10 == k0Var6) {
                        return true;
                    }
                    k0Var7 = f9.c.f25534f;
                    return w10 != k0Var7 && j10 == S();
                }
            }
            k0Var = f9.c.f25536h;
        } while (!iVar.r(i10, w10, k0Var));
        L();
        return false;
    }

    private final boolean a0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            I(j10 & 1152921504606846975L);
            if (z10 && V()) {
                return false;
            }
        } else if (i10 == 3) {
            H(j10 & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i10).toString());
        }
        return true;
    }

    private final boolean c0(long j10) {
        return a0(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d0(long j10) {
        return a0(j10, false);
    }

    private final boolean f0() {
        long P = P();
        return P == 0 || P == Long.MAX_VALUE;
    }

    private final long g0(i<E> iVar) {
        k0 k0Var;
        do {
            int i10 = f9.c.f25530b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (iVar.f26659c * f9.c.f25530b) + i10;
                    if (j10 >= S()) {
                        while (true) {
                            Object w10 = iVar.w(i10);
                            if (w10 != null) {
                                k0Var = f9.c.f25533e;
                                if (w10 != k0Var) {
                                    if (w10 == f9.c.f25532d) {
                                        return j10;
                                    }
                                }
                            }
                            if (iVar.r(i10, w10, f9.c.z())) {
                                iVar.p();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                } else {
                    iVar = (i) iVar.g();
                }
            }
        } while (iVar != null);
        return -1L;
    }

    private final void h0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f25496d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
            w10 = f9.c.w(1152921504606846975L & j10, 1);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    private final void i0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f25496d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            w10 = f9.c.w(1152921504606846975L & j10, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    private final void j0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f25496d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                w10 = f9.c.w(j10 & 1152921504606846975L, 2);
            } else if (i10 != 1) {
                return;
            } else {
                w10 = f9.c.w(j10 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    private final void k0(long j10, i<E> iVar) {
        boolean z10;
        i<E> iVar2;
        i<E> iVar3;
        while (iVar.f26659c < j10 && (iVar3 = (i) iVar.e()) != null) {
            iVar = iVar3;
        }
        while (true) {
            if (!iVar.h() || (iVar2 = (i) iVar.e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25502j;
                while (true) {
                    h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (h0Var.f26659c >= iVar.f26659c) {
                        break;
                    } else if (!iVar.q()) {
                        z10 = false;
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, h0Var, iVar)) {
                        if (h0Var.m()) {
                            h0Var.k();
                        }
                    } else if (iVar.m()) {
                        iVar.k();
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                iVar = iVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(d9.n<? super h<? extends E>> nVar) {
        o.a aVar = i8.o.f26626b;
        nVar.resumeWith(i8.o.b(h.b(h.f25553b.a(Q()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(d9.n<? super E> nVar) {
        o.a aVar = i8.o.f26626b;
        nVar.resumeWith(i8.o.b(i8.p.a(R())));
    }

    private final void o0(l9.j<?> jVar) {
        jVar.c(f9.c.z());
    }

    private final Object p0(E e8, m8.d<? super w> dVar) {
        m8.d b10;
        Object c10;
        Object c11;
        Throwable d10;
        b10 = n8.c.b(dVar);
        d9.o oVar = new d9.o(b10, 1);
        oVar.C();
        t8.l<E, w> lVar = this.f25506b;
        if (lVar != null && (d10 = c0.d(lVar, e8, null, 2, null)) != null) {
            i8.b.a(d10, T());
            o.a aVar = i8.o.f26626b;
            if (s0.d()) {
                d10 = j0.i(d10, oVar);
            }
            oVar.resumeWith(i8.o.b(i8.p.a(d10)));
        } else {
            Throwable T = T();
            o.a aVar2 = i8.o.f26626b;
            if (s0.d()) {
                T = j0.i(T, oVar);
            }
            oVar.resumeWith(i8.o.b(i8.p.a(T)));
        }
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        c11 = n8.d.c();
        return z10 == c11 ? z10 : w.f26638a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(E e8, d9.n<? super w> nVar) {
        t8.l<E, w> lVar = this.f25506b;
        if (lVar != null) {
            c0.b(lVar, e8, nVar.getContext());
        }
        Throwable T = T();
        if (s0.d() && (nVar instanceof kotlin.coroutines.jvm.internal.e)) {
            T = j0.i(T, (kotlin.coroutines.jvm.internal.e) nVar);
        }
        o.a aVar = i8.o.f26626b;
        nVar.resumeWith(i8.o.b(i8.p.a(T)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(d3 d3Var, i<E> iVar, int i10) {
        s0();
        d3Var.e(iVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(d3 d3Var, i<E> iVar, int i10) {
        d3Var.e(iVar, i10 + f9.c.f25530b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v0(Object obj, Object obj2) {
        return h.b(obj2 == f9.c.z() ? h.f25553b.a(Q()) : h.f25553b.c(obj2));
    }

    static /* synthetic */ <E> Object w0(b<E> bVar, m8.d<? super E> dVar) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        i<E> iVar = (i) f25501i.get(bVar);
        while (!bVar.b0()) {
            long andIncrement = f25497e.getAndIncrement(bVar);
            int i10 = f9.c.f25530b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (iVar.f26659c != j10) {
                i<E> N = bVar.N(j10, iVar);
                if (N == null) {
                    continue;
                } else {
                    iVar = N;
                }
            }
            Object M0 = bVar.M0(iVar, i11, andIncrement, null);
            k0Var = f9.c.f25541m;
            if (M0 != k0Var) {
                k0Var2 = f9.c.f25543o;
                if (M0 != k0Var2) {
                    k0Var3 = f9.c.f25542n;
                    if (M0 == k0Var3) {
                        return bVar.z0(iVar, i11, andIncrement, dVar);
                    }
                    iVar.b();
                    return M0;
                } else if (andIncrement < bVar.U()) {
                    iVar.b();
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw j0.j(bVar.R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <E> java.lang.Object x0(f9.b<E> r14, m8.d<? super f9.h<? extends E>> r15) {
        /*
            boolean r0 = r15 instanceof f9.b.f
            if (r0 == 0) goto L13
            r0 = r15
            f9.b$f r0 = (f9.b.f) r0
            int r1 = r0.f25521c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25521c = r1
            goto L18
        L13:
            f9.b$f r0 = new f9.b$f
            r0.<init>(r14, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.f25519a
            java.lang.Object r0 = n8.b.c()
            int r1 = r6.f25521c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            i8.p.b(r15)
            f9.h r15 = (f9.h) r15
            java.lang.Object r14 = r15.k()
            goto Lb6
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            i8.p.b(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = g()
            java.lang.Object r1 = r1.get(r14)
            f9.i r1 = (f9.i) r1
        L47:
            boolean r3 = r14.b0()
            if (r3 == 0) goto L59
            f9.h$b r15 = f9.h.f25553b
            java.lang.Throwable r14 = r14.Q()
            java.lang.Object r14 = r15.a(r14)
            goto Lb6
        L59:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = h()
            long r4 = r3.getAndIncrement(r14)
            int r3 = f9.c.f25530b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.f26659c
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L79
            f9.i r7 = b(r14, r7, r1)
            if (r7 != 0) goto L77
            goto L47
        L77:
            r13 = r7
            goto L7a
        L79:
            r13 = r1
        L7a:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = A(r7, r8, r9, r10, r12)
            i9.k0 r7 = f9.c.r()
            if (r1 == r7) goto Lb7
            i9.k0 r7 = f9.c.h()
            if (r1 != r7) goto L9c
            long r7 = r14.U()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L9a
            r13.b()
        L9a:
            r1 = r13
            goto L47
        L9c:
            i9.k0 r15 = f9.c.s()
            if (r1 != r15) goto Lad
            r6.f25521c = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.y0(r2, r3, r4, r6)
            if (r14 != r0) goto Lb6
            return r0
        Lad:
            r13.b()
            f9.h$b r14 = f9.h.f25553b
            java.lang.Object r14 = r14.c(r1)
        Lb6:
            return r14
        Lb7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.b.x0(f9.b, m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(f9.i<E> r11, int r12, long r13, m8.d<? super f9.h<? extends E>> r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.b.y0(f9.i, int, long, m8.d):java.lang.Object");
    }

    private final Object z0(i<E> iVar, int i10, long j10, m8.d<? super E> dVar) {
        m8.d b10;
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        k0 k0Var4;
        k0 k0Var5;
        Object c10;
        b10 = n8.c.b(dVar);
        d9.o b11 = d9.q.b(b10);
        try {
            Object M0 = M0(iVar, i10, j10, b11);
            k0Var = f9.c.f25541m;
            if (M0 == k0Var) {
                t0(b11, iVar, i10);
            } else {
                k0Var2 = f9.c.f25543o;
                t8.l<Throwable, w> lVar = null;
                lVar = null;
                if (M0 == k0Var2) {
                    if (j10 < U()) {
                        iVar.b();
                    }
                    i iVar2 = (i) f25501i.get(this);
                    while (true) {
                        if (b0()) {
                            n0(b11);
                            break;
                        }
                        long andIncrement = f25497e.getAndIncrement(this);
                        int i11 = f9.c.f25530b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (iVar2.f26659c != j11) {
                            i N = N(j11, iVar2);
                            if (N != null) {
                                iVar2 = N;
                            }
                        }
                        M0 = M0(iVar2, i12, andIncrement, b11);
                        k0Var3 = f9.c.f25541m;
                        if (M0 != k0Var3) {
                            k0Var4 = f9.c.f25543o;
                            if (M0 != k0Var4) {
                                k0Var5 = f9.c.f25542n;
                                if (M0 != k0Var5) {
                                    iVar2.b();
                                    t8.l<E, w> lVar2 = this.f25506b;
                                    if (lVar2 != null) {
                                        lVar = c0.a(lVar2, M0, b11.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < U()) {
                                iVar2.b();
                            }
                        } else {
                            d9.o oVar = b11 instanceof d3 ? b11 : null;
                            if (oVar != null) {
                                t0(oVar, iVar2, i12);
                            }
                        }
                    }
                } else {
                    iVar.b();
                    t8.l<E, w> lVar3 = this.f25506b;
                    if (lVar3 != null) {
                        lVar = c0.a(lVar3, M0, b11.getContext());
                    }
                }
                b11.d(M0, lVar);
            }
            Object z10 = b11.z();
            c10 = n8.d.c();
            if (z10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return z10;
        } catch (Throwable th) {
            b11.K();
            throw th;
        }
    }

    public boolean D(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return G(th, true);
    }

    protected boolean G(Throwable th, boolean z10) {
        k0 k0Var;
        if (z10) {
            h0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25503k;
        k0Var = f9.c.f25547s;
        boolean a10 = androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, k0Var, th);
        if (z10) {
            i0();
        } else {
            j0();
        }
        J();
        l0();
        if (a10) {
            Y();
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K(long j10) {
        k0 k0Var;
        t0 d10;
        if (s0.a() && !e0()) {
            throw new AssertionError();
        }
        i<E> iVar = (i) f25501i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f25497e;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f25505a + j11, P())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                int i10 = f9.c.f25530b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (iVar.f26659c != j12) {
                    i<E> N = N(j12, iVar);
                    if (N == null) {
                        continue;
                    } else {
                        iVar = N;
                    }
                }
                Object M0 = M0(iVar, i11, j11, null);
                k0Var = f9.c.f25543o;
                if (M0 == k0Var) {
                    if (j11 < U()) {
                        iVar.b();
                    }
                } else {
                    iVar.b();
                    t8.l<E, w> lVar = this.f25506b;
                    if (lVar != null && (d10 = c0.d(lVar, M0, null, 2, null)) != null) {
                        throw d10;
                    }
                }
            }
        }
    }

    protected final Throwable Q() {
        return (Throwable) f25503k.get(this);
    }

    public final long S() {
        return f25497e.get(this);
    }

    public final void S0(long j10) {
        int i10;
        long j11;
        long v10;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long v11;
        long j12;
        long v12;
        if (f0()) {
            return;
        }
        do {
        } while (P() <= j10);
        i10 = f9.c.f25531c;
        for (int i11 = 0; i11 < i10; i11++) {
            long P = P();
            if (P == (4611686018427387903L & f25499g.get(this)) && P == P()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f25499g;
        do {
            j11 = atomicLongFieldUpdater2.get(this);
            v10 = f9.c.v(j11 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, v10));
        while (true) {
            long P2 = P();
            atomicLongFieldUpdater = f25499g;
            long j13 = atomicLongFieldUpdater.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j13) != 0;
            if (P2 == j14 && P2 == P()) {
                break;
            } else if (!z10) {
                v11 = f9.c.v(j14, true);
                atomicLongFieldUpdater.compareAndSet(this, j13, v11);
            }
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
            v12 = f9.c.v(j12 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j12, v12));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable T() {
        Throwable Q = Q();
        return Q == null ? new n("Channel was closed") : Q;
    }

    public final long U() {
        return f25496d.get(this) & 1152921504606846975L;
    }

    public final boolean V() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25501i;
            i<E> iVar = (i) atomicReferenceFieldUpdater.get(this);
            long S = S();
            if (U() <= S) {
                return false;
            }
            int i10 = f9.c.f25530b;
            long j10 = S / i10;
            if (iVar.f26659c != j10 && (iVar = N(j10, iVar)) == null) {
                if (((i) atomicReferenceFieldUpdater.get(this)).f26659c < j10) {
                    return false;
                }
            } else {
                iVar.b();
                if (Z(iVar, (int) (S % i10), S)) {
                    return true;
                }
                f25497e.compareAndSet(this, S, S + 1);
            }
        }
    }

    @Override // f9.t
    public final void a(CancellationException cancellationException) {
        D(cancellationException);
    }

    public boolean b0() {
        return c0(f25496d.get(this));
    }

    @Override // f9.u
    public void c(t8.l<? super Throwable, w> lVar) {
        k0 k0Var;
        k0 k0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k0 k0Var3;
        k0 k0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f25504l;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, null, lVar)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            k0Var = f9.c.f25545q;
            if (obj != k0Var) {
                k0Var2 = f9.c.f25546r;
                if (obj == k0Var2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f25504l;
            k0Var3 = f9.c.f25545q;
            k0Var4 = f9.c.f25546r;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, k0Var3, k0Var4));
        lVar.invoke(Q());
    }

    @Override // f9.t
    public Object e(m8.d<? super E> dVar) {
        return w0(this, dVar);
    }

    protected boolean e0() {
        return false;
    }

    @Override // f9.u
    public Object i(E e8, m8.d<? super w> dVar) {
        return F0(this, e8, dVar);
    }

    @Override // f9.t
    public f9.f<E> iterator() {
        return new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
        return f9.h.f25553b.c(i8.w.f26638a);
     */
    @Override // f9.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f9.b.f25496d
            long r0 = r0.get(r14)
            boolean r0 = r14.H0(r0)
            if (r0 == 0) goto L13
            f9.h$b r15 = f9.h.f25553b
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            i9.k0 r8 = f9.c.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = j()
            java.lang.Object r0 = r0.get(r14)
            f9.i r0 = (f9.i) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = k()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = p(r14, r1)
            int r1 = f9.c.f25530b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f26659c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4e
            f9.i r1 = d(r14, r2, r0)
            if (r1 != 0) goto L4c
            if (r11 == 0) goto L21
            goto L8e
        L4c:
            r13 = r1
            goto L4f
        L4e:
            r13 = r0
        L4f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = B(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb0
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L89
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 4
            if (r0 == r1) goto L71
            r1 = 5
            if (r0 == r1) goto L6c
            goto L6f
        L6c:
            r13.b()
        L6f:
            r0 = r13
            goto L21
        L71:
            long r0 = r14.S()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8e
            r13.b()
            goto L8e
        L7d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L89:
            if (r11 == 0) goto L99
            r13.p()
        L8e:
            f9.h$b r15 = f9.h.f25553b
            java.lang.Throwable r0 = r14.T()
            java.lang.Object r15 = r15.a(r0)
            goto Lbb
        L99:
            boolean r15 = r8 instanceof d9.d3
            if (r15 == 0) goto La0
            d9.d3 r8 = (d9.d3) r8
            goto La1
        La0:
            r8 = 0
        La1:
            if (r8 == 0) goto La6
            w(r14, r8, r13, r12)
        La6:
            r13.p()
            f9.h$b r15 = f9.h.f25553b
            java.lang.Object r15 = r15.b()
            goto Lbb
        Lb0:
            r13.b()
        Lb3:
            f9.h$b r15 = f9.h.f25553b
            i8.w r0 = i8.w.f26638a
            java.lang.Object r15 = r15.c(r0)
        Lbb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.b.l(java.lang.Object):java.lang.Object");
    }

    protected void l0() {
    }

    @Override // f9.t
    public Object m(m8.d<? super h<? extends E>> dVar) {
        return x0(this, dVar);
    }

    @Override // f9.t
    public l9.f<h<E>> n() {
        c cVar = c.f25513a;
        kotlin.jvm.internal.n.d(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        d dVar = d.f25514a;
        kotlin.jvm.internal.n.d(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new l9.g(this, (t8.q) e0.a(cVar, 3), (t8.q) e0.a(dVar, 3), this.f25507c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f9.t
    public Object o() {
        k0 k0Var;
        i iVar;
        k0 k0Var2;
        k0 k0Var3;
        k0 k0Var4;
        long j10 = f25497e.get(this);
        long j11 = f25496d.get(this);
        if (c0(j11)) {
            return h.f25553b.a(Q());
        }
        if (j10 < (j11 & 1152921504606846975L)) {
            k0Var = f9.c.f25539k;
            i iVar2 = (i) f25501i.get(this);
            while (!b0()) {
                long andIncrement = f25497e.getAndIncrement(this);
                int i10 = f9.c.f25530b;
                long j12 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (iVar2.f26659c != j12) {
                    i N = N(j12, iVar2);
                    if (N == null) {
                        continue;
                    } else {
                        iVar = N;
                    }
                } else {
                    iVar = iVar2;
                }
                Object M0 = M0(iVar, i11, andIncrement, k0Var);
                k0Var2 = f9.c.f25541m;
                if (M0 != k0Var2) {
                    k0Var3 = f9.c.f25543o;
                    if (M0 != k0Var3) {
                        k0Var4 = f9.c.f25542n;
                        if (M0 != k0Var4) {
                            iVar.b();
                            return h.f25553b.c(M0);
                        }
                        throw new IllegalStateException("unexpected".toString());
                    }
                    if (andIncrement < U()) {
                        iVar.b();
                    }
                    iVar2 = iVar;
                } else {
                    d3 d3Var = k0Var instanceof d3 ? (d3) k0Var : null;
                    if (d3Var != null) {
                        t0(d3Var, iVar, i11);
                    }
                    S0(andIncrement);
                    iVar.p();
                    return h.f25553b.b();
                }
            }
            return h.f25553b.a(Q());
        }
        return h.f25553b.b();
    }

    @Override // f9.u
    public boolean q(Throwable th) {
        return G(th, false);
    }

    protected void r0() {
    }

    @Override // f9.u
    public boolean s() {
        return d0(f25496d.get(this));
    }

    protected void s0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01df, code lost:
        r3 = (f9.i) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e6, code lost:
        if (r3 != null) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01df A[EDGE_INSN: B:112:0x01df->B:94:0x01df ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.b.toString():java.lang.String");
    }
}
