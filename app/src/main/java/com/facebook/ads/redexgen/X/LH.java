package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class LH extends AbstractC1405bt {
    public static byte[] A01;
    public final /* synthetic */ C0802Gj A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{53, 55, 42, 53, 38, 55, 42, 41};
    }

    public LH(C0802Gj c0802Gj) {
        this.A00 = c0802Gj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A02 */
    public final void A03(C1406bu c1406bu) {
        InterfaceC0801Gi interfaceC0801Gi;
        JSONObject A03;
        this.A00.A03 = true;
        interfaceC0801Gi = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC0801Gi.AFZ(A00(0, 8, 73), A03);
    }
}
