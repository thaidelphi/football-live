package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Iy  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0869Iy implements Animator.AnimatorListener {
    public final /* synthetic */ C1345as A00;

    public C0869Iy(C1345as c1345as) {
        this.A00 = c1345as;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = EnumC0860Ip.A04;
        view = this.A00.A05;
        D3.A0F(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
