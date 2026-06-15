package d9;
/* compiled from: CancellableContinuation.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class q {
    public static final void a(n<?> nVar, g1 g1Var) {
        nVar.r(new h1(g1Var));
    }

    public static final <T> o<T> b(m8.d<? super T> dVar) {
        if (!(dVar instanceof i9.k)) {
            return new o<>(dVar, 1);
        }
        o<T> n10 = ((i9.k) dVar).n();
        if (n10 != null) {
            if (!n10.L()) {
                n10 = null;
            }
            if (n10 != null) {
                return n10;
            }
        }
        return new o<>(dVar, 2);
    }
}
