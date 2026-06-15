package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HN implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0906Kj A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{89, 84, 80, 85, 84, 67};
    }

    public HN(C0906Kj c0906Kj) {
        this.A00 = c0906Kj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0786Ft abstractC0786Ft;
        AbstractC0786Ft abstractC0786Ft2;
        if (BQ.A02(this)) {
            return;
        }
        try {
            abstractC0786Ft = this.A00.A03;
            if (abstractC0786Ft == null) {
                return;
            }
            abstractC0786Ft2 = this.A00.A03;
            abstractC0786Ft2.A18(A00(0, 6, 24));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
