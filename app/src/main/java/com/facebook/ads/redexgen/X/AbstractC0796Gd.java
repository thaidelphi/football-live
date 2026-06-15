package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.Gd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0796Gd {
    public static LK A00(final C0790Fx c0790Fx, int i10, final String str, final C1492dI c1492dI) {
        if (i10 == 1) {
            return new LK(c0790Fx, str, c1492dI) { // from class: com.facebook.ads.redexgen.X.1b
                public static final int A00 = (int) (CP.A02 * 20.0f);
                public static final int A01 = (int) (CP.A02 * 16.0f);

                @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.X.LK
                public final void A1H(C1900k1 c1900k1) {
                    C0778Fl titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c1900k1);
                    D3.A0Q(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(A01, A01, A01, A01);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new LK(c0790Fx, str, c1492dI) { // from class: com.facebook.ads.redexgen.X.1c
            public static final int A00 = (int) (CP.A02 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.LK, com.facebook.ads.redexgen.X.AbstractC0786Ft
            public final boolean A0A() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.LK
            public final void A1H(C1900k1 c1900k1) {
                C0778Fl titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                titleDescContainer.setPadding(A00, A00, A00, A00);
                D3.A0P(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
