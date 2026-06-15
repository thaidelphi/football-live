package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Fa  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0767Fa implements View.OnClickListener {
    public final /* synthetic */ C0770Fd A00;

    public View$OnClickListenerC0767Fa(C0770Fd c0770Fd) {
        this.A00 = c0770Fd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0769Fc interfaceC0769Fc;
        DQ dq;
        List<View> list;
        C1433cL c1433cL;
        C1433cL c1433cL2;
        C1433cL c1433cL3;
        DQ dq2;
        if (BQ.A02(this)) {
            return;
        }
        try {
            interfaceC0769Fc = this.A00.A05;
            interfaceC0769Fc.AE1();
            dq = this.A00.A00;
            if (dq != null) {
                dq2 = this.A00.A00;
                D3.A0J(dq2);
            }
            list = this.A00.A07;
            for (View view2 : list) {
                D3.A0L(view2, 0);
            }
            D3.A0H(this.A00);
            c1433cL = this.A00.A06;
            if (c1433cL == null) {
                return;
            }
            c1433cL2 = this.A00.A06;
            D3.A0L(c1433cL2, 0);
            c1433cL3 = this.A00.A06;
            c1433cL3.A0g(IP.A02, 14);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
