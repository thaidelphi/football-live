package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.fJ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1615fJ extends BY {
    public static byte[] A01;
    public final /* synthetic */ C0802Gj A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{87, 104, 101, 100, 110, 33, 118, 96, 114, 33, 111, 100, 119, 100, 115, 33, 113, 115, 100, 113, 96, 115, 100, 101};
    }

    public C1615fJ(C0802Gj c0802Gj) {
        this.A00 = c0802Gj;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        boolean z10;
        z10 = this.A00.A03;
        if (!z10) {
            this.A00.A0I(A01(0, 24, 115));
        }
    }
}
