package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.My  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0970My extends AbstractC2059me {
    public final C1900k1 A00;

    public C0970My(C0X c0x, List<C1816ie> list, C1900k1 c1900k1) {
        super(c0x, list, c1900k1);
        this.A00 = c1900k1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A01 */
    public final C1770hr A0D(ViewGroup viewGroup, int i10) {
        return new C1770hr(new C0718Dd(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A0I */
    public final void A0E(C1770hr c1770hr, int i10) {
        super.A0I(c1770hr, i10);
        C0718Dd c0718Dd = (C0718Dd) c1770hr.A0j();
        E0 imageView = (E0) c0718Dd.getImageCardView();
        imageView.setImageDrawable(null);
        A0G(imageView, i10);
        C1816ie childAd = ((AbstractC2059me) this).A01.get(i10);
        childAd.A12().A0L(this.A00);
        childAd.A1O(c0718Dd, c0718Dd);
    }
}
