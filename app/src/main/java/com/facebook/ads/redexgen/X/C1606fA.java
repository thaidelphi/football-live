package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.fA  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1606fA extends JK {
    public static byte[] A01;
    public final /* synthetic */ AbstractC1603f6 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-37, -32, -39, -31, -26, -35, -36, -41, -39, -36, -41, -31, -26, -36, -35, -16};
    }

    public C1606fA(AbstractC1603f6 abstractC1603f6) {
        this.A00 = abstractC1603f6;
    }

    @Override // com.facebook.ads.redexgen.X.JK
    public final void A03() {
        int i10;
        boolean z10;
        boolean z11;
        if (!this.A00.A09.A07()) {
            this.A00.A09.A05();
            if (!TextUtils.isEmpty(this.A00.A05.A1g())) {
                Map<String, String> A05 = new FB().A03(this.A00.A0C).A02(this.A00.A09).A04(this.A00.A05.A0h()).A05();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 96));
                i10 = this.A00.A01;
                A05.put(A00(0, 16, 42), append.append(i10).toString());
                this.A00.A07.AB0(this.A00.A05.A1g(), A05);
                C0677Bh.A00(this.A00.A06).A0E(this.A00.A0B.A8b(), this.A00.A05.A1g());
                C04592h.A07(this.A00.A05.A1c(), this.A00.A06);
                this.A00.A06.A0F().A3B();
                z10 = this.A00.A03;
                if (!z10) {
                    AbstractC04783a.A02(this.A00.A05.A0g(), AbstractC0693Ce.A00(this.A00.A05.A0i()));
                }
                z11 = this.A00.A04;
                if (!z11) {
                    this.A00.A0A.A4Z(this.A00.A0B.A86());
                }
            }
        }
    }
}
