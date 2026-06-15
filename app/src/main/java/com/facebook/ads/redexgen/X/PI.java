package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class PI {
    public long A00 = Long.MIN_VALUE;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public static /* synthetic */ long A00(PI pi) {
        return pi.A01;
    }

    public static /* synthetic */ long A01(PI pi) {
        return pi.A00;
    }

    public static /* synthetic */ boolean A02(PI pi) {
        return pi.A03;
    }

    public static /* synthetic */ boolean A03(PI pi) {
        return pi.A02;
    }

    public static /* synthetic */ boolean A04(PI pi) {
        return pi.A04;
    }

    public final PI A05(long j10) {
        AbstractC1589es.A07(j10 == Long.MIN_VALUE || j10 >= 0);
        this.A00 = j10;
        return this;
    }

    public final PI A06(long j10) {
        AbstractC1589es.A07(j10 >= 0);
        this.A01 = j10;
        return this;
    }

    public final PI A07(boolean z10) {
        this.A02 = z10;
        return this;
    }

    public final PI A08(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final PI A09(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final E1 A0A() {
        return A0B();
    }

    @Deprecated
    public final E1 A0B() {
        return new E1(this);
    }
}
