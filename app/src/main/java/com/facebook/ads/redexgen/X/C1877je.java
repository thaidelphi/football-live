package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.je  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1877je implements InterfaceC04321g {
    public static byte[] A01;
    public final AnonymousClass85 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70};
    }

    public C1877je(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85;
    }

    private void A02(int i10, String str, JSONObject jSONObject, boolean z10, int i11) {
        C06058b c06058b = new C06058b(A00(4, 6, 44));
        c06058b.A07(jSONObject);
        c06058b.A05(1);
        c06058b.A09(z10);
        c06058b.A04(i11);
        try {
            jSONObject.put(A00(33, 13, 62), C8U.A0H(this.A00));
        } catch (JSONException unused) {
        }
        this.A00.A08().AAv(A00(27, 6, 13), i10 + 4000, c06058b);
        if (this.A00.A05().AAD()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i10 + A00(1, 3, 118) + jSONObject.toString();
        }
    }

    public static boolean A03(EnumC04341i enumC04341i) {
        for (EnumC04341i enumC04341i2 : C1869jW.A06) {
            if (enumC04341i2.equals(enumC04341i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04321g
    public final void AAw(EnumC04341i enumC04341i, JSONObject jSONObject, int i10) {
        A02(enumC04341i.A03(), enumC04341i.toString(), jSONObject, A03(enumC04341i), i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04321g
    public final void ABH(int i10, JSONObject jSONObject) {
        A02(i10, A00(18, 9, 111) + i10, jSONObject, false, 0);
    }
}
