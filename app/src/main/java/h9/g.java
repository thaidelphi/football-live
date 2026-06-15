package h9;

import m8.e;
/* compiled from: ChannelFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class g<S, T> extends e<T> {

    /* renamed from: d  reason: collision with root package name */
    protected final g9.e<S> f26283d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<g9.f<? super T>, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26284a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f26285b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g<S, T> f26286c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<S, T> gVar, m8.d<? super a> dVar) {
            super(2, dVar);
            this.f26286c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            a aVar = new a(this.f26286c, dVar);
            aVar.f26285b = obj;
            return aVar;
        }

        public final Object invoke(g9.f<? super T> fVar, m8.d<? super i8.w> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, m8.d<? super i8.w> dVar) {
            return invoke((g9.f) ((g9.f) obj), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f26284a;
            if (i10 == 0) {
                i8.p.b(obj);
                g<S, T> gVar = this.f26286c;
                this.f26284a = 1;
                if (gVar.q((g9.f) this.f26285b, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            return i8.w.f26638a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(g9.e<? extends S> eVar, m8.g gVar, int i10, f9.a aVar) {
        super(gVar, i10, aVar);
        this.f26283d = eVar;
    }

    static /* synthetic */ <S, T> Object n(g<S, T> gVar, g9.f<? super T> fVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object c11;
        Object c12;
        if (gVar.f26274b == -3) {
            m8.g context = dVar.getContext();
            m8.g plus = context.plus(gVar.f26273a);
            if (kotlin.jvm.internal.n.a(plus, context)) {
                Object q10 = gVar.q(fVar, dVar);
                c12 = n8.d.c();
                return q10 == c12 ? q10 : i8.w.f26638a;
            }
            e.b bVar = m8.e.f27794v0;
            if (kotlin.jvm.internal.n.a(plus.get(bVar), context.get(bVar))) {
                Object p10 = gVar.p(fVar, plus, dVar);
                c11 = n8.d.c();
                return p10 == c11 ? p10 : i8.w.f26638a;
            }
        }
        Object collect = super.collect(fVar, dVar);
        c10 = n8.d.c();
        return collect == c10 ? collect : i8.w.f26638a;
    }

    static /* synthetic */ <S, T> Object o(g<S, T> gVar, f9.r<? super T> rVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object q10 = gVar.q(new w(rVar), dVar);
        c10 = n8.d.c();
        return q10 == c10 ? q10 : i8.w.f26638a;
    }

    private final Object p(g9.f<? super T> fVar, m8.g gVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object c11 = f.c(gVar, f.a(fVar, dVar.getContext()), null, new a(this, null), dVar, 4, null);
        c10 = n8.d.c();
        return c11 == c10 ? c11 : i8.w.f26638a;
    }

    @Override // h9.e, g9.e
    public Object collect(g9.f<? super T> fVar, m8.d<? super i8.w> dVar) {
        return n(this, fVar, dVar);
    }

    @Override // h9.e
    protected Object f(f9.r<? super T> rVar, m8.d<? super i8.w> dVar) {
        return o(this, rVar, dVar);
    }

    protected abstract Object q(g9.f<? super T> fVar, m8.d<? super i8.w> dVar);

    @Override // h9.e
    public String toString() {
        return this.f26283d + " -> " + super.toString();
    }
}
