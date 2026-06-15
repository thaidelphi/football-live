package com.facebook.ads.redexgen.X;

import android.util.Log;
/* renamed from: com.facebook.ads.redexgen.X.Zv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1289Zv implements InterfaceC0920Kx {
    public int A00;

    @Override // com.facebook.ads.redexgen.X.InterfaceC0920Kx
    public final void A9j(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0920Kx
    public final void A9k(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0920Kx
    public final boolean AAN(int i10) {
        return this.A00 <= i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0920Kx
    public final void AIe(int i10) {
        this.A00 = i10;
    }
}
