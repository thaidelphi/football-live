package com.facebook.ads.redexgen.X;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.nio.ShortBuffer;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SY {
    public static String[] A0M = {"YHmtT3GFYdUF87wnaK0kzK9mOTxZmLbv", "xcHmGgjhzC9joQpYTgW9a0TQ1Yxx", "TIux5IxHvr99Q0bGMBYzDoHBpeImyuC5", "F", "ZAaNVnfMKdz195Fkc2S8Hlb6NWUfbPVe", "i8GmYFF2CID1aE2EtPVLW4OiDAvik4C7", "TvmikcDlN7gf3aG4ICUCQdSpeRef9N68", "sMLwg818KTPPZ2ESZgmiO24cwEP9o7TE"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public SY(int i10, int i11, float f10, float f11, int i12) {
        this.A0H = i10;
        this.A0G = i11;
        this.A0F = f10;
        this.A0D = f11;
        this.A0E = i10 / i12;
        this.A0K = i10 / CommonGatewayClient.CODE_400;
        this.A0I = i10 / 65;
        this.A0J = this.A0I * 2;
        this.A0L = new short[this.A0J];
        this.A0A = new short[this.A0J * i11];
        this.A0B = new short[this.A0J * i11];
        this.A0C = new short[this.A0J * i11];
    }

    private int A00(int i10) {
        int min = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i10, min);
        int frameCount = this.A09;
        this.A09 = frameCount - min;
        return min;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        if (A0F(r5, r4) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        r5 = r7.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
        if (A0F(r5, r4) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
        r5 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(short[] r8, int r9) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SY.A01(short[], int):int");
    }

    private int A02(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            float f11 = (i11 * f10) / (1.0f - f10);
            String[] strArr = A0M;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[6] = "K5m6aGWcLq3rgbiPwQQLX59JZaITOBon";
            strArr2[0] = "LsmWvOtDmwibEtQwbar92p2hWPRdmQNn";
            i12 = (int) f11;
        } else {
            i12 = i11;
            int newFrameCount = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            this.A09 = newFrameCount;
        }
        int newFrameCount2 = i11 + i12;
        this.A0B = A0G(this.A0B, this.A05, newFrameCount2);
        short[] sArr2 = this.A0B;
        int i13 = this.A05;
        int newFrameCount3 = this.A0G;
        int i14 = i13 * newFrameCount3;
        int newFrameCount4 = this.A0G;
        System.arraycopy(sArr, this.A0G * i10, sArr2, i14, newFrameCount4 * i11);
        A0C(i12, this.A0G, this.A0B, this.A05 + i11, sArr, i10 + i11, sArr, i10);
        int newFrameCount5 = this.A05;
        this.A05 = newFrameCount5 + i11 + i12;
        return i12;
    }

    private int A03(short[] sArr, int i10, float f10, int i11) {
        int newFrameCount;
        if (f10 >= 2.0f) {
            newFrameCount = (int) (i11 / (f10 - 1.0f));
        } else {
            this.A09 = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            newFrameCount = i11;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        this.A0B = A0G(sArr2, newFrameCount2, newFrameCount);
        A0C(newFrameCount, this.A0G, this.A0B, this.A05, sArr, i10, sArr, i10 + i11);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 255;
        int period = 1;
        int maxDiff = 0;
        int bestPeriod = this.A0G;
        int i15 = i10 * bestPeriod;
        while (i11 <= i12) {
            int diff = 0;
            for (int minDiff = 0; minDiff < i11; minDiff++) {
                int bestPeriod2 = i15 + minDiff;
                short s10 = sArr[bestPeriod2];
                int bestPeriod3 = i15 + i11;
                int worstPeriod = s10 - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                diff += bestPeriod4;
            }
            int worstPeriod2 = diff * i13;
            int bestPeriod5 = period * i11;
            if (worstPeriod2 < bestPeriod5) {
                period = diff;
                i13 = i11;
            }
            int worstPeriod3 = diff * i14;
            int bestPeriod6 = maxDiff * i11;
            if (worstPeriod3 > bestPeriod6) {
                maxDiff = diff;
                i14 = i11;
            }
            i11++;
        }
        this.A02 = period / i13;
        this.A01 = maxDiff / i14;
        return i13;
    }

    private short A05(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[this.A0G + i10];
        int leftPosition = this.A03 * i11;
        int position = (this.A04 + 1) * i12;
        int i13 = position - leftPosition;
        int position2 = position - (this.A04 * i12);
        short left = (short) (((i13 * s10) + ((position2 - i13) * s11)) / position2);
        return left;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06() {
        /*
            r8 = this;
            int r6 = r8.A05
            float r7 = r8.A0F
            float r0 = r8.A0D
            float r7 = r7 / r0
            float r5 = r8.A0E
            float r0 = r8.A0D
            float r5 = r5 * r0
            double r3 = (double) r7
            r1 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L20
            double r3 = (double) r7
            r1 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2d
        L20:
            r8.A07(r7)
        L23:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L2c
            r8.A08(r5, r6)
        L2c:
            return
        L2d:
            short[] r2 = r8.A0A
            int r1 = r8.A00
            r0 = 0
            r8.A0D(r2, r0, r1)
            r8.A00 = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SY.A06():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r0 > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        r0 = A03(r8.A0A, r6, r9, r5);
        r6 = r6 + (r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (r2 > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
        r0 = A02(r8.A0A, r6, r9, r5);
        r6 = r6 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(float r9) {
        /*
            r8 = this;
            int r1 = r8.A00
            int r0 = r8.A0J
            if (r1 >= r0) goto L7
            return
        L7:
            int r7 = r8.A00
            r6 = 0
        La:
            int r3 = r8.A09
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.SY.A0M
            r0 = 5
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L8d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.SY.A0M
            java.lang.String r1 = "scjeX6US3ZHLg2z2iUc3vQRSHPhA"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "Z"
            r0 = 3
            r2[r0] = r1
            if (r3 <= 0) goto L3c
            int r0 = r8.A00(r6)
            int r6 = r6 + r0
        L33:
            int r0 = r8.A0J
            int r0 = r0 + r6
            if (r0 <= r7) goto La
            r8.A0B(r6)
            return
        L3c:
            short[] r0 = r8.A0A
            int r5 = r8.A01(r0, r6)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.SY.A0M
            r0 = 6
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L71
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.SY.A0M
            java.lang.String r1 = "xuma6ybetVHFpOM3ZgtMVw3Ab3NyEq3r"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "7pmqk4VYWOpVB9E55Zklf5LwzHUsUloa"
            r0 = 0
            r2[r0] = r1
            double r3 = (double) r9
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L85
        L68:
            short[] r0 = r8.A0A
            int r0 = r8.A03(r0, r6, r9, r5)
            int r0 = r0 + r5
            int r6 = r6 + r0
            goto L33
        L71:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.SY.A0M
            java.lang.String r1 = "wUwDrg56jnH9JJOTFVTDM6fH5N4GxsKJ"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "6qCXcPZgRDinLxbiwDUx4Lym6mPEzEwx"
            r0 = 2
            r2[r0] = r1
            double r0 = (double) r9
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L85
            goto L68
        L85:
            short[] r0 = r8.A0A
            int r0 = r8.A02(r0, r6, r9, r5)
            int r6 = r6 + r0
            goto L33
        L8d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SY.A07(float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        r7 = r9.A04 + 1;
        r2 = com.facebook.ads.redexgen.X.SY.A0M;
        r1 = r2[1];
        r0 = r2[3];
        r1 = r1.length();
        r0 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
        if (r1 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        r2 = com.facebook.ads.redexgen.X.SY.A0M;
        r2[5] = "kDaEzZElnOFQMAMJwWxti37YUPYjrInx";
        r2[2] = "OX0JIbuly1Y9DotOXhwmXUl8HdrOPVUG";
        r9.A04 = r7;
        r0 = r9.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
        if (r0 != r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
        r9.A04 = 0;
        r0 = r9.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (r0 != r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
        com.facebook.ads.redexgen.X.AbstractC1589es.A08(r3);
        r9.A03 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
        r2 = com.facebook.ads.redexgen.X.SY.A0M;
        r2[4] = "k5CMBLvzUinTucSIgvM2ofDUgwgNJhuf";
        r2[7] = "0hvoh8RRl8vog5e2liIHSOPz5wyjvijZ";
        r9.A04 = r7;
        r0 = r9.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
        if (r0 != r4) goto L37;
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x0057 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(float r10, int r11) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SY.A08(float, int):void");
    }

    private void A09(int i10) {
        int i11 = this.A05 - i10;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        this.A0C = A0G(sArr, frameCount, i11);
        short[] sArr2 = this.A0C;
        int i12 = this.A06;
        int frameCount2 = this.A0G;
        int i13 = i12 * frameCount2;
        int frameCount3 = this.A0G;
        System.arraycopy(this.A0B, this.A0G * i10, sArr2, i13, frameCount3 * i11);
        this.A05 = i10;
        int frameCount4 = this.A06;
        this.A06 = frameCount4 + i11;
    }

    private void A0A(int i10) {
        if (i10 == 0) {
            return;
        }
        System.arraycopy(this.A0C, this.A0G * i10, this.A0C, 0, (this.A06 - i10) * this.A0G);
        this.A06 -= i10;
    }

    private void A0B(int i10) {
        int i11 = this.A00 - i10;
        System.arraycopy(this.A0A, this.A0G * i10, this.A0A, 0, this.A0G * i11);
        this.A00 = i11;
    }

    public static void A0C(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int t10 = (i14 * i11) + i15;
            int d10 = (i13 * i11) + i15;
            for (int u10 = 0; u10 < i10; u10++) {
                int i17 = i10 - u10;
                int o10 = sArr2[d10] * i17;
                int i18 = sArr3[t10] * u10;
                sArr[i16] = (short) ((o10 + i18) / i10);
                i16 += i11;
                d10 += i11;
                t10 += i11;
            }
        }
    }

    private void A0D(short[] sArr, int i10, int i11) {
        this.A0B = A0G(this.A0B, this.A05, i11);
        System.arraycopy(sArr, this.A0G * i10, this.A0B, this.A05 * this.A0G, this.A0G * i11);
        this.A05 += i11;
    }

    private void A0E(short[] sArr, int i10, int i11) {
        int i12 = this.A0J / i11;
        int j10 = this.A0G * i11;
        int frameCount = this.A0G;
        int i13 = i10 * frameCount;
        for (int value = 0; value < i12; value++) {
            int i14 = 0;
            for (int samplesPerValue = 0; samplesPerValue < j10; samplesPerValue++) {
                int frameCount2 = value * j10;
                i14 += sArr[frameCount2 + i13 + samplesPerValue];
            }
            this.A0L[value] = (short) (i14 / j10);
        }
    }

    private boolean A0F(int i10, int i11) {
        if (i10 != 0) {
            int i12 = this.A08;
            String[] strArr = A0M;
            if (strArr[1].length() != strArr[3].length()) {
                String[] strArr2 = A0M;
                strArr2[1] = "1idtnhWPxnw4XJ1NpfbvLRsBiVrx";
                strArr2[3] = "1";
                if (i12 == 0 || i11 > i10 * 3 || i10 * 2 <= this.A07 * 3) {
                    return false;
                }
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    private short[] A0G(short[] sArr, int i10, int i11) {
        int length = sArr.length / this.A0G;
        if (i10 + i11 <= length) {
            return sArr;
        }
        int currentCapacityFrames = length * 3;
        int i12 = (currentCapacityFrames / 2) + i11;
        int i13 = this.A0G;
        String[] strArr = A0M;
        String str = strArr[4];
        String str2 = strArr[7];
        int newCapacityFrames = str.charAt(16);
        int currentCapacityFrames2 = str2.charAt(16);
        if (newCapacityFrames != currentCapacityFrames2) {
            String[] strArr2 = A0M;
            strArr2[6] = "dZm6Ae9J9bKjxiNtqzervrTMrx3o3qym";
            strArr2[0] = "fymny454LVZnv8QoAjBzuSSckcTlUd7Z";
            return Arrays.copyOf(sArr, i13 * i12);
        }
        throw new RuntimeException();
    }

    public final int A0H() {
        return this.A05 * this.A0G * 2;
    }

    public final int A0I() {
        return this.A00 * this.A0G * 2;
    }

    public final void A0J() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0K() {
        int i10 = this.A00;
        float f10 = this.A0F / this.A0D;
        float r10 = this.A0E * this.A0D;
        int i11 = this.A05;
        float s10 = i10;
        int remainingFrameCount = this.A06;
        int i12 = i11 + ((int) ((((s10 / f10) + remainingFrameCount) / r10) + 0.5f));
        short[] sArr = this.A0A;
        int i13 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i13, (remainingFrameCount2 * 2) + i10);
        int expectedOutputFrames = 0;
        while (true) {
            int remainingFrameCount3 = this.A0J;
            int i14 = remainingFrameCount3 * 2;
            int remainingFrameCount4 = this.A0G;
            if (expectedOutputFrames >= i14 * remainingFrameCount4) {
                break;
            }
            short[] sArr2 = this.A0A;
            int remainingFrameCount5 = this.A0G;
            sArr2[(remainingFrameCount5 * i10) + expectedOutputFrames] = 0;
            expectedOutputFrames++;
        }
        int i15 = this.A00;
        int remainingFrameCount6 = this.A0J;
        this.A00 = i15 + (remainingFrameCount6 * 2);
        A06();
        int remainingFrameCount7 = this.A05;
        if (remainingFrameCount7 > i12) {
            this.A05 = i12;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        shortBuffer.put(sArr, 0, framesToRead * min);
        int framesToRead2 = this.A05;
        this.A05 = framesToRead2 - min;
        short[] sArr2 = this.A0B;
        int i10 = this.A0G * min;
        short[] sArr3 = this.A0B;
        int i11 = this.A05;
        int framesToRead3 = this.A0G;
        System.arraycopy(sArr2, i10, sArr3, 0, i11 * framesToRead3);
    }

    public final void A0M(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining() / this.A0G;
        int framesToWrite = this.A0G;
        int i10 = framesToWrite * remaining * 2;
        short[] sArr = this.A0A;
        int framesToWrite2 = this.A00;
        this.A0A = A0G(sArr, framesToWrite2, remaining);
        short[] sArr2 = this.A0A;
        int bytesToWrite = this.A00;
        int framesToWrite3 = this.A0G;
        int bytesToWrite2 = bytesToWrite * framesToWrite3;
        int framesToWrite4 = i10 / 2;
        shortBuffer.get(sArr2, bytesToWrite2, framesToWrite4);
        int framesToWrite5 = this.A00;
        this.A00 = framesToWrite5 + remaining;
        A06();
    }
}
