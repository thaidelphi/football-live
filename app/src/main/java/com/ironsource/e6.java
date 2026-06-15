package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e6 implements d6 {

    /* renamed from: a  reason: collision with root package name */
    private final q3 f17195a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f17196b;

    public e6(q3 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(callbackExecutor, "callbackExecutor");
        this.f17195a = analytics;
        this.f17196b = callbackExecutor;
    }

    @Override // com.ironsource.d6
    public BannerAdView a(rj adInstance, vg adContainer, w4 auctionDataReporter) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(adContainer, "adContainer");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        return new BannerAdView(new p6(adInstance, adContainer, auctionDataReporter, this.f17195a, null, null, null, null, 240, null));
    }
}
