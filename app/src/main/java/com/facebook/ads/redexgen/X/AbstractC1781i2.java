package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.i2  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1781i2<T> extends BY {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.i2 != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public AbstractC1781i2(T reference) {
        this.A00 = new WeakReference<>(reference);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.i2 != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A06() {
        return this.A00.get();
    }
}
