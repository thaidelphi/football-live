package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class XK {
    public static byte[] A0B;
    public static String[] A0C = {"Ebptju1OilkgcHQEZEePTW6iT9tKrTtV", "1j5wDbzK8WGMiIKJ", "gfHC9K36xLa4Jl4jLZPZGTBHo0pOkbsp", "Ajx470iGFOyNZS", "Jy0O5FWEFX9zX9wb", "rWAzaVxClPoR0b1fl4kMaMzlm5SsULs6", "ZfnGm0CKKYB1tpiYcBuwkh9R", "FZ6uRnyA"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{-103, -83, -42, -39, -44, -56, -37, -95, 29, 40, 37, 35, 42, 41, 33, 42, 48, 48, 61, 58, 50, -16, -3, 0, -14, -13, 0, 1, 2, 7, -6, -13, -2, 7, 6, 12, 11, 1, 18, -3, -20, -9, -28, -17, -20, -26, 46, 33, 45, 37, -37, -31, -32, -40, -43, -38, -47, -49, -37, -40, -37, -31, -34, 42, 44, 35, 39, 27, 44, 51, 29, 41, 38, 41, 47, 44, 44, 45, 43, 34, 36, 30, 40, 46, 45, 41, 34, 24, 25, 38, 32, 29, 34, 25};
    }

    static {
        A02();
    }

    public XK(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.A06 = i10;
        this.A00 = i11;
        this.A08 = i12;
        this.A07 = i13;
        this.A03 = i14;
        this.A01 = i15;
        this.A04 = i16;
        this.A0A = i17;
        this.A09 = i18;
        this.A02 = i19;
        this.A05 = i20;
    }

    public static XK A00(String str) {
        int strikeoutIndex = -1;
        int borderStyleIndex = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int nameIndex = A01(1, 7, 11).length();
        String[] split = TextUtils.split(str.substring(nameIndex), A01(0, 1, 17));
        int boldIndex = 0;
        while (true) {
            int primaryColorIndex = split.length;
            int alignmentIndex = A0C[3].length();
            if (alignmentIndex == 32) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[1] = "wrGwHprbPjJcEsvl";
            strArr[4] = "oLGBindF0w9QBe9l";
            int outlineColorIndex = -1;
            if (boldIndex < primaryColorIndex) {
                String A01 = AbstractC1756hb.A01(split[boldIndex].trim());
                int nameIndex2 = A01.hashCode();
                switch (nameIndex2) {
                    case -1178781136:
                        if (A01.equals(A01(40, 6, 39))) {
                            outlineColorIndex = 6;
                            break;
                        }
                        break;
                    case -1026963764:
                        if (A01.equals(A01(85, 9, 88))) {
                            outlineColorIndex = 7;
                            break;
                        }
                        break;
                    case -192095652:
                        if (A01.equals(A01(76, 9, 93))) {
                            outlineColorIndex = 8;
                            break;
                        }
                        break;
                    case -70925746:
                        if (A01.equals(A01(63, 13, 94))) {
                            outlineColorIndex = 2;
                            break;
                        }
                        break;
                    case 3029637:
                        if (A01.equals(A01(17, 4, 114))) {
                            outlineColorIndex = 5;
                            break;
                        }
                        break;
                    case 3373707:
                        if (A01.equals(A01(46, 4, 100))) {
                            outlineColorIndex = 0;
                            break;
                        }
                        break;
                    case 366554320:
                        if (A01.equals(A01(32, 8, 60))) {
                            outlineColorIndex = 4;
                            break;
                        }
                        break;
                    case 767321349:
                        if (A01.equals(A01(21, 11, 50))) {
                            outlineColorIndex = 9;
                            break;
                        }
                        break;
                    case 1767875043:
                        if (A01.equals(A01(8, 9, 96))) {
                            outlineColorIndex = 1;
                            break;
                        }
                        break;
                    case 1988365454:
                        if (A01.equals(A01(50, 13, 16))) {
                            outlineColorIndex = 3;
                            break;
                        }
                        break;
                }
                switch (outlineColorIndex) {
                    case 0:
                        strikeoutIndex = boldIndex;
                        break;
                    case 1:
                        borderStyleIndex = boldIndex;
                        break;
                    case 2:
                        i10 = boldIndex;
                        break;
                    case 3:
                        i11 = boldIndex;
                        break;
                    case 4:
                        i12 = boldIndex;
                        break;
                    case 5:
                        i13 = boldIndex;
                        break;
                    case 6:
                        i14 = boldIndex;
                        break;
                    case 7:
                        i15 = boldIndex;
                        break;
                    case 8:
                        i16 = boldIndex;
                        break;
                    case 9:
                        i17 = boldIndex;
                        break;
                }
                boldIndex++;
            } else if (strikeoutIndex != -1) {
                int nameIndex3 = split.length;
                return new XK(strikeoutIndex, borderStyleIndex, i10, i11, i12, i13, i14, i15, i16, i17, nameIndex3);
            } else {
                return null;
            }
        }
    }
}
