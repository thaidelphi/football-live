package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Eh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0748Eh implements View.OnClickListener {
    public final /* synthetic */ C0753Em A00;

    public View$OnClickListenerC0748Eh(C0753Em c0753Em) {
        this.A00 = c0753Em;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1900k1 c1900k1;
        InterfaceC0752El interfaceC0752El;
        InterfaceC0752El interfaceC0752El2;
        if (BQ.A02(this)) {
            return;
        }
        try {
            c1900k1 = this.A00.A0A;
            c1900k1.A0F().A9m();
            interfaceC0752El = this.A00.A05;
            if (interfaceC0752El == null) {
                return;
            }
            interfaceC0752El2 = this.A00.A05;
            interfaceC0752El2.ACe();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
