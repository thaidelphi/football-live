package d9;
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class f2 extends d0 implements g1, u1 {

    /* renamed from: d  reason: collision with root package name */
    public g2 f24438d;

    @Override // d9.u1
    public l2 b() {
        return null;
    }

    @Override // d9.g1
    public void d() {
        s().B0(this);
    }

    @Override // d9.u1
    public boolean isActive() {
        return true;
    }

    public final g2 s() {
        g2 g2Var = this.f24438d;
        if (g2Var != null) {
            return g2Var;
        }
        kotlin.jvm.internal.n.u("job");
        return null;
    }

    public final void t(g2 g2Var) {
        this.f24438d = g2Var;
    }

    @Override // i9.v
    public String toString() {
        return t0.a(this) + '@' + t0.b(this) + "[job@" + t0.b(s()) + ']';
    }
}
