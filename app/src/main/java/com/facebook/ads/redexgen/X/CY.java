package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class CY {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-16, -7, -3, 49, -85, -83, -83, 1, -2, -9};
    }

    public static String A01(long j10) {
        String sb;
        String A002 = A00(0, 0, 78);
        if (j10 < 1000) {
            sb = j10 + A002;
        } else {
            String A003 = A00(0, 4, 79);
            if (j10 < 1000000) {
                StringBuilder sb2 = new StringBuilder();
                String formattedNumber = String.format(Locale.US, A003, Double.valueOf(j10 / 1000.0d));
                StringBuilder append = sb2.append(formattedNumber);
                String formattedNumber2 = A00(8, 1, 55);
                sb = append.append(formattedNumber2).toString();
            } else if (j10 < 1000000000) {
                StringBuilder sb3 = new StringBuilder();
                String formattedNumber3 = String.format(Locale.US, A003, Double.valueOf(j10 / 1000000.0d));
                StringBuilder append2 = sb3.append(formattedNumber3);
                String formattedNumber4 = A00(9, 1, 46);
                sb = append2.append(formattedNumber4).toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                String formattedNumber5 = String.format(Locale.US, A003, Double.valueOf(j10 / 1.0E9d));
                StringBuilder append3 = sb4.append(formattedNumber5);
                String formattedNumber6 = A00(7, 1, 67);
                sb = append3.append(formattedNumber6).toString();
            }
        }
        String A004 = A00(4, 3, 1);
        if (sb.contains(A004)) {
            return sb.replace(A004, A002);
        }
        return sb;
    }
}
