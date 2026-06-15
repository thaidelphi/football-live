package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Db  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0716Db implements View.OnClickListener {
    public final /* synthetic */ C1767hn A00;

    public View$OnClickListenerC0716Db(C1767hn c1767hn) {
        this.A00 = c1767hn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DP dp;
        E4 e42;
        DP dp2;
        if (BQ.A02(this)) {
            return;
        }
        try {
            dp = this.A00.A01;
            if (dp == null) {
                return;
            }
            e42 = this.A00.A02;
            if (!e42.A02()) {
                return;
            }
            dp2 = this.A00.A01;
            dp2.AC5(this.A00);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
