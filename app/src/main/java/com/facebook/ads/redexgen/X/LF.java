package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class LF extends AbstractC1409bx {
    public static byte[] A01;
    public static String[] A02 = {"QUZtp6d2PVvxohxxHBY0lFVIZrOHPJmP", "NfxzKLWElZxETrhEeUBSDM4deWBqLSti", "M1wrkGT1p8fg9I16hadPO98y5LyXX3HA", "lshWtPbnAXBsXbgnJLDmxkjrZI", "6PixpSZW8UzyowqAm", "UIpIdTluG2bhvKFOHpQ9k0cfwSXrRmCx", "lSmcWeUXMp1pu4geeqYJMaSrMHF509BD", "gheUZ0KSYWPh4kTG81LfbEHF2a7TTHcT"};
    public final /* synthetic */ C0802Gj A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[6].charAt(28) != '0') {
                throw new RuntimeException();
            }
            A02[6] = "QE45n4HEQOiTUZDVXPk8ylx4JLny0ok5";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{59, 44, 64, 62, 48};
    }

    static {
        A01();
    }

    public LF(C0802Gj c0802Gj) {
        this.A00 = c0802Gj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A02 */
    public final void A03(KY ky) {
        InterfaceC0801Gi interfaceC0801Gi;
        JSONObject A03;
        interfaceC0801Gi = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC0801Gi.AFZ(A00(0, 5, 92), A03);
    }
}
