package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.ew  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1593ew extends BY {
    public static byte[] A01;
    public final /* synthetic */ L1 A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-56, -37, -42, -41, -31, -110, -23, -45, -27, -110, -32, -41, -24, -41, -28, -110, -30, -28, -41, -30, -45, -28, -41, -42};
    }

    public C1593ew(L1 l12) {
        this.A00 = l12;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        boolean z10;
        HI hi;
        z10 = this.A00.A07;
        if (!z10) {
            hi = this.A00.A0F;
            hi.AFY(A01(0, 24, 91));
        }
    }
}
