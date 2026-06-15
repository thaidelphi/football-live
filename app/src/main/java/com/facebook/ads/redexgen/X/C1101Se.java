package com.facebook.ads.redexgen.X;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* renamed from: com.facebook.ads.redexgen.X.Se  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1101Se implements YK {
    public ZM A00;
    public InterfaceC1157Uo A01;
    public C1662g4 A02;

    public C1101Se(String str) {
        this.A00 = new P5().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        AbstractC1589es.A02(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.YK
    public final void A50(C1648fq c1648fq) {
        A00();
        long A03 = this.A02.A03();
        long A04 = this.A02.A04();
        if (A03 == -9223372036854775807L || A04 == -9223372036854775807L) {
            return;
        }
        if (A04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(A04).A14();
            this.A01.A6U(this.A00);
        }
        int A07 = c1648fq.A07();
        this.A01.AHx(c1648fq, A07);
        this.A01.AI0(A03, 1, A07, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.YK
    public final void AA3(C1662g4 c1662g4, UL ul, YS ys) {
        this.A02 = c1662g4;
        ys.A05();
        this.A01 = ul.AJX(ys.A03(), 5);
        this.A01.A6U(this.A00);
    }
}
