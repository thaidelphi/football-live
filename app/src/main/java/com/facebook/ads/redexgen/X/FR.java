package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class FR {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1e] */
    public static C04301e A00(final C0790Fx c0790Fx, final C1816ie c1816ie, final String str, final C0926Ld c0926Ld) {
        return new LU(c0790Fx, c1816ie, true, str, c0926Ld) { // from class: com.facebook.ads.redexgen.X.1e
            public View$OnClickListenerC1689gW A00;
            public C0821Hc A01;
            public final A7 A02 = this.A0I.A05().A02().A0A();
            public final C1816ie A03;
            public final C0926Ld A04;
            public final String A05;
            public static String[] A06 = {"q", "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", "V", "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (CP.A02 * (-4.0f));
            public static final int A07 = (int) (CP.A02 * 6.0f);

            {
                this.A03 = c1816ie;
                this.A05 = str;
                this.A04 = c0926Ld;
                this.A03.A1L(this);
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC1646fo
            public void setupNativeCtaExtension(C0821Hc c0821Hc) {
                C04592h A1c;
                this.A01 = c0821Hc;
                int A0P = C06419m.A0P(this.A0I.A05());
                C04542c A01 = this.A03.A10().A1a().A01();
                C1900k1 A05 = this.A0I.A05();
                String A0e = this.A03.A10().A0e();
                A7 a72 = this.A02;
                DR dummyListener = C0766Ez.getDummyListener();
                JL A0b = this.A04.A0b();
                C0710Cv A1A = this.A03.A1A();
                if (this.A03.A10() == null) {
                    A1c = null;
                } else {
                    A1c = this.A03.A10().A1c();
                }
                this.A00 = new View$OnClickListenerC1689gW(A05, A0e, A01, a72, dummyListener, A0b, A1A, A1c);
                this.A00.setCta(c0821Hc.A03().A0H(), this.A05, new HashMap());
                this.A03.A1L(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0P == 1) {
                    layoutParams.addRule(12);
                    String[] strArr = A06;
                    String str2 = strArr[5];
                    String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    D3.A0N(this.A00, A07, 5, A01.A0A(false));
                    ((LU) this).A06.addView(this.A00, layoutParams);
                } else if (A0P == 2) {
                    layoutParams.addRule(3, ((LU) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((LU) this).A06.bringToFront();
                }
            }
        };
    }
}
