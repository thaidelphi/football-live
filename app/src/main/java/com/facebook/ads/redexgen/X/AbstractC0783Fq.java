package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Fq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0783Fq {
    public static float A00(C2T c2t) {
        int height = c2t.A0F().A01();
        int width = c2t.A0F().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        int availableWidth = (int) ((CO.A00().widthPixels - (AbstractC0786Ft.A07 * 2)) / d10);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = D3.A01(16);
        int ctaTextHeight = FW.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC0786Ft.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = CO.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static View$OnClickListenerC0782Fp A03(View$OnClickListenerC1689gW view$OnClickListenerC1689gW, String str) {
        return new View$OnClickListenerC0782Fp(view$OnClickListenerC1689gW, str);
    }

    public static boolean A04(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A05(double d10, int i10) {
        return A02(i10) < A01(d10);
    }

    public static boolean A06(int i10, int i11, double d10) {
        return i10 == 2 || A05(d10, i11);
    }
}
