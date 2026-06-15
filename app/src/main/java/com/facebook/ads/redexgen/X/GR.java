package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class GR implements View.OnClickListener {
    public final /* synthetic */ C1649fr A00;

    public GR(C1649fr c1649fr) {
        this.A00 = c1649fr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HT ht;
        HT ht2;
        if (BQ.A02(this)) {
            return;
        }
        try {
            ht = this.A00.A02;
            if (ht == null) {
                return;
            }
            ht2 = this.A00.A02;
            ht2.AJ5();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
