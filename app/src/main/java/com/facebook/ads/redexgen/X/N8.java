package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class N8 extends AbstractC2097nG {
    public static byte[] A02;
    public static String[] A03 = {"FXNBCWXiStej7hPExkUYAqHU7xYJWQz0", "1k", "9V456DvY4LqOh9I9hdT7Vdo5", "hY2FptqSd7XbZZsJCz2yOGxQcUuE9Eo6", "F2N3RsuOcTrAQaEUExDI4U65CqttWDRl", "hYiRMwjZqKFmNKhRfgQ6FfhFwFErfvFO", "BBwXtDWFWjLC6NycZYUWGAP3M0YJ", ""};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-100, -73, -65, -62, -69, -70, 118, -54, -59, 118, -59, -58, -69, -60, 118, -62, -65, -60, -63, 118, -53, -56, -62, -112, 118, -45, -48, -43, -46};
        if (A03[3].charAt(0) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "n2WgzR0RMCkX50JDMRkryQ8YygezODnU";
        strArr[5] = "Oz9myBlwI7NBoyftyrFAavzWMm25M0Ie";
    }

    static {
        A01();
        A04 = N8.class.getSimpleName();
    }

    public N8(C1900k1 c1900k1, A7 a72, String str, Uri uri, Map<String, String> mExtraData, AnonymousClass22 anonymousClass22, boolean z10) {
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
        if (!D3.A0e(((AbstractC04471v) this).A00, enumC04461u, this.A01)) {
            A0E(this.A01, enumC04461u);
        }
        return enumC04461u;
    }

    public final EnumC04461u A0G() {
        if (A0F(this.A00)) {
            EnumC04461u actionOutcome = EnumC04461u.A0A;
            return actionOutcome;
        }
        try {
            EnumC04461u actionOutcome2 = C2.A05(new C2(), ((AbstractC04471v) this).A00, C5.A00(this.A00.getQueryParameter(A00(25, 4, 19))), ((AbstractC04471v) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 2) + this.A00.toString();
            EnumC04461u actionOutcome3 = EnumC04461u.A04;
            return actionOutcome3;
        }
    }
}
