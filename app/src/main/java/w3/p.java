package w3;

import java.util.Collections;
import n3.h2;
import n3.m1;
import p3.a;
import w3.a0;
/* compiled from: LatmReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p implements j {

    /* renamed from: a  reason: collision with root package name */
    private final String f32209a;

    /* renamed from: b  reason: collision with root package name */
    private final a5.c0 f32210b;

    /* renamed from: c  reason: collision with root package name */
    private final a5.b0 f32211c;

    /* renamed from: d  reason: collision with root package name */
    private s3.t f32212d;

    /* renamed from: e  reason: collision with root package name */
    private String f32213e;

    /* renamed from: f  reason: collision with root package name */
    private m1 f32214f;

    /* renamed from: g  reason: collision with root package name */
    private int f32215g;

    /* renamed from: h  reason: collision with root package name */
    private int f32216h;

    /* renamed from: i  reason: collision with root package name */
    private int f32217i;

    /* renamed from: j  reason: collision with root package name */
    private int f32218j;

    /* renamed from: k  reason: collision with root package name */
    private long f32219k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32220l;

    /* renamed from: m  reason: collision with root package name */
    private int f32221m;

    /* renamed from: n  reason: collision with root package name */
    private int f32222n;

    /* renamed from: o  reason: collision with root package name */
    private int f32223o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f32224p;

    /* renamed from: q  reason: collision with root package name */
    private long f32225q;

    /* renamed from: r  reason: collision with root package name */
    private int f32226r;

    /* renamed from: s  reason: collision with root package name */
    private long f32227s;

    /* renamed from: t  reason: collision with root package name */
    private int f32228t;

    /* renamed from: u  reason: collision with root package name */
    private String f32229u;

    public p(String str) {
        this.f32209a = str;
        a5.c0 c0Var = new a5.c0(1024);
        this.f32210b = c0Var;
        this.f32211c = new a5.b0(c0Var.d());
        this.f32219k = -9223372036854775807L;
    }

    private static long b(a5.b0 b0Var) {
        return b0Var.h((b0Var.h(2) + 1) * 8);
    }

    private void g(a5.b0 b0Var) throws h2 {
        if (!b0Var.g()) {
            this.f32220l = true;
            l(b0Var);
        } else if (!this.f32220l) {
            return;
        }
        if (this.f32221m == 0) {
            if (this.f32222n == 0) {
                k(b0Var, j(b0Var));
                if (this.f32224p) {
                    b0Var.q((int) this.f32225q);
                    return;
                }
                return;
            }
            throw h2.a(null, null);
        }
        throw h2.a(null, null);
    }

    private int h(a5.b0 b0Var) throws h2 {
        int b10 = b0Var.b();
        a.b e8 = p3.a.e(b0Var, true);
        this.f32229u = e8.f29556c;
        this.f32226r = e8.f29554a;
        this.f32228t = e8.f29555b;
        return b10 - b0Var.b();
    }

    private void i(a5.b0 b0Var) {
        int h10 = b0Var.h(3);
        this.f32223o = h10;
        if (h10 == 0) {
            b0Var.q(8);
        } else if (h10 == 1) {
            b0Var.q(9);
        } else if (h10 == 3 || h10 == 4 || h10 == 5) {
            b0Var.q(6);
        } else if (h10 != 6 && h10 != 7) {
            throw new IllegalStateException();
        } else {
            b0Var.q(1);
        }
    }

    private int j(a5.b0 b0Var) throws h2 {
        int h10;
        if (this.f32223o == 0) {
            int i10 = 0;
            do {
                h10 = b0Var.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw h2.a(null, null);
    }

    private void k(a5.b0 b0Var, int i10) {
        int e8 = b0Var.e();
        if ((e8 & 7) == 0) {
            this.f32210b.K(e8 >> 3);
        } else {
            b0Var.i(this.f32210b.d(), 0, i10 * 8);
            this.f32210b.K(0);
        }
        this.f32212d.d(this.f32210b, i10);
        long j10 = this.f32219k;
        if (j10 != -9223372036854775807L) {
            this.f32212d.e(j10, 1, i10, 0, null);
            this.f32219k += this.f32227s;
        }
    }

    private void l(a5.b0 b0Var) throws h2 {
        boolean g10;
        int h10 = b0Var.h(1);
        int h11 = h10 == 1 ? b0Var.h(1) : 0;
        this.f32221m = h11;
        if (h11 == 0) {
            if (h10 == 1) {
                b(b0Var);
            }
            if (b0Var.g()) {
                this.f32222n = b0Var.h(6);
                int h12 = b0Var.h(4);
                int h13 = b0Var.h(3);
                if (h12 == 0 && h13 == 0) {
                    if (h10 == 0) {
                        int e8 = b0Var.e();
                        int h14 = h(b0Var);
                        b0Var.o(e8);
                        byte[] bArr = new byte[(h14 + 7) / 8];
                        b0Var.i(bArr, 0, h14);
                        m1 E = new m1.b().S(this.f32213e).e0("audio/mp4a-latm").I(this.f32229u).H(this.f32228t).f0(this.f32226r).T(Collections.singletonList(bArr)).V(this.f32209a).E();
                        if (!E.equals(this.f32214f)) {
                            this.f32214f = E;
                            this.f32227s = 1024000000 / E.f28199z;
                            this.f32212d.a(E);
                        }
                    } else {
                        b0Var.q(((int) b(b0Var)) - h(b0Var));
                    }
                    i(b0Var);
                    boolean g11 = b0Var.g();
                    this.f32224p = g11;
                    this.f32225q = 0L;
                    if (g11) {
                        if (h10 == 1) {
                            this.f32225q = b(b0Var);
                        } else {
                            do {
                                g10 = b0Var.g();
                                this.f32225q = (this.f32225q << 8) + b0Var.h(8);
                            } while (g10);
                        }
                    }
                    if (b0Var.g()) {
                        b0Var.q(8);
                        return;
                    }
                    return;
                }
                throw h2.a(null, null);
            }
            throw h2.a(null, null);
        }
        throw h2.a(null, null);
    }

    private void m(int i10) {
        this.f32210b.G(i10);
        this.f32211c.m(this.f32210b.d());
    }

    @Override // w3.j
    public void a(a5.c0 c0Var) throws h2 {
        a5.a.h(this.f32212d);
        while (c0Var.a() > 0) {
            int i10 = this.f32215g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int z10 = c0Var.z();
                    if ((z10 & 224) == 224) {
                        this.f32218j = z10;
                        this.f32215g = 2;
                    } else if (z10 != 86) {
                        this.f32215g = 0;
                    }
                } else if (i10 == 2) {
                    int z11 = ((this.f32218j & (-225)) << 8) | c0Var.z();
                    this.f32217i = z11;
                    if (z11 > this.f32210b.d().length) {
                        m(this.f32217i);
                    }
                    this.f32216h = 0;
                    this.f32215g = 3;
                } else if (i10 == 3) {
                    int min = Math.min(c0Var.a(), this.f32217i - this.f32216h);
                    c0Var.j(this.f32211c.f405a, this.f32216h, min);
                    int i11 = this.f32216h + min;
                    this.f32216h = i11;
                    if (i11 == this.f32217i) {
                        this.f32211c.o(0);
                        g(this.f32211c);
                        this.f32215g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (c0Var.z() == 86) {
                this.f32215g = 1;
            }
        }
    }

    @Override // w3.j
    public void c() {
        this.f32215g = 0;
        this.f32219k = -9223372036854775807L;
        this.f32220l = false;
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        this.f32212d = kVar.f(dVar.c(), 1);
        this.f32213e = dVar.b();
    }

    @Override // w3.j
    public void e() {
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f32219k = j10;
        }
    }
}
