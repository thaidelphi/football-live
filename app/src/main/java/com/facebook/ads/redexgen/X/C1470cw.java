package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.cw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1470cw implements Comparable<C1470cw> {
    public final boolean A00;
    public final boolean A01;

    public C1470cw(ZM zm, int i10) {
        this.A00 = (zm.A0H & 1) != 0;
        this.A01 = C05475u.A0S(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C1470cw c1470cw) {
        return AbstractC1967l7.A01().A09(this.A01, c1470cw.A01).A09(this.A00, c1470cw.A00).A05();
    }
}
