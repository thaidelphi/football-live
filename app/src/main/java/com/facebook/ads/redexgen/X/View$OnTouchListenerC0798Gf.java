package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Gf  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnTouchListenerC0798Gf implements View.OnTouchListener {
    public final /* synthetic */ LJ A00;

    public View$OnTouchListenerC0798Gf(LJ lj) {
        this.A00 = lj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0802Gj c0802Gj;
        c0802Gj = this.A00.A0E;
        c0802Gj.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
