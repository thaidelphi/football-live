package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.c6  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1418c6 extends RelativeLayout implements IQ {
    public C1433cL A00;

    public AbstractC1418c6(C1900k1 c1900k1) {
        super(c1900k1);
    }

    public AbstractC1418c6(C1900k1 c1900k1, AttributeSet attributeSet, int i10) {
        super(c1900k1, attributeSet, i10);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AAk(C1433cL c1433cL) {
        this.A00 = c1433cL;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AJa(C1433cL c1433cL) {
        A08();
        this.A00 = null;
    }

    public C1433cL getVideoView() {
        return this.A00;
    }
}
