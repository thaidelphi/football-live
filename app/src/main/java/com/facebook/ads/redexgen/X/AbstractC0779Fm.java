package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
/* renamed from: com.facebook.ads.redexgen.X.Fm  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0779Fm {
    public static final int A00 = D3.A00();

    public static void A00(C1900k1 c1900k1, ViewGroup viewGroup, String str) {
        new AsyncTaskC1695gc(viewGroup, c1900k1).A07(str);
        View view = new View(c1900k1);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        D3.A0P(view, c1900k1);
        viewGroup.addView(view, 0);
    }
}
