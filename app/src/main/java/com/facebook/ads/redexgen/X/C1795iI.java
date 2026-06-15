package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.iI  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1795iI extends BY {
    public static byte[] A01;
    public static String[] A02 = {"s6McyFvuEc1XiqBn", "hcEKpUAFoi0", "Uxw7Yfkl7Y0EbUXumb1zp", "2eIZNGpCiZfiyfWjpoEHXYEZ89sKOMjU", "P6wJZ5NPzNm0cd9T3B6a4kCxx00um", "avjdKGQRQHprL3nlmChXTO66aPxw1Ezk", "jTYXriUGWk0Q5Onqj2MBy1ZRmPDEVS5l", "vP4DO0q8Z4bTalFPzqbCoE7Mp2WJV4fR"};
    public final /* synthetic */ Context A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[3].charAt(28) == 'p') {
                throw new RuntimeException();
            }
            A02[3] = "yencg2WQyjWgLr4Htapu7BwNwN3x2Tit";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 60);
            i13++;
        }
    }

    public static void A04() {
        A01 = new byte[]{-127, -80, -80, -115, -87, -82, -109, -92, -85, -106, -91, -78, -77, -87, -81, -82};
    }

    static {
        A04();
    }

    public C1795iI(Context context) {
        this.A00 = context;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        int A022;
        if (CE.A04 == CD.A02) {
            return;
        }
        SharedPreferences A00 = BJ.A00(this.A00);
        String A012 = A01(0, 16, 4);
        int i10 = A00.getInt(A012, -1);
        if (i10 != -1) {
            int unused = CE.A00 = i10;
            CD cd = CD.A02;
            String[] strArr = A02;
            if (strArr[1].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A02[5] = "hUCmhtQ8p32Ulvvxz3h93PNa760nZTZ8";
            CE.A04 = cd;
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A022 = CE.A03(this.A00);
        } else {
            A022 = CE.A02(this.A00);
        }
        int unused2 = CE.A00 = A022;
        A00.edit().putInt(A012, A022).commit();
        CE.A04 = CD.A02;
    }
}
