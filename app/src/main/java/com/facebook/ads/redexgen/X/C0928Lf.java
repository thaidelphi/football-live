package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Lf  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0928Lf extends AbstractC1415c3 {
    public static byte[] A01;
    public static String[] A02 = {"cVYzzU3WDwilAiB6lBwH", "ltb11yKnDLf", "qD1l7ddw57WScFbFlpW6gLQQ4LJZYMm4", "7tmDLtuP1dSUokfmYRKMMhnjp75BOUEQ", "O1T", "OUAaXGhWo5xW6BfvCbr", "NPW6PnCzVK8iTd9b27h5", "ykk8Miz3Z2gvnB5Rb4Sxgn912BIo"};
    public final /* synthetic */ C1738hJ A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A02[2].charAt(8) != '5') {
                throw new RuntimeException();
            }
            A02[5] = "7KI0j9KfVtSFY3dF";
            copyOfRange[i13] = (byte) (i14 ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 28, 17, 16, 26, 60, 27, 1, 16, 7, 6, 1, 28, 1, 20, 25, 48, 3, 16, 27, 1};
    }

    static {
        A01();
    }

    public C0928Lf(C1738hJ c1738hJ) {
        this.A00 = c1738hJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A02 */
    public final void A03(C0897Ka c0897Ka) {
        DR dr;
        dr = this.A00.A06;
        dr.A4a(A00(0, 21, 51), c0897Ka);
    }
}
