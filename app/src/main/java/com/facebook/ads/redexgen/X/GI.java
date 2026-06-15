package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class GI extends AnimatorListenerAdapter {
    public final /* synthetic */ C1652fu A00;
    public final /* synthetic */ boolean A01;

    public GI(C1652fu c1652fu, boolean z10) {
        this.A00 = c1652fu;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        GT gt;
        C1355b5 c1355b5;
        AbstractC2058md abstractC2058md;
        C1355b5 c1355b52;
        C1355b5 c1355b53;
        C1728h9 c1728h9;
        C1728h9 c1728h92;
        super.onAnimationEnd(animator);
        gt = this.A00.A0N;
        gt.setTranslationY(0.0f);
        this.A00.A0W();
        if (!this.A01) {
            c1728h9 = this.A00.A0K;
            if (c1728h9 != null) {
                c1728h92 = this.A00.A0K;
                c1728h92.destroy();
            }
        }
        c1355b5 = this.A00.A0l;
        if (c1355b5 == null) {
            return;
        }
        abstractC2058md = this.A00.A0G;
        if (!abstractC2058md.A1H()) {
            c1355b53 = this.A00.A0l;
            c1355b53.setVisibility(this.A01 ? 8 : 0);
            return;
        }
        c1355b52 = this.A00.A0l;
        c1355b52.setVisibility(8);
    }
}
