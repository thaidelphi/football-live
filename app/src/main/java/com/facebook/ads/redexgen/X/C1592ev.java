package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.ev  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1592ev extends BY {
    public static byte[] A02;
    public static String[] A03 = {"mPUp", "QaVG6HdjpkfaxAZj0g", "f", "awRGdU6dgRZhiPVlhe", "rFOzx0t9VnUrXKVKNhKeQ4JnbF82l9OW", "Jupus4hVDLzI", "SNB8L6kKTybUpjfk2kEtWCUyw", "zmy1APRNrfa5"};
    public final /* synthetic */ L1 A00;
    public final /* synthetic */ KX A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 26);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A02 = new byte[]{-43, 8, -7, -7, -8, 5, -4, 1, -6, -77, -4, 1, -9, -8, -7, -4, 1, -4, 7, -8, -1, 12};
    }

    static {
        A04();
    }

    public C1592ev(L1 l12, KX kx) {
        this.A00 = l12;
        this.A01 = kx;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C1433cL c1433cL;
        C1433cL c1433cL2;
        HI hi;
        c1433cL = this.A00.A0I;
        if (c1433cL.getState() == JI.A02) {
            L1 l12 = this.A00;
            String[] strArr = A03;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[3] = "r7zn";
            c1433cL2 = l12.A0I;
            if (c1433cL2.getCurrentPositionInMillis() == this.A01.A00()) {
                hi = this.A00.A0F;
                hi.AFY(A01(0, 22, 121));
            }
        }
    }
}
