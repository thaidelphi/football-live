package t3;

import java.io.IOException;
import s3.j;
/* compiled from: VarintReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class g {

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f31021d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f31022a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f31023b;

    /* renamed from: c  reason: collision with root package name */
    private int f31024c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f31021d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f31021d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & i10) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f31024c;
    }

    public long d(j jVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f31023b == 0) {
            if (!jVar.f(this.f31022a, 0, 1, z10)) {
                return -1L;
            }
            int c10 = c(this.f31022a[0] & 255);
            this.f31024c = c10;
            if (c10 != -1) {
                this.f31023b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f31024c;
        if (i11 > i10) {
            this.f31023b = 0;
            return -2L;
        }
        if (i11 != 1) {
            jVar.readFully(this.f31022a, 1, i11 - 1);
        }
        this.f31023b = 0;
        return a(this.f31022a, this.f31024c, z11);
    }

    public void e() {
        this.f31023b = 0;
        this.f31024c = 0;
    }
}
