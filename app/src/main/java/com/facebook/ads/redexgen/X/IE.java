package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class IE implements View.OnTouchListener {
    public final /* synthetic */ C1433cL A00;

    public IE(C1433cL c1433cL) {
        this.A00 = c1433cL;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C9J c9j;
        c9j = this.A00.A0C;
        c9j.A02(new C1399bn(view, motionEvent));
        return false;
    }
}
