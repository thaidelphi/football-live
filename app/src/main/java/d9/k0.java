package d9;

import m8.g;
/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface k0 extends g.b {

    /* renamed from: s0  reason: collision with root package name */
    public static final b f24473s0 = b.f24474a;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        public static <R> R a(k0 k0Var, R r10, t8.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(k0Var, r10, pVar);
        }

        public static <E extends g.b> E b(k0 k0Var, g.c<E> cVar) {
            return (E) g.b.a.b(k0Var, cVar);
        }

        public static m8.g c(k0 k0Var, g.c<?> cVar) {
            return g.b.a.c(k0Var, cVar);
        }

        public static m8.g d(k0 k0Var, m8.g gVar) {
            return g.b.a.d(k0Var, gVar);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b implements g.c<k0> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f24474a = new b();

        private b() {
        }
    }

    void handleException(m8.g gVar, Throwable th);
}
