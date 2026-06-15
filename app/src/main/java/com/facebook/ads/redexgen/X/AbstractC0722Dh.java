package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.Dh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0722Dh extends RelativeLayout {
    public boolean A00;
    public final C1900k1 A01;
    public final C0721Dg A02;
    public static final int A04 = (int) (CP.A02 * 4.0f);
    public static final int A05 = (int) (CP.A02 * 40.0f);
    public static final int A03 = (int) (CP.A02 * 24.0f);

    public abstract int getMediaViewId();

    public AbstractC0722Dh(C1900k1 c1900k1, View.OnClickListener onClickListener) {
        super(c1900k1);
        this.A00 = true;
        this.A01 = c1900k1;
        this.A02 = new C0721Dg(this.A01);
        this.A02.setOnClickListener(onClickListener);
    }

    public final RelativeLayout.LayoutParams A00(boolean z10, boolean z11) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A05, A03);
        layoutParams.setMargins(A04, A04, A04, A04);
        if (this.A00) {
            layoutParams.addRule(z10 ? 12 : 10);
            layoutParams.addRule(z11 ? 11 : 9);
        } else {
            int mediaViewId = getMediaViewId();
            layoutParams.addRule(z10 ? 8 : 6, mediaViewId);
            layoutParams.addRule(z11 ? 7 : 5, mediaViewId);
        }
        return layoutParams;
    }

    public void A0A() {
    }

    public void A0B() {
    }

    public void A0C() {
        D3.A0H(this.A02);
        this.A02.setLayoutParams(A00(false, true));
        addView(this.A02);
    }

    public boolean A0D() {
        return true;
    }

    public boolean A0E() {
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean A0E = A0E();
        boolean newShouldLayoutButtonsRelativeToParent = this.A00;
        if (A0E != newShouldLayoutButtonsRelativeToParent) {
            this.A00 = A0E;
            A0C();
        }
    }
}
