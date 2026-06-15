package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class xb implements bm {

    /* renamed from: a  reason: collision with root package name */
    private final InterstitialAdRequest f21393a;

    /* renamed from: b  reason: collision with root package name */
    private final fj f21394b;

    /* renamed from: c  reason: collision with root package name */
    private final q3 f21395c;

    /* renamed from: d  reason: collision with root package name */
    private final IronSourceError f21396d;

    public xb(InterstitialAdRequest adRequest, fj adLoadTaskListener, q3 analytics, IronSourceError error) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(error, "error");
        this.f21393a = adRequest;
        this.f21394b = adLoadTaskListener;
        this.f21395c = analytics;
        this.f21396d = error;
    }

    public final IronSourceError a() {
        return this.f21396d;
    }

    @Override // com.ironsource.bm
    public void start() {
        tb tbVar = new tb(this.f21395c, this.f21393a.getAdId$mediationsdk_release(), this.f21393a.getProviderName$mediationsdk_release());
        tbVar.a();
        tbVar.a(this.f21396d);
        this.f21394b.onAdLoadFailed(this.f21396d);
    }
}
