package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.cc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1450cc extends AbstractC05435q<C1448ca> {
    public final int A00;
    public final C1900k1 A01;
    public final View$OnClickListenerC1689gW A02;
    public final List<String> A03;

    public C1450cc(C1900k1 c1900k1, List<String> screenshotUrls, int i10, View$OnClickListenerC1689gW view$OnClickListenerC1689gW) {
        this.A03 = screenshotUrls;
        this.A00 = i10;
        this.A01 = c1900k1;
        this.A02 = view$OnClickListenerC1689gW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A02 */
    public final C1448ca A0D(ViewGroup viewGroup, int i10) {
        C1449cb c1449cb = new C1449cb(this.A01);
        if (C06419m.A1B(this.A01)) {
            c1449cb.setOnClickListener(new I6(this));
        }
        return new C1448ca(c1449cb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A03 */
    public final void A0E(C1448ca c1448ca, int i10) {
        String str = this.A03.get(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i10 != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i10 >= A0C() + (-1) ? this.A00 * 4 : this.A00, 0);
        c1448ca.A0j().setLayoutParams(marginLayoutParams);
        c1448ca.A0j().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    public final int A0C() {
        return this.A03.size();
    }
}
