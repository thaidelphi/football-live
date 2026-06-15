package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.ColorInfo;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ud  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1149Ud {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02 = {"6rUpOt", "hn9LigjnzaPPiWEO7430KrcMssTSytJd", "a", "vdeA85UYbfwMQioqiV4C8NfSnJKSUYiM", "ostobhiogcGR", "9Jmz0denfaSmqed8IokkJxNqS4ms97nH", "SsxwXCJgMJHLZEEBVBKf1rXJBO0yUwEx", "eRApIXQHySPbq6FfoB9DhvJy33SLpCWm"};
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1147Ua A06(byte[] bArr, int i10, int i11) {
        C1151Uf c1151Uf = new C1151Uf(bArr, i10, i11);
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        c1151Uf.A07(4);
        int A052 = c1151Uf.A05(3);
        c1151Uf.A06();
        int A053 = c1151Uf.A05(2);
        boolean A0A = c1151Uf.A0A();
        int A054 = c1151Uf.A05(5);
        int i15 = 0;
        for (int i16 = 0; i16 < 32; i16++) {
            if (c1151Uf.A0A()) {
                i15 |= 1 << i16;
            }
        }
        int[] iArr = new int[6];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            iArr[i17] = c1151Uf.A05(8);
        }
        int A055 = c1151Uf.A05(8);
        int i18 = 0;
        for (int i19 = 0; i19 < A052; i19++) {
            if (c1151Uf.A0A()) {
                i18 += 89;
            }
            boolean A0A2 = c1151Uf.A0A();
            String[] strArr = A02;
            if (strArr[1].charAt(7) != strArr[5].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "FxZY1L4nxQxmVdBMBB4ZwW40UgWOskqq";
            strArr2[5] = "t2fwQ3onBK5otMqRMljaftAIUvHlrALR";
            if (A0A2) {
                i18 += 8;
            }
        }
        c1151Uf.A07(i18);
        if (A052 > 0) {
            c1151Uf.A07((8 - A052) * 2);
        }
        int A042 = c1151Uf.A04();
        int A043 = c1151Uf.A04();
        if (A043 == 3) {
            c1151Uf.A06();
        }
        int A044 = c1151Uf.A04();
        int A045 = c1151Uf.A04();
        if (c1151Uf.A0A()) {
            int A046 = c1151Uf.A04();
            int A047 = c1151Uf.A04();
            int A048 = c1151Uf.A04();
            int A049 = c1151Uf.A04();
            A044 -= (A046 + A047) * ((A043 == 1 || A043 == 2) ? 2 : 1);
            A045 -= (A048 + A049) * (A043 == 1 ? 2 : 1);
        }
        c1151Uf.A04();
        c1151Uf.A04();
        int A0410 = c1151Uf.A04();
        for (int i20 = c1151Uf.A0A() ? 0 : A052; i20 <= A052; i20++) {
            c1151Uf.A04();
            c1151Uf.A04();
            c1151Uf.A04();
        }
        c1151Uf.A04();
        c1151Uf.A04();
        c1151Uf.A04();
        c1151Uf.A04();
        c1151Uf.A04();
        c1151Uf.A04();
        if (c1151Uf.A0A() && c1151Uf.A0A()) {
            A0D(c1151Uf);
        }
        c1151Uf.A07(2);
        if (c1151Uf.A0A()) {
            c1151Uf.A07(8);
            c1151Uf.A04();
            if (A02[2].length() != 1) {
                c1151Uf.A04();
                c1151Uf.A06();
            } else {
                A02[3] = "s3zVJ7azKijsZdolinmC4xsG4iAagWnL";
                c1151Uf.A04();
                c1151Uf.A06();
            }
        }
        A0E(c1151Uf);
        if (c1151Uf.A0A()) {
            for (int i21 = 0; i21 < c1151Uf.A04(); i21++) {
                c1151Uf.A07(A0410 + 4 + 1);
            }
        }
        c1151Uf.A07(2);
        float f10 = 1.0f;
        if (c1151Uf.A0A()) {
            if (c1151Uf.A0A()) {
                int A056 = c1151Uf.A05(8);
                if (A056 == 255) {
                    int A057 = c1151Uf.A05(16);
                    int A058 = c1151Uf.A05(16);
                    if (A057 != 0 && A058 != 0) {
                        f10 = A057 / A058;
                    }
                } else if (A056 < A04.length) {
                    f10 = A04[A056];
                } else {
                    AbstractC1633fb.A07(A0B(0, 11, 76), A0B(11, 35, 43) + A056);
                }
            }
            boolean A0A3 = c1151Uf.A0A();
            if (A02[3].charAt(16) != 'i') {
                throw new RuntimeException();
            }
            A02[3] = "rQ69BeSXFAaDiLFXiEixLE46g40nPe5P";
            if (A0A3) {
                c1151Uf.A06();
            }
            if (c1151Uf.A0A()) {
                c1151Uf.A07(3);
                boolean A0A4 = c1151Uf.A0A();
                if (c1151Uf.A0A()) {
                    int A059 = c1151Uf.A05(8);
                    int A0510 = c1151Uf.A05(8);
                    c1151Uf.A07(8);
                    i12 = ColorInfo.A00(A059);
                    i13 = A0A4 ? 1 : 2;
                    i14 = ColorInfo.A01(A0510);
                }
            }
            if (c1151Uf.A0A()) {
                c1151Uf.A04();
                c1151Uf.A04();
            }
            c1151Uf.A06();
            if (c1151Uf.A0A()) {
                A045 *= 2;
            }
        }
        return new C1147Ua(A053, A0A, A054, i15, iArr, A055, A042, A044, A045, f10, i12, i13, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r12 != 118) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r12 == 128) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        if (com.facebook.ads.redexgen.X.AbstractC1149Ud.A02[2].length() == 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
        if (r12 != 118) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
        com.facebook.ads.redexgen.X.AbstractC1149Ud.A02[3] = "vo12PQriPoFtiQ1uiLteE19n3l5fWybz";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
        if (r12 != 138) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
        if (r2 == 255) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a3, code lost:
        r1 = r3.A05(16);
        r2 = r3.A05(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ab, code lost:
        if (r1 == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ad, code lost:
        if (r2 == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01af, code lost:
        r0 = r1 / r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c8, code lost:
        if (r2 == 255) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ce, code lost:
        if (r2 >= com.facebook.ads.redexgen.X.AbstractC1149Ud.A04.length) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d0, code lost:
        r0 = com.facebook.ads.redexgen.X.AbstractC1149Ud.A04[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d5, code lost:
        com.facebook.ads.redexgen.X.AbstractC1633fb.A07(A0B(0, 11, 76), A0B(11, 35, 43) + r2);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C1148Uc A0A(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1149Ud.A0A(byte[], int, int):com.facebook.ads.redexgen.X.Uc");
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A00 = new byte[]{31, 48, 61, 4, 63, 56, 37, 4, 37, 56, 61, 99, 88, 83, 78, 70, 83, 85, 66, 83, 82, 22, 87, 69, 70, 83, 85, 66, 105, 68, 87, 66, 95, 89, 105, 95, 82, 85, 22, 64, 87, 90, 67, 83, 12, 22, 90, 69, 72, 73, 67, 3, 77, 90, 79, 69, 90, 87, 86, 92, 28, 91, 86, 69, 80};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0E(C1151Uf c1151Uf) {
        int A042;
        int A043;
        int[] iArr;
        int A044 = c1151Uf.A04();
        int i10 = -1;
        int i11 = -1;
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i12 = 0;
        while (i12 < A044) {
            if (i12 != 0 && c1151Uf.A0A()) {
                int i13 = i10 + i11;
                int A045 = (1 - ((c1151Uf.A0A() ? 1 : 0) * 2)) * (c1151Uf.A04() + 1);
                boolean[] zArr = new boolean[i13 + 1];
                for (int i14 = 0; i14 <= i13; i14++) {
                    if (c1151Uf.A0A()) {
                        zArr[i14] = true;
                    } else {
                        zArr[i14] = c1151Uf.A0A();
                    }
                }
                A042 = 0;
                int[] iArr4 = new int[i13 + 1];
                int[] iArr5 = new int[i13 + 1];
                for (int i15 = i11 - 1; i15 >= 0; i15--) {
                    int i16 = iArr3[i15] + A045;
                    if (i16 < 0 && zArr[i10 + i15]) {
                        iArr4[A042] = i16;
                        A042++;
                    }
                }
                if (A045 < 0 && zArr[i13]) {
                    iArr4[A042] = A045;
                    A042++;
                }
                for (int i17 = 0; i17 < i10; i17++) {
                    int i18 = iArr2[i17] + A045;
                    if (i18 < 0 && zArr[i17]) {
                        iArr4[A042] = i18;
                        A042++;
                    }
                }
                iArr = Arrays.copyOf(iArr4, A042);
                A043 = 0;
                for (int i19 = i10 - 1; i19 >= 0; i19--) {
                    int i20 = iArr2[i19] + A045;
                    if (i20 > 0 && zArr[i19]) {
                        iArr5[A043] = i20;
                        A043++;
                    }
                }
                if (A045 > 0 && zArr[i13]) {
                    iArr5[A043] = A045;
                    A043++;
                }
                for (int i21 = 0; i21 < i11; i21++) {
                    int i22 = iArr3[i21] + A045;
                    if (i22 > 0 && zArr[i10 + i21]) {
                        iArr5[A043] = i22;
                        A043++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr5, A043);
            } else {
                A042 = c1151Uf.A04();
                A043 = c1151Uf.A04();
                iArr = new int[A042];
                for (int i23 = 0; i23 < A042; i23++) {
                    iArr[i23] = c1151Uf.A04() + 1;
                    c1151Uf.A06();
                }
                iArr3 = new int[A043];
                for (int i24 = 0; i24 < A043; i24++) {
                    iArr3[i24] = c1151Uf.A04() + 1;
                    c1151Uf.A06();
                }
            }
            i10 = A042;
            i11 = A043;
            if (A02[2].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "ypbUm9mCh0Vq0Bu5MwOJXBzki";
            iArr2 = iArr;
            i12++;
        }
    }

    static {
        A0C();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static int A02(byte[] bArr, int i10) {
        int i11;
        synchronized (A05) {
            int scratchEscapeCount = 0;
            int i12 = 0;
            while (scratchEscapeCount < i10) {
                scratchEscapeCount = A03(bArr, scratchEscapeCount, i10);
                if (scratchEscapeCount < i10) {
                    if (A01.length <= i12) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[i12] = scratchEscapeCount;
                    scratchEscapeCount += 3;
                    i12++;
                }
            }
            i11 = i10 - i12;
            int unescapedPosition = 0;
            int escapedPosition = 0;
            for (int unescapedLength = 0; unescapedLength < i12; unescapedLength++) {
                int scratchEscapeCount2 = A01[unescapedLength];
                int scratchEscapeCount3 = scratchEscapeCount2 - unescapedPosition;
                System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, scratchEscapeCount3);
                int escapedPosition2 = escapedPosition + scratchEscapeCount3;
                int position = escapedPosition2 + 1;
                bArr[escapedPosition2] = 0;
                escapedPosition = position + 1;
                bArr[position] = 0;
                unescapedPosition += scratchEscapeCount3 + 3;
            }
            System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, i11 - escapedPosition);
        }
        return i11;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0002 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(byte[] r2, int r3, int r4) {
        /*
        L0:
            int r0 = r4 + (-2)
            if (r3 >= r0) goto L19
            r0 = r2[r3]
            if (r0 != 0) goto L16
            int r0 = r3 + 1
            r0 = r2[r0]
            if (r0 != 0) goto L16
            int r0 = r3 + 2
            r1 = r2[r0]
            r0 = 3
            if (r1 != r0) goto L16
            return r3
        L16:
            int r3 = r3 + 1
            goto L0
        L19:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1149Ud.A03(byte[], int, int):int");
    }

    public static int A04(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        boolean z11;
        int i12 = i11 - i10;
        AbstractC1589es.A08(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            A0H(zArr);
            if (A02[4].length() != 9) {
                A02[0] = "wEMBu8rPiBgZz8BQZEbCppvcT171GOvo";
                int length = i10 - 3;
                return length;
            }
        } else {
            if (i12 > 1 && zArr[1]) {
                int length2 = bArr[i10];
                if (length2 == 1) {
                    A0H(zArr);
                    int length3 = i10 - 2;
                    return length3;
                }
            }
            if (i12 > 2 && zArr[2]) {
                int length4 = bArr[i10];
                if (length4 == 0) {
                    int length5 = i10 + 1;
                    if (bArr[length5] == 1) {
                        A0H(zArr);
                        int length6 = i10 - 1;
                        return length6;
                    }
                }
            }
            int i13 = i11 - 1;
            int limit = i10 + 2;
            while (limit < i13) {
                int length7 = bArr[limit];
                if ((length7 & 254) == 0) {
                    int length8 = limit - 2;
                    if (bArr[length8] == 0) {
                        int length9 = limit - 1;
                        if (bArr[length9] == 0) {
                            int length10 = bArr[limit];
                            if (length10 == 1) {
                                A0H(zArr);
                                int length11 = limit - 2;
                                return length11;
                            }
                        }
                    }
                    limit -= 2;
                }
                limit += 3;
            }
            if (i12 > 2) {
                int length12 = i11 - 3;
                if (bArr[length12] == 0) {
                    int length13 = i11 - 2;
                    if (bArr[length13] == 0) {
                        int length14 = i11 - 1;
                        if (bArr[length14] == 1) {
                            z10 = true;
                        }
                    }
                }
                z10 = false;
            } else if (i12 == 2) {
                if (zArr[2]) {
                    int length15 = i11 - 2;
                    if (bArr[length15] == 0) {
                        int length16 = i11 - 1;
                        if (bArr[length16] == 1) {
                            z10 = true;
                        }
                    }
                }
                z10 = false;
            } else {
                if (zArr[1]) {
                    int length17 = i11 - 1;
                    if (bArr[length17] == 1) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            zArr[0] = z10;
            if (i12 > 1) {
                int length18 = i11 - 2;
                if (bArr[length18] == 0) {
                    int length19 = i11 - 1;
                    if (bArr[length19] == 0) {
                        z11 = true;
                    }
                }
                z11 = false;
            } else {
                if (zArr[2]) {
                    int length20 = i11 - 1;
                    if (bArr[length20] == 0) {
                        z11 = true;
                    }
                }
                z11 = false;
            }
            zArr[1] = z11;
            int length21 = i11 - 1;
            zArr[2] = bArr[length21] == 0;
            if (A02[0].length() != 17) {
                A02[4] = "8cyObcxJHVIGesxXSEYZizpbNjgO";
                return i11;
            }
        }
        throw new RuntimeException();
    }

    public static C1147Ua A05(byte[] bArr, int i10, int i11) {
        return A06(bArr, i10 + 2, i11);
    }

    public static Ub A07(byte[] bArr, int i10, int i11) {
        return A08(bArr, i10 + 1, i11);
    }

    public static Ub A08(byte[] bArr, int i10, int i11) {
        C1151Uf data = new C1151Uf(bArr, i10, i11);
        int A042 = data.A04();
        int seqParameterSetId = data.A04();
        data.A06();
        return new Ub(A042, seqParameterSetId, data.A0A());
    }

    public static C1148Uc A09(byte[] bArr, int i10, int i11) {
        return A0A(bArr, i10 + 1, i11);
    }

    public static void A0D(C1151Uf c1151Uf) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                boolean A0A = c1151Uf.A0A();
                int i12 = 1;
                String[] strArr = A02;
                String str = strArr[7];
                String str2 = strArr[6];
                int charAt = str.charAt(16);
                int sizeId = str2.charAt(16);
                if (charAt == sizeId) {
                    throw new RuntimeException();
                }
                A02[2] = "z";
                if (!A0A) {
                    c1151Uf.A04();
                } else {
                    int sizeId2 = i10 << 1;
                    int min = Math.min(64, 1 << (sizeId2 + 4));
                    if (i10 > 1) {
                        c1151Uf.A03();
                    }
                    for (int sizeId3 = 0; sizeId3 < min; sizeId3++) {
                        c1151Uf.A03();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void A0F(C1151Uf c1151Uf, int i10) {
        int i11 = 8;
        int lastScale = 8;
        for (int nextScale = 0; nextScale < i10; nextScale++) {
            if (lastScale != 0) {
                int lastScale2 = c1151Uf.A03();
                lastScale = ((lastScale2 + i11) + 256) % 256;
            }
            if (lastScale != 0) {
                i11 = lastScale;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0G(java.nio.ByteBuffer r6) {
        /*
            int r5 = r6.position()
            r4 = 0
            r3 = 0
        L6:
            int r0 = r3 + 1
            if (r0 >= r5) goto L3f
            byte r0 = r6.get(r3)
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = 3
            if (r4 != r0) goto L35
            r0 = 1
            if (r2 != r0) goto L39
            int r0 = r3 + 1
            byte r0 = r6.get(r0)
            r1 = r0 & 31
            r0 = 7
            if (r1 != r0) goto L39
            java.nio.ByteBuffer r1 = r6.duplicate()
            int r0 = r3 + (-3)
            r1.position(r0)
            r1.limit(r5)
            r0 = 0
            r6.position(r0)
            r6.put(r1)
            return
        L35:
            if (r2 != 0) goto L39
            int r4 = r4 + 1
        L39:
            if (r2 == 0) goto L3c
            r4 = 0
        L3c:
            int r3 = r3 + 1
            goto L6
        L3f:
            r6.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1149Ud.A0G(java.nio.ByteBuffer):void");
    }

    public static void A0H(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0I(String str, byte b10) {
        if (A0B(46, 9, 49).equals(str) && (b10 & 31) == 6) {
            return true;
        }
        if (A0B(55, 10, 46).equals(str)) {
            int i10 = b10 & 126;
            if (A02[2].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "ZlbV1M9c";
            if ((i10 >> 1) == 39) {
                return true;
            }
        }
        return false;
    }
}
