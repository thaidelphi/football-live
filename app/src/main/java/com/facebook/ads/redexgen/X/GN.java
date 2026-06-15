package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class GN implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1652fu A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, 34, 34, 35, 50, 39, 47, 42, 53};
    }

    public GN(C1652fu c1652fu) {
        this.A00 = c1652fu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        GT gt;
        if (BQ.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0P;
            if (z10) {
                return;
            }
            gt = this.A00.A0N;
            gt.A03(A00(0, 9, 108));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
