package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class WY implements Uj {
    public static byte[] A06;
    public static String[] A07 = {"tLzCF85sC8CJNNz1CEQFy0rj2HSVp1Oi", "PyfBvAMomjDfqe8lJa7tfxQTSch1S9UX", "tYAsERzhHqLbwFAW5NEJ4VAL6e4FPEl2", "Qaj9zxoyQsJje86ya", "6fm4oHtBkwNK", "ivGSqitgF8OzhkmKlqLOXuXY8ZpSGbk2", "bU9F6PJdy1GvJ5gOAbD", "4KFIhfNIEkF6nQq8dUI24MpztR3cSuWl"};
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A07[3].length() == 15) {
                throw new RuntimeException();
            }
            A07[5] = "l8o9st1HZJwsgHBfoV3vv9Rj36IEjFbK";
            copyOfRange[i13] = (byte) ((b10 ^ i12) ^ 100);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{58, 64, 76, 8, 25, 30, 13, 24, 5, 3, 2, 31, 57, 31, 81, 62, 50, 125, 116, 116, 97, 119, 102, 97, 47, 86, 90, 9, 19, 0, 31, 9, 71, 41, 37, 113, 108, 104, 96, 80, 118, 56, 48, 27, 6, 29, 24, 58, 29, 23, 22, 11, 91, 31, 22, 29, 20, 7, 27, 78};
    }

    static {
        A02();
    }

    public WY(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        if (this.A00 > 0) {
            this.A05 = jArr2[this.A00 - 1] + jArr3[this.A00 - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j10) {
        return AbstractC1672gE.A0L(this.A04, j10, true, true);
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        int A00 = A00(j10);
        C1154Uk c1154Uk = new C1154Uk(this.A04[A00], this.A03[A00]);
        int chunkIndex = (c1154Uk.A01 > j10 ? 1 : (c1154Uk.A01 == j10 ? 0 : -1));
        if (chunkIndex < 0) {
            int chunkIndex2 = this.A00;
            if (A00 != chunkIndex2 - 1) {
                int chunkIndex3 = A00 + 1;
                long j11 = this.A04[chunkIndex3];
                int chunkIndex4 = A00 + 1;
                C1154Uk seekPoint = new C1154Uk(j11, this.A03[chunkIndex4]);
                return new C1153Ui(c1154Uk, seekPoint);
            }
        }
        return new C1153Ui(c1154Uk);
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 23) + this.A00 + A01(25, 8, 30) + Arrays.toString(this.A01) + A01(15, 10, 118) + Arrays.toString(this.A03) + A01(33, 9, 97) + Arrays.toString(this.A04) + A01(1, 14, 8) + Arrays.toString(this.A02) + A01(0, 1, 119);
    }
}
