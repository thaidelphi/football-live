package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class IX extends AbstractC1418c6 {
    public final Paint A00;
    public final C1900k1 A01;
    public final AF A02;
    public final AbstractC1415c3 A03;
    public final AbstractC1409bx A04;
    public final AbstractC1407bv A05;
    public final C0859Io A06;

    public IX(C1900k1 c1900k1, boolean z10, AF af) {
        super(c1900k1);
        this.A04 = new C0845Ia(this);
        this.A05 = new IZ(this);
        this.A03 = new IY(this);
        this.A02 = af;
        this.A01 = c1900k1;
        this.A06 = new C0859Io(c1900k1, z10);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams btnLayout = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        btnLayout.addRule(13);
        this.A06.setLayoutParams(btnLayout);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z10) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        D3.A0K(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
        D3.A0E(1004, this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1418c6
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new View$OnClickListenerC0856Il(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1418c6
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i10 = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i10 - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f10 = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f10, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
