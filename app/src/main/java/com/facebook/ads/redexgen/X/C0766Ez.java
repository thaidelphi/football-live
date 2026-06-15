package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Ez  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0766Ez extends RelativeLayout {
    public static DR A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC1947km A00;
    public C1900k1 A01;
    public C0W A02;
    public C1722h3 A03;
    public C0771Fe A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, 15, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = (int) (CP.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (CP.A02 * 15.0f);
        A05 = new C1715gw();
    }

    public C0766Ez(C1900k1 c1900k1) {
        super(c1900k1);
        this.A01 = c1900k1;
        this.A02 = new C0W(c1900k1);
        D3.A0I(this.A02);
        this.A00 = new MK();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C0821Hc> A01(AbstractC2058md abstractC2058md) {
        if (abstractC2058md == null) {
            return new ArrayList<>();
        }
        List<C2T> A1i = abstractC2058md.A1i();
        ArrayList<C0821Hc> arrayList = new ArrayList<>(A1i.size());
        for (int i10 = 0; i10 < A1i.size(); i10++) {
            arrayList.add(new C0821Hc(i10, A1i.size(), A1i.get(i10)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C1816ie c1816ie, int i10) {
        ArrayList<C0821Hc> A01 = A01(c1816ie.A10());
        this.A02.setCardsInfo(A01);
        this.A03 = new C1722h3(this.A01, A01, c1816ie.A10(), this.A01.A02().A0A(), c1816ie, A05, c1816ie.A10().A1g(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i10 == 0) {
            i10 = CP.A04.widthPixels;
        }
        this.A03.A0G(i10 - A07, 16, 0);
        this.A03.A06();
        setupDotsLayout(c1816ie, A01);
    }

    public final void A06(JL jl) {
        if (this.A03 != null) {
            this.A03.A0H(jl);
        } else {
            this.A01.A08().AAu(A00(51, 7, 24), AbstractC06048a.A1v, new C06058b(A00(0, 51, 125)));
        }
        this.A02.A20(jl);
    }

    public static DR getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10 && this.A03 != null) {
            this.A03.A0G((i12 - i10) - A07, 16, 0);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i10) {
        if (this.A04 != null) {
            this.A04.A00(i10);
        }
    }

    private void setupDotsLayout(C1816ie c1816ie, ArrayList<C0821Hc> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C1712gt(this));
        this.A04 = new C0771Fe(this.A01, c1816ie.A10().A1a().A01(), arrayList.size());
        D3.A0I(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
