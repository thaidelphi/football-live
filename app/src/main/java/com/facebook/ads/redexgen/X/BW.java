package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class BW extends LinearLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<BO> A01 = new AtomicReference<>();

    public static void A00(boolean z10, BO bo) {
        A00.set(z10);
        A01.set(bo);
    }
}
