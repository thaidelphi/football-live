package com.ironsource;

import com.ironsource.g0;
import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ha extends g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(w1 adUnitData, zv waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.g0
    public void a(a0 instance, g0.b loadSelection) {
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(loadSelection, "loadSelection");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(instance.d().name() + " - Instance " + instance.p() + " is ready to load");
        loadSelection.a().add(instance);
    }
}
