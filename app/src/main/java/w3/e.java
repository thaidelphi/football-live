package w3;

import java.io.EOFException;
import java.io.IOException;
import n3.h2;
import s3.q;
import w3.a0;
/* compiled from: AdtsExtractor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements s3.i {

    /* renamed from: m  reason: collision with root package name */
    public static final s3.m f32025m = t3.d.f30956a;

    /* renamed from: a  reason: collision with root package name */
    private final int f32026a;

    /* renamed from: b  reason: collision with root package name */
    private final f f32027b;

    /* renamed from: c  reason: collision with root package name */
    private final a5.c0 f32028c;

    /* renamed from: d  reason: collision with root package name */
    private final a5.c0 f32029d;

    /* renamed from: e  reason: collision with root package name */
    private final a5.b0 f32030e;

    /* renamed from: f  reason: collision with root package name */
    private s3.k f32031f;

    /* renamed from: g  reason: collision with root package name */
    private long f32032g;

    /* renamed from: h  reason: collision with root package name */
    private long f32033h;

    /* renamed from: i  reason: collision with root package name */
    private int f32034i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f32035j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f32036k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32037l;

    public e() {
        this(0);
    }

    private void e(s3.j jVar) throws IOException {
        int h10;
        if (this.f32035j) {
            return;
        }
        this.f32034i = -1;
        jVar.e();
        long j10 = 0;
        if (jVar.getPosition() == 0) {
            i(jVar);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!jVar.c(this.f32029d.d(), 0, 2, true)) {
                    break;
                }
                this.f32029d.K(0);
                if (!f.m(this.f32029d.F())) {
                    break;
                } else if (!jVar.c(this.f32029d.d(), 0, 4, true)) {
                    break;
                } else {
                    this.f32030e.o(14);
                    h10 = this.f32030e.h(13);
                    if (h10 <= 6) {
                        this.f32035j = true;
                        throw h2.a("Malformed ADTS stream", null);
                    }
                    j10 += h10;
                    i11++;
                    if (i11 == 1000) {
                        break;
                    }
                }
            } catch (EOFException unused) {
            }
        } while (jVar.k(h10 - 6, true));
        i10 = i11;
        jVar.e();
        if (i10 > 0) {
            this.f32034i = (int) (j10 / i10);
        } else {
            this.f32034i = -1;
        }
        this.f32035j = true;
    }

    private static int f(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private s3.q g(long j10, boolean z10) {
        return new s3.d(j10, this.f32033h, f(this.f32034i, this.f32027b.k()), this.f32034i, z10);
    }

    private void h(long j10, boolean z10) {
        if (this.f32037l) {
            return;
        }
        boolean z11 = (this.f32026a & 1) != 0 && this.f32034i > 0;
        if (z11 && this.f32027b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (z11 && this.f32027b.k() != -9223372036854775807L) {
            this.f32031f.o(g(j10, (this.f32026a & 2) != 0));
        } else {
            this.f32031f.o(new q.b(-9223372036854775807L));
        }
        this.f32037l = true;
    }

    private int i(s3.j jVar) throws IOException {
        int i10 = 0;
        while (true) {
            jVar.n(this.f32029d.d(), 0, 10);
            this.f32029d.K(0);
            if (this.f32029d.C() != 4801587) {
                break;
            }
            this.f32029d.L(3);
            int y10 = this.f32029d.y();
            i10 += y10 + 10;
            jVar.h(y10);
        }
        jVar.e();
        jVar.h(i10);
        if (this.f32033h == -1) {
            this.f32033h = i10;
        }
        return i10;
    }

    @Override // s3.i
    public int a(s3.j jVar, s3.p pVar) throws IOException {
        a5.a.h(this.f32031f);
        long a10 = jVar.a();
        int i10 = this.f32026a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || a10 == -1)) ? false : true) {
            e(jVar);
        }
        int b10 = jVar.b(this.f32028c.d(), 0, com.ironsource.mediationsdk.metadata.a.f18931n);
        boolean z10 = b10 == -1;
        h(a10, z10);
        if (z10) {
            return -1;
        }
        this.f32028c.K(0);
        this.f32028c.J(b10);
        if (!this.f32036k) {
            this.f32027b.f(this.f32032g, 4);
            this.f32036k = true;
        }
        this.f32027b.a(this.f32028c);
        return 0;
    }

    @Override // s3.i
    public void b(s3.k kVar) {
        this.f32031f = kVar;
        this.f32027b.d(kVar, new a0.d(0, 1));
        kVar.q();
    }

    @Override // s3.i
    public boolean c(s3.j jVar) throws IOException {
        int i10 = i(jVar);
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            jVar.n(this.f32029d.d(), 0, 2);
            this.f32029d.K(0);
            if (f.m(this.f32029d.F())) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                jVar.n(this.f32029d.d(), 0, 4);
                this.f32030e.o(14);
                int h10 = this.f32030e.h(13);
                if (h10 <= 6) {
                    i11++;
                    jVar.e();
                    jVar.h(i11);
                } else {
                    jVar.h(h10 - 6);
                    i13 += h10;
                }
            } else {
                i11++;
                jVar.e();
                jVar.h(i11);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
    }

    @Override // s3.i
    public void d(long j10, long j11) {
        this.f32036k = false;
        this.f32027b.c();
        this.f32032g = j11;
    }

    @Override // s3.i
    public void release() {
    }

    public e(int i10) {
        this.f32026a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f32027b = new f(true);
        this.f32028c = new a5.c0((int) com.ironsource.mediationsdk.metadata.a.f18931n);
        this.f32034i = -1;
        this.f32033h = -1L;
        a5.c0 c0Var = new a5.c0(10);
        this.f32029d = c0Var;
        this.f32030e = new a5.b0(c0Var.d());
    }
}
