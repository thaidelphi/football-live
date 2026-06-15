package com.facebook.ads.redexgen.X;

import android.text.Layout;
import java.util.Comparator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class X0 {
    public static final Comparator<X0> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Wz
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((X0) obj2).A00, ((X0) obj).A00);
            return compare;
        }
    };
    public final int A00;
    public final C1053Qh A01;

    public X0(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
        C1446cY cueBuilder = new C1446cY().A0G(charSequence).A0F(alignment).A07(f10, i10).A09(i11).A04(f11).A0A(i12).A06(f12);
        if (z10) {
            cueBuilder.A0C(i13);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i14;
    }
}
