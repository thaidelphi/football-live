package com.facebook.ads.redexgen.X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.fq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1648fq {
    public static byte[] A03;
    public static String[] A04 = {"sgZHF6WMmNxVNdT9Mvl6Q6eeNMrwMOQZ", "jGwn8aeGQCxBekE5FDCkmDw7GrnOmTWR", "0y8vMtDCGrbVU8SscKTuCWVKvyPZNN9Z", "1cf8sYJm05YI0H75zbqk3Isx5IhXC0R7", "RnxjHFNoW9S", "3CaCneN7411g617UmyF9jQBTzqrPlwcf", "IDDsILUBRhrpc1euPTRCRNr2seKql7oY", "kBhvxkQf94zBJaZRERNvuDiNxBHjsyP5"};
    public static final Set<Charset> A05;
    public static final char[] A06;
    public static final char[] A07;
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[0].charAt(22) != 'e') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[2] = "2nOv0WyHq1Pd1PfBQVHUVKbkSKSWcZRN";
            strArr[7] = "8oZvcmEd48OR3iG9WtUW0yYKO7XoUIjF";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 118);
            i13++;
        }
    }

    public static void A04() {
        A03 = new byte[]{70, 97, 121, 110, 99, 102, 107, 47, 90, 91, 73, 34, 55, 47, 124, 106, 126, 122, 106, 97, 108, 106, 47, 108, 96, 97, 123, 102, 97, 122, 110, 123, 102, 96, 97, 47, 109, 118, 123, 106, 53, 47, 96, 71, 95, 72, 69, 64, 77, 9, 124, 125, 111, 4, 17, 9, 90, 76, 88, 92, 76, 71, 74, 76, 9, 79, 64, 91, 90, 93, 9, 75, 80, 93, 76, 19, 9, 30, 37, 58, 106, 40, 35, 62, 106, 36, 37, 62, 106, 48, 47, 56, 37, 112, 106, 36, 31, 2, 4, 1, 1, 30, 3, 5, 20, 21, 81, 18, 25, 16, 3, 2, 20, 5, 75, 81};
    }

    static {
        A04();
        A06 = new char[]{'\r', '\n'};
        A07 = new char[]{'\n'};
        A05 = C0958Mm.A05(AbstractC1758hd.A02, AbstractC1758hd.A06, AbstractC1758hd.A03, AbstractC1758hd.A04, AbstractC1758hd.A05);
    }

    public C1648fq() {
        this.A00 = AbstractC1672gE.A07;
    }

    public C1648fq(int i10) {
        this.A00 = new byte[i10];
        this.A01 = i10;
    }

    public C1648fq(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C1648fq(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
    }

    private char A00(Charset charset, char[] cArr) {
        char A01;
        int i10;
        if ((charset.equals(AbstractC1758hd.A06) || charset.equals(AbstractC1758hd.A02)) && A07() >= 1) {
            A01 = AbstractC1330ad.A01(AbstractC2177op.A00(this.A00[this.A02]));
            i10 = 1;
        } else if ((charset.equals(AbstractC1758hd.A03) || charset.equals(AbstractC1758hd.A04)) && A07() >= 2) {
            A01 = AbstractC1330ad.A00(this.A00[this.A02], this.A00[this.A02 + 1]);
            i10 = 2;
        } else if (!charset.equals(AbstractC1758hd.A05) || A07() < 2) {
            return (char) 0;
        } else {
            A01 = AbstractC1330ad.A00(this.A00[this.A02 + 1], this.A00[this.A02]);
            i10 = 2;
        }
        if (AbstractC1330ad.A04(cArr, A01)) {
            this.A02 += i10;
            char character = AbstractC1330ad.A01(A01);
            return character;
        }
        return (char) 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        if (r4 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        r4 = r7.equals(com.facebook.ads.redexgen.X.AbstractC1758hd.A04);
        r1 = com.facebook.ads.redexgen.X.C1648fq.A04[6].charAt(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r1 == 114) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r4 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
        com.facebook.ads.redexgen.X.C1648fq.A04[4] = "IHZGXntpU11GnTLE5ebG2qUBH80DT5";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r4 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        if (r6.A00[r3] != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if (com.facebook.ads.redexgen.X.AbstractC1672gE.A16(r6.A00[r3 + 1]) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (r3 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
        if (r7.equals(com.facebook.ads.redexgen.X.AbstractC1758hd.A05) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f8, code lost:
        if (r7.equals(com.facebook.ads.redexgen.X.AbstractC1758hd.A04) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fa, code lost:
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0104, code lost:
        if (r3 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0129, code lost:
        throw new java.lang.IllegalArgumentException(A03(95, 21, 7) + r7);
     */
    /* JADX WARN: Incorrect condition in loop: B:9:0x0018 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(java.nio.charset.Charset r7) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1648fq.A01(java.nio.charset.Charset):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String A02(char r5) {
        /*
            r4 = this;
            int r0 = r4.A07()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r4.A02
        La:
            int r0 = r4.A01
            if (r3 >= r0) goto L17
            byte[] r0 = r4.A00
            r0 = r0[r3]
            if (r0 == r5) goto L17
            int r3 = r3 + 1
            goto La
        L17:
            byte[] r2 = r4.A00
            int r1 = r4.A02
            int r0 = r4.A02
            int r0 = r3 - r0
            java.lang.String r2 = com.facebook.ads.redexgen.X.AbstractC1672gE.A0r(r2, r1, r0)
            r4.A02 = r3
            int r1 = r4.A02
            int r0 = r4.A01
            if (r1 >= r0) goto L31
            int r0 = r4.A02
            int r0 = r0 + 1
            r4.A02 = r0
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1648fq.A02(char):java.lang.String");
    }

    private void A05(Charset charset) {
        if (A00(charset, A06) == '\r') {
            A00(charset, A07);
        }
    }

    public final double A06() {
        return Double.longBitsToDouble(A0P());
    }

    public final int A07() {
        return this.A01 - this.A02;
    }

    public final int A08() {
        return this.A00.length;
    }

    public final int A09() {
        return this.A02;
    }

    public final int A0A() {
        return this.A01;
    }

    public final int A0B() {
        return this.A00[this.A02] & 255;
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 24;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr3[i14] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return i15 | (bArr4[i16] & 255);
    }

    public final int A0D() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = ((bArr[i10] & 255) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return i13 | (bArr3[i14] & 255);
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & 255;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr3[i14] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return i15 | ((bArr4[i16] & 255) << 24);
    }

    public final int A0F() {
        int A0E = A0E();
        if (A0E >= 0) {
            return A0E;
        }
        throw new IllegalStateException(A03(77, 18, 60) + A0E);
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & 255;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return i11 | ((bArr2[i12] & 255) << 8);
    }

    public final int A0H() {
        int b22 = A0I();
        int b12 = A0I();
        int b42 = A0I();
        int b32 = A0I();
        int b23 = (b22 << 21) | (b12 << 14);
        int b13 = b42 << 7;
        return b23 | b13 | b32;
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int A0J() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | (bArr2[i12] & 255);
        int result = this.A02;
        this.A02 = result + 2;
        return i13;
    }

    public final int A0K() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 16;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return i13 | (bArr3[i14] & 255);
    }

    public final int A0L() {
        int A0C = A0C();
        if (A0C >= 0) {
            return A0C;
        }
        throw new IllegalStateException(A03(77, 18, 60) + A0C);
    }

    public final int A0M() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return i11 | (bArr2[i12] & 255);
    }

    public final long A0N() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j10 = (bArr[i10] & 255) | ((bArr2[i11] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j11 = j10 | ((bArr3[i12] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        long j12 = j11 | ((bArr4[i13] & 255) << 24);
        byte[] bArr5 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        long j13 = j12 | ((bArr5[i14] & 255) << 32);
        byte[] bArr6 = this.A00;
        int i15 = this.A02;
        this.A02 = i15 + 1;
        long j14 = j13 | ((bArr6[i15] & 255) << 40);
        byte[] bArr7 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        long j15 = j14 | ((bArr7[i16] & 255) << 48);
        byte[] bArr8 = this.A00;
        int i17 = this.A02;
        this.A02 = i17 + 1;
        return j15 | ((255 & bArr8[i17]) << 56);
    }

    public final long A0O() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j10 = (bArr[i10] & 255) | ((bArr2[i11] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j11 = j10 | ((bArr3[i12] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        return j11 | ((255 & bArr4[i13]) << 24);
    }

    public final long A0P() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr2[i11] & 255) << 48);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j11 = j10 | ((bArr3[i12] & 255) << 40);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        long j12 = j11 | ((bArr4[i13] & 255) << 32);
        byte[] bArr5 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        long j13 = j12 | ((bArr5[i14] & 255) << 24);
        byte[] bArr6 = this.A00;
        int i15 = this.A02;
        this.A02 = i15 + 1;
        long j14 = j13 | ((bArr6[i15] & 255) << 16);
        byte[] bArr7 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        long j15 = j14 | ((bArr7[i16] & 255) << 8);
        byte[] bArr8 = this.A00;
        int i17 = this.A02;
        this.A02 = i17 + 1;
        return j15 | (255 & bArr8[i17]);
    }

    public final long A0Q() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        byte[] bArr2 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr2[i11] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        long j11 = j10 | ((bArr3[i12] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        return j11 | (255 & bArr4[i13]);
    }

    public final long A0R() {
        long A0P = A0P();
        if (A0P >= 0) {
            return A0P;
        }
        throw new IllegalStateException(A03(77, 18, 60) + A0P);
    }

    public final long A0S() {
        int i10 = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j10 = bArr[length];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            int i12 = 1 << i11;
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[7];
            int charAt = str.charAt(3);
            int length2 = str2.charAt(3);
            if (charAt != length2) {
                throw new RuntimeException();
            }
            A04[4] = "ETCZXvmlxAco69DMc1yhp35R898zYg2c";
            int length3 = ((i12 & j10) > 0L ? 1 : ((i12 & j10) == 0L ? 0 : -1));
            if (length3 != 0) {
                i11--;
            } else if (i11 < 6) {
                int length4 = 1 << i11;
                j10 &= length4 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        if (i10 != 0) {
            for (int x10 = 1; x10 < i10; x10++) {
                byte[] bArr2 = this.A00;
                int length5 = this.A02;
                byte b10 = bArr2[length5 + x10];
                if (A04[6].charAt(10) != 'r') {
                    if ((b10 & 192) == 128) {
                        int length6 = b10 & 63;
                        j10 = (j10 << 6) | length6;
                    } else {
                        throw new NumberFormatException(A03(0, 42, 121) + j10);
                    }
                } else {
                    A04[0] = "ABLHFtiHTBntQUf582rh98ec122CeBpJ";
                    if ((b10 & 192) == 128) {
                        int length62 = b10 & 63;
                        j10 = (j10 << 6) | length62;
                    } else {
                        throw new NumberFormatException(A03(0, 42, 121) + j10);
                    }
                }
            }
            int x11 = this.A02;
            int i13 = x11 + i10;
            if (A04[4].length() != 10) {
                String[] strArr2 = A04;
                strArr2[1] = "SnOiIeyqmXHOny9ULGbkAWIlY2fxst1T";
                strArr2[3] = "n7vuYFEmJGDN0NemylZkb0tXGkCP6fKV";
                this.A02 = i13;
                return j10;
            }
            throw new RuntimeException();
        }
        throw new NumberFormatException(A03(42, 35, 95) + j10);
    }

    public final String A0T() {
        return A0Y(AbstractC1758hd.A06);
    }

    public final String A0U() {
        return A02((char) 0);
    }

    public final String A0V(int i10) {
        if (i10 == 0) {
            return A03(0, 0, 82);
        }
        int i11 = i10;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i10) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i11--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String A0r = AbstractC1672gE.A0r(bArr, stringLength4, i11);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i10;
        return A0r;
    }

    public final String A0W(int i10) {
        return A0X(i10, AbstractC1758hd.A06);
    }

    public final String A0X(int i10, Charset charset) {
        String str = new String(this.A00, this.A02, i10, charset);
        this.A02 += i10;
        return str;
    }

    public final String A0Y(Charset charset) {
        AbstractC1589es.A09(A05.contains(charset), A03(95, 21, 7) + charset);
        if (A07() == 0) {
            return null;
        }
        if (!charset.equals(AbstractC1758hd.A02)) {
            A0Z();
        }
        int A01 = A01(charset);
        int lineLimit = this.A02;
        String A0X = A0X(A01 - lineLimit, charset);
        int i10 = this.A02;
        String line = A04[0];
        if (line.charAt(22) != 'e') {
            throw new RuntimeException();
        }
        A04[4] = "PcHNAKzW7Id9pw1";
        int lineLimit2 = this.A01;
        if (i10 == lineLimit2) {
            return A0X;
        }
        A05(charset);
        return A0X;
    }

    public final Charset A0Z() {
        if (A07() >= 3 && this.A00[this.A02] == -17 && this.A00[this.A02 + 1] == -69 && this.A00[this.A02 + 2] == -65) {
            this.A02 += 3;
            return AbstractC1758hd.A06;
        } else if (A07() >= 2) {
            if (this.A00[this.A02] == -2 && this.A00[this.A02 + 1] == -1) {
                this.A02 += 2;
                if (A04[6].charAt(10) != 'r') {
                    throw new RuntimeException();
                }
                A04[5] = "VycTU3eqfjfr47GcRLoMj5IUz22El6lK";
                return AbstractC1758hd.A04;
            } else if (this.A00[this.A02] == -1 && this.A00[this.A02 + 1] == -2) {
                this.A02 += 2;
                return AbstractC1758hd.A05;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public final short A0a() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & 255;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (short) (i11 | ((bArr2[i12] & 255) << 8));
    }

    public final short A0b() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (short) (i11 | (bArr2[i12] & 255));
    }

    public final void A0c(int i10) {
        if (i10 > A08()) {
            this.A00 = Arrays.copyOf(this.A00, i10);
        }
    }

    public final void A0d(int i10) {
        A0j(A08() < i10 ? new byte[i10] : this.A00, i10);
    }

    public final void A0e(int i10) {
        AbstractC1589es.A07(i10 >= 0 && i10 <= this.A00.length);
        this.A01 = i10;
    }

    public final void A0f(int i10) {
        AbstractC1589es.A07(i10 >= 0 && i10 <= this.A01);
        this.A02 = i10;
    }

    public final void A0g(int i10) {
        A0f(this.A02 + i10);
    }

    public final void A0h(C1647fp c1647fp, int i10) {
        A0k(c1647fp.A00, 0, i10);
        c1647fp.A08(0);
    }

    public final void A0i(byte[] bArr) {
        A0j(bArr, bArr.length);
    }

    public final void A0j(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
        this.A02 = 0;
    }

    public final void A0k(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.A00, this.A02, bArr, i10, i11);
        this.A02 += i11;
    }

    public final byte[] A0l() {
        return this.A00;
    }
}
