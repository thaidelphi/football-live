package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class jg implements n4 {
    @Override // com.ironsource.n4
    public void a(nk observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.lifecycle.b.d().a(observer);
    }

    @Override // com.ironsource.n4
    public void b(nk observer) {
        kotlin.jvm.internal.n.f(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.lifecycle.b.d().b(observer);
    }
}
