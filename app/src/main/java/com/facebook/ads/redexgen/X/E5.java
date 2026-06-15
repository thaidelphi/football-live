package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class E5 implements View.OnClickListener {
    public final /* synthetic */ C1738hJ A00;

    public E5(C1738hJ c1738hJ) {
        this.A00 = c1738hJ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        E7 e72;
        if (BQ.A02(this)) {
            return;
        }
        try {
            e72 = this.A00.A07;
            e72.ADA();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
