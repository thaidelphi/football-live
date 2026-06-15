package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;
/* renamed from: com.facebook.ads.redexgen.X.jd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1876jd implements AnonymousClass89 {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C1875jc A01;

    public C1876jd(C1875jc c1875jc, AdvertisingId advertisingId) {
        this.A01 = c1875jc;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass89
    public final boolean AAM() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass89
    public final String getId() {
        return this.A00.getId();
    }
}
