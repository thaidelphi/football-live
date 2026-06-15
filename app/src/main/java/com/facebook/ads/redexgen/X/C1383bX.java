package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.bX  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1383bX implements IQ {
    public View A00;
    public C1433cL A01;
    public EnumC0850If A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC1415c3 A05;
    public final AbstractC1409bx A06;
    public final AbstractC1407bv A07;
    public final AbstractC1398bm A08;
    public final boolean A09;
    public final boolean A0A;

    public C1383bX(View view, EnumC0850If enumC0850If, boolean z10) {
        this(view, enumC0850If, z10, false);
    }

    public C1383bX(View view, EnumC0850If enumC0850If, boolean z10, boolean z11) {
        this.A06 = new KN(this);
        this.A07 = new KM(this);
        this.A05 = new KL(this);
        this.A08 = new KK(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z10;
        this.A0A = z11;
        A08(view, enumC0850If);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C0849Ie(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i10, int i11) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i10);
        this.A00.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC0850If enumC0850If) {
        this.A02 = enumC0850If;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC0850If == EnumC0850If.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AAk(C1433cL c1433cL) {
        this.A01 = c1433cL;
        c1433cL.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AJa(C1433cL c1433cL) {
        A06(1, 0);
        c1433cL.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
