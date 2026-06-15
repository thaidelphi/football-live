package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.cV  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1443cV extends C0773Fg {
    public final ImageView A00;
    public final C1900k1 A01;

    public C1443cV(C1900k1 c1900k1) {
        super(c1900k1);
        this.A01 = c1900k1;
        setRadius(30);
        this.A00 = new ImageView(c1900k1);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(boolean z10) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        AsyncTaskC1695gc asyncTaskC1695gc = new AsyncTaskC1695gc(this.A00, this.A01);
        asyncTaskC1695gc.A04();
        asyncTaskC1695gc.A07(str);
        asyncTaskC1695gc.A06(new FA() { // from class: com.facebook.ads.redexgen.X.cX
            @Override // com.facebook.ads.redexgen.X.FA
            public final void ADM(boolean z10) {
                C1443cV.this.A00(z10);
            }
        });
    }
}
