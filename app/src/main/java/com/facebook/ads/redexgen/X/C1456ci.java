package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.ci  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1456ci extends C6K implements DY {
    public C04592h A00;
    public JK A01;
    public JL A02;
    public JL A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C1900k1 A09;
    public final LK A0A;

    public C1456ci(LK lk, SparseBooleanArray sparseBooleanArray, JL jl, int i10, int i11, int i12, int i13, C1900k1 c1900k1, C04592h c04592h) {
        super(lk);
        this.A09 = c1900k1;
        this.A0A = lk;
        this.A08 = sparseBooleanArray;
        this.A02 = jl;
        this.A04 = i10;
        this.A05 = i11;
        this.A06 = i12;
        this.A07 = i13;
        this.A00 = c04592h;
    }

    private void A0A(A7 a72, C0710Cv c0710Cv, String str, C0821Hc c0821Hc) {
        if (this.A08.get(c0821Hc.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C1458ck(this, str, c0821Hc, a72, c0821Hc.A04(), c0710Cv);
        this.A03 = new JL(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new C1457cj(this, c0821Hc));
    }

    public final View$OnClickListenerC1689gW A0j() {
        return this.A0A.getCtaButton();
    }

    public final void A0k(C0821Hc c0821Hc, A7 a72, C05987t c05987t, C0710Cv c0710Cv, String str) {
        int A02 = c0821Hc.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c0821Hc.A03().A0F().A08();
        String A09 = c0821Hc.A03().A0F().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(A09));
        if (this.A0A.A1F()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c05987t.A0S(A09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c0821Hc.A03().A0G().A0F(), c0821Hc.A03().A0G().A04());
        this.A0A.setCTAInfo(c0821Hc.A03().A0H(), c0821Hc.A04());
        this.A0A.A1I(c0821Hc.A04());
        A0A(a72, c0710Cv, str, c0821Hc);
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void AIL() {
        this.A0A.A1A();
    }
}
