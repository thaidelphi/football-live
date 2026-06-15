package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.6P  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C6P {
    public C6M A00 = new C6M();
    public final C6N A01;

    public C6P(C6N c6n) {
        this.A01 = c6n;
    }

    public final View A00(int i10, int i11, int i12, int i13) {
        int A8X = this.A01.A8X();
        int next = this.A01.A8W();
        int childEnd = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View A77 = this.A01.A77(i10);
            int A7A = this.A01.A7A(A77);
            int i14 = this.A01.A79(A77);
            this.A00.A03(A8X, next, A7A, i14);
            if (i12 != 0) {
                this.A00.A01();
                this.A00.A02(i12);
                if (this.A00.A04()) {
                    return A77;
                }
            }
            if (i13 != 0) {
                this.A00.A01();
                this.A00.A02(i13);
                if (this.A00.A04()) {
                    view = A77;
                }
            }
            i10 += childEnd;
        }
        return view;
    }
}
