package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class GH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1652fu A00;

    public GH(C1652fu c1652fu) {
        this.A00 = c1652fu;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        View view2;
        view = this.A00.A0A;
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view2 = this.A00.A0A;
        view2.requestLayout();
    }
}
