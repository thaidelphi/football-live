package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Up  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1158Up {
    public static byte[] A07;
    public static String[] A08 = {"asQIejgsTbdB2S0VyRGB9EHYv1eKLRk9", "WWVp5dGLiHAEOS6HWE0PikCefP99BXsW", "octpk2CwSd1qfe", "ns1GzOE4HOxEo3pDZ396XNF", "svmJuJ0Yw6PfGOKmqqiDuutKa6NSuCwM", "mTppDqhzT4hXINAYJSVofMwB4xwlHqos", "7Cfb50ckZ2pasQ5YCw5YgUYs", "PeMxce9luSm16o2uEtOifcxB"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final byte[] A06 = new byte[10];

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            if (A08[1].charAt(12) != 'O') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[3] = "xjcl2VfQmHv0GuodB2wNhG9";
            strArr[2] = "qTNw9PKBtoOlMW";
            copyOfRange[i13] = (byte) (i14 - 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{13, 43, 46, 30, 1, -3, -39, 28, 33, 46, 39, 36, -39, 44, 26, 38, 41, 37, 30, 44, -39, 38, 46, 44, 45, -39, 27, 30, -39, 28, 40, 39, 45, 34, 32, 46, 40, 46, 44, -39, 34, 39, -39, 45, 33, 30, -39, 44, 26, 38, 41, 37, 30, -39, 42, 46, 30, 46, 30, -25};
    }

    static {
        A01();
    }

    public final void A02() {
        this.A05 = false;
        this.A02 = 0;
    }

    public final void A03(WJ wj) throws IOException {
        if (this.A05) {
            return;
        }
        wj.AG1(this.A06, 0, 10);
        wj.AHr();
        if (U2.A06(this.A06) == 0) {
            return;
        }
        this.A05 = true;
    }

    public final void A04(InterfaceC1157Uo interfaceC1157Uo, long j10, int i10, int i11, int i12, C1156Um c1156Um) {
        AbstractC1589es.A0A(this.A01 <= i11 + i12, A00(0, 60, 104));
        if (!this.A05) {
            return;
        }
        int i13 = this.A02;
        this.A02 = i13 + 1;
        if (i13 == 0) {
            this.A04 = j10;
            this.A00 = i10;
            this.A03 = 0;
        }
        this.A03 += i11;
        this.A01 = i12;
        if (this.A02 >= 16) {
            A05(interfaceC1157Uo, c1156Um);
        }
    }

    public final void A05(InterfaceC1157Uo interfaceC1157Uo, C1156Um c1156Um) {
        if (this.A02 > 0) {
            interfaceC1157Uo.AI0(this.A04, this.A00, this.A03, this.A01, c1156Um);
            this.A02 = 0;
        }
    }
}
