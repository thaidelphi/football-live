package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YI {
    public static byte[] A08;
    public static String[] A09 = {"mpBbJCBvGHciFnkDvEw8T6mnuzDTkbmB", "iYd", "MZWKBBob9BnXwXBzhjKhq9Qk0yg67Ty", "2e9qLTwe9mREx31EzTuG8FZvLTdy", "gK4eZ7UfUHrpCdlmAOT688JzKxqyP6W1", "0P9YPWCLtisuLzsdrg8g11tD23xnPb6I", "DQ6di4tCRn7nNrZQo14mKB3iLzpK7dPv", ""};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C1662g4 A07 = new C1662g4(0);
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final C1648fq A06 = new C1648fq();

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{-32, -46, 7, 37, 27, 32, 25, -46, 6, -5, -1, -9, 17, 7, 0, 5, -9, 6, -46, 27, 32, 37, 38, 23, 19, 22, -32, -72, -35, -27, -48, -37, -40, -45, -113, -45, -28, -31, -48, -29, -40, -34, -35, -87, -113, -64, -29, -76, -27, -30, -47, -28, -39, -33, -34, -62, -43, -47, -44, -43, -30};
    }

    static {
        A09();
    }

    private int A00(WJ wj) {
        this.A06.A0i(AbstractC1672gE.A07);
        this.A03 = true;
        wj.AHr();
        return 0;
    }

    private int A01(WJ wj, C1152Ug c1152Ug) throws IOException {
        int min = (int) Math.min(20000L, wj.A8E());
        int searchStartPosition = (wj.A8d() > 0 ? 1 : (wj.A8d() == 0 ? 0 : -1));
        if (searchStartPosition != 0) {
            c1152Ug.A00 = 0;
            return 1;
        }
        this.A06.A0d(min);
        wj.AHr();
        wj.AG1(this.A06.A0l(), 0, min);
        this.A01 = A04(this.A06);
        this.A04 = true;
        return 0;
    }

    private int A02(WJ wj, C1152Ug c1152Ug) throws IOException {
        long A8E = wj.A8E();
        int min = (int) Math.min(20000L, A8E);
        long j10 = A8E - min;
        long searchStartPosition = wj.A8d();
        if (searchStartPosition != j10) {
            c1152Ug.A00 = j10;
            return 1;
        }
        this.A06.A0d(min);
        wj.AHr();
        wj.AG1(this.A06.A0l(), 0, min);
        long inputLength = A05(this.A06);
        this.A02 = inputLength;
        this.A05 = true;
        return 0;
    }

    private int A03(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A04(com.facebook.ads.redexgen.X.C1648fq r11) {
        /*
            r10 = this;
            int r4 = r11.A09()
            int r9 = r11.A0A()
        L8:
            int r0 = r9 + (-3)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r0) goto L52
            byte[] r0 = r11.A0l()
            int r1 = r10.A03(r0, r4)
            r0 = 442(0x1ba, float:6.2E-43)
            if (r1 != r0) goto L49
            int r0 = r4 + 4
            r11.A0f(r0)
            long r5 = A06(r11)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YI.A09
            r0 = 7
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L4c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YI.A09
            java.lang.String r1 = ""
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "I7F"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L49
            return r5
        L49:
            int r4 = r4 + 1
            goto L8
        L4c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L52:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YI.A04(com.facebook.ads.redexgen.X.fq):long");
    }

    private long A05(C1648fq c1648fq) {
        int A092 = c1648fq.A09();
        int searchStartPosition = c1648fq.A0A();
        for (int nextStartCode = searchStartPosition - 4; nextStartCode >= A092; nextStartCode--) {
            int searchEndPosition = A03(c1648fq.A0l(), nextStartCode);
            if (searchEndPosition == 442) {
                int searchStartPosition2 = nextStartCode + 4;
                c1648fq.A0f(searchStartPosition2);
                long A06 = A06(c1648fq);
                int searchStartPosition3 = (A06 > (-9223372036854775807L) ? 1 : (A06 == (-9223372036854775807L) ? 0 : -1));
                if (searchStartPosition3 != 0) {
                    return A06;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long A06(C1648fq c1648fq) {
        int A092 = c1648fq.A09();
        if (c1648fq.A07() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        int originalPosition = bArr.length;
        c1648fq.A0k(bArr, 0, originalPosition);
        c1648fq.A0f(A092);
        if (A0A(bArr)) {
            return A07(bArr);
        }
        return -9223372036854775807L;
    }

    public static long A07(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public static boolean A0A(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public final int A0B(WJ wj, C1152Ug c1152Ug) throws IOException {
        if (!this.A05) {
            return A02(wj, c1152Ug);
        }
        if (this.A02 == -9223372036854775807L) {
            return A00(wj);
        }
        if (!this.A04) {
            return A01(wj, c1152Ug);
        }
        if (this.A01 == -9223372036854775807L) {
            return A00(wj);
        }
        this.A00 = this.A07.A06(this.A02) - this.A07.A06(this.A01);
        if (this.A00 < 0) {
            AbstractC1633fb.A07(A08(45, 16, 27), A08(27, 18, 26) + this.A00 + A08(0, 27, 93));
            this.A00 = -9223372036854775807L;
        }
        return A00(wj);
    }

    public final long A0C() {
        return this.A00;
    }

    public final C1662g4 A0D() {
        return this.A07;
    }

    public final boolean A0E() {
        return this.A03;
    }
}
