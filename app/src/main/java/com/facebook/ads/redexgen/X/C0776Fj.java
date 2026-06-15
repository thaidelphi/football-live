package com.facebook.ads.redexgen.X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Fj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0776Fj extends AbstractC1305aC {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{48, 34, 49, 15, 34, 46, 50, 38, 47, 34, 48, 16, 54, 43, 32};
    }

    public C0776Fj(HX hx) {
        super(hx, K0.A04);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1305aC, com.facebook.ads.redexgen.X.K8
    public final void A43(Map<InterfaceC0887Jq, KD> map, Map<SyncModifiableBundle, K0> map2) {
        throw new NullPointerException(A00(0, 15, 87));
    }
}
