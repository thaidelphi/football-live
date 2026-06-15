package u3;

import a5.c0;
import a5.p0;
import a5.t;
import p3.i0;
/* compiled from: VbriSeeker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f31368a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f31369b;

    /* renamed from: c  reason: collision with root package name */
    private final long f31370c;

    /* renamed from: d  reason: collision with root package name */
    private final long f31371d;

    private g(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f31368a = jArr;
        this.f31369b = jArr2;
        this.f31370c = j10;
        this.f31371d = j11;
    }

    public static g e(long j10, long j11, i0.a aVar, c0 c0Var) {
        int z10;
        c0Var.L(10);
        int n10 = c0Var.n();
        if (n10 <= 0) {
            return null;
        }
        int i10 = aVar.f29703d;
        long O0 = p0.O0(n10, 1000000 * (i10 >= 32000 ? 1152 : 576), i10);
        int F = c0Var.F();
        int F2 = c0Var.F();
        int F3 = c0Var.F();
        c0Var.L(2);
        long j12 = j11 + aVar.f29702c;
        long[] jArr = new long[F];
        long[] jArr2 = new long[F];
        int i11 = 0;
        long j13 = j11;
        while (i11 < F) {
            int i12 = F2;
            long j14 = j12;
            jArr[i11] = (i11 * O0) / F;
            jArr2[i11] = Math.max(j13, j14);
            if (F3 == 1) {
                z10 = c0Var.z();
            } else if (F3 == 2) {
                z10 = c0Var.F();
            } else if (F3 == 3) {
                z10 = c0Var.C();
            } else if (F3 != 4) {
                return null;
            } else {
                z10 = c0Var.D();
            }
            j13 += z10 * i12;
            i11++;
            jArr = jArr;
            F2 = i12;
            j12 = j14;
        }
        long[] jArr3 = jArr;
        if (j10 != -1 && j10 != j13) {
            t.i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new g(jArr3, jArr2, O0, j13);
    }

    @Override // u3.f
    public long a(long j10) {
        return this.f31368a[p0.i(this.f31369b, j10, true, true)];
    }

    @Override // u3.f
    public long b() {
        return this.f31371d;
    }

    @Override // s3.q
    public boolean c() {
        return true;
    }

    @Override // s3.q
    public long d() {
        return this.f31370c;
    }
}
