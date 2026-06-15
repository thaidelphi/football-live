package w3;

import a5.l0;
import a5.p0;
import n3.m1;
import w3.a0;
/* compiled from: PassthroughSectionPayloadReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class s implements u {

    /* renamed from: a  reason: collision with root package name */
    private m1 f32247a;

    /* renamed from: b  reason: collision with root package name */
    private l0 f32248b;

    /* renamed from: c  reason: collision with root package name */
    private s3.t f32249c;

    public s(String str) {
        this.f32247a = new m1.b().e0(str).E();
    }

    private void c() {
        a5.a.h(this.f32248b);
        p0.j(this.f32249c);
    }

    @Override // w3.u
    public void a(a5.c0 c0Var) {
        c();
        long d10 = this.f32248b.d();
        long e8 = this.f32248b.e();
        if (d10 == -9223372036854775807L || e8 == -9223372036854775807L) {
            return;
        }
        m1 m1Var = this.f32247a;
        if (e8 != m1Var.f28189p) {
            m1 E = m1Var.b().i0(e8).E();
            this.f32247a = E;
            this.f32249c.a(E);
        }
        int a10 = c0Var.a();
        this.f32249c.d(c0Var, a10);
        this.f32249c.e(d10, 1, a10, 0, null);
    }

    @Override // w3.u
    public void b(l0 l0Var, s3.k kVar, a0.d dVar) {
        this.f32248b = l0Var;
        dVar.a();
        s3.t f10 = kVar.f(dVar.c(), 5);
        this.f32249c = f10;
        f10.a(this.f32247a);
    }
}
