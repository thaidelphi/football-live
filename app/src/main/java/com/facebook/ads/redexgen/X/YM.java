package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YM {
    public static byte[] A09;
    public static String[] A0A = {"ObPPlqYBz9jtQgOlhfiORQ3zvsCjO8c7", "TuvHPX8vYCVU3QejrSpcDndUcFm7DbwN", "7xHso735LCvEBLLncnmj3mZ8U2Hk5Kjb", "DkRDzvQUTZ1qaA67TFCVIroE3uujSXYl", "HFX8LxDqKMy36lIJNucFG6nL29jsJJXx", "UZB90JNHlJq9ZNLz5ef2OkEjyeveeHaQ", "56LC0ftgEWyuidTkevuLDqFqpRaUdfSW", "fUKI06WVybM5lbesQA3Bilzwmbe3YhLm"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C1662g4 A08 = new C1662g4(0);
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final C1648fq A07 = new C1648fq();

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-79, -93, -40, -10, -20, -15, -22, -93, -41, -52, -48, -56, -30, -40, -47, -42, -56, -41, -93, -20, -15, -10, -9, -24, -28, -25, -79, -67, -30, -22, -43, -32, -35, -40, -108, -40, -23, -26, -43, -24, -35, -29, -30, -82, -108, 17, 48, 1, 50, 47, 30, 49, 38, 44, 43, 15, 34, 30, 33, 34, 47};
    }

    static {
        A06();
    }

    public YM(int i10) {
        this.A06 = i10;
    }

    private int A00(WJ wj) {
        this.A07.A0i(AbstractC1672gE.A07);
        this.A03 = true;
        wj.AHr();
        return 0;
    }

    private int A01(WJ wj, C1152Ug c1152Ug, int i10) throws IOException {
        int min = (int) Math.min(this.A06, wj.A8E());
        if (wj.A8d() != 0) {
            c1152Ug.A00 = 0;
            return 1;
        }
        this.A07.A0d(min);
        wj.AHr();
        wj.AG1(this.A07.A0l(), 0, min);
        this.A01 = A03(this.A07, i10);
        this.A04 = true;
        return 0;
    }

    private int A02(WJ wj, C1152Ug c1152Ug, int i10) throws IOException {
        long inputLength = wj.A8E();
        int min = (int) Math.min(this.A06, inputLength);
        long inputLength2 = inputLength - min;
        if (wj.A8d() != inputLength2) {
            c1152Ug.A00 = inputLength2;
            return 1;
        }
        this.A07.A0d(min);
        wj.AHr();
        wj.AG1(this.A07.A0l(), 0, min);
        this.A02 = A04(this.A07, i10);
        this.A05 = true;
        return 0;
    }

    private long A03(C1648fq c1648fq, int i10) {
        int A0A2 = c1648fq.A0A();
        for (int A092 = c1648fq.A09(); A092 < A0A2; A092++) {
            int searchEndPosition = c1648fq.A0l()[A092];
            if (searchEndPosition == 71) {
                long A01 = YU.A01(c1648fq, A092, i10);
                int searchStartPosition = (A01 > (-9223372036854775807L) ? 1 : (A01 == (-9223372036854775807L) ? 0 : -1));
                if (searchStartPosition != 0) {
                    return A01;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long A04(C1648fq c1648fq, int i10) {
        int A092 = c1648fq.A09();
        int A0A2 = c1648fq.A0A();
        for (int i11 = A0A2 - 188; i11 >= A092; i11--) {
            if (YU.A03(c1648fq.A0l(), A092, A0A2, i11)) {
                long A01 = YU.A01(c1648fq, i11, i10);
                int searchStartPosition = (A01 > (-9223372036854775807L) ? 1 : (A01 == (-9223372036854775807L) ? 0 : -1));
                if (searchStartPosition != 0) {
                    return A01;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int A07(WJ wj, C1152Ug c1152Ug, int i10) throws IOException {
        if (i10 <= 0) {
            return A00(wj);
        }
        boolean z10 = this.A05;
        if (A0A[3].charAt(13) == 'A') {
            A0A[7] = "821ECwpuxcFTJMpXNSq1fqnjlqBsY3v4";
            if (!z10) {
                return A02(wj, c1152Ug, i10);
            }
            if (this.A02 == -9223372036854775807L) {
                return A00(wj);
            }
            if (!this.A04) {
                return A01(wj, c1152Ug, i10);
            }
            if (this.A01 == -9223372036854775807L) {
                return A00(wj);
            }
            long A06 = this.A08.A06(this.A01);
            long maxPcrPositionUs = this.A08.A06(this.A02);
            long maxPcrPositionUs2 = maxPcrPositionUs - A06;
            if (A0A[7].charAt(28) == 'Y') {
                A0A[7] = "FgF2XqEL70fgZ8nYDpMFHGFltuyKYfQj";
                this.A00 = maxPcrPositionUs2;
                if (this.A00 < 0) {
                    AbstractC1633fb.A07(A05(45, 16, 86), A05(27, 18, 13) + this.A00 + A05(0, 27, 28));
                    this.A00 = -9223372036854775807L;
                }
                return A00(wj);
            }
        }
        throw new RuntimeException();
    }

    public final long A08() {
        return this.A00;
    }

    public final C1662g4 A09() {
        return this.A08;
    }

    public final boolean A0A() {
        return this.A03;
    }
}
