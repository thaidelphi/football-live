package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.ir  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1828ir implements AP {
    public WeakReference<C1816ie> A00;

    public C1828ir(C1816ie c1816ie) {
        this.A00 = new WeakReference<>(c1816ie);
    }

    @Override // com.facebook.ads.redexgen.X.AP
    public final void AEQ(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1f(z10, false);
        }
    }
}
