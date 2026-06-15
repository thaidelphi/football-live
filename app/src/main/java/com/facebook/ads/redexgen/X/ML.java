package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class ML extends C1971lB {
    public final /* synthetic */ MK A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ML(MK mk, Context context) {
        super(context);
        this.A00 = mk;
    }

    @Override // com.facebook.ads.redexgen.X.C1971lB, com.facebook.ads.redexgen.X.C6F
    public final void A0I(View view, C6H c6h, C6D c6d) {
        int[] A0H = this.A00.A0H(((AbstractC1947km) this.A00).A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c6d.A04(time, dy, dx, ((C1971lB) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1971lB
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1971lB
    public final int A0L(int i10) {
        return Math.min(100, super.A0L(i10));
    }
}
