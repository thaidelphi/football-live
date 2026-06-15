package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TF implements InterfaceC1213Wv {
    public final List<Long> A00;
    public final List<List<C1053Qh>> A01;

    public TF(List<List<C1053Qh>> list, List<Long> cueTimesUs) {
        this.A01 = list;
        this.A00 = cueTimesUs;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final List<C1053Qh> A7N(long j10) {
        int A0H = AbstractC1672gE.A0H(this.A00, Long.valueOf(j10), true, false);
        if (A0H == -1) {
            return Collections.emptyList();
        }
        return this.A01.get(A0H);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final long A7t(int i10) {
        boolean z10 = true;
        AbstractC1589es.A07(i10 >= 0);
        if (i10 >= this.A00.size()) {
            z10 = false;
        }
        AbstractC1589es.A07(z10);
        return this.A00.get(i10).longValue();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A7u() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A8Q(long j10) {
        int A0G = AbstractC1672gE.A0G(this.A00, Long.valueOf(j10), false, false);
        int index = this.A00.size();
        if (A0G < index) {
            return A0G;
        }
        return -1;
    }
}
