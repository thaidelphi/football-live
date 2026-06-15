package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class UA {
    public static final UA A03 = new UA(-3, -9223372036854775807L, -1);
    public final int A00;
    public final long A01;
    public final long A02;

    public UA(int i10, long j10, long j11) {
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    public static UA A03(long j10) {
        return new UA(0, -9223372036854775807L, j10);
    }

    public static UA A04(long j10, long j11) {
        return new UA(-1, j10, j11);
    }

    public static UA A05(long j10, long j11) {
        return new UA(-2, j10, j11);
    }
}
