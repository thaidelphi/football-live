package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: com.facebook.ads.redexgen.X.Iu  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0865Iu extends AnimatorListenerAdapter {
    public static String[] A01 = {"TrZNDxp7XgPrLwMeMcKKV4LE6uuIfYVU", "ULEyXJCc47teQ6YZ0eXPV0V7C", "At5pbwNHr2LiheLI", "DEC0Eom9qK7OI0oKL1WQ5oYEbz9lc5Gt", "Go2f3K9Z", "jmF0Wp1VVfzp13IVqL", "AKLTgtcpjio1lTTBDL2vrOjYxOjCOJfp", "yZ5UHZcmQhcxGg9JLD5yPnSTYa225zYb"};
    public final /* synthetic */ C1348av A00;

    public C0865Iu(C1348av c1348av) {
        this.A00 = c1348av;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        boolean z10;
        View view;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        View view2;
        z10 = this.A00.A04;
        if (z10) {
            view2 = this.A00.A03;
            D3.A0F(view2);
        }
        C1348av c1348av = this.A00;
        if (A01[5].length() == 4) {
            throw new RuntimeException();
        }
        A01[2] = "6jsFEd17ts6f8PQH6w";
        view = c1348av.A03;
        view.setAlpha(0.0f);
        this.A00.A01 = EnumC0860Ip.A04;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator == null) {
            return;
        }
        viewPropertyAnimator2 = this.A00.A00;
        viewPropertyAnimator2.setListener(null);
        this.A00.A00 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        this.A00.A01 = EnumC0860Ip.A02;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator == null) {
            return;
        }
        viewPropertyAnimator2 = this.A00.A00;
        viewPropertyAnimator2.setListener(null);
        this.A00.A00 = null;
    }
}
