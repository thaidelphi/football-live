package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.dH  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1491dH {
    public final int A00;
    public final Y4 A01;
    public final Object A02;
    public final C1057Ql[] A03;
    public final QD[] A04;

    public C1491dH(C1057Ql[] c1057QlArr, QD[] qdArr, Y4 y42, Object obj) {
        this.A03 = c1057QlArr;
        this.A04 = (QD[]) qdArr.clone();
        this.A01 = y42;
        this.A02 = obj;
        this.A00 = c1057QlArr.length;
    }

    public final boolean A00(int i10) {
        return this.A03[i10] != null;
    }

    public final boolean A01(C1491dH c1491dH, int i10) {
        return c1491dH != null && AbstractC1672gE.A1E(this.A03[i10], c1491dH.A03[i10]) && AbstractC1672gE.A1E(this.A04[i10], c1491dH.A04[i10]);
    }
}
