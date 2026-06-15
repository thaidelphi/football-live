package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewPropertyAnimator;
/* renamed from: com.facebook.ads.redexgen.X.av  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1348av implements InterfaceC0861Iq {
    public ViewPropertyAnimator A00;
    public EnumC0860Ip A01 = EnumC0860Ip.A04;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public C1348av(View view, int i10, boolean z10) {
        this.A02 = i10;
        this.A03 = view;
        this.A04 = z10;
    }

    private void A04(boolean z10) {
        this.A01 = EnumC0860Ip.A03;
        if (this.A04) {
            D3.A0J(this.A03);
        }
        if (!z10) {
            this.A03.setAlpha(1.0f);
            this.A01 = EnumC0860Ip.A02;
            return;
        }
        this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new C0865Iu(this));
    }

    private void A05(boolean z10) {
        this.A01 = EnumC0860Ip.A05;
        if (!z10) {
            this.A03.setAlpha(0.0f);
            this.A01 = EnumC0860Ip.A04;
            return;
        }
        this.A00 = this.A03.animate().alpha(0.0f).setDuration(this.A02).setListener(new C0866Iv(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0861Iq
    public final void A40(boolean z10, boolean z11) {
        if (z11) {
            A05(z10);
        } else {
            A04(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0861Iq
    public final EnumC0860Ip A91() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0861Iq
    public final void cancel() {
        this.A03.clearAnimation();
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
