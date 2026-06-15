package g9;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Distinct.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class m {

    /* renamed from: a  reason: collision with root package name */
    private static final t8.l<Object, Object> f25947a = b.f25950a;

    /* renamed from: b  reason: collision with root package name */
    private static final t8.p<Object, Object, Boolean> f25948b = a.f25949a;

    /* compiled from: Distinct.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.p<Object, Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25949a = new a();

        a() {
            super(2);
        }

        @Override // t8.p
        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(kotlin.jvm.internal.n.a(obj, obj2));
        }
    }

    /* compiled from: Distinct.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class b extends kotlin.jvm.internal.o implements t8.l<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25950a = new b();

        b() {
            super(1);
        }

        @Override // t8.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> e<T> a(e<? extends T> eVar) {
        return eVar instanceof j0 ? eVar : b(eVar, f25947a, f25948b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> e<T> b(e<? extends T> eVar, t8.l<? super T, ? extends Object> lVar, t8.p<Object, Object, Boolean> pVar) {
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            if (dVar.f25873b == lVar && dVar.f25874c == pVar) {
                return eVar;
            }
        }
        return new d(eVar, lVar, pVar);
    }
}
