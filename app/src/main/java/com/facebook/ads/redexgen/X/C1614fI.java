package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.fI  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1614fI extends BY {
    public static byte[] A02;
    public final /* synthetic */ C0802Gj A00;
    public final /* synthetic */ KX A01;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    public C1614fI(C0802Gj c0802Gj, KX kx) {
        this.A00 = c0802Gj;
        this.A01 = kx;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C1433cL c1433cL;
        C1433cL c1433cL2;
        c1433cL = this.A00.A0D;
        if (c1433cL.getState() == JI.A02) {
            c1433cL2 = this.A00.A0D;
            if (c1433cL2.getCurrentPositionInMillis() == this.A01.A00()) {
                this.A00.A0I(A01(0, 22, 47));
            }
        }
    }
}
