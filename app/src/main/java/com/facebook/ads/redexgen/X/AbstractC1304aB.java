package com.facebook.ads.redexgen.X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.aB  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1304aB implements K8 {
    public final C1314aL A00;
    public final KD A01;

    public AbstractC1304aB(C1314aL c1314aL, KD kd) {
        this.A00 = c1314aL;
        this.A01 = kd;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public void A43(Map<InterfaceC0887Jq, KD> map, Map<SyncModifiableBundle, K0> map2) {
        map.put(this.A00, this.A01);
    }
}
