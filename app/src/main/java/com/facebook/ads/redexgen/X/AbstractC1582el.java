package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.el  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract /* synthetic */ class AbstractC1582el {
    public static byte[] A00;
    public static String[] A01 = {"CoYyX75SjT", "Lq6PbtIWpeQsK86x", "E", "jp", "nb3Uz12tr0ycxAJ", "tT", "ixjY8zFEZp9Cky6XeOPYQ4Rf9rzMFkQQ", "GptbYXHPLg6Unjq"};

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[4].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "TzzehKpgVO";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
            i13++;
        }
    }

    public static void A03() {
        A00 = new byte[]{19, 14, 25, 41, 26, 19, 24, 42, 55, 32, 16, 61, 42, 43, 38, 61};
    }

    static {
        A03();
    }

    public static long A00(InterfaceC1583em interfaceC1583em) {
        return interfaceC1583em.A6X(A02(0, 7, 49), -1L);
    }

    public static Uri A01(InterfaceC1583em interfaceC1583em) {
        String A6Z = interfaceC1583em.A6Z(A02(7, 9, 8), null);
        if (A6Z == null) {
            return null;
        }
        return Uri.parse(A6Z);
    }
}
