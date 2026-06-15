package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;
/* renamed from: com.facebook.ads.redexgen.X.0I  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0I extends C0M {
    @Override // com.facebook.ads.redexgen.X.C05104g
    public final C05264y A07(View view, C05264y c05264y) {
        WindowInsets result = (WindowInsets) C05264y.A01(c05264y);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C05264y.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C05104g
    public final C05264y A08(View view, C05264y c05264y) {
        WindowInsets result = (WindowInsets) C05264y.A01(c05264y);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C05264y.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C05104g
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.C05104g
    public final void A0E(View view, final C4R c4r) {
        if (c4r == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.4f
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C05264y compatInsets = c4r.ACE(view2, C05264y.A00(windowInsets));
                    return (WindowInsets) C05264y.A01(compatInsets);
                }
            });
        }
    }
}
