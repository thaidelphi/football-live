package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
/* renamed from: com.facebook.ads.redexgen.X.Yt  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1262Yt implements InterfaceC0973Nb {
    public final P3 A00;
    public static final C1262Yt A02 = new QE().A04();
    public static final String A03 = AbstractC1672gE.A0h(0);
    public static final InterfaceC0972Na<C1262Yt> A01 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Yu
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            C1262Yt A012;
            A012 = C1262Yt.A01(bundle);
            return A012;
        }
    };

    public C1262Yt(P3 p32) {
        this.A00 = p32;
    }

    public static C1262Yt A01(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(A03);
        if (integerArrayList == null) {
            return A02;
        }
        QE qe = new QE();
        for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
            qe.A00(integerArrayList.get(i10).intValue());
        }
        return qe.A04();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1262Yt)) {
            return false;
        }
        return this.A00.equals(((C1262Yt) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
