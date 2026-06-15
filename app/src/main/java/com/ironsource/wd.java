package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class wd implements ae {

    /* renamed from: a  reason: collision with root package name */
    private final ud f21291a;

    /* renamed from: b  reason: collision with root package name */
    private final pd f21292b;

    /* renamed from: c  reason: collision with root package name */
    private final pd f21293c;

    /* renamed from: d  reason: collision with root package name */
    private LevelPlayAdInfo f21294d;

    public wd(ud strategy, pd currentAdUnit, pd progressiveAdUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.n.f(progressiveAdUnit, "progressiveAdUnit");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f21291a = strategy;
        this.f21292b = currentAdUnit;
        this.f21293c = progressiveAdUnit;
        this.f21294d = adInfo;
    }

    @Override // com.ironsource.ae
    public void a() {
        ud udVar = this.f21291a;
        udVar.a(new vd(udVar, this.f21292b, true));
    }

    @Override // com.ironsource.ae
    public void a(Activity activity, z1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        adUnitDisplayStrategyListener.b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.ae
    public void a(IronSourceError ironSourceError) {
        this.f21291a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.ae
    public void a(n2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.n.f(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        adUnitLoadStrategyListener.a(this.f21294d);
        ud udVar = this.f21291a;
        udVar.a(new yd(udVar, this.f21293c, adUnitLoadStrategyListener));
    }

    @Override // com.ironsource.ae
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f21294d = adInfo;
    }

    @Override // com.ironsource.ae
    public void b() {
        this.f21291a.a("show success on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.ae
    public void b(IronSourceError ironSourceError) {
        this.f21291a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.ae
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f21291a.a("load success on progressive ad unit is already loaded");
    }
}
