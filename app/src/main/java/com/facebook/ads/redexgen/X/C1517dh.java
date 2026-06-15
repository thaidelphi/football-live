package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.dh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1517dh extends BY {
    public static byte[] A01;
    public final /* synthetic */ C0906Kj A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-67, -48, -53, -52, -42, -121, -34, -56, -38, -121, -43, -52, -35, -52, -39, -121, -41, -39, -52, -41, -56, -39, -52, -53};
    }

    public C1517dh(C0906Kj c0906Kj) {
        this.A00 = c0906Kj;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        boolean z10;
        z10 = this.A00.A0E;
        if (!z10) {
            this.A00.A0Q(A01(0, 24, 8));
        }
    }
}
