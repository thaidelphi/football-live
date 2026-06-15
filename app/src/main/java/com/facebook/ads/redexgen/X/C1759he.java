package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.he  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1759he extends AbstractC0722Dh {
    public final F8 A00;

    public C1759he(C1900k1 c1900k1, View.OnClickListener onClickListener) {
        super(c1900k1, onClickListener);
        this.A00 = new F8(c1900k1);
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final C1759he A0F(String str) {
        new AsyncTaskC1695gc(this.A00, this.A01).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C1760hf(this)).A07(str);
        A0C();
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0722Dh
    public int getMediaViewId() {
        return this.A00.getId();
    }
}
