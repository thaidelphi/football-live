package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TC implements InterfaceC1213Wv {
    public static final TC A01 = new TC();
    public final List<C1053Qh> A00;

    public TC() {
        this.A00 = Collections.emptyList();
    }

    public TC(C1053Qh c1053Qh) {
        this.A00 = Collections.singletonList(c1053Qh);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final List<C1053Qh> A7N(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final long A7t(int i10) {
        AbstractC1589es.A07(i10 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A7u() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A8Q(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
