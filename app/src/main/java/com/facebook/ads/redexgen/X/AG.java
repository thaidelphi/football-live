package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class AG implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AE A00;
    public final /* synthetic */ AF A01;

    public AG(AF af, AE ae) {
        this.A01 = af;
        this.A00 = ae;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
