package d9;
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class u extends b2 implements t {

    /* renamed from: e  reason: collision with root package name */
    public final v f24519e;

    public u(v vVar) {
        this.f24519e = vVar;
    }

    @Override // d9.t
    public boolean a(Throwable th) {
        return s().P(th);
    }

    @Override // d9.t
    public z1 getParent() {
        return s();
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
        r(th);
        return i8.w.f26638a;
    }

    @Override // d9.d0
    public void r(Throwable th) {
        this.f24519e.y0(s());
    }
}
