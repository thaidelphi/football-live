package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class AN implements View.OnTouchListener {
    public final /* synthetic */ C1827iq A00;
    public final /* synthetic */ boolean A01;

    public AN(C1827iq c1827iq, boolean z10) {
        this.A00 = c1827iq;
        this.A01 = z10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        return true;
    }
}
