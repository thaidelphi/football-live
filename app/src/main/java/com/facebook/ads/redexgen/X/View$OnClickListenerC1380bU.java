package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.bU  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class View$OnClickListenerC1380bU extends RelativeLayout implements IQ, View.OnClickListener {
    public C1433cL A00;
    public final AbstractC1415c3 A01;
    public final AbstractC1409bx A02;
    public final AbstractC1407bv A03;
    public final AbstractC1405bt A04;
    public final C0859Io A05;
    public static final int A07 = (int) (CP.A02 * 16.0f);
    public static final int A06 = (int) (CP.A02 * 6.0f);

    public View$OnClickListenerC1380bU(C1900k1 c1900k1) {
        super(c1900k1);
        this.A04 = new KJ(this);
        this.A02 = new KI(this);
        this.A03 = new KH(this);
        this.A01 = new KG(this);
        D3.A0Q(this, D3.A06(855638016, A06));
        this.A05 = new C0859Io(c1900k1, true);
        this.A05.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A07, A07);
        layoutParams.addRule(13);
        setVisibility(8);
        addView(this.A05, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AAk(C1433cL c1433cL) {
        this.A00 = c1433cL;
        setOnClickListener(this);
        this.A05.setOnClickListener(this);
        if (this.A00 != null) {
            this.A00.getEventBus().A03(this.A04, this.A01, this.A02, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AJa(C1433cL c1433cL) {
        if (this.A00 != null) {
            this.A00.getEventBus().A04(this.A03, this.A02, this.A01, this.A04);
        }
        setOnClickListener(null);
        this.A05.setOnClickListener(null);
        this.A00 = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                return;
            }
            if (this.A00.getState() == JI.A07 || this.A00.getState() == JI.A05 || this.A00.getState() == JI.A06) {
                this.A00.A0g(IP.A04, 11);
            } else if (this.A00.getState() == JI.A0A) {
                this.A00.A0k(true, 7);
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A05.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A05.setPlayAccessibilityLabel(str);
    }
}
