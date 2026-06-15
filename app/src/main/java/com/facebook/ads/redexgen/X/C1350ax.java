package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.ax  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1350ax implements InterfaceC0861Iq {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public EnumC0860Ip A02 = EnumC0860Ip.A04;

    public C1350ax(View view, int i10, Drawable drawable, Drawable drawable2) {
        this.A03 = i10;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        D3.A0Q(this.A07, this.A01);
    }

    private void A04(boolean z10) {
        this.A06.removeCallbacksAndMessages(null);
        if (z10) {
            this.A02 = EnumC0860Ip.A05;
            D3.A0Q(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new b0(this), this.A03);
            return;
        }
        D3.A0Q(this.A07, this.A05);
        this.A02 = EnumC0860Ip.A04;
    }

    private void A05(boolean z10) {
        this.A06.removeCallbacksAndMessages(null);
        if (z10) {
            this.A02 = EnumC0860Ip.A03;
            D3.A0Q(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new b1(this), this.A03);
            return;
        }
        D3.A0Q(this.A07, this.A04);
        this.A02 = EnumC0860Ip.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0861Iq
    public final void A40(boolean z10, boolean z11) {
        if (z11) {
            A04(z10);
        } else {
            A05(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0861Iq
    public final EnumC0860Ip A91() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0861Iq
    public final void cancel() {
        EnumC0860Ip enumC0860Ip;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == EnumC0860Ip.A03) {
            enumC0860Ip = EnumC0860Ip.A04;
        } else {
            enumC0860Ip = EnumC0860Ip.A02;
        }
        this.A02 = enumC0860Ip;
    }
}
