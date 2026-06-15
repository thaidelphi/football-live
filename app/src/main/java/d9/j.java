package d9;
/* compiled from: Builders.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class j {
    public static final <T> T a(m8.g gVar, t8.p<? super o0, ? super m8.d<? super T>, ? extends Object> pVar) throws InterruptedException {
        k1 a10;
        m8.g d10;
        Thread currentThread = Thread.currentThread();
        m8.e eVar = (m8.e) gVar.get(m8.e.f27794v0);
        if (eVar == null) {
            a10 = w2.f24526a.b();
            d10 = i0.d(s1.f24517a, gVar.plus(a10));
        } else {
            k1 k1Var = eVar instanceof k1 ? (k1) eVar : null;
            if (k1Var != null) {
                k1 k1Var2 = k1Var.V0() ? k1Var : null;
                if (k1Var2 != null) {
                    a10 = k1Var2;
                    d10 = i0.d(s1.f24517a, gVar);
                }
            }
            a10 = w2.f24526a.a();
            d10 = i0.d(s1.f24517a, gVar);
        }
        g gVar2 = new g(d10, currentThread, a10);
        gVar2.S0(q0.DEFAULT, gVar2, pVar);
        return (T) gVar2.T0();
    }

    public static /* synthetic */ Object b(m8.g gVar, t8.p pVar, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            gVar = m8.h.f27797a;
        }
        return i.e(gVar, pVar);
    }
}
