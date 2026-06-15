package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Qe  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1050Qe implements InterfaceC1213Wv {
    public final long A00;
    public final OI<C1053Qh> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> */
    public C1050Qe(long j10, OI<C1053Qh> oi) {
        this.A00 = j10;
        this.A01 = oi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final List<C1053Qh> A7N(long j10) {
        return j10 >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final long A7t(int i10) {
        AbstractC1589es.A07(i10 == 0);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A7u() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1213Wv
    public final int A8Q(long j10) {
        return this.A00 > j10 ? 0 : -1;
    }
}
