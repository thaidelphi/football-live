package h9;

import d9.o0;
/* compiled from: FlowCoroutine.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class n {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<R> implements g9.e<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t8.q f26328a;

        public a(t8.q qVar) {
            this.f26328a = qVar;
        }

        @Override // g9.e
        public Object collect(g9.f<? super R> fVar, m8.d<? super i8.w> dVar) {
            Object c10;
            Object a10 = n.a(new b(this.f26328a, fVar, null), dVar);
            c10 = n8.d.c();
            return a10 == c10 ? a10 : i8.w.f26638a;
        }
    }

    /* compiled from: FlowCoroutine.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements t8.p<o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26329a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f26330b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t8.q<o0, g9.f<? super R>, m8.d<? super i8.w>, Object> f26331c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g9.f<R> f26332d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(t8.q<? super o0, ? super g9.f<? super R>, ? super m8.d<? super i8.w>, ? extends Object> qVar, g9.f<? super R> fVar, m8.d<? super b> dVar) {
            super(2, dVar);
            this.f26331c = qVar;
            this.f26332d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            b bVar = new b(this.f26331c, this.f26332d, dVar);
            bVar.f26330b = obj;
            return bVar;
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f26329a;
            if (i10 == 0) {
                i8.p.b(obj);
                t8.q<o0, g9.f<? super R>, m8.d<? super i8.w>, Object> qVar = this.f26331c;
                Object obj2 = this.f26332d;
                this.f26329a = 1;
                if (qVar.invoke((o0) this.f26330b, obj2, this) == c10) {
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

    public static final <R> Object a(t8.p<? super o0, ? super m8.d<? super R>, ? extends Object> pVar, m8.d<? super R> dVar) {
        Object c10;
        m mVar = new m(dVar.getContext(), dVar);
        Object b10 = j9.b.b(mVar, mVar, pVar);
        c10 = n8.d.c();
        if (b10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b10;
    }

    public static final <R> g9.e<R> b(t8.q<? super o0, ? super g9.f<? super R>, ? super m8.d<? super i8.w>, ? extends Object> qVar) {
        return new a(qVar);
    }
}
