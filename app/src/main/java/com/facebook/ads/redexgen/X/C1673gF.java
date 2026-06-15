package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.gF  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1673gF extends AbstractC0786Ft implements CJ {
    public static byte[] A03;
    public static String[] A04 = {"jViytUMb8W4ggVUJxJM4ipopCTL5", "9aLNfhHGIgyW1yw0lAvb2knTk6C61HAs", "tSRmVjXXTSnTtzrce7INiQjRTYiInlbV", "4hcdJiGUQmFME9vgh87fiTmYWHBJid0b", "Sl93MFe7LYTqHCUKgRBPFfcYUFdC2Wx2", "6CReOOSeiw7R4vGYWPFAi839J8MszZAI", "rkSedGSxOJTtoP7gEY2R8PFp4jzzUrYJ", "HZKY5YyrBfN27m9O42YnVDeAUeo6GkfS"};
    public final AbstractC2058md A00;
    public final CL A01;
    public final DR A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "P3g3yiO3ICi92ZTGqQIjITPfAPWFUEMm";
            strArr[2] = "pyBqNmisWoZkDTGCi8bHuToayw1uFlPn";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 78);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{64, 68, 72, 78, 76};
    }

    static {
        A01();
    }

    public C1673gF(C0790Fx c0790Fx, boolean z10) {
        super(c0790Fx, true);
        FrameLayout.LayoutParams mediaViewParams;
        this.A02 = c0790Fx.A0C();
        this.A00 = c0790Fx.A04();
        RelativeLayout relativeLayout = new RelativeLayout(c0790Fx.A05());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        D3.A0P(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c0790Fx.A05());
        linearLayout.setOrientation(!z10 ? 1 : 0);
        linearLayout.setGravity(80);
        D3.A0I(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC0786Ft.A07, 0, AbstractC0786Ft.A07, AbstractC0786Ft.A07);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z10 ? -2 : -1, -2);
        layoutParams3.setMargins(z10 ? AbstractC0786Ft.A07 : 0, z10 ? 0 : AbstractC0786Ft.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z10 ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams4);
        this.A01 = CL.A01(c0790Fx.A05(), this.A00, this);
        CK A0A = this.A01.A0A(this.A00);
        c0790Fx.A05().A0H().A00(A0A.A01);
        if (c0790Fx.A0F() && !z10) {
            C0820Hb c0820Hb = new C0820Hb(c0790Fx.A05());
            c0820Hb.setPageDetails(c0790Fx.A04().A1e());
            int A05 = this.A06.A04().A1a().A00().A05(true);
            c0820Hb.A02(A05, A05);
            D3.A0E(1007, c0820Hb);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.setMargins(0, AbstractC0786Ft.A07, 0, 0);
            linearLayout.addView(c0820Hb, layoutParams5);
            if (C06419m.A17(c0790Fx.A05())) {
                c0820Hb.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        getCtaButton().A0B(c0790Fx.A04(), c0790Fx.A0B());
        View A02 = c0790Fx.A02();
        if (A02 != null && (A0A.A00 || C06419m.A1G(getAdContextWrapper()))) {
            if (z10) {
                mediaViewParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                mediaViewParams = new FrameLayout.LayoutParams(-1, -2);
            }
            mediaViewParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c0790Fx.A05());
            frameLayout.addView(A02, mediaViewParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
            if (A0A.A00) {
                A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Fr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1673gF.this.A1A(view);
                    }
                });
            } else {
                FE.A00(A02, C06419m.A1H(getAdContextWrapper()), new View$OnClickListenerC0785Fs(this));
            }
        } else if (A02 != null) {
            addView(A02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams);
        if (C06419m.A16(c0790Fx.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0790Fx.A0B() != null) {
                c0790Fx.A0B().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A0z() {
        super.A0z();
        this.A01.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A14(C2T c2t, String str, double d10, Bundle bundle) {
        super.A14(c2t, str, d10, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A17() {
        return true;
    }

    public final /* synthetic */ void A1A(View view) {
        getCtaButton().A0A(A00(0, 5, 103));
    }

    @Override // com.facebook.ads.redexgen.X.CJ
    public final void ADz() {
        this.A02.A4Z(this.A00.A0e());
    }
}
