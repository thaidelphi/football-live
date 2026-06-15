package com.startapp;

import android.app.Activity;
import android.os.Bundle;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AutoInterstitialPreferences;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.c;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p8 extends y1 {
    @Override // com.startapp.y1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String[] split;
        boolean startsWith;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        startAppSDKInternal.getClass();
        boolean z10 = true;
        if (activity.getClass().getName().equals(o9.c(activity))) {
            startAppSDKInternal.f22932x = true;
        }
        startAppSDKInternal.f22926r = bundle;
        if ((startAppSDKInternal.f22932x || activity.getClass().getName().equals(o9.c(activity))) && startAppSDKInternal.f22926r == null && startAppSDKInternal.f22917i.size() == 0) {
            if (com.startapp.sdk.components.a.a(activity).f23233i.a().a(null, null, null, false)) {
                startAppSDKInternal.f22932x = false;
            } else {
                SplashMetaData splashMetaData = SplashMetaData.f22718b;
                if (((startAppSDKInternal.f22931w || AdsCommonMetaData.f22889h.L()) ? false : true) && !splashMetaData.f22720a && !com.startapp.sdk.components.a.a(activity).f23233i.a().f23466e) {
                    StartAppAd.a(activity, startAppSDKInternal.f22926r, splashMetaData.a(), null, false, null);
                    startAppSDKInternal.f22932x = false;
                } else {
                    startAppSDKInternal.f22932x = false;
                }
            }
        }
        com.startapp.sdk.adsbase.c cVar = c.a.f23014a;
        boolean equals = activity.getClass().getName().equals(o9.c(activity));
        if (bundle == null) {
            if (com.startapp.sdk.adsbase.c.class.getName().split("\\.").length < 3) {
                startsWith = false;
            } else {
                startsWith = activity.getClass().getName().startsWith(split[0] + "." + split[1] + "." + split[2]);
            }
            if (startsWith || equals) {
                return;
            }
            cVar.f23012d++;
            if (cVar.f23009a && AdsCommonMetaData.f22889h.I()) {
                if (cVar.f23010b == null) {
                    cVar.f23010b = new AutoInterstitialPreferences();
                }
                boolean z11 = cVar.f23011c <= 0 || System.currentTimeMillis() >= cVar.f23011c + ((long) (cVar.f23010b.getSecondsBetweenAds() * 1000));
                int i10 = cVar.f23012d;
                boolean z12 = i10 <= 0 || i10 >= cVar.f23010b.getActivitiesBetweenAds();
                if (!z11 || !z12) {
                    z10 = false;
                }
                if (z10) {
                    if (cVar.f23013e == null) {
                        cVar.f23013e = new StartAppAd(activity);
                    }
                    cVar.f23013e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new g4());
                }
            }
        }
    }

    @Override // com.startapp.y1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        startAppSDKInternal.getClass();
        if (activity.getClass().getName().equals(o9.c(activity))) {
            startAppSDKInternal.f22932x = false;
        }
        if (startAppSDKInternal.f22917i.size() == 0) {
            startAppSDKInternal.f22912d = false;
        }
    }

    @Override // com.startapp.y1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        startAppSDKInternal.getClass();
        startAppSDKInternal.f22915g = System.currentTimeMillis();
        startAppSDKInternal.f22920l = null;
    }

    @Override // com.startapp.y1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        boolean z10 = false;
        if (startAppSDKInternal.f22910b && startAppSDKInternal.f22913e) {
            startAppSDKInternal.f22913e = false;
            com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f23020h;
            if (!dVar.f23024d) {
                synchronized (dVar.f23021a) {
                    for (com.startapp.sdk.adsbase.cache.g gVar : dVar.f23021a.values()) {
                        gVar.b();
                    }
                }
            }
        }
        if (startAppSDKInternal.f22921m) {
            startAppSDKInternal.f22921m = false;
            SimpleTokenUtils.d(activity);
        }
        startAppSDKInternal.f22920l = activity;
        if (startAppSDKInternal.f22931w && (activity instanceof OverlayActivity)) {
            OverlayActivity overlayActivity = (OverlayActivity) activity;
            l2 l2Var = overlayActivity.f22616a;
            if (l2Var != null && l2Var.f22214o) {
                z10 = true;
            }
            if (z10) {
                overlayActivity.finish();
            }
        }
    }

    @Override // com.startapp.y1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        boolean z10 = true;
        if (startAppSDKInternal.f22912d) {
            if (MetaData.f23158k.b() && startAppSDKInternal.f22929u && !AdsCommonMetaData.f22889h.K()) {
                WeakHashMap weakHashMap = o9.f22359a;
                if (!startAppSDKInternal.f22923o) {
                    if (System.currentTimeMillis() - startAppSDKInternal.f22915g > AdsCommonMetaData.f22889h.x()) {
                        com.startapp.sdk.adsbase.d b10 = com.startapp.sdk.adsbase.cache.d.f23020h.b(startAppSDKInternal.f22928t);
                        startAppSDKInternal.f22933y = b10;
                        if (b10 != null && b10.isReady()) {
                            AdRules b11 = AdsCommonMetaData.f22889h.b();
                            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
                            AdRulesResult a10 = b11.a(placement, null);
                            if (a10.b()) {
                                if (startAppSDKInternal.f22933y.a((String) null)) {
                                    f.f21919d.a(new e(placement, null));
                                }
                            } else {
                                com.startapp.sdk.adsbase.a.a(((ReturnAd) startAppSDKInternal.f22933y).trackingUrls, (String) null, 0, a10.a());
                            }
                        }
                    }
                }
            }
            if (System.currentTimeMillis() - startAppSDKInternal.f22915g > MetaData.f23158k.L()) {
                c8.f21846d.a(activity, MetaDataRequest.RequestReason.APP_IDLE);
            }
        }
        startAppSDKInternal.f22914f = false;
        startAppSDKInternal.f22912d = false;
        if (startAppSDKInternal.f22917i.get(Integer.valueOf(activity.hashCode())) == null) {
            startAppSDKInternal.f22917i.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(new Integer(0).intValue() + 1));
        }
        if (startAppSDKInternal.f22931w && (activity instanceof OverlayActivity)) {
            OverlayActivity overlayActivity = (OverlayActivity) activity;
            l2 l2Var = overlayActivity.f22616a;
            if (l2Var == null || !l2Var.f22214o) {
                z10 = false;
            }
            if (z10) {
                overlayActivity.finish();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.content.Context] */
    @Override // com.startapp.y1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        Integer num = startAppSDKInternal.f22917i.get(Integer.valueOf(activity.hashCode()));
        if (num != null) {
            Integer valueOf = Integer.valueOf(num.intValue() - 1);
            if (valueOf.intValue() == 0) {
                startAppSDKInternal.f22917i.remove(Integer.valueOf(activity.hashCode()));
            } else {
                startAppSDKInternal.f22917i.put(Integer.valueOf(activity.hashCode()), valueOf);
            }
            if (startAppSDKInternal.f22917i.size() == 0) {
                if (!startAppSDKInternal.f22914f) {
                    startAppSDKInternal.f22912d = true;
                    if (startAppSDKInternal.f22929u && !AdsCommonMetaData.f22889h.K()) {
                        com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f23020h;
                        AdPreferences adPreferences = startAppSDKInternal.f22927s;
                        AdPreferences adPreferences2 = adPreferences != null ? new AdPreferences(adPreferences) : new AdPreferences();
                        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
                        dVar.getClass();
                        startAppSDKInternal.f22928t = com.startapp.sdk.adsbase.cache.d.a(placement) ? dVar.a(activity, null, placement, adPreferences2, false, false, 0, null) : null;
                    }
                }
                if (startAppSDKInternal.f22910b) {
                    ?? a10 = f0.a(activity);
                    if (a10 != 0) {
                        activity = a10;
                    }
                    com.startapp.sdk.adsbase.cache.d dVar2 = com.startapp.sdk.adsbase.cache.d.f23020h;
                    boolean z10 = startAppSDKInternal.f22914f;
                    dVar2.getClass();
                    try {
                        if (!dVar2.f23023c && CacheMetaData.f23015a.a().f()) {
                            com.startapp.sdk.components.a.a(activity).A.a().execute(new c(dVar2, activity));
                        }
                        dVar2.a(z10);
                    } catch (Throwable th) {
                        l3.a(th);
                    }
                    startAppSDKInternal.f22913e = true;
                }
            }
        }
    }
}
