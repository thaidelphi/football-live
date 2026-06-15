package w3;

import com.google.protobuf.CodedOutputStream;
import n3.m1;
import p3.i0;
import w3.a0;
/* compiled from: MpegAudioReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q implements j {

    /* renamed from: a  reason: collision with root package name */
    private final a5.c0 f32230a;

    /* renamed from: b  reason: collision with root package name */
    private final i0.a f32231b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32232c;

    /* renamed from: d  reason: collision with root package name */
    private s3.t f32233d;

    /* renamed from: e  reason: collision with root package name */
    private String f32234e;

    /* renamed from: f  reason: collision with root package name */
    private int f32235f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f32236g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f32237h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f32238i;

    /* renamed from: j  reason: collision with root package name */
    private long f32239j;

    /* renamed from: k  reason: collision with root package name */
    private int f32240k;

    /* renamed from: l  reason: collision with root package name */
    private long f32241l;

    public q(String str) {
        a5.c0 c0Var = new a5.c0(4);
        this.f32230a = c0Var;
        c0Var.d()[0] = -1;
        this.f32231b = new i0.a();
        this.f32241l = -9223372036854775807L;
        this.f32232c = str;
    }

    private void b(a5.c0 c0Var) {
        byte[] d10 = c0Var.d();
        int f10 = c0Var.f();
        for (int e8 = c0Var.e(); e8 < f10; e8++) {
            boolean z10 = (d10[e8] & 255) == 255;
            boolean z11 = this.f32238i && (d10[e8] & 224) == 224;
            this.f32238i = z10;
            if (z11) {
                c0Var.K(e8 + 1);
                this.f32238i = false;
                this.f32230a.d()[1] = d10[e8];
                this.f32236g = 2;
                this.f32235f = 1;
                return;
            }
        }
        c0Var.K(f10);
    }

    private void g(a5.c0 c0Var) {
        int min = Math.min(c0Var.a(), this.f32240k - this.f32236g);
        this.f32233d.d(c0Var, min);
        int i10 = this.f32236g + min;
        this.f32236g = i10;
        int i11 = this.f32240k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f32241l;
        if (j10 != -9223372036854775807L) {
            this.f32233d.e(j10, 1, i11, 0, null);
            this.f32241l += this.f32239j;
        }
        this.f32236g = 0;
        this.f32235f = 0;
    }

    private void h(a5.c0 c0Var) {
        int min = Math.min(c0Var.a(), 4 - this.f32236g);
        c0Var.j(this.f32230a.d(), this.f32236g, min);
        int i10 = this.f32236g + min;
        this.f32236g = i10;
        if (i10 < 4) {
            return;
        }
        this.f32230a.K(0);
        if (!this.f32231b.a(this.f32230a.n())) {
            this.f32236g = 0;
            this.f32235f = 1;
            return;
        }
        i0.a aVar = this.f32231b;
        this.f32240k = aVar.f29702c;
        if (!this.f32237h) {
            this.f32239j = (aVar.f29706g * 1000000) / aVar.f29703d;
            this.f32233d.a(new m1.b().S(this.f32234e).e0(this.f32231b.f29701b).W(CodedOutputStream.DEFAULT_BUFFER_SIZE).H(this.f32231b.f29704e).f0(this.f32231b.f29703d).V(this.f32232c).E());
            this.f32237h = true;
        }
        this.f32230a.K(0);
        this.f32233d.d(this.f32230a, 4);
        this.f32235f = 2;
    }

    @Override // w3.j
    public void a(a5.c0 c0Var) {
        a5.a.h(this.f32233d);
        while (c0Var.a() > 0) {
            int i10 = this.f32235f;
            if (i10 == 0) {
                b(c0Var);
            } else if (i10 == 1) {
                h(c0Var);
            } else if (i10 == 2) {
                g(c0Var);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // w3.j
    public void c() {
        this.f32235f = 0;
        this.f32236g = 0;
        this.f32238i = false;
        this.f32241l = -9223372036854775807L;
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        this.f32234e = dVar.b();
        this.f32233d = kVar.f(dVar.c(), 1);
    }

    @Override // w3.j
    public void e() {
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f32241l = j10;
        }
    }
}
