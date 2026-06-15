package l9;

import androidx.recyclerview.widget.RecyclerView;
import com.appnext.actionssdk.ActionSDK;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d9.d3;
import d9.g1;
import d9.s0;
import i8.w;
import i9.h0;
import i9.k0;
import j8.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.n;
import t8.p;
import t8.q;
/* compiled from: Select.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class i<R> extends d9.l implements l9.c<R>, j, d3 {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27583f = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "state");

    /* renamed from: a  reason: collision with root package name */
    private final m8.g f27584a;

    /* renamed from: b  reason: collision with root package name */
    private List<i<R>.a> f27585b;

    /* renamed from: c  reason: collision with root package name */
    private Object f27586c;

    /* renamed from: d  reason: collision with root package name */
    private int f27587d;

    /* renamed from: e  reason: collision with root package name */
    private Object f27588e;
    private volatile Object state;

    /* compiled from: Select.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f27589a;

        /* renamed from: b  reason: collision with root package name */
        private final q<Object, j<?>, Object, w> f27590b;

        /* renamed from: c  reason: collision with root package name */
        private final q<Object, Object, Object, Object> f27591c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f27592d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f27593e;

        /* renamed from: f  reason: collision with root package name */
        public final q<j<?>, Object, Object, t8.l<Throwable, w>> f27594f;

        /* renamed from: g  reason: collision with root package name */
        public Object f27595g;

        /* renamed from: h  reason: collision with root package name */
        public int f27596h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, q<Object, ? super j<?>, Object, w> qVar, q<Object, Object, Object, ? extends Object> qVar2, Object obj2, Object obj3, q<? super j<?>, Object, Object, ? extends t8.l<? super Throwable, w>> qVar3) {
            this.f27589a = obj;
            this.f27590b = qVar;
            this.f27591c = qVar2;
            this.f27592d = obj2;
            this.f27593e = obj3;
            this.f27594f = qVar3;
        }

        public final t8.l<Throwable, w> a(j<?> jVar, Object obj) {
            q<j<?>, Object, Object, t8.l<Throwable, w>> qVar = this.f27594f;
            if (qVar != null) {
                return qVar.invoke(jVar, this.f27592d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f27595g;
            i<R> iVar = i.this;
            if (obj instanceof h0) {
                ((h0) obj).o(this.f27596h, null, iVar.getContext());
                return;
            }
            g1 g1Var = obj instanceof g1 ? (g1) obj : null;
            if (g1Var != null) {
                g1Var.d();
            }
        }

        public final Object c(Object obj, m8.d<? super R> dVar) {
            Object obj2 = this.f27593e;
            if (this.f27592d == k.i()) {
                n.d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((t8.l) obj2).invoke(dVar);
            }
            n.d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((p) obj2).invoke(obj, dVar);
        }

        public final Object d(Object obj) {
            return this.f27591c.invoke(this.f27589a, this.f27592d, obj);
        }

        public final boolean e(i<R> iVar) {
            k0 k0Var;
            k0 k0Var2;
            if (s0.a()) {
                if (!(iVar.v() || iVar.w())) {
                    throw new AssertionError();
                }
            }
            if (s0.a()) {
                Object obj = ((i) iVar).f27588e;
                k0Var2 = k.f27609e;
                if (!(obj == k0Var2)) {
                    throw new AssertionError();
                }
            }
            this.f27590b.invoke(this.f27589a, iVar, this.f27592d);
            Object obj2 = ((i) iVar).f27588e;
            k0Var = k.f27609e;
            return obj2 == k0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Select.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {ActionSDK.ACTION_DIALOG, 434}, m = "doSelectSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f27598a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f27599b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i<R> f27600c;

        /* renamed from: d  reason: collision with root package name */
        int f27601d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i<R> iVar, m8.d<? super b> dVar) {
            super(dVar);
            this.f27600c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27599b = obj;
            this.f27601d |= RecyclerView.UNDEFINED_DURATION;
            return this.f27600c.t(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Select.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {IronSourceError.ERROR_NT_LOAD_NO_FILL}, m = "processResultAndInvokeBlockRecoveringException")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f27602a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i<R> f27603b;

        /* renamed from: c  reason: collision with root package name */
        int f27604c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i<R> iVar, m8.d<? super c> dVar) {
            super(dVar);
            this.f27603b = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27602a = obj;
            this.f27604c |= RecyclerView.UNDEFINED_DURATION;
            return this.f27603b.y(null, null, this);
        }
    }

    public i(m8.g gVar) {
        k0 k0Var;
        k0 k0Var2;
        this.f27584a = gVar;
        k0Var = k.f27606b;
        this.state = k0Var;
        this.f27585b = new ArrayList(2);
        this.f27587d = -1;
        k0Var2 = k.f27609e;
        this.f27588e = k0Var2;
    }

    public static /* synthetic */ void A(i iVar, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        iVar.z(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Object obj) {
        i<R>.a u10 = u(obj);
        n.c(u10);
        u10.f27595g = null;
        u10.f27596h = -1;
        z(u10, true);
    }

    private final int D(Object obj, Object obj2) {
        boolean j10;
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        List b10;
        List F;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27583f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof d9.n)) {
                k0Var = k.f27607c;
                if (n.a(obj3, k0Var) ? true : obj3 instanceof a) {
                    return 3;
                }
                k0Var2 = k.f27608d;
                if (n.a(obj3, k0Var2)) {
                    return 2;
                }
                k0Var3 = k.f27606b;
                if (n.a(obj3, k0Var3)) {
                    b10 = j8.p.b(obj);
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, b10)) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else {
                    F = y.F((Collection) obj3, obj);
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, F)) {
                        return 1;
                    }
                }
            } else {
                i<R>.a u10 = u(obj);
                if (u10 == null) {
                    continue;
                } else {
                    t8.l<Throwable, w> a10 = u10.a(this, obj2);
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, u10)) {
                        this.f27588e = obj2;
                        j10 = k.j((d9.n) obj3, a10);
                        if (j10) {
                            return 0;
                        }
                        this.f27588e = null;
                        return 2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        r0 = r0.z();
        r1 = n8.d.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (r0 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        kotlin.coroutines.jvm.internal.h.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        r6 = n8.d.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r0 != r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
        return i8.w.f26638a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object E(m8.d<? super i8.w> r6) {
        /*
            r5 = this;
            d9.o r0 = new d9.o
            m8.d r1 = n8.b.b(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.C()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = k()
        L11:
            java.lang.Object r2 = r1.get(r5)
            i9.k0 r3 = l9.k.g()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = k()
            boolean r2 = androidx.concurrent.futures.b.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            r0.r(r5)
            goto L65
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = k()
            i9.k0 r4 = l9.k.g()
            boolean r3 = androidx.concurrent.futures.b.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L44:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            n(r5, r3)
            goto L44
        L52:
            boolean r1 = r2 instanceof l9.i.a
            if (r1 == 0) goto L7c
            i8.w r1 = i8.w.f26638a
            l9.i$a r2 = (l9.i.a) r2
            java.lang.Object r3 = j(r5)
            t8.l r2 = r2.a(r5, r3)
            r0.d(r1, r2)
        L65:
            java.lang.Object r0 = r0.z()
            java.lang.Object r1 = n8.b.c()
            if (r0 != r1) goto L72
            kotlin.coroutines.jvm.internal.h.c(r6)
        L72:
            java.lang.Object r6 = n8.b.c()
            if (r0 != r6) goto L79
            return r0
        L79:
            i8.w r6 = i8.w.f26638a
            return r6
        L7c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.i.E(m8.d):java.lang.Object");
    }

    private final void o(Object obj) {
        boolean z10;
        List<i<R>.a> list = this.f27585b;
        n.c(list);
        boolean z11 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).f27589a == obj) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
        }
        z11 = true;
        if (z11) {
            return;
        }
        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
    }

    private final void p(i<R>.a aVar) {
        k0 k0Var;
        k0 k0Var2;
        if (s0.a() && !n.a(f27583f.get(this), aVar)) {
            throw new AssertionError();
        }
        List<i<R>.a> list = this.f27585b;
        if (list == null) {
            return;
        }
        for (i<R>.a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27583f;
        k0Var = k.f27607c;
        atomicReferenceFieldUpdater.set(this, k0Var);
        k0Var2 = k.f27609e;
        this.f27588e = k0Var2;
        this.f27585b = null;
    }

    private final Object q(m8.d<? super R> dVar) {
        if (!s0.a() || x()) {
            Object obj = f27583f.get(this);
            n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
            i<R>.a aVar = (a) obj;
            Object obj2 = this.f27588e;
            p(aVar);
            if (!s0.d()) {
                return aVar.c(aVar.d(obj2), dVar);
            }
            return y(aVar, obj2, dVar);
        }
        throw new AssertionError();
    }

    static /* synthetic */ <R> Object s(i<R> iVar, m8.d<? super R> dVar) {
        return iVar.x() ? iVar.q(dVar) : iVar.t(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r6 
      PHI: (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:21:0x0054, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(m8.d<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof l9.i.b
            if (r0 == 0) goto L13
            r0 = r6
            l9.i$b r0 = (l9.i.b) r0
            int r1 = r0.f27601d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27601d = r1
            goto L18
        L13:
            l9.i$b r0 = new l9.i$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f27599b
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f27601d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            i8.p.b(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f27598a
            l9.i r2 = (l9.i) r2
            i8.p.b(r6)
            goto L4b
        L3c:
            i8.p.b(r6)
            r0.f27598a = r5
            r0.f27601d = r4
            java.lang.Object r6 = r5.E(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f27598a = r6
            r0.f27601d = r3
            java.lang.Object r6 = r2.q(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.i.t(m8.d):java.lang.Object");
    }

    private final i<R>.a u(Object obj) {
        boolean z10;
        List<i<R>.a> list = this.f27585b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f27589a == obj) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                obj2 = next;
                break;
            }
        }
        i<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v() {
        k0 k0Var;
        Object obj = f27583f.get(this);
        k0Var = k.f27606b;
        return obj == k0Var || (obj instanceof List);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w() {
        k0 k0Var;
        Object obj = f27583f.get(this);
        k0Var = k.f27608d;
        return obj == k0Var;
    }

    private final boolean x() {
        return f27583f.get(this) instanceof a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(l9.i<R>.a r5, java.lang.Object r6, m8.d<? super R> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof l9.i.c
            if (r0 == 0) goto L13
            r0 = r7
            l9.i$c r0 = (l9.i.c) r0
            int r1 = r0.f27604c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27604c = r1
            goto L18
        L13:
            l9.i$c r0 = new l9.i$c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f27602a
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f27604c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            i8.p.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L43
        L29:
            r5 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            i8.p.b(r7)
            java.lang.Object r6 = r5.d(r6)     // Catch: java.lang.Throwable -> L29
            r0.f27604c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L43
            return r1
        L43:
            return r7
        L44:
            boolean r6 = d9.s0.d()
            if (r6 == 0) goto L4f
            java.lang.Throwable r5 = i9.j0.a(r5, r0)
            throw r5
        L4f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.i.y(l9.i$a, java.lang.Object, m8.d):java.lang.Object");
    }

    public final l C(Object obj, Object obj2) {
        l a10;
        a10 = k.a(D(obj, obj2));
        return a10;
    }

    @Override // l9.c
    public void a(d dVar, t8.l<? super m8.d<? super R>, ? extends Object> lVar) {
        A(this, new a(dVar.d(), dVar.a(), dVar.c(), k.i(), lVar, dVar.b()), false, 1, null);
    }

    @Override // l9.c
    public <Q> void b(f<? extends Q> fVar, p<? super Q, ? super m8.d<? super R>, ? extends Object> pVar) {
        A(this, new a(fVar.d(), fVar.a(), fVar.c(), null, pVar, fVar.b()), false, 1, null);
    }

    @Override // l9.j
    public void c(Object obj) {
        this.f27588e = obj;
    }

    @Override // l9.j
    public void d(g1 g1Var) {
        this.f27586c = g1Var;
    }

    @Override // d9.d3
    public void e(h0<?> h0Var, int i10) {
        this.f27586c = h0Var;
        this.f27587d = i10;
    }

    @Override // l9.j
    public boolean f(Object obj, Object obj2) {
        return D(obj, obj2) == 0;
    }

    @Override // d9.m
    public void g(Throwable th) {
        Object obj;
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27583f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            k0Var = k.f27607c;
            if (obj == k0Var) {
                return;
            }
            k0Var2 = k.f27608d;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, k0Var2));
        List<i<R>.a> list = this.f27585b;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        k0Var3 = k.f27609e;
        this.f27588e = k0Var3;
        this.f27585b = null;
    }

    @Override // l9.j
    public m8.g getContext() {
        return this.f27584a;
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        g(th);
        return w.f26638a;
    }

    public Object r(m8.d<? super R> dVar) {
        return s(this, dVar);
    }

    public final void z(i<R>.a aVar, boolean z10) {
        k0 k0Var;
        if (s0.a()) {
            Object obj = f27583f.get(this);
            k0Var = k.f27608d;
            if (!(obj != k0Var)) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27583f;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            o(aVar.f27589a);
        }
        if (aVar.e(this)) {
            if (!z10) {
                List<i<R>.a> list = this.f27585b;
                n.c(list);
                list.add(aVar);
            }
            aVar.f27595g = this.f27586c;
            aVar.f27596h = this.f27587d;
            this.f27586c = null;
            this.f27587d = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, aVar);
    }
}
