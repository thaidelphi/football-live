package s;

import s.e;
/* compiled from: Optimizer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f30593a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(f fVar, r.d dVar, e eVar) {
        eVar.f30553n = -1;
        eVar.f30555o = -1;
        e.b bVar = fVar.S[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.S[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.H.f30513g;
            int R = fVar.R() - eVar.J.f30513g;
            d dVar2 = eVar.H;
            dVar2.f30515i = dVar.q(dVar2);
            d dVar3 = eVar.J;
            dVar3.f30515i = dVar.q(dVar3);
            dVar.f(eVar.H.f30515i, i10);
            dVar.f(eVar.J.f30515i, R);
            eVar.f30553n = 2;
            eVar.y0(i10, R);
        }
        if (fVar.S[1] == bVar2 || eVar.S[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.I.f30513g;
        int v10 = fVar.v() - eVar.K.f30513g;
        d dVar4 = eVar.I;
        dVar4.f30515i = dVar.q(dVar4);
        d dVar5 = eVar.K;
        dVar5.f30515i = dVar.q(dVar5);
        dVar.f(eVar.I.f30515i, i11);
        dVar.f(eVar.K.f30515i, v10);
        if (eVar.f30536e0 > 0 || eVar.Q() == 8) {
            d dVar6 = eVar.L;
            dVar6.f30515i = dVar.q(dVar6);
            dVar.f(eVar.L.f30515i, eVar.f30536e0 + i11);
        }
        eVar.f30555o = 2;
        eVar.P0(i11, v10);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
