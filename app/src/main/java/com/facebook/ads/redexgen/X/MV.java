package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class MV extends C1983lP {
    @Override // com.facebook.ads.redexgen.X.C05104g
    public final int A02(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // com.facebook.ads.redexgen.X.C05104g
    public final int A04(View view) {
        return view.getMinimumHeight();
    }

    @Override // com.facebook.ads.redexgen.X.C05104g
    public final int A05(View view) {
        return view.getMinimumWidth();
    }

    @Override // com.facebook.ads.redexgen.X.C05104g
    public final void A09(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // com.facebook.ads.redexgen.X.C05104g
    public final void A0C(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @Override // com.facebook.ads.redexgen.X.C05104g
    public final void A0F(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // com.facebook.ads.redexgen.X.C05104g
    public final void A0G(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    @Override // com.facebook.ads.redexgen.X.C05104g
    public final boolean A0I(View view) {
        return view.hasTransientState();
    }
}
