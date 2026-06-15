package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Hx  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0842Hx implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0844Hz A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 22, 18, 21, 22, 35};
    }

    public View$OnClickListenerC0842Hx(C0844Hz c0844Hz) {
        this.A00 = c0844Hz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View$OnClickListenerC1689gW view$OnClickListenerC1689gW;
        View$OnClickListenerC1689gW view$OnClickListenerC1689gW2;
        if (BQ.A02(this)) {
            return;
        }
        try {
            view$OnClickListenerC1689gW = this.A00.A0b;
            if (view$OnClickListenerC1689gW == null) {
                return;
            }
            view$OnClickListenerC1689gW2 = this.A00.A0b;
            view$OnClickListenerC1689gW2.A0A(A00(0, 6, 115));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
