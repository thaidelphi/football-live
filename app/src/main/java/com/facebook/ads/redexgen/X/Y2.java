package com.facebook.ads.redexgen.X;

import android.os.Bundle;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class Y2 implements InterfaceC0973Nb {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public static final Y2 A05 = new Y2(0, 0);
    public static final String A09 = AbstractC1672gE.A0h(0);
    public static final String A06 = AbstractC1672gE.A0h(1);
    public static final String A08 = AbstractC1672gE.A0h(2);
    public static final String A07 = AbstractC1672gE.A0h(3);
    public static final InterfaceC0972Na<Y2> A04 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Y3
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            return Y2.A00(bundle);
        }
    };

    public Y2(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public Y2(int i10, int i11, int i12, float f10) {
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A00 = f10;
    }

    public static /* synthetic */ Y2 A00(Bundle bundle) {
        int i10 = bundle.getInt(A09, 0);
        int i11 = bundle.getInt(A06, 0);
        int height = bundle.getInt(A08, 0);
        return new Y2(i10, i11, height, bundle.getFloat(A07, 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y2) {
            Y2 y22 = (Y2) obj;
            return this.A03 == y22.A03 && this.A01 == y22.A01 && this.A02 == y22.A02 && this.A00 == y22.A00;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03;
        int result2 = this.A02;
        return (((((((7 * 31) + result) * 31) + this.A01) * 31) + result2) * 31) + Float.floatToRawIntBits(this.A00);
    }
}
