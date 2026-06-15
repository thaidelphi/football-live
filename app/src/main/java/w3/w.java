package w3;

import java.util.List;
import n3.m1;
import w3.a0;
/* compiled from: SeiReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final List<m1> f32268a;

    /* renamed from: b  reason: collision with root package name */
    private final s3.t[] f32269b;

    public w(List<m1> list) {
        this.f32268a = list;
        this.f32269b = new s3.t[list.size()];
    }

    public void a(long j10, a5.c0 c0Var) {
        s3.b.a(j10, c0Var, this.f32269b);
    }

    public void b(s3.k kVar, a0.d dVar) {
        for (int i10 = 0; i10 < this.f32269b.length; i10++) {
            dVar.a();
            s3.t f10 = kVar.f(dVar.c(), 3);
            m1 m1Var = this.f32268a.get(i10);
            String str = m1Var.f28185l;
            a5.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = m1Var.f28174a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            f10.a(new m1.b().S(str2).e0(str).g0(m1Var.f28177d).V(m1Var.f28176c).F(m1Var.D).T(m1Var.f28187n).E());
            this.f32269b[i10] = f10;
        }
    }
}
