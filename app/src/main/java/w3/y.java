package w3;

import a5.l0;
import a5.p0;
import java.io.IOException;
/* compiled from: TsDurationReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class y {

    /* renamed from: a  reason: collision with root package name */
    private final int f32274a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f32277d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32278e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32279f;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f32275b = new l0(0);

    /* renamed from: g  reason: collision with root package name */
    private long f32280g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f32281h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f32282i = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private final a5.c0 f32276c = new a5.c0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(int i10) {
        this.f32274a = i10;
    }

    private int a(s3.j jVar) {
        this.f32276c.H(p0.f487f);
        this.f32277d = true;
        jVar.e();
        return 0;
    }

    private int f(s3.j jVar, s3.p pVar, int i10) throws IOException {
        int min = (int) Math.min(this.f32274a, jVar.a());
        long j10 = 0;
        if (jVar.getPosition() != j10) {
            pVar.f30719a = j10;
            return 1;
        }
        this.f32276c.G(min);
        jVar.e();
        jVar.n(this.f32276c.d(), 0, min);
        this.f32280g = g(this.f32276c, i10);
        this.f32278e = true;
        return 0;
    }

    private long g(a5.c0 c0Var, int i10) {
        int f10 = c0Var.f();
        for (int e8 = c0Var.e(); e8 < f10; e8++) {
            if (c0Var.d()[e8] == 71) {
                long c10 = b0.c(c0Var, e8, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(s3.j jVar, s3.p pVar, int i10) throws IOException {
        long a10 = jVar.a();
        int min = (int) Math.min(this.f32274a, a10);
        long j10 = a10 - min;
        if (jVar.getPosition() != j10) {
            pVar.f30719a = j10;
            return 1;
        }
        this.f32276c.G(min);
        jVar.e();
        jVar.n(this.f32276c.d(), 0, min);
        this.f32281h = i(this.f32276c, i10);
        this.f32279f = true;
        return 0;
    }

    private long i(a5.c0 c0Var, int i10) {
        int e8 = c0Var.e();
        int f10 = c0Var.f();
        for (int i11 = f10 - 188; i11 >= e8; i11--) {
            if (b0.b(c0Var.d(), e8, f10, i11)) {
                long c10 = b0.c(c0Var, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f32282i;
    }

    public l0 c() {
        return this.f32275b;
    }

    public boolean d() {
        return this.f32277d;
    }

    public int e(s3.j jVar, s3.p pVar, int i10) throws IOException {
        if (i10 <= 0) {
            return a(jVar);
        }
        if (!this.f32279f) {
            return h(jVar, pVar, i10);
        }
        if (this.f32281h == -9223372036854775807L) {
            return a(jVar);
        }
        if (!this.f32278e) {
            return f(jVar, pVar, i10);
        }
        long j10 = this.f32280g;
        if (j10 == -9223372036854775807L) {
            return a(jVar);
        }
        long b10 = this.f32275b.b(this.f32281h) - this.f32275b.b(j10);
        this.f32282i = b10;
        if (b10 < 0) {
            a5.t.i("TsDurationReader", "Invalid duration: " + this.f32282i + ". Using TIME_UNSET instead.");
            this.f32282i = -9223372036854775807L;
        }
        return a(jVar);
    }
}
