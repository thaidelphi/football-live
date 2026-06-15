package com.ironsource;

import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.p7;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class o7<Smash extends p7<?>> extends l7<Smash, AdapterAdRewardListener> implements v2 {
    public o7(u0 u0Var, qk qkVar, IronSourceSegment ironSourceSegment) {
        super(u0Var, qkVar, ironSourceSegment);
    }

    @Override // com.ironsource.v2
    public void a(p7<?> p7Var, Placement placement) {
        IronLog.INTERNAL.verbose(b(p7Var.k()));
        this.f19365t.b(placement, p7Var.f());
    }
}
