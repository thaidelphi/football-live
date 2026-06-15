package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class W2 implements Uj {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    public W2(long[] jArr, long[] jArr2, long j10) {
        AbstractC1589es.A07(jArr.length == jArr2.length);
        int length = jArr2.length;
        this.A01 = length > 0;
        if (this.A01) {
            int length2 = (jArr2[0] > 0L ? 1 : (jArr2[0] == 0L ? 0 : -1));
            if (length2 > 0) {
                int length3 = length + 1;
                this.A02 = new long[length3];
                int length4 = length + 1;
                this.A03 = new long[length4];
                System.arraycopy(jArr, 0, this.A02, 1, length);
                System.arraycopy(jArr2, 0, this.A03, 1, length);
                this.A00 = j10;
            }
        }
        this.A02 = jArr;
        this.A03 = jArr2;
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        if (!this.A01) {
            return new C1153Ui(C1154Uk.A03);
        }
        int A0L = AbstractC1672gE.A0L(this.A03, j10, true, true);
        C1154Uk c1154Uk = new C1154Uk(this.A03[A0L], this.A02[A0L]);
        int targetIndex = (c1154Uk.A01 > j10 ? 1 : (c1154Uk.A01 == j10 ? 0 : -1));
        if (targetIndex != 0) {
            int targetIndex2 = this.A03.length;
            if (A0L != targetIndex2 - 1) {
                int targetIndex3 = A0L + 1;
                long j11 = this.A03[targetIndex3];
                int targetIndex4 = A0L + 1;
                C1154Uk rightSeekPoint = new C1154Uk(j11, this.A02[targetIndex4]);
                return new C1153Ui(c1154Uk, rightSeekPoint);
            }
        }
        return new C1153Ui(c1154Uk);
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return this.A01;
    }
}
