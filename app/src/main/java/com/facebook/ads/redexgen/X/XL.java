package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class XL {
    public static byte[] A02;
    public static String[] A03 = {"Sz6rOVbmyT88lFVllTc", "egXRpmwgP6RqmaSx0DyCwzMQT3X8PtBG", "iG0Nw0Jz29MycnW6RUnG2SDeom9sjgdQ", "pI8hsfuANJ7Jf7x", "x", "FZLWhtYZvxlKjm1EsTg", "W0TZO", "HmQ5pKzrkAuR3fio29tvDUKhIAD960yM"};
    public static final Pattern A04;
    public static final Pattern A05;
    public static final Pattern A06;
    public static final Pattern A07;
    public final int A00;
    public final PointF A01;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{82, 109, 84, 71, 80, 80, 75, 70, 71, 2, 74, 67, 81, 2, 64, 77, 86, 74, 2, 126, 82, 77, 81, 10, 90, 14, 91, 11, 2, 67, 76, 70, 2, 126, 79, 77, 84, 71, 10, 90, 19, 14, 91, 19, 14, 90, 16, 14, 91, 16, 11, 25, 2, 87, 81, 75, 76, 69, 2, 126, 82, 77, 81, 2, 84, 67, 78, 87, 71, 81, 12, 2, 77, 84, 71, 80, 80, 75, 70, 71, 31, 5, 112, 80, 66, 112, 87, 90, 79, 70, 13, 108, 85, 70, 81, 81, 74, 71, 70, 80, 80, 80, 109, 98, 36, 80, 104, 39, 37, 111, 111, 94, 92, 69, 86, 111, 27, 22, 2, 23, 64, 31, 22, 2, 23, 64, 31, 27, 22, 2, 23, 64, 26, 31, 27, 22, 2, 23, 64, 26, 27, 12, 9, 31, 22, 2, 23, 64, 31, 22, 2, 23, 64, 26, 12, 111, 26, 12, 12, 32, 63, 35, 12, 120, 120, 117, 97, 116, 35, 121, 124, 120, 117, 97, 116, 35, 121, 12, 121, 9, 38, Byte.MAX_VALUE, 9, 49, 126, 125, 106, 111, 9, 123, 9, 49, 126, 124, 106, 9, 38, Byte.MAX_VALUE, 7, 32, 115, 0, 5, 38, 6, 113, 114, 7, 38};
    }

    static {
        A05();
        A05 = Pattern.compile(A03(198, 11, 67));
        String A032 = A03(179, 19, 77);
        A07 = Pattern.compile(AbstractC1672gE.A0n(A03(157, 22, 72), A032));
        A06 = Pattern.compile(AbstractC1672gE.A0n(A03(109, 48, 43), A032));
        A04 = Pattern.compile(A03(100, 9, 20));
    }

    public XL(int i10, PointF pointF) {
        this.A00 = i10;
        this.A01 = pointF;
    }

    public static int A00(String str) {
        int A01;
        Matcher matcher = A04.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        A01 = XO.A01((String) AbstractC1589es.A01(matcher.group(1)));
        return A01;
    }

    public static PointF A01(String str) {
        String group;
        String group2;
        Matcher matcher = A07.matcher(str);
        Matcher matcher2 = A06.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                AbstractC1633fb.A06(A03(82, 18, 59), A03(1, 81, 58) + str + A03(0, 1, 109));
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else if (!find2) {
            if (A03[1].charAt(14) != 'I') {
                A03[7] = "h2Cos25qG1QyMaC8SiCZpnNQQnSXfofM";
                return null;
            }
            throw new RuntimeException();
        } else {
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        }
        return new PointF(Float.parseFloat(((String) AbstractC1589es.A01(group)).trim()), Float.parseFloat(((String) AbstractC1589es.A01(group2)).trim()));
    }

    public static XL A02(String str) {
        int parsedAlignment = -1;
        PointF pointF = null;
        Matcher matcher = A05.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC1589es.A01(matcher.group(1));
            try {
                PointF A01 = A01(str2);
                if (A01 != null) {
                    pointF = A01;
                }
            } catch (RuntimeException unused) {
            }
            try {
                int A00 = A00(str2);
                if (A00 != -1) {
                    parsedAlignment = A00;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new XL(parsedAlignment, pointF);
    }

    public static String A04(String str) {
        return A05.matcher(str).replaceAll(A03(0, 0, 52));
    }
}
