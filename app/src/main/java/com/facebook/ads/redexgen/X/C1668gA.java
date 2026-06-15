package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.gA  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1668gA extends AbstractC0786Ft implements CJ {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC2058md A00;
    public final CL A01;
    public final DR A02;
    public final GP A03;
    public final C0820Hb A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, 42, 30, 36, 34};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C1668gA(C0790Fx c0790Fx, boolean z10) {
        super(c0790Fx, z10);
        int id;
        int A01;
        this.A02 = c0790Fx.A0C();
        this.A00 = c0790Fx.A04();
        this.A03 = new GP(c0790Fx.A05(), c0790Fx.A02());
        this.A03.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC0786Ft.A07, AbstractC0786Ft.A07, AbstractC0786Ft.A07, AbstractC0786Ft.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (c0790Fx.A0F()) {
            this.A04 = new C0820Hb(c0790Fx.A05());
            this.A04.setPageDetails(c0790Fx.A04().A1e());
            D3.A0E(1007, this.A04);
            RelativeLayout.LayoutParams pageDetailsParams = new RelativeLayout.LayoutParams(-2, -2);
            pageDetailsParams.addRule(2, getCtaButton().getId());
            pageDetailsParams.setMargins(AbstractC0786Ft.A07, AbstractC0786Ft.A07 - (AbstractC0786Ft.A07 / 2), AbstractC0786Ft.A07, 0);
            this.A04.setLayoutParams(pageDetailsParams);
            id = this.A04.getId();
            A01 = c0790Fx.A01() - (AbstractC0786Ft.A07 / 2);
        } else {
            id = getCtaButton().getId();
            A01 = c0790Fx.A01();
            this.A04 = null;
        }
        FrameLayout insideContainerLayout = new FrameLayout(c0790Fx.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, id);
        layoutParams2.setMargins(0, A01, 0, 0);
        insideContainerLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC0786Ft.A07, 0, AbstractC0786Ft.A07, 0);
        insideContainerLayout.addView(this.A03, layoutParams3);
        addView(insideContainerLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0B(c0790Fx.A04(), c0790Fx.A0B());
        View A02 = c0790Fx.A02();
        this.A01 = CL.A01(c0790Fx.A05(), this.A00, this);
        CK A0A = this.A01.A0A(this.A00);
        c0790Fx.A05().A0H().A00(A0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (A02 != null && A0A.A00) {
            A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.G3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1668gA.this.A1A(view);
                }
            });
        } else if (A02 != null && C06419m.A1G(getAdContextWrapper())) {
            FE.A00(A02, C06419m.A1H(getAdContextWrapper()), new G4(this));
        }
        if (C06419m.A16(c0790Fx.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0790Fx.A0B() != null) {
                c0790Fx.A0B().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && C06419m.A17(c0790Fx.A05())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A0z() {
        super.A0z();
        this.A01.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A14(C2T c2t, String str, double d10, Bundle bundle) {
        super.A14(c2t, str, d10, bundle);
        if (d10 > 0.0d) {
            int mediaHeight = (int) ((A06 - (AbstractC0786Ft.A07 * 2)) / d10);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A17() {
        return false;
    }

    public final /* synthetic */ void A1A(View view) {
        getCtaButton().A0A(A00(0, 5, 103));
    }

    @Override // com.facebook.ads.redexgen.X.CJ
    public final void ADz() {
        this.A02.A4Z(this.A00.A0e());
    }
}
