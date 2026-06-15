package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.q1;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class id extends a0 implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    /* renamed from: w  reason: collision with root package name */
    private WeakReference<jd> f17825w;

    /* renamed from: x  reason: collision with root package name */
    private ib f17826x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id(w2 adTools, b0 instanceData, h0 adInstancePayload, jd listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f17825w = new WeakReference<>(listener);
    }

    private final void H() {
        this.f17826x = new ib();
        IronLog.INTERNAL.verbose(a0.a(this, (String) null, 1, (Object) null));
        f().e().a().a(k(), "");
        jd jdVar = this.f17825w.get();
        if (jdVar != null) {
            jdVar.b(this);
        }
        c();
    }

    private final void I() {
        IronLog.INTERNAL.verbose(a0.a(this, (String) null, 1, (Object) null));
        f().e().a().d(k());
    }

    private final void J() {
        HashMap hashMap = new HashMap();
        Map<String, String> k10 = f().k();
        if (k10 != null) {
            for (String str : k10.keySet()) {
                hashMap.put("custom_" + str, k10.get(str));
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a10 = f().a(currentTimeMillis, o());
        long a11 = ib.a(this.f17826x);
        LevelPlayReward a12 = mm.f19249r.d().p().a(k(), m().i().b().c());
        if (a12 == null) {
            a12 = ja.f17945a.a();
        }
        LevelPlayReward levelPlayReward = a12;
        f().e().a().a(k(), levelPlayReward.getName(), levelPlayReward.getAmount(), currentTimeMillis, a10, a11, hashMap, f().j());
        jd jdVar = this.f17825w.get();
        if (jdVar != null) {
            jdVar.a(this, levelPlayReward);
        }
    }

    private final void K() {
        IronLog.INTERNAL.verbose(a0.a(this, (String) null, 1, (Object) null));
        f().e().a().l(k());
        jd jdVar = this.f17825w.get();
        if (jdVar != null) {
            jdVar.a(this);
        }
    }

    private final void L() {
        IronLog.INTERNAL.verbose(a0.a(this, (String) null, 1, (Object) null));
        f().e().a().i(k());
    }

    private final void M() {
        IronLog.INTERNAL.verbose(a0.a(this, (String) null, 1, (Object) null));
        f().e().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(id this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(id this$0, int i10, String str) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.b(i10, str);
    }

    private final void b(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        f().e().a().a(k(), i10, str, "");
        a(q1.a.FailedToShow);
        IronSourceError ironSourceError = new IronSourceError(i10, str);
        jd jdVar = this.f17825w.get();
        if (jdVar != null) {
            jdVar.a(this, ironSourceError);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(id this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(id this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(id this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(id this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(id this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.M();
    }

    public final void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().e().a().a(activity, k());
            if (g() instanceof AdapterAdFullScreenInterface) {
                BaseAdAdapter<?, ?> g10 = g();
                kotlin.jvm.internal.n.d(g10, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) g10).showAd(i(), this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().e().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "showAd - exception = " + th.getMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
            b(a2.h(m().h()), str);
        }
    }

    @Override // com.ironsource.a0
    public void a(j0 adInstancePresenter) {
        kotlin.jvm.internal.n.f(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.a0
    public void c() {
        if (mm.f19249r.d().d().d()) {
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
                return;
            }
            BaseAdAdapter<?, ?> g10 = g();
            kotlin.jvm.internal.n.d(g10, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
            ((AdapterAdFullScreenInterface) g10).disposeAd(m().g());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new Runnable() { // from class: com.ironsource.iz
            @Override // java.lang.Runnable
            public final void run() {
                id.a(id.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new Runnable() { // from class: com.ironsource.ez
            @Override // java.lang.Runnable
            public final void run() {
                id.b(id.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new Runnable() { // from class: com.ironsource.gz
            @Override // java.lang.Runnable
            public final void run() {
                id.c(id.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(final int i10, final String str) {
        a(new Runnable() { // from class: com.ironsource.kz
            @Override // java.lang.Runnable
            public final void run() {
                id.a(id.this, i10, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        a(new Runnable() { // from class: com.ironsource.jz
            @Override // java.lang.Runnable
            public final void run() {
                id.d(id.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new Runnable() { // from class: com.ironsource.hz
            @Override // java.lang.Runnable
            public final void run() {
                id.e(id.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new Runnable() { // from class: com.ironsource.fz
            @Override // java.lang.Runnable
            public final void run() {
                id.f(id.this);
            }
        });
    }

    @Override // com.ironsource.a0
    protected void z() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        BaseAdAdapter<?, ?> g10 = g();
        kotlin.jvm.internal.n.d(g10, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) g10).loadAd(m().g(), ContextProvider.getInstance().getCurrentActiveActivity(), this);
    }
}
