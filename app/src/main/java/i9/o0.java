package i9;

import d9.v2;
import m8.g;
/* compiled from: ThreadContext.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f26682a = new k0("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final t8.p<Object, g.b, Object> f26683b = a.f26686a;

    /* renamed from: c  reason: collision with root package name */
    private static final t8.p<v2<?>, g.b, v2<?>> f26684c = b.f26687a;

    /* renamed from: d  reason: collision with root package name */
    private static final t8.p<s0, g.b, s0> f26685d = c.f26688a;

    /* compiled from: ThreadContext.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.p<Object, g.b, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f26686a = new a();

        a() {
            super(2);
        }

        @Override // t8.p
        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            if (bVar instanceof v2) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class b extends kotlin.jvm.internal.o implements t8.p<v2<?>, g.b, v2<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f26687a = new b();

        b() {
            super(2);
        }

        @Override // t8.p
        /* renamed from: a */
        public final v2<?> invoke(v2<?> v2Var, g.b bVar) {
            if (v2Var != null) {
                return v2Var;
            }
            if (bVar instanceof v2) {
                return (v2) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class c extends kotlin.jvm.internal.o implements t8.p<s0, g.b, s0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f26688a = new c();

        c() {
            super(2);
        }

        @Override // t8.p
        /* renamed from: a */
        public final s0 invoke(s0 s0Var, g.b bVar) {
            if (bVar instanceof v2) {
                v2<?> v2Var = (v2) bVar;
                s0Var.a(v2Var, v2Var.k(s0Var.f26700a));
            }
            return s0Var;
        }
    }

    public static final void a(m8.g gVar, Object obj) {
        if (obj == f26682a) {
            return;
        }
        if (obj instanceof s0) {
            ((s0) obj).b(gVar);
            return;
        }
        Object fold = gVar.fold(null, f26684c);
        kotlin.jvm.internal.n.d(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((v2) fold).D0(gVar, obj);
    }

    public static final Object b(m8.g gVar) {
        Object fold = gVar.fold(0, f26683b);
        kotlin.jvm.internal.n.c(fold);
        return fold;
    }

    public static final Object c(m8.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f26682a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new s0(gVar, ((Number) obj).intValue()), f26685d);
        }
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((v2) obj).k(gVar);
    }
}
