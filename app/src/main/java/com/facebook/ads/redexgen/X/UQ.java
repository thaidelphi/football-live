package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class UQ {
    public static String[] A00 = {"qqSjYRVL0R4fOMN6eq6tSyIMmtx", "KP4nRrv428Hi8uh0HjHwFhMttEs5a1Ws", "LVI3yirONzj2Zw0xw1SQSP5O1xd", "DFzc4cRZ57hsSJTWwhddxQOyPP6jqw5w", "BpLMl61cVYQ3dcIR9aLdYxvi", "8aNAk6KmhJc4kEDFNE0kOxFy9v4j7Ks9", "JjWuqH3aS1ZUDRahEI0", "1oeql7WXepFii08NbpOX9aWyub"};

    public static int A00(C1648fq c1648fq, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c1648fq.A0I() + 1;
            case 7:
                int A0M = c1648fq.A0M() + 1;
                String[] strArr = A00;
                if (strArr[1].charAt(0) != strArr[3].charAt(0)) {
                    String[] strArr2 = A00;
                    strArr2[2] = "8XRXBGdvMB3isTuVSVPqRVOV7sB";
                    strArr2[0] = "UQ4CEnA7MEA7Yi4zsJCWCd1PAkZ";
                    return A0M;
                }
                throw new RuntimeException();
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long A01(WJ wj, UU uu) throws IOException {
        wj.AHr();
        boolean z10 = true;
        wj.A3x(1);
        byte[] bArr = new byte[1];
        wj.AG1(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        wj.A3x(2);
        int i10 = z10 ? 7 : 6;
        C1648fq c1648fq = new C1648fq(i10);
        c1648fq.A0e(UM.A00(wj, c1648fq.A0l(), 0, i10));
        wj.AHr();
        UP up = new UP();
        boolean isBlockSizeVariable = A09(c1648fq, uu, z10, up);
        if (isBlockSizeVariable) {
            return up.A00;
        }
        throw Q6.A01(null, null);
    }

    public static boolean A02(int i10, UU uu) {
        return i10 == 0 || i10 == uu.A01;
    }

    public static boolean A03(int i10, UU uu) {
        if (i10 <= 7) {
            return i10 == uu.A02 - 1;
        } else if (A00[5].charAt(14) != 'D') {
            throw new RuntimeException();
        } else {
            String[] strArr = A00;
            strArr[2] = "HwXvlN3qEirPFregv5DZoqvrW2m";
            strArr[0] = "hQTSzMKv3DY9CnNfAtnvRRSs3ar";
            if (i10 <= 10) {
                int i11 = uu.A02;
                if (A00[5].charAt(14) != 'D') {
                    throw new RuntimeException();
                }
                A00[5] = "zl64vn1JzbjvqODNTESJMNSzKvPMpryG";
                return i11 == 2;
            }
            return false;
        }
    }

    public static boolean A04(WJ wj, UU uu, int i10, UP up) throws IOException {
        long A8Y = wj.A8Y();
        byte[] bArr = new byte[2];
        wj.AG1(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            wj.AHr();
            wj.A3x((int) (A8Y - wj.A8d()));
            return false;
        }
        C1648fq c1648fq = new C1648fq(16);
        System.arraycopy(bArr, 0, c1648fq.A0l(), 0, 2);
        byte[] frameStartBytes = c1648fq.A0l();
        c1648fq.A0e(UM.A00(wj, frameStartBytes, 2, 14));
        wj.AHr();
        wj.A3x((int) (A8Y - wj.A8d()));
        return A08(c1648fq, uu, i10, up);
    }

    public static boolean A05(C1648fq c1648fq, int i10) {
        int A0I = c1648fq.A0I();
        int crc = c1648fq.A09();
        return A0I == AbstractC1672gE.A0J(c1648fq.A0l(), i10, crc + (-1), 0);
    }

    public static boolean A06(C1648fq c1648fq, UU uu, int i10) {
        int A002 = A00(c1648fq, i10);
        if (A002 != -1) {
            int blockSizeSamples = uu.A03;
            if (A002 <= blockSizeSamples) {
                return true;
            }
        }
        return false;
    }

    public static boolean A07(C1648fq c1648fq, UU uu, int i10) {
        int i11 = uu.A07;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == uu.A08;
        }
        if (A00[5].charAt(14) == 'D') {
            String[] strArr = A00;
            strArr[2] = "a51rRKuZV2cXItaFxpZ6X9EnWsR";
            strArr[0] = "AKkBhzIZAxOSYRj7iMxGlmVkBg0";
            if (i10 == 12) {
                return c1648fq.A0I() * 1000 == i11;
            }
            String[] strArr2 = A00;
            if (strArr2[2].length() == strArr2[0].length()) {
                A00[7] = "KY5QUBl3";
                if (i10 <= 14) {
                    int expectedSampleRate = c1648fq.A0M();
                    if (i10 == 14) {
                        expectedSampleRate *= 10;
                    }
                    return expectedSampleRate == i11;
                }
                return false;
            }
        }
        throw new RuntimeException();
    }

    public static boolean A08(C1648fq c1648fq, UU uu, int i10, UP up) {
        int A09 = c1648fq.A09();
        long A0Q = c1648fq.A0Q();
        long frameHeaderBytes = A0Q >>> 16;
        if (frameHeaderBytes != i10) {
            return false;
        }
        int blockSizeKey = (int) ((A0Q >> 8) & 15);
        long frameHeaderBytes2 = A0Q >> 1;
        int frameStartPosition = (int) (frameHeaderBytes2 & 7);
        return A03((int) ((A0Q >> 4) & 15), uu) && A02(frameStartPosition, uu) && !(((A0Q & 1) > 1L ? 1 : ((A0Q & 1) == 1L ? 0 : -1)) == 0) && A09(c1648fq, uu, (((A0Q >>> 16) & 1) > 1L ? 1 : (((A0Q >>> 16) & 1) == 1L ? 0 : -1)) == 0, up) && A06(c1648fq, uu, (int) ((A0Q >> 12) & 15)) && A07(c1648fq, uu, blockSizeKey) && A05(c1648fq, A09);
    }

    public static boolean A09(C1648fq c1648fq, UU uu, boolean z10, UP up) {
        long utf8Value;
        try {
            long A0S = c1648fq.A0S();
            if (z10) {
                utf8Value = A0S;
            } else {
                long utf8Value2 = uu.A03;
                utf8Value = utf8Value2 * A0S;
            }
            up.A00 = utf8Value;
            if (A00[5].charAt(14) != 'D') {
                throw new RuntimeException();
            }
            A00[7] = "mwGlELxCLBAXeWiE";
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
