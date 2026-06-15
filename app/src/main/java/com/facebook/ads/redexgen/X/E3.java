package com.facebook.ads.redexgen.X;

import android.os.Bundle;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class E3 extends AbstractC1260Yr {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC1672gE.A0h(1);
    public static final String A03 = AbstractC1672gE.A0h(2);
    public static final InterfaceC0972Na<E3> A02 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.ZL
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            E3 A00;
            A00 = E3.A00(bundle);
            return A00;
        }
    };

    public E3() {
        this.A01 = false;
        this.A00 = false;
    }

    public E3(boolean z10) {
        this.A01 = true;
        this.A00 = z10;
    }

    public static E3 A00(Bundle bundle) {
        boolean isRated = bundle.getInt(AbstractC1260Yr.A02, -1) == 0;
        AbstractC1589es.A07(isRated);
        boolean isRated2 = bundle.getBoolean(A04, false);
        if (isRated2) {
            return new E3(bundle.getBoolean(A03, false));
        }
        return new E3();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E3) {
            E3 e32 = (E3) obj;
            return this.A00 == e32.A00 && this.A01 == e32.A01;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1013Or.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
