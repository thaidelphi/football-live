package q3;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: Buffer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private int f30065a;

    public final void f(int i10) {
        this.f30065a = i10 | this.f30065a;
    }

    public void g() {
        this.f30065a = 0;
    }

    public final void h(int i10) {
        this.f30065a = (~i10) & this.f30065a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean i(int i10) {
        return (this.f30065a & i10) == i10;
    }

    public final boolean j() {
        return i(268435456);
    }

    public final boolean k() {
        return i(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean l() {
        return i(4);
    }

    public final boolean m() {
        return i(134217728);
    }

    public final boolean n() {
        return i(1);
    }

    public final void o(int i10) {
        this.f30065a = i10;
    }
}
