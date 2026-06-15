package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Dq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0731Dq implements View.OnClickListener {
    public final /* synthetic */ C1741hM A00;

    public View$OnClickListenerC0731Dq(C1741hM c1741hM) {
        this.A00 = c1741hM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AF af;
        DR dr;
        EC ec;
        if (BQ.A02(this)) {
            return;
        }
        try {
            af = this.A00.A0N;
            af.A04(AE.A07, null);
            dr = this.A00.A0Q;
            ec = this.A00.A0R;
            dr.A4Z(ec.A7m());
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
