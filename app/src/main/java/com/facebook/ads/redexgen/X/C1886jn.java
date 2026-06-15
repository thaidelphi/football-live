package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
/* renamed from: com.facebook.ads.redexgen.X.jn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1886jn extends BY {
    public final /* synthetic */ C1899k0 A00;

    public C1886jn(C1899k0 c1899k0) {
        this.A00 = c1899k0;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
