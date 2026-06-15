package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.fn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1645fn implements FA {
    public final WeakReference<LK> A00;

    public C1645fn(LK lk) {
        this.A00 = new WeakReference<>(lk);
    }

    public /* synthetic */ C1645fn(LK lk, LP lp) {
        this(lk);
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final void ADM(boolean z10) {
        LK cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z10;
            cardLayout.A02();
        }
    }
}
