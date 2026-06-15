package com.facebook.ads.redexgen.X;

import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.8q  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC06208q extends AbstractC1212Wu implements InterfaceC1213Wv {
    public long A00;
    public InterfaceC1213Wv A01;

    @Override // com.facebook.ads.redexgen.X.AbstractC1212Wu
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.X.AbstractC1102Sf
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j10, InterfaceC1213Wv interfaceC1213Wv, long j11) {
        super.A01 = j10;
        this.A01 = interfaceC1213Wv;
        if (j11 == Long.MAX_VALUE) {
            j11 = super.A01;
        }
        this.A00 = j11;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final List<C1053Qh> A7N(long j10) {
        return ((InterfaceC1213Wv) AbstractC1589es.A01(this.A01)).A7N(j10 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final long A7t(int i10) {
        return ((InterfaceC1213Wv) AbstractC1589es.A01(this.A01)).A7t(i10) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A7u() {
        return ((InterfaceC1213Wv) AbstractC1589es.A01(this.A01)).A7u();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A8Q(long j10) {
        return ((InterfaceC1213Wv) AbstractC1589es.A01(this.A01)).A8Q(j10 - this.A00);
    }
}
