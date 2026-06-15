package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.iX  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1809iX extends BY {
    public static byte[] A01;
    public final /* synthetic */ B9 A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-81, -78, -90, -92, -81, -94, -73, -85, -75, -78, -73, -73, -81, -88};
    }

    public C1809iX(B9 b92) {
        this.A00 = b92;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C1900k1 c1900k1;
        c1900k1 = this.A00.A05;
        c1900k1.A08().A9t(A01(0, 14, 26));
    }
}
