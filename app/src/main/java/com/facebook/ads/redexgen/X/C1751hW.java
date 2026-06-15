package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.hW  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1751hW extends AbstractC0722Dh {
    public C0898Kb A00;
    public boolean A01;
    public boolean A02;
    public final ViewGroup A03;
    public final C05987t A04;
    public final A7 A05;
    public final C1433cL A06;
    public final AbstractC1415c3 A07;
    public final AbstractC1413c1 A08;
    public final C1387bb A09;
    public final View$OnClickListenerC1380bU A0A;
    public final C1379bT A0B;
    public final JK A0C;
    public final JL A0D;

    public C1751hW(C1900k1 c1900k1, A7 a72, C05987t c05987t, AF af, View.OnClickListener onClickListener) {
        super(c1900k1, onClickListener);
        this.A02 = false;
        this.A01 = false;
        this.A07 = new C0936Lo(this);
        this.A08 = new C0935Ln(this);
        this.A05 = a72;
        this.A04 = c05987t;
        this.A0C = A00();
        this.A0D = A07();
        this.A03 = new FrameLayout(c1900k1);
        addView(this.A03, new RelativeLayout.LayoutParams(-1, -1));
        this.A06 = A01(af);
        this.A0A = A04();
        this.A09 = A03();
        this.A0B = A06(af);
        A0C();
    }

    private C1757hc A00() {
        return new C1757hc(this);
    }

    private C1433cL A01(AF af) {
        C1433cL c1433cL = new C1433cL(super.A01);
        D3.A0I(c1433cL);
        c1433cL.setFunnelLoggingHandler(af);
        c1433cL.getEventBus().A03(this.A07, this.A08);
        if (C06419m.A1S(super.A01)) {
            c1433cL.setVolume(0.0f);
        }
        if (!C06419m.A1N(super.A01)) {
            c1433cL.setOnClickListener(new View$OnClickListenerC0724Dj(this));
        }
        RelativeLayout.LayoutParams videoLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        videoLayoutParams.addRule(13);
        addView(c1433cL, videoLayoutParams);
        return c1433cL;
    }

    private C1387bb A03() {
        C1387bb c1387bb = new C1387bb(super.A01);
        c1387bb.setTextColor(-1);
        D3.A0W(c1387bb, false, 12);
        c1387bb.setGravity(17);
        this.A06.A0h(c1387bb);
        return c1387bb;
    }

    private View$OnClickListenerC1380bU A04() {
        View$OnClickListenerC1380bU view$OnClickListenerC1380bU = new View$OnClickListenerC1380bU(super.A01);
        this.A06.A0h(view$OnClickListenerC1380bU);
        return view$OnClickListenerC1380bU;
    }

    private C1379bT A06(AF af) {
        C1379bT c1379bT = new C1379bT(super.A01, af, true);
        c1379bT.setBackgroundPaintColor(855638016);
        this.A06.A0h(c1379bT);
        return c1379bT;
    }

    private JL A07() {
        return new JL(this, 50, true, new WeakReference(this.A0C), super.A01);
    }

    private void A08() {
        if (getVisibility() == 0 && this.A01 && hasWindowFocus()) {
            this.A0D.A0U();
        } else {
            this.A0D.A0V();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0722Dh
    public final void A0A() {
        this.A0D.A0V();
        this.A06.getEventBus().A04(this.A07, this.A08);
        this.A06.A0Y();
        D3.A0H(this.A06);
        if (this.A00 != null) {
            this.A00.A0p();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0722Dh
    public final void A0B() {
        this.A0B.A09();
        this.A02 = true;
        this.A0D.A0U();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0722Dh
    public final void A0C() {
        super.A0C();
        if (C06419m.A1T(super.A01)) {
            D3.A0H(this.A0A);
            this.A0A.setLayoutParams(A00(true, false));
            addView(this.A0A);
        }
        if (C06419m.A1P(super.A01)) {
            D3.A0H(this.A09);
            this.A09.setLayoutParams(A00(true, true));
            addView(this.A09);
        }
        if (C06419m.A1R(super.A01)) {
            D3.A0H(this.A0B);
            this.A0B.setLayoutParams(A00(false, false));
            addView(this.A0B);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0722Dh
    public final boolean A0D() {
        return this.A06.A0n();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0722Dh
    public final boolean A0E() {
        if (getMeasuredWidth() <= 0 || this.A06.getMeasuredWidth() <= 0) {
            return true;
        }
        int measuredWidth = (int) ((getMeasuredWidth() - this.A06.getMeasuredWidth()) / 2.0d);
        int i10 = AbstractC0722Dh.A05;
        int widthGap = AbstractC0722Dh.A04;
        return measuredWidth > i10 + (widthGap * 2);
    }

    public final C1751hW A0F(String str, String str2, String str3, String str4, String str5) {
        this.A06.setVideoURI(this.A04.A0S(str2));
        this.A00 = new C0898Kb(super.A01, this.A05, this.A06, str);
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            new AsyncTaskC1695gc(this.A03, super.A01).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C1752hX(this)).A07(str3);
        }
        if (str5 != null) {
            this.A0A.setPlayAccessibilityLabel(str4);
        }
        if (str5 != null) {
            this.A0A.setPauseAccessibilityLabel(str5);
        }
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0722Dh
    public int getMediaViewId() {
        return this.A06.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01 = true;
        A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01 = false;
        A08();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A08();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A08();
    }
}
