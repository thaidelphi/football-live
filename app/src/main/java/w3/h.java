package w3;

import n3.m1;
import p3.f0;
import w3.a0;
/* compiled from: DtsReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h implements j {

    /* renamed from: b  reason: collision with root package name */
    private final String f32063b;

    /* renamed from: c  reason: collision with root package name */
    private String f32064c;

    /* renamed from: d  reason: collision with root package name */
    private s3.t f32065d;

    /* renamed from: f  reason: collision with root package name */
    private int f32067f;

    /* renamed from: g  reason: collision with root package name */
    private int f32068g;

    /* renamed from: h  reason: collision with root package name */
    private long f32069h;

    /* renamed from: i  reason: collision with root package name */
    private m1 f32070i;

    /* renamed from: j  reason: collision with root package name */
    private int f32071j;

    /* renamed from: a  reason: collision with root package name */
    private final a5.c0 f32062a = new a5.c0(new byte[18]);

    /* renamed from: e  reason: collision with root package name */
    private int f32066e = 0;

    /* renamed from: k  reason: collision with root package name */
    private long f32072k = -9223372036854775807L;

    public h(String str) {
        this.f32063b = str;
    }

    private boolean b(a5.c0 c0Var, byte[] bArr, int i10) {
        int min = Math.min(c0Var.a(), i10 - this.f32067f);
        c0Var.j(bArr, this.f32067f, min);
        int i11 = this.f32067f + min;
        this.f32067f = i11;
        return i11 == i10;
    }

    private void g() {
        byte[] d10 = this.f32062a.d();
        if (this.f32070i == null) {
            m1 g10 = f0.g(d10, this.f32064c, this.f32063b, null);
            this.f32070i = g10;
            this.f32065d.a(g10);
        }
        this.f32071j = f0.a(d10);
        this.f32069h = (int) ((f0.f(d10) * 1000000) / this.f32070i.f28199z);
    }

    private boolean h(a5.c0 c0Var) {
        while (c0Var.a() > 0) {
            int i10 = this.f32068g << 8;
            this.f32068g = i10;
            int z10 = i10 | c0Var.z();
            this.f32068g = z10;
            if (f0.d(z10)) {
                byte[] d10 = this.f32062a.d();
                int i11 = this.f32068g;
                d10[0] = (byte) ((i11 >> 24) & 255);
                d10[1] = (byte) ((i11 >> 16) & 255);
                d10[2] = (byte) ((i11 >> 8) & 255);
                d10[3] = (byte) (i11 & 255);
                this.f32067f = 4;
                this.f32068g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // w3.j
    public void a(a5.c0 c0Var) {
        a5.a.h(this.f32065d);
        while (c0Var.a() > 0) {
            int i10 = this.f32066e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(c0Var.a(), this.f32071j - this.f32067f);
                        this.f32065d.d(c0Var, min);
                        int i11 = this.f32067f + min;
                        this.f32067f = i11;
                        int i12 = this.f32071j;
                        if (i11 == i12) {
                            long j10 = this.f32072k;
                            if (j10 != -9223372036854775807L) {
                                this.f32065d.e(j10, 1, i12, 0, null);
                                this.f32072k += this.f32069h;
                            }
                            this.f32066e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (b(c0Var, this.f32062a.d(), 18)) {
                    g();
                    this.f32062a.K(0);
                    this.f32065d.d(this.f32062a, 18);
                    this.f32066e = 2;
                }
            } else if (h(c0Var)) {
                this.f32066e = 1;
            }
        }
    }

    @Override // w3.j
    public void c() {
        this.f32066e = 0;
        this.f32067f = 0;
        this.f32068g = 0;
        this.f32072k = -9223372036854775807L;
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        this.f32064c = dVar.b();
        this.f32065d = kVar.f(dVar.c(), 1);
    }

    @Override // w3.j
    public void e() {
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f32072k = j10;
        }
    }
}
