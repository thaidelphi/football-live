package g9;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f25895a;

        public a(Object obj) {
            this.f25895a = obj;
        }

        @Override // g9.e
        public Object collect(f<? super T> fVar, m8.d<? super i8.w> dVar) {
            Object c10;
            Object emit = fVar.emit((Object) this.f25895a, dVar);
            c10 = n8.d.c();
            return emit == c10 ? emit : i8.w.f26638a;
        }
    }

    public static final <T> e<T> a(t8.p<? super f9.r<? super T>, ? super m8.d<? super i8.w>, ? extends Object> pVar) {
        return new b(pVar, null, 0, null, 14, null);
    }

    public static final <T> e<T> b(t8.p<? super f9.r<? super T>, ? super m8.d<? super i8.w>, ? extends Object> pVar) {
        return new c(pVar, null, 0, null, 14, null);
    }

    public static final <T> e<T> c(t8.p<? super f<? super T>, ? super m8.d<? super i8.w>, ? extends Object> pVar) {
        return new z(pVar);
    }

    public static final <T> e<T> d(T t10) {
        return new a(t10);
    }
}
