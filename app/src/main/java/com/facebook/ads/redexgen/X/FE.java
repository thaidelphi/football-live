package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class FE {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else if (!z10) {
        } else {
            FD fd = new FD(onClickListener);
            view.setOnClickListener(fd);
            view.setOnTouchListener(new FC(fd));
        }
    }
}
