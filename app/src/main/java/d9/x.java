package d9;
/* compiled from: CompletableDeferred.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class x<T> extends g2 implements w<T> {
    public x(z1 z1Var) {
        super(true);
        g0(z1Var);
    }

    @Override // d9.w0
    public Object C0(m8.d<? super T> dVar) {
        Object C = C(dVar);
        n8.d.c();
        return C;
    }

    @Override // d9.w
    public boolean J(Throwable th) {
        return l0(new b0(th, false, 2, null));
    }

    @Override // d9.w
    public boolean L(T t10) {
        return l0(t10);
    }

    @Override // d9.g2
    public boolean a0() {
        return true;
    }

    @Override // d9.w0
    public T j() {
        return (T) W();
    }
}
