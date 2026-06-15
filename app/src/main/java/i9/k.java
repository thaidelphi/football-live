package i9;

import d9.c1;
import d9.k1;
import d9.w2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: DispatchedContinuation.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class k<T> extends c1<T> implements kotlin.coroutines.jvm.internal.e, m8.d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f26664h = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d  reason: collision with root package name */
    public final d9.j0 f26665d;

    /* renamed from: e  reason: collision with root package name */
    public final m8.d<T> f26666e;

    /* renamed from: f  reason: collision with root package name */
    public Object f26667f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f26668g;

    /* JADX WARN: Multi-variable type inference failed */
    public k(d9.j0 j0Var, m8.d<? super T> dVar) {
        super(-1);
        this.f26665d = j0Var;
        this.f26666e = dVar;
        this.f26667f = l.a();
        this.f26668g = o0.b(getContext());
    }

    private final d9.o<?> q() {
        Object obj = f26664h.get(this);
        if (obj instanceof d9.o) {
            return (d9.o) obj;
        }
        return null;
    }

    @Override // d9.c1
    public void a(Object obj, Throwable th) {
        if (obj instanceof d9.c0) {
            ((d9.c0) obj).f24418b.invoke(th);
        }
    }

    @Override // d9.c1
    public m8.d<T> c() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        m8.d<T> dVar = this.f26666e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // m8.d
    public m8.g getContext() {
        return this.f26666e.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // d9.c1
    public Object l() {
        Object obj = this.f26667f;
        if (d9.s0.a()) {
            if (!(obj != l.a())) {
                throw new AssertionError();
            }
        }
        this.f26667f = l.a();
        return obj;
    }

    public final void m() {
        do {
        } while (f26664h.get(this) == l.f26671b);
    }

    public final d9.o<T> n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26664h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f26664h.set(this, l.f26671b);
                return null;
            } else if (obj instanceof d9.o) {
                if (androidx.concurrent.futures.b.a(f26664h, this, obj, l.f26671b)) {
                    return (d9.o) obj;
                }
            } else if (obj != l.f26671b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void o(m8.g gVar, T t10) {
        this.f26667f = t10;
        this.f24419c = 1;
        this.f26665d.H0(gVar, this);
    }

    @Override // m8.d
    public void resumeWith(Object obj) {
        m8.g context = this.f26666e.getContext();
        Object d10 = d9.f0.d(obj, null, 1, null);
        if (this.f26665d.I0(context)) {
            this.f26667f = d10;
            this.f24419c = 0;
            this.f26665d.G0(context, this);
            return;
        }
        d9.s0.a();
        k1 b10 = w2.f24526a.b();
        if (b10.R0()) {
            this.f26667f = d10;
            this.f24419c = 0;
            b10.N0(this);
            return;
        }
        b10.P0(true);
        try {
            m8.g context2 = getContext();
            Object c10 = o0.c(context2, this.f26668g);
            this.f26666e.resumeWith(obj);
            i8.w wVar = i8.w.f26638a;
            o0.a(context2, c10);
            do {
            } while (b10.U0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean s() {
        return f26664h.get(this) != null;
    }

    public final boolean t(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26664h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            k0 k0Var = l.f26671b;
            if (kotlin.jvm.internal.n.a(obj, k0Var)) {
                if (androidx.concurrent.futures.b.a(f26664h, this, k0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (androidx.concurrent.futures.b.a(f26664h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f26665d + ", " + d9.t0.c(this.f26666e) + ']';
    }

    public final void v() {
        m();
        d9.o<?> q10 = q();
        if (q10 != null) {
            q10.t();
        }
    }

    public final Throwable w(d9.n<?> nVar) {
        k0 k0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26664h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            k0Var = l.f26671b;
            if (obj != k0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f26664h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f26664h, this, k0Var, nVar));
        return null;
    }
}
