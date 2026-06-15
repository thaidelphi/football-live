package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class GT extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final View$OnClickListenerC1689gW A02;
    public static final int A05 = (int) (CP.A02 * 36.0f);
    public static final int A06 = (int) (CP.A02 * 36.0f);
    public static final int A03 = (int) (CP.A02 * 23.0f);
    public static final int A04 = (int) (CP.A02 * 3.0f);
    public static final int A07 = (int) (CP.A02 * 4.0f);

    public GT(C1900k1 c1900k1, View$OnClickListenerC1689gW view$OnClickListenerC1689gW, AbstractC2058md abstractC2058md, A7 a72, DR dr, JL jl, C0710Cv c0710Cv, C04542c c04542c, FP fp) {
        super(c1900k1);
        this.A00 = c04542c.A09(true);
        this.A01 = new RelativeLayout(c1900k1);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1900k1, abstractC2058md.A1b().A0H().A04());
        if (view$OnClickListenerC1689gW == null) {
            this.A02 = new View$OnClickListenerC1689gW(c1900k1, abstractC2058md.A0e(), (C04542c) null, a72, dr, jl, c0710Cv, abstractC2058md.A1c());
        } else {
            this.A02 = view$OnClickListenerC1689gW;
        }
        A02();
        this.A02.setCta(abstractC2058md.A1b().A0H(), abstractC2058md.A1g(), new HashMap(), fp);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1900k1 c1900k1, View view) {
        ImageView imageView = new ImageView(c1900k1);
        imageView.setImageBitmap(DC.A01(DB.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1900k1 c1900k1, String str) {
        Button button = new Button(c1900k1);
        D3.A0I(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        D3.A0M(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1900k1, button);
    }

    public final void A02() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    public final void A03(String str) {
        this.A02.A0A(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC2058md abstractC2058md, DQ dq) {
        this.A02.A0B(abstractC2058md, dq);
    }

    public void setCta(C04552d c04552d, String str, HashMap<String, String> extras, FP fp) {
        this.A02.setCta(c04552d, str, extras, fp);
    }
}
