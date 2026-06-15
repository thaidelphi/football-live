package com.facebook.ads.redexgen.X;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class FL implements LayoutTransition.TransitionListener {
    public final /* synthetic */ FM A00;

    public FL(FM fm) {
        this.A00 = fm;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        ((FH) this.A00.A00.A00).A09.setAlpha(1.0f);
        this.A00.A00.A00.A0L.setAlpha(1.0f);
        this.A00.A00.A00.A0K.setAlpha(1.0f);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
    }
}
