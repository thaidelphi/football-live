package k9;

import d9.j0;
import i9.s;
/* compiled from: Dispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class m extends j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final m f27350b = new m();

    private m() {
    }

    @Override // d9.j0
    public void G0(m8.g gVar, Runnable runnable) {
        c.f27331h.M0(runnable, l.f27349h, false);
    }

    @Override // d9.j0
    public void H0(m8.g gVar, Runnable runnable) {
        c.f27331h.M0(runnable, l.f27349h, true);
    }

    @Override // d9.j0
    public j0 J0(int i10) {
        s.a(i10);
        return i10 >= l.f27345d ? this : super.J0(i10);
    }
}
