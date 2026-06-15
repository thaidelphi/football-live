package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class x5 extends a0 implements BannerAdListener {

    /* renamed from: w  reason: collision with root package name */
    private WeakReference<z5> f21357w;

    /* renamed from: x  reason: collision with root package name */
    private View f21358x;

    /* renamed from: y  reason: collision with root package name */
    private FrameLayout.LayoutParams f21359y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(w2 adTools, b0 instanceData, h0 adInstancePayload, z5 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f21357w = new WeakReference<>(listener);
    }

    private final ISBannerSize H() {
        w2 f10 = f();
        w1 i10 = m().i();
        kotlin.jvm.internal.n.d(i10, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return f10.a(((m6) i10).b().g());
    }

    private final void I() {
        Placement j10 = j();
        if (j10 != null) {
            f().e().a().f(j10.getPlacementName());
        }
        z5 z5Var = this.f21357w.get();
        if (z5Var != null) {
            z5Var.a(this);
        }
    }

    private final void J() {
        Placement j10 = j();
        if (j10 != null) {
            f().e().a().c(j10.getPlacementName());
        }
        z5 z5Var = this.f21357w.get();
        if (z5Var != null) {
            z5Var.b(this);
        }
    }

    private final void K() {
        Placement j10 = j();
        if (j10 != null) {
            f().e().a().h(j10.getPlacementName());
        }
        z5 z5Var = this.f21357w.get();
        if (z5Var != null) {
            z5Var.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(x5 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f21358x = null;
        this$0.f21359y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(x5 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adView, "$adView");
        kotlin.jvm.internal.n.f(frameLayoutParams, "$frameLayoutParams");
        this$0.f21358x = adView;
        this$0.f21359y = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final x5 this$0, ov viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(viewBinder, "$viewBinder");
        View view = this$0.f21358x;
        if (view == null || (layoutParams = this$0.f21359y) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.f());
        IronLog.INTERNAL.verbose(o1.a(this$0.f(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.f().d(new Runnable() { // from class: com.ironsource.o20
            @Override // java.lang.Runnable
            public final void run() {
                x5.e(x5.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(x5 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(x5 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(x5 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(x5 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        n0 a10 = this$0.f().e().a();
        Placement j10 = this$0.j();
        a10.j((j10 == null || (r1 = j10.getPlacementName()) == null) ? "" : "");
    }

    @Override // com.ironsource.a0
    public void a(j0 adInstancePresenter) {
        kotlin.jvm.internal.n.f(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    public final void a(final ov viewBinder) {
        kotlin.jvm.internal.n.f(viewBinder, "viewBinder");
        vl.a(f(), new Runnable() { // from class: com.ironsource.u20
            @Override // java.lang.Runnable
            public final void run() {
                x5.a(x5.this, viewBinder);
            }
        }, 0L, 2, (Object) null);
    }

    @Override // com.ironsource.a0
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        vl.a(f(), new Runnable() { // from class: com.ironsource.p20
            @Override // java.lang.Runnable
            public final void run() {
                x5.a(x5.this);
            }
        }, 0L, 2, (Object) null);
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterBannerInterface) {
                BaseAdAdapter<?, ?> g10 = g();
                kotlin.jvm.internal.n.d(g10, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((AdapterBannerInterface) g10).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
        super.b();
    }

    @Override // com.ironsource.a0
    public LevelPlayAdInfo e() {
        String uuid = m().i().b().b().toString();
        kotlin.jvm.internal.n.e(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        String c10 = m().i().b().c();
        String ad_unit = m().h().toString();
        kotlin.jvm.internal.n.e(ad_unit, "instanceData.adFormat.toString()");
        ImpressionData a10 = m().n().a(k());
        am d10 = m().n().d();
        w1 i10 = m().i();
        kotlin.jvm.internal.n.d(i10, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(uuid, c10, ad_unit, a10, d10, ((m6) i10).b().g(), null, 64, null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new Runnable() { // from class: com.ironsource.q20
            @Override // java.lang.Runnable
            public final void run() {
                x5.b(x5.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(final View adView, final FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.n.f(adView, "adView");
        kotlin.jvm.internal.n.f(frameLayoutParams, "frameLayoutParams");
        vl.a(f(), new Runnable() { // from class: com.ironsource.t20
            @Override // java.lang.Runnable
            public final void run() {
                x5.a(x5.this, adView, frameLayoutParams);
            }
        }, 0L, 2, (Object) null);
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new Runnable() { // from class: com.ironsource.s20
            @Override // java.lang.Runnable
            public final void run() {
                x5.c(x5.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new Runnable() { // from class: com.ironsource.r20
            @Override // java.lang.Runnable
            public final void run() {
                x5.d(x5.this);
            }
        });
    }

    @Override // com.ironsource.a0
    protected void z() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData i10 = i();
        ISBannerSize H = H();
        Map<String, Object> adUnitData = i10.getAdUnitData();
        kotlin.jvm.internal.n.e(adUnitData, "adData.adUnitData");
        adUnitData.put("bannerLayout", new IronSourceBannerLayout(ContextProvider.getInstance().getCurrentActiveActivity(), H));
        BaseAdAdapter<?, ?> g10 = g();
        kotlin.jvm.internal.n.d(g10, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) g10).loadAd(i10, ContextProvider.getInstance().getCurrentActiveActivity(), H, this);
    }
}
