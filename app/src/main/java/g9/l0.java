package g9;

import d9.s0;
/* compiled from: StateFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final i9.k0 f25945a = new i9.k0("NONE");

    /* renamed from: b  reason: collision with root package name */
    private static final i9.k0 f25946b = new i9.k0("PENDING");

    public static final <T> w<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) h9.s.f26336a;
        }
        return new k0(t10);
    }

    public static final <T> e<T> d(j0<? extends T> j0Var, m8.g gVar, int i10, f9.a aVar) {
        boolean z10 = true;
        if (s0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        if (i10 < 0 || i10 >= 2) {
            z10 = false;
        }
        return ((z10 || i10 == -2) && aVar == f9.a.DROP_OLDEST) ? j0Var : c0.e(j0Var, gVar, i10, aVar);
    }
}
