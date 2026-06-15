package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Fp  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0782Fp implements View.OnClickListener {
    public final /* synthetic */ View$OnClickListenerC1689gW A00;
    public final /* synthetic */ String A01;

    public View$OnClickListenerC0782Fp(View$OnClickListenerC1689gW view$OnClickListenerC1689gW, String str) {
        this.A00 = view$OnClickListenerC1689gW;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0A(this.A01);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
