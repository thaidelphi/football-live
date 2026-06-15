package com.ironsource;

import com.ironsource.j3;
import com.ironsource.m3;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class vb implements bm {

    /* renamed from: a  reason: collision with root package name */
    private final IronSourceError f21129a;

    /* renamed from: b  reason: collision with root package name */
    private final e7 f21130b;

    /* renamed from: c  reason: collision with root package name */
    private final q3 f21131c;

    public vb(IronSourceError error, e7 adLoadTaskListener, q3 analytics) {
        kotlin.jvm.internal.n.f(error, "error");
        kotlin.jvm.internal.n.f(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        this.f21129a = error;
        this.f21130b = adLoadTaskListener;
        this.f21131c = analytics;
    }

    public final IronSourceError a() {
        return this.f21129a;
    }

    @Override // com.ironsource.bm
    public void start() {
        j3.c.a aVar = j3.c.f17909a;
        aVar.a().a(this.f21131c);
        aVar.a(new m3.j(this.f21129a.getErrorCode()), new m3.k(this.f21129a.getErrorMessage()), new m3.f(0L)).a(this.f21131c);
        this.f21130b.onAdLoadFailed(this.f21129a);
    }
}
