package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.kq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1951kq extends AbstractC05515y {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0R(C6K c6k);

    public abstract boolean A0S(C6K c6k);

    public abstract boolean A0T(C6K c6k, int i10, int i11, int i12, int i13);

    public abstract boolean A0U(C6K c6k, C6K c6k2, int i10, int i11, int i12, int i13);

    @Override // com.facebook.ads.redexgen.X.AbstractC05515y
    public final boolean A0D(C6K c6k) {
        return !this.A00 || c6k.A0Z();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05515y
    public final boolean A0E(C6K c6k, C05505x c05505x, C05505x c05505x2) {
        if (c05505x != null && (c05505x.A01 != c05505x2.A01 || c05505x.A03 != c05505x2.A03)) {
            return A0T(c6k, c05505x.A01, c05505x.A03, c05505x2.A01, c05505x2.A03);
        }
        return A0R(c6k);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05515y
    public final boolean A0F(C6K c6k, C05505x c05505x, C05505x c05505x2) {
        int i10 = c05505x.A01;
        int oldLeft = c05505x.A03;
        View view = c6k.A0H;
        int oldTop = c05505x2 == null ? view.getLeft() : c05505x2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c05505x2 == null ? view.getTop() : c05505x2.A03;
        if (!c6k.A0a() && (i10 != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0T(c6k, i10, oldLeft, oldTop, top);
        }
        return A0S(c6k);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05515y
    public final boolean A0G(C6K c6k, C05505x c05505x, C05505x c05505x2) {
        if (c05505x.A01 != c05505x2.A01 || c05505x.A03 != c05505x2.A03) {
            return A0T(c6k, c05505x.A01, c05505x.A03, c05505x2.A01, c05505x2.A03);
        }
        A0O(c6k);
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05515y
    public final boolean A0H(C6K c6k, C6K c6k2, C05505x c05505x, C05505x c05505x2) {
        int i10;
        int i11;
        int i12 = c05505x.A01;
        int i13 = c05505x.A03;
        if (c6k2.A0f()) {
            i10 = c05505x.A01;
            i11 = c05505x.A03;
        } else {
            i10 = c05505x2.A01;
            i11 = c05505x2.A03;
        }
        return A0U(c6k, c6k2, i12, i13, i10, i11);
    }

    public final void A0N(C6K c6k) {
        A0C(c6k);
    }

    public final void A0O(C6K c6k) {
        A0C(c6k);
    }

    public final void A0P(C6K c6k) {
        A0C(c6k);
    }

    public final void A0Q(C6K c6k, boolean z10) {
        A0C(c6k);
    }
}
