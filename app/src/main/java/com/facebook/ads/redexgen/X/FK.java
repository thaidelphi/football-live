package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class FK implements View.OnClickListener {
    public final /* synthetic */ AbstractC1694gb A00;

    public FK(AbstractC1694gb abstractC1694gb) {
        this.A00 = abstractC1694gb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0F.getVisibility() == 8) {
                this.A00.A0R(0);
                this.A00.A0D.postDelayed(this.A00.A0Q, 1500L);
                return;
            }
            this.A00.A0K();
            this.A00.A0D.removeCallbacks(this.A00.A0Q);
            this.A00.A0R(8);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
