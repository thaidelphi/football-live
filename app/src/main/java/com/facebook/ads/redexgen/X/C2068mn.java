package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.mn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2068mn extends BY {
    public static byte[] A01;
    public final /* synthetic */ C2067mm A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C2068mn(C2067mm c2067mm) {
        this.A00 = c2067mm;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C1900k1 c1900k1;
        F1 f12;
        C2069mo c2069mo;
        c1900k1 = this.A00.A03;
        c1900k1.A0F().AK1();
        f12 = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A01(0, 11, 29));
        c2069mo = this.A00.A00;
        f12.loadUrl(append.append(c2069mo.A03()).toString());
    }
}
