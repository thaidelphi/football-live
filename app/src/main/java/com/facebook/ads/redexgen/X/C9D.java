package com.facebook.ads.redexgen.X;

import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.9D  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C9D {
    public static C9D A00 = new C9D();

    public static C9D A00() {
        return A00;
    }

    public final C1869jW A01(AnonymousClass85 anonymousClass85, boolean z10) {
        return new C1869jW(anonymousClass85, z10, new C05887j());
    }

    public final Map<String, String> A02(AnonymousClass85 anonymousClass85) {
        try {
            return A01(anonymousClass85, false).A05();
        } catch (Throwable th) {
            anonymousClass85.A08().A48(th);
            return AnonymousClass95.A01(anonymousClass85);
        }
    }
}
