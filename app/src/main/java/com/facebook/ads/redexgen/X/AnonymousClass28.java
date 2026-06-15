package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
/* renamed from: com.facebook.ads.redexgen.X.28  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AnonymousClass28 {
    public static AnonymousClass23 A00;

    public final AnonymousClass23 A00(C1900k1 c1900k1, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (AnonymousClass27.A00[adPlacementType.ordinal()]) {
            case 1:
                return new N5();
            case 2:
                if (C06419m.A1L(c1900k1)) {
                    return new N4();
                }
                return new N5();
            case 3:
                return new C2084n3();
            case 4:
                return new C2076mv(c1900k1);
            case 5:
                return new N3(c1900k1);
            case 6:
                return new N0();
            default:
                return null;
        }
    }
}
