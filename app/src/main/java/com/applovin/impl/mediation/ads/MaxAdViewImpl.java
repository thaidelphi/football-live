package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.d7;
import com.applovin.impl.f;
import com.applovin.impl.j3;
import com.applovin.impl.k6;
import com.applovin.impl.l0;
import com.applovin.impl.l2;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u2;
import com.applovin.impl.u5;
import com.applovin.impl.u7;
import com.applovin.impl.v2;
import com.applovin.impl.v7;
import com.applovin.impl.w7;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements f.a, w7.a, f.b {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private final Context f7586a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxAdView f7587b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7588c;

    /* renamed from: d  reason: collision with root package name */
    private final View f7589d;

    /* renamed from: e  reason: collision with root package name */
    private long f7590e;

    /* renamed from: f  reason: collision with root package name */
    private v2 f7591f;

    /* renamed from: g  reason: collision with root package name */
    private String f7592g;

    /* renamed from: h  reason: collision with root package name */
    private String f7593h;

    /* renamed from: i  reason: collision with root package name */
    private final b f7594i;

    /* renamed from: j  reason: collision with root package name */
    private final d f7595j;

    /* renamed from: k  reason: collision with root package name */
    private final com.applovin.impl.sdk.f f7596k;

    /* renamed from: l  reason: collision with root package name */
    private final v7 f7597l;

    /* renamed from: m  reason: collision with root package name */
    private final w7 f7598m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f7599n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f7600o;

    /* renamed from: p  reason: collision with root package name */
    private v2 f7601p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f7602q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7603r;

    /* renamed from: s  reason: collision with root package name */
    private final AtomicBoolean f7604s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f7605t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f7606u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f7607v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f7608w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f7609x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f7610y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f7611z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                nVar2.a(str2, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            l2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    nVar2.a(str, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.P().destroyAd(maxAd);
                return;
            }
            v2 v2Var = (v2) maxAd;
            v2Var.g(MaxAdViewImpl.this.f7592g);
            v2Var.f(MaxAdViewImpl.this.f7593h);
            if (v2Var.y() != null) {
                if (v2Var.w0()) {
                    long r02 = v2Var.r0();
                    MaxAdViewImpl.this.sdk.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n I = MaxAdViewImpl.this.sdk.I();
                        String str2 = MaxAdViewImpl.this.tag;
                        I.a(str2, "Scheduling banner ad refresh " + r02 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                    }
                    MaxAdViewImpl.this.f7596k.a(r02);
                    if (MaxAdViewImpl.this.f7596k.g() || MaxAdViewImpl.this.f7603r) {
                        com.applovin.impl.sdk.n nVar3 = MaxAdViewImpl.this.logger;
                        if (com.applovin.impl.sdk.n.a()) {
                            MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                            maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.f7596k.j();
                    }
                }
                com.applovin.impl.sdk.n nVar4 = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    com.applovin.impl.sdk.n nVar5 = maxAdViewImpl3.logger;
                    String str3 = maxAdViewImpl3.tag;
                    nVar5.a(str3, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                l2.f(MaxAdViewImpl.this.adListener, maxAd, true);
                MaxAdViewImpl.this.d(v2Var);
                return;
            }
            MaxAdViewImpl.this.sdk.P().destroyAd(v2Var);
            onAdLoadFailed(v2Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0126a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f7613a;

        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7601p)) {
                com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    nVar2.a(str, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                l2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7601p)) {
                if ((MaxAdViewImpl.this.f7601p.x0() || MaxAdViewImpl.this.f7610y) && this.f7613a) {
                    this.f7613a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    nVar2.a(str, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                l2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f7601p)) {
                com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    nVar2.a(str, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                l2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7601p)) {
                com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    nVar2.a(str, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                l2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7601p)) {
                if ((MaxAdViewImpl.this.f7601p.x0() || MaxAdViewImpl.this.f7610y) && !MaxAdViewImpl.this.f7596k.g()) {
                    this.f7613a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    nVar2.a(str, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                l2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7601p)) {
                com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    nVar2.a(str, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                l2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                nVar2.a(str2, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            l2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                String str = maxAdViewImpl.tag;
                nVar2.a(str, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            l2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                nVar2.a(str2, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f7606u) {
                com.applovin.impl.sdk.n nVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    com.applovin.impl.sdk.n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    nVar2.a(str, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.P().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.sdk.n nVar3 = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Successfully precached ad for refresh");
            }
            if (!((Boolean) MaxAdViewImpl.this.sdk.a(j3.W6)).booleanValue()) {
                MaxAdViewImpl.this.a(maxAd);
            } else {
                MaxAdViewImpl.this.b(maxAd);
            }
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, com.applovin.impl.sdk.j jVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", jVar);
        this.f7588c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f7590e = Long.MAX_VALUE;
        this.f7599n = new Object();
        this.f7600o = new Object();
        this.f7601p = null;
        this.f7604s = new AtomicBoolean();
        this.f7606u = false;
        if (context != null) {
            this.f7586a = context.getApplicationContext();
            this.f7587b = maxAdView;
            this.f7589d = view;
            this.f7594i = new b();
            this.f7595j = new d();
            this.f7596k = new com.applovin.impl.sdk.f(jVar, this);
            this.f7597l = new v7(maxAdView, jVar);
            this.f7598m = new w7(maxAdView, jVar, this);
            jVar.i().a(this);
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str2 = this.tag;
                nVar.a(str2, "Created new MaxAdView (" + this + ")");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        g();
        if (this.f7591f != null) {
            this.sdk.P().destroyAd(this.f7591f);
        }
        synchronized (this.f7599n) {
            this.f7606u = true;
        }
        this.f7596k.a();
        this.sdk.i().b(this);
        this.sdk.J().c(this.adUnitId, this.f7588c);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f7592g;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(j3.W6)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.f.b
    public void onCreativeIdGenerated(String str, String str2) {
        v2 v2Var = this.f7601p;
        if (v2Var != null && v2Var.S().equalsIgnoreCase(str)) {
            this.f7601p.h(str2);
            l2.b(this.adReviewListener, str2, this.f7601p);
            return;
        }
        v2 v2Var2 = this.f7591f;
        if (v2Var2 == null || !v2Var2.S().equalsIgnoreCase(str)) {
            return;
        }
        this.f7591f.h(str2);
    }

    @Override // com.applovin.impl.w7.a
    public void onLogVisibilityImpression() {
        a(this.f7601p, this.f7597l.a(this.f7601p));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(j3.T6)).booleanValue() && this.f7596k.h()) {
            if (u7.b(i10)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f7596k.d();
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Ad view hidden");
            }
            this.f7596k.c();
        }
    }

    public void setCustomData(String str) {
        if (this.f7601p != null && com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str2 = this.tag;
            nVar.k(str2, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        d7.b(str, this.tag);
        this.f7593h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f7601p != null && com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str2 = this.tag;
            nVar.k(str2, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.f7592g = str;
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f7590e = i10;
    }

    public void startAutoRefresh() {
        this.f7603r = false;
        if (this.f7596k.g()) {
            this.f7596k.m();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str = this.tag;
                nVar.a(str, "Resumed auto-refresh with remaining time: " + this.f7596k.b() + "ms");
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
        }
    }

    public void stopAutoRefresh() {
        if (this.f7601p != null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str = this.tag;
                nVar.a(str, "Pausing auto-refresh with remaining time: " + this.f7596k.b() + "ms");
            }
            this.f7596k.j();
        } else if (!this.f7607v && !((Boolean) this.sdk.a(j3.V6)).booleanValue()) {
            com.applovin.impl.sdk.n.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        } else {
            this.f7603r = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f7587b) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", isDestroyed=");
        sb.append(a());
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(d.b.SEQUENTIAL_OR_PRECACHE, this.f7595j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final v2 v2Var) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.e
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdViewImpl.this.b(v2Var);
            }
        });
    }

    private void e() {
        this.f7604s.set(false);
        if (this.f7591f != null) {
            h();
        } else if (b()) {
            if (this.f7602q) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                }
                loadAd(d.b.REFRESH);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f7604s.set(true);
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(d.b.REFRESH);
        }
    }

    private void f() {
        boolean z10;
        boolean z11;
        synchronized (this.f7600o) {
            z10 = false;
            this.f7604s.set(false);
            z11 = this.f7591f != null;
            if (!z11) {
                if (b()) {
                    if (this.f7602q) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                        }
                    } else {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                        }
                        this.f7604s.set(true);
                    }
                } else if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Refreshing ad from network...");
                }
                z10 = true;
            }
        }
        if (z11) {
            h();
        } else if (z10) {
            loadAd(d.b.REFRESH);
        }
    }

    private void g() {
        v2 v2Var;
        MaxAdView maxAdView = this.f7587b;
        if (maxAdView != null) {
            com.applovin.impl.o.a(maxAdView, this.f7589d);
        }
        this.f7598m.b();
        synchronized (this.f7599n) {
            v2Var = this.f7601p;
        }
        if (v2Var != null) {
            this.sdk.P().destroyAd(v2Var);
        }
    }

    private void h() {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str = this.tag;
            nVar.a(str, "Rendering for cached ad: " + this.f7591f + "...");
        }
        this.f7594i.onAdLoaded(this.f7591f);
        this.f7591f = null;
    }

    public void loadAd(d.b bVar) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str = this.tag;
            nVar.a(str, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z10 = this.f7607v || ((Boolean) this.sdk.a(j3.V6)).booleanValue();
        if (z10 && !this.f7596k.g() && this.f7596k.h()) {
            String str2 = this.tag;
            com.applovin.impl.sdk.n.h(str2, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f7596k.b()) + " seconds.");
        } else if (z10) {
            if (this.f7591f != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Rendering cached ad");
                }
                h();
            } else if (this.f7605t) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Waiting for precache ad to load to render");
                }
                this.f7604s.set(true);
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Loading ad...");
                }
                a(bVar, this.f7594i);
            }
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(bVar, this.f7594i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final v2 v2Var) {
        View y10 = v2Var.y();
        String str = y10 == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f7587b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str2 = this.tag;
                nVar.a(str2, "MaxAdListener.onAdDisplayFailed(ad=" + v2Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            l2.a(this.adListener, (MaxAd) v2Var, (MaxError) maxErrorImpl, true);
            this.sdk.P().processAdDisplayErrorPostbackForUserError(maxErrorImpl, v2Var);
            return;
        }
        g();
        a((u2) v2Var);
        if (v2Var.q0()) {
            this.f7598m.a(v2Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (v2Var.s0() != Long.MAX_VALUE) {
            this.f7589d.setBackgroundColor((int) v2Var.s0());
        } else {
            long j10 = this.f7590e;
            if (j10 != Long.MAX_VALUE) {
                this.f7589d.setBackgroundColor((int) j10);
            } else {
                this.f7589d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(y10);
        a(y10, v2Var);
        this.sdk.v().d(v2Var);
        c(v2Var);
        synchronized (this.f7599n) {
            this.f7601p = v2Var;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.P().processRawAdImpression(v2Var, this.f7594i);
        if (StringUtils.isValidString(this.f7601p.getAdReviewCreativeId())) {
            l2.a(this.adReviewListener, this.f7601p.getAdReviewCreativeId(), (MaxAd) this.f7601p, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.f
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdViewImpl.this.a(v2Var);
            }
        }, v2Var.u0());
    }

    private void d() {
        if (b()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f7605t = true;
            this.sdk.i0().a((z4) new k6(this.sdk, "loadMaxAdForPrecacheRequest", new Runnable() { // from class: com.applovin.impl.mediation.ads.c
                @Override // java.lang.Runnable
                public final void run() {
                    MaxAdViewImpl.this.c();
                }
            }), u5.b.MEDIATION);
        }
    }

    private void c(v2 v2Var) {
        int height = this.f7587b.getHeight();
        int width = this.f7587b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.f7586a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f7586a, width);
            MaxAdFormat format = v2Var.getFormat();
            int height2 = (this.A ? format.getAdaptiveSize(pxToDp2, this.f7587b.getContext()) : format.getSize()).getHeight();
            int min = Math.min(format.getSize().getWidth(), l0.b(this.f7586a).x);
            if (pxToDp < height2 || pxToDp2 < min) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n**************************************************\n`MaxAdView` size ");
                sb.append(pxToDp2);
                sb.append("x");
                sb.append(pxToDp);
                sb.append(" dp smaller than required ");
                sb.append(this.A ? "adaptive " : "");
                sb.append("size: ");
                sb.append(min);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String sb2 = sb.toString();
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.b("AppLovinSdk", sb2);
                }
            }
        }
    }

    private void a(final d.b bVar, final a.InterfaceC0126a interfaceC0126a) {
        if (a()) {
            boolean c10 = d7.c(this.sdk);
            this.sdk.D().a(y1.f9677l0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + c10));
            if (!c10) {
                com.applovin.impl.sdk.n.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            }
            throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.d
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdViewImpl.this.a(interfaceC0126a, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a.InterfaceC0126a interfaceC0126a, d.b bVar) {
        v2 v2Var = this.f7601p;
        if (v2Var != null) {
            long a10 = this.f7597l.a(v2Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f7601p.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(a10));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f7587b.getContext(), this.f7587b.getWidth());
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f7587b.getContext(), this.f7587b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f7596k.g() || this.f7603r));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f7608w));
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str = this.tag;
            nVar.a(str, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0126a + "...");
        }
        this.sdk.P().loadAd(this.adUnitId, this.f7588c, this.adFormat, bVar, this.localExtraParameters, this.extraParameters, this.f7586a, interfaceC0126a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str3 = this.tag;
                nVar.a(str3, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f7607v = Boolean.parseBoolean(str2);
        } else if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.logger;
                String str4 = this.tag;
                nVar2.a(str4, "Updated disable auto-retries to: " + str2);
            }
            this.f7608w = Boolean.parseBoolean(str2);
        } else if ("disable_precache".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar3 = this.logger;
                String str5 = this.tag;
                nVar3.a(str5, "Updated precached disabled to: " + str2);
            }
            this.f7609x = Boolean.parseBoolean(str2);
        } else if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar4 = this.logger;
                String str6 = this.tag;
                nVar4.a(str6, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.f7610y = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar5 = this.logger;
                String str7 = this.tag;
                nVar5.a(str7, "Updated force precache to: " + str2);
            }
            this.f7611z = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar6 = this.logger;
                String str8 = this.tag;
                nVar6.a(str8, "Updated is adaptive banner to: " + str2);
            }
            this.A = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean compareAndSet;
        this.f7605t = false;
        synchronized (this.f7600o) {
            compareAndSet = this.f7604s.compareAndSet(true, false);
            if (!compareAndSet) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Saving precache ad...");
                }
                v2 v2Var = (v2) maxAd;
                this.f7591f = v2Var;
                v2Var.g(this.f7592g);
                this.f7591f.f(this.f7593h);
            }
        }
        if (compareAndSet) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str = this.tag;
                nVar.a(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f7594i.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(v2 v2Var) {
        long a10 = this.f7597l.a(v2Var);
        if (!v2Var.q0()) {
            a(v2Var, a10);
        }
        a(a10);
    }

    private boolean b() {
        if (this.f7609x) {
            return false;
        }
        return ((Boolean) this.sdk.a(j3.f7300b7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str = this.tag;
                nVar.a(str, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
            }
        } else if (this.sdk.c(j3.P6).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.sdk.I();
                String str2 = this.tag;
                I.a(str2, "Ignoring banner ad refresh for error code " + maxError.getCode());
            }
        } else if (!this.f7603r && !this.f7596k.g()) {
            this.f7602q = true;
            this.f7605t = false;
            long longValue = ((Long) this.sdk.a(j3.O6)).longValue();
            if (longValue >= 0) {
                this.sdk.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I2 = this.sdk.I();
                    String str3 = this.tag;
                    I2.a(str3, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f7596k.a(longValue);
            }
        } else {
            if (this.f7605t) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
                }
                this.f7605t = false;
            }
            if (this.f7604s.get()) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar2 = this.logger;
                    String str4 = this.tag;
                    nVar2.a(str4, "Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
                }
                l2.a(this.adListener, this.adUnitId, maxError, true);
            }
        }
    }

    private void a(View view, v2 v2Var) {
        int v02 = v2Var.v0();
        int t02 = v2Var.t0();
        int dpToPx = v02 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), v02);
        int dpToPx2 = t02 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), t02) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx2);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = dpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + dpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i10 : u7.a(this.f7587b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i10);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(v2 v2Var, long j10) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.P().processViewabilityAdImpressionPostback(v2Var, j10, this.f7594i);
    }

    private void a(long j10) {
        if (d7.a(j10, ((Long) this.sdk.a(j3.f7299a7)).longValue()) && !this.f7611z) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str = this.tag;
                nVar.a(str, "Undesired flags matched - current: " + Long.toBinaryString(j10) + ", undesired: " + Long.toBinaryString(j10));
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f7602q = true;
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f7602q = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f7605t = false;
        if (this.f7604s.compareAndSet(true, false)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.logger;
                String str = this.tag;
                nVar.a(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f7594i.onAdLoaded(maxAd);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        v2 v2Var = (v2) maxAd;
        this.f7591f = v2Var;
        v2Var.g(this.f7592g);
        this.f7591f.f(this.f7593h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z10;
        synchronized (this.f7599n) {
            z10 = this.f7606u;
        }
        return z10;
    }
}
