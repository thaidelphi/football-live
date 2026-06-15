package d9;

import d9.z1;
import i9.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m8.g;
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class g2 implements z1, v, p2 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f24441a = AtomicReferenceFieldUpdater.newUpdater(g2.class, Object.class, "_state");

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f24442b = AtomicReferenceFieldUpdater.newUpdater(g2.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> extends o<T> {

        /* renamed from: i  reason: collision with root package name */
        private final g2 f24443i;

        public a(m8.d<? super T> dVar, g2 g2Var) {
            super(dVar, 1);
            this.f24443i = g2Var;
        }

        @Override // d9.o
        protected String I() {
            return "AwaitContinuation";
        }

        @Override // d9.o
        public Throwable x(z1 z1Var) {
            Throwable e8;
            Object d02 = this.f24443i.d0();
            return (!(d02 instanceof c) || (e8 = ((c) d02).e()) == null) ? d02 instanceof b0 ? ((b0) d02).f24413a : z1Var.t() : e8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b extends f2 {

        /* renamed from: e  reason: collision with root package name */
        private final g2 f24444e;

        /* renamed from: f  reason: collision with root package name */
        private final c f24445f;

        /* renamed from: g  reason: collision with root package name */
        private final u f24446g;

        /* renamed from: h  reason: collision with root package name */
        private final Object f24447h;

        public b(g2 g2Var, c cVar, u uVar, Object obj) {
            this.f24444e = g2Var;
            this.f24445f = cVar;
            this.f24446g = uVar;
            this.f24447h = obj;
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
            r(th);
            return i8.w.f26638a;
        }

        @Override // d9.d0
        public void r(Throwable th) {
            this.f24444e.R(this.f24445f, this.f24446g, this.f24447h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c implements u1 {

        /* renamed from: b  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f24448b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: c  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f24449c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: d  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f24450d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: a  reason: collision with root package name */
        private final l2 f24451a;

        public c(l2 l2Var, boolean z10, Throwable th) {
            this.f24451a = l2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return f24450d.get(this);
        }

        private final void k(Object obj) {
            f24450d.set(this, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Throwable th) {
            Throwable e8 = e();
            if (e8 == null) {
                l(th);
            } else if (th == e8) {
            } else {
                Object d10 = d();
                if (d10 == null) {
                    k(th);
                } else if (d10 instanceof Throwable) {
                    if (th == d10) {
                        return;
                    }
                    ArrayList<Throwable> c10 = c();
                    c10.add(d10);
                    c10.add(th);
                    k(c10);
                } else if (d10 instanceof ArrayList) {
                    ((ArrayList) d10).add(th);
                } else {
                    throw new IllegalStateException(("State is " + d10).toString());
                }
            }
        }

        @Override // d9.u1
        public l2 b() {
            return this.f24451a;
        }

        public final Throwable e() {
            return (Throwable) f24449c.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        public final boolean g() {
            return f24448b.get(this) != 0;
        }

        public final boolean h() {
            i9.k0 k0Var;
            Object d10 = d();
            k0Var = h2.f24460e;
            return d10 == k0Var;
        }

        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayList;
            i9.k0 k0Var;
            Object d10 = d();
            if (d10 == null) {
                arrayList = c();
            } else if (d10 instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(d10);
                arrayList = c10;
            } else if (!(d10 instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + d10).toString());
            } else {
                arrayList = (ArrayList) d10;
            }
            Throwable e8 = e();
            if (e8 != null) {
                arrayList.add(0, e8);
            }
            if (th != null && !kotlin.jvm.internal.n.a(th, e8)) {
                arrayList.add(th);
            }
            k0Var = h2.f24460e;
            k(k0Var);
            return arrayList;
        }

        @Override // d9.u1
        public boolean isActive() {
            return e() == null;
        }

        public final void j(boolean z10) {
            f24448b.set(this, z10 ? 1 : 0);
        }

        public final void l(Throwable th) {
            f24449c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + b() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class d extends v.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g2 f24452d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f24453e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i9.v vVar, g2 g2Var, Object obj) {
            super(vVar);
            this.f24452d = g2Var;
            this.f24453e = obj;
        }

        @Override // i9.b
        /* renamed from: f */
        public Object d(i9.v vVar) {
            if (this.f24452d.d0() == this.f24453e) {
                return null;
            }
            return i9.u.a();
        }
    }

    public g2(boolean z10) {
        this._state = z10 ? h2.f24462g : h2.f24461f;
    }

    private final void A(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable l10 = !s0.d() ? th : i9.j0.l(th);
        for (Throwable th2 : list) {
            if (s0.d()) {
                th2 = i9.j0.l(th2);
            }
            if (th2 != th && th2 != l10 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                i8.b.a(th, th2);
            }
        }
    }

    private final void A0(f2 f2Var) {
        f2Var.f(new l2());
        androidx.concurrent.futures.b.a(f24441a, this, f2Var, f2Var.k());
    }

    private final Object D(m8.d<Object> dVar) {
        m8.d b10;
        Object c10;
        b10 = n8.c.b(dVar);
        a aVar = new a(b10, this);
        aVar.C();
        q.a(aVar, K(new q2(aVar)));
        Object z10 = aVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z10;
    }

    private final int F0(Object obj) {
        j1 j1Var;
        if (obj instanceof j1) {
            if (((j1) obj).isActive()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24441a;
            j1Var = h2.f24462g;
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, j1Var)) {
                w0();
                return 1;
            }
            return -1;
        } else if (obj instanceof t1) {
            if (androidx.concurrent.futures.b.a(f24441a, this, obj, ((t1) obj).b())) {
                w0();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    private final String G0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof u1 ? ((u1) obj).isActive() ? "Active" : "New" : obj instanceof b0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException I0(g2 g2Var, Throwable th, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return g2Var.H0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean K0(u1 u1Var, Object obj) {
        if (s0.a()) {
            if (!((u1Var instanceof j1) || (u1Var instanceof f2))) {
                throw new AssertionError();
            }
        }
        if (!s0.a() || (!(obj instanceof b0))) {
            if (androidx.concurrent.futures.b.a(f24441a, this, u1Var, h2.g(obj))) {
                u0(null);
                v0(obj);
                Q(u1Var, obj);
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    private final boolean L0(u1 u1Var, Throwable th) {
        if (!s0.a() || (!(u1Var instanceof c))) {
            if (!s0.a() || u1Var.isActive()) {
                l2 b02 = b0(u1Var);
                if (b02 == null) {
                    return false;
                }
                if (androidx.concurrent.futures.b.a(f24441a, this, u1Var, new c(b02, false, th))) {
                    s0(b02, th);
                    return true;
                }
                return false;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final Object M(Object obj) {
        i9.k0 k0Var;
        Object M0;
        i9.k0 k0Var2;
        do {
            Object d02 = d0();
            if (!(d02 instanceof u1) || ((d02 instanceof c) && ((c) d02).g())) {
                k0Var = h2.f24456a;
                return k0Var;
            }
            M0 = M0(d02, new b0(T(obj), false, 2, null));
            k0Var2 = h2.f24458c;
        } while (M0 == k0Var2);
        return M0;
    }

    private final Object M0(Object obj, Object obj2) {
        i9.k0 k0Var;
        i9.k0 k0Var2;
        if (!(obj instanceof u1)) {
            k0Var2 = h2.f24456a;
            return k0Var2;
        } else if (((obj instanceof j1) || (obj instanceof f2)) && !(obj instanceof u) && !(obj2 instanceof b0)) {
            if (K0((u1) obj, obj2)) {
                return obj2;
            }
            k0Var = h2.f24458c;
            return k0Var;
        } else {
            return N0((u1) obj, obj2);
        }
    }

    private final boolean N(Throwable th) {
        if (h0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        t c02 = c0();
        return (c02 == null || c02 == n2.f24492a) ? z10 : c02.a(th) || z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object N0(u1 u1Var, Object obj) {
        i9.k0 k0Var;
        i9.k0 k0Var2;
        i9.k0 k0Var3;
        l2 b02 = b0(u1Var);
        if (b02 == null) {
            k0Var3 = h2.f24458c;
            return k0Var3;
        }
        c cVar = u1Var instanceof c ? (c) u1Var : null;
        if (cVar == null) {
            cVar = new c(b02, false, null);
        }
        kotlin.jvm.internal.a0 a0Var = new kotlin.jvm.internal.a0();
        synchronized (cVar) {
            if (cVar.g()) {
                k0Var2 = h2.f24456a;
                return k0Var2;
            }
            cVar.j(true);
            if (cVar != u1Var && !androidx.concurrent.futures.b.a(f24441a, this, u1Var, cVar)) {
                k0Var = h2.f24458c;
                return k0Var;
            }
            if (s0.a() && !(!cVar.h())) {
                throw new AssertionError();
            }
            boolean f10 = cVar.f();
            b0 b0Var = obj instanceof b0 ? (b0) obj : null;
            if (b0Var != null) {
                cVar.a(b0Var.f24413a);
            }
            ?? e8 = Boolean.valueOf(f10 ? false : true).booleanValue() ? cVar.e() : 0;
            a0Var.f27364a = e8;
            i8.w wVar = i8.w.f26638a;
            if (e8 != 0) {
                s0(b02, e8);
            }
            u V = V(u1Var);
            if (V != null && O0(cVar, V, obj)) {
                return h2.f24457b;
            }
            return U(cVar, obj);
        }
    }

    private final boolean O0(c cVar, u uVar, Object obj) {
        while (z1.a.d(uVar.f24519e, false, false, new b(this, cVar, uVar, obj), 1, null) == n2.f24492a) {
            uVar = r0(uVar);
            if (uVar == null) {
                return false;
            }
        }
        return true;
    }

    private final void Q(u1 u1Var, Object obj) {
        t c02 = c0();
        if (c02 != null) {
            c02.d();
            E0(n2.f24492a);
        }
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        Throwable th = b0Var != null ? b0Var.f24413a : null;
        if (u1Var instanceof f2) {
            try {
                ((f2) u1Var).r(th);
                return;
            } catch (Throwable th2) {
                f0(new e0("Exception in completion handler " + u1Var + " for " + this, th2));
                return;
            }
        }
        l2 b10 = u1Var.b();
        if (b10 != null) {
            t0(b10, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(c cVar, u uVar, Object obj) {
        if (s0.a()) {
            if (!(d0() == cVar)) {
                throw new AssertionError();
            }
        }
        u r02 = r0(uVar);
        if (r02 == null || !O0(cVar, r02, obj)) {
            B(U(cVar, obj));
        }
    }

    private final Throwable T(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new a2(O(), null, this) : th;
        }
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((p2) obj).S();
    }

    private final Object U(c cVar, Object obj) {
        boolean f10;
        Throwable Y;
        boolean z10 = true;
        if (s0.a()) {
            if (!(d0() == cVar)) {
                throw new AssertionError();
            }
        }
        if (!s0.a() || (!cVar.h())) {
            if (!s0.a() || cVar.g()) {
                b0 b0Var = obj instanceof b0 ? (b0) obj : null;
                Throwable th = b0Var != null ? b0Var.f24413a : null;
                synchronized (cVar) {
                    f10 = cVar.f();
                    List<Throwable> i10 = cVar.i(th);
                    Y = Y(cVar, i10);
                    if (Y != null) {
                        A(Y, i10);
                    }
                }
                if (Y != null && Y != th) {
                    obj = new b0(Y, false, 2, null);
                }
                if (Y != null) {
                    if (!N(Y) && !e0(Y)) {
                        z10 = false;
                    }
                    if (z10) {
                        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                        ((b0) obj).b();
                    }
                }
                if (!f10) {
                    u0(Y);
                }
                v0(obj);
                boolean a10 = androidx.concurrent.futures.b.a(f24441a, this, cVar, h2.g(obj));
                if (!s0.a() || a10) {
                    Q(cVar, obj);
                    return obj;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final u V(u1 u1Var) {
        u uVar = u1Var instanceof u ? (u) u1Var : null;
        if (uVar == null) {
            l2 b10 = u1Var.b();
            if (b10 != null) {
                return r0(b10);
            }
            return null;
        }
        return uVar;
    }

    private final Throwable X(Object obj) {
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var != null) {
            return b0Var.f24413a;
        }
        return null;
    }

    private final Throwable Y(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z10;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new a2(O(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof x2) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof x2)) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final l2 b0(u1 u1Var) {
        l2 b10 = u1Var.b();
        if (b10 == null) {
            if (u1Var instanceof j1) {
                return new l2();
            }
            if (u1Var instanceof f2) {
                A0((f2) u1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + u1Var).toString());
        }
        return b10;
    }

    private final boolean i0() {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof u1)) {
                return false;
            }
        } while (F0(d02) < 0);
        return true;
    }

    private final Object j0(m8.d<? super i8.w> dVar) {
        m8.d b10;
        Object c10;
        Object c11;
        b10 = n8.c.b(dVar);
        o oVar = new o(b10, 1);
        oVar.C();
        q.a(oVar, K(new r2(oVar)));
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        c11 = n8.d.c();
        return z10 == c11 ? z10 : i8.w.f26638a;
    }

    private final Object k0(Object obj) {
        i9.k0 k0Var;
        i9.k0 k0Var2;
        i9.k0 k0Var3;
        i9.k0 k0Var4;
        i9.k0 k0Var5;
        i9.k0 k0Var6;
        Throwable th = null;
        while (true) {
            Object d02 = d0();
            if (d02 instanceof c) {
                synchronized (d02) {
                    if (((c) d02).h()) {
                        k0Var2 = h2.f24459d;
                        return k0Var2;
                    }
                    boolean f10 = ((c) d02).f();
                    if (obj != null || !f10) {
                        if (th == null) {
                            th = T(obj);
                        }
                        ((c) d02).a(th);
                    }
                    Throwable e8 = f10 ^ true ? ((c) d02).e() : null;
                    if (e8 != null) {
                        s0(((c) d02).b(), e8);
                    }
                    k0Var = h2.f24456a;
                    return k0Var;
                }
            } else if (!(d02 instanceof u1)) {
                k0Var3 = h2.f24459d;
                return k0Var3;
            } else {
                if (th == null) {
                    th = T(obj);
                }
                u1 u1Var = (u1) d02;
                if (u1Var.isActive()) {
                    if (L0(u1Var, th)) {
                        k0Var4 = h2.f24456a;
                        return k0Var4;
                    }
                } else {
                    Object M0 = M0(d02, new b0(th, false, 2, null));
                    k0Var5 = h2.f24456a;
                    if (M0 != k0Var5) {
                        k0Var6 = h2.f24458c;
                        if (M0 != k0Var6) {
                            return M0;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + d02).toString());
                    }
                }
            }
        }
    }

    private final f2 p0(t8.l<? super Throwable, i8.w> lVar, boolean z10) {
        f2 f2Var;
        if (z10) {
            f2Var = lVar instanceof b2 ? (b2) lVar : null;
            if (f2Var == null) {
                f2Var = new x1(lVar);
            }
        } else {
            f2Var = lVar instanceof f2 ? (f2) lVar : null;
            if (f2Var != null) {
                if (s0.a() && !(!(f2Var instanceof b2))) {
                    throw new AssertionError();
                }
            } else {
                f2Var = new y1(lVar);
            }
        }
        f2Var.t(this);
        return f2Var;
    }

    private final u r0(i9.v vVar) {
        while (vVar.m()) {
            vVar = vVar.l();
        }
        while (true) {
            vVar = vVar.k();
            if (!vVar.m()) {
                if (vVar instanceof u) {
                    return (u) vVar;
                }
                if (vVar instanceof l2) {
                    return null;
                }
            }
        }
    }

    private final void s0(l2 l2Var, Throwable th) {
        u0(th);
        Object j10 = l2Var.j();
        kotlin.jvm.internal.n.d(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        e0 e0Var = null;
        for (i9.v vVar = (i9.v) j10; !kotlin.jvm.internal.n.a(vVar, l2Var); vVar = vVar.k()) {
            if (vVar instanceof b2) {
                f2 f2Var = (f2) vVar;
                try {
                    f2Var.r(th);
                } catch (Throwable th2) {
                    if (e0Var != null) {
                        i8.b.a(e0Var, th2);
                    } else {
                        e0Var = new e0("Exception in completion handler " + f2Var + " for " + this, th2);
                        i8.w wVar = i8.w.f26638a;
                    }
                }
            }
        }
        if (e0Var != null) {
            f0(e0Var);
        }
        N(th);
    }

    private final void t0(l2 l2Var, Throwable th) {
        Object j10 = l2Var.j();
        kotlin.jvm.internal.n.d(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        e0 e0Var = null;
        for (i9.v vVar = (i9.v) j10; !kotlin.jvm.internal.n.a(vVar, l2Var); vVar = vVar.k()) {
            if (vVar instanceof f2) {
                f2 f2Var = (f2) vVar;
                try {
                    f2Var.r(th);
                } catch (Throwable th2) {
                    if (e0Var != null) {
                        i8.b.a(e0Var, th2);
                    } else {
                        e0Var = new e0("Exception in completion handler " + f2Var + " for " + this, th2);
                        i8.w wVar = i8.w.f26638a;
                    }
                }
            }
        }
        if (e0Var != null) {
            f0(e0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [d9.t1] */
    private final void x0(j1 j1Var) {
        l2 l2Var = new l2();
        if (!j1Var.isActive()) {
            l2Var = new t1(l2Var);
        }
        androidx.concurrent.futures.b.a(f24441a, this, j1Var, l2Var);
    }

    private final boolean y(Object obj, l2 l2Var, f2 f2Var) {
        int q10;
        d dVar = new d(f2Var, this, obj);
        do {
            q10 = l2Var.l().q(f2Var, l2Var, dVar);
            if (q10 == 1) {
                return true;
            }
        } while (q10 != 2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B(Object obj) {
    }

    public final void B0(f2 f2Var) {
        Object d02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1 j1Var;
        do {
            d02 = d0();
            if (!(d02 instanceof f2)) {
                if (!(d02 instanceof u1) || ((u1) d02).b() == null) {
                    return;
                }
                f2Var.n();
                return;
            } else if (d02 != f2Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f24441a;
                j1Var = h2.f24462g;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d02, j1Var));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object C(m8.d<Object> dVar) {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof u1)) {
                if (d02 instanceof b0) {
                    Throwable th = ((b0) d02).f24413a;
                    if (s0.d()) {
                        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
                            throw i9.j0.a(th, (kotlin.coroutines.jvm.internal.e) dVar);
                        }
                        throw th;
                    }
                    throw th;
                }
                return h2.h(d02);
            }
        } while (F0(d02) < 0);
        return D(dVar);
    }

    @Override // d9.z1
    public final t E(v vVar) {
        g1 d10 = z1.a.d(this, true, false, new u(vVar), 2, null);
        kotlin.jvm.internal.n.d(d10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (t) d10;
    }

    public final void E0(t tVar) {
        f24442b.set(this, tVar);
    }

    public final boolean G(Throwable th) {
        return H(th);
    }

    public final boolean H(Object obj) {
        Object obj2;
        i9.k0 k0Var;
        i9.k0 k0Var2;
        i9.k0 k0Var3;
        obj2 = h2.f24456a;
        if (a0() && (obj2 = M(obj)) == h2.f24457b) {
            return true;
        }
        k0Var = h2.f24456a;
        if (obj2 == k0Var) {
            obj2 = k0(obj);
        }
        k0Var2 = h2.f24456a;
        if (obj2 == k0Var2 || obj2 == h2.f24457b) {
            return true;
        }
        k0Var3 = h2.f24459d;
        if (obj2 == k0Var3) {
            return false;
        }
        B(obj2);
        return true;
    }

    protected final CancellationException H0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = O();
            }
            cancellationException = new a2(str, th, this);
        }
        return cancellationException;
    }

    public void I(Throwable th) {
        H(th);
    }

    public final String J0() {
        return q0() + '{' + G0(d0()) + '}';
    }

    @Override // d9.z1
    public final g1 K(t8.l<? super Throwable, i8.w> lVar) {
        return z0(false, true, lVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String O() {
        return "Job was cancelled";
    }

    public boolean P(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return H(th) && Z();
    }

    @Override // d9.p2
    public CancellationException S() {
        Throwable th;
        Object d02 = d0();
        if (d02 instanceof c) {
            th = ((c) d02).e();
        } else if (d02 instanceof b0) {
            th = ((b0) d02).f24413a;
        } else if (d02 instanceof u1) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + d02).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        if (cancellationException == null) {
            return new a2("Parent job is " + G0(d02), th, this);
        }
        return cancellationException;
    }

    public final Object W() {
        Object d02 = d0();
        if (!(d02 instanceof u1)) {
            if (!(d02 instanceof b0)) {
                return h2.h(d02);
            }
            throw ((b0) d02).f24413a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public boolean Z() {
        return true;
    }

    @Override // d9.z1
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new a2(O(), null, this);
        }
        I(cancellationException);
    }

    public boolean a0() {
        return false;
    }

    @Override // d9.z1
    public final boolean b() {
        return !(d0() instanceof u1);
    }

    public final t c0() {
        return (t) f24442b.get(this);
    }

    public final Object d0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24441a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof i9.d0)) {
                return obj;
            }
            ((i9.d0) obj).a(this);
        }
    }

    protected boolean e0(Throwable th) {
        return false;
    }

    public void f0(Throwable th) {
        throw th;
    }

    @Override // m8.g
    public <R> R fold(R r10, t8.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) z1.a.b(this, r10, pVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g0(z1 z1Var) {
        if (s0.a()) {
            if (!(c0() == null)) {
                throw new AssertionError();
            }
        }
        if (z1Var == null) {
            E0(n2.f24492a);
            return;
        }
        z1Var.start();
        t E = z1Var.E(this);
        E0(E);
        if (b()) {
            E.d();
            E0(n2.f24492a);
        }
    }

    @Override // m8.g.b, m8.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) z1.a.c(this, cVar);
    }

    @Override // m8.g.b
    public final g.c<?> getKey() {
        return z1.f24533t0;
    }

    @Override // d9.z1
    public z1 getParent() {
        t c02 = c0();
        if (c02 != null) {
            return c02.getParent();
        }
        return null;
    }

    protected boolean h0() {
        return false;
    }

    @Override // d9.z1
    public boolean isActive() {
        Object d02 = d0();
        return (d02 instanceof u1) && ((u1) d02).isActive();
    }

    @Override // d9.z1
    public final boolean isCancelled() {
        Object d02 = d0();
        return (d02 instanceof b0) || ((d02 instanceof c) && ((c) d02).f());
    }

    public final boolean l0(Object obj) {
        Object M0;
        i9.k0 k0Var;
        i9.k0 k0Var2;
        do {
            M0 = M0(d0(), obj);
            k0Var = h2.f24456a;
            if (M0 == k0Var) {
                return false;
            }
            if (M0 == h2.f24457b) {
                return true;
            }
            k0Var2 = h2.f24458c;
        } while (M0 == k0Var2);
        B(M0);
        return true;
    }

    public final Object m0(Object obj) {
        Object M0;
        i9.k0 k0Var;
        i9.k0 k0Var2;
        do {
            M0 = M0(d0(), obj);
            k0Var = h2.f24456a;
            if (M0 != k0Var) {
                k0Var2 = h2.f24458c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, X(obj));
            }
        } while (M0 == k0Var2);
        return M0;
    }

    @Override // m8.g
    public m8.g minusKey(g.c<?> cVar) {
        return z1.a.e(this, cVar);
    }

    @Override // d9.z1
    public final Object n0(m8.d<? super i8.w> dVar) {
        Object c10;
        if (!i0()) {
            d2.g(dVar.getContext());
            return i8.w.f26638a;
        }
        Object j02 = j0(dVar);
        c10 = n8.d.c();
        return j02 == c10 ? j02 : i8.w.f26638a;
    }

    @Override // m8.g
    public m8.g plus(m8.g gVar) {
        return z1.a.f(this, gVar);
    }

    public String q0() {
        return t0.a(this);
    }

    @Override // d9.z1
    public final boolean start() {
        int F0;
        do {
            F0 = F0(d0());
            if (F0 == 0) {
                return false;
            }
        } while (F0 != 1);
        return true;
    }

    @Override // d9.z1
    public final CancellationException t() {
        Object d02 = d0();
        if (d02 instanceof c) {
            Throwable e8 = ((c) d02).e();
            if (e8 != null) {
                CancellationException H0 = H0(e8, t0.a(this) + " is cancelling");
                if (H0 != null) {
                    return H0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(d02 instanceof u1)) {
            if (d02 instanceof b0) {
                return I0(this, ((b0) d02).f24413a, null, 1, null);
            }
            return new a2(t0.a(this) + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public String toString() {
        return J0() + '@' + t0.b(this);
    }

    protected void u0(Throwable th) {
    }

    protected void v0(Object obj) {
    }

    protected void w0() {
    }

    @Override // d9.v
    public final void y0(p2 p2Var) {
        H(p2Var);
    }

    @Override // d9.z1
    public final g1 z0(boolean z10, boolean z11, t8.l<? super Throwable, i8.w> lVar) {
        f2 p02 = p0(lVar, z10);
        while (true) {
            Object d02 = d0();
            if (d02 instanceof j1) {
                j1 j1Var = (j1) d02;
                if (j1Var.isActive()) {
                    if (androidx.concurrent.futures.b.a(f24441a, this, d02, p02)) {
                        return p02;
                    }
                } else {
                    x0(j1Var);
                }
            } else {
                if (d02 instanceof u1) {
                    l2 b10 = ((u1) d02).b();
                    if (b10 == null) {
                        kotlin.jvm.internal.n.d(d02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        A0((f2) d02);
                    } else {
                        g1 g1Var = n2.f24492a;
                        if (z10 && (d02 instanceof c)) {
                            synchronized (d02) {
                                r3 = ((c) d02).e();
                                if (r3 == null || ((lVar instanceof u) && !((c) d02).g())) {
                                    if (y(d02, b10, p02)) {
                                        if (r3 == null) {
                                            return p02;
                                        }
                                        g1Var = p02;
                                    }
                                }
                                i8.w wVar = i8.w.f26638a;
                            }
                        }
                        if (r3 != null) {
                            if (z11) {
                                lVar.invoke(r3);
                            }
                            return g1Var;
                        } else if (y(d02, b10, p02)) {
                            return p02;
                        }
                    }
                } else {
                    if (z11) {
                        b0 b0Var = d02 instanceof b0 ? (b0) d02 : null;
                        lVar.invoke(b0Var != null ? b0Var.f24413a : null);
                    }
                    return n2.f24492a;
                }
            }
        }
    }
}
