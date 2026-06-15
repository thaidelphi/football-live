package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TD implements InterfaceC1213Wv {
    public final XY A00;
    public final Map<String, C1223Xf> A01;
    public final Map<String, String> A02;
    public final Map<String, XZ> A03;
    public final long[] A04;

    public TD(XY xy, Map<String, C1223Xf> map, Map<String, XZ> map2, Map<String, String> imageMap) {
        this.A00 = xy;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = xy.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final List<C1053Qh> A7N(long j10) {
        return this.A00.A0E(j10, this.A01, this.A03, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final long A7t(int i10) {
        return this.A04[i10];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A7u() {
        return this.A04.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A8Q(long j10) {
        int A0K = AbstractC1672gE.A0K(this.A04, j10, false, false);
        int index = this.A04.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
