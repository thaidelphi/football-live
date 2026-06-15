package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.b2;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b2 {

    /* renamed from: b  reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f6677b;

    /* renamed from: c  reason: collision with root package name */
    protected final AppLovinAdServiceImpl f6678c;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinAd f6679d;

    /* renamed from: e  reason: collision with root package name */
    private String f6680e;

    /* renamed from: f  reason: collision with root package name */
    private SoftReference f6681f;

    /* renamed from: h  reason: collision with root package name */
    private volatile String f6683h;

    /* renamed from: j  reason: collision with root package name */
    private volatile double f6685j;

    /* renamed from: a  reason: collision with root package name */
    public final Map f6676a = Collections.synchronizedMap(new HashMap());

    /* renamed from: g  reason: collision with root package name */
    private final Object f6682g = new Object();

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f6684i = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements AppLovinAdRewardListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            b2.this.f6677b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = b2.this.f6677b.I();
                I.b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            b2.this.f6677b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = b2.this.f6677b.I();
                I.b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            b2.this.f6677b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = b2.this.f6677b.I();
                I.a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            b2.this.f6677b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = b2.this.f6677b.I();
                I.b("IncentivizedAdController", "Reward validation failed: " + i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements f2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinAd f6689a;

        /* renamed from: b  reason: collision with root package name */
        private final AppLovinAdDisplayListener f6690b;

        /* renamed from: c  reason: collision with root package name */
        private final AppLovinAdClickListener f6691c;

        /* renamed from: d  reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f6692d;

        /* renamed from: e  reason: collision with root package name */
        private final AppLovinAdRewardListener f6693e;

        /* synthetic */ c(b2 b2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar) {
            int i10;
            String str;
            b2.this.f6677b.I();
            if (com.applovin.impl.sdk.n.a()) {
                b2.this.f6677b.I().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String b10 = b2.this.b();
            if (!StringUtils.isValidString(b10) || !b2.this.f6684i) {
                b2.this.f6677b.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I = b2.this.f6677b.I();
                    I.b("IncentivizedAdController", "Invalid reward state - result: " + b10 + " and wasFullyEngaged: " + b2.this.f6684i);
                }
                b2.this.f6677b.I();
                if (com.applovin.impl.sdk.n.a()) {
                    b2.this.f6677b.I().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.c();
                if (b2.this.f6684i) {
                    b2.this.f6677b.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        b2.this.f6677b.I().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    b2.this.f6677b.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        b2.this.f6677b.I().b("IncentivizedAdController", "User close the ad prematurely");
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                bVar.a(e4.a(str));
                b2.this.f6677b.I();
                if (com.applovin.impl.sdk.n.a()) {
                    b2.this.f6677b.I().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                l2.a(this.f6693e, bVar, i10);
                b2.this.f6677b.D().a(y1.f9692t, bVar, CollectionUtils.hashMap("error_message", str + ", Percentage Watched: " + b2.this.f6685j));
            }
            if (bVar.D0().getAndSet(true)) {
                return;
            }
            b2.this.f6677b.I();
            if (com.applovin.impl.sdk.n.a()) {
                b2.this.f6677b.I().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            b2.this.f6677b.i0().a((z4) new f6(bVar, b2.this.f6677b), u5.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            l2.a(this.f6691c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            l2.a(this.f6690b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd f10 = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (f10 instanceof com.applovin.impl.sdk.ad.b) {
                a((com.applovin.impl.sdk.ad.b) f10);
            } else {
                if (f10 == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + f10;
                }
                b2.this.f6677b.I();
                if (com.applovin.impl.sdk.n.a()) {
                    b2.this.f6677b.I().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            b2.this.a(f10);
            b2.this.f6677b.I();
            if (com.applovin.impl.sdk.n.a()) {
                b2.this.f6677b.I().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            l2.b(this.f6690b, appLovinAd);
        }

        @Override // com.applovin.impl.f2
        public void onAdDisplayFailed(String str) {
            String str2;
            AppLovinAd appLovinAd = this.f6689a;
            if (appLovinAd instanceof com.applovin.impl.sdk.ad.c) {
                appLovinAd = ((com.applovin.impl.sdk.ad.c) appLovinAd).f();
            }
            boolean z10 = this.f6690b instanceof f2;
            if (appLovinAd instanceof com.applovin.impl.sdk.ad.b) {
                a(appLovinAd);
            } else {
                if (appLovinAd == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + appLovinAd;
                }
                b2.this.f6677b.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I = b2.this.f6677b.I();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received `");
                    sb.append(z10 ? "adDisplayFailed" : "adHidden");
                    sb.append("` callback for ");
                    sb.append(str2);
                    I.b("IncentivizedAdController", sb.toString());
                }
            }
            b2.this.a(appLovinAd);
            if (z10) {
                l2.a(this.f6690b, str);
            } else {
                l2.b(this.f6690b, this.f6689a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            b2.this.a("quota_exceeded");
            l2.b(this.f6693e, appLovinAd, map);
            b2.this.f6677b.D().a(y1.f9690s, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            b2.this.a("rejected");
            l2.a(this.f6693e, appLovinAd, map);
            b2.this.f6677b.D().a(y1.f9690s, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            b2.this.a("accepted");
            l2.c(this.f6693e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            b2.this.a("network_timeout");
            l2.a(this.f6693e, appLovinAd, i10);
            b2.this.f6677b.D().a(y1.f9690s, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "network_timeout"));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            l2.a(this.f6692d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            l2.a(this.f6692d, appLovinAd, d10, z10);
            b2.this.f6685j = d10;
            b2.this.f6684i = z10;
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f6689a = appLovinAd;
            this.f6690b = appLovinAdDisplayListener;
            this.f6691c = appLovinAdClickListener;
            this.f6692d = appLovinAdVideoPlaybackListener;
            this.f6693e = appLovinAdRewardListener;
        }
    }

    public b2(String str, AppLovinSdk appLovinSdk) {
        this.f6677b = appLovinSdk.a();
        this.f6678c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f6680e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f6681f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public boolean d() {
        return this.f6679d != null;
    }

    public String c() {
        return this.f6680e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements AppLovinAdLoadListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinAdLoadListener f6687a;

        b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f6687a = appLovinAdLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f6687a.adReceived(appLovinAd);
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                b2.this.f6677b.D().a("IncentivizedAdController", "adLoaded", th);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            b2.this.f6679d = appLovinAd;
            if (this.f6687a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.s8
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.b.this.a(appLovinAd);
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i10) {
            if (this.f6687a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.r8
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.b.this.a(i10);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            try {
                this.f6687a.failedToReceiveAd(i10);
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                b2.this.f6677b.D().a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f6677b.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f6677b.I().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f6681f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f6679d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f6678c.loadNextIncentivizedAd(this.f6680e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f6679d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        com.applovin.impl.sdk.n.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        e();
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, iVar, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.f6682g) {
            str = this.f6683h;
        }
        return str;
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f6679d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, iVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        com.applovin.impl.sdk.n.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        e();
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f6677b.i0().a((z4) new l6(bVar, appLovinAdRewardListener, this.f6677b), u5.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f6682g) {
            this.f6683h = str;
        }
    }

    public void a(String str, Object obj) {
        this.f6676a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a10 = d7.a(appLovinAdImpl, this.f6677b);
        String a11 = a(a10, appLovinAdImpl);
        if (StringUtils.isValidString(a11)) {
            a(appLovinAdImpl, a11, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f6677b.q0(), context);
        for (String str : this.f6676a.keySet()) {
            create.setExtraInfo(str, this.f6676a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a10);
        a((com.applovin.impl.sdk.ad.b) a10, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, androidx.lifecycle.i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a10 = d7.a(appLovinAdImpl, this.f6677b);
        String a11 = a(a10, appLovinAdImpl);
        if (StringUtils.isValidString(a11)) {
            a(appLovinAdImpl, a11, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f6677b.q0(), context);
        for (String str : this.f6676a.keySet()) {
            create.setExtraInfo(str, this.f6676a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a10, viewGroup, iVar);
        a((com.applovin.impl.sdk.ad.b) a10, cVar);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        } else if (appLovinAd2.getType() != AppLovinAdType.INCENTIVIZED) {
            com.applovin.impl.sdk.n.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
            return "Attempting to display ad with invalid ad type";
        } else {
            return null;
        }
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, f2 f2Var) {
        this.f6677b.C().c(v1.f9441o);
        l2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        l2.a(f2Var, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f6679d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.f6679d = null;
                return;
            }
            return;
        }
        com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
        if (cVar.f() == null || appLovinAd == cVar.f()) {
            this.f6679d = null;
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
