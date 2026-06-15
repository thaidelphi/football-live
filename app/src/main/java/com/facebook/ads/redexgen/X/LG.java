package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class LG extends AbstractC1407bv {
    public static byte[] A01;
    public final /* synthetic */ C0802Gj A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{112, 108, 97, 121};
    }

    public LG(C0802Gj c0802Gj) {
        this.A00 = c0802Gj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A02 */
    public final void A03(C1408bw c1408bw) {
        InterfaceC0801Gi interfaceC0801Gi;
        JSONObject A03;
        this.A00.A04 = true;
        interfaceC0801Gi = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC0801Gi.AFZ(A00(0, 4, 106), A03);
    }
}
