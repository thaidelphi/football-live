package com.facebook.ads.redexgen.X;

import android.view.WindowInsets;
/* renamed from: com.facebook.ads.redexgen.X.4y  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05264y {
    public final Object A00;

    public C05264y(Object obj) {
        this.A00 = obj;
    }

    public static C05264y A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C05264y(obj);
    }

    public static Object A01(C05264y c05264y) {
        if (c05264y == null) {
            return null;
        }
        return c05264y.A00;
    }

    public final int A02() {
        return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
    }

    public final int A03() {
        return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
    }

    public final int A04() {
        return ((WindowInsets) this.A00).getSystemWindowInsetRight();
    }

    public final int A05() {
        return ((WindowInsets) this.A00).getSystemWindowInsetTop();
    }

    public final C05264y A06(int i10, int i11, int i12, int i13) {
        return new C05264y(((WindowInsets) this.A00).replaceSystemWindowInsets(i10, i11, i12, i13));
    }

    public final boolean A07() {
        return ((WindowInsets) this.A00).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C05264y c05264y = (C05264y) obj;
        return this.A00 == null ? c05264y.A00 == null : this.A00.equals(c05264y.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
