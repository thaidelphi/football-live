package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Dk  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0725Dk implements View.OnClickListener {
    public final /* synthetic */ C0728Dn A00;

    public View$OnClickListenerC0725Dk(C0728Dn c0728Dn) {
        this.A00 = c0728Dn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
