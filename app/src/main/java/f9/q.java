package f9;

import d9.l0;
import f9.u;
import i8.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Produce.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class q<E> extends e<E> implements r<E> {
    public q(m8.g gVar, d<E> dVar) {
        super(gVar, dVar, true, true);
    }

    @Override // d9.a
    protected void Q0(Throwable th, boolean z10) {
        if (T0().q(th) || z10) {
            return;
        }
        l0.a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d9.a
    /* renamed from: U0 */
    public void R0(w wVar) {
        u.a.a(T0(), null, 1, null);
    }

    @Override // d9.a, d9.g2, d9.z1
    public boolean isActive() {
        return super.isActive();
    }
}
