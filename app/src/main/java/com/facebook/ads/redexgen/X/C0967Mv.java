package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.Mv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0967Mv extends AbstractC2058md {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{52, 59, 46, 51, 44, 63};
    }

    public C0967Mv(List<C2T> list) {
        super(list);
    }

    public static C0967Mv A02(JSONObject jSONObject, C1900k1 c1900k1) {
        C0967Mv c0967Mv = new C0967Mv(AbstractC2058md.A08(jSONObject, c1900k1, new C2054mZ()));
        c0967Mv.A1k(jSONObject);
        c0967Mv.A10(A03(0, 6, 107));
        return c0967Mv;
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
