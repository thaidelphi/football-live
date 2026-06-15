package w3;

import n3.m1;
import p3.c;
import w3.a0;
/* compiled from: Ac4Reader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    private final a5.b0 f32012a;

    /* renamed from: b  reason: collision with root package name */
    private final a5.c0 f32013b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32014c;

    /* renamed from: d  reason: collision with root package name */
    private String f32015d;

    /* renamed from: e  reason: collision with root package name */
    private s3.t f32016e;

    /* renamed from: f  reason: collision with root package name */
    private int f32017f;

    /* renamed from: g  reason: collision with root package name */
    private int f32018g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f32019h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f32020i;

    /* renamed from: j  reason: collision with root package name */
    private long f32021j;

    /* renamed from: k  reason: collision with root package name */
    private m1 f32022k;

    /* renamed from: l  reason: collision with root package name */
    private int f32023l;

    /* renamed from: m  reason: collision with root package name */
    private long f32024m;

    public d() {
        this(null);
    }

    private boolean b(a5.c0 c0Var, byte[] bArr, int i10) {
        int min = Math.min(c0Var.a(), i10 - this.f32018g);
        c0Var.j(bArr, this.f32018g, min);
        int i11 = this.f32018g + min;
        this.f32018g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f32012a.o(0);
        c.b d10 = p3.c.d(this.f32012a);
        m1 m1Var = this.f32022k;
        if (m1Var == null || d10.f29576c != m1Var.f28198y || d10.f29575b != m1Var.f28199z || !"audio/ac4".equals(m1Var.f28185l)) {
            m1 E = new m1.b().S(this.f32015d).e0("audio/ac4").H(d10.f29576c).f0(d10.f29575b).V(this.f32014c).E();
            this.f32022k = E;
            this.f32016e.a(E);
        }
        this.f32023l = d10.f29577d;
        this.f32021j = (d10.f29578e * 1000000) / this.f32022k.f28199z;
    }

    private boolean h(a5.c0 c0Var) {
        int z10;
        while (true) {
            if (c0Var.a() <= 0) {
                return false;
            }
            if (!this.f32019h) {
                this.f32019h = c0Var.z() == 172;
            } else {
                z10 = c0Var.z();
                this.f32019h = z10 == 172;
                if (z10 == 64 || z10 == 65) {
                    break;
                }
            }
        }
        this.f32020i = z10 == 65;
        return true;
    }

    @Override // w3.j
    public void a(a5.c0 c0Var) {
        a5.a.h(this.f32016e);
        while (c0Var.a() > 0) {
            int i10 = this.f32017f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(c0Var.a(), this.f32023l - this.f32018g);
                        this.f32016e.d(c0Var, min);
                        int i11 = this.f32018g + min;
                        this.f32018g = i11;
                        int i12 = this.f32023l;
                        if (i11 == i12) {
                            long j10 = this.f32024m;
                            if (j10 != -9223372036854775807L) {
                                this.f32016e.e(j10, 1, i12, 0, null);
                                this.f32024m += this.f32021j;
                            }
                            this.f32017f = 0;
                        }
                    }
                } else if (b(c0Var, this.f32013b.d(), 16)) {
                    g();
                    this.f32013b.K(0);
                    this.f32016e.d(this.f32013b, 16);
                    this.f32017f = 2;
                }
            } else if (h(c0Var)) {
                this.f32017f = 1;
                this.f32013b.d()[0] = -84;
                this.f32013b.d()[1] = (byte) (this.f32020i ? 65 : 64);
                this.f32018g = 2;
            }
        }
    }

    @Override // w3.j
    public void c() {
        this.f32017f = 0;
        this.f32018g = 0;
        this.f32019h = false;
        this.f32020i = false;
        this.f32024m = -9223372036854775807L;
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        this.f32015d = dVar.b();
        this.f32016e = kVar.f(dVar.c(), 1);
    }

    @Override // w3.j
    public void e() {
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f32024m = j10;
        }
    }

    public d(String str) {
        a5.b0 b0Var = new a5.b0(new byte[16]);
        this.f32012a = b0Var;
        this.f32013b = new a5.c0(b0Var.f405a);
        this.f32017f = 0;
        this.f32018g = 0;
        this.f32019h = false;
        this.f32020i = false;
        this.f32024m = -9223372036854775807L;
        this.f32014c = str;
    }
}
