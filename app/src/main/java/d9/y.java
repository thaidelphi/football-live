package d9;
/* compiled from: CompletableDeferred.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class y {
    public static final <T> w<T> a(z1 z1Var) {
        return new x(z1Var);
    }

    public static /* synthetic */ w b(z1 z1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z1Var = null;
        }
        return a(z1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean c(w<T> wVar, Object obj) {
        Throwable d10 = i8.o.d(obj);
        return d10 == null ? wVar.L(obj) : wVar.J(d10);
    }
}
