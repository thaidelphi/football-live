package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class UH {
    public static byte[] A03;
    public static String[] A04 = {"uj3rHjsom0sJClJ0NXL20owYfKPkbjbH", "eUqJ", "Cr1o4bci3gKjAr", "zzOT1RDfG2NUKwUsy3v3W2TxBy4r4F5a", "acUgPngQbh7WcTiokqWVXKccQqVBnFri", "ylF8RDD69hYXHC0qztLOI9QQaaChlSMT", "00hAog7y3YSBpL", "cixT0iQJ8DilItVUY2IBeJ30KLQw1TrP"};
    public final int A00;
    public final int A01;
    public final String A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{101, 88, 70, 90, 77, 88, 8, 103, 117, 107, 102, 66, 79, 92, 27};
    }

    static {
        A02();
    }

    public UH(int i10, int i11, String str) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.UH A00(com.facebook.ads.redexgen.X.C1648fq r8) {
        /*
            r0 = 2
            r8.A0g(r0)
            int r0 = r8.A0I()
            int r4 = r0 >> 1
            r3 = r0 & 1
            r1 = 5
            int r3 = r3 << r1
            int r0 = r8.A0I()
            int r0 = r0 >> 3
            r0 = r0 & 31
            r3 = r3 | r0
            r0 = 4
            if (r4 == r0) goto L3a
            if (r4 == r1) goto L3a
            r5 = 7
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.UH.A04
            r0 = 5
            r1 = r1[r0]
            r0 = 23
            char r1 = r1.charAt(r0)
            r0 = 49
            if (r1 == r0) goto Lb8
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.UH.A04
            java.lang.String r1 = "UTwr8Gfi5u0Bqf"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "U5TU0pSnz8KYfM"
            r0 = 6
            r2[r0] = r1
            if (r4 != r5) goto L9c
        L3a:
            r2 = 7
            r1 = 4
            r0 = 45
            java.lang.String r1 = A01(r2, r1, r0)
        L42:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r5 = r0.append(r1)
            r2 = 1
            r1 = 2
            r0 = 88
            java.lang.String r1 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r5.append(r1)
            java.lang.StringBuilder r8 = r0.append(r4)
            r0 = 10
            if (r3 >= r0) goto L71
        L5f:
            java.lang.StringBuilder r0 = r8.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = r0.toString()
            com.facebook.ads.redexgen.X.UH r0 = new com.facebook.ads.redexgen.X.UH
            r0.<init>(r4, r3, r1)
            return r0
        L71:
            r7 = 0
            r6 = 1
            r5 = 101(0x65, float:1.42E-43)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.UH.A04
            r0 = 5
            r1 = r1[r0]
            r0 = 23
            char r1 = r1.charAt(r0)
            r0 = 49
            if (r1 == r0) goto L90
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.UH.A04
            java.lang.String r1 = "ikQXJXH3uRpZp9SzhVRDDJFpVDX0aXzw"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = A01(r7, r6, r5)
            goto L5f
        L90:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.UH.A04
            java.lang.String r1 = "9ape7dLSpMxDqEWlarqBNaR68otbSAt9"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = A01(r7, r6, r5)
            goto L5f
        L9c:
            r0 = 8
            if (r4 != r0) goto La9
            r2 = 11
            r1 = 4
            r0 = 4
            java.lang.String r1 = A01(r2, r1, r0)
            goto L42
        La9:
            r0 = 9
            if (r4 != r0) goto Lb6
            r2 = 3
            r1 = 4
            r0 = 21
            java.lang.String r1 = A01(r2, r1, r0)
            goto L42
        Lb6:
            r0 = 0
            return r0
        Lb8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UH.A00(com.facebook.ads.redexgen.X.fq):com.facebook.ads.redexgen.X.UH");
    }
}
