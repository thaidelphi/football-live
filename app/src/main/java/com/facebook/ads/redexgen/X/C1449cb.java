package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.cb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1449cb extends C0773Fg {
    public final ImageView A00;
    public final C1900k1 A01;

    public C1449cb(C1900k1 c1900k1) {
        super(c1900k1);
        this.A01 = c1900k1;
        this.A00 = new ImageView(c1900k1);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC1695gc downloadImageTask = new AsyncTaskC1695gc(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
