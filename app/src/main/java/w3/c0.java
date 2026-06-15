package w3;

import java.util.List;
import n3.m1;
import w3.a0;
/* compiled from: UserDataReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<m1> f32010a;

    /* renamed from: b  reason: collision with root package name */
    private final s3.t[] f32011b;

    public c0(List<m1> list) {
        this.f32010a = list;
        this.f32011b = new s3.t[list.size()];
    }

    public void a(long j10, a5.c0 c0Var) {
        if (c0Var.a() < 9) {
            return;
        }
        int n10 = c0Var.n();
        int n11 = c0Var.n();
        int z10 = c0Var.z();
        if (n10 == 434 && n11 == 1195456820 && z10 == 3) {
            s3.b.b(j10, c0Var, this.f32011b);
        }
    }

    public void b(s3.k kVar, a0.d dVar) {
        for (int i10 = 0; i10 < this.f32011b.length; i10++) {
            dVar.a();
            s3.t f10 = kVar.f(dVar.c(), 3);
            m1 m1Var = this.f32010a.get(i10);
            String str = m1Var.f28185l;
            a5.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            f10.a(new m1.b().S(dVar.b()).e0(str).g0(m1Var.f28177d).V(m1Var.f28176c).F(m1Var.D).T(m1Var.f28187n).E());
            this.f32011b[i10] = f10;
        }
    }
}
