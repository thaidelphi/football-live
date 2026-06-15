package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.ye;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class s implements ye, ye.a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<IronSource.AD_UNIT, AtomicBoolean> f20044a;

    public s() {
        Map<IronSource.AD_UNIT, AtomicBoolean> g10;
        g10 = j8.j0.g(i8.s.a(IronSource.AD_UNIT.REWARDED_VIDEO, new AtomicBoolean(false)), i8.s.a(IronSource.AD_UNIT.INTERSTITIAL, new AtomicBoolean(false)), i8.s.a(IronSource.AD_UNIT.BANNER, new AtomicBoolean(false)));
        this.f20044a = g10;
    }

    @Override // com.ironsource.ye.a
    public void a(IronSource.AD_UNIT adFormat, boolean z10) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f20044a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z10);
        }
    }

    @Override // com.ironsource.ye
    public boolean a(IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f20044a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
