package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HA implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0914Kr A00;

    public HA(C0914Kr c0914Kr) {
        this.A00 = c0914Kr;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C1433cL c1433cL;
        C1433cL c1433cL2;
        c1433cL = this.A00.A0a;
        c1433cL.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        c1433cL2 = this.A00.A0a;
        c1433cL2.requestLayout();
    }
}
