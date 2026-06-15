package d9;
/* compiled from: CancellableContinuation.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class h1 extends l {

    /* renamed from: a  reason: collision with root package name */
    private final g1 f24455a;

    public h1(g1 g1Var) {
        this.f24455a = g1Var;
    }

    @Override // d9.m
    public void g(Throwable th) {
        this.f24455a.d();
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
        g(th);
        return i8.w.f26638a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f24455a + ']';
    }
}
