package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Li  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0931Li extends C1433cL {
    public C0931Li(C1900k1 c1900k1) {
        super(c1900k1);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int newWidthSpec = View.MeasureSpec.getMode(i10);
        if (newWidthSpec == 1073741824) {
            i11 = i10;
        } else {
            int newWidthSpec2 = View.MeasureSpec.getMode(i11);
            if (newWidthSpec2 == 1073741824) {
                i10 = i11;
            }
        }
        super.onMeasure(i10, i11);
    }
}
