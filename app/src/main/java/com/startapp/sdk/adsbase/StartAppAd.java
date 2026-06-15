package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.startapp.c5;
import com.startapp.d2;
import com.startapp.f0;
import com.startapp.f2;
import com.startapp.g;
import com.startapp.g2;
import com.startapp.h;
import com.startapp.i;
import com.startapp.k;
import com.startapp.l;
import com.startapp.l3;
import com.startapp.la;
import com.startapp.o9;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.c;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class StartAppAd extends Ad {
    private static final long serialVersionUID = 5570787449025156740L;
    public d ad;
    private CacheKey adKey;
    private AdMode adMode;
    private AdPreferences adPreferences;
    AdDisplayListener callback;
    private final BroadcastReceiver callbackBroadcastReceiver;
    com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum AdMode {
        AUTOMATIC,
        FULLPAGE,
        OFFERWALL,
        REWARDED_VIDEO,
        VIDEO,
        OVERLAY
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            String stringExtra = intent.getStringExtra("dParam");
            if (action.equals("com.startapp.android.ShowFailedDisplayBroadcastListener")) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                if (extras.containsKey("showFailedReason")) {
                    StartAppAd.this.a((NotDisplayedReason) extras.getSerializable("showFailedReason"));
                }
                StartAppAd startAppAd = StartAppAd.this;
                k.a(context, startAppAd, startAppAd.callback);
                c5.a(context).a(this);
            } else {
                if (action.equals("com.startapp.android.ShowDisplayBroadcastListener")) {
                    StartAppAd startAppAd2 = StartAppAd.this;
                    AdDisplayListener adDisplayListener = startAppAd2.callback;
                    d2.a("onShow", stringExtra, null, adDisplayListener != null);
                    com.startapp.sdk.adsbase.a.a(adDisplayListener == null ? null : new h(context, startAppAd2, adDisplayListener));
                } else if (action.equals("com.startapp.android.OnClickCallback")) {
                    StartAppAd startAppAd3 = StartAppAd.this;
                    AdDisplayListener adDisplayListener2 = startAppAd3.callback;
                    d2.a("onClicked", stringExtra, null, adDisplayListener2 != null);
                    com.startapp.sdk.adsbase.a.a(adDisplayListener2 == null ? null : new i(context, startAppAd3, adDisplayListener2));
                } else if (action.equals("com.startapp.android.OnVideoCompleted")) {
                    com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener = StartAppAd.this.videoListener;
                    d2.a("onVideoCompleted", stringExtra, null, videoListener != null);
                    com.startapp.sdk.adsbase.a.a(videoListener == null ? null : new la(videoListener, context));
                } else {
                    StartAppAd startAppAd4 = StartAppAd.this;
                    AdDisplayListener adDisplayListener3 = startAppAd4.callback;
                    d2.a("adHidden", stringExtra, null, adDisplayListener3 != null);
                    com.startapp.sdk.adsbase.a.a(adDisplayListener3 == null ? null : new g(context, startAppAd4, adDisplayListener3));
                    c5.a(context).a(this);
                }
            }
            StartAppAd.this.ad = null;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f22906a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ SplashHideListener f22907b;

        public b(Activity activity, SplashHideListener splashHideListener) {
            this.f22906a = activity;
            this.f22907b = splashHideListener;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Activity activity = this.f22906a;
            WeakHashMap weakHashMap = o9.f22359a;
            o9.a(activity, activity.getResources().getConfiguration().orientation, false);
            SplashHideListener splashHideListener = this.f22907b;
            if (splashHideListener != null) {
                splashHideListener.splashHidden();
            }
            c5.a(this.f22906a).a(this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22908a;

        static {
            int[] iArr = new int[AdMode.values().length];
            f22908a = iArr;
            try {
                iArr[AdMode.FULLPAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22908a[AdMode.OFFERWALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22908a[AdMode.OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22908a[AdMode.REWARDED_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public StartAppAd(Context context) {
        super(context, null);
        this.adKey = null;
        this.ad = null;
        this.adMode = AdMode.AUTOMATIC;
        this.adPreferences = null;
        this.videoListener = null;
        this.callback = null;
        this.callbackBroadcastReceiver = new a();
        try {
            com.startapp.sdk.components.a.a(context).d().a().a(8192);
        } catch (Throwable unused) {
        }
    }

    public static void disableAutoInterstitial() {
        c.a.f23014a.f23009a = false;
    }

    @Deprecated
    public static void disableSplash() {
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal.c.f22944a.f22931w = true;
        com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f23020h;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_SPLASH;
        synchronized (dVar.f23021a) {
            Iterator it = dVar.f23021a.entrySet().iterator();
            while (it.hasNext()) {
                if (((CacheKey) ((Map.Entry) it.next()).getKey()).a() == placement) {
                    it.remove();
                }
            }
        }
    }

    public static void enableAutoInterstitial() {
        c.a.f23014a.f23009a = true;
    }

    public static void enableConsent(Context context, boolean z10) {
        com.startapp.sdk.components.a.a(context).f23233i.a().f23467f = z10;
    }

    public static void init(Context context, String str, String str2) {
        StartAppSDK.init(context, str, str2);
    }

    public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autoInterstitialPreferences) {
        com.startapp.sdk.adsbase.c cVar = c.a.f23014a;
        cVar.f23010b = autoInterstitialPreferences;
        cVar.f23011c = -1L;
        cVar.f23012d = -1;
    }

    public static void setCommonAdsPreferences(Context context, SDKAdPreferences sDKAdPreferences) {
        Context a10 = f0.a(context);
        if (a10 != null) {
            Object obj = StartAppSDKInternal.C;
            StartAppSDKInternal.c.f22944a.f22909a = sDKAdPreferences;
            try {
                com.startapp.sdk.components.a.a(a10).A.a().execute(new f2(a10, "shared_prefs_sdk_ad_prefs", sDKAdPreferences));
            } catch (Throwable th) {
                if (g2.a(1)) {
                    l3.a(th);
                }
            }
        }
    }

    public static void setReturnAdsPreferences(AdPreferences adPreferences) {
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        boolean z10 = !o9.a(startAppSDKInternal.f22927s, adPreferences);
        startAppSDKInternal.f22927s = adPreferences != null ? new AdPreferences(adPreferences) : null;
        if (z10) {
            com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f23020h;
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
            if (dVar.f23024d) {
                return;
            }
            synchronized (dVar.f23021a) {
                for (com.startapp.sdk.adsbase.cache.g gVar : dVar.f23021a.values()) {
                    if (gVar.f23039a == placement) {
                        gVar.b();
                    }
                }
            }
        }
    }

    public static void showSplash(Activity activity, Bundle bundle) {
        showSplash(activity, bundle, new SplashConfig());
    }

    public AdRulesResult a(AdPreferences.Placement placement, String str) {
        return AdsCommonMetaData.f22889h.b().a(placement, str);
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void a(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    public void close() {
        c5.a(this.f22876a).a(this.callbackBroadcastReceiver);
        c5.a(this.f22876a).a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final AdPreferences.Placement f() {
        CacheKey cacheKey;
        AdPreferences.Placement placement = this.placement;
        if (placement != null || (cacheKey = this.adKey) == null) {
            return placement;
        }
        com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f23020h;
        return dVar.a(cacheKey) != null ? ((Ad) dVar.a(this.adKey)).f() : placement;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public String getAdId() {
        d a10 = com.startapp.sdk.adsbase.cache.d.f23020h.a(this.adKey);
        if (a10 instanceof HtmlAd) {
            return ((HtmlAd) a10).getAdId();
        }
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public String getBidToken() {
        d a10 = com.startapp.sdk.adsbase.cache.d.f23020h.a(this.adKey);
        if (a10 instanceof HtmlAd) {
            return ((HtmlAd) a10).getBidToken();
        }
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public Ad.AdState getState() {
        d a10 = com.startapp.sdk.adsbase.cache.d.f23020h.a(this.adKey);
        if (a10 != null) {
            return a10.getState();
        }
        return Ad.AdState.UN_INITIALIZED;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public boolean isBelowMinCPM() {
        d a10 = com.startapp.sdk.adsbase.cache.d.f23020h.a(this.adKey);
        if (a10 != null) {
            return a10.isBelowMinCPM();
        }
        return false;
    }

    public boolean isNetworkAvailable() {
        Context context = this.f22876a;
        WeakHashMap weakHashMap = o9.f22359a;
        return com.startapp.sdk.components.a.a(context).f23243s.a().b();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public boolean isReady() {
        d a10 = com.startapp.sdk.adsbase.cache.d.f23020h.a(this.adKey);
        if (a10 != null) {
            return a10.isReady();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        if (!MetaData.f23158k.b()) {
            if (adEventListener != null) {
                setErrorMessage("serving ads disabled");
                l.a(this.f22876a, adEventListener, this, false);
                return;
            }
            return;
        }
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        if (adPreferences2.getPlacementId() == null) {
            adPreferences2.setPlacementId(com.startapp.sdk.adsbase.a.a(this.f22876a, this));
        }
        this.adKey = com.startapp.sdk.adsbase.cache.d.f23020h.a(this.f22876a, this, this.adMode, adPreferences2, adEventListener);
    }

    public void loadAd() {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), null);
    }

    public CacheKey loadSplash(AdPreferences adPreferences, boolean z10, AdEventListener adEventListener) {
        CacheKey cacheKey;
        com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f23020h;
        Context context = this.f22876a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_SPLASH;
        dVar.getClass();
        if (com.startapp.sdk.adsbase.cache.d.a(placement)) {
            cacheKey = dVar.a(context, this, placement, adPreferences, false, z10, 0, adEventListener);
        } else {
            if (adEventListener != null) {
                adEventListener.onFailedToReceiveAd(this);
            }
            cacheKey = null;
        }
        this.adKey = cacheKey;
        return cacheKey;
    }

    public void onBackPressed() {
        showAd("exit_ad");
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        startAppSDKInternal.f22912d = false;
        startAppSDKInternal.f22914f = true;
    }

    public void onPause() {
    }

    public void onRestoreInstanceState(Bundle bundle) {
        int i10 = bundle.getInt("AdMode");
        this.adMode = AdMode.AUTOMATIC;
        if (i10 == 1) {
            this.adMode = AdMode.FULLPAGE;
        } else if (i10 == 2) {
            this.adMode = AdMode.OFFERWALL;
        } else if (i10 == 3) {
            this.adMode = AdMode.OVERLAY;
        } else if (i10 == 4) {
            this.adMode = AdMode.REWARDED_VIDEO;
        } else if (i10 == 5) {
            this.adMode = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.adPreferences = (AdPreferences) serializable;
        }
    }

    public void onResume() {
        if (isReady()) {
            return;
        }
        loadAd();
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i10 = c.f22908a[this.adMode.ordinal()];
        int i11 = 4;
        if (i10 == 1) {
            i11 = 1;
        } else if (i10 == 2) {
            i11 = 2;
        } else if (i10 == 3) {
            i11 = 3;
        } else if (i10 != 4) {
            i11 = 0;
        }
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences != null) {
            bundle.putSerializable("AdPrefs", adPreferences);
        }
        bundle.putInt("AdMode", i11);
    }

    public void setVideoListener(com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener) {
        this.videoListener = videoListener;
    }

    public boolean showAd() {
        return showAd(null, null);
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
        showSplash(activity, bundle, splashConfig, new AdPreferences());
    }

    public void loadAd(AdPreferences adPreferences) {
        loadAd(AdMode.AUTOMATIC, adPreferences, null);
    }

    @Deprecated
    public boolean showAd(String str) {
        return showAd(str, null);
    }

    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences) {
        showSplash(activity, bundle, new SplashConfig(), adPreferences);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0195, code lost:
        if (r14 == false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r13, com.startapp.sdk.adsbase.adlisteners.AdDisplayListener r14) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppAd.a(java.lang.String, com.startapp.sdk.adsbase.adlisteners.AdDisplayListener):boolean");
    }

    public void loadAd(AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener);
    }

    public boolean showAd(AdDisplayListener adDisplayListener) {
        return showAd(null, adDisplayListener);
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences) {
        showSplash(activity, bundle, splashConfig, adPreferences, null);
    }

    public void loadAd(AdPreferences adPreferences, AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, adPreferences, adEventListener);
    }

    public boolean showAd(@Deprecated String str, AdDisplayListener adDisplayListener) {
        try {
            return a(str, adDisplayListener);
        } catch (Throwable th) {
            l3.a(th);
            a(NotDisplayedReason.INTERNAL_ERROR);
            k.a(this.f22876a, null, this.callback);
            return false;
        }
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences, SplashHideListener splashHideListener) {
        a(activity, bundle, splashConfig, adPreferences, true, splashHideListener);
    }

    public void loadAd(AdMode adMode) {
        loadAd(adMode, new AdPreferences(), null);
    }

    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences) {
        loadAd(adMode, adPreferences, null);
    }

    public void loadAd(AdMode adMode, AdEventListener adEventListener) {
        loadAd(adMode, new AdPreferences(), adEventListener);
    }

    public static boolean showAd(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return new StartAppAd(context).showAd();
        } catch (Throwable th) {
            l3.a(th);
            return false;
        }
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener) {
        try {
            com.startapp.sdk.components.a.a(this.f22876a).f23244t.a().a(16384);
        } catch (Throwable unused) {
        }
        this.adMode = adMode;
        this.adPreferences = adPreferences;
        try {
            load(adPreferences, adEventListener);
        } catch (Throwable th) {
            l3.a(th);
            if (adEventListener != null) {
                l.a(this.f22876a, adEventListener, this, false);
            }
        }
    }

    public static void a(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences, boolean z10, SplashHideListener splashHideListener) {
        if (activity != null && bundle == null && MetaData.f23158k.b() && o9.e(activity) && com.startapp.sdk.components.a.a(activity).f23236l.a().b()) {
            try {
                Object obj = StartAppSDKInternal.C;
                StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
                if (startAppSDKInternal.f22931w && z10) {
                    startAppSDKInternal.f22931w = false;
                }
                if (!z10) {
                    if (adPreferences == null) {
                        adPreferences = new AdPreferences();
                    }
                    adPreferences.setAs(Boolean.TRUE);
                }
                o9.a(activity, activity.getResources().getConfiguration().orientation, true);
                Intent intent = new Intent(activity, OverlayActivity.class);
                intent.putExtra("isSplash", true);
                intent.putExtra("SplashConfig", splashConfig);
                intent.putExtra("AdPreference", adPreferences);
                intent.putExtra("testMode", false);
                intent.putExtra("fullscreen", com.startapp.sdk.adsbase.a.b(activity));
                intent.putExtra("placement", AdPreferences.Placement.INAPP_SPLASH.a());
                intent.addFlags(67108864 | (Build.VERSION.SDK_INT >= 11 ? 32768 : 0) | 1073741824);
                activity.startActivity(intent);
                c5.a(activity).a(new b(activity, splashHideListener), new IntentFilter("com.startapp.android.splashHidden"));
            } catch (Throwable th) {
                l3.a(th);
                if (splashHideListener != null) {
                    splashHideListener.splashHidden();
                }
            }
        }
    }
}
