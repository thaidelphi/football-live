package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
/* renamed from: com.facebook.ads.redexgen.X.dl  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1521dl extends BY {
    public final /* synthetic */ HL A00;
    public final /* synthetic */ HM A01;

    public C1521dl(HM hm, HL hl) {
        this.A01 = hm;
        this.A00 = hl;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1527ds(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
