package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.adcolony.sdk.AdColonyAppOptions;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdSize;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class o3 {

    /* renamed from: a  reason: collision with root package name */
    private static final TreeMap f8061a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map f8062b;

    /* renamed from: c  reason: collision with root package name */
    private static final List f8063c;

    /* renamed from: d  reason: collision with root package name */
    private static JSONArray f8064d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map f8065e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f8066f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static final Map f8067g = Collections.synchronizedMap(new HashMap(1));

    static {
        TreeMap treeMap = new TreeMap();
        f8061a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdjoeAdsMediationAdapter", "adjoe Ads");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.BigoAdsMediationAdapter", "Bigo Ads");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", AdColonyAppOptions.ADMOB);
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", AdColonyAppOptions.FYBER);
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", AdColonyAppOptions.IRONSOURCE);
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "Moloco");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "PubMatic");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        treeMap.put("com.applovin.mediation.adapters.LinkedInDSPAdapter", "LinkedIn");
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        treeMap.put("com.applovin.mediation.ALYsoNetworkMediationAdapter", "YSO Network");
        treeMap.put("com.applovin.mediation.adapters.YsoNetworkMediationAdapter", "YSO Network");
        f8063c = new ArrayList(treeMap.keySet());
        HashMap hashMap = new HashMap();
        f8062b = hashMap;
        hashMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "3.0.1.1");
        hashMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "6.2.0.5.2");
        hashMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "9.7.0.3");
        hashMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "6.17.0.1");
        hashMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "23.3.0.1");
        hashMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "23.3.0.1");
        hashMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "6.4.2.1");
        hashMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "10.7.7.1");
        hashMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "8.3.1.1");
        hashMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "8.3.0.0.2");
        hashMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "2024.8.27.1");
        hashMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "16.8.51.1");
        hashMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "1.7.6.1");
        hashMap.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "3.1.0.1");
        hashMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "5.22.1.1");
        hashMap.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "3.9.0.2");
        hashMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "22.7.0.1");
        hashMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "4.12.2.1");
        hashMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "3.0.4.1");
        hashMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", "7.4.1.1");
        hashMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "7.4.0.1");
    }

    public static JSONArray a(com.applovin.impl.sdk.j jVar) {
        synchronized (f8066f) {
            if (f8064d != null) {
                b(jVar);
                return f8064d;
            }
            f8064d = new JSONArray();
            for (String str : f8063c) {
                MaxAdapter a10 = a(str, jVar);
                if (a10 != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("name", f8061a.get(str));
                        jSONObject.put("class", str);
                        jSONObject.put("sdk_version", a(a10));
                        jSONObject.put("version", a10.getAdapterVersion());
                        jSONObject.put("is_supported", a(a10, str));
                    } catch (Throwable unused) {
                    }
                    f8064d.put(jSONObject);
                    f8065e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
                }
            }
            return f8064d;
        }
    }

    private static void b(com.applovin.impl.sdk.j jVar) {
        synchronized (f8066f) {
            for (int i10 = 0; i10 < f8064d.length(); i10++) {
                JSONObject jSONObject = JsonUtils.getJSONObject(f8064d, i10, (JSONObject) null);
                String string = JsonUtils.getString(jSONObject, "class", "");
                b(jSONObject, string, jVar);
                c(jSONObject, string, jVar);
            }
        }
    }

    public static void c(com.applovin.impl.sdk.j jVar) {
        JSONArray a10 = a(jVar);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < a10.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(a10, i10, (JSONObject) null);
            if (!JsonUtils.getBoolean(jSONObject, "is_supported", Boolean.TRUE).booleanValue()) {
                arrayList.add(JsonUtils.getString(jSONObject, "name", "unknown") + " (" + JsonUtils.getString(jSONObject, "version", "unknown") + ")");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String join = StringUtils.join(", ", arrayList);
        String str = "Please update to the latest adapter versions. Incompatible adapter(s) found: " + join;
        if (!d7.c(jVar)) {
            com.applovin.impl.sdk.n.h("MediationUtils", str);
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid("details", join, hashMap);
            jVar.D().d(y1.f9677l0, hashMap);
            return;
        }
        throw new IllegalArgumentException(str);
    }

    private static void b(JSONObject jSONObject, String str, com.applovin.impl.sdk.j jVar) {
        synchronized (f8066f) {
            Integer a10 = jVar.K().a(str);
            if (a10 == null) {
                return;
            }
            JsonUtils.putInt(jSONObject, "initialization_status", a10.intValue());
            f8065e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
        }
    }

    public static boolean b(Object obj) {
        return (obj instanceof u2) && "APPLOVIN".equals(((u2) obj).k());
    }

    private static void c(JSONObject jSONObject, String str, com.applovin.impl.sdk.j jVar) {
        synchronized (f8066f) {
            if (StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", ""))) {
                return;
            }
            MaxAdapter a10 = a(str, jVar);
            if (a10 == null) {
                return;
            }
            String a11 = a(a10);
            if (TextUtils.isEmpty(a11)) {
                return;
            }
            JsonUtils.putString(jSONObject, "sdk_version", a11);
            f8065e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
        }
    }

    public static String a(MaxAdapter maxAdapter) {
        try {
            return StringUtils.emptyIfNull(maxAdapter.getSdkVersion());
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("MediationUtils", "Failed to retrieve SDK version for adapter: " + maxAdapter, th);
            return "";
        }
    }

    public static MaxMediatedNetworkInfo a(String str) {
        MaxMediatedNetworkInfo maxMediatedNetworkInfo;
        synchronized (f8066f) {
            maxMediatedNetworkInfo = (MaxMediatedNetworkInfo) f8065e.get(str);
        }
        if (maxMediatedNetworkInfo != null) {
            return maxMediatedNetworkInfo;
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "class", str);
        return new MaxMediatedNetworkInfoImpl(jSONObject);
    }

    public static boolean a(MaxAdapter maxAdapter, String str) {
        String str2 = (String) f8062b.get(str);
        return TextUtils.isEmpty(str2) || d7.a(maxAdapter.getAdapterVersion(), str2) >= 0;
    }

    public static MaxAdapter a(String str, com.applovin.impl.sdk.j jVar) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = jVar.I();
                I.a("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
        if (MaxAdapter.class.isAssignableFrom(cls)) {
            return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(jVar.q0());
        }
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I2 = jVar.I();
            I2.b("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
        }
        return null;
    }

    public static boolean a(Object obj) {
        return (obj instanceof com.applovin.impl.sdk.ad.b) && StringUtils.isValidString(((com.applovin.impl.sdk.ad.b) obj).I());
    }

    public static AppLovinSdkUtils.Size a(int i10, MaxAdFormat maxAdFormat, Context context) {
        if (i10 < 0) {
            try {
                i10 = AppLovinSdkUtils.pxToDp(context, l0.a(context).x);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        Map map = f8067g;
        AppLovinSdkUtils.Size size = (AppLovinSdkUtils.Size) map.get(Integer.valueOf(i10));
        if (size != null) {
            return size;
        }
        int i11 = AdSize.FULL_WIDTH;
        Method method = AdSize.class.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
        Method method2 = AdSize.class.getMethod("getWidth", null);
        Method method3 = AdSize.class.getMethod("getHeight", null);
        Object invoke = method.invoke(null, context, Integer.valueOf(i10));
        AppLovinSdkUtils.Size size2 = new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, null)).intValue(), ((Integer) method3.invoke(invoke, null)).intValue());
        map.put(Integer.valueOf(i10), size2);
        return size2;
    }

    public static boolean a(JSONObject jSONObject, String str, com.applovin.impl.sdk.j jVar) {
        if (JsonUtils.containsJSONObjectContainingInt(jSONObject.optJSONArray("no_fill_reason"), IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "code")) {
            jVar.D().a(y1.f9677l0, "invalid_or_disabled_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "invalid_or_disabled_ad_unit_id" + str);
            return true;
        }
        return false;
    }
}
