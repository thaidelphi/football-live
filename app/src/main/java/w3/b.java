package w3;

import a5.p0;
import n3.m1;
import p3.b;
import w3.a0;
/* compiled from: Ac3Reader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    private final a5.b0 f31994a;

    /* renamed from: b  reason: collision with root package name */
    private final a5.c0 f31995b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31996c;

    /* renamed from: d  reason: collision with root package name */
    private String f31997d;

    /* renamed from: e  reason: collision with root package name */
    private s3.t f31998e;

    /* renamed from: f  reason: collision with root package name */
    private int f31999f;

    /* renamed from: g  reason: collision with root package name */
    private int f32000g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f32001h;

    /* renamed from: i  reason: collision with root package name */
    private long f32002i;

    /* renamed from: j  reason: collision with root package name */
    private m1 f32003j;

    /* renamed from: k  reason: collision with root package name */
    private int f32004k;

    /* renamed from: l  reason: collision with root package name */
    private long f32005l;

    public b() {
        this(null);
    }

    private boolean b(a5.c0 c0Var, byte[] bArr, int i10) {
        int min = Math.min(c0Var.a(), i10 - this.f32000g);
        c0Var.j(bArr, this.f32000g, min);
        int i11 = this.f32000g + min;
        this.f32000g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f31994a.o(0);
        b.C0334b e8 = p3.b.e(this.f31994a);
        m1 m1Var = this.f32003j;
        if (m1Var == null || e8.f29568d != m1Var.f28198y || e8.f29567c != m1Var.f28199z || !p0.c(e8.f29565a, m1Var.f28185l)) {
            m1 E = new m1.b().S(this.f31997d).e0(e8.f29565a).H(e8.f29568d).f0(e8.f29567c).V(this.f31996c).E();
            this.f32003j = E;
            this.f31998e.a(E);
        }
        this.f32004k = e8.f29569e;
        this.f32002i = (e8.f29570f * 1000000) / this.f32003j.f28199z;
    }

    private boolean h(a5.c0 c0Var) {
        while (true) {
            if (c0Var.a() <= 0) {
                return false;
            }
            if (!this.f32001h) {
                this.f32001h = c0Var.z() == 11;
            } else {
                int z10 = c0Var.z();
                if (z10 == 119) {
                    this.f32001h = false;
                    return true;
                }
                this.f32001h = z10 == 11;
            }
        }
    }

    @Override // w3.j
    public void a(a5.c0 c0Var) {
        a5.a.h(this.f31998e);
        while (c0Var.a() > 0) {
            int i10 = this.f31999f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(c0Var.a(), this.f32004k - this.f32000g);
                        this.f31998e.d(c0Var, min);
                        int i11 = this.f32000g + min;
                        this.f32000g = i11;
                        int i12 = this.f32004k;
                        if (i11 == i12) {
                            long j10 = this.f32005l;
                            if (j10 != -9223372036854775807L) {
                                this.f31998e.e(j10, 1, i12, 0, null);
                                this.f32005l += this.f32002i;
                            }
                            this.f31999f = 0;
                        }
                    }
                } else if (b(c0Var, this.f31995b.d(), 128)) {
                    g();
                    this.f31995b.K(0);
                    this.f31998e.d(this.f31995b, 128);
                    this.f31999f = 2;
                }
            } else if (h(c0Var)) {
                this.f31999f = 1;
                this.f31995b.d()[0] = 11;
                this.f31995b.d()[1] = 119;
                this.f32000g = 2;
            }
        }
    }

    @Override // w3.j
    public void c() {
        this.f31999f = 0;
        this.f32000g = 0;
        this.f32001h = false;
        this.f32005l = -9223372036854775807L;
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        this.f31997d = dVar.b();
        this.f31998e = kVar.f(dVar.c(), 1);
    }

    @Override // w3.j
    public void e() {
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f32005l = j10;
        }
    }

    public b(String str) {
        a5.b0 b0Var = new a5.b0(new byte[128]);
        this.f31994a = b0Var;
        this.f31995b = new a5.c0(b0Var.f405a);
        this.f31999f = 0;
        this.f32005l = -9223372036854775807L;
        this.f31996c = str;
    }
}
