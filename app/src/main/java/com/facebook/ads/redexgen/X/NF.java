package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class NF extends AbstractC2104nN<EnumC04431r> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public NF(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2104nN
    /* renamed from: A05 */
    public final C04371l A04(EnumC04431r enumC04431r) {
        return new C04371l(this, enumC04431r == null ? A00(0, 4, 114) : enumC04431r.A03());
    }
}
