package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class XO {
    public static byte[] A0A;
    public static String[] A0B = {"Ra1PaCkh1rgi790ufp8e8JsgDkHtaiwn", "XjKtRiBw03jyMrDwhe0OFsIRvq9LMiCW", "PmnysjqZLOgI7TVJzuO99Pn16krx", "hvdEVhgzapQEYk1Pwq7sghpO51NdDPff", "x0pRs1fi7hlUzZqqSt8WTBfGELE5t4G", "KVE5AursVu26pREVdnY1R7nJBPi7CMsp", "3gjQu2LYQHB3CxsZGi5cn9GrIGCdG10", "I1UJ3rdjbYF9W7gJ9858vTrwCI0z"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-17, 17, 9, -4, 41, 68, 76, 79, 72, 71, 3, 87, 82, 3, 83, 68, 85, 86, 72, 3, 69, 82, 82, 79, 72, 68, 81, 3, 89, 68, 79, 88, 72, 29, 3, 10, -34, -7, 1, 4, -3, -4, -72, 12, 7, -72, 8, -7, 10, 11, -3, -72, -5, 7, 4, 7, 10, -72, -3, 16, 8, 10, -3, 11, 11, 1, 7, 6, -46, -72, -65, -28, -1, 7, 10, 3, 2, -66, 18, 13, -66, 14, -1, 16, 17, 3, -66, 4, 13, 12, 18, -66, 17, 7, 24, 3, -40, -66, -59, 13, 43, 50, 51, 54, 45, 50, 43, -28, 57, 50, 47, 50, 51, 59, 50, -28, 6, 51, 54, 40, 41, 54, 23, 56, 61, 48, 41, -2, -28, -10, 20, 27, 28, 31, 22, 27, 20, -51, 34, 27, 24, 27, 28, 36, 27, -51, 14, 25, 22, 20, 27, 26, 18, 27, 33, -25, -51, -27, -3, -5, 2, 2, -5, 0, -7, -78, -1, -13, -2, -8, 1, 4, -1, -9, -10, -78, -71, -27, 6, 11, -2, -9, -52, -71, -78, -2, -5, 0, -9, -78, -70, -9, 10, 2, -9, -11, 6, -9, -10, -78, -73, 5, -78, 8, -13, -2, 7, -9, 5, -66, -78, -8, 1, 7, 0, -10, -78, -73, 5, -69, -52, -78, -71, -73, 5, -71, -25, -1, -3, 4, 4, -3, 2, -5, -76, 1, -11, 0, -6, 3, 6, 1, -7, -8, -76, -69, -25, 8, 13, 0, -7, -50, -69, -76, 0, -3, 2, -7, -50, -76, -69, 4, 36, 18, 4, 37, 42, 29, 22, 5, 38, 43, 30, 23, -20};
    }

    static {
        A07();
    }

    public XO(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.A05 = str;
        this.A01 = i10;
        this.A04 = num;
        this.A03 = num2;
        this.A00 = f10;
        this.A06 = z10;
        this.A07 = z11;
        this.A09 = z12;
        this.A08 = z13;
        this.A02 = i11;
    }

    public static float A00(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e8) {
            AbstractC1633fb.A0A(A06(261, 8, 75), A06(71, 28, 56) + str + A06(2, 1, 124), e8);
            return -3.4028235E38f;
        }
    }

    public static int A01(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (A08(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC1633fb.A07(A06(261, 8, 75), A06(129, 28, 71) + str);
        return -1;
    }

    public static int A02(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (A09(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC1633fb.A07(A06(261, 8, 75), A06(99, 30, 94) + str);
        return -1;
    }

    public static XO A04(String str, XK xk) {
        int i10;
        Integer num;
        Integer num2;
        float f10;
        String A06 = A06(269, 6, 76);
        AbstractC1589es.A07(str.startsWith(A06));
        String[] split = TextUtils.split(str.substring(A06.length()), A06(3, 1, 106));
        int length = split.length;
        int i11 = xk.A05;
        String A062 = A06(261, 8, 75);
        if (length != i11) {
            AbstractC1633fb.A07(A062, AbstractC1672gE.A0n(A06(157, 69, 44), Integer.valueOf(xk.A05), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[xk.A06].trim();
            if (xk.A00 != -1) {
                i10 = A01(split[xk.A00].trim());
            } else {
                i10 = -1;
            }
            if (xk.A08 != -1) {
                num = A05(split[xk.A08].trim());
            } else {
                num = null;
            }
            if (xk.A07 != -1) {
                num2 = A05(split[xk.A07].trim());
            } else {
                num2 = null;
            }
            if (xk.A03 != -1) {
                f10 = A00(split[xk.A03].trim());
            } else {
                f10 = -3.4028235E38f;
            }
            return new XO(trim, i10, num, num2, f10, xk.A01 != -1 && A0A(split[xk.A01].trim()), xk.A04 != -1 && A0A(split[xk.A04].trim()), xk.A0A != -1 && A0A(split[xk.A0A].trim()), xk.A09 != -1 && A0A(split[xk.A09].trim()), xk.A02 != -1 ? A02(split[xk.A02].trim()) : -1);
        } catch (RuntimeException e8) {
            AbstractC1633fb.A0A(A062, A06(226, 35, 46) + str + A06(2, 1, 124), e8);
            return null;
        }
    }

    public static Integer A05(String str) {
        long parseLong;
        try {
            if (str.startsWith(A06(0, 2, 99))) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            AbstractC1589es.A07(parseLong <= 4294967295L);
            int A03 = AbstractC0985Nn.A03(((parseLong >> 24) & 255) ^ 255);
            int r10 = AbstractC0985Nn.A03((parseLong >> 16) & 255);
            int g10 = AbstractC0985Nn.A03((parseLong >> 8) & 255);
            int A032 = AbstractC0985Nn.A03(parseLong & 255);
            int b10 = A0B[5].charAt(6);
            if (b10 != 112) {
                A0B[1] = "r6xLINEFKHUGTP8iRUGYtPtWO4lkXsfs";
                int a10 = Color.argb(A03, A032, g10, r10);
                return Integer.valueOf(a10);
            }
            throw new RuntimeException();
        } catch (IllegalArgumentException e8) {
            AbstractC1633fb.A0A(A06(261, 8, 75), A06(36, 35, 50) + str + A06(2, 1, 124), e8);
            return null;
        }
    }

    public static boolean A08(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean A09(int i10) {
        switch (i10) {
            case 1:
            case 3:
                return true;
            case 2:
            default:
                String[] strArr = A0B;
                if (strArr[6].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                A0B[1] = "gBv9lIebqrU56j4K0xEBDyZ3G03KYZRu";
                return false;
        }
    }

    public static boolean A0A(String str) {
        try {
            int value = Integer.parseInt(str);
            return value == 1 || value == -1;
        } catch (NumberFormatException e8) {
            AbstractC1633fb.A0A(A06(261, 8, 75), A06(4, 32, 125) + str + A06(2, 1, 124), e8);
            return false;
        }
    }
}
