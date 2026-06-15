package com.ironsource;

import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class jq implements c1<RewardedAd> {

    /* renamed from: a  reason: collision with root package name */
    private final q3 f17982a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f17983b;

    public jq(q3 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(callbackExecutor, "callbackExecutor");
        this.f17982a = analytics;
        this.f17983b = callbackExecutor;
    }

    @Override // com.ironsource.c1
    /* renamed from: b */
    public RewardedAd a(rj adInstance, w4 auctionDataReporter) {
        ConcurrentHashMap concurrentHashMap;
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        b1 b1Var = new b1(new co());
        q3 q3Var = this.f17982a;
        concurrentHashMap = kq.f18109a;
        return new RewardedAd(new mq(adInstance, b1Var, auctionDataReporter, q3Var, null, null, null, null, concurrentHashMap, 240, null));
    }
}
