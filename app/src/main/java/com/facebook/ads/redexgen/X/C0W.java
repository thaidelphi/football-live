package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.0W  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0W extends C04331h {
    public C0926Ld A00;
    public List<C0821Hc> A01;

    public C0W(C1900k1 c1900k1) {
        super(c1900k1);
        this.A00 = new C0926Ld(this, 1, null, null, null);
    }

    public final void A20(JL jl) {
        if (this.A00 != null) {
            this.A00.A0c(jl);
        }
    }

    public C0926Ld getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
