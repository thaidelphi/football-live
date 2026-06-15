package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class DW implements Animation.AnimationListener {
    public final /* synthetic */ View$OnClickListenerC0947Lz A00;

    public DW(View$OnClickListenerC0947Lz view$OnClickListenerC0947Lz) {
        this.A00 = view$OnClickListenerC0947Lz;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((C1773hu) this.A00).A07.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
