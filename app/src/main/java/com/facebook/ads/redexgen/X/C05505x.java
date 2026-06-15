package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.5x  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C05505x {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C05505x A00(C6K c6k, int i10) {
        View view = c6k.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C05505x A01(C6K c6k) {
        return A00(c6k, 0);
    }
}
