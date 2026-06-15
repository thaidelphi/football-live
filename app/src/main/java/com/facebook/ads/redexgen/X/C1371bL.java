package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.bL  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1371bL {
    public final int A00;
    public final boolean A01;

    public C1371bL(int i10, boolean z10) {
        this.A00 = i10;
        this.A01 = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1371bL c1371bL = (C1371bL) obj;
        return this.A00 == c1371bL.A00 && this.A01 == c1371bL.A01;
    }

    public final int hashCode() {
        return (this.A00 * 31) + (this.A01 ? 1 : 0);
    }
}
