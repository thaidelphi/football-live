package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.b7;
import com.applovin.impl.d7;
import com.applovin.impl.g;
import com.applovin.impl.g2;
import com.applovin.impl.l2;
import com.applovin.impl.m1;
import com.applovin.impl.o4;
import com.applovin.impl.p1;
import com.applovin.impl.p5;
import com.applovin.impl.q4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.impl.u7;
import com.applovin.impl.v5;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, a.InterfaceC0134a {

    /* renamed from: a  reason: collision with root package name */
    private final j f8642a;

    /* renamed from: b  reason: collision with root package name */
    private final n f8643b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f8644c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8645d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Map f8646e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference f8647f = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements ArrayService.DirectDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p1 f8648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f8649b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Uri f8650c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f8651d;

        a(p1 p1Var, com.applovin.impl.sdk.ad.b bVar, Uri uri, Context context) {
            this.f8648a = p1Var;
            this.f8649b = bVar;
            this.f8650c = uri;
            this.f8651d = context;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onEvent(String str, Bundle bundle) {
            if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN.equals(str)) {
                AppLovinAdServiceImpl.this.f8642a.e0().pauseForClick();
            } else if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str)) {
                AppLovinAdServiceImpl.this.f8642a.e0().resumeForClick();
            }
            if (this.f8648a != null) {
                this.f8648a.c(AppLovinAdServiceImpl.this.f8642a.n().getJavaScript(str, bundle));
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            n unused = AppLovinAdServiceImpl.this.f8643b;
            if (n.a()) {
                AppLovinAdServiceImpl.this.f8643b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f8649b, this.f8650c, this.f8648a, this.f8651d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements ArrayService.DirectDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f8653a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f8654b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppLovinAdView f8655c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Uri f8656d;

        b(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri) {
            this.f8653a = aVar;
            this.f8654b = bVar;
            this.f8655c = appLovinAdView;
            this.f8656d = uri;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onEvent(String str, Bundle bundle) {
            com.applovin.impl.adview.b f10;
            if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN.equals(str)) {
                AppLovinAdServiceImpl.this.f8642a.e0().pauseForClick();
                com.applovin.impl.adview.a aVar = this.f8653a;
                if (aVar != null) {
                    aVar.u();
                    l2.c(this.f8653a.e(), this.f8654b, this.f8655c);
                }
            } else if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str) && this.f8653a != null) {
                AppLovinAdServiceImpl.this.f8642a.e0().resumeForClick();
                l2.a(this.f8653a.e(), this.f8654b, this.f8655c);
            }
            com.applovin.impl.adview.a aVar2 = this.f8653a;
            if (aVar2 == null || (f10 = aVar2.f()) == null) {
                return;
            }
            f10.a(AppLovinAdServiceImpl.this.f8642a.n().getJavaScript(str, bundle));
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            n unused = AppLovinAdServiceImpl.this.f8643b;
            if (n.a()) {
                AppLovinAdServiceImpl.this.f8643b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f8654b, this.f8655c, this.f8653a, this.f8656d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements g2 {

        /* renamed from: a  reason: collision with root package name */
        private final d f8658a;

        /* synthetic */ c(AppLovinAdServiceImpl appLovinAdServiceImpl, d dVar, a aVar) {
            this(dVar);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f8642a.h().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f8642a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f8642a);
            }
            Collection<AppLovinAdLoadListener> emptySet = Collections.emptySet();
            synchronized (this.f8658a.f8660a) {
                if (!this.f8658a.f8662c) {
                    emptySet = new HashSet(this.f8658a.f8663d);
                    this.f8658a.f8663d.clear();
                }
                d dVar = this.f8658a;
                dVar.f8661b = false;
                dVar.f8662c = false;
            }
            for (AppLovinAdLoadListener appLovinAdLoadListener : emptySet) {
                AppLovinAdServiceImpl.this.a(appLovinAd, appLovinAdLoadListener);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            failedToReceiveAdV2(new AppLovinError(i10, ""));
        }

        @Override // com.applovin.impl.g2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection<AppLovinAdLoadListener> emptySet = Collections.emptySet();
            synchronized (this.f8658a.f8660a) {
                if (!this.f8658a.f8662c) {
                    emptySet = new HashSet(this.f8658a.f8663d);
                    this.f8658a.f8663d.clear();
                }
                d dVar = this.f8658a;
                dVar.f8661b = false;
                dVar.f8662c = false;
            }
            for (AppLovinAdLoadListener appLovinAdLoadListener : emptySet) {
                AppLovinAdServiceImpl.this.b(appLovinError, appLovinAdLoadListener);
            }
        }

        private c(d dVar) {
            this.f8658a = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLovinAdServiceImpl(j jVar) {
        this.f8642a = jVar;
        this.f8643b = jVar.I();
        HashMap hashMap = new HashMap(6);
        this.f8644c = hashMap;
        hashMap.put(com.applovin.impl.q.c(), new d(null));
        hashMap.put(com.applovin.impl.q.k(), new d(null));
        hashMap.put(com.applovin.impl.q.j(), new d(null));
        hashMap.put(com.applovin.impl.q.m(), new d(null));
        hashMap.put(com.applovin.impl.q.b(), new d(null));
        hashMap.put(com.applovin.impl.q.h(), new d(null));
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof g2) {
            ((g2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f8646e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (n.a()) {
            n nVar = this.f8643b;
            nVar.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f8642a.x().a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(com.applovin.impl.q qVar) {
        AppLovinAdImpl a10 = this.f8642a.h().a(qVar);
        if (n.a()) {
            n nVar = this.f8643b;
            nVar.a("AppLovinAdService", "Dequeued ad: " + a10 + " for zone: " + qVar + "...");
        }
        return a10;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f8647f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f8646e) {
            map = CollectionUtils.map(this.f8646e);
            this.f8646e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String D = this.f8642a.x().D();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (StringUtils.isValidString(D) && n.a()) {
            this.f8643b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return D;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.q.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, final AppLovinAdLoadListener appLovinAdLoadListener) {
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            n.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.g gVar = new com.applovin.impl.g(trim, this.f8642a);
        if (gVar.c() == g.a.REGULAR) {
            if (n.a()) {
                this.f8643b.a("AppLovinAdService", "Loading next ad for token: " + gVar);
            }
            a(new r5(gVar, appLovinAdLoadListener, this.f8642a));
        } else if (gVar.c() == g.a.AD_RESPONSE_JSON) {
            final JSONObject a10 = gVar.a();
            if (a10 != null) {
                com.applovin.impl.o0.c(a10, this.f8642a);
                com.applovin.impl.o0.b(a10, this.f8642a);
                com.applovin.impl.o0.a(a10, this.f8642a);
                com.applovin.impl.v.b(this.f8642a);
                if (JsonUtils.getJSONArray(a10, "ads", new JSONArray()).length() > 0) {
                    if (n.a()) {
                        this.f8643b.a("AppLovinAdService", "Rendering ad for token: " + gVar);
                    }
                    final com.applovin.impl.q a11 = d7.a(a10, this.f8642a);
                    MaxAdFormat d10 = a11.d();
                    if (((Boolean) this.f8642a.a(o4.X0)).booleanValue() && d10 != null && d10.isFullscreenAd()) {
                        this.f8642a.g().a(a11, new d.a() { // from class: com.applovin.impl.sdk.s
                            @Override // com.applovin.impl.sdk.d.a
                            public final void a(com.applovin.impl.sdk.ad.b bVar) {
                                AppLovinAdServiceImpl.this.a(appLovinAdLoadListener, a10, a11, bVar);
                            }
                        });
                        return;
                    } else {
                        a(new v5(a10, a11, appLovinAdLoadListener, this.f8642a));
                        return;
                    }
                }
                if (n.a()) {
                    this.f8643b.b("AppLovinAdService", "No ad returned from the server for token: " + gVar);
                }
                c(AppLovinError.NO_FILL, appLovinAdLoadListener);
                return;
            }
            String str2 = "Unable to retrieve ad response JSON from token: " + gVar.b();
            AppLovinError appLovinError = new AppLovinError(-8, str2);
            n.h("AppLovinAdService", str2);
            c(appLovinError, appLovinAdLoadListener);
        } else {
            AppLovinError appLovinError2 = new AppLovinError(-8, "Invalid token type");
            n.h("AppLovinAdService", "Invalid token type");
            c(appLovinError2, appLovinAdLoadListener);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!TextUtils.isEmpty(str)) {
            if (n.a()) {
                n nVar = this.f8643b;
                nVar.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
            }
            a(com.applovin.impl.q.a(str), appLovinAdLoadListener);
            return;
        }
        throw new IllegalArgumentException("No zone id specified");
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (n.a()) {
            n nVar = this.f8643b;
            nVar.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.q.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l10;
        if (((Boolean) this.f8642a.a(o4.f8101e2)).booleanValue() && (l10 = (Long) this.f8642a.b(q4.M)) != null && System.currentTimeMillis() - l10.longValue() <= ((Long) this.f8642a.a(o4.f8133i2)).longValue()) {
            if (((Boolean) this.f8642a.a(o4.f8125h2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (com.applovin.impl.e eVar : list) {
            a(eVar);
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0134a
    public void onAdExpired(m1 m1Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) m1Var;
        com.applovin.impl.q adZone = appLovinAdImpl.getAdZone();
        if (n.a()) {
            n nVar = this.f8643b;
            nVar.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f8642a.h().b(appLovinAdImpl);
        if (this.f8642a.y0() || !((Boolean) this.f8642a.a(o4.f8092d1)).booleanValue()) {
            return;
        }
        d a10 = a(adZone);
        synchronized (a10.f8660a) {
            if (!a10.f8661b) {
                this.f8642a.I();
                if (n.a()) {
                    n I = this.f8642a.I();
                    I.a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                }
                a10.f8661b = true;
                a10.f8662c = true;
                a(adZone, new c(this, a10, null));
            } else if (n.a()) {
                this.f8643b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f8647f.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f8644c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        if (bVar == null) {
            if (n.a()) {
                this.f8643b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (bundle != null && Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (n.a()) {
                this.f8643b.a("AppLovinAdService", "Skipping tracking for click on an ad...");
            }
        } else {
            if (n.a()) {
                this.f8643b.a("AppLovinAdService", "Tracking click on an ad...");
            }
            boolean z10 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.a(motionEvent, z10));
            if (this.f8642a.Y() != null) {
                this.f8642a.Y().b(bVar.d(motionEvent, false, z10), motionEvent);
            }
        }
        if (appLovinAdView != null && uri != null) {
            if (bVar.isDirectDownloadEnabled()) {
                this.f8642a.n().startDirectInstallOrDownloadProcess(bVar, bundle, new b(aVar, bVar, appLovinAdView, uri));
            } else {
                a(bVar, appLovinAdView, aVar, uri);
            }
        } else if (n.a()) {
            this.f8643b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, Bundle bundle, p1 p1Var, Context context) {
        if (bVar == null) {
            if (n.a()) {
                this.f8643b.b("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (bundle != null && Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (n.a()) {
                this.f8643b.a("AppLovinAdService", "Skipping tracking for VIDEO click on an ad...");
            }
        } else {
            if (n.a()) {
                this.f8643b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            boolean z10 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent, z10));
            if (this.f8642a.Y() != null) {
                this.f8642a.Y().b(bVar.d(motionEvent, true, z10), motionEvent);
            }
        }
        if (bVar.isDirectDownloadEnabled()) {
            this.f8642a.n().startDirectInstallOrDownloadProcess(bVar, bundle, new a(p1Var, bVar, uri, context));
        } else {
            a(bVar, uri, p1Var, context);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.t());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.u());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.v());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.w());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.y());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.z());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j10, List<Long> list, long j11, boolean z10, int i10) {
        if (bVar == null) {
            if (n.a()) {
                this.f8643b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.e> d10 = bVar.d();
        if (d10 != null && !d10.isEmpty()) {
            for (com.applovin.impl.e eVar : d10) {
                String a10 = a(eVar.c(), j10, j11, list, z10, i10);
                String a11 = a(eVar.a(), j10, j11, list, z10, i10);
                if (StringUtils.isValidString(a10)) {
                    a(new com.applovin.impl.e(a10, a11));
                } else if (n.a()) {
                    n nVar = this.f8643b;
                    nVar.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
                }
            }
        } else if (n.a()) {
            n nVar2 = this.f8643b;
            nVar2.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (n.a()) {
                this.f8643b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
                return;
            }
            return;
        }
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "Tracking impression on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.F());
        if (this.f8642a.Y() != null) {
            this.f8642a.Y().b(bVar.getPrivacySandboxImpressionAttributionUrls());
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j10, int i10, boolean z10) {
        if (bVar == null) {
            if (n.a()) {
                this.f8643b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.e> l02 = bVar.l0();
        if (l02 != null && !l02.isEmpty()) {
            String l10 = Long.toString(System.currentTimeMillis());
            for (com.applovin.impl.e eVar : l02) {
                if (StringUtils.isValidString(eVar.c())) {
                    String a10 = a(eVar.c(), j10, i10, l10, z10);
                    String a11 = a(eVar.a(), j10, i10, l10, z10);
                    if (a10 != null) {
                        a(new com.applovin.impl.e(a10, a11));
                    } else if (n.a()) {
                        n nVar = this.f8643b;
                        nVar.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
                    }
                } else if (n.a()) {
                    this.f8643b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
                }
            }
        } else if (n.a()) {
            n nVar2 = this.f8643b;
            nVar2.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinError appLovinError, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.v
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinAdServiceImpl.this.a(appLovinError, appLovinAdLoadListener);
            }
        });
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (n.a()) {
            n nVar = this.f8643b;
            nVar.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.q.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final Object f8660a;

        /* renamed from: b  reason: collision with root package name */
        boolean f8661b;

        /* renamed from: c  reason: collision with root package name */
        boolean f8662c;

        /* renamed from: d  reason: collision with root package name */
        final Collection f8663d;

        private d() {
            this.f8660a = new Object();
            this.f8663d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f8661b + ", isReloadingExpiredAd=" + this.f8662c + ", pendingAdListeners=" + this.f8663d + '}';
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f8642a.I();
            if (n.a()) {
                n I = this.f8642a.I();
                I.k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f8642a.D().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    private boolean b() {
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        Context m7 = j.m();
        ApplicationExitInfo applicationExitInfo = ((ActivityManager) m7.getSystemService("activity")).getHistoricalProcessExitReasons(m7.getPackageName(), 0, 1).get(0);
        return applicationExitInfo.getReason() == 10 || applicationExitInfo.getReason() == 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, com.applovin.impl.q qVar, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.x
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinAdLoadListener.this.adReceived(bVar);
                }
            });
        } else {
            a(new v5(jSONObject, qVar, appLovinAdLoadListener, this.f8642a));
        }
    }

    private void a(com.applovin.impl.q qVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (qVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f8642a.I();
            if (n.a()) {
                n I = this.f8642a.I();
                I.a("AppLovinAdService", "Loading next ad of zone {" + qVar + "}...");
            }
            d a10 = a(qVar);
            synchronized (a10.f8660a) {
                a10.f8663d.add(appLovinAdLoadListener);
                if (!a10.f8661b) {
                    a10.f8661b = true;
                    a(qVar, new c(this, a10, null));
                } else if (n.a()) {
                    this.f8643b.a("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(z4 z4Var) {
        if (!this.f8642a.s0()) {
            n.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f8642a.c();
        this.f8642a.i0().a(z4Var, u5.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.w
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinAdServiceImpl.this.a(appLovinAdLoadListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            n.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f8642a.D().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            n.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            StringBuilder sb = new StringBuilder();
            sb.append("notifyAdLoadFailedCallback");
            sb.append(appLovinAdLoadListener instanceof g2 ? "V2" : "");
            this.f8642a.D().a("AppLovinAdService", sb.toString(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, Uri uri, p1 p1Var, Context context) {
        if (a(uri.getScheme())) {
            a(uri, bVar, (com.applovin.impl.adview.a) null, p1Var);
        } else if (b7.b(uri)) {
            a(uri, bVar, (AppLovinAdView) null, (com.applovin.impl.adview.a) null, context, this.f8642a);
        } else {
            b7.a(uri, bVar, context, this.f8642a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (((Boolean) this.f8642a.a(o4.A)).booleanValue()) {
            context = u7.b(appLovinAdView, this.f8642a);
            if (context == null) {
                context = appLovinAdView.getContext();
            }
        } else {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (a(uri.getScheme())) {
            a(uri, bVar, aVar, (p1) null);
        } else if (b7.b(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f8642a);
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j10, int i10, String str2, boolean z10) {
        try {
            if (StringUtils.isValidString(str)) {
                return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j10)).appendQueryParameter("pv", Integer.toString((i10 < 0 || i10 > 100) ? 0 : 0)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
            }
            return null;
        } catch (Throwable th) {
            if (n.a()) {
                n nVar = this.f8643b;
                nVar.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f8642a.D().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (b7.a(uri, bVar, context, this.f8642a)) {
            l2.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.u();
    }

    private boolean a(String str) {
        String str2 = this.f8642a.f0().getExtraParameters().get("forwarding_click_scheme");
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.adview.a aVar, final p1 p1Var) {
        if (n.a()) {
            n nVar = this.f8643b;
            nVar.a("AppLovinAdService", "Forwarding click " + uri);
        }
        bVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f8642a.f0().getExtraParameters().get("close_ad_on_forwarding_click_scheme");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (p1Var != null) {
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLovinAdServiceImpl.this.a(p1Var);
                    }
                });
            } else if (aVar == null || d7.a(bVar.getSize())) {
            } else {
                if (n.a()) {
                    this.f8643b.a("AppLovinAdService", "Closing ad after forwarding click");
                }
                aVar.w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(p1 p1Var) {
        if (p1Var != null) {
            if (n.a()) {
                this.f8643b.a("AppLovinAdService", "Dismissing ad after forwarding click");
            }
            p1Var.c();
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, j jVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri b10 = b(uri, "primaryUrl");
            List a10 = a(uri, "primaryTrackingUrl");
            Uri b11 = b(uri, "fallbackUrl");
            List a11 = a(uri, "fallbackTrackingUrl");
            if (b10 == null && b11 == null) {
                jVar.I();
                if (n.a()) {
                    jVar.I().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(b10, "primary", a10, bVar, appLovinAdView, aVar, context, jVar)) {
                a(b11, "backup", a11, bVar, appLovinAdView, aVar, context, jVar);
            }
            if (aVar != null) {
                aVar.u();
                return;
            }
            return;
        }
        jVar.I();
        if (n.a()) {
            jVar.I().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, j jVar) {
        jVar.I();
        if (n.a()) {
            n I = jVar.I();
            I.a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean a10 = b7.a(uri, bVar, context, jVar);
        if (a10) {
            jVar.I();
            if (n.a()) {
                n I2 = jVar.I();
                I2.a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jVar.X().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                l2.b(aVar.e(), bVar, appLovinAdView);
            }
        } else {
            jVar.I();
            if (n.a()) {
                jVar.I().b("AppLovinAdService", "URL failed to open");
            }
        }
        return a10;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        for (String str2 : queryParameters) {
            try {
                arrayList.add(Uri.parse(str2));
            } catch (Throwable th) {
                this.f8642a.I();
                if (n.a()) {
                    n I = this.f8642a.I();
                    I.k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f8642a.D().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j10, long j11, List list, boolean z10, int i10) {
        if (StringUtils.isValidString(str)) {
            Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j10)).appendQueryParameter("vs_ms", Long.toString(j11));
            if (list != null && list.size() > 0) {
                appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
            }
            if (i10 != h.f8866h) {
                appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
                appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(h.a(i10)));
            }
            return appendQueryParameter.build().toString();
        }
        return null;
    }

    private void a() {
        Map<String, String> tryToStringMap;
        if (n.a()) {
            this.f8643b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f8642a.b(q4.P);
        if (TextUtils.isEmpty(str)) {
            if (n.a()) {
                this.f8643b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            tryToStringMap = null;
        } else {
            tryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f8642a.D().d(y1.f9661d0, tryToStringMap);
        String str2 = (String) this.f8642a.b(q4.O);
        if (str2 != null) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l10 = (Long) this.f8642a.b(q4.N);
            if (l10 != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l10));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l10));
            }
            a(new com.applovin.impl.e(string, string2));
        } else if (n.a()) {
            this.f8643b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    private void a(com.applovin.impl.e eVar) {
        if (StringUtils.isValidString(eVar.c())) {
            this.f8642a.W().e(com.applovin.impl.sdk.network.d.b().d(eVar.c()).a(StringUtils.isValidString(eVar.a()) ? eVar.a() : null).a(eVar.b()).a(false).b(eVar.d()).a());
        } else if (n.a()) {
            this.f8643b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(final com.applovin.impl.q qVar, final c cVar) {
        AppLovinAdImpl e8 = this.f8642a.h().e(qVar);
        if (e8 != null && !e8.isExpired()) {
            if (n.a()) {
                n nVar = this.f8643b;
                nVar.a("AppLovinAdService", "Using pre-loaded ad: " + e8 + " for " + qVar);
            }
            cVar.adReceived(e8);
            return;
        }
        MaxAdFormat d10 = qVar.d();
        if (((Boolean) this.f8642a.a(o4.X0)).booleanValue() && d10 != null && d10.isFullscreenAd()) {
            this.f8642a.g().a(qVar, new d.a() { // from class: com.applovin.impl.sdk.r
                @Override // com.applovin.impl.sdk.d.a
                public final void a(com.applovin.impl.sdk.ad.b bVar) {
                    AppLovinAdServiceImpl.this.a(cVar, qVar, bVar);
                }
            });
        } else {
            a(new p5(qVar, cVar, this.f8642a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final c cVar, com.applovin.impl.q qVar, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.t
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinAdServiceImpl.c.this.adReceived(bVar);
                }
            });
        } else {
            a(new p5(qVar, cVar, this.f8642a));
        }
    }

    private d a(com.applovin.impl.q qVar) {
        d dVar;
        synchronized (this.f8645d) {
            dVar = (d) this.f8644c.get(qVar);
            if (dVar == null) {
                dVar = new d(null);
                this.f8644c.put(qVar, dVar);
            }
        }
        return dVar;
    }
}
