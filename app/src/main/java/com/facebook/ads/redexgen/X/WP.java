package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class WP {
    public static byte[] A05;
    public static String[] A06 = {"KHCt4frvDkKshICcUrq132zIrmtDdnSU", "NfmQTohX8ER0xRkghOCuc5NhbIvXt6sK", "", "LQAPDnufH1IbXJuWkKGdMQkSNtCiMLs6", "CYKeElTsYUvzx2jzIwklWkzXtzJ3PGrg", "AraRtnwsGm9vMrJxVcKOamDTh279HA2i", "eMrQ6EyYPQXepM9ear0xYLgK7RlUGwgn", "iGqindczD9XGJAcMytEcInY6pYjypdvq"};
    public int A00;
    public final InterfaceC1157Uo A01;
    public final C1158Up A02;
    public final WZ A03;
    public final C1195Wc A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            String[] strArr = A06;
            if (strArr[4].charAt(22) != strArr[0].charAt(22)) {
                throw new RuntimeException();
            }
            A06[6] = "tMzdqHyqHtX34y6x3xLDF3vxUsqaH2zl";
            copyOfRange[i13] = (byte) (i14 - 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{Byte.MAX_VALUE, -109, -126, -121, -115, 77, -110, -112, -109, -125, 75, -122, -126};
    }

    static {
        A01();
    }

    public WP(WZ wz, C1195Wc c1195Wc, InterfaceC1157Uo interfaceC1157Uo) {
        C1158Up c1158Up;
        this.A03 = wz;
        this.A04 = c1195Wc;
        this.A01 = interfaceC1157Uo;
        if (A00(0, 13, 20).equals(wz.A07.A0W)) {
            c1158Up = new C1158Up();
        } else {
            c1158Up = null;
        }
        this.A02 = c1158Up;
    }
}
