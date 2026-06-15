package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class wn implements vn {
    @Override // com.ironsource.vn
    public String a() {
        String version = IronSourceNetwork.getVersion();
        kotlin.jvm.internal.n.e(version, "getVersion()");
        return version;
    }

    @Override // com.ironsource.vn
    public void a(rj adInstance, xn loadParams) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.a());
    }
}
