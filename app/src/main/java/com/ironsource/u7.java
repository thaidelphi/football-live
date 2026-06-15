package com.ironsource;

import com.ironsource.g0;
import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class u7 extends g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(w1 adUnitData, zv waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.g0
    public void a(a0 instance, g0.b loadSelection) {
        String str;
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(loadSelection, "loadSelection");
        if (!instance.t()) {
            IronLog.INTERNAL.verbose(instance.d().name() + " - Instance " + instance.o() + " (non-bidder) is ready to load");
            loadSelection.a().add(instance);
            return;
        }
        loadSelection.a(true);
        if (loadSelection.e()) {
            str = "Advanced Loading: Starting to load bidder " + instance.o() + ". No other instances will be loaded at the same time.";
            loadSelection.a().add(instance);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + instance.o() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(instance.d().name() + " - " + str);
    }

    @Override // com.ironsource.g0
    public boolean a(g0.b loadSelection) {
        kotlin.jvm.internal.n.f(loadSelection, "loadSelection");
        return super.a(loadSelection) || loadSelection.d();
    }
}
