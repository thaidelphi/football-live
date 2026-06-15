package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Mw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0968Mw extends AbstractC2058md implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            A01[4] = "xBe8M";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83};
    }

    static {
        A04();
    }

    public C0968Mw(List<C2T> list) {
        super(list);
    }

    public static C0968Mw A02(JSONObject jSONObject, C1900k1 c1900k1) {
        C0968Mw c0968Mw = new C0968Mw(AbstractC2058md.A08(jSONObject, c1900k1, new C2055ma()));
        c0968Mw.A1k(jSONObject);
        c0968Mw.A10(A03(0, 12, 9));
        return c0968Mw;
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final int A0X() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.C2S
    public final int A0Y() {
        return 0;
    }
}
