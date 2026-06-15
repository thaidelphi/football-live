package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.hw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1775hw implements InterfaceC0752El {
    public static byte[] A01;
    public final /* synthetic */ C1773hu A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, -39, -36, -17, -32, -32, -33, -20, -33, -34, -39, -35, -26, -29, -35, -27, -39, -29, -37, -36, -39, -33, -14, -18, -33, -20, -24, -37, -26, -39, -24, -37, -16, -29, -31, -37, -18, -29, -23, -24};
    }

    public C1775hw(C1773hu c1773hu) {
        this.A00 = c1773hu;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0752El
    public final void ACe() {
        this.A00.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0752El
    public final void AEF() {
        this.A00.A0H(A00(0, 43, 56));
    }
}
