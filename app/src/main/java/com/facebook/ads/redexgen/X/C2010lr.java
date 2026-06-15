package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.lr  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2010lr implements C3Q {
    public static byte[] A06;
    public static String[] A07 = {"41kFMkgYcMqjBdEAHWyZzQ9Q1YQDMkZo", "a1qrqbdzoLKte5dp2TdqsHV2Btmo8HIO", "VlRnhGghZyM7Xz", "WVmrs7jRPAo6ieNv", "abQhu9SgesOIRxLkCU6L7yAdrfeNFYXV", "iVqBhi5IkesALAcr", "e6wMTa30i0R6i9", "GTVyj1NjpD4uWxM1mBTnBnh1LH0X6W6g"};
    public boolean A00;
    public final AbstractC2024m5 A01;
    public final C3E A02;
    public final C2013lu A03;
    public final C3L A04;
    public final C1900k1 A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{110, 75, 15, 64, 77, 69, 74, 76, 91, 15, 70, 92, 15, 65, 90, 67, 67, 9, 30, 5, 15, 7, 14, 20, 14, 19, 31, 25, 10, 24, 20, 0, 14, 18, 47, 43, 40, 28, 13, 0, 12, 7, 10, 12, 39, 12, 29, 30, 6, 27, 2, 87, 80, 74, 65, 91, 76, 76, 81, 76, 65, 93, 81, 90, 91, 65, 85, 91, 71, 14, 13, 12, 5, 29, 11, 12, 20, 3, 14, 11, 6, 3, 22, 11, 13, 12, 29, 22, 11, 15, 7, 29, 9, 7, 27, 39, 15, 25, 25, 11, 13, 15, 80, 74, 118, 82, 72, 72, 82, 85, 92, 27, 89, 78, 85, 95, 87, 94, 27, 93, 84, 73, 27, 86, 94, 72, 72, 90, 92, 94, 21, 35, 36, 34, 47, 53, 34, 34, 63, 34, 47, 61, 53, 35, 35, 49, 55, 53, 47, 59, 53, 41, 72, 89, 64};
    }

    static {
        A01();
    }

    public C2010lr(C1900k1 c1900k1, C2013lu c2013lu, C3E c3e, AbstractC2024m5 abstractC2024m5, C3L c3l) {
        this.A05 = c1900k1;
        this.A03 = c2013lu;
        this.A02 = c3e;
        this.A01 = abstractC2024m5;
        this.A04 = c3l;
    }

    @Override // com.facebook.ads.redexgen.X.C3Q
    public final Bundle A5H(String str) {
        return C3X.A02(str, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.C3Q
    public final void A5l() {
        this.A04.A0F(1012, null);
        this.A04.A0C();
        this.A03.A0D(null);
    }

    @Override // com.facebook.ads.redexgen.X.C3Q
    public final int A8F() {
        return 1010;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    @Override // com.facebook.ads.redexgen.X.C3Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A9Z(android.os.Message r10) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2010lr.A9Z(android.os.Message):void");
    }

    @Override // com.facebook.ads.redexgen.X.C3Q
    public final void AIt(boolean z10) {
        this.A00 = z10;
    }
}
