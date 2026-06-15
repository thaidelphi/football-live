package com.facebook.ads.redexgen.X;

import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class JV {
    public JZ A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final JV A00(JZ jz) {
        this.A00 = jz;
        return this;
    }

    public final JV A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final JV A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final JV A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final JV A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final JW A05() {
        return new JW(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
