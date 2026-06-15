package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zd implements ae {

    /* renamed from: a  reason: collision with root package name */
    private final ud f21655a;

    /* renamed from: b  reason: collision with root package name */
    private final pd f21656b;

    /* renamed from: c  reason: collision with root package name */
    private final n2 f21657c;

    public zd(ud strategy, pd adUnit, n2 loadListener) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(loadListener, "loadListener");
        this.f21655a = strategy;
        this.f21656b = adUnit;
        this.f21657c = loadListener;
    }

    @Override // com.ironsource.ae
    public void a() {
        this.f21655a.a("ad expired while loading");
    }

    @Override // com.ironsource.ae
    public void a(Activity activity, z1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        adUnitDisplayStrategyListener.b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.ae
    public void a(IronSourceError ironSourceError) {
        ud udVar = this.f21655a;
        udVar.a(new vd(udVar, null, false, 4, null));
        this.f21657c.a(ironSourceError);
    }

    @Override // com.ironsource.ae
    public void a(n2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.n.f(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        adUnitLoadStrategyListener.a(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.ae
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f21655a.a("load success with better ad while loading");
    }

    @Override // com.ironsource.ae
    public void b() {
        this.f21655a.a("show success while loading");
    }

    @Override // com.ironsource.ae
    public void b(IronSourceError ironSourceError) {
        this.f21655a.a("show failed while loading");
    }

    @Override // com.ironsource.ae
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        ud udVar = this.f21655a;
        udVar.a(new yd(udVar, this.f21656b, this.f21657c));
        this.f21657c.a(adInfo);
    }
}
