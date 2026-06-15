package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.fK  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1616fK extends BY {
    public static byte[] A01;
    public final /* synthetic */ C0802Gj A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-87, -68, -73, -72, -62, 115, -63, -72, -55, -72, -59, 115, -58, -57, -76, -59, -57, -72, -73, 115, -61, -65, -76, -52, -68, -63, -70};
    }

    public C1616fK(C0802Gj c0802Gj) {
        this.A00 = c0802Gj;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        boolean z10;
        z10 = this.A00.A04;
        if (!z10) {
            this.A00.A0I(A01(0, 27, 64));
        }
    }
}
