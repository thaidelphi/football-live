package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class o extends fc {

    /* renamed from: a  reason: collision with root package name */
    private final IronSource.AD_UNIT f19460a;

    /* renamed from: b  reason: collision with root package name */
    private final UUID f19461b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19462c;

    public o(IronSource.AD_UNIT adFormat, UUID adId, String adUnitId) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adId, "adId");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        this.f19460a = adFormat;
        this.f19461b = adId;
        this.f19462c = adUnitId;
    }

    @Override // com.ironsource.d2
    public Map<String, Object> a(b2 b2Var) {
        return a(new f1(this.f19460a, this.f19461b, this.f19462c, null, null, 24, null));
    }
}
