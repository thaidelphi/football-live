package w3;

import a5.p0;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;
import n3.h2;
import n3.m1;
import p3.a;
import w3.a0;
/* compiled from: AdtsReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f implements j {

    /* renamed from: v  reason: collision with root package name */
    private static final byte[] f32038v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32039a;

    /* renamed from: b  reason: collision with root package name */
    private final a5.b0 f32040b;

    /* renamed from: c  reason: collision with root package name */
    private final a5.c0 f32041c;

    /* renamed from: d  reason: collision with root package name */
    private final String f32042d;

    /* renamed from: e  reason: collision with root package name */
    private String f32043e;

    /* renamed from: f  reason: collision with root package name */
    private s3.t f32044f;

    /* renamed from: g  reason: collision with root package name */
    private s3.t f32045g;

    /* renamed from: h  reason: collision with root package name */
    private int f32046h;

    /* renamed from: i  reason: collision with root package name */
    private int f32047i;

    /* renamed from: j  reason: collision with root package name */
    private int f32048j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f32049k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32050l;

    /* renamed from: m  reason: collision with root package name */
    private int f32051m;

    /* renamed from: n  reason: collision with root package name */
    private int f32052n;

    /* renamed from: o  reason: collision with root package name */
    private int f32053o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f32054p;

    /* renamed from: q  reason: collision with root package name */
    private long f32055q;

    /* renamed from: r  reason: collision with root package name */
    private int f32056r;

    /* renamed from: s  reason: collision with root package name */
    private long f32057s;

    /* renamed from: t  reason: collision with root package name */
    private s3.t f32058t;

    /* renamed from: u  reason: collision with root package name */
    private long f32059u;

    public f(boolean z10) {
        this(z10, null);
    }

    private void b() {
        a5.a.e(this.f32044f);
        p0.j(this.f32058t);
        p0.j(this.f32045g);
    }

    private void g(a5.c0 c0Var) {
        if (c0Var.a() == 0) {
            return;
        }
        this.f32040b.f405a[0] = c0Var.d()[c0Var.e()];
        this.f32040b.o(2);
        int h10 = this.f32040b.h(4);
        int i10 = this.f32052n;
        if (i10 != -1 && h10 != i10) {
            q();
            return;
        }
        if (!this.f32050l) {
            this.f32050l = true;
            this.f32051m = this.f32053o;
            this.f32052n = h10;
        }
        t();
    }

    private boolean h(a5.c0 c0Var, int i10) {
        c0Var.K(i10 + 1);
        if (w(c0Var, this.f32040b.f405a, 1)) {
            this.f32040b.o(4);
            int h10 = this.f32040b.h(1);
            int i11 = this.f32051m;
            if (i11 == -1 || h10 == i11) {
                if (this.f32052n != -1) {
                    if (!w(c0Var, this.f32040b.f405a, 1)) {
                        return true;
                    }
                    this.f32040b.o(2);
                    if (this.f32040b.h(4) != this.f32052n) {
                        return false;
                    }
                    c0Var.K(i10 + 2);
                }
                if (w(c0Var, this.f32040b.f405a, 4)) {
                    this.f32040b.o(14);
                    int h11 = this.f32040b.h(13);
                    if (h11 < 7) {
                        return false;
                    }
                    byte[] d10 = c0Var.d();
                    int f10 = c0Var.f();
                    int i12 = i10 + h11;
                    if (i12 >= f10) {
                        return true;
                    }
                    if (d10[i12] == -1) {
                        int i13 = i12 + 1;
                        if (i13 == f10) {
                            return true;
                        }
                        return l((byte) -1, d10[i13]) && ((d10[i13] & 8) >> 3) == h10;
                    } else if (d10[i12] != 73) {
                        return false;
                    } else {
                        int i14 = i12 + 1;
                        if (i14 == f10) {
                            return true;
                        }
                        if (d10[i14] != 68) {
                            return false;
                        }
                        int i15 = i12 + 2;
                        return i15 == f10 || d10[i15] == 51;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean i(a5.c0 c0Var, byte[] bArr, int i10) {
        int min = Math.min(c0Var.a(), i10 - this.f32047i);
        c0Var.j(bArr, this.f32047i, min);
        int i11 = this.f32047i + min;
        this.f32047i = i11;
        return i11 == i10;
    }

    private void j(a5.c0 c0Var) {
        byte[] d10 = c0Var.d();
        int e8 = c0Var.e();
        int f10 = c0Var.f();
        while (e8 < f10) {
            int i10 = e8 + 1;
            int i11 = d10[e8] & 255;
            if (this.f32048j == 512 && l((byte) -1, (byte) i11) && (this.f32050l || h(c0Var, i10 - 2))) {
                this.f32053o = (i11 & 8) >> 3;
                this.f32049k = (i11 & 1) == 0;
                if (!this.f32050l) {
                    r();
                } else {
                    t();
                }
                c0Var.K(i10);
                return;
            }
            int i12 = this.f32048j;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f32048j = 768;
            } else if (i13 == 511) {
                this.f32048j = AdRequest.MAX_CONTENT_URL_LENGTH;
            } else if (i13 == 836) {
                this.f32048j = 1024;
            } else if (i13 == 1075) {
                u();
                c0Var.K(i10);
                return;
            } else if (i12 != 256) {
                this.f32048j = 256;
                i10--;
            }
            e8 = i10;
        }
        c0Var.K(e8);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void n() throws h2 {
        this.f32040b.o(0);
        if (!this.f32054p) {
            int h10 = this.f32040b.h(2) + 1;
            if (h10 != 2) {
                a5.t.i("AdtsReader", "Detected audio object type: " + h10 + ", but assuming AAC LC.");
                h10 = 2;
            }
            this.f32040b.q(5);
            byte[] b10 = p3.a.b(h10, this.f32052n, this.f32040b.h(3));
            a.b f10 = p3.a.f(b10);
            m1 E = new m1.b().S(this.f32043e).e0("audio/mp4a-latm").I(f10.f29556c).H(f10.f29555b).f0(f10.f29554a).T(Collections.singletonList(b10)).V(this.f32042d).E();
            this.f32055q = 1024000000 / E.f28199z;
            this.f32044f.a(E);
            this.f32054p = true;
        } else {
            this.f32040b.q(10);
        }
        this.f32040b.q(4);
        int h11 = (this.f32040b.h(13) - 2) - 5;
        if (this.f32049k) {
            h11 -= 2;
        }
        v(this.f32044f, this.f32055q, 0, h11);
    }

    private void o() {
        this.f32045g.d(this.f32041c, 10);
        this.f32041c.K(6);
        v(this.f32045g, 0L, 10, this.f32041c.y() + 10);
    }

    private void p(a5.c0 c0Var) {
        int min = Math.min(c0Var.a(), this.f32056r - this.f32047i);
        this.f32058t.d(c0Var, min);
        int i10 = this.f32047i + min;
        this.f32047i = i10;
        int i11 = this.f32056r;
        if (i10 == i11) {
            long j10 = this.f32057s;
            if (j10 != -9223372036854775807L) {
                this.f32058t.e(j10, 1, i11, 0, null);
                this.f32057s += this.f32059u;
            }
            s();
        }
    }

    private void q() {
        this.f32050l = false;
        s();
    }

    private void r() {
        this.f32046h = 1;
        this.f32047i = 0;
    }

    private void s() {
        this.f32046h = 0;
        this.f32047i = 0;
        this.f32048j = 256;
    }

    private void t() {
        this.f32046h = 3;
        this.f32047i = 0;
    }

    private void u() {
        this.f32046h = 2;
        this.f32047i = f32038v.length;
        this.f32056r = 0;
        this.f32041c.K(0);
    }

    private void v(s3.t tVar, long j10, int i10, int i11) {
        this.f32046h = 4;
        this.f32047i = i10;
        this.f32058t = tVar;
        this.f32059u = j10;
        this.f32056r = i11;
    }

    private boolean w(a5.c0 c0Var, byte[] bArr, int i10) {
        if (c0Var.a() < i10) {
            return false;
        }
        c0Var.j(bArr, 0, i10);
        return true;
    }

    @Override // w3.j
    public void a(a5.c0 c0Var) throws h2 {
        b();
        while (c0Var.a() > 0) {
            int i10 = this.f32046h;
            if (i10 == 0) {
                j(c0Var);
            } else if (i10 == 1) {
                g(c0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(c0Var, this.f32040b.f405a, this.f32049k ? 7 : 5)) {
                        n();
                    }
                } else if (i10 == 4) {
                    p(c0Var);
                } else {
                    throw new IllegalStateException();
                }
            } else if (i(c0Var, this.f32041c.d(), 10)) {
                o();
            }
        }
    }

    @Override // w3.j
    public void c() {
        this.f32057s = -9223372036854775807L;
        q();
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        this.f32043e = dVar.b();
        s3.t f10 = kVar.f(dVar.c(), 1);
        this.f32044f = f10;
        this.f32058t = f10;
        if (this.f32039a) {
            dVar.a();
            s3.t f11 = kVar.f(dVar.c(), 5);
            this.f32045g = f11;
            f11.a(new m1.b().S(dVar.b()).e0("application/id3").E());
            return;
        }
        this.f32045g = new s3.h();
    }

    @Override // w3.j
    public void e() {
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f32057s = j10;
        }
    }

    public long k() {
        return this.f32055q;
    }

    public f(boolean z10, String str) {
        this.f32040b = new a5.b0(new byte[7]);
        this.f32041c = new a5.c0(Arrays.copyOf(f32038v, 10));
        s();
        this.f32051m = -1;
        this.f32052n = -1;
        this.f32055q = -9223372036854775807L;
        this.f32057s = -9223372036854775807L;
        this.f32039a = z10;
        this.f32042d = str;
    }
}
