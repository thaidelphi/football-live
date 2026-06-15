package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.eV  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1566eV extends BY {
    public static byte[] A02;
    public final /* synthetic */ C0914Kr A00;
    public final /* synthetic */ KX A01;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{98, 85, 70, 70, 69, 82, 73, 78, 71, 0, 73, 78, 68, 69, 70, 73, 78, 73, 84, 69, 76, 89};
    }

    public C1566eV(C0914Kr c0914Kr, KX kx) {
        this.A00 = c0914Kr;
        this.A01 = kx;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C1433cL c1433cL;
        C1433cL c1433cL2;
        HI hi;
        c1433cL = this.A00.A0a;
        if (c1433cL.getState() == JI.A02) {
            c1433cL2 = this.A00.A0a;
            if (c1433cL2.getCurrentPositionInMillis() == this.A01.A00()) {
                hi = this.A00.A0Y;
                hi.AFY(A01(0, 22, 86));
            }
        }
    }
}
