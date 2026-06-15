package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.widget.RelativeLayout;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.Lb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0924Lb extends AbstractC1694gb {
    public static String[] A01 = {"jx4KYlgMCzDl9ClzKv", "6Ix4GmMTfvyGvtJf24kawibkIRWRaxha", "zW69YqA5HPweJk44OR41r89kehyD8PUK", "YWeaBtgKCGSZjZhmH64nz1hbm3NBx6WA", "r8zWPPccQcaX84RMJyONYLJrFGke7QKT", "leMtqeNEOkXnn1xJcE4uVuewwh76dLco", "HficAYafh9u7bjEKghLSIT4OmCXpUy86", "1EAnVhI1sEBIq9Q3DhiB3BUE0Cu5Wqiv"};
    public final Runnable A00;

    public C0924Lb(C1900k1 c1900k1, View$OnClickListenerC1689gW view$OnClickListenerC1689gW, int i10, C04542c c04542c, String str, A7 a72, DR dr, JL jl, C0710Cv c0710Cv, AbstractC2058md abstractC2058md, C1355b5 c1355b5, AF af) {
        super(c1900k1, view$OnClickListenerC1689gW, i10, c04542c, false, str, a72, dr, jl, c0710Cv, abstractC2058md, c1355b5, af);
        this.A00 = new FN(this);
        int orientation = getResources().getConfiguration().orientation;
        A04(orientation);
        A06(orientation);
        A01();
        setAdDetailsLayoutBackground(orientation);
        setIconImageParam(orientation);
        setTitleViewParams(orientation);
        setDescriptionViewParams(orientation);
        setCTALayoutParam(orientation);
        setProgressBarParam(orientation);
        setRewardTextParam(orientation);
        setAdReportingView(orientation);
        A02(orientation);
        this.A0J.addView(this.A0H);
        addView(this.A0J);
    }

    private void A01() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.width = (int) (getResources().getDisplayMetrics().widthPixels * 0.37f);
        layoutParams.addRule(14);
        int screenWidth = AbstractC1694gb.A0a;
        layoutParams.setMargins(0, screenWidth, 0, AbstractC1694gb.A0d);
        RelativeLayout relativeLayout = this.A0I;
        int i10 = AbstractC1694gb.A0a;
        int screenWidth2 = AbstractC1694gb.A0a;
        relativeLayout.setPadding(i10, screenWidth2, AbstractC1694gb.A0a, AbstractC1694gb.A0a);
        this.A0I.setLayoutParams(layoutParams);
    }

    private void A02(int i10) {
        if (i10 == 1) {
            this.A0H.addView(((FH) this).A09);
            this.A0H.addView(this.A0L);
            this.A0H.addView(this.A0K);
            this.A0H.addView(((FH) this).A08);
            this.A0H.addView(this.A0P);
            if (((AbstractC1694gb) this).A03 != null && ((AbstractC1694gb) this).A03.getVisibility() == 0) {
                this.A0H.addView(((AbstractC1694gb) this).A03);
            }
            this.A0H.addView(this.A0G);
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

    private void A03(int i10) {
        if (i10 == 2) {
            this.A0D.removeCallbacks(this.A00);
            this.A0H.setLayoutTransition(null);
        }
    }

    private void A04(int i10) {
        if (i10 == 1) {
            ((AbstractC1694gb) this).A04 = new C1345as(this.A0H, CommonGatewayClient.CODE_400, 100, 0);
            this.A0R.set(false);
        }
    }

    private void A05(int i10) {
        A0T(this.A0H, i10, new float[]{72.0f, 72.0f, 72.0f, 72.0f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    private void A06(int i10) {
        if (i10 == 1) {
            this.A0J.setClipChildren(false);
            this.A0J.setClipToPadding(false);
            String[] strArr = A01;
            if (strArr[1].charAt(21) == strArr[3].charAt(21)) {
                throw new RuntimeException();
            }
            A01[5] = "cGbvdTJNONPNbXLhpEbXT6xJPDu44esN";
            this.A0J.setGravity(80);
            return;
        }
        this.A0J.setGravity(8388659);
    }

    @Override // com.facebook.ads.redexgen.X.FH
    public final void A0D(int i10) {
        A03(i10);
        D3.A0Z(this.A0I, ((FH) this).A09, this.A0L, ((FH) this).A08, this.A0P, ((AbstractC1694gb) this).A03, this.A0K, this.A0G);
        A06(i10);
        setAdDetailsLayoutBackground(i10);
        A01();
        setIconImageParam(i10);
        setRewardTextParam(i10);
        setProgressBarParam(i10);
        setCTALayoutParam(i10);
        setTitleViewParams(i10);
        setDescriptionViewParams(i10);
        setAdReportingView(i10);
        A02(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1694gb
    public final void A0S(int i10) {
        if (((AbstractC1694gb) this).A04 == null || i10 == 2) {
            return;
        }
        ((AbstractC1694gb) this).A04.A40(true, false);
        this.A0R.set(true);
        this.A0D.postDelayed(this.A00, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1694gb
    public final void A0U(C1433cL c1433cL, int i10) {
    }

    private void setAdDetailsLayoutBackground(int i10) {
        RelativeLayout.LayoutParams layoutParams;
        if (i10 == 1) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            this.A0H.setGravity(80);
            layoutParams.setMargins(AbstractC1694gb.A0a, 0, AbstractC1694gb.A0a, 0);
            this.A0H.setPadding(AbstractC1694gb.A0c, 0, AbstractC1694gb.A0c, 0);
            A05(-1291845632);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.A0H.setGravity(1);
            A0T(this.A0H, 0, null);
        }
        this.A0H.setLayoutParams(layoutParams);
    }

    private void setAdReportingView(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0G.getLayoutParams();
        if (i10 == 1) {
            layoutParams.removeRule(12);
            layoutParams.removeRule(11);
            layoutParams.setMargins(0, AbstractC1694gb.A0b, 0, 0);
            layoutParams.addRule(11);
            layoutParams.addRule(3, this.A0P.getId());
        } else {
            layoutParams.setMargins(0, 0, AbstractC1694gb.A0a, 0);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        }
        this.A0G.setLayoutParams(layoutParams);
    }

    private void setCTALayoutParam(int i10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1694gb.A0T);
        layoutParams.addRule(3, this.A0K.getId());
        if (i10 == 1) {
            layoutParams.removeRule(2);
            layoutParams.setMargins(0, AbstractC1694gb.A0b, 0, 0);
        } else {
            layoutParams.removeRule(3);
            layoutParams.addRule(2, this.A0P.getId());
            layoutParams.setMargins(0, 0, 0, 0);
        }
        layoutParams.addRule(14);
        ((FH) this).A08.setLayoutParams(layoutParams);
        A0O();
    }

    private void setDescriptionViewParams(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0K.getLayoutParams();
        layoutParams.addRule(14);
        layoutParams.addRule(3, this.A0L.getId());
        layoutParams.setMargins(0, AbstractC1694gb.A0g, 0, 0);
        this.A0K.setTextSize(18.0f);
        this.A0K.setLayoutParams(layoutParams);
        if (i10 == 1) {
            if (this.A0R.get()) {
                this.A0K.setVisibility(8);
                this.A0K.setMaxLines(2);
                return;
            }
            return;
        }
        this.A0K.setVisibility(0);
        this.A0K.setMaxLines(1);
    }

    private void setIconImageParam(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((FH) this).A09.getLayoutParams();
        if (i10 == 1) {
            AtomicBoolean atomicBoolean = this.A0R;
            String[] strArr = A01;
            if (strArr[1].charAt(21) != strArr[3].charAt(21)) {
                String[] strArr2 = A01;
                strArr2[1] = "w5CK1gApPwith6RPWkYLE8hn8LMwnsSI";
                strArr2[3] = "pHvAzBIuhGCejBjFplodNvnrz82jXtkw";
                if (atomicBoolean.get()) {
                    ((FH) this).A09.setVisibility(8);
                }
                layoutParams.width = AbstractC1694gb.A0X;
                layoutParams.height = AbstractC1694gb.A0X;
                int i11 = AbstractC1694gb.A0X;
                String[] strArr3 = A01;
                if (strArr3[7].charAt(14) != strArr3[4].charAt(14)) {
                    A01[0] = "wZH0lfF";
                    layoutParams.setMargins(0, (-i11) / 2, 0, 0);
                }
            }
            throw new RuntimeException();
        }
        layoutParams.removeRule(3);
        layoutParams.removeRule(14);
        layoutParams.width = AbstractC1694gb.A0Y;
        layoutParams.height = AbstractC1694gb.A0Y;
        layoutParams.setMargins(0, AbstractC1694gb.A0a, 0, 0);
        ((FH) this).A09.setVisibility(0);
        layoutParams.addRule(14);
        ((FH) this).A09.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.FH
    public void setInfo(C04522a c04522a, C04552d c04552d, String str, String str2, CZ cz, FP fp) {
        super.setInfo(c04522a, c04552d, str, str2, cz, fp);
    }

    private void setProgressBarParam(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0P.getLayoutParams();
        if (i10 == 1) {
            layoutParams.removeRule(12);
            layoutParams.setMargins(0, AbstractC1694gb.A0b, 0, 0);
            layoutParams.addRule(3, ((FH) this).A08.getId());
        } else {
            layoutParams.removeRule(3);
            layoutParams.removeRule(12);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, AbstractC1694gb.A0a, 0, AbstractC1694gb.A0c);
        }
        this.A0P.setLayoutParams(layoutParams);
    }

    private void setRewardTextParam(int i10) {
        int i11;
        if (((AbstractC1694gb) this).A03 == null || ((AbstractC1694gb) this).A03.getVisibility() != 0) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC1694gb) this).A03.getLayoutParams();
        if (i10 == 1) {
            layoutParams.removeRule(12);
            layoutParams.removeRule(9);
            i11 = AbstractC1694gb.A0g;
            int id = this.A0P.getId();
            String[] strArr = A01;
            String str = strArr[1];
            String str2 = strArr[3];
            int marginTop = str.charAt(21);
            if (marginTop == str2.charAt(21)) {
                throw new RuntimeException();
            }
            A01[0] = "uxC1uQdDVO2t";
            layoutParams.addRule(3, id);
        } else {
            layoutParams.removeRule(3);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
            i11 = AbstractC1694gb.A0f;
        }
        layoutParams.setMargins(0, i11, 0, 0);
        ((AbstractC1694gb) this).A03.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.FH
    public void setTitleMaxLines(int i10) {
    }

    private void setTitleViewParams(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0L.getLayoutParams();
        layoutParams.addRule(14);
        layoutParams.addRule(3, ((FH) this).A09.getId());
        layoutParams.setMargins(0, AbstractC1694gb.A0b, 0, 0);
        this.A0L.setTypeface(Typeface.DEFAULT_BOLD);
        this.A0L.setTextSize(30.0f);
        this.A0L.setLayoutParams(layoutParams);
        if (i10 == 1) {
            if (this.A0R.get()) {
                this.A0L.setVisibility(8);
                return;
            }
            return;
        }
        this.A0L.setVisibility(0);
    }
}
