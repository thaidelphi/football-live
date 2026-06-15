package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HB extends AnimatorListenerAdapter {
    public final /* synthetic */ C0914Kr A00;
    public final /* synthetic */ boolean A01;

    public HB(C0914Kr c0914Kr, boolean z10) {
        this.A00 = c0914Kr;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        GT gt;
        C1728h9 c1728h9;
        C1728h9 c1728h92;
        super.onAnimationEnd(animator);
        gt = this.A00.A0H;
        gt.setTranslationY(0.0f);
        this.A00.A0U();
        if (this.A01) {
            return;
        }
        c1728h9 = this.A00.A0G;
        if (c1728h9 == null) {
            return;
        }
        c1728h92 = this.A00.A0G;
        c1728h92.destroy();
    }
}
