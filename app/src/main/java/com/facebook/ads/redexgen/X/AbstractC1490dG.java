package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.Timeline;
/* renamed from: com.facebook.ads.redexgen.X.dG  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1490dG {
    public InterfaceC1489dF A00;
    public InterfaceC1502dS A01;

    public abstract boolean A0Y();

    public abstract C1491dH A0b(InterfaceC1054Qi[] interfaceC1054QiArr, C1063Qs c1063Qs, R5 r52, Timeline timeline) throws EK;

    public abstract void A0c(Object obj);

    public final InterfaceC1502dS A00() {
        return (InterfaceC1502dS) AbstractC1589es.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AFL();
        }
    }

    public final void A02(InterfaceC1489dF interfaceC1489dF, InterfaceC1502dS interfaceC1502dS) {
        this.A00 = interfaceC1489dF;
        this.A01 = interfaceC1502dS;
    }
}
