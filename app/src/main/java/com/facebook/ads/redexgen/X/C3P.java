package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.3P  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class C3P {
    public static C3O A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static C3O A00(C1899k0 c1899k0) {
        if (A00 == null) {
            A00 = new C3O(c1899k0);
        }
        return A00;
    }

    public static void A01(C1899k0 c1899k0) {
        if (AbstractC06449p.A0C(c1899k0)) {
            A03(c1899k0);
        }
    }

    public static void A02(C1899k0 c1899k0) {
        if (AbstractC06449p.A0B(c1899k0)) {
            A03(c1899k0);
        }
    }

    public static void A03(C1899k0 c1899k0) {
        if (A01.compareAndSet(false, true)) {
            ExecutorC0712Cx.A01.execute(new C2006ln(c1899k0));
        }
    }
}
