package h9;

import d9.d2;
import m8.g;
/* compiled from: SafeCollector.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class t<T> extends kotlin.coroutines.jvm.internal.d implements g9.f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g9.f<T> f26339a;

    /* renamed from: b  reason: collision with root package name */
    public final m8.g f26340b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26341c;

    /* renamed from: d  reason: collision with root package name */
    private m8.g f26342d;

    /* renamed from: e  reason: collision with root package name */
    private m8.d<? super i8.w> f26343e;

    /* compiled from: SafeCollector.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.p<Integer, g.b, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f26344a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(g9.f<? super T> fVar, m8.g gVar) {
        super(q.f26333a, m8.h.f27797a);
        this.f26339a = fVar;
        this.f26340b = gVar;
        this.f26341c = ((Number) gVar.fold(0, a.f26344a)).intValue();
    }

    private final void a(m8.g gVar, m8.g gVar2, T t10) {
        if (gVar2 instanceof l) {
            l((l) gVar2, t10);
        }
        v.a(this, gVar);
    }

    private final Object k(m8.d<? super i8.w> dVar, T t10) {
        Object c10;
        m8.g context = dVar.getContext();
        d2.g(context);
        m8.g gVar = this.f26342d;
        if (gVar != context) {
            a(context, gVar, t10);
            this.f26342d = context;
        }
        this.f26343e = dVar;
        t8.q a10 = u.a();
        g9.f<T> fVar = this.f26339a;
        kotlin.jvm.internal.n.d(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.n.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a10.invoke(fVar, t10, this);
        c10 = n8.d.c();
        if (!kotlin.jvm.internal.n.a(invoke, c10)) {
            this.f26343e = null;
        }
        return invoke;
    }

    private final void l(l lVar, Object obj) {
        String e8;
        e8 = b9.h.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + lVar.f26326a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(e8.toString());
    }

    @Override // g9.f
    public Object emit(T t10, m8.d<? super i8.w> dVar) {
        Object c10;
        Object c11;
        try {
            Object k10 = k(dVar, t10);
            c10 = n8.d.c();
            if (k10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            c11 = n8.d.c();
            return k10 == c11 ? k10 : i8.w.f26638a;
        } catch (Throwable th) {
            this.f26342d = new l(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        m8.d<? super i8.w> dVar = this.f26343e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, m8.d
    public m8.g getContext() {
        m8.g gVar = this.f26342d;
        return gVar == null ? m8.h.f27797a : gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Object c10;
        Throwable d10 = i8.o.d(obj);
        if (d10 != null) {
            this.f26342d = new l(d10, getContext());
        }
        m8.d<? super i8.w> dVar = this.f26343e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        c10 = n8.d.c();
        return c10;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
