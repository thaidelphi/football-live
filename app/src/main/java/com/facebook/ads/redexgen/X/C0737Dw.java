package com.facebook.ads.redexgen.X;

import android.os.Bundle;
/* renamed from: com.facebook.ads.redexgen.X.Dw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0737Dw extends AbstractC1260Yr {
    public final boolean A00;
    public final boolean A01;
    public static String[] A02 = {"KvRsWQnCxzZs0XS", "1HWwvDCNAzdU2SlIb9", "mPN48Z3YXpSi45I4IprQsXBy2yWouHzS", "1Kslfp8e4lxmFF26GLpj1iDXpC", "jv2DZkWZDzNFk7YS1FZ9TOlayKriIsTk", "HoDcLp1db17Ys7H80pVsqVRDAZIzaFhx", "USA3", "H9Yw7mnPNvj0vX40QvFxmw6TBd9XPsGr"};
    public static final String A05 = AbstractC1672gE.A0h(1);
    public static final String A04 = AbstractC1672gE.A0h(2);
    public static final InterfaceC0972Na<C0737Dw> A03 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Yk
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            C0737Dw A00;
            A00 = C0737Dw.A00(bundle);
            return A00;
        }
    };

    public C0737Dw() {
        this.A01 = false;
        this.A00 = false;
    }

    public C0737Dw(boolean z10) {
        this.A01 = true;
        this.A00 = z10;
    }

    public static C0737Dw A00(Bundle bundle) {
        boolean rated = bundle.getInt(AbstractC1260Yr.A02, -1) == 3;
        AbstractC1589es.A07(rated);
        boolean rated2 = bundle.getBoolean(A05, false);
        if (rated2) {
            return new C0737Dw(bundle.getBoolean(A04, false));
        }
        return new C0737Dw();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0737Dw) {
            C0737Dw c0737Dw = (C0737Dw) obj;
            if (this.A00 == c0737Dw.A00) {
                boolean z10 = this.A01;
                boolean z11 = c0737Dw.A01;
                if (A02[6].length() != 4) {
                    throw new RuntimeException();
                }
                A02[0] = "Q8dOHh8rsVu7EFBQiGuBH3fzgac";
                return z10 == z11;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1013Or.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
