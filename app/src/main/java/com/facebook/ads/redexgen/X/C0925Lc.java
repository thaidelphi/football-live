package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
/* renamed from: com.facebook.ads.redexgen.X.Lc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0925Lc extends AbstractC1694gb {
    public static String[] A00 = {RequestConfiguration.MAX_AD_CONTENT_RATING_G, "KzTy2hy9hhtw1RMGA4AWQtLCSBRvIgNx", "TFXx3faCMHKsw8ZQwSQJp4p3qrvSFGQZ", "FDPqMwfpfrBnIs9VqOwKhGqv0efVrSDC", "w99CmZO3gVFe1JaqJ0AV2MifxVBEUT0K", "IReileYPgfNfW", "Qab6Yr7DAj1gKX83C9lxa", "vvhOodmvLfB1cs4WARwmrAXLlmUlw4y7"};
    public static final int A01 = (int) (CP.A02 * 152.0f);

    public C0925Lc(C1900k1 c1900k1, View$OnClickListenerC1689gW view$OnClickListenerC1689gW, int i10, C04542c c04542c, String str, A7 a72, DR dr, JL jl, C0710Cv c0710Cv, AbstractC2058md abstractC2058md, C1355b5 c1355b5, AF af) {
        super(c1900k1, view$OnClickListenerC1689gW, i10, c04542c, false, str, a72, dr, jl, c0710Cv, abstractC2058md, c1355b5, af);
        int i11 = getResources().getConfiguration().orientation;
        A02();
        setIconImageParam(i11);
        A01();
        D3.A0I(this.A0K);
        setDescriptionViewParams(i11);
        setAdReportingView(i11);
        setCTALayoutParam(i11);
        setProgressBarParam(i11);
        setRewardTextParam(i11);
        addView(this.A0J);
    }

    private void A01() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0L.getLayoutParams();
        this.A0L.setTypeface(Typeface.DEFAULT_BOLD);
        this.A0L.setTextSize(30.0f);
        layoutParams.setMargins(0, AbstractC1694gb.A0a, 0, 0);
        layoutParams.addRule(14);
        layoutParams.addRule(3, ((FH) this).A09.getId());
        this.A0L.setLayoutParams(layoutParams);
    }

    private void A02() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(1);
        int screenWidth = (int) (getResources().getDisplayMetrics().widthPixels * 0.1f);
        layoutParams.setMargins(screenWidth, AbstractC1694gb.A0a, screenWidth, AbstractC1694gb.A0d);
        RelativeLayout relativeLayout = this.A0I;
        int margin = AbstractC1694gb.A0a;
        relativeLayout.setPadding(margin, AbstractC1694gb.A0a, AbstractC1694gb.A0a, AbstractC1694gb.A0a);
        this.A0I.setLayoutParams(layoutParams);
    }

    private void A03(int i10) {
        if (((FH) this).A08.getParent() != null) {
            View$OnClickListenerC1689gW view$OnClickListenerC1689gW = ((FH) this).A08;
            if (A00[6].length() != 21) {
                throw new RuntimeException();
            }
            A00[6] = "77Sm8WMgdJozvQKOpKshJ";
            D3.A0H(view$OnClickListenerC1689gW);
        }
        if (i10 == 1) {
            if (((AbstractC1694gb) this).A03 != null && ((AbstractC1694gb) this).A03.getVisibility() == 0) {
                this.A0J.addView(((AbstractC1694gb) this).A03);
            }
            this.A0J.addView(this.A0P);
            this.A0J.addView(((FH) this).A08);
            this.A0J.addView(this.A0G);
            return;
        }
        this.A0I.addView(((FH) this).A09);
        this.A0I.addView(this.A0L);
        this.A0I.addView(this.A0K);
        this.A0I.addView(((FH) this).A08);
        this.A0I.addView(this.A0P);
        if (((AbstractC1694gb) this).A03 != null && ((AbstractC1694gb) this).A03.getVisibility() == 0) {
            this.A0I.addView(((AbstractC1694gb) this).A03);
        }
        this.A0J.addView(this.A0I);
        this.A0J.addView(this.A0G);
    }

    @Override // com.facebook.ads.redexgen.X.FH
    public final void A0D(int i10) {
        D3.A0Z(this.A0I, ((FH) this).A09, this.A0L, this.A0P, ((AbstractC1694gb) this).A03, this.A0K, this.A0G);
        A02();
        setIconImageParam(i10);
        setRewardTextParam(i10);
        setProgressBarParam(i10);
        setCTALayoutParam(i10);
        A01();
        setDescriptionViewParams(i10);
        setAdReportingView(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1694gb
    public final void A0S(int i10) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1694gb
    public final void A0U(C1433cL c1433cL, int i10) {
        if (i10 == 1 && c1433cL != null && c1433cL.getVideoView() != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((FH) this).A09.getLayoutParams();
            layoutParams.addRule(3, c1433cL.getVideoView().getId());
            ((FH) this).A09.setLayoutParams(layoutParams);
            c1433cL.addView(((FH) this).A09);
            if (A00[2].charAt(22) == 'z') {
                throw new RuntimeException();
            }
            A00[1] = "8edlxl8iBTjA4xFkn0kwBC7lhr04uOIj";
            c1433cL.addView(this.A0L);
            c1433cL.addView(this.A0K);
        }
        A03(i10);
    }

    private void setAdReportingView(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0G.getLayoutParams();
        if (i10 == 1) {
            int i11 = AbstractC1694gb.A0e;
            if (A00[0].length() != 1) {
                throw new RuntimeException();
            }
            A00[6] = "cifcGfDigOiJ6pKzXhRS8";
            layoutParams.setMargins(0, 0, i11, 0);
        } else {
            int i12 = AbstractC1694gb.A0a;
            if (A00[5].length() != 30) {
                A00[2] = "FhhCaBUja7jVhQgWYRh7qP6cuGlTkNG9";
                layoutParams.setMargins(0, 0, i12, 0);
            } else {
                layoutParams.setMargins(0, 0, i12, 0);
            }
        }
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        this.A0G.setLayoutParams(layoutParams);
    }

    private void setCTALayoutParam(int i10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1694gb.A0T);
        if (i10 == 1) {
            layoutParams.setMargins(AbstractC1694gb.A0e, 0, AbstractC1694gb.A0e, AbstractC1694gb.A0a);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        layoutParams.addRule(2, this.A0P.getId());
        layoutParams.addRule(14);
        ((FH) this).A08.setLayoutParams(layoutParams);
        A0O();
    }

    private void setDescriptionViewParams(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0K.getLayoutParams();
        layoutParams.addRule(14);
        layoutParams.addRule(3, this.A0L.getId());
        layoutParams.setMargins(AbstractC1694gb.A0a, AbstractC1694gb.A0g, AbstractC1694gb.A0a, 0);
        layoutParams.addRule(14);
        this.A0K.setTypeface(Typeface.DEFAULT);
        this.A0K.setTextSize(18.0f);
        this.A0K.setLayoutParams(layoutParams);
        if (i10 == 1) {
            this.A0K.setMaxLines(4);
            return;
        }
        TextView textView = this.A0K;
        if (A00[1].charAt(4) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[7] = "oD8t0MbbkSItHj1TmxwB1nOaZGDH8k2A";
        strArr[3] = "hbdI9dZBf2S8DlHlHEwZw178JE33VfjJ";
        textView.setMaxLines(1);
    }

    private void setIconImageParam(int i10) {
        int topMargin;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((FH) this).A09.getLayoutParams();
        if (i10 == 1) {
            layoutParams.width = A01;
            layoutParams.height = A01;
            layoutParams.setMargins(0, (-A01) / 4, 0, 0);
            topMargin = 30;
        } else {
            layoutParams.removeRule(3);
            layoutParams.removeRule(14);
            layoutParams.width = AbstractC1694gb.A0Y;
            layoutParams.height = AbstractC1694gb.A0Y;
            layoutParams.setMargins(0, AbstractC1694gb.A0a, 0, 0);
            topMargin = 15;
        }
        ((FH) this).A09.setRadius(topMargin);
        layoutParams.addRule(14);
        ((FH) this).A09.setLayoutParams(layoutParams);
    }

    private void setProgressBarParam(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0P.getLayoutParams();
        if (i10 == 1) {
            layoutParams.removeRule(12);
            layoutParams.addRule(2, this.A0G.getId());
            layoutParams.setMargins(AbstractC1694gb.A0e, 0, AbstractC1694gb.A0e, AbstractC1694gb.A0b);
        } else {
            layoutParams.removeRule(2);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, AbstractC1694gb.A0a, 0, AbstractC1694gb.A0c);
        }
        this.A0P.setLayoutParams(layoutParams);
    }

    private void setRewardTextParam(int i10) {
        if (((AbstractC1694gb) this).A03 == null || ((AbstractC1694gb) this).A03.getVisibility() != 0) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC1694gb) this).A03.getLayoutParams();
        layoutParams.addRule(12);
        if (i10 == 1) {
            layoutParams.setMargins(AbstractC1694gb.A0e, 0, AbstractC1694gb.A0e, AbstractC1694gb.A0g);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        ((AbstractC1694gb) this).A03.setLayoutParams(layoutParams);
    }
}
