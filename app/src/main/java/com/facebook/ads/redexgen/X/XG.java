package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class XG implements InterfaceC1092Rv {
    public static byte[] A01;
    public static String[] A02 = {"XP2FqcAOW5OB", "vy3sHWnxY", "lliIYEEgrUJaxxNNiq0urdHUk", "jOem", "K0eytYsrH5QQCvogWHmQjW0THjxnwlIr", "eBaETZSTNwb8Lbal6f7x", "1IvAX", "YJYc4zCx"};
    public final /* synthetic */ C0V A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-46, 6, -11, -6, 0, -79, 4, -6, -1, -4, -79, -10, 3, 3, 0, 3, -32, -8, -9, -4, -12, -42, 2, -9, -8, -10, -44, 8, -9, -4, 2, -27, -8, 1, -9, -8, 5, -8, 5, -85, -86, -113, -88, -95, -95, -84, -23, -24, -47, -37, -27, -33, -17, -22};
        if (A02[4].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "eS4Y";
        strArr[5] = "7MrfQHgoNWqiCvXyWdPD";
        A01 = bArr;
    }

    static {
        A01();
    }

    public XG(C0V c0v) {
        this.A00 = c0v;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1092Rv
    public final void ACO(Exception exc) {
        AbstractC1633fb.A08(A00(16, 23, 96), A00(0, 16, 94), exc);
        C0V.A06(this.A00).A0D(exc);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1092Rv
    public final void ACP(C1088Rr c1088Rr) {
        C0V.A06(this.A00).A0B(c1088Rr);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1092Rv
    public final void ACQ(C1088Rr c1088Rr) {
        C0V.A06(this.A00).A0C(c1088Rr);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1092Rv
    public final void AEH() {
        C0V.A05(this.A00);
        if (0 != 0) {
            C0V.A05(this.A00);
            throw new NullPointerException(A00(46, 8, 71));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1092Rv
    public final void AEI() {
        C0V.A05(this.A00);
        if (0 != 0) {
            C0V.A05(this.A00);
            throw new NullPointerException(A00(39, 7, 9));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1092Rv
    public final void AEa(long j10) {
        C0V.A06(this.A00).A03(j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1092Rv
    public final void AEb() {
        this.A00.A26();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1092Rv
    public final void AF7(boolean z10) {
        C0V.A06(this.A00).A0I(z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1092Rv
    public final void AFR(int i10, long j10, long j11) {
        C0V.A06(this.A00).A01(i10, j10, j11);
    }
}
