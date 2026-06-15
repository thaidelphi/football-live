package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class HF extends RelativeLayout {
    public View$OnClickListenerC1689gW A00;
    public final View.OnClickListener A01;
    public final C04522a A02;
    public final C04652n A03;
    public final C1900k1 A04;
    public final C0772Ff A05;
    public final C0778Fl A06;
    public final String A07;
    public static final int A0B = (int) (CP.A02 * 2.0f);
    public static final int A0F = (int) (CP.A02 * 16.0f);
    public static final int A0D = (int) (CP.A02 * 20.0f);
    public static final int A0E = (int) (CP.A02 * 13.0f);
    public static final int A08 = (int) (CP.A02 * 72.0f);
    public static final int A0C = (int) (CP.A02 * 8.0f);
    public static final int A0A = (int) (CP.A02 * 24.0f);
    public static final int A09 = (int) (CP.A02 * 16.0f);

    public HF(C1900k1 c1900k1, C04652n c04652n, C04522a c04522a, View$OnClickListenerC1689gW view$OnClickListenerC1689gW, String str, View.OnClickListener onClickListener) {
        super(c1900k1);
        this.A04 = c1900k1;
        this.A03 = c04652n;
        this.A02 = c04522a;
        this.A00 = view$OnClickListenerC1689gW;
        this.A07 = str;
        this.A01 = onClickListener;
        this.A05 = new C0772Ff(this.A04);
        this.A06 = new C0778Fl(this.A04, C04542c.A01(null), true, false, true);
        A00();
    }

    private void A00() {
        AbstractC0779Fm.A00(this.A04, this, this.A03.A01());
        ImageView imageView = new ImageView(this.A04);
        imageView.setImageBitmap(DC.A01(DB.REDESIGN_CLOSE_ICON));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0A, A0A);
        imageView.setColorFilter(-1);
        layoutParams.addRule(11);
        layoutParams.setMargins(A09, A09, A09, A09);
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
        imageView.setOnClickListener(this.A01);
        LinearLayout layout = new LinearLayout(this.A04);
        layout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        layout.setGravity(17);
        layout.setOrientation(1);
        ImageView closeImageView = this.A05;
        D3.A0K(closeImageView, 0);
        this.A05.setRadius(A0B);
        new AsyncTaskC1695gc(this.A05, this.A04).A04().A07(this.A03.A01());
        this.A06.A04(this.A02.A0F(), this.A03.A03(), null, false, true);
        this.A06.setAlignment(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, A0F, 0, A0F);
        this.A06.getDescriptionTextView().setText(this.A07);
        layout.addView(this.A05, new LinearLayout.LayoutParams(A08, A08));
        layout.addView(this.A06, layoutParams2);
        if (this.A00 != null) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            this.A00.setPadding(A0D, A0E, A0D, A0E);
            this.A00.setLayoutParams(layoutParams3);
            D3.A0Q(this.A00, D3.A06(-16738826, A0C));
            this.A00.setStateListAnimator(null);
            D3.A0V(this.A00);
            layout.addView(this.A00);
        }
        addView(layout);
    }
}
