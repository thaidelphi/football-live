package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.eY  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1569eY extends BY {
    public static byte[] A01;
    public final /* synthetic */ C0914Kr A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-20, -1, -6, -5, 5, -74, 13, -9, 9, -74, 4, -5, 12, -5, 8, -74, 6, 8, -5, 6, -9, 8, -5, -6};
    }

    public C1569eY(C0914Kr c0914Kr) {
        this.A00 = c0914Kr;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        boolean z10;
        HI hi;
        z10 = this.A00.A0T;
        if (!z10) {
            hi = this.A00.A0Y;
            hi.AFY(A01(0, 24, 28));
        }
    }
}
