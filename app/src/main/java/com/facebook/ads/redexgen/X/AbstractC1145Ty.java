package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ty  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1145Ty {
    public static byte[] A00;
    public static String[] A01 = {"40R9dmzdlp1xe9CmV4GbElnJ7Jv7tAYj", "OG7FLAHT3adxy041AkvLgoiA2", "EDXrQOXvkIJLh33uwjHFwZokxCFidM", "JU4rkXYKVd1oPLfpa6CgHCP6n0wa13dO", "Db0PGEE6tRACXJhio", "fNjquiebWJnXqtia8mj6YPJ7o3Z1o6lX", "9sebmkyYcm2R3kCtbVK", "emVnEDefuEO83oIyPBRCHm"};
    public static final int[] A02;
    public static final int[] A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{15, 15, 17, -18, 54, 51, 47, 50, 51, 64, -18, 55, 60, 65, 67, 52, 52, 55, 49, 55, 51, 60, 66, -18, 50, 47, 66, 47, -42, -42, -40, -75, -3, -6, -10, -7, -6, 7, -75, 12, 7, 4, 3, -4, -75, -24, -10, 2, 5, 1, -2, 3, -4, -75, -37, 7, -6, 6, 10, -6, 3, -8, 14, -75, -34, 3, -7, -6, 13, -97, -65, -63, -77, -46, -57, -54, -31, -6, -15, 4, -4, -15, -17, 0, -15, -16, -84, -14, -2, -19, -7, -15, -40, -15, -6, -13, 0, -12, -46, -8, -19, -13, -84, -55, -84, -67, -65, -40, -35, -33, -38, -38, -39, -36, -34, -49, -50, -118, -53, -33, -50, -45, -39, -118, -39, -52, -44, -49, -51, -34, -118, -34, -29, -38, -49, -92, -118, -80, -55, -50, -48, -53, -53, -54, -51, -49, -64, -65, 123, -64, -53, -98, -54, -55, -63, -60, -62, -107, 123, -53, -50, -110, -65, -116, -110, -114, -116};
    }

    static {
        A05();
        A03 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A02 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C1647fp c1647fp) {
        int A04 = c1647fp.A04(5);
        if (A04 == 31) {
            int audioObjectType = c1647fp.A04(6);
            return audioObjectType + 32;
        }
        return A04;
    }

    public static int A01(C1647fp c1647fp) throws Q6 {
        int A04 = c1647fp.A04(4);
        if (A04 == 15) {
            if (c1647fp.A01() >= 24) {
                int frequencyIndex = c1647fp.A04(24);
                return frequencyIndex;
            }
            throw Q6.A01(A04(0, 28, 124), null);
        } else if (A04 < 13) {
            int[] iArr = A03;
            String[] strArr = A01;
            String str = strArr[0];
            String str2 = strArr[5];
            int samplingFrequency = str.charAt(30);
            int frequencyIndex2 = str2.charAt(30);
            if (samplingFrequency != frequencyIndex2) {
                A01[3] = "Y6h4oqBTEnUn331Kap4Q6mUYvDwMp0QO";
                int frequencyIndex3 = iArr[A04];
                return frequencyIndex3;
            }
            throw new RuntimeException();
        } else {
            throw Q6.A01(A04(28, 41, 67), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C1144Tx A02(com.facebook.ads.redexgen.X.C1647fp r8, boolean r9) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            int r6 = A00(r8)
            int r5 = A01(r8)
            r7 = 4
            int r4 = r8.A04(r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 159(0x9f, float:2.23E-43)
            r1 = 8
            r0 = 12
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r3 = r0.toString()
            r0 = 5
            if (r6 == r0) goto L2f
            r0 = 29
            if (r6 != r0) goto L5a
        L2f:
            int r5 = A01(r8)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC1145Ty.A01
            r0 = 0
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Le2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC1145Ty.A01
            java.lang.String r1 = "5RrZIjq90h74D9AgT5p"
            r0 = 6
            r2[r0] = r1
            int r6 = A00(r8)
            r0 = 22
            if (r6 != r0) goto L5a
            int r4 = r8.A04(r7)
        L5a:
            if (r9 == 0) goto L99
            switch(r6) {
                case 1: goto L7f;
                case 2: goto L7f;
                case 3: goto L7f;
                case 4: goto L7f;
                case 5: goto L5f;
                case 6: goto L7f;
                case 7: goto L7f;
                case 8: goto L5f;
                case 9: goto L5f;
                case 10: goto L5f;
                case 11: goto L5f;
                case 12: goto L5f;
                case 13: goto L5f;
                case 14: goto L5f;
                case 15: goto L5f;
                case 16: goto L5f;
                case 17: goto L7f;
                case 18: goto L5f;
                case 19: goto L7f;
                case 20: goto L7f;
                case 21: goto L7f;
                case 22: goto L7f;
                case 23: goto L7f;
                default: goto L5f;
            }
        L5f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 106(0x6a, float:1.49E-43)
            r1 = 31
            r0 = 24
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.X.Q6 r0 = com.facebook.ads.redexgen.X.Q6.A00(r0)
            throw r0
        L7f:
            A06(r8, r6, r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC1145Ty.A01
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto La7
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC1145Ty.A01
            java.lang.String r1 = "Nk86Ouc3oVzPa4N1v"
            r0 = 4
            r2[r0] = r1
            switch(r6) {
                case 17: goto Lb2;
                case 18: goto L99;
                case 19: goto Lb2;
                case 20: goto Lb2;
                case 21: goto Lb2;
                case 22: goto Lb2;
                case 23: goto Lb2;
                default: goto L99;
            }
        L99:
            int[] r0 = com.facebook.ads.redexgen.X.AbstractC1145Ty.A02
            r2 = r0[r4]
            r0 = -1
            r1 = 0
            if (r2 == r0) goto Lbd
            com.facebook.ads.redexgen.X.Tx r0 = new com.facebook.ads.redexgen.X.Tx
            r0.<init>(r5, r2, r3)
            return r0
        La7:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC1145Ty.A01
            java.lang.String r1 = "H0XA3c7UwAEvGEJX0RLGQe"
            r0 = 7
            r2[r0] = r1
            switch(r6) {
                case 17: goto Lb2;
                case 18: goto L99;
                case 19: goto Lb2;
                case 20: goto Lb2;
                case 21: goto Lb2;
                case 22: goto Lb2;
                case 23: goto Lb2;
                default: goto Lb1;
            }
        Lb1:
            goto L99
        Lb2:
            r0 = 2
            int r6 = r8.A04(r0)
            if (r6 == r0) goto Lc2
            r0 = 3
            if (r6 == r0) goto Lc2
            goto L99
        Lbd:
            com.facebook.ads.redexgen.X.Q6 r0 = com.facebook.ads.redexgen.X.Q6.A01(r1, r1)
            throw r0
        Lc2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 137(0x89, float:1.92E-43)
            r1 = 22
            r0 = 9
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.X.Q6 r0 = com.facebook.ads.redexgen.X.Q6.A00(r0)
            throw r0
        Le2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1145Ty.A02(com.facebook.ads.redexgen.X.fp, boolean):com.facebook.ads.redexgen.X.Tx");
    }

    public static C1144Tx A03(byte[] bArr) throws Q6 {
        return A02(new C1647fp(bArr), false);
    }

    public static void A06(C1647fp c1647fp, int i10, int i11) {
        boolean frameLengthFlag = c1647fp.A0H();
        if (frameLengthFlag) {
            AbstractC1633fb.A07(A04(69, 7, 12), A04(76, 30, 58));
        }
        boolean frameLengthFlag2 = c1647fp.A0H();
        if (frameLengthFlag2) {
            c1647fp.A09(14);
        }
        boolean A0H = c1647fp.A0H();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                c1647fp.A09(3);
            }
            if (A0H) {
                if (i10 == 22) {
                    c1647fp.A09(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    c1647fp.A09(3);
                }
                c1647fp.A09(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A07(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }
}
