package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class ES implements View.OnClickListener {
    public final /* synthetic */ EL A00;
    public final /* synthetic */ C1733hE A01;

    public ES(C1733hE c1733hE, EL el) {
        this.A01 = c1733hE;
        this.A00 = el;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AE6(EnumC04863i.A06);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
