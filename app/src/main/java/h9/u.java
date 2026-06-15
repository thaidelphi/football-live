package h9;

import kotlin.jvm.internal.e0;
/* compiled from: SafeCollector.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final t8.q<g9.f<Object>, Object, m8.d<? super i8.w>, Object> f26345a;

    /* compiled from: SafeCollector.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.l implements t8.q<g9.f<? super Object>, Object, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f26346a = new a();

        a() {
            super(3, g9.f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // t8.q
        /* renamed from: a */
        public final Object invoke(g9.f<Object> fVar, Object obj, m8.d<? super i8.w> dVar) {
            return fVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f26346a;
        kotlin.jvm.internal.n.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f26345a = (t8.q) e0.a(aVar, 3);
    }

    public static final /* synthetic */ t8.q a() {
        return f26345a;
    }
}
