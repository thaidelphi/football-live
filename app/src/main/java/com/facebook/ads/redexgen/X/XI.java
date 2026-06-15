package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class XI implements SF {
    public static String[] A06 = {"8PSohjXuSVSSQDPwBEk", "t4Hs7Ww5mO", "dL6tDKFDisbczFE4WAH", "jK", "I2Knu4FHKWmKzAIGocqEGPSIKM5Ebenu", "oU6qdMEFBj7Q", "FG4aNIG5Q1nwekQrW7vkmgtQhCJQAtgs", "L4mxeaWDwRm38CsKuYKoovYUpfK4vvIi"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public XI(SQ sq) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        i10 = sq.A02;
        this.A02 = i10;
        i11 = sq.A01;
        this.A01 = i11;
        i12 = sq.A05;
        this.A05 = i12;
        i13 = sq.A04;
        this.A04 = i13;
        i14 = sq.A03;
        this.A03 = i14;
        i15 = sq.A00;
        this.A00 = i15;
    }

    public static int A00(int i10) {
        switch (i10) {
            case 5:
                if (A06[3].length() != 25) {
                    String[] strArr = A06;
                    strArr[4] = "BNG05qyRs2mZV6WD2rmbG5TRvUrt0eGk";
                    strArr[7] = "f7pZeUCsWRm1YQfuocLJBoPFWEnFN5sr";
                    return 80000;
                }
                break;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                if (A06[6].charAt(24) != 'h') {
                    return 8000;
                }
                A06[3] = "hq3SB86D";
                return 8000;
            case 16:
                return 256000;
            case 17:
                String[] strArr2 = A06;
                if (strArr2[0].length() != strArr2[2].length()) {
                    return 336000;
                }
                String[] strArr3 = A06;
                strArr3[4] = "zretzXJHVUmEyYFQ3HsMA6SRviHWyoZI";
                strArr3[7] = "jHwyp2Walmm6958uxilmU8mUGTGi9XkN";
                return 336000;
            case 20:
                if (A06[3].length() != 25) {
                    String[] strArr4 = A06;
                    strArr4[4] = "GG98vWUQIpm81pZ67nhUjotTNKFJDPYc";
                    strArr4[7] = "CM88IZf6dimqvH1qPpXPZSy9yQdWnxZ6";
                    return 63750;
                }
                break;
        }
        throw new RuntimeException();
    }

    private final int A01(int i10) {
        int A00 = A00(i10);
        int maxByteRate = this.A03;
        return AbstractC0985Nn.A03((maxByteRate * A00) / 1000000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r7 != (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (com.facebook.ads.redexgen.X.XI.A06[3].length() == 25) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        com.facebook.ads.redexgen.X.XI.A06[3] = "oqpBsVMk";
        r0 = com.facebook.ads.redexgen.X.AbstractC06078d.A00(r7, 8, java.math.RoundingMode.CEILING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        r2 = com.facebook.ads.redexgen.X.XI.A06;
        r2[4] = "dB3ZnNprQ3mwz0ovSsH2ppCqzK69Sdyh";
        r2[7] = "ydi5PNFjFVmG0Dyu8ClJ25s8lXu47j7S";
        r0 = com.facebook.ads.redexgen.X.AbstractC06078d.A00(r7, 8, java.math.RoundingMode.CEILING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        if (r7 != (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        r0 = A00(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A02(int r6, int r7) {
        /*
            r5 = this;
            int r3 = r5.A04
            r0 = 5
            if (r6 != r0) goto L1c
            int r4 = r5.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.XI.A06
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L7d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XI.A06
            java.lang.String r1 = "HEiFXpgQNZJM438kJFTLfuhxhOYS2rJs"
            r0 = 6
            r2[r0] = r1
            int r3 = r3 * r4
        L1c:
            r4 = -1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.XI.A06
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L6e
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XI.A06
            java.lang.String r1 = "5BWcMaWhPC"
            r0 = 1
            r2[r0] = r1
            if (r7 == r4) goto L78
        L33:
            r4 = 8
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.XI.A06
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L5b
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XI.A06
            java.lang.String r1 = "oqpBsVMk"
            r0 = 3
            r2[r0] = r1
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = com.facebook.ads.redexgen.X.AbstractC06078d.A00(r7, r4, r0)
        L4f:
            long r2 = (long) r3
            long r0 = (long) r0
            long r2 = r2 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r0
            int r0 = com.facebook.ads.redexgen.X.AbstractC0985Nn.A03(r2)
            return r0
        L5b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XI.A06
            java.lang.String r1 = "dB3ZnNprQ3mwz0ovSsH2ppCqzK69Sdyh"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "ydi5PNFjFVmG0Dyu8ClJ25s8lXu47j7S"
            r0 = 7
            r2[r0] = r1
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = com.facebook.ads.redexgen.X.AbstractC06078d.A00(r7, r4, r0)
            goto L4f
        L6e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XI.A06
            java.lang.String r1 = "axfHiDnGFw"
            r0 = 1
            r2[r0] = r1
            if (r7 == r4) goto L78
            goto L33
        L78:
            int r0 = A00(r6)
            goto L4f
        L7d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XI.A02(int, int):int");
    }

    public static int A03(int i10, int i11, int i12) {
        return AbstractC0985Nn.A03(((i10 * i11) * i12) / 1000000);
    }

    private final int A04(int i10, int i11, int i12) {
        int maxAppBufferSize = this.A05 * i10;
        int targetBufferSize = this.A02;
        int minAppBufferSize = A03(targetBufferSize, i11, i12);
        int targetBufferSize2 = this.A01;
        return AbstractC1672gE.A07(maxAppBufferSize, minAppBufferSize, A03(targetBufferSize2, i11, i12));
    }

    private final int A05(int i10, int i11, int i12, int i13, int i14, int i15) {
        switch (i12) {
            case 0:
                return A04(i10, i14, i13);
            case 1:
                return A01(i11);
            case 2:
                return A02(i11, i15);
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final int A6v(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        int bufferSize = A05(i10, i11, i12, i13, i14, i15);
        return (((Math.max(i10, (int) (bufferSize * d10)) + i13) - 1) / i13) * i13;
    }
}
