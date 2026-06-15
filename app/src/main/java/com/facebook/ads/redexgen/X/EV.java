package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class EV implements View.OnClickListener {
    public final /* synthetic */ C04883k A00;
    public final /* synthetic */ EL A01;
    public final /* synthetic */ C1733hE A02;

    public EV(C1733hE c1733hE, EL el, C04883k c04883k) {
        this.A02 = c1733hE;
        this.A01 = el;
        this.A00 = c04883k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.AEJ(this.A00);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
