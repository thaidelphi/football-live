package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class nn implements mn {
    @Override // com.ironsource.mn
    public void a(rj adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("destroy ad with identifier: " + adInstance.e() + " failed. error: " + e8.getMessage());
        }
    }
}
