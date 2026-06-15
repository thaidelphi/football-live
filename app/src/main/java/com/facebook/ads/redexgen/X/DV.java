package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class DV implements Animation.AnimationListener {
    public final /* synthetic */ View$OnClickListenerC0947Lz A00;

    public DV(View$OnClickListenerC0947Lz view$OnClickListenerC0947Lz) {
        this.A00 = view$OnClickListenerC0947Lz;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i10;
        Handler handler;
        Runnable runnable;
        int i11;
        this.A00.A06();
        i10 = this.A00.A04;
        if (i10 <= 0) {
            return;
        }
        handler = this.A00.A05;
        runnable = this.A00.A07;
        i11 = this.A00.A04;
        handler.postDelayed(runnable, i11);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
