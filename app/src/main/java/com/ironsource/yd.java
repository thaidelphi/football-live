package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class yd implements ae {

    /* renamed from: a  reason: collision with root package name */
    private final ud f21531a;

    /* renamed from: b  reason: collision with root package name */
    private final pd f21532b;

    /* renamed from: c  reason: collision with root package name */
    private final n2 f21533c;

    /* renamed from: d  reason: collision with root package name */
    private z1 f21534d;

    public yd(ud strategy, pd adUnit, n2 loadListener) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(loadListener, "loadListener");
        this.f21531a = strategy;
        this.f21532b = adUnit;
        this.f21533c = loadListener;
    }

    @Override // com.ironsource.ae
    public void a() {
        ud udVar = this.f21531a;
        udVar.a(new vd(udVar, null, true));
        this.f21533c.a();
    }

    @Override // com.ironsource.ae
    public void a(Activity activity, z1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        this.f21534d = adUnitDisplayStrategyListener;
        this.f21532b.a(activity, this.f21531a);
    }

    @Override // com.ironsource.ae
    public void a(IronSourceError ironSourceError) {
        this.f21531a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.ae
    public void a(n2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.n.f(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        ud udVar = this.f21531a;
        udVar.a(new vd(udVar, null, false, 4, null));
        this.f21531a.a(adUnitLoadStrategyListener);
    }

    @Override // com.ironsource.ae
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f21533c.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.ae
    public void b() {
        z1 z1Var = this.f21534d;
        if (z1Var != null) {
            z1Var.b();
        }
        pd a10 = this.f21531a.d().a(false);
        ud udVar = this.f21531a;
        udVar.a(new xd(udVar, this.f21532b, a10));
        a10.a(this.f21531a);
    }

    @Override // com.ironsource.ae
    public void b(IronSourceError ironSourceError) {
        if (!cb.f16858a.a(ironSourceError)) {
            ud udVar = this.f21531a;
            udVar.a(new vd(udVar, null, false, 4, null));
        }
        z1 z1Var = this.f21534d;
        if (z1Var != null) {
            z1Var.b(ironSourceError);
        }
    }

    @Override // com.ironsource.ae
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f21531a.a("Ad unit is already loaded");
    }
}
