package com.ironsource;

import com.ironsource.j3;
import com.ironsource.m3;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class tb {

    /* renamed from: a  reason: collision with root package name */
    private final q3 f20832a;

    public tb(q3 analytics, String adRequestAdId, yp adRequestProviderName) {
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(adRequestAdId, "adRequestAdId");
        kotlin.jvm.internal.n.f(adRequestProviderName, "adRequestProviderName");
        this.f20832a = analytics;
        analytics.a(new m3.s(adRequestProviderName.value()), new m3.b(adRequestAdId));
    }

    public final void a() {
        j3.c.f17909a.a().a(this.f20832a);
    }

    public final void a(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        j3.c.f17909a.a(new m3.j(error.getErrorCode()), new m3.k(error.getErrorMessage()), new m3.f(0L)).a(this.f20832a);
    }
}
