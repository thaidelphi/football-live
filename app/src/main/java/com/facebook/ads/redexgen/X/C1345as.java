package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.as  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1345as implements InterfaceC0861Iq {
    public ValueAnimator A00;
    public EnumC0860Ip A01 = EnumC0860Ip.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public C1345as(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A02 = i10;
        this.A04 = i11;
        this.A03 = i12;
    }

    private ValueAnimator A00(View view, int i10, int i11) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.setDuration(this.A02);
        ofInt.addUpdateListener(new C0870Iz(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A00 != null) {
            this.A00.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        if (z10) {
            this.A01 = EnumC0860Ip.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new C0869Iy(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        D3.A0F(this.A05);
        this.A01 = EnumC0860Ip.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z10) {
        D3.A0J(this.A05);
        if (z10) {
            this.A01 = EnumC0860Ip.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new C0868Ix(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = EnumC0860Ip.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0861Iq
    public final void A40(boolean z10, boolean z11) {
        if (z11) {
            A08(z10);
        } else {
            A09(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0861Iq
    public final EnumC0860Ip A91() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0861Iq
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
