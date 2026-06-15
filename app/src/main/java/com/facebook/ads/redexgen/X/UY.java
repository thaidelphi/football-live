package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class UY {
    public static String[] A07 = {"6lKD24rvA6twWAFCuJqLDndMy0MEJo", "fwW4l2njQMgwVF41THZpCuESW8WVOZss", "5HhdI5c5s9rdpF4P3cRZ0qP6CxCYrAd", "t2WB", "sDUMSVERNdaSzfrLvCzOgzt0UbxdCP", "cjk5xNWIWWK82xnznD733V6szPPR61", "OmoA69jtcEojmviRP3sKzbDSnT02", "4KPERwnIePM4i70x2ttJPrTSzfmQ"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public final boolean A00(int i10) {
        boolean A06;
        int i11;
        int padding;
        int samplingRateIndex;
        int i12;
        String[] strArr;
        int[] iArr;
        int version;
        int[] iArr2;
        int[] iArr3;
        int version2;
        int[] iArr4;
        int[] iArr5;
        int version3;
        int[] iArr6;
        A06 = UZ.A06(i10);
        if (!A06 || (i11 = (i10 >>> 19) & 3) == 1 || (padding = (i10 >>> 17) & 3) == 0 || (samplingRateIndex = (i10 >>> 12) & 15) == 0 || samplingRateIndex == 15 || (i12 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.A05 = i11;
        strArr = UZ.A08;
        int version4 = 3 - padding;
        this.A06 = strArr[version4];
        iArr = UZ.A07;
        int version5 = iArr[i12];
        this.A03 = version5;
        if (i11 == 2) {
            int version6 = this.A03;
            this.A03 = version6 / 2;
        } else if (i11 == 0) {
            int version7 = this.A03;
            this.A03 = version7 / 4;
        }
        int i13 = (i10 >>> 9) & 1;
        version = UZ.A02(i11, padding);
        this.A04 = version;
        if (padding == 3) {
            if (i11 == 3) {
                iArr6 = UZ.A02;
                int version8 = samplingRateIndex - 1;
                version3 = iArr6[version8];
            } else {
                iArr5 = UZ.A06;
                int version9 = samplingRateIndex - 1;
                version3 = iArr5[version9];
            }
            this.A00 = version3;
            int version10 = this.A00;
            int i14 = version10 * 12;
            int version11 = this.A03;
            this.A02 = ((i14 / version11) + i13) * 4;
        } else {
            if (i11 == 3) {
                if (padding == 2) {
                    iArr4 = UZ.A03;
                    int version12 = samplingRateIndex - 1;
                    version2 = iArr4[version12];
                } else {
                    iArr3 = UZ.A04;
                    int samplingRateIndex2 = samplingRateIndex - 1;
                    if (A07[3].length() != 4) {
                        throw new RuntimeException();
                    }
                    A07[5] = "zIrhILeZHWAQOm3qlpNs0lQL3EWYD1";
                    version2 = iArr3[samplingRateIndex2];
                }
                this.A00 = version2;
                int version13 = this.A00;
                int i15 = version13 * 144;
                int version14 = this.A03;
                this.A02 = (i15 / version14) + i13;
            } else {
                iArr2 = UZ.A05;
                int version15 = samplingRateIndex - 1;
                this.A00 = iArr2[version15];
                int i16 = padding == 1 ? 72 : 144;
                int version16 = this.A00;
                int i17 = i16 * version16;
                int version17 = this.A03;
                this.A02 = (i17 / version17) + i13;
            }
        }
        int version18 = i10 >> 6;
        this.A01 = (version18 & 3) == 3 ? 1 : 2;
        return true;
    }
}
