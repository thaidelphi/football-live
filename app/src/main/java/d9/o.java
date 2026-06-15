package d9;

import d9.z1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class o<T> extends c1<T> implements n<T>, kotlin.coroutines.jvm.internal.e, d3 {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f24493f = AtomicIntegerFieldUpdater.newUpdater(o.class, "_decisionAndIndex");

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f24494g = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state");

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f24495h = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d  reason: collision with root package name */
    private final m8.d<T> f24496d;

    /* renamed from: e  reason: collision with root package name */
    private final m8.g f24497e;

    /* JADX WARN: Multi-variable type inference failed */
    public o(m8.d<? super T> dVar, int i10) {
        super(i10);
        this.f24496d = dVar;
        if (s0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        this.f24497e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = d.f24422a;
    }

    private final String B() {
        Object A = A();
        return A instanceof o2 ? "Active" : A instanceof r ? "Cancelled" : "Completed";
    }

    private final g1 D() {
        z1 z1Var = (z1) getContext().get(z1.f24533t0);
        if (z1Var == null) {
            return null;
        }
        g1 d10 = z1.a.d(z1Var, true, false, new s(this), 2, null);
        androidx.concurrent.futures.b.a(f24495h, this, null, d10);
        return d10;
    }

    private final void E(Object obj) {
        if (s0.a()) {
            if (!((obj instanceof l) || (obj instanceof i9.h0))) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24494g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d) {
                if (androidx.concurrent.futures.b.a(f24494g, this, obj2, obj)) {
                    return;
                }
            } else {
                if (obj2 instanceof l ? true : obj2 instanceof i9.h0) {
                    H(obj, obj2);
                } else {
                    boolean z10 = obj2 instanceof b0;
                    if (z10) {
                        b0 b0Var = (b0) obj2;
                        if (!b0Var.b()) {
                            H(obj, obj2);
                        }
                        if (obj2 instanceof r) {
                            if (!z10) {
                                b0Var = null;
                            }
                            Throwable th = b0Var != null ? b0Var.f24413a : null;
                            if (obj instanceof l) {
                                n((l) obj, th);
                                return;
                            }
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            q((i9.h0) obj, th);
                            return;
                        }
                        return;
                    } else if (obj2 instanceof a0) {
                        a0 a0Var = (a0) obj2;
                        if (a0Var.f24406b != null) {
                            H(obj, obj2);
                        }
                        if (obj instanceof i9.h0) {
                            return;
                        }
                        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        l lVar = (l) obj;
                        if (a0Var.c()) {
                            n(lVar, a0Var.f24409e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.b.a(f24494g, this, obj2, a0.b(a0Var, null, lVar, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else if (obj instanceof i9.h0) {
                        return;
                    } else {
                        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.b.a(f24494g, this, obj2, new a0(obj2, (l) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private final boolean F() {
        if (d1.c(this.f24419c)) {
            m8.d<T> dVar = this.f24496d;
            kotlin.jvm.internal.n.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((i9.k) dVar).s()) {
                return true;
            }
        }
        return false;
    }

    private final l G(t8.l<? super Throwable, i8.w> lVar) {
        return lVar instanceof l ? (l) lVar : new w1(lVar);
    }

    private final void H(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void M(Object obj, int i10, t8.l<? super Throwable, i8.w> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24494g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof o2) {
            } else {
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.c()) {
                        if (lVar != null) {
                            o(lVar, rVar.f24413a);
                            return;
                        }
                        return;
                    }
                }
                m(obj);
                throw new i8.d();
            }
        } while (!androidx.concurrent.futures.b.a(f24494g, this, obj2, O((o2) obj2, obj, i10, lVar, null)));
        v();
        w(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void N(o oVar, Object obj, int i10, t8.l lVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        oVar.M(obj, i10, lVar);
    }

    private final Object O(o2 o2Var, Object obj, int i10, t8.l<? super Throwable, i8.w> lVar, Object obj2) {
        if (obj instanceof b0) {
            if (s0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (s0.a()) {
                if (lVar == null) {
                    return obj;
                }
                throw new AssertionError();
            }
            return obj;
        } else if (d1.b(i10) || obj2 != null) {
            if (lVar == null && !(o2Var instanceof l) && obj2 == null) {
                return obj;
            }
            return new a0(obj, o2Var instanceof l ? (l) o2Var : null, lVar, obj2, null, 16, null);
        } else {
            return obj;
        }
    }

    private final boolean P() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24493f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f24493f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final i9.k0 Q(Object obj, Object obj2, t8.l<? super Throwable, i8.w> lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24494g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof o2) {
            } else if (!(obj3 instanceof a0) || obj2 == null) {
                return null;
            } else {
                a0 a0Var = (a0) obj3;
                if (a0Var.f24408d == obj2) {
                    if (!s0.a() || kotlin.jvm.internal.n.a(a0Var.f24405a, obj)) {
                        return p.f24500a;
                    }
                    throw new AssertionError();
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f24494g, this, obj3, O((o2) obj3, obj, this.f24419c, lVar, obj2)));
        v();
        return p.f24500a;
    }

    private final boolean R() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24493f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f24493f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void m(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void q(i9.h0<?> h0Var, Throwable th) {
        int i10 = f24493f.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                h0Var.o(i10, th, getContext());
                return;
            } catch (Throwable th2) {
                m8.g context = getContext();
                l0.a(context, new e0("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    private final boolean s(Throwable th) {
        if (F()) {
            m8.d<T> dVar = this.f24496d;
            kotlin.jvm.internal.n.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            return ((i9.k) dVar).t(th);
        }
        return false;
    }

    private final void v() {
        if (F()) {
            return;
        }
        t();
    }

    private final void w(int i10) {
        if (P()) {
            return;
        }
        d1.a(this, i10);
    }

    private final g1 y() {
        return (g1) f24495h.get(this);
    }

    public final Object A() {
        return f24494g.get(this);
    }

    public void C() {
        g1 D = D();
        if (D != null && b()) {
            D.d();
            f24495h.set(this, n2.f24492a);
        }
    }

    protected String I() {
        return "CancellableContinuation";
    }

    public final void J(Throwable th) {
        if (s(th)) {
            return;
        }
        h(th);
        v();
    }

    public final void K() {
        Throwable w10;
        m8.d<T> dVar = this.f24496d;
        i9.k kVar = dVar instanceof i9.k ? (i9.k) dVar : null;
        if (kVar == null || (w10 = kVar.w(this)) == null) {
            return;
        }
        t();
        h(w10);
    }

    public final boolean L() {
        if (s0.a()) {
            if (!(this.f24419c == 2)) {
                throw new AssertionError();
            }
        }
        if (s0.a()) {
            if (!(y() != n2.f24492a)) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24494g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (!s0.a() || (!(obj instanceof o2))) {
            if ((obj instanceof a0) && ((a0) obj).f24408d != null) {
                t();
                return false;
            }
            f24493f.set(this, 536870911);
            atomicReferenceFieldUpdater.set(this, d.f24422a);
            return true;
        }
        throw new AssertionError();
    }

    @Override // d9.c1
    public void a(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24494g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof o2)) {
                if (obj2 instanceof b0) {
                    return;
                }
                if (obj2 instanceof a0) {
                    a0 a0Var = (a0) obj2;
                    if (!a0Var.c()) {
                        if (androidx.concurrent.futures.b.a(f24494g, this, obj2, a0.b(a0Var, null, null, null, null, th, 15, null))) {
                            a0Var.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (androidx.concurrent.futures.b.a(f24494g, this, obj2, new a0(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // d9.n
    public boolean b() {
        return !(A() instanceof o2);
    }

    @Override // d9.c1
    public final m8.d<T> c() {
        return this.f24496d;
    }

    @Override // d9.n
    public void d(T t10, t8.l<? super Throwable, i8.w> lVar) {
        M(t10, this.f24419c, lVar);
    }

    @Override // d9.d3
    public void e(i9.h0<?> h0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24493f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        E(h0Var);
    }

    @Override // d9.n
    public Object f(Throwable th) {
        return Q(new b0(th, false, 2, null), null, null);
    }

    @Override // d9.n
    public void g(j0 j0Var, T t10) {
        m8.d<T> dVar = this.f24496d;
        i9.k kVar = dVar instanceof i9.k ? (i9.k) dVar : null;
        N(this, t10, (kVar != null ? kVar.f26665d : null) == j0Var ? 4 : this.f24419c, null, 4, null);
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        m8.d<T> dVar = this.f24496d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // m8.d
    public m8.g getContext() {
        return this.f24497e;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // d9.n
    public boolean h(Throwable th) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24494g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (!(obj instanceof o2)) {
                return false;
            }
            if ((obj instanceof l) || (obj instanceof i9.h0)) {
                z10 = true;
            }
        } while (!androidx.concurrent.futures.b.a(f24494g, this, obj, new r(this, th, z10)));
        o2 o2Var = (o2) obj;
        if (o2Var instanceof l) {
            n((l) obj, th);
        } else if (o2Var instanceof i9.h0) {
            q((i9.h0) obj, th);
        }
        v();
        w(this.f24419c);
        return true;
    }

    @Override // d9.c1
    public Throwable i(Object obj) {
        Throwable i10 = super.i(obj);
        if (i10 != null) {
            m8.d<T> dVar = this.f24496d;
            return (s0.d() && (dVar instanceof kotlin.coroutines.jvm.internal.e)) ? i9.j0.a(i10, (kotlin.coroutines.jvm.internal.e) dVar) : i10;
        }
        return null;
    }

    @Override // d9.n
    public boolean isActive() {
        return A() instanceof o2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d9.c1
    public <T> T j(Object obj) {
        return obj instanceof a0 ? (T) ((a0) obj).f24405a : obj;
    }

    @Override // d9.c1
    public Object l() {
        return A();
    }

    public final void n(l lVar, Throwable th) {
        try {
            lVar.g(th);
        } catch (Throwable th2) {
            m8.g context = getContext();
            l0.a(context, new e0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(t8.l<? super Throwable, i8.w> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            m8.g context = getContext();
            l0.a(context, new e0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // d9.n
    public Object p(T t10, Object obj, t8.l<? super Throwable, i8.w> lVar) {
        return Q(t10, obj, lVar);
    }

    @Override // d9.n
    public void r(t8.l<? super Throwable, i8.w> lVar) {
        E(G(lVar));
    }

    @Override // m8.d
    public void resumeWith(Object obj) {
        N(this, f0.b(obj, this), this.f24419c, null, 4, null);
    }

    public final void t() {
        g1 y10 = y();
        if (y10 == null) {
            return;
        }
        y10.d();
        f24495h.set(this, n2.f24492a);
    }

    public String toString() {
        return I() + '(' + t0.c(this.f24496d) + "){" + B() + "}@" + t0.b(this);
    }

    @Override // d9.n
    public void u(Object obj) {
        if (s0.a()) {
            if (!(obj == p.f24500a)) {
                throw new AssertionError();
            }
        }
        w(this.f24419c);
    }

    public Throwable x(z1 z1Var) {
        return z1Var.t();
    }

    public final Object z() {
        z1 z1Var;
        Object c10;
        boolean F = F();
        if (R()) {
            if (y() == null) {
                D();
            }
            if (F) {
                K();
            }
            c10 = n8.d.c();
            return c10;
        }
        if (F) {
            K();
        }
        Object A = A();
        if (A instanceof b0) {
            Throwable th = ((b0) A).f24413a;
            if (s0.d()) {
                throw i9.j0.a(th, this);
            }
            throw th;
        } else if (d1.b(this.f24419c) && (z1Var = (z1) getContext().get(z1.f24533t0)) != null && !z1Var.isActive()) {
            CancellationException t10 = z1Var.t();
            a(A, t10);
            if (s0.d()) {
                throw i9.j0.a(t10, this);
            }
            throw t10;
        } else {
            return j(A);
        }
    }
}
