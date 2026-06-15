package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class UW {
    public static byte[] A09;
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final List<byte[]> A08;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static UW A00(C1648fq c1648fq) throws Q6 {
        try {
            c1648fq.A0g(21);
            int A0I = c1648fq.A0I() & 3;
            int A0I2 = c1648fq.A0I();
            int i10 = 0;
            int A092 = c1648fq.A09();
            for (int i11 = 0; i11 < A0I2; i11++) {
                c1648fq.A0g(1);
                int A0M = c1648fq.A0M();
                for (int i12 = 0; i12 < A0M; i12++) {
                    int A0M2 = c1648fq.A0M();
                    i10 += A0M2 + 4;
                    c1648fq.A0g(A0M2);
                }
            }
            c1648fq.A0f(A092);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            float f10 = 1.0f;
            String str = null;
            for (int i19 = 0; i19 < A0I2; i19++) {
                int A0I3 = c1648fq.A0I() & 63;
                int A0M3 = c1648fq.A0M();
                for (int i20 = 0; i20 < A0M3; i20++) {
                    int A0M4 = c1648fq.A0M();
                    System.arraycopy(AbstractC1149Ud.A03, 0, bArr, i13, AbstractC1149Ud.A03.length);
                    int length = i13 + AbstractC1149Ud.A03.length;
                    System.arraycopy(c1648fq.A0l(), c1648fq.A09(), bArr, length, A0M4);
                    if (A0I3 == 33 && i20 == 0) {
                        C1147Ua A05 = AbstractC1149Ud.A05(bArr, length, length + A0M4);
                        i14 = A05.A0A;
                        i15 = A05.A08;
                        i16 = A05.A02;
                        i17 = A05.A01;
                        i18 = A05.A03;
                        f10 = A05.A00;
                        str = AbstractC1597f0.A03(A05.A07, A05.A0B, A05.A06, A05.A05, A05.A0C, A05.A04);
                    }
                    i13 = length + A0M4;
                    c1648fq.A0g(A0M4);
                }
            }
            return new UW(i10 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), A0I + 1, i14, i15, f10, str, i16, i17, i18);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw Q6.A01(A01(0, 25, 115), e8);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{-65, -20, -20, -23, -20, -102, -22, -37, -20, -19, -29, -24, -31, -102, -62, -65, -48, -67, -102, -35, -23, -24, -32, -29, -31};
    }

    public UW(List<byte[]> initializationData, int i10, int i11, int i12, float f10, String str, int i13, int i14, int i15) {
        this.A08 = initializationData;
        this.A05 = i10;
        this.A06 = i11;
        this.A04 = i12;
        this.A00 = f10;
        this.A07 = str;
        this.A02 = i13;
        this.A01 = i14;
        this.A03 = i15;
    }
}
