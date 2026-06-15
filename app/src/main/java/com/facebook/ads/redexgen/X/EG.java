package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class EG extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C04843g A02;
    public final C1900k1 A03;
    public final EJ A04;
    public final boolean A05;
    public static final int A09 = (int) (CP.A02 * 16.0f);
    public static final int A0A = (int) (CP.A02 * 8.0f);
    public static final int A0D = (int) (CP.A02 * 44.0f);
    public static final int A08 = (int) (CP.A02 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (CP.A02 * 75.0f);
    public static final int A0B = (int) (CP.A02 * 25.0f);
    public static final int A0F = (int) (CP.A02 * 45.0f);
    public static final int A0C = (int) (CP.A02 * 15.0f);
    public static final int A06 = (int) (CP.A02 * 16.0f);

    public EG(EF ef) {
        super(EF.A01(ef));
        this.A03 = EF.A01(ef);
        this.A02 = AbstractC04853h.A00(this.A03.A02());
        this.A04 = EF.A03(ef);
        this.A01 = EF.A09(ef) ? A0E : A0F;
        this.A00 = EF.A09(ef) ? A0B : A0C;
        this.A05 = EF.A0A(ef);
        setFocusable(true);
        View A01 = A01(ef);
        View A00 = A00(ef);
        View footerView = getFooterView();
        D3.A0I(A01);
        D3.A0I(A00);
        D3.A0I(footerView);
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(-1, -2);
        contentParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams.addRule(3, A01.getId());
        layoutParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(12);
        footerParams.setMargins(A09, 0, A09, A09);
        addView(A01, contentParams);
        addView(A00, layoutParams);
        addView(footerView, footerParams);
        footerView.setVisibility(EF.A0B(ef) ? 0 : 8);
    }

    public /* synthetic */ EG(EF ef, ED ed) {
        this(ef);
    }

    private View A00(EF ef) {
        ImageView imageView = new ImageView(getContext());
        imageView.setPadding(this.A00, this.A00, this.A00, this.A00);
        imageView.setImageBitmap(DC.A01(EF.A02(ef)));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A01, this.A01);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(EF.A00(ef));
        D3.A0Q(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        layoutParams.setMargins(A09, 0, A09, A09);
        TextView subtitleView = new TextView(getContext());
        D3.A0W(subtitleView, true, 20);
        subtitleView.setTextColor(-14934495);
        subtitleView.setText(EF.A04(ef));
        subtitleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A09, 0, A09, A09);
        TextView titleView = new TextView(getContext());
        D3.A0W(titleView, false, 16);
        titleView.setTextColor(-10459280);
        titleView.setText(EF.A05(ef));
        titleView.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A09, 0, A09, A09);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(subtitleView, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        if (EF.A08(ef)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(EF.A06(ef))) {
                C0772Ff c0772Ff = new C0772Ff(this.A03);
                LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(A0F, A0F);
                iconParams.setMargins(0, 0, A0A, 0);
                c0772Ff.setFullCircleCorners(true);
                new AsyncTaskC1695gc(c0772Ff, this.A03).A05(A0F, A0F).A07(EF.A06(ef));
                linearLayout2.addView(c0772Ff, iconParams);
            }
            EL el = new EL(this.A03);
            el.setData(EF.A07(ef), DB.CHECKMARK);
            el.setSelected(true);
            linearLayout2.addView(el, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(EF ef) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (EF.A0C(ef)) {
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(A08, A08, A08, A08);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(DC.A01(DB.CROSS));
            imageView.setOnClickListener(new ED(this));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0D, A0D);
            layoutParams.setMargins(A07, A07, A07, A07);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(DC.A01(DB.SETTINGS));
        imageView.setColorFilter(-13272859);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        D3.A0W(textView, false, 16);
        textView.setTextColor(-13272859);
        textView.setPadding(A0A, A0A, A0A, A0A);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new EE(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, settingsIconParams);
        return linearLayout;
    }
}
