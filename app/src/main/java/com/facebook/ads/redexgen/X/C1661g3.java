package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.g3  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1661g3<V> {
    public int A00;
    public int A01;
    public long[] A02;
    public V[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.g3 != com.google.android.exoplayer2.util.TimedValueQueue<V> */
    public C1661g3() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.g3 != com.google.android.exoplayer2.util.TimedValueQueue<V> */
    public C1661g3(int i10) {
        this.A02 = new long[i10];
        this.A03 = (V[]) A00(i10);
    }

    public static <V> V[] A00(int i10) {
        return (V[]) new Object[i10];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.g3 != com.google.android.exoplayer2.util.TimedValueQueue<V> */
    public final synchronized int A01() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.g3 != com.google.android.exoplayer2.util.TimedValueQueue<V> */
    public final synchronized void A02() {
        this.A00 = 0;
        this.A01 = 0;
        Arrays.fill(this.A03, (Object) null);
    }
}
