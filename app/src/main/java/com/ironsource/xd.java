package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class xd implements ae {

    /* renamed from: a  reason: collision with root package name */
    private final ud f21397a;

    /* renamed from: b  reason: collision with root package name */
    private final pd f21398b;

    /* renamed from: c  reason: collision with root package name */
    private final pd f21399c;

    public xd(ud strategy, pd currentAdUnit, pd progressiveAdUnit) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.n.f(progressiveAdUnit, "progressiveAdUnit");
        this.f21397a = strategy;
        this.f21398b = currentAdUnit;
        this.f21399c = progressiveAdUnit;
    }

    @Override // com.ironsource.ae
    public void a() {
        this.f21397a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.ae
    public void a(Activity activity, z1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        adUnitDisplayStrategyListener.b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.ae
    public void a(IronSourceError ironSourceError) {
        ud udVar = this.f21397a;
        udVar.a(new vd(udVar, this.f21398b, false, 4, null));
    }

    @Override // com.ironsource.ae
    public void a(n2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.n.f(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        ud udVar = this.f21397a;
        udVar.a(new zd(udVar, this.f21399c, adUnitLoadStrategyListener));
    }

    @Override // com.ironsource.ae
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f21397a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.ae
    public void b() {
        this.f21397a.a("show success before progressive load success");
    }

    @Override // com.ironsource.ae
    public void b(IronSourceError ironSourceError) {
        this.f21397a.a("show failed before progressive load success");
    }

    @Override // com.ironsource.ae
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        ud udVar = this.f21397a;
        udVar.a(new wd(udVar, this.f21398b, this.f21399c, adInfo));
    }
}
