package com.facebook.ads.redexgen.X;

import com.facebook.ads.redexgen.X.AbstractC1475d1;
/* renamed from: com.facebook.ads.redexgen.X.d1  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1475d1<T extends AbstractC1475d1<T>> {
    public final int A00;
    public final int A01;
    public final ZM A02;
    public final C1246Yc A03;

    public abstract int A08();

    public abstract boolean A09(T t10);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.d1 != com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.d1<T>> */
    public AbstractC1475d1(int i10, C1246Yc c1246Yc, int i11) {
        this.A00 = i10;
        this.A03 = c1246Yc;
        this.A01 = i11;
        this.A02 = c1246Yc.A08(i11);
    }
}
