package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class xm extends a0 implements NativeAdListener {

    /* renamed from: w  reason: collision with root package name */
    private AdapterNativeAdData f21412w;

    /* renamed from: x  reason: collision with root package name */
    private AdapterNativeAdViewBinder f21413x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(w2 adTools, b0 instanceData, h0 adInstancePayload, e0 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.n.f(listener, "listener");
    }

    public final AdapterNativeAdData H() {
        return this.f21412w;
    }

    public final AdapterNativeAdViewBinder I() {
        return this.f21413x;
    }

    @Override // com.ironsource.a0
    public void a(j0 adInstancePresenter) {
        kotlin.jvm.internal.n.f(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    public final void a(qm nativeAdBinder) {
        kotlin.jvm.internal.n.f(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.a(this.f21412w);
        nativeAdBinder.a(this.f21413x);
    }

    @Override // com.ironsource.a0
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterNativeAdInterface) {
                BaseAdAdapter<?, ?> g10 = g();
                kotlin.jvm.internal.n.d(g10, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) g10).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
        super.b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.n.f(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.n.f(nativeAdViewBinder, "nativeAdViewBinder");
        this.f21412w = adapterNativeAdData;
        this.f21413x = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.a0
    protected void z() {
        if (!(g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData i10 = i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().e().h().g("activity must not be null");
            return;
        }
        BaseAdAdapter<?, ?> g10 = g();
        kotlin.jvm.internal.n.d(g10, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        kotlin.jvm.internal.n.e(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) g10).loadAd(i10, currentActiveActivity, this);
    }
}
