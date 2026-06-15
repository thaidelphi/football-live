package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.ValueAnimator;
/* renamed from: com.facebook.ads.redexgen.X.Iw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0867Iw implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1346at A02;

    public C0867Iw(C1346at c1346at, int i10, int i11) {
        this.A02 = c1346at;
        this.A01 = i10;
        this.A00 = i11;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A02.A07(this.A00, this.A01, false);
        valueAnimator = this.A02.A00;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator2 = this.A02.A00;
        valueAnimator2.removeAllListeners();
        this.A02.A00 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        EnumC0860Ip enumC0860Ip;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        C1346at c1346at = this.A02;
        int i11 = this.A01;
        i10 = this.A02.A04;
        if (i11 == i10) {
            enumC0860Ip = EnumC0860Ip.A02;
        } else {
            enumC0860Ip = EnumC0860Ip.A04;
        }
        c1346at.A01 = enumC0860Ip;
        valueAnimator = this.A02.A00;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator2 = this.A02.A00;
        valueAnimator2.removeAllListeners();
        this.A02.A00 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
