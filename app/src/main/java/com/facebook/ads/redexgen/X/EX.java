package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class EX implements View.OnClickListener {
    public final /* synthetic */ EZ A00;

    public EX(EZ ez) {
        this.A00 = ez;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EJ ej;
        if (BQ.A02(this)) {
            return;
        }
        try {
            ej = this.A00.A02;
            ej.A9S();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
