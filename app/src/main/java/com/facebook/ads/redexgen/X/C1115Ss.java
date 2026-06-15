package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* renamed from: com.facebook.ads.redexgen.X.Ss  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1115Ss implements Y7 {
    public static byte[] A0E;
    public static String[] A0F = {"A7Ro0y03nGBLMXhLzpqB7ezLM0Eq9ZJa", "DBJZvzxQZdTGwrM2nnttFpCciKTmS3Wr", "XIJG2TEBJBeSxMATaHaAer2kHwHpgtWT", "fOE4wvmz7EQC520WAcs", "73WCylrr5Tq55CEyW6vUl8qm40NbK7", "njPjYPFAENEnULst", "mARM0Pb7XaKFsrpMoTV7zI5FW9", "uG7SXHb7yCkg98"};
    public long A01;
    public InterfaceC1157Uo A02;
    public YF A03;
    public String A04;
    public boolean A05;
    public final YL A0B;
    public final boolean[] A0D = new boolean[3];
    public final YG A0A = new YG(32, 128);
    public final YG A08 = new YG(33, 128);
    public final YG A06 = new YG(34, 128);
    public final YG A07 = new YG(39, 128);
    public final YG A09 = new YG(40, 128);
    public long A00 = -9223372036854775807L;
    public final C1648fq A0C = new C1648fq();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0E = new byte[]{124, 6, 2, 1, 102, 81, 85, 80, 81, 70, 117, 78, 69, 88, 80, 69, 67, 84, 69, 68, 0, 65, 83, 80, 69, 67, 84, Byte.MAX_VALUE, 82, 65, 84, 73, 79, Byte.MAX_VALUE, 73, 68, 67, 0, 86, 65, 76, 85, 69, 26, 0, 37, 58, 55, 54, 60, 124, 59, 54, 37, 48};
    }

    static {
        A03();
    }

    public C1115Ss(YL yl) {
        this.A0B = yl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0251, code lost:
        r0 = r0 * 2;
        r4 = com.facebook.ads.redexgen.X.C1115Ss.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0263, code lost:
        if (r4[5].length() == r4[7].length()) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0265, code lost:
        com.facebook.ads.redexgen.X.C1115Ss.A0F[4] = "eaCnidCzsFZGUT6hF5Y8";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02a8, code lost:
        r1 = com.facebook.ads.redexgen.X.AbstractC1149Ud.A04.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02ab, code lost:
        if (r6 >= r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ad, code lost:
        r5 = com.facebook.ads.redexgen.X.AbstractC1149Ud.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02bc, code lost:
        if (com.facebook.ads.redexgen.X.C1115Ss.A0F[2].charAt(25) == 'w') goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02c3, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c4, code lost:
        com.facebook.ads.redexgen.X.C1115Ss.A0F[2] = "ftcObRVgoMByQgSurH31jXndJwRpyPAk";
        r5 = r5[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02cf, code lost:
        com.facebook.ads.redexgen.X.AbstractC1633fb.A07(A01(0, 10, 92), A01(10, 35, 72) + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02f8, code lost:
        if (r6 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0301, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01da, code lost:
        if (r6 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01dc, code lost:
        r6 = r8.A05(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e4, code lost:
        if (r6 != 255) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e6, code lost:
        r2 = r8.A05(16);
        r1 = r8.A05(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f0, code lost:
        if (r2 == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f2, code lost:
        if (r1 == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f4, code lost:
        r5 = r2 / r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f7, code lost:
        r6 = r8.A0A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0206, code lost:
        if (com.facebook.ads.redexgen.X.C1115Ss.A0F[3].length() == 29) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
        com.facebook.ads.redexgen.X.C1115Ss.A0F[2] = "cvXIvmttlzmlJlIuRPYxwpIIqw0qYSVB";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020f, code lost:
        if (r6 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0211, code lost:
        r8.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0218, code lost:
        if (r8.A0A() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021a, code lost:
        r8.A07(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0222, code lost:
        if (r8.A0A() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0224, code lost:
        r8.A07(24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022d, code lost:
        if (r8.A0A() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022f, code lost:
        r8.A04();
        r8.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0235, code lost:
        r8.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0242, code lost:
        if (com.facebook.ads.redexgen.X.C1115Ss.A0F[4].length() == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0244, code lost:
        com.facebook.ads.redexgen.X.C1115Ss.A0F[4] = com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x024f, code lost:
        if (r8.A0A() == false) goto L126;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.ZM A00(java.lang.String r22, com.facebook.ads.redexgen.X.YG r23, com.facebook.ads.redexgen.X.YG r24, com.facebook.ads.redexgen.X.YG r25) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1115Ss.A00(java.lang.String, com.facebook.ads.redexgen.X.YG, com.facebook.ads.redexgen.X.YG, com.facebook.ads.redexgen.X.YG):com.facebook.ads.redexgen.X.ZM");
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void A02() {
        AbstractC1589es.A02(this.A02);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void A04(long j10, int i10, int i11, long j11) {
        this.A03.A05(j10, i10, this.A05);
        if (!this.A05) {
            this.A0A.A04(i11);
            this.A08.A04(i11);
            this.A06.A04(i11);
            if (this.A0A.A03() && this.A08.A03() && this.A06.A03()) {
                this.A02.A6U(A00(this.A04, this.A0A, this.A08, this.A06));
                this.A05 = true;
            }
        }
        if (this.A07.A04(i11)) {
            this.A0C.A0j(this.A07.A01, AbstractC1149Ud.A02(this.A07.A01, this.A07.A00));
            this.A0C.A0g(5);
            this.A0B.A02(j11, this.A0C);
        }
        if (this.A09.A04(i11)) {
            this.A0C.A0j(this.A09.A01, AbstractC1149Ud.A02(this.A09.A01, this.A09.A00));
            this.A0C.A0g(5);
            this.A0B.A02(j11, this.A0C);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A05(long j10, int i10, int i11, long j11) {
        this.A03.A04(j10, i10, i11, j11, this.A05);
        if (!this.A05) {
            this.A0A.A01(i11);
            this.A08.A01(i11);
            this.A06.A01(i11);
        }
        this.A07.A01(i11);
        this.A09.A01(i11);
    }

    public static void A06(C1151Uf c1151Uf) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int matrixId = 1;
                if (!c1151Uf.A0A()) {
                    c1151Uf.A04();
                } else {
                    int sizeId = i10 << 1;
                    int min = Math.min(64, 1 << (sizeId + 4));
                    if (i10 > 1) {
                        c1151Uf.A03();
                    }
                    for (int sizeId2 = 0; sizeId2 < min; sizeId2++) {
                        c1151Uf.A03();
                    }
                }
                if (i10 == 3) {
                    matrixId = 3;
                }
                i11 += matrixId;
            }
        }
    }

    public static void A07(C1151Uf c1151Uf) {
        int A04 = c1151Uf.A04();
        boolean z10 = false;
        int numPositivePics = 0;
        for (int numNegativePics = 0; numNegativePics < A04; numNegativePics++) {
            if (numNegativePics != 0) {
                z10 = c1151Uf.A0A();
            }
            if (z10) {
                c1151Uf.A06();
                if (A0F[4].length() != 0) {
                    String[] strArr = A0F;
                    strArr[5] = "XpXsSkqOGYdsCrDt";
                    strArr[7] = "t3oTu9GqZJzzAD";
                    c1151Uf.A04();
                    for (int stRpsIdx = 0; stRpsIdx <= numPositivePics; stRpsIdx++) {
                        boolean A0A = c1151Uf.A0A();
                        String[] strArr2 = A0F;
                        String str = strArr2[5];
                        String str2 = strArr2[7];
                        int length = str.length();
                        int numShortTermRefPicSets = str2.length();
                        if (length != numShortTermRefPicSets) {
                            A0F[0] = "zXRrzrgs2yTfUpMYLKq5pl9q4OtfzcQs";
                            if (A0A) {
                                c1151Uf.A06();
                            }
                        }
                    }
                    continue;
                }
                throw new RuntimeException();
            }
            int previousNumDeltaPocs = c1151Uf.A04();
            int A042 = c1151Uf.A04();
            numPositivePics = previousNumDeltaPocs + A042;
            for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < previousNumDeltaPocs; numShortTermRefPicSets2++) {
                c1151Uf.A04();
                c1151Uf.A06();
            }
            for (int numShortTermRefPicSets3 = 0; numShortTermRefPicSets3 < A042; numShortTermRefPicSets3++) {
                c1151Uf.A04();
                c1151Uf.A06();
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A08(byte[] bArr, int i10, int i11) {
        this.A03.A06(bArr, i10, i11);
        if (!this.A05) {
            this.A0A.A02(bArr, i10, i11);
            this.A08.A02(bArr, i10, i11);
            this.A06.A02(bArr, i10, i11);
        }
        this.A07.A02(bArr, i10, i11);
        this.A09.A02(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A50(C1648fq c1648fq) {
        A02();
        while (c1648fq.A07() > 0) {
            int A09 = c1648fq.A09();
            int A0A = c1648fq.A0A();
            byte[] A0l = c1648fq.A0l();
            long j10 = this.A01;
            int offset = c1648fq.A07();
            this.A01 = j10 + offset;
            InterfaceC1157Uo interfaceC1157Uo = this.A02;
            int offset2 = c1648fq.A07();
            interfaceC1157Uo.AHx(c1648fq, offset2);
            while (A09 < A0A) {
                int A04 = AbstractC1149Ud.A04(A0l, A09, A0A, this.A0D);
                if (A04 == A0A) {
                    A08(A0l, A09, A0A);
                    return;
                }
                int bytesWrittenPastPosition = AbstractC1149Ud.A00(A0l, A04);
                int i10 = A04 - A09;
                if (i10 > 0) {
                    A08(A0l, A09, A04);
                }
                int lengthToNalUnit = A0A - A04;
                long j11 = this.A01 - lengthToNalUnit;
                int offset3 = i10 < 0 ? -i10 : 0;
                A04(j11, lengthToNalUnit, offset3, this.A00);
                long absolutePosition = this.A00;
                A05(j11, lengthToNalUnit, bytesWrittenPastPosition, absolutePosition);
                A09 = A04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A04 = ys.A04();
        this.A02 = ul.AJX(ys.A03(), 2);
        this.A03 = new YF(this.A02);
        this.A0B.A03(ul, ys);
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFy(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.A00 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AIB() {
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
        AbstractC1149Ud.A0H(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        if (this.A03 != null) {
            this.A03.A03();
        }
    }
}
