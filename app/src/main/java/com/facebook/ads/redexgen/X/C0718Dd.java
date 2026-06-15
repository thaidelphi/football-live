package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;
/* renamed from: com.facebook.ads.redexgen.X.Dd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0718Dd extends AdNativeComponentView {
    public static final int A01 = (int) (CP.A02 * 1.0f);
    public final ImageView A00;

    public C0718Dd(C1900k1 c1900k1) {
        super(c1900k1);
        this.A00 = new E0(c1900k1);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        CU.A04(this.A00, CU.A0B);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        D3.A0K(this.A00, -2130706433);
        setPadding(A01, A01, A01, A01);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
