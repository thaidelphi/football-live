package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class CO {
    public static final AtomicReference<DisplayMetrics> A00 = new AtomicReference<>();

    public static DisplayMetrics A00() {
        if (A00.get() != null) {
            return A00.get();
        }
        return CP.A04;
    }
}
