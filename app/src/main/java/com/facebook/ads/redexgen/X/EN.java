package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class EN implements View.OnClickListener {
    public final /* synthetic */ C1734hF A00;

    public EN(C1734hF c1734hF) {
        this.A00 = c1734hF;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.AE6(EnumC04863i.A04);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
