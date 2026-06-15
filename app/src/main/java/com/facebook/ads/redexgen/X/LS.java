package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.text.NumberFormat;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class LS extends AbstractC1675gH {
    public static byte[] A0J;
    public static String[] A0K = {"zra6hnpaifP7bxfZB5bQOHnqie2tQjg", "wy9og3M9LeWlDzkU0RS7zgtaq3xQKlMR", "jyAiwm88v9hsYzrfl9gFIABQTfRULZfl", "Wwy1p0nUO1H5ggrsb6VvEsAvpBZyxSvp", "wjN7zQjrZyyYli8cgu97rk5B2y3BycTh", "DSxnyYt0igg0K0GbJ5jSMl2rvJzineXI", "irrLwQMNjn2DglpbBC8hfvG7oGwbzPRC", "9jAewdJckPVrzkqluL1z0QkIRDh51Ovv"};
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public View A00;
    public View A01;
    public ImageView A02;
    public C1900k1 A03;
    public CH A04;
    public DQ A05;
    public DQ A06;
    public C1649fr A07;
    public C0838Ht A08;
    public C0844Hz A09;
    public C1345as A0A;
    public boolean A0B;
    public boolean A0C;
    public final DR A0D;
    public final InterfaceC0769Fc A0E;
    public final C0770Fd A0F;
    public final C0790Fx A0G;
    public final C1433cL A0H;
    public final C1355b5 A0I;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0J = new byte[]{-23, -117, 1, -6, 15, -2, 24, 12, 13, -6, 11, 13, 2, 7, 0, 24, -6, 7, 2, 6, -6, 13, 2, 8, 7, 12, 24, 9, 5, -6, 18, -2, -3, 26, 29, 33, 19, 45, 32, 19, 37, 15, 32, 18, 45, 33, 17, 32, 19, 19, 28, 45, 33, 22, 29, 37, 28, -7, -29, -11, 1, -25, -16, -26, 1, -27, -29, -12, -26, 1, -11, -22, -15, -7, -16, -17, -19, -33, -20, -35, -26, -29, -35, -27};
    }

    static {
        A0C();
        A0O = (int) (CP.A02 * 16.0f);
        A0Y = (int) (CP.A02 * 12.0f);
        A0L = (int) (CP.A02 * 8.0f);
        A0M = (int) (CP.A02 * 10.0f);
        A0T = (int) (CP.A02 * 20.0f);
        A0U = (int) (CP.A02 * 13.0f);
        A0P = (int) (CP.A02 * 48.0f);
        A0X = (int) (CP.A02 * 14.0f);
        A0V = (int) (CP.A02 * 12.0f);
        A0N = (int) (CP.A02 * 8.0f);
        A0W = AnonymousClass43.A02(-1, 77);
        A0S = (int) (CP.A02 * 16.0f);
        A0Z = (int) (CP.A02 * 12.0f);
        A0Q = (int) (CP.A03 * 12.0f);
        A0R = (int) (CP.A03 * 16.0f);
    }

    public LS(C0790Fx c0790Fx) {
        super(c0790Fx, false);
        this.A0C = false;
        this.A0B = false;
        this.A03 = c0790Fx.A05();
        this.A06 = c0790Fx.A0B();
        this.A05 = c0790Fx.A0A();
        this.A0G = c0790Fx;
        this.A01 = new View(this.A03);
        D3.A0I(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A09();
        this.A0D = c0790Fx.A0C();
        AbstractC0779Fm.A00(c0790Fx.A05(), this, getAdInfo().A0F().A08());
        this.A0H = A01(c0790Fx);
        getAdDetailsView().bringToFront();
        if (!getAdDataBundle().A1P()) {
            this.A0I = A02(c0790Fx);
        } else {
            this.A0I = null;
        }
        if (getAdDataBundle().A1O()) {
            if (this.A0I != null) {
                this.A0I.setVisibility(8);
            }
            getAdDetailsView().setVisibility(8);
            A08();
        }
        A1D();
        this.A08 = new C0838Ht(this.A03, c0790Fx.A06(), getAdDataBundle());
        this.A0E = new C1671gD(this);
        this.A0F = new C0770Fd(c0790Fx, getAdDataBundle(), this.A0H, this.A0I, getAdDetailsView(), this.A0D, this.A0E);
        CK A0A = super.A08.A0A(getAdDataBundle());
        this.A03.A0H().A00(A0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A08);
        if (A0A.A00) {
            this.A0H.getVideoImplView().setOnClickListener(new G0(this));
        } else if (C06419m.A1I(getAdContextWrapper())) {
            FE.A00(this.A0H.getVideoImplView(), C06419m.A1J(getAdContextWrapper()), new G1(this));
        }
        if (c0790Fx.A04().A1L()) {
            this.A07 = new C1649fr(c0790Fx);
            View view = this.A07;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            addView(view, layoutParams2);
            getAdDetailsView().setVisibility(8);
        }
    }

    private C1433cL A01(C0790Fx c0790Fx) {
        RelativeLayout.LayoutParams layoutParams;
        C1433cL c1433cL = (C1433cL) c0790Fx.A02();
        int A1A = A1A(c0790Fx.A0B());
        this.A02 = (ImageView) c0790Fx.A03();
        if (!getAdDataBundle().A1P()) {
            ImageView imageView = this.A02;
            int i10 = AbstractC1675gH.A0J;
            int i11 = AbstractC1675gH.A0J;
            int toolbarHeight = AbstractC1675gH.A0J;
            imageView.setPadding(i10, i11, toolbarHeight, AbstractC1675gH.A0J);
            int toolbarHeight2 = AbstractC1675gH.A0K;
            layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, AbstractC1675gH.A0K);
            int toolbarHeight3 = AbstractC1675gH.A0I;
            layoutParams.setMargins(0, A1A, toolbarHeight3, 0);
            layoutParams.addRule(11);
        } else {
            int toolbarHeight4 = AbstractC1675gH.A0L;
            layoutParams = new RelativeLayout.LayoutParams(toolbarHeight4, AbstractC1675gH.A0L);
            int i12 = A0R;
            int i13 = A0Q;
            int toolbarHeight5 = A0R;
            layoutParams.setMargins(i12, i13, toolbarHeight5, A0Q);
            layoutParams.addRule(9);
        }
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (getAdDataBundle().A1O() && c1433cL != null) {
            View videoView = c1433cL.getVideoView();
            int paddingLeft = c1433cL.getVideoView().getPaddingLeft();
            int paddingTop = c1433cL.getVideoView().getPaddingTop();
            int paddingRight = c1433cL.getVideoView().getPaddingRight();
            int toolbarHeight6 = c1433cL.getVideoView().getPaddingBottom();
            videoView.setPadding(paddingLeft, paddingTop, paddingRight, toolbarHeight6 + A0Z);
        }
        layoutParams2.addRule(13);
        addView(c1433cL, layoutParams2);
        c1433cL.addView(this.A02, layoutParams);
        return c1433cL;
    }

    private C1355b5 A02(C0790Fx c0790Fx) {
        C1355b5 A0D = c0790Fx.A0D();
        A0D.A06(-1, AbstractC1675gH.A0D, false);
        A0D.setPadding(AbstractC1675gH.A0O, AbstractC1675gH.A0O, AbstractC1675gH.A0O, AbstractC1675gH.A0O);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1675gH.A0N);
        progressBarLayoutParams.addRule(12);
        addView(A0D, progressBarLayoutParams);
        return A0D;
    }

    private void A04() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A09 != null) {
            addView(this.A09.A0O(), layoutParams);
        }
    }

    private void A05() {
        addView(new G9(this.A0G.A05(), getAdDataBundle(), this.A0G.A0C()).A08(getCtaButton()));
    }

    private void A06() {
        D3.A0Z(this.A02, getCtaButton(), getAdDetailsView(), this.A01, this.A0F, this.A0G.A0B());
        for (IQ iq : this.A0H.getPlugins()) {
            if (iq instanceof IX) {
                this.A0H.A0i(iq);
                return;
            }
        }
    }

    private void A07() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0H.A0i(getAnimationPlugin());
        }
    }

    private void A08() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        A0E(relativeLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0O, 0);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        appMetadataLayoutParams.setMargins(A0O, A0Y, A0O, A0Y);
        appMetadataLayoutParams.addRule(12);
        relativeLayout2.addView(relativeLayout, layoutParams2);
        View$OnClickListenerC1689gW ctaButton = getCtaButton();
        ctaButton.setTextSize(14.0f);
        ctaButton.setIncludeFontPadding(false);
        ctaButton.setTextColor(-1);
        layoutParams2.addRule(0, ctaButton.getId());
        if (!getAdDataBundle().A1M()) {
            ctaButton.setPadding(A0M, A0M, A0M, A0M);
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(6, relativeLayout.getId());
            layoutParams.addRule(8, relativeLayout.getId());
            ctaButton.setBackgroundColor(-12549889);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            D3.A0Q(ctaButton, D3.A06(-16738826, A0L));
            ctaButton.setPadding(A0T, A0U, A0T, A0U);
            ctaButton.setStateListAnimator(null);
            D3.A0V(ctaButton);
        }
        layoutParams.addRule(11);
        if (ctaButton.getParent() != null) {
            D3.A0Z(ctaButton);
        }
        relativeLayout2.addView(ctaButton, layoutParams);
        addView(relativeLayout2, appMetadataLayoutParams);
        relativeLayout2.bringToFront();
    }

    private void A09() {
        if (this.A06 == null) {
            return;
        }
        this.A0A = new C1345as(this.A06, CommonGatewayClient.CODE_400, -this.A06.getToolbarHeight(), 0);
    }

    private void A0A() {
        new AF(getAdDataBundle().A1g(), getAdEventManager()).A04(AE.A0z, null);
        if (!getAdInfo().A0R()) {
            return;
        }
        super.A09.set(true);
        D3.A0R(this);
        D3.A0Z(this.A0I, this.A0F, this.A00);
        D3.A0J(this.A06);
        Pair<EnumC0837Hs, View> A03 = this.A08.A03(getCtaButton());
        this.A00 = (View) A03.second;
        A0F((EnumC0837Hs) A03.first);
        if (getAdInfo().A0I().A00() >= 0) {
            this.A0B = true;
            if (this.A06 != null) {
                this.A06.setToolbarActionMode(getAdDataBundle().A1o() ? 8 : 2);
                this.A06.setProgressImmediate(0.0f);
            }
            this.A04 = new CH((int) getAdInfo().A0I().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C1670gC(this));
            this.A04.A07();
        }
    }

    private void A0B() {
        if (this.A0A != null) {
            this.A0A.A40(true, false);
        }
        if (!this.A0G.A04().A1P() && !getAdDataBundle().A1O() && getAdDetailsAnimation() != null) {
            C1345as adDetailsAnimation = getAdDetailsAnimation();
            String[] strArr = A0K;
            if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            A0K[1] = "NNplzEPPEJhw482VYN3vhqCWu3reteuX";
            adDetailsAnimation.A40(true, false);
        }
    }

    private void A0D(int i10) {
        if (!getAdDataBundle().A1P()) {
            return;
        }
        this.A03.A0F().AJo(i10);
        this.A0H.A0b(i10);
        if (getAdDetailsView() instanceof AbstractC1694gb) {
            if ((getAdDetailsView() instanceof C0925Lc) || (getAdDetailsView() instanceof C0924Lb)) {
                D3.A0H(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, this.A0H.getVideoView().getId());
                    getAdDetailsView().setLayoutParams(layoutParams);
                    this.A0H.addView(getAdDetailsView());
                } else {
                    addView(getAdDetailsView(), layoutParams);
                }
            }
            getAdDetailsView().A0D(i10);
            ((AbstractC1694gb) getAdDetailsView()).A0U(this.A0H, i10);
        }
    }

    private void A0E(RelativeLayout relativeLayout) {
        int i10;
        String formattingRatingCount;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0P, A0P);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C0772Ff c0772Ff = new C0772Ff(this.A03);
        D3.A0K(c0772Ff, 0);
        D3.A0I(c0772Ff);
        new AsyncTaskC1695gc(c0772Ff, this.A03).A05(A0P, A0P).A07(getAdDataBundle().A1e().A01());
        TextView textView = new TextView(this.A03);
        D3.A0I(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(getAdDataBundle().A1a().A01().A07(true));
        textView.setText(getAdDataBundle().A1b().A0G().A0F());
        textView.setTextSize(!getAdDataBundle().A1M() ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C1900k1 c1900k1 = this.A03;
        if (!getAdDataBundle().A1M()) {
            i10 = A0X;
        } else {
            i10 = A0V;
        }
        C0774Fh c0774Fh = new C0774Fh(c1900k1, i10, 5, A0W, -1);
        c0774Fh.setGravity(16);
        LinearLayout.LayoutParams ratingCountParams = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(getAdDataBundle().A1a().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!getAdDataBundle().A1M()) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        starRatingContainerParams.leftMargin = A0N;
        LinearLayout linearLayout = new LinearLayout(this.A03);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(-2, A0S);
        ratingInfoContainerParams.topMargin = A0N / 2;
        ratingInfoContainerParams.addRule(3, textView.getId());
        linearLayout.addView(c0774Fh, ratingCountParams);
        linearLayout.addView(textView2, starRatingContainerParams);
        RelativeLayout.LayoutParams iconParams = new RelativeLayout.LayoutParams(-2, -2);
        iconParams.leftMargin = A0N;
        iconParams.addRule(1, c0772Ff.getId());
        iconParams.addRule(15);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        relativeLayout2.addView(linearLayout, ratingInfoContainerParams);
        relativeLayout2.addView(textView);
        relativeLayout.addView(relativeLayout2, iconParams);
        relativeLayout.addView(c0772Ff, layoutParams);
        if (TextUtils.isEmpty(getAdDataBundle().A1b().A0G().A0B())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c0774Fh.setRating(Float.parseFloat(getAdDataBundle().A1b().A0G().A0B()));
        if (getAdDataBundle().A1b().A0G().A08() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A03(0, 1, 108));
        if (!getAdDataBundle().A1M()) {
            formattingRatingCount = NumberFormat.getNumberInstance().format(Integer.parseInt(getAdDataBundle().A1b().A0G().A08()));
        } else {
            formattingRatingCount = CY.A01(Integer.parseInt(getAdDataBundle().A1b().A0G().A08()));
        }
        sb.append(formattingRatingCount);
        String formattingRatingCount2 = A03(1, 1, 13);
        sb.append(formattingRatingCount2);
        String formattingRatingCount3 = sb.toString();
        textView2.setText(formattingRatingCount3);
    }

    private void A0F(EnumC0837Hs enumC0837Hs) {
        if (getAdDataBundle().A1b().A0I().A03() && !getAdDataBundle().A1b().A0I().A02().isEmpty()) {
            this.A09 = new C0844Hz(this.A03, getAdDataBundle(), this.A0D, getCtaButton());
            D3.A0Z(this.A06, getAdDetailsView(), this.A02);
            A04();
        } else if (getAdDataBundle().A1b().A0I().A04() && getAdDataBundle().A1b().A0I().A02().isEmpty()) {
            A06();
            A05();
        } else {
            A0G(enumC0837Hs);
        }
    }

    private void A0G(EnumC0837Hs enumC0837Hs) {
        this.A0H.A0j(false);
        this.A0H.setVisibility(8);
        if (this.A06 instanceof C1767hn) {
            DQ dq = this.A05;
            if (A0K[2].charAt(18) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[3] = "VBTxPCVQSRRVVKfJEBHdIagRaEa9moGI";
            strArr[6] = "iS4EeCSjafPAdymtQeFXdNKcyC2MGxGr";
            if (dq != null) {
                D3.A0F(this.A06);
                this.A06 = this.A05;
                D3.A0J(this.A06);
            }
        }
        switch (enumC0837Hs) {
            case A03:
                FH oldEndCardAdDetailsView = getOldEndCardAdDetailsView();
                if (A0K[4].charAt(31) != 'A') {
                    A0K[2] = "XFfDcp5VJF8GQaNSTNs87nOmJmOzmbPV";
                    if (oldEndCardAdDetailsView == null) {
                        FH oldEndCard = getAdDetailsView();
                        oldEndCard.setVisibility(0);
                    } else {
                        addView(oldEndCardAdDetailsView);
                    }
                    RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
                    screenshotParams.setMargins(0, A1A(this.A06), 0, 0);
                    if (oldEndCardAdDetailsView != null) {
                        screenshotParams.addRule(2, oldEndCardAdDetailsView.getId());
                    } else {
                        FH oldEndCard2 = getAdDetailsView();
                        screenshotParams.addRule(2, oldEndCard2.getId());
                    }
                    addView(this.A00, screenshotParams);
                    return;
                }
                throw new RuntimeException();
            case A02:
                D3.A0Z(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(AbstractC1675gH.A0M, AbstractC1675gH.A0M, AbstractC1675gH.A0M, AbstractC1675gH.A0M);
                addView(this.A00, layoutParams);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A0J(C1406bu c1406bu) {
        super.A0J(c1406bu);
        if (this.A07 != null && this.A07.getVisibility() == 0) {
            return;
        }
        if (getAdDataBundle().A1P()) {
            this.A03.A0F().AJn(Double.toString(this.A0G.A04().A0T()));
        }
        A0D(getResources().getConfiguration().orientation);
        if (getAdDataBundle().A1D()) {
            this.A0H.setOnClickListener(getCtaButton());
        }
        if (getAdDataBundle().A1P()) {
            getAdDetailsView().setVisibility(0);
            if (getAdDetailsView() instanceof AbstractC1694gb) {
                ((AbstractC1694gb) getAdDetailsView()).A0S(getResources().getConfiguration().orientation);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A0K(KX kx) {
        super.A0K(kx);
        int A00 = kx.A00();
        int videoLengthMs = this.A0H.getDuration();
        int videoLengthMs2 = videoLengthMs - A00;
        if (getAnimationPlugin() != null && videoLengthMs2 < 3000 && getAnimationPlugin().A0J()) {
            getAnimationPlugin().A0F();
        }
        if (getAdDetailsView() instanceof AbstractC1694gb) {
            FH adDetailsView = getAdDetailsView();
            int videoLengthMs3 = A0K[2].charAt(18);
            if (videoLengthMs3 == 88) {
                throw new RuntimeException();
            }
            A0K[1] = "S0R1Vst7btMNh0acsAmYiD0yQ3U0B5iY";
            int currentPosMs = A00 / 1000;
            ((AbstractC1694gb) adDetailsView).A0Q(currentPosMs);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1675gH, com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A0z() {
        super.A0z();
        A07();
        this.A06 = null;
        this.A07 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1675gH, com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A14(C2T c2t, String str, double d10, Bundle bundle) {
        super.A14(c2t, str, d10, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(2, 31, 100), false)) {
            A0B();
        }
        if (bundle.getBoolean(A03(57, 18, 77), false)) {
            A0A();
        }
        if (bundle.getBoolean(A03(33, 24, 121), false)) {
            this.A0F.A07(this);
        }
        if (getAdDataBundle().A1P()) {
            boolean z10 = getAdDetailsView() instanceof AbstractC1694gb;
            if (A0K[2].charAt(18) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[3] = "TYF9Gze5okVE8nAMFw0kZuTKWJAG4GPN";
            strArr[6] = "e5C8lQxoH1vEX5uTYGqpe7vBIorNDTyW";
            if (z10) {
                ((AbstractC1694gb) getAdDetailsView()).A0P();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A15(C0897Ka c0897Ka) {
        super.A15(c0897Ka);
        if (getAdDataBundle().A1P()) {
            FH adDetailsView = getAdDetailsView();
            if (A0K[0].length() == 5) {
                throw new RuntimeException();
            }
            A0K[4] = "m5gTgOd0mlzOyrsuIVxaBMecvKjJBXrq";
            removeView(adDetailsView);
        }
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A17() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A19(boolean z10) {
        if (z10 && !this.A0C && !super.A09.get()) {
            this.A0F.A07(this);
            return true;
        } else if (getAdInfo().A0R()) {
            boolean z11 = super.A09.get();
            if (A0K[4].charAt(31) != 'A') {
                String[] strArr = A0K;
                strArr[3] = "EPxoCM5ZHywZjaL2iUUSFMk3WFd5m6XL";
                strArr[6] = "lTBjgNJWw5Z4CB7iubQhWZLtOmC1X7yD";
                if (!z11) {
                    this.A0H.A0f(II.A08);
                    return true;
                }
                return false;
            }
            throw new RuntimeException();
        } else {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1675gH
    public final FH A1B(C0790Fx c0790Fx, C2T c2t, String str) {
        double A0T2 = c0790Fx.A04().A0T();
        if (getAdDataBundle().A1P()) {
            if (C1433cL.A0T((float) A0T2)) {
                return new C0924Lb(c0790Fx.A05(), getCtaButton(), AbstractC1675gH.A0G, getColors(), str, c0790Fx.A06(), c0790Fx.A0C(), c0790Fx.A0E(), c0790Fx.A09(), c0790Fx.A04(), c0790Fx.A0D(), c0790Fx.A07());
            }
            if (C1433cL.A0U((float) A0T2)) {
                return new C0923La(c0790Fx.A05(), getCtaButton(), AbstractC1675gH.A0G, getColors(), str, c0790Fx.A06(), c0790Fx.A0C(), c0790Fx.A0E(), c0790Fx.A09(), c0790Fx.A04(), c0790Fx.A0D(), c0790Fx.A07());
            }
            return new C0925Lc(c0790Fx.A05(), getCtaButton(), AbstractC1675gH.A0G, getColors(), str, c0790Fx.A06(), c0790Fx.A0C(), c0790Fx.A0E(), c0790Fx.A09(), c0790Fx.A04(), c0790Fx.A0D(), c0790Fx.A07());
        }
        return new C1676gI(c0790Fx.A05(), getCtaButton(), AbstractC1675gH.A0H, c2t.A0G().A00() == C2Y.A05, getColors(), c2t.A0H().A06(), str, c0790Fx.A06(), c0790Fx.A0C(), c0790Fx.A0E(), c0790Fx.A09(), c0790Fx.A04());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1675gH
    public final C1676gI A1C(C0790Fx c0790Fx, C2T c2t, String str) {
        return new C1676gI(c0790Fx.A05(), getCtaButton(), AbstractC1675gH.A0H, c2t.A0G().A00() == C2Y.A05, getColors(), c2t.A0H().A06(), str, c0790Fx.A06(), c0790Fx.A0C(), c0790Fx.A0E(), c0790Fx.A09(), c0790Fx.A04());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1675gH
    public final void A1D() {
        super.A1D();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().AAk(this.A0H);
        }
    }

    public final void A1F() {
        getCtaButton().A0A(A03(75, 9, 37));
    }

    public final void A1G() {
        new AF(this.A0G.A04().A1g(), getAdEventManager()).A04(AE.A0h, null);
        if (this.A0G.A0B() != null) {
            DQ A0B = this.A0G.A0B();
            if (A0K[4].charAt(31) == 'A') {
                throw new RuntimeException();
            }
            A0K[2] = "qVUXWES3bTCAG5k5pbCpCu4g17099rEp";
            A0B.setVisibility(8);
            removeView(this.A0G.A0B());
        }
        removeView(this.A07);
        removeView(this.A0H);
        A07();
        removeView(getAdDetailsView());
        removeView(this.A0I);
        A1E();
    }

    public final void A1H(C0898Kb c0898Kb) {
        if (this.A07 != null) {
            this.A07.A1A(c0898Kb);
            this.A07.A0z();
            removeView(this.A07);
            this.A07 = null;
        }
        getAdDetailsView().setVisibility(0);
    }

    public final boolean A1I() {
        return getAdInfo().A0R();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public int getCloseButtonStyle() {
        if (this.A0B) {
            if (getAdDataBundle().A1o()) {
                return 8;
            }
            return 2;
        } else if (A1I() && !super.A09.get()) {
            return 1;
        } else {
            return super.getCloseButtonStyle();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1675gH, com.facebook.ads.redexgen.X.AbstractC0786Ft, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A07 != null) {
            C1649fr c1649fr = this.A07;
            if (A0K[0].length() == 5) {
                throw new RuntimeException();
            }
            A0K[4] = "EpyE2nRNkziEqwhglEeRfTluajKoT9IB";
            if (c1649fr.getVisibility() == 0) {
                getAdDetailsView().setVisibility(8);
                return;
            }
        }
        if (getAdDataBundle().A1b().A0I().A03() && this.A09 != null && super.A09.get()) {
            this.A09.A0P(configuration.orientation);
        }
        if (this.A09 != null || super.A09.get()) {
            FH oldEndCardAdDetailsView = getOldEndCardAdDetailsView();
            if (oldEndCardAdDetailsView != null) {
                oldEndCardAdDetailsView.A0D(configuration.orientation);
                return;
            }
            return;
        }
        A0D(configuration.orientation);
    }

    public void setVideoAdViewListener(HT ht) {
        if (this.A07 != null) {
            this.A07.setVideoAdViewListener(ht);
        }
    }
}
