package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class N7 extends AbstractC2097nG {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{93, 122, 114, 119, 126, Byte.MAX_VALUE, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, 33, 59, 67, 70, 65, 68};
    }

    static {
        A01();
        A03 = N7.class.getSimpleName();
    }

    public N7(C1900k1 c1900k1, A7 a72, String str, Uri uri, Map<String, String> mExtraData, AnonymousClass22 anonymousClass22, boolean z10) {
        super(c1900k1, a72, str, anonymousClass22, z10);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2097nG
    public final EnumC04461u A0D() {
        EnumC04461u enumC04461u = EnumC04461u.A09;
        if (this.A03) {
            enumC04461u = A0G();
        }
        A0E(this.A01, enumC04461u);
        return enumC04461u;
    }

    public final EnumC04461u A0G() {
        EnumC04461u enumC04461u = EnumC04461u.A09;
        try {
            C2.A0C(new C2(), ((AbstractC04471v) this).A00, C5.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((AbstractC04471v) this).A02);
            return enumC04461u;
        } catch (Exception unused) {
            String str = A00(0, 25, 119) + this.A00.toString();
            return EnumC04461u.A04;
        }
    }
}
