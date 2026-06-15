package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class N6 extends AbstractC1700gh {
    public static byte[] A02;
    public static String[] A03 = {"dvnbyrX9L5Wlup6c2JnWkpTYBAz3QIun", "ITj", "KqeTcLSx6Zay5vtxcnHqZ", "bGeXa7nDz1byFpBCq22utpLnb", "UYph9iPsD3jee8BOLuPQ6r57rjKJpmVb", "DfaYbRSw6X21pxGApii0qweOJ64z1eNB", "52vckdype7aS5lLwU46sLHF0XTMQAze7", "uuBWL9In1wjj"};
    public final /* synthetic */ N5 A00;
    public final /* synthetic */ C2069mo A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{67, 116, 116, 105, 116, 38, 99, 126, 99, 101, 115, 114, 111, 104, 97, 38, 103, 101, 114, 111, 105, 104, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 116, 112, 115, 118, 66, 77, 72, 80, 65, 86, 65, 64, 123, 71, 72, 77, 71, 79, 123, 64, 65, 72, 69, 93, 123, 73, 87, 2, 24, 52, 8, 25, 14, 10, 31, 2, 29, 14, 52, 10, 24, 52, 8, 31, 10, 52, 29, 89, 102, 125, 122, 98, 102, 118, 90, 119};
    }

    static {
        A01();
    }

    public N6(N5 n52, C2069mo c2069mo) {
        this.A00 = n52;
        this.A01 = c2069mo;
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void ACH() {
        boolean z10;
        this.A00.A0G = true;
        z10 = this.A00.A0H;
        if (z10) {
            this.A00.A0A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.AbstractC1700gh, com.facebook.ads.redexgen.X.F4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ACc(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.N6.ACc(java.lang.String, java.util.Map):void");
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void ADP() {
        M5 m52;
        C2067mm c2067mm;
        C2067mm c2067mm2;
        C2067mm c2067mm3;
        m52 = this.A00.A04;
        InterfaceC2108nR A0F = m52.A0F();
        c2067mm = this.A00.A02;
        A0F.A4G(c2067mm != null);
        c2067mm2 = this.A00.A02;
        if (c2067mm2 != null) {
            c2067mm3 = this.A00.A02;
            c2067mm3.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1700gh, com.facebook.ads.redexgen.X.F4
    public final void AEN() {
        M5 m52;
        C2067mm c2067mm;
        m52 = this.A00.A04;
        m52.A0F().A4I();
        c2067mm = this.A00.A02;
        c2067mm.A09();
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void AFo() {
    }
}
