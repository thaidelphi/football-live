package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.dw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1531dw extends BY {
    public final /* synthetic */ C0913Kq A00;

    public C1531dw(C0913Kq c0913Kq) {
        this.A00 = c0913Kq;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        AbstractC0786Ft abstractC0786Ft;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC0786Ft abstractC0786Ft2;
        abstractC0786Ft = this.A00.A00;
        if (abstractC0786Ft != null) {
            abstractC0786Ft2 = this.A00.A00;
            abstractC0786Ft2.A12();
        }
        DQ dq = this.A00.A08;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        dq.setToolbarActionMode(closeButtonStyle);
        this.A00.A08.A07();
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
