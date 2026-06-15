package com.ironsource;

import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zi implements c1<InterstitialAd> {

    /* renamed from: a  reason: collision with root package name */
    private final q3 f21660a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f21661b;

    public zi(q3 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(callbackExecutor, "callbackExecutor");
        this.f21660a = analytics;
        this.f21661b = callbackExecutor;
    }

    @Override // com.ironsource.c1
    /* renamed from: b */
    public InterstitialAd a(rj adInstance, w4 auctionDataReporter) {
        ConcurrentHashMap concurrentHashMap;
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        b1 b1Var = new b1(new co());
        q3 q3Var = this.f21660a;
        concurrentHashMap = aj.f16369a;
        return new InterstitialAd(new bj(adInstance, b1Var, auctionDataReporter, q3Var, null, null, null, null, concurrentHashMap, 240, null));
    }
}
