package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.c8;
import com.startapp.f0;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.n8;
import com.startapp.o9;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.y;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class StartAppSDK {
    public static void addWrapper(Context context, String str, String str2) {
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        startAppSDKInternal.getClass();
        if (context == null || str == null || str2 == null) {
            return;
        }
        if (startAppSDKInternal.f22925q == null) {
            startAppSDKInternal.f22925q = new TreeMap();
        }
        startAppSDKInternal.f22925q.put(str, str2);
        TreeMap treeMap = startAppSDKInternal.f22925q;
        WeakHashMap weakHashMap = o9.f22359a;
        com.startapp.sdk.components.a.a(context).E.a().edit().putString("sharedPrefsWrappers", new JSONObject(treeMap).toString()).apply();
    }

    public static void enableMediationMode(Context context, String str, String str2) {
        StartAppAd.enableConsent(context, false);
        StartAppAd.disableSplash();
        StartAppAd.disableAutoInterstitial();
        enableReturnAds(false);
        addWrapper(context, str, str2);
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal.c.f22944a.f22930v = true;
    }

    public static void enableReturnAds(boolean z10) {
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        if (z10) {
            startAppSDKInternal.getClass();
            if (y.b()) {
                startAppSDKInternal.f22929u = true;
                return;
            }
        }
        startAppSDKInternal.f22929u = false;
        com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f23020h;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
        synchronized (dVar.f23021a) {
            Iterator it = dVar.f23021a.entrySet().iterator();
            while (it.hasNext()) {
                if (((CacheKey) ((Map.Entry) it.next()).getKey()).a() == placement) {
                    it.remove();
                }
            }
        }
    }

    public static SharedPreferences getExtras(Context context) {
        return com.startapp.sdk.components.a.a(context).G.a();
    }

    public static String getVersion() {
        return "4.11.5";
    }

    public static void inAppPurchaseMade(Context context) {
        inAppPurchaseMade(context, 0.0d);
    }

    public static void init(Context context, String str) {
        init(context, str, new SDKAdPreferences());
    }

    public static void setTestAdsEnabled(boolean z10) {
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal.c.f22944a.B = z10;
    }

    public static void setUserConsent(Context context, String str, long j10, boolean z10) {
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal.c.f22944a.getClass();
        if ("pas".equalsIgnoreCase(str)) {
            e a10 = com.startapp.sdk.components.a.a(context).E.a();
            String string = a10.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
            if (string != null) {
                if (string.equals(z10 ? "1" : "0")) {
                    return;
                }
            }
            String concat = (z10 ? "1" : "0").concat("M");
            l3 l3Var = new l3(m3.f22274d);
            l3Var.f22228d = "User consent: " + str;
            l3Var.f22229e = concat;
            l3Var.a();
            a10.edit().putString("USER_CONSENT_PERSONALIZED_ADS_SERVING", z10 ? "1" : "0").apply();
            c8.f21846d.a(context, MetaDataRequest.RequestReason.PAS);
        }
    }

    public static void startNewSession(Context context) {
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        MetaDataRequest.RequestReason requestReason = MetaDataRequest.RequestReason.CUSTOM;
        startAppSDKInternal.getClass();
        c8.f21846d.a(context, requestReason);
    }

    public static void inAppPurchaseMade(Context context, double d10) {
        e a10 = com.startapp.sdk.components.a.a(context).E.a();
        float f10 = a10.getFloat("inAppPurchaseAmount", 0.0f);
        e.a edit = a10.edit();
        float f11 = (float) (f10 + d10);
        edit.a(Float.valueOf(f11), "inAppPurchaseAmount");
        edit.f23101a.putFloat("inAppPurchaseAmount", f11);
        edit.putBoolean("payingUser", true).apply();
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        MetaDataRequest.RequestReason requestReason = MetaDataRequest.RequestReason.IN_APP_PURCHASE;
        startAppSDKInternal.getClass();
        c8.f21846d.a(context, requestReason);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences) {
        init(context, (String) null, str, sDKAdPreferences);
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, new SDKAdPreferences());
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences) {
        init(context, str, str2, sDKAdPreferences, true);
    }

    public static void init(Context context, String str, boolean z10) {
        init(context, (String) null, str, z10);
    }

    public static void init(Context context, String str, String str2, boolean z10) {
        init(context, str, str2, new SDKAdPreferences(), z10);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences, boolean z10) {
        init(context, null, str, sDKAdPreferences, z10);
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        startAppSDKInternal.getClass();
        Context a10 = f0.a(context);
        if (a10 == null) {
            a10 = context;
        }
        startAppSDKInternal.d(a10);
        Context a11 = f0.a(context);
        Context context2 = a11 != null ? a11 : context;
        try {
            com.startapp.sdk.components.a.a(context2).f23244t.a().a(256);
        } catch (Throwable unused) {
        }
        com.startapp.sdk.components.a.a(context2).f23248x.a().execute(new n8(startAppSDKInternal, context2, str, str2, sDKAdPreferences, z10));
    }
}
