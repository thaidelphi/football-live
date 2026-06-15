package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class JM {
    public float A00;
    public EnumC04291d A01;
    public Map<String, String> A02;

    public JM(EnumC04291d enumC04291d) {
        this(enumC04291d, 0.0f);
    }

    public JM(EnumC04291d enumC04291d, float f10) {
        this(enumC04291d, f10, null);
    }

    public JM(EnumC04291d enumC04291d, float f10, Map<String, String> windowParams) {
        this.A01 = enumC04291d;
        this.A00 = f10;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC04291d A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC04291d.A0I;
    }
}
