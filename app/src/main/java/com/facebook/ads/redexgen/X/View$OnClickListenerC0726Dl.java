package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Dl  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0726Dl implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0728Dn A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 120, 116, 114, 112};
    }

    public View$OnClickListenerC0726Dl(C0728Dn c0728Dn) {
        this.A00 = c0728Dn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1761hg c1761hg;
        if (BQ.A02(this)) {
            return;
        }
        try {
            c1761hg = this.A00.A06;
            c1761hg.getCTAButton().A0A(A00(0, 5, 121));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
