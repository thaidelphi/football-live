package d9;

import m8.g;
/* compiled from: CoroutineContext.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class i0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.jvm.internal.o implements t8.p<m8.g, g.b, m8.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24463a = new a();

        a() {
            super(2);
        }

        @Override // t8.p
        /* renamed from: a */
        public final m8.g invoke(m8.g gVar, g.b bVar) {
            if (bVar instanceof g0) {
                return gVar.plus(((g0) bVar).F());
            }
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b extends kotlin.jvm.internal.o implements t8.p<m8.g, g.b, m8.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.a0<m8.g> f24464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f24465b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.a0<m8.g> a0Var, boolean z10) {
            super(2);
            this.f24464a = a0Var;
            this.f24465b = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, m8.g] */
        @Override // t8.p
        /* renamed from: a */
        public final m8.g invoke(m8.g gVar, g.b bVar) {
            if (bVar instanceof g0) {
                g.b bVar2 = this.f24464a.f27364a.get(bVar.getKey());
                if (bVar2 == null) {
                    g0 g0Var = (g0) bVar;
                    if (this.f24465b) {
                        g0Var = g0Var.F();
                    }
                    return gVar.plus(g0Var);
                }
                kotlin.jvm.internal.a0<m8.g> a0Var = this.f24464a;
                a0Var.f27364a = a0Var.f27364a.minusKey(bVar.getKey());
                return gVar.plus(((g0) bVar).o0(bVar2));
            }
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineContext.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c extends kotlin.jvm.internal.o implements t8.p<Boolean, g.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f24466a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof g0));
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, g.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final m8.g a(m8.g gVar, m8.g gVar2, boolean z10) {
        boolean c10 = c(gVar);
        boolean c11 = c(gVar2);
        if (!c10 && !c11) {
            return gVar.plus(gVar2);
        }
        kotlin.jvm.internal.a0 a0Var = new kotlin.jvm.internal.a0();
        a0Var.f27364a = gVar2;
        m8.h hVar = m8.h.f27797a;
        m8.g gVar3 = (m8.g) gVar.fold(hVar, new b(a0Var, z10));
        if (c11) {
            a0Var.f27364a = ((m8.g) a0Var.f27364a).fold(hVar, a.f24463a);
        }
        return gVar3.plus((m8.g) a0Var.f27364a);
    }

    public static final String b(m8.g gVar) {
        m0 m0Var;
        if (s0.c() && (m0Var = (m0) gVar.get(m0.f24487b)) != null) {
            n0 n0Var = (n0) gVar.get(n0.f24490b);
            String str = (n0Var == null || (str = n0Var.G0()) == null) ? "coroutine" : "coroutine";
            return str + '#' + m0Var.G0();
        }
        return null;
    }

    private static final boolean c(m8.g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, c.f24466a)).booleanValue();
    }

    public static final m8.g d(o0 o0Var, m8.g gVar) {
        m8.g a10 = a(o0Var.getCoroutineContext(), gVar, true);
        m8.g plus = s0.c() ? a10.plus(new m0(s0.b().incrementAndGet())) : a10;
        return (a10 == f1.a() || a10.get(m8.e.f27794v0) != null) ? plus : plus.plus(f1.a());
    }

    public static final m8.g e(m8.g gVar, m8.g gVar2) {
        return !c(gVar2) ? gVar.plus(gVar2) : a(gVar, gVar2, false);
    }

    public static final b3<?> f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof b1) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof b3) {
                return (b3) eVar;
            }
        }
        return null;
    }

    public static final b3<?> g(m8.d<?> dVar, m8.g gVar, Object obj) {
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            if (gVar.get(c3.f24421a) != null) {
                b3<?> f10 = f((kotlin.coroutines.jvm.internal.e) dVar);
                if (f10 != null) {
                    f10.U0(gVar, obj);
                }
                return f10;
            }
            return null;
        }
        return null;
    }
}
