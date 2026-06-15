package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class FO implements View.OnClickListener {
    public final /* synthetic */ C1691gY A00;

    public FO(C1691gY c1691gY) {
        this.A00 = c1691gY;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
