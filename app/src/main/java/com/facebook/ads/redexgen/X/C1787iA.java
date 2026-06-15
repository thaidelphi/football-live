package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.iA  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1787iA implements InterfaceC0698Cj {
    public static byte[] A03;
    public int A00;
    public String A01;
    public final InterfaceC0698Cj A02;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-93, -93, -107, -104};
    }

    public C1787iA(InterfaceC0698Cj interfaceC0698Cj) {
        this.A02 = interfaceC0698Cj;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.AGG(this.A01 + A00(0, 4, 67) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Cj
    public final void AGG(String str) {
        boolean A0A;
        String A04;
        A0A = AbstractC0700Cl.A0A(str);
        if (!A0A) {
            A04 = AbstractC0700Cl.A04(str);
            String filtered = this.A01;
            if (A04.equals(filtered)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = A04;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.AGG(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Cj
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
