package u3;

import a5.c0;
import a5.p0;
import a5.t;
import p3.i0;
/* compiled from: XingSeeker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final long f31372a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31373b;

    /* renamed from: c  reason: collision with root package name */
    private final long f31374c;

    /* renamed from: d  reason: collision with root package name */
    private final long f31375d;

    /* renamed from: e  reason: collision with root package name */
    private final long f31376e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f31377f;

    private h(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public static h e(long j10, long j11, i0.a aVar, c0 c0Var) {
        int D;
        int i10 = aVar.f29706g;
        int i11 = aVar.f29703d;
        int n10 = c0Var.n();
        if ((n10 & 1) != 1 || (D = c0Var.D()) == 0) {
            return null;
        }
        long O0 = p0.O0(D, i10 * 1000000, i11);
        if ((n10 & 6) != 6) {
            return new h(j11, aVar.f29702c, O0);
        }
        long B = c0Var.B();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = c0Var.z();
        }
        if (j10 != -1) {
            long j12 = j11 + B;
            if (j10 != j12) {
                t.i("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new h(j11, aVar.f29702c, O0, B, jArr);
    }

    private long f(int i10) {
        return (this.f31374c * i10) / 100;
    }

    @Override // u3.f
    public long a(long j10) {
        long j11 = j10 - this.f31372a;
        if (!c() || j11 <= this.f31373b) {
            return 0L;
        }
        long[] jArr = (long[]) a5.a.h(this.f31377f);
        double d10 = (j11 * 256.0d) / this.f31375d;
        int i10 = p0.i(jArr, (long) d10, true, true);
        long f10 = f(i10);
        long j12 = jArr[i10];
        int i11 = i10 + 1;
        long f11 = f(i11);
        long j13 = i10 == 99 ? 256L : jArr[i11];
        return f10 + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (f11 - f10));
    }

    @Override // u3.f
    public long b() {
        return this.f31376e;
    }

    @Override // s3.q
    public boolean c() {
        return this.f31377f != null;
    }

    @Override // s3.q
    public long d() {
        return this.f31374c;
    }

    private h(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f31372a = j10;
        this.f31373b = i10;
        this.f31374c = j11;
        this.f31377f = jArr;
        this.f31375d = j12;
        this.f31376e = j12 != -1 ? j10 + j12 : -1L;
    }
}
