package w3;

import a5.l0;
import n3.h2;
import w3.a0;
/* compiled from: PesReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final j f32250a;

    /* renamed from: b  reason: collision with root package name */
    private final a5.b0 f32251b = new a5.b0(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f32252c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f32253d;

    /* renamed from: e  reason: collision with root package name */
    private l0 f32254e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32255f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f32256g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f32257h;

    /* renamed from: i  reason: collision with root package name */
    private int f32258i;

    /* renamed from: j  reason: collision with root package name */
    private int f32259j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f32260k;

    /* renamed from: l  reason: collision with root package name */
    private long f32261l;

    public t(j jVar) {
        this.f32250a = jVar;
    }

    private boolean d(a5.c0 c0Var, byte[] bArr, int i10) {
        int min = Math.min(c0Var.a(), i10 - this.f32253d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c0Var.L(min);
        } else {
            c0Var.j(bArr, this.f32253d, min);
        }
        int i11 = this.f32253d + min;
        this.f32253d = i11;
        return i11 == i10;
    }

    private boolean e() {
        this.f32251b.o(0);
        int h10 = this.f32251b.h(24);
        if (h10 != 1) {
            a5.t.i("PesReader", "Unexpected start code prefix: " + h10);
            this.f32259j = -1;
            return false;
        }
        this.f32251b.q(8);
        int h11 = this.f32251b.h(16);
        this.f32251b.q(5);
        this.f32260k = this.f32251b.g();
        this.f32251b.q(2);
        this.f32255f = this.f32251b.g();
        this.f32256g = this.f32251b.g();
        this.f32251b.q(6);
        int h12 = this.f32251b.h(8);
        this.f32258i = h12;
        if (h11 == 0) {
            this.f32259j = -1;
        } else {
            int i10 = ((h11 + 6) - 9) - h12;
            this.f32259j = i10;
            if (i10 < 0) {
                a5.t.i("PesReader", "Found negative packet payload size: " + this.f32259j);
                this.f32259j = -1;
            }
        }
        return true;
    }

    private void f() {
        this.f32251b.o(0);
        this.f32261l = -9223372036854775807L;
        if (this.f32255f) {
            this.f32251b.q(4);
            this.f32251b.q(1);
            this.f32251b.q(1);
            long h10 = (this.f32251b.h(3) << 30) | (this.f32251b.h(15) << 15) | this.f32251b.h(15);
            this.f32251b.q(1);
            if (!this.f32257h && this.f32256g) {
                this.f32251b.q(4);
                this.f32251b.q(1);
                this.f32251b.q(1);
                this.f32251b.q(1);
                this.f32254e.b((this.f32251b.h(3) << 30) | (this.f32251b.h(15) << 15) | this.f32251b.h(15));
                this.f32257h = true;
            }
            this.f32261l = this.f32254e.b(h10);
        }
    }

    private void g(int i10) {
        this.f32252c = i10;
        this.f32253d = 0;
    }

    @Override // w3.a0
    public final void a(a5.c0 c0Var, int i10) throws h2 {
        a5.a.h(this.f32254e);
        if ((i10 & 1) != 0) {
            int i11 = this.f32252c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    a5.t.i("PesReader", "Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    if (this.f32259j != -1) {
                        a5.t.i("PesReader", "Unexpected start indicator: expected " + this.f32259j + " more bytes");
                    }
                    this.f32250a.e();
                } else {
                    throw new IllegalStateException();
                }
            }
            g(1);
        }
        while (c0Var.a() > 0) {
            int i12 = this.f32252c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (d(c0Var, this.f32251b.f405a, Math.min(10, this.f32258i)) && d(c0Var, null, this.f32258i)) {
                            f();
                            i10 |= this.f32260k ? 4 : 0;
                            this.f32250a.f(this.f32261l, i10);
                            g(3);
                        }
                    } else if (i12 == 3) {
                        int a10 = c0Var.a();
                        int i13 = this.f32259j;
                        int i14 = i13 != -1 ? a10 - i13 : 0;
                        if (i14 > 0) {
                            a10 -= i14;
                            c0Var.J(c0Var.e() + a10);
                        }
                        this.f32250a.a(c0Var);
                        int i15 = this.f32259j;
                        if (i15 != -1) {
                            int i16 = i15 - a10;
                            this.f32259j = i16;
                            if (i16 == 0) {
                                this.f32250a.e();
                                g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(c0Var, this.f32251b.f405a, 9)) {
                    g(e() ? 2 : 0);
                }
            } else {
                c0Var.L(c0Var.a());
            }
        }
    }

    @Override // w3.a0
    public void b(l0 l0Var, s3.k kVar, a0.d dVar) {
        this.f32254e = l0Var;
        this.f32250a.d(kVar, dVar);
    }

    @Override // w3.a0
    public final void c() {
        this.f32252c = 0;
        this.f32253d = 0;
        this.f32257h = false;
        this.f32250a.c();
    }
}
