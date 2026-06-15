package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class LT extends AbstractC1675gH {
    public static byte[] A02;
    public static String[] A03 = {"ccLmdgMtf", "50lpHgsnQSuWf1CWCacJGyiAwAWsDUud", "Nq2vo108Bdlpu7LWCjcAC5dDG31maruF", "TAe0PaklKNA7XHBVlxrhZCtyBfgeydAO", "ouUdcivF6", "IAXVD4SBpgtyrGYWX4yc8p2wBrUpSeUf", "nA5GNdAWyE31pAGlKcdnPdOQEY7Q2fwD", "a5Dyr8HKQP9cZfy0xnx35qJg31dQk6"};
    public static final int A04;
    public final View A00;
    public final boolean A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "FT3046kmt";
            strArr[4] = "J6Q3a22Lt";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{37, 33, 45, 43, 41};
    }

    static {
        A01();
        A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public LT(C0790Fx c0790Fx, boolean z10) {
        super(c0790Fx, true);
        this.A01 = z10;
        this.A00 = c0790Fx.A02();
        A1D();
        if (this.A01) {
            addView(c0790Fx.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c0790Fx.A05());
            RelativeLayout.LayoutParams insideContainerParams = new RelativeLayout.LayoutParams(-1, -1);
            insideContainerParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(insideContainerParams);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(AbstractC0786Ft.A07, 0, AbstractC0786Ft.A07, 0);
            frameLayout.addView(this.A00, layoutParams);
            addView(frameLayout);
        }
        CK A0A = this.A08.A0A(getAdDataBundle());
        c0790Fx.A05().A0H().A00(A0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A08);
        if (this.A00 != null) {
            if (A0A.A00) {
                this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Fy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LT.this.A1F(view);
                    }
                });
            } else if (C06419m.A1G(getAdContextWrapper())) {
                FE.A00(this.A00, C06419m.A1H(getAdContextWrapper()), new View$OnClickListenerC0792Fz(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A02() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A0A() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1675gH, com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A14(C2T c2t, String str, double d10, Bundle bundle) {
        super.A14(c2t, str, d10, bundle);
        if (!this.A01 && d10 > 0.0d) {
            int mediaHeight = (int) ((A04 - (AbstractC0786Ft.A07 * 2)) / d10);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i10 = AbstractC0786Ft.A07;
            int mediaHeight2 = AbstractC0786Ft.A07;
            layoutParams.setMargins(i10, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A17() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1675gH
    public final FH A1B(C0790Fx c0790Fx, C2T c2t, String str) {
        return new C1676gI(c0790Fx.A05(), getCtaButton(), AbstractC1675gH.A0F, c2t.A0G().A00() == C2Y.A05, getColors(), c2t.A0H().A06(), str, c0790Fx.A06(), c0790Fx.A0C(), c0790Fx.A0E(), c0790Fx.A09(), c0790Fx.A04());
    }

    public final /* synthetic */ void A1F(View view) {
        getCtaButton().A0A(A00(0, 5, 11));
    }
}
