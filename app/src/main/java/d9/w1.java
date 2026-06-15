package d9;
/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class w1 extends l {

    /* renamed from: a  reason: collision with root package name */
    private final t8.l<Throwable, i8.w> f24525a;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(t8.l<? super Throwable, i8.w> lVar) {
        this.f24525a = lVar;
    }

    @Override // d9.m
    public void g(Throwable th) {
        this.f24525a.invoke(th);
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
        g(th);
        return i8.w.f26638a;
    }

    public String toString() {
        return "InvokeOnCancel[" + t0.a(this.f24525a) + '@' + t0.b(this) + ']';
    }
}
