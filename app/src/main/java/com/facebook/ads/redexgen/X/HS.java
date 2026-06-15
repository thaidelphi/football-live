package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HS implements View.OnTouchListener {
    public final /* synthetic */ C0906Kj A00;

    public HS(C0906Kj c0906Kj) {
        this.A00 = c0906Kj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        AbstractC0786Ft abstractC0786Ft;
        AbstractC0786Ft abstractC0786Ft2;
        float x10 = motionEvent.getX();
        view2 = this.A00.A0H;
        if (x10 >= view2.getX()) {
            float x11 = motionEvent.getX();
            view3 = this.A00.A0H;
            float x12 = view3.getX();
            view4 = this.A00.A0H;
            if (x11 <= x12 + view4.getWidth()) {
                float y10 = motionEvent.getY();
                view5 = this.A00.A0H;
                if (y10 >= view5.getY()) {
                    float y11 = motionEvent.getY();
                    view6 = this.A00.A0H;
                    float y12 = view6.getY();
                    view7 = this.A00.A0H;
                    if (y11 > y12 + view7.getHeight()) {
                        return false;
                    }
                    abstractC0786Ft = this.A00.A03;
                    if (abstractC0786Ft == null) {
                        return true;
                    }
                    abstractC0786Ft2 = this.A00.A03;
                    abstractC0786Ft2.dispatchTouchEvent(motionEvent);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
