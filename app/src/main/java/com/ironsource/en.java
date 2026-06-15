package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.q7;
import java.util.Arrays;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class en extends q7<r2> implements NativeAdListener {

    /* renamed from: r  reason: collision with root package name */
    private AdapterNativeAdData f17250r;

    /* renamed from: s  reason: collision with root package name */
    private AdapterNativeAdViewBinder f17251s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(tp threadInterface, m1 adSmashData, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, Placement placement, m5 item, r2 r2Var) {
        super(threadInterface, adSmashData, baseAdAdapter, new c3(adSmashData.g(), adSmashData.g().getNativeAdSettings(), IronSource.AD_UNIT.NATIVE_AD), item, r2Var);
        kotlin.jvm.internal.n.f(threadInterface, "threadInterface");
        kotlin.jvm.internal.n.f(adSmashData, "adSmashData");
        kotlin.jvm.internal.n.f(item, "item");
        this.f19847g = placement;
    }

    private final void J() {
        fv fvVar;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
        } else if (this.f19845e != q7.h.FAILED) {
            kotlin.jvm.internal.d0 d0Var = kotlin.jvm.internal.d0.f27370a;
            String format = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.f19845e}, 2));
            kotlin.jvm.internal.n.e(format, "format(format, *args)");
            e2 e2Var = this.f19844d;
            if (e2Var == null || (fvVar = e2Var.f17171k) == null) {
                return;
            }
            fvVar.p(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(en this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(en this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adapterNativeAdData, "$adapterNativeAdData");
        kotlin.jvm.internal.n.f(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f17250r = adapterNativeAdData;
        this.f17251s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.q7
    protected void G() {
        fv fvVar;
        if (!(this.f19843c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
        } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            e2 e2Var = this.f19844d;
            if (e2Var == null || (fvVar = e2Var.f17171k) == null) {
                return;
            }
            fvVar.g("activity must not be null");
        } else {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f19843c;
            kotlin.jvm.internal.n.d(baseAdAdapter, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
            AdData mCurrentAdData = this.f19851k;
            kotlin.jvm.internal.n.e(mCurrentAdData, "mCurrentAdData");
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            kotlin.jvm.internal.n.e(currentActiveActivity, "getInstance().currentActiveActivity");
            ((AdapterNativeAdInterface) baseAdAdapter).loadAd(mCurrentAdData, currentActiveActivity, this);
        }
    }

    public final void P() {
        fv fvVar;
        zl zlVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(q7.h.NONE);
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f19843c;
        if (baseAdAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (baseAdAdapter instanceof AdapterNativeAdInterface) {
                kotlin.jvm.internal.n.d(baseAdAdapter, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData mCurrentAdData = this.f19851k;
                kotlin.jvm.internal.n.e(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) baseAdAdapter).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            e2 e2Var = this.f19844d;
            if (e2Var != null && (fvVar = e2Var.f17171k) != null) {
                fvVar.g(str);
            }
        }
        e2 e2Var2 = this.f19844d;
        if (e2Var2 == null || (zlVar = e2Var2.f17167g) == null) {
            return;
        }
        Integer sessionDepth = r();
        kotlin.jvm.internal.n.e(sessionDepth, "sessionDepth");
        zlVar.a(sessionDepth.intValue());
    }

    public final AdapterNativeAdData Q() {
        return this.f17250r;
    }

    public final AdapterNativeAdViewBinder R() {
        return this.f17251s;
    }

    @Override // com.ironsource.q7, com.ironsource.d2
    public Map<String, Object> a(b2 event) {
        kotlin.jvm.internal.n.f(event, "event");
        Map<String, Object> data = super.a(event);
        if (this.f19847g != null) {
            kotlin.jvm.internal.n.e(data, "data");
            data.put("placement", j());
        }
        kotlin.jvm.internal.n.e(data, "data");
        return data;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(final AdapterNativeAdData adapterNativeAdData, final AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.n.f(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.n.f(nativeAdViewBinder, "nativeAdViewBinder");
        if (u().c()) {
            u().a(new Runnable() { // from class: com.ironsource.xx
                @Override // java.lang.Runnable
                public final void run() {
                    en.a(en.this, adapterNativeAdData, nativeAdViewBinder);
                }
            });
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.q7, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new Runnable() { // from class: com.ironsource.wx
                @Override // java.lang.Runnable
                public final void run() {
                    en.a(en.this);
                }
            });
        } else {
            J();
        }
    }
}
