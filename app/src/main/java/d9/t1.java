package d9;
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class t1 implements u1 {

    /* renamed from: a  reason: collision with root package name */
    private final l2 f24518a;

    public t1(l2 l2Var) {
        this.f24518a = l2Var;
    }

    @Override // d9.u1
    public l2 b() {
        return this.f24518a;
    }

    @Override // d9.u1
    public boolean isActive() {
        return false;
    }

    public String toString() {
        return s0.c() ? b().r("New") : super.toString();
    }
}
