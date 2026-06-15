package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class yb implements bm {

    /* renamed from: a  reason: collision with root package name */
    private final RewardedAdRequest f21521a;

    /* renamed from: b  reason: collision with root package name */
    private final qq f21522b;

    /* renamed from: c  reason: collision with root package name */
    private final q3 f21523c;

    /* renamed from: d  reason: collision with root package name */
    private final IronSourceError f21524d;

    public yb(RewardedAdRequest adRequest, qq adLoadTaskListener, q3 analytics, IronSourceError error) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(error, "error");
        this.f21521a = adRequest;
        this.f21522b = adLoadTaskListener;
        this.f21523c = analytics;
        this.f21524d = error;
    }

    public final IronSourceError a() {
        return this.f21524d;
    }

    @Override // com.ironsource.bm
    public void start() {
        tb tbVar = new tb(this.f21523c, this.f21521a.getAdId$mediationsdk_release(), this.f21521a.getProviderName$mediationsdk_release());
        tbVar.a();
        tbVar.a(this.f21524d);
        this.f21522b.onAdLoadFailed(this.f21524d);
    }
}
