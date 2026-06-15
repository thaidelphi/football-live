package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import d5.g;
/* compiled from: ViewUtilsLollipop.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f13886a = {16843848};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, float f10) {
        int integer = view.getResources().getInteger(g.f24062a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{16842910, d5.b.D, -d5.b.E}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
