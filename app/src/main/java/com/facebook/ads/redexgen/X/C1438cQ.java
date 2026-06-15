package com.facebook.ads.redexgen.X;

import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.cQ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1438cQ implements IG {
    public final C1900k1 A00;
    public final A7 A01;
    public final ID A02;
    public final C1433cL A03;
    public final String A06;
    public final AbstractC1409bx A05 = new C0902Kf(this);
    public final AbstractC1415c3 A04 = new C0901Ke(this);

    public C1438cQ(C1900k1 c1900k1, A7 a72, C1433cL c1433cL, String str, C1420c8 c1420c8, Map<String, String> extraParams) {
        this.A00 = c1900k1;
        this.A01 = a72;
        this.A06 = str;
        this.A03 = c1433cL;
        this.A02 = new ID(c1433cL, str, extraParams);
        if (C06419m.A23(this.A00)) {
            this.A00.A0F().AI3();
            c1420c8.A0m(this);
            return;
        }
        this.A00.A0F().AI4();
        this.A03.getEventBus().A03(this.A05, this.A04);
    }

    public final void A05() {
        C1439cR c1439cR = new C1439cR(this);
        if (this.A03.A0s()) {
            ExecutorC0712Cx.A00(c1439cR);
        } else {
            this.A03.getStateHandler().post(c1439cR);
        }
    }

    public final synchronized void A06() {
        this.A01.ABL(this.A06, this.A02.A05());
    }

    @Override // com.facebook.ads.redexgen.X.IG
    public final void ADy() {
        this.A00.A0F().AI7();
        A06();
    }
}
