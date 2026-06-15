package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: com.facebook.ads.redexgen.X.Hb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0820Hb extends LinearLayout {
    public static final int A04 = (int) (CP.A02 * 32.0f);
    public static final int A05 = (int) (CP.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C0772Ff A02;
    public final C1900k1 A03;

    public C0820Hb(C1900k1 c1900k1) {
        super(c1900k1);
        this.A03 = c1900k1;
        A00(c1900k1);
    }

    private final void A00(C1900k1 c1900k1) {
        setGravity(16);
        this.A02 = new C0772Ff(c1900k1);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c1900k1);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c1900k1);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        D3.A0W(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c1900k1);
        D3.A0W(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i10, int i11) {
        this.A00.setTextColor(i10);
        this.A01.setTextColor(i11);
    }

    public void setPageDetails(C04652n c04652n) {
        AsyncTaskC1695gc asyncTaskC1695gc = new AsyncTaskC1695gc(this.A02, this.A03);
        asyncTaskC1695gc.A05(A04, A04);
        asyncTaskC1695gc.A07(c04652n.A01());
        this.A00.setText(c04652n.A02());
        this.A01.setText(c04652n.A03());
    }
}
