package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;
/* renamed from: com.facebook.ads.redexgen.X.De  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class animation.Animation$AnimationListenerC0719De implements Animation.AnimationListener {
    public final /* synthetic */ C05576e A00;
    public final /* synthetic */ AbstractC1762hh A01;
    public final /* synthetic */ AbstractC1762hh A02;

    public animation.Animation$AnimationListenerC0719De(AbstractC1762hh abstractC1762hh, AbstractC1762hh abstractC1762hh2, C05576e c05576e) {
        this.A01 = abstractC1762hh;
        this.A02 = abstractC1762hh2;
        this.A00 = c05576e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        D3.A0F(this.A02);
        new Handler().postDelayed(new C1765hl(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
