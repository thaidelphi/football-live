package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class XN implements S3 {
    public static byte[] A01;
    public static String[] A02 = {"fohbmjEiTj8NjqbUXaPl5n0du0El2hRv", "gmQR8xgLthHv4G5BX9pTnwOEugHSaFaL", "M9BAHt3Bse5mucctFju832VgdtGiUeNg", "ZRQmurEDuHOc8EysnH8HYFXqWPcg7n2A", "sMvIRpEi7nHILkqOqKCfNqgqE5n4SDao", "6deJ223aQhXDxnripPJDbnhkxgW9ru3n", "YwPySTAEBLT8OdBhXBX54RNz5cf1DiXs", "BPy3xf7R6eG9T49c5prT3PVlWWkpHDtF"};
    public final /* synthetic */ XM A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A02[1].charAt(4) == 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "DTuUAQXfapOnOIjA1dYmrl0sF9VKw3Jh";
            strArr[5] = "KN4VAXlDjCkdZoxnToIifIAsMDcSLzKz";
            copyOfRange[i13] = (byte) (i14 ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{8, 4, 102, 71, 68, 67, 87, 78, 86, 99, 87, 70, 75, 77, 113, 75, 76, 73, 105, 71, 78, 79, 82, 73, 78, 71, 0, 73, 77, 80, 79, 83, 83, 73, 66, 76, 89, 0, 76, 65, 82, 71, 69, 0, 65, 85, 68, 73, 79, 0, 76, 65, 84, 69, 78, 67, 89, 26, 0, 17, 50, 55, 48, 43, 45, 55, 49, 98, 35, 55, 38, 43, 45, 98, 54, 43, 47, 39, 49, 54, 35, 47, 50, 98, 106, 36, 48, 35, 47, 39, 98, 50, 45, 49, 43, 54, 43, 45, 44, 98, 47, 43, 49, 47, 35, 54, 33, 42, 107, 120, 98, 78, 109, 104, 111, 116, 114, 104, 110, 61, 124, 104, 121, 116, 114, 61, 105, 116, 112, 120, 110, 105, 124, 112, 109, 61, 53, 110, 100, 110, 105, 120, 112, 61, 126, 113, 114, 126, 118, 61, 112, 116, 110, 112, 124, 105, 126, 117, 52, 39, 61};
    }

    static {
        A01();
    }

    public XN(XM xm) {
        this.A00 = xm;
    }

    @Override // com.facebook.ads.redexgen.X.S3
    public final void ADb(long j10) {
        AbstractC1633fb.A07(A00(2, 16, 63), A00(18, 41, 61) + j10);
    }

    @Override // com.facebook.ads.redexgen.X.S3
    public final void AEa(long j10) {
        if (XM.A0J(this.A00) != null) {
            XM.A0J(this.A00).AEa(j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.S3
    public final void AEc(long j10, long j11, long j12, long j13) {
        StringBuilder append = new StringBuilder().append(A00(59, 52, 95)).append(j10);
        String A00 = A00(0, 2, 57);
        String sb = append.append(A00).append(j11).append(A00).append(j12).append(A00).append(j13).append(A00).append(XM.A0A(this.A00)).append(A00).append(XM.A0B(this.A00)).toString();
        if (!XM.A0v) {
            String message = A00(2, 16, 63);
            AbstractC1633fb.A07(message, sb);
            return;
        }
        throw new SI(sb);
    }

    @Override // com.facebook.ads.redexgen.X.S3
    public final void AFH(long j10, long j11, long j12, long j13) {
        StringBuilder append = new StringBuilder().append(A00(111, 50, 0)).append(j10);
        String A00 = A00(0, 2, 57);
        String sb = append.append(A00).append(j11).append(A00).append(j12).append(A00).append(j13).append(A00).append(XM.A0A(this.A00)).append(A00).append(XM.A0B(this.A00)).toString();
        if (!XM.A0v) {
            String message = A00(2, 16, 63);
            AbstractC1633fb.A07(message, sb);
            return;
        }
        throw new SI(sb);
    }

    @Override // com.facebook.ads.redexgen.X.S3
    public final void AFQ(int i10, long j10) {
        if (XM.A0J(this.A00) != null) {
            XM.A0J(this.A00).AFR(i10, j10, SystemClock.elapsedRealtime() - XM.A0C(this.A00));
        }
    }
}
