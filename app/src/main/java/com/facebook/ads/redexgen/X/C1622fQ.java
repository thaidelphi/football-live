package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.fQ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1622fQ implements InterfaceC0801Gi {
    public static byte[] A01;
    public static String[] A02 = {"6Ak70sx20HAu1BK2okLsJl8UIfFL7Thw", "WSdr2bwsModx8vqlXsCh2pEoV44R6fWS", "6pV", "IuCwGgbRSGcwid05Jmd", "uJw8pmawU", "I8uJtZilJAfxYDsx8vrQS9VBJj4oHqwc", "yyzynLMQXuMe1chn921CH2O0saed", "KEJISc72f74GCBhZaRDCVEoQGHcnATpn"};
    public final /* synthetic */ LJ A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "LF603a9wKS17yr1vDnM";
            strArr2[4] = "LZWmWJ2r4";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 113);
            i13++;
        }
    }

    public static void A01() {
        byte[] bArr = {92, 64, 77, 85};
        String[] strArr = A02;
        if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
            throw new RuntimeException();
        }
        A02[5] = "ka1vQ6UiXKbqG0foqwxWJkzjeHAuiIwi";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1622fQ(LJ lj) {
        this.A00 = lj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0801Gi
    public final void AFZ(String str, JSONObject jSONObject) {
        C0810Gr c0810Gr;
        C1900k1 c1900k1;
        C1900k1 c1900k12;
        if (str.equals(A00(0, 4, 93))) {
            this.A00.AJI();
            c1900k1 = this.A00.A07;
            if (C06419m.A1s(c1900k1)) {
                c1900k12 = this.A00.A07;
                c1900k12.A0B().ACq();
            }
        }
        c0810Gr = this.A00.A0F;
        if (A02[5].charAt(30) != 'w') {
            throw new RuntimeException();
        }
        A02[5] = "i1qJJe2Rv2sTY7cj85c4P5DDFviddUwN";
        c0810Gr.A0h(str, jSONObject);
    }
}
