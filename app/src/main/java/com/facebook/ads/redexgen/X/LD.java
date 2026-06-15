package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class LD extends AbstractC1415c3 {
    public static byte[] A01;
    public final /* synthetic */ C0802Gj A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{107, 103, 101, 120, 100, 109, 124, 109, 108};
    }

    public LD(C0802Gj c0802Gj) {
        this.A00 = c0802Gj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A02 */
    public final void A03(C0897Ka c0897Ka) {
        InterfaceC0801Gi interfaceC0801Gi;
        C1433cL c1433cL;
        JSONObject A04;
        this.A00.A07();
        interfaceC0801Gi = this.A00.A0B;
        C0802Gj c0802Gj = this.A00;
        c1433cL = this.A00.A0D;
        A04 = c0802Gj.A04(c1433cL.getDuration());
        interfaceC0801Gi.AFZ(A00(0, 9, 87), A04);
    }
}
