package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.ColorInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class O7 {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public O7() {
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = -1;
    }

    public O7(ColorInfo colorInfo) {
        this.A01 = colorInfo.A02;
        this.A00 = colorInfo.A01;
        this.A02 = colorInfo.A03;
        this.A03 = colorInfo.A04;
    }

    public /* synthetic */ O7(ColorInfo colorInfo, O6 o62) {
        this(colorInfo);
    }

    public final O7 A00(int i10) {
        this.A00 = i10;
        return this;
    }

    public final O7 A01(int i10) {
        this.A01 = i10;
        return this;
    }

    public final O7 A02(int i10) {
        this.A02 = i10;
        return this;
    }

    public final ColorInfo A03() {
        return new ColorInfo(this.A01, this.A00, this.A02, this.A03);
    }
}
