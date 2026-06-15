package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.d7;
import com.applovin.impl.f;
import com.applovin.impl.j3;
import com.applovin.impl.k6;
import com.applovin.impl.l0;
import com.applovin.impl.l2;
import com.applovin.impl.m1;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u2;
import com.applovin.impl.u5;
import com.applovin.impl.x2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0134a, f.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* renamed from: a  reason: collision with root package name */
    private final c f7639a;

    /* renamed from: b  reason: collision with root package name */
    private String f7640b;

    /* renamed from: c  reason: collision with root package name */
    private String f7641c;

    /* renamed from: d  reason: collision with root package name */
    private d.b f7642d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f7643e;

    /* renamed from: f  reason: collision with root package name */
    private MaxNativeAdListener f7644f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f7645g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f7646h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f7647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f7648b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f7649c;

        a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f7647a = maxNativeAd;
            this.f7648b = list;
            this.f7649c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7647a.prepareForInteraction(this.f7648b, this.f7649c)) {
                return;
            }
            com.applovin.impl.sdk.n.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f7651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x2 f7652b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f7653c;

        b(MaxNativeAdView maxNativeAdView, x2 x2Var, MaxNativeAd maxNativeAd) {
            this.f7651a = maxNativeAdView;
            this.f7652b = x2Var;
            this.f7653c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.sdk.n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxNativeAdLoaderImpl.logger;
                String str = maxNativeAdLoaderImpl.tag;
                nVar2.a(str, "Rendering native ad view: " + this.f7651a);
            }
            MaxNativeAdLoaderImpl.this.sdk.v().d(this.f7652b);
            this.f7651a.render(this.f7652b, MaxNativeAdLoaderImpl.this.f7639a, MaxNativeAdLoaderImpl.this.sdk);
            this.f7653c.setNativeAdView(this.f7651a);
            if (this.f7653c.prepareForInteraction(this.f7651a.getClickableViews(), this.f7651a)) {
                return;
            }
            this.f7653c.prepareViewForInteraction(this.f7651a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements a.InterfaceC0126a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            x2 x2Var = (x2) maxAd;
            x2Var.g(MaxNativeAdLoaderImpl.this.f7640b);
            x2Var.f(MaxNativeAdLoaderImpl.this.f7641c);
            synchronized (MaxNativeAdLoaderImpl.this.f7643e) {
                MaxNativeAdLoaderImpl.this.f7646h.add(x2Var);
            }
            MaxNativeAdView a10 = MaxNativeAdLoaderImpl.this.a(x2Var.N());
            if (a10 == null) {
                com.applovin.impl.sdk.n nVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No custom view provided, checking template");
                }
                String v02 = x2Var.v0();
                if (StringUtils.isValidString(v02)) {
                    com.applovin.impl.sdk.n nVar3 = MaxNativeAdLoaderImpl.this.logger;
                    if (com.applovin.impl.sdk.n.a()) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                        com.applovin.impl.sdk.n nVar4 = maxNativeAdLoaderImpl3.logger;
                        String str = maxNativeAdLoaderImpl3.tag;
                        nVar4.a(str, "Using template: " + v02 + "...");
                    }
                    a10 = new MaxNativeAdView(v02, com.applovin.impl.sdk.j.m());
                }
            }
            if (a10 == null) {
                com.applovin.impl.sdk.n nVar5 = MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                com.applovin.impl.sdk.n nVar6 = MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl5 = MaxNativeAdLoaderImpl.this;
                    com.applovin.impl.sdk.n nVar7 = maxNativeAdLoaderImpl5.logger;
                    String str2 = maxNativeAdLoaderImpl5.tag;
                    nVar7.a(str2, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f7644f);
                }
                l2.a(MaxNativeAdLoaderImpl.this.f7644f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(x2Var);
                return;
            }
            a(a10);
            MaxNativeAdLoaderImpl.this.a(a10, x2Var, x2Var.getNativeAd());
            com.applovin.impl.sdk.n nVar8 = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl6 = MaxNativeAdLoaderImpl.this;
                com.applovin.impl.sdk.n nVar9 = maxNativeAdLoaderImpl6.logger;
                String str3 = maxNativeAdLoaderImpl6.tag;
                nVar9.a(str3, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + a10 + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f7644f);
            }
            l2.a(MaxNativeAdLoaderImpl.this.f7644f, a10, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(x2Var);
            MaxNativeAdLoaderImpl.this.a(a10);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxNativeAdLoaderImpl.logger;
                String str = maxNativeAdLoaderImpl.tag;
                nVar2.a(str, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f7644f);
            }
            l2.a(MaxNativeAdLoaderImpl.this.f7644f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            com.applovin.impl.sdk.n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxNativeAdLoaderImpl.logger;
                String str2 = maxNativeAdLoaderImpl.tag;
                nVar2.a(str2, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f7644f);
            }
            l2.a(MaxNativeAdLoaderImpl.this.f7644f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.t
                @Override // java.lang.Runnable
                public final void run() {
                    MaxNativeAdLoaderImpl.c.this.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                com.applovin.impl.sdk.n nVar2 = maxNativeAdLoaderImpl.logger;
                String str = maxNativeAdLoaderImpl.tag;
                nVar2.a(str, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            l2.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            x2 b10;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (b10 = adViewTracker.b()) == null) {
                return;
            }
            com.applovin.impl.sdk.n nVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(b10);
        }
    }

    public MaxNativeAdLoaderImpl(String str, com.applovin.impl.sdk.j jVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", jVar);
        this.f7639a = new c(this, null);
        this.f7642d = d.b.PUBLISHER_INITIATED;
        this.f7643e = new Object();
        this.f7645g = new HashMap();
        this.f7646h = new HashSet();
        jVar.i().a(this);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str2 = this.tag;
            nVar.a(str2, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f7644f = null;
        this.sdk.i().b(this);
        synchronized (this.f7643e) {
            this.f7645g.clear();
            this.f7646h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.f7640b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((x2) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
                return;
            }
            return;
        }
        adViewTracker.c();
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str = this.tag;
            nVar.a(str, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f7639a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.P().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f7642d, this.localExtraParameters, this.extraParameters, com.applovin.impl.sdk.j.m(), this.f7639a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0134a
    public void onAdExpired(m1 m1Var) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str = this.tag;
            nVar.a(str, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar2 = this.logger;
            String str2 = this.tag;
            nVar2.a(str2, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + m1Var + "), listener=" + this.f7644f);
        }
        l2.b(this.f7644f, (MaxAd) ((x2) m1Var), true);
    }

    @Override // com.applovin.impl.f.b
    public void onCreativeIdGenerated(String str, String str2) {
        x2 x2Var;
        Iterator it = this.f7646h.iterator();
        while (true) {
            if (!it.hasNext()) {
                x2Var = null;
                break;
            }
            x2Var = (x2) it.next();
            if (x2Var.S().equalsIgnoreCase(str)) {
                break;
            }
        }
        if (x2Var != null) {
            x2Var.h(str2);
            l2.b(this.adReviewListener, str2, x2Var);
            synchronized (this.f7643e) {
                this.f7646h.remove(x2Var);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        x2 x2Var = (x2) maxAd;
        MaxNativeAd nativeAd = x2Var.getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        x2Var.a(viewGroup);
        this.sdk.v().d(x2Var);
        a((u2) x2Var);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(x2Var, viewGroup, this.f7639a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.i0().a((z4) new k6(this.sdk, "renderMaxNativeAd", aVar), u5.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof x2)) {
            com.applovin.impl.sdk.n.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        } else if (maxNativeAdView == null) {
            com.applovin.impl.sdk.n.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        } else {
            x2 x2Var = (x2) maxAd;
            MaxNativeAd nativeAd = x2Var.getNativeAd();
            if (nativeAd == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                }
                return false;
            } else if (nativeAd.isExpired() && !((Boolean) this.sdk.a(j3.f7306h7)).booleanValue()) {
                com.applovin.impl.sdk.n.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
                return false;
            } else {
                a(maxNativeAdView, x2Var, nativeAd);
                a(maxNativeAdView);
                return true;
            }
        }
    }

    public void setCustomData(String str) {
        d7.b(str, this.tag);
        this.f7641c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof d.b)) {
            this.f7642d = (d.b) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.logger;
            String str = this.tag;
            nVar.a(str, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f7644f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f7640b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f7644f + ", revenueListener=" + this.revenueListener + '}';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x2 x2Var) {
        if (x2Var.u0().get()) {
            return;
        }
        this.sdk.f().a(x2Var, this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f7643e) {
            this.f7645g.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof x2) {
            x2 x2Var = (x2) maxAd;
            if (x2Var.y0()) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.logger;
                    String str = this.tag;
                    nVar.a(str, "Native ad (" + x2Var + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.f7643e) {
                this.f7646h.remove(x2Var);
            }
            MaxNativeAdView s02 = x2Var.s0();
            if (s02 != null && (adViewTracker = s02.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                s02.recycle();
            }
            MaxNativeAd nativeAd = x2Var.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(x2Var);
            this.sdk.P().destroyAd(x2Var);
            this.sdk.J().c(this.adUnitId, x2Var.N());
        } else if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar2 = this.logger;
            String str2 = this.tag;
            nVar2.a(str2, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f7643e) {
            maxNativeAdView = (MaxNativeAdView) this.f7645g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView, x2 x2Var, MaxNativeAd maxNativeAd) {
        x2Var.a(maxNativeAdView);
        a((u2) x2Var);
        b bVar = new b(maxNativeAdView, x2Var, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.i0().a((z4) new k6(this.sdk, "renderMaxNativeAd", bVar), u5.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (l0.e()) {
                if (maxNativeAdView.isAttachedToWindow()) {
                    adViewTracker.c();
                }
            } else if (maxNativeAdView.getParent() != null) {
                adViewTracker.c();
            }
        }
    }
}
