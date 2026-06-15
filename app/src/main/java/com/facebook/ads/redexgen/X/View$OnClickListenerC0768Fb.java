package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Fb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0768Fb implements View.OnClickListener {
    public final /* synthetic */ C0770Fd A00;

    public View$OnClickListenerC0768Fb(C0770Fd c0770Fd) {
        this.A00 = c0770Fd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
