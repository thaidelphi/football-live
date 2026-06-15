package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Ii  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0853Ii implements View.OnClickListener {
    public final /* synthetic */ C1378bS A00;

    public View$OnClickListenerC0853Ii(C1378bS c1378bS) {
        this.A00 = c1378bS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AF af;
        C1900k1 c1900k1;
        C1433cL c1433cL;
        boolean A07;
        C1433cL c1433cL2;
        C1433cL c1433cL3;
        if (BQ.A02(this)) {
            return;
        }
        try {
            af = this.A00.A03;
            af.A04(AE.A0l, null);
            c1900k1 = this.A00.A02;
            c1900k1.A0F().A3c();
            c1433cL = this.A00.A00;
            if (c1433cL == null) {
                return;
            }
            A07 = this.A00.A07();
            if (A07) {
                c1433cL3 = this.A00.A00;
                c1433cL3.setVolume(1.0f);
            } else {
                c1433cL2 = this.A00.A00;
                c1433cL2.setVolume(0.0f);
            }
            this.A00.A09();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
