package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Eb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0742Eb implements View.OnClickListener {
    public final /* synthetic */ EL A00;
    public final /* synthetic */ C1732hD A01;

    public View$OnClickListenerC0742Eb(C1732hD c1732hD, EL el) {
        this.A01 = c1732hD;
        this.A00 = el;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AE6(EnumC04863i.A04);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
