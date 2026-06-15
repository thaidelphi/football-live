package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Id  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0848Id extends AnimatorListenerAdapter {
    public final /* synthetic */ KK A00;

    public C0848Id(KK kk) {
        this.A00 = kk;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C1386ba(this), 2000L);
    }
}
