package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.applovin.impl.d7;
import com.applovin.impl.f;
import com.applovin.impl.j3;
import com.applovin.impl.k6;
import com.applovin.impl.l2;
import com.applovin.impl.m1;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.p3;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.u2;
import com.applovin.impl.u5;
import com.applovin.impl.w2;
import com.applovin.impl.y1;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0134a, f.b {

    /* renamed from: a  reason: collision with root package name */
    private final a f7616a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f7617b;

    /* renamed from: c  reason: collision with root package name */
    private final b f7618c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.mediation.b f7619d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f7620e;

    /* renamed from: f  reason: collision with root package name */
    private w2 f7621f;

    /* renamed from: g  reason: collision with root package name */
    private c f7622g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f7623h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f7624i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7625j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7626k;

    /* renamed from: l  reason: collision with root package name */
    private String f7627l;

    /* renamed from: m  reason: collision with root package name */
    private String f7628m;

    /* renamed from: n  reason: collision with root package name */
    private WeakReference f7629n;

    /* renamed from: o  reason: collision with root package name */
    private WeakReference f7630o;

    /* renamed from: p  reason: collision with root package name */
    private WeakReference f7631p;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        Activity getActivity();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, com.applovin.impl.sdk.j jVar, Context context) {
        super(str, maxAdFormat, str2, jVar);
        this.f7620e = new Object();
        this.f7621f = null;
        this.f7622g = c.IDLE;
        this.f7623h = new AtomicBoolean();
        this.f7624i = new AtomicBoolean();
        this.f7629n = new WeakReference(null);
        this.f7630o = new WeakReference(null);
        this.f7631p = new WeakReference(null);
        this.f7616a = aVar;
        this.f7618c = createAdListenerWrapper();
        this.f7619d = new com.applovin.impl.mediation.b(jVar);
        this.f7617b = new WeakReference(context);
        jVar.i().a(this);
        com.applovin.impl.sdk.n.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    protected b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.g
            @Override // java.lang.Runnable
            public final void run() {
                MaxFullscreenAdImpl.this.b();
            }
        });
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f7620e) {
            w2 w2Var = this.f7621f;
            z10 = w2Var != null && w2Var.b0() && this.f7622g == c.READY;
        }
        if (!z10) {
            this.sdk.B().c(this.adUnitId);
        }
        return z10;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0134a
    public void onAdExpired(m1 m1Var) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str = this.tag;
            nVar.a(str, "Ad expired " + getAdUnitId());
        }
        this.f7623h.set(true);
        a aVar = this.f7616a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            c();
            this.f7618c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.P().loadAd(this.adUnitId, null, this.adFormat, d.b.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f7618c);
    }

    @Override // com.applovin.impl.f.b
    public void onCreativeIdGenerated(String str, String str2) {
        w2 w2Var = this.f7621f;
        if (w2Var == null || !w2Var.S().equalsIgnoreCase(str)) {
            return;
        }
        this.f7621f.h(str2);
        l2.b(this.adReviewListener, str2, this.f7621f);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        w2 w2Var;
        List b10 = this.sdk.k0().b();
        if (this.sdk.k0().d() && b10 != null && (w2Var = this.f7621f) != null && !b10.contains(w2Var.c())) {
            final String str3 = "Attempting to show ad from <" + this.f7621f.c() + "> which is not in the list of selected ad networks " + b10;
            com.applovin.impl.sdk.n.h(this.tag, str3);
            a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.k
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.this.b(str3);
                }
            });
            return;
        }
        if (activity == null) {
            activity = this.sdk.m0();
        }
        if (a(activity, str)) {
            a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.l
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.this.a(str, str2, activity);
                }
            });
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f7616a) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements MaxAdListener, MaxAdRevenueListener, a.InterfaceC0126a {
        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            com.applovin.impl.sdk.n nVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                nVar2.a(str2, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            l2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f7626k) {
                MaxFullscreenAdImpl.this.d();
                return;
            }
            com.applovin.impl.sdk.n nVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                nVar2.a(str, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            l2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                nVar2.a(str, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            l2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z10 = MaxFullscreenAdImpl.this.f7626k;
            MaxFullscreenAdImpl.this.f7626k = false;
            final w2 w2Var = (w2) maxAd;
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.r
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.b.this.a(maxAd, z10, w2Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            final w2 w2Var = (w2) maxAd;
            MaxFullscreenAdImpl.this.f7626k = false;
            MaxFullscreenAdImpl.this.sdk.f().a(w2Var);
            Integer num = (Integer) MaxFullscreenAdImpl.this.sdk.a(j3.E7);
            if (num.intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.i0().b(new k6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new Runnable() { // from class: com.applovin.impl.mediation.ads.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.b.this.a(w2Var);
                    }
                }), u5.b.TIMEOUT, TimeUnit.SECONDS.toMillis(num.intValue()));
            }
            com.applovin.impl.sdk.n nVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                nVar2.a(str, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            l2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f7626k = false;
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.p
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.b.this.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.c();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.s
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.b.this.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            w2 w2Var;
            synchronized (MaxFullscreenAdImpl.this.f7620e) {
                w2Var = MaxFullscreenAdImpl.this.f7621f;
            }
            MaxFullscreenAdImpl.this.sdk.B().a(MaxFullscreenAdImpl.this.adUnitId);
            MaxFullscreenAdImpl.this.a((w2) maxAd);
            if (!MaxFullscreenAdImpl.this.f7623h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.b.this.b(maxAd);
                    }
                });
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f7624i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.d();
            }
            com.applovin.impl.sdk.n nVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                nVar2.a(str, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + w2Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            l2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) w2Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            com.applovin.impl.sdk.n nVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                nVar2.a(str2, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            l2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                nVar2.a(str, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            l2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(w2 w2Var) {
            if (w2Var.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.D().a(y1.X, w2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            com.applovin.impl.sdk.n nVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                nVar2.a(str, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            l2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z10, w2 w2Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z10 && w2Var.y0() && MaxFullscreenAdImpl.this.sdk.J().d(MaxFullscreenAdImpl.this.adUnitId)) {
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.b.this.a();
                    }
                });
                return;
            }
            com.applovin.impl.sdk.n nVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                nVar2.a(str, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            l2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f7626k = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        synchronized (this.f7620e) {
            if (this.f7621f != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.logger;
                    String str = this.tag;
                    nVar.a(str, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f7621f + "...");
                }
                this.sdk.P().destroyAd(this.f7621f);
            }
        }
        this.sdk.i().b(this);
        this.f7619d.a();
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        w2 w2Var = this.f7621f;
        a((MaxAd) w2Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str2 = this.tag;
            nVar.a(str2, "MaxAdListener.onAdDisplayFailed(ad=" + w2Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        l2.a(this.adListener, (MaxAd) w2Var, (MaxError) maxErrorImpl, true);
        this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, w2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Activity activity = (Activity) this.f7629n.get();
        if (activity == null) {
            activity = this.sdk.m0();
        }
        Activity activity2 = activity;
        if (this.f7625j) {
            showAd(this.f7627l, this.f7628m, (ViewGroup) this.f7630o.get(), (androidx.lifecycle.i) this.f7631p.get(), activity2);
        } else {
            showAd(this.f7627l, this.f7628m, activity2);
        }
    }

    public void loadAd(final d.b bVar) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str = this.tag;
            nVar.a(str, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f7622g == c.DESTROYED) {
            boolean c10 = d7.c(this.sdk);
            this.sdk.D().a(y1.f9677l0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + c10));
            if (c10) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (isReady()) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.logger;
                String str2 = this.tag;
                nVar2.a(str2, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar3 = this.logger;
                String str3 = this.tag;
                nVar3.a(str3, "MaxAdListener.onAdLoaded(ad=" + this.f7621f + "), listener=" + this.adListener);
            }
            l2.f(this.adListener, (MaxAd) this.f7621f, true);
            return;
        }
        a aVar = this.f7616a;
        final Activity activity = aVar != null ? aVar.getActivity() : null;
        final Context context = (Context) this.f7617b.get();
        a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.h
            @Override // java.lang.Runnable
            public final void run() {
                MaxFullscreenAdImpl.this.a(activity, context, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void a(android.app.Activity r10, android.content.Context r11, com.applovin.impl.mediation.d.b r12) {
        /*
            r9 = this;
            if (r10 == 0) goto L4
        L2:
            r7 = r10
            goto L1c
        L4:
            if (r11 == 0) goto L8
            r7 = r11
            goto L1c
        L8:
            com.applovin.impl.sdk.j r10 = r9.sdk
            android.app.Activity r10 = r10.m0()
            if (r10 == 0) goto L17
            com.applovin.impl.sdk.j r10 = r9.sdk
            android.app.Activity r10 = r10.m0()
            goto L2
        L17:
            android.content.Context r10 = com.applovin.impl.sdk.j.m()
            goto L2
        L1c:
            com.applovin.impl.sdk.j r10 = r9.sdk
            com.applovin.impl.mediation.MediationServiceImpl r0 = r10.P()
            java.lang.String r1 = r9.adUnitId
            com.applovin.mediation.MaxAdFormat r3 = r9.adFormat
            java.util.Map<java.lang.String, java.lang.Object> r5 = r9.localExtraParameters
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.extraParameters
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b r8 = r9.f7618c
            r2 = 0
            r4 = r12
            r0.loadAd(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a(android.app.Activity, android.content.Context, com.applovin.impl.mediation.d$b):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        w2 w2Var;
        if (this.f7623h.compareAndSet(true, false)) {
            synchronized (this.f7620e) {
                w2Var = this.f7621f;
                this.f7621f = null;
            }
            this.sdk.P().destroyAd(w2Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f7625j = false;
        this.f7629n = new WeakReference(activity);
        this.sdk.P().showFullscreenAd(this.f7621f, activity, this.f7618c);
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final androidx.lifecycle.i iVar, Activity activity) {
        w2 w2Var;
        if (viewGroup != null && iVar != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(j3.f7320w7)).booleanValue()) {
                com.applovin.impl.sdk.n.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                l2.a(this.adListener, (MaxAd) this.f7621f, (MaxError) maxErrorImpl, true);
                this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f7621f);
                return;
            }
            List b10 = this.sdk.k0().b();
            if (this.sdk.k0().d() && b10 != null && (w2Var = this.f7621f) != null && !b10.contains(w2Var.c())) {
                final String str3 = "Attempting to show ad from <" + this.f7621f.c() + "> which is not in the list of selected ad networks " + b10;
                com.applovin.impl.sdk.n.h(this.tag, str3);
                a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.this.c(str3);
                    }
                });
                return;
            }
            if (activity == null) {
                activity = this.sdk.m0();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.this.a(str, str2, activity2, viewGroup, iVar);
                    }
                });
                return;
            }
            return;
        }
        com.applovin.impl.sdk.n.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f7621f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
        }
        l2.a(this.adListener, (MaxAd) this.f7621f, (MaxError) maxErrorImpl2, true);
        this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f7621f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        w2 w2Var = this.f7621f;
        a((MaxAd) w2Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str2 = this.tag;
            nVar.a(str2, "MaxAdListener.onAdDisplayFailed(ad=" + w2Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        l2.a(this.adListener, (MaxAd) w2Var, (MaxError) maxErrorImpl, true);
        this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, w2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        a(str, str2);
        this.f7625j = true;
        this.f7629n = new WeakReference(activity);
        this.f7630o = new WeakReference(viewGroup);
        this.f7631p = new WeakReference(iVar);
        this.sdk.P().showFullscreenAd(this.f7621f, viewGroup, iVar, activity, this.f7618c);
    }

    private boolean a(Activity activity, final String str) {
        if (activity != null || MaxAdFormat.APP_OPEN == this.adFormat) {
            if (this.f7622g == c.DESTROYED) {
                boolean c10 = d7.c(this.sdk);
                this.sdk.D().a(y1.f9677l0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + c10));
                if (c10) {
                    throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
                }
            }
            if (!isReady()) {
                String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
                com.applovin.impl.sdk.n.h(this.tag, str2);
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
                p3 p3Var = new p3(this.adUnitId, this.adFormat, str);
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + p3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
                }
                l2.a(this.adListener, (MaxAd) p3Var, (MaxError) maxErrorImpl, true);
                if (this.f7621f != null) {
                    this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f7621f);
                }
                return false;
            }
            Long l10 = (Long) this.sdk.a(j3.f7308j7);
            Long l11 = (Long) this.sdk.a(j3.f7301c7);
            if (l10.longValue() > 0 && (this.f7621f.getTimeToLiveMillis() < l11.longValue() || this.f7623h.get())) {
                this.f7624i.set(true);
                this.sdk.i0().a(new k6(this.sdk, "handleShowOnLoadTimeoutError", new Runnable() { // from class: com.applovin.impl.mediation.ads.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.this.a(str);
                    }
                }), u5.b.TIMEOUT, l10.longValue());
                return false;
            }
            if (d7.a(com.applovin.impl.sdk.j.m()) != 0 && this.sdk.f0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
                if (!d7.c(this.sdk)) {
                    if (((Boolean) this.sdk.a(j3.f7319v7)).booleanValue()) {
                        com.applovin.impl.sdk.n.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                        if (com.applovin.impl.sdk.n.a()) {
                            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f7621f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                        }
                        l2.a(this.adListener, (MaxAd) this.f7621f, (MaxError) maxErrorImpl2, true);
                        this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f7621f);
                        return false;
                    }
                } else {
                    throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                }
            }
            if (this.sdk.B().d() || this.sdk.B().c()) {
                com.applovin.impl.sdk.n.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f7621f + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
                }
                l2.a(this.adListener, (MaxAd) this.f7621f, (MaxError) maxErrorImpl3, true);
                this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f7621f);
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.f7624i.compareAndSet(true, false)) {
            com.applovin.impl.sdk.n.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.B().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            p3 p3Var = new p3(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str2 = this.tag;
                nVar.a(str2, "MaxAdListener.onAdDisplayFailed(ad=" + p3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            l2.a(this.adListener, (MaxAd) p3Var, (MaxError) maxErrorImpl, true);
            if (this.f7621f != null) {
                this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f7621f);
            }
        }
    }

    private void a(String str, String str2) {
        this.f7619d.e(this.f7621f);
        this.f7621f.g(str);
        this.f7621f.f(str2);
        this.f7627l = str;
        this.f7628m = str2;
        this.sdk.v().d(this.f7621f);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str3 = this.tag;
            nVar.a(str3, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f7621f + "...");
        }
        a((u2) this.f7621f);
    }

    private void a() {
        w2 w2Var;
        synchronized (this.f7620e) {
            w2Var = this.f7621f;
            this.f7621f = null;
        }
        this.sdk.P().destroyAd(w2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(w2 w2Var) {
        if (this.sdk.f().a(w2Var, this)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str = this.tag;
                nVar.a(str, "Handle ad loaded for regular ad: " + w2Var);
            }
            this.f7621f = w2Var;
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(w2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z10;
        c cVar2 = this.f7622g;
        synchronized (this.f7620e) {
            c cVar3 = c.IDLE;
            if (cVar2 == cVar3) {
                if (cVar != c.LOADING && cVar != c.DESTROYED) {
                    if (cVar == c.SHOWING) {
                        com.applovin.impl.sdk.n.h(this.tag, "No ad is loading or loaded");
                    } else if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar = this.logger;
                        String str = this.tag;
                        nVar.b(str, "Unable to transition to: " + cVar);
                    }
                    z10 = false;
                }
                z10 = true;
            } else {
                c cVar4 = c.LOADING;
                if (cVar2 == cVar4) {
                    if (cVar != cVar3) {
                        if (cVar == cVar4) {
                            com.applovin.impl.sdk.n.h(this.tag, "An ad is already loading");
                        } else if (cVar != c.READY) {
                            if (cVar == c.SHOWING) {
                                com.applovin.impl.sdk.n.h(this.tag, "An ad is not ready to be shown yet");
                            } else if (cVar != c.DESTROYED) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    com.applovin.impl.sdk.n nVar2 = this.logger;
                                    String str2 = this.tag;
                                    nVar2.b(str2, "Unable to transition to: " + cVar);
                                }
                            }
                        }
                        z10 = false;
                    }
                    z10 = true;
                } else {
                    c cVar5 = c.READY;
                    if (cVar2 == cVar5) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                com.applovin.impl.sdk.n.h(this.tag, "An ad is already loaded");
                            } else if (cVar == cVar5) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.logger.b(this.tag, "An ad is already marked as ready");
                                }
                            } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    com.applovin.impl.sdk.n nVar3 = this.logger;
                                    String str3 = this.tag;
                                    nVar3.b(str3, "Unable to transition to: " + cVar);
                                }
                            }
                            z10 = false;
                        }
                        z10 = true;
                    } else {
                        c cVar6 = c.SHOWING;
                        if (cVar2 == cVar6) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    com.applovin.impl.sdk.n.h(this.tag, "Can not load another ad while the ad is showing");
                                } else if (cVar == cVar5) {
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.logger.b(this.tag, "An ad is already showing, ignoring");
                                    }
                                } else if (cVar == cVar6) {
                                    com.applovin.impl.sdk.n.h(this.tag, "The ad is already showing, not showing another one");
                                } else if (cVar != c.DESTROYED) {
                                    if (com.applovin.impl.sdk.n.a()) {
                                        com.applovin.impl.sdk.n nVar4 = this.logger;
                                        String str4 = this.tag;
                                        nVar4.b(str4, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z10 = true;
                        } else if (cVar2 == c.DESTROYED) {
                            com.applovin.impl.sdk.n.h(this.tag, "No operations are allowed on a destroyed instance");
                        } else if (com.applovin.impl.sdk.n.a()) {
                            com.applovin.impl.sdk.n nVar5 = this.logger;
                            String str5 = this.tag;
                            nVar5.b(str5, "Unknown state: " + this.f7622g);
                        }
                        z10 = false;
                    }
                }
            }
            if (z10) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar6 = this.logger;
                    String str6 = this.tag;
                    nVar6.a(str6, "Transitioning from " + this.f7622g + " to " + cVar + "...");
                }
                this.f7622g = cVar;
            } else if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar7 = this.logger;
                String str7 = this.tag;
                nVar7.k(str7, "Not allowed to transition from " + this.f7622g + " to " + cVar);
            }
        }
        if (z10) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((w2) maxAd);
        this.f7619d.a();
        a();
        this.sdk.S().a((u2) maxAd);
    }
}
