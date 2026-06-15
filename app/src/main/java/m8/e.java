package m8;

import kotlin.jvm.internal.n;
import m8.g;
/* compiled from: ContinuationInterceptor.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface e extends g.b {

    /* renamed from: v0  reason: collision with root package name */
    public static final b f27794v0 = b.f27795a;

    /* compiled from: ContinuationInterceptor.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> key) {
            n.f(key, "key");
            if (key instanceof m8.b) {
                m8.b bVar = (m8.b) key;
                if (bVar.a(eVar.getKey())) {
                    E e8 = (E) bVar.b(eVar);
                    if (e8 instanceof g.b) {
                        return e8;
                    }
                    return null;
                }
                return null;
            } else if (e.f27794v0 == key) {
                n.d(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            } else {
                return null;
            }
        }

        public static g b(e eVar, g.c<?> key) {
            n.f(key, "key");
            if (!(key instanceof m8.b)) {
                return e.f27794v0 == key ? h.f27797a : eVar;
            }
            m8.b bVar = (m8.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f27797a;
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b implements g.c<e> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f27795a = new b();

        private b() {
        }
    }

    <T> d<T> w(d<? super T> dVar);

    void z(d<?> dVar);
}
