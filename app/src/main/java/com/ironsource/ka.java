package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.q7;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ka<Smash extends q7<?>> extends hw<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(int i10, boolean z10, List<? extends Smash> waterfall) {
        super(i10, z10, waterfall);
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
    }

    @Override // com.ironsource.hw
    public void c(Smash smash) {
        kotlin.jvm.internal.n.f(smash, "smash");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
