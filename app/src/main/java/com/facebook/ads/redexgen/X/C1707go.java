package com.facebook.ads.redexgen.X;

import android.hardware.display.DisplayManager;
/* renamed from: com.facebook.ads.redexgen.X.go  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1707go implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C1709gq A01;

    public C1707go(C1709gq c1709gq, DisplayManager displayManager) {
        this.A01 = c1709gq;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
