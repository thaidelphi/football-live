package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HJ implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0913Kq A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, 42, 46, 43, 42, 61};
    }

    public HJ(C0913Kq c0913Kq) {
        this.A00 = c0913Kq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0786Ft abstractC0786Ft;
        AbstractC0786Ft abstractC0786Ft2;
        if (BQ.A02(this)) {
            return;
        }
        try {
            abstractC0786Ft = this.A00.A00;
            if (abstractC0786Ft == null) {
                return;
            }
            abstractC0786Ft2 = this.A00.A00;
            abstractC0786Ft2.A18(A00(0, 6, 53));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
