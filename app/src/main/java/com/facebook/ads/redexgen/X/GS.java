package com.facebook.ads.redexgen.X;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class GS extends AbstractC1304aB {
    public final JSONObject A00;
    public final JSONObject A01;

    public GS(C1314aL c1314aL, JSONObject jSONObject, JSONObject jSONObject2) {
        super(c1314aL, KD.A03);
        this.A00 = jSONObject;
        this.A01 = jSONObject2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1304aB, com.facebook.ads.redexgen.X.K8
    public final void A43(Map<InterfaceC0887Jq, KD> map, Map<SyncModifiableBundle, K0> map2) {
        super.A00.A03(this.A00, this.A01);
        super.A43(map, map2);
    }
}
