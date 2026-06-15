package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HH implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1534dz A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{126, 115, 119, 114, 115, 100};
    }

    public HH(C1534dz c1534dz) {
        this.A00 = c1534dz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1603f6 abstractC1603f6;
        AbstractC1603f6 abstractC1603f62;
        if (BQ.A02(this)) {
            return;
        }
        try {
            abstractC1603f6 = this.A00.A04;
            if (abstractC1603f6 == null) {
                return;
            }
            abstractC1603f62 = this.A00.A04;
            abstractC1603f62.A1A(A00(0, 6, 84));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
