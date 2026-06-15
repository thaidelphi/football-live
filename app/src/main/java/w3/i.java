package w3;

import java.util.Collections;
import java.util.List;
import n3.m1;
import w3.a0;
/* compiled from: DvbSubtitleReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    private final List<a0.a> f32073a;

    /* renamed from: b  reason: collision with root package name */
    private final s3.t[] f32074b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32075c;

    /* renamed from: d  reason: collision with root package name */
    private int f32076d;

    /* renamed from: e  reason: collision with root package name */
    private int f32077e;

    /* renamed from: f  reason: collision with root package name */
    private long f32078f = -9223372036854775807L;

    public i(List<a0.a> list) {
        this.f32073a = list;
        this.f32074b = new s3.t[list.size()];
    }

    private boolean b(a5.c0 c0Var, int i10) {
        if (c0Var.a() == 0) {
            return false;
        }
        if (c0Var.z() != i10) {
            this.f32075c = false;
        }
        this.f32076d--;
        return this.f32075c;
    }

    @Override // w3.j
    public void a(a5.c0 c0Var) {
        s3.t[] tVarArr;
        if (this.f32075c) {
            if (this.f32076d != 2 || b(c0Var, 32)) {
                if (this.f32076d != 1 || b(c0Var, 0)) {
                    int e8 = c0Var.e();
                    int a10 = c0Var.a();
                    for (s3.t tVar : this.f32074b) {
                        c0Var.K(e8);
                        tVar.d(c0Var, a10);
                    }
                    this.f32077e += a10;
                }
            }
        }
    }

    @Override // w3.j
    public void c() {
        this.f32075c = false;
        this.f32078f = -9223372036854775807L;
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        for (int i10 = 0; i10 < this.f32074b.length; i10++) {
            a0.a aVar = this.f32073a.get(i10);
            dVar.a();
            s3.t f10 = kVar.f(dVar.c(), 3);
            f10.a(new m1.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.f31984c)).V(aVar.f31982a).E());
            this.f32074b[i10] = f10;
        }
    }

    @Override // w3.j
    public void e() {
        if (this.f32075c) {
            if (this.f32078f != -9223372036854775807L) {
                for (s3.t tVar : this.f32074b) {
                    tVar.e(this.f32078f, 1, this.f32077e, 0, null);
                }
            }
            this.f32075c = false;
        }
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f32075c = true;
        if (j10 != -9223372036854775807L) {
            this.f32078f = j10;
        }
        this.f32077e = 0;
        this.f32076d = 2;
    }
}
