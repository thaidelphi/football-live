package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class vd implements ae {

    /* renamed from: a  reason: collision with root package name */
    private final ud f21133a;

    /* renamed from: b  reason: collision with root package name */
    private final pd f21134b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21135c;

    public vd(ud strategy, pd pdVar, boolean z10) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        this.f21133a = strategy;
        this.f21134b = pdVar;
        this.f21135c = z10;
    }

    public /* synthetic */ vd(ud udVar, pd pdVar, boolean z10, int i10, kotlin.jvm.internal.h hVar) {
        this(udVar, pdVar, (i10 & 4) != 0 ? false : z10);
    }

    @Override // com.ironsource.ae
    public void a() {
        this.f21133a.a(this.f21135c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.ae
    public void a(Activity activity, z1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        adUnitDisplayStrategyListener.b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.f21135c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.ae
    public void a(IronSourceError ironSourceError) {
        this.f21133a.a(this.f21135c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.ae
    public void a(n2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.n.f(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        pd a10 = this.f21133a.d().a(true);
        ud udVar = this.f21133a;
        udVar.a(new zd(udVar, a10, adUnitLoadStrategyListener));
        a10.a(this.f21133a);
    }

    @Override // com.ironsource.ae
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f21133a.a(this.f21135c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.ae
    public void b() {
        this.f21133a.a(this.f21135c ? "show success on expired ad" : "show success before load called");
    }

    @Override // com.ironsource.ae
    public void b(IronSourceError ironSourceError) {
        this.f21133a.a(this.f21135c ? "show failed on expired ad" : "show failed before load called");
    }

    @Override // com.ironsource.ae
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f21133a.a(this.f21135c ? "load success on expired ad" : "load success before load called");
    }
}
