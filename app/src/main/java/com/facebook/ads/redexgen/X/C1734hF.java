package com.facebook.ads.redexgen.X;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.hF  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1734hF extends EH {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (CP.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C04843g A01;
    public final C1900k1 A02;

    public C1734hF(C1900k1 c1900k1, A7 a72, String str, C04652n c04652n, DS ds, DR dr) {
        super(c1900k1, a72, str, c04652n, ds, dr);
        this.A02 = c1900k1;
        this.A01 = AbstractC04853h.A00(c1900k1.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        D3.A0K(this.A00, -1728053248);
        this.A00.setOnClickListener(new EM(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z10 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
        D3.A0T(this, transitionSet);
    }

    @Override // com.facebook.ads.redexgen.X.EH
    public final void A0L() {
        C04883k A0A = this.A01.A0A();
        EW ew = new EW(this.A02);
        ew.setInfo(DB.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        ew.setOnClickListener(new EN(this));
        C04883k A0B = this.A01.A0B();
        EW ew2 = new EW(this.A02);
        ew2.setInfo(DB.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        ew2.setOnClickListener(new EO(this));
        EW ew3 = new EW(this.A02);
        ew3.setInfo(DB.AD_CHOICES_ICON, this.A01.A0M(), "");
        ew3.setOnClickListener(new EP(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        D3.A0K(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(ew, itemParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(ew2, itemParams);
        }
        linearLayout.addView(ew3, itemParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.EH
    public final void A0M() {
        D3.A0G(this);
        this.A00.removeAllViews();
        D3.A0H(this);
    }

    @Override // com.facebook.ads.redexgen.X.EH
    public final void A0N(C04883k c04883k, EnumC04863i enumC04863i) {
        String A0E;
        int i10;
        String str;
        if (enumC04863i == EnumC04863i.A05) {
            return;
        }
        boolean z10 = enumC04863i == EnumC04863i.A06;
        EF ef = new EF(this.A02, this.A0B);
        if (z10) {
            C04843g c04843g = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            A0E = c04843g.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        EF A0E2 = ef.A0I(A0E).A0H(this.A01.A0D()).A0F(c04883k.A04()).A0E(z10 ? DB.REPORT_AD : DB.HIDE_AD);
        if (z10) {
            i10 = -552389;
        } else {
            i10 = -13272859;
        }
        EF A0D = A0E2.A0D(i10);
        if (this.A0A != null) {
            C04652n c04652n = this.A0A;
            if (A03[1].charAt(11) != 'X') {
                str = c04652n.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                str = c04652n.A01();
            }
        } else {
            str = "";
        }
        EG adHiddenView = A0D.A0G(str).A0M();
        D3.A0K(adHiddenView, -1);
        D3.A0R(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.X.EH
    public final void A0O(C04883k c04883k, EnumC04863i enumC04863i) {
        String A0H;
        boolean z10 = enumC04863i == EnumC04863i.A06;
        C1900k1 c1900k1 = this.A02;
        EJ ej = this.A0B;
        if (z10) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        EZ ez = new EZ(c1900k1, c04883k, ej, A0H, z10 ? DB.REPORT_AD : DB.HIDE_AD);
        ez.setClickable(true);
        D3.A0K(ez, -1);
        ez.setPadding(A04 * 2, A04, A04 * 2, A04);
        A0C();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(ez, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.EH
    public final boolean A0P() {
        return false;
    }
}
