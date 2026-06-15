package g9;

import d9.z1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collect.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Collect.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements t8.p<d9.o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f25910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e<T> f25911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(e<? extends T> eVar, m8.d<? super a> dVar) {
            super(2, dVar);
            this.f25911b = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            return new a(this.f25911b, dVar);
        }

        @Override // t8.p
        public final Object invoke(d9.o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f25910a;
            if (i10 == 0) {
                i8.p.b(obj);
                e<T> eVar = this.f25911b;
                this.f25910a = 1;
                if (g.i(eVar, this) == c10) {
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

    public static final Object a(e<?> eVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object collect = eVar.collect(h9.r.f26335a, dVar);
        c10 = n8.d.c();
        return collect == c10 ? collect : i8.w.f26638a;
    }

    public static final <T> Object b(e<? extends T> eVar, t8.p<? super T, ? super m8.d<? super i8.w>, ? extends Object> pVar, m8.d<? super i8.w> dVar) {
        e b10;
        Object c10;
        b10 = k.b(g.x(eVar, pVar), 0, null, 2, null);
        Object i10 = g.i(b10, dVar);
        c10 = n8.d.c();
        return i10 == c10 ? i10 : i8.w.f26638a;
    }

    public static final <T> Object c(f<? super T> fVar, e<? extends T> eVar, m8.d<? super i8.w> dVar) {
        Object c10;
        g.p(fVar);
        Object collect = eVar.collect(fVar, dVar);
        c10 = n8.d.c();
        return collect == c10 ? collect : i8.w.f26638a;
    }

    public static final <T> z1 d(e<? extends T> eVar, d9.o0 o0Var) {
        z1 d10;
        d10 = d9.k.d(o0Var, null, null, new a(eVar, null), 3, null);
        return d10;
    }
}
