package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class N9 extends AbstractC2097nG {
    public static byte[] A03;
    public Map<String, String> A00;
    public boolean A01;
    public final Uri A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{88, 93, 90, 95, 59, 60, 39, 58, 45, 23, 61, 58, 36, 23, 63, 45, 42, 23, 46, 41, 36, 36, 42, 41, 43, 35};
    }

    public N9(C1900k1 c1900k1, A7 a72, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1900k1, a72, str, null, true, true);
        this.A02 = uri;
        this.A00 = mExtraData;
    }

    public N9(C1900k1 c1900k1, A7 a72, String str, Uri uri, Map<String, String> mExtraData, boolean z10) {
        this(c1900k1, a72, str, uri, mExtraData);
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2097nG
    public final EnumC04461u A0D() {
        A0E(this.A00, null);
        return EnumC04461u.A09;
    }

    public final Uri A0G() {
        String queryParameter = this.A02.getQueryParameter(A00(4, 22, 5));
        if (this.A01 && !TextUtils.isEmpty(queryParameter)) {
            return C5.A00(queryParameter);
        }
        Uri uri = this.A02;
        String url = A00(0, 4, 121);
        return C5.A00(uri.getQueryParameter(url));
    }
}
