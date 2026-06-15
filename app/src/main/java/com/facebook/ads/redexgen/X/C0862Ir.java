package com.facebook.ads.redexgen.X;

import android.animation.Animator;
/* renamed from: com.facebook.ads.redexgen.X.Ir  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0862Ir implements Animator.AnimatorListener {
    public final /* synthetic */ C1349aw A00;

    public C0862Ir(C1349aw c1349aw) {
        this.A00 = c1349aw;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = EnumC0860Ip.A02;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
