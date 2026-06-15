package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Mz  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0971Mz extends AbstractC2059me {
    public final C1900k1 A00;
    public final AW A01;

    public C0971Mz(C1900k1 c1900k1, C0X c0x, List<C1816ie> list, AW aw) {
        super(c0x, list, c1900k1);
        this.A00 = c1900k1;
        this.A01 = aw == null ? new AW() : aw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A01 */
    public final C1770hr A0D(ViewGroup viewGroup, int i10) {
        return new C1770hr(new DX(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A0I */
    public final void A0E(C1770hr c1770hr, int i10) {
        super.A0I(c1770hr, i10);
        DX dx = (DX) c1770hr.A0j();
        A0G(dx.getImageCardView(), i10);
        if (((AbstractC2059me) this).A01.get(i10) != null) {
            dx.setTitle(((AbstractC2059me) this).A01.get(i10).getAdHeadline());
            dx.setSubtitle(((AbstractC2059me) this).A01.get(i10).getAdLinkDescription());
            dx.setButtonText(((AbstractC2059me) this).A01.get(i10).getAdCallToAction());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dx);
        ((AbstractC2059me) this).A01.get(i10).A1P(dx, dx, arrayList);
    }
}
