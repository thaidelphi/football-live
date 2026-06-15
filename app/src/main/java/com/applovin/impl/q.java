package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q {

    /* renamed from: e  reason: collision with root package name */
    private static final Map f8423e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f8424f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f8425a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8426b;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAdSize f8427c;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinAdType f8428d;

    private q(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f8427c = appLovinAdSize;
        this.f8428d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        if (z10) {
            lowerCase = lowerCase + "_bidding";
        }
        if (z11) {
            lowerCase = lowerCase + "_direct_sold";
        }
        this.f8426b = lowerCase;
    }

    public static q a(String str) {
        return a(null, null, str);
    }

    public static q b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static q c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static q h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static q j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static q k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static q l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static q m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize f10 = f();
        if (f10 == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (f10 == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (f10 == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (f10 == AppLovinAdSize.INTERSTITIAL) {
            if (g() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (g() == AppLovinAdType.APP_OPEN) {
                return MaxAdFormat.APP_OPEN;
            }
            if (g() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            return null;
        } else if (f10 == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        } else {
            return null;
        }
    }

    public String e() {
        return this.f8426b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return this.f8426b.equalsIgnoreCase(((q) obj).f8426b);
    }

    public AppLovinAdSize f() {
        if (this.f8427c == null && JsonUtils.valueExists(this.f8425a, "ad_size")) {
            this.f8427c = AppLovinAdSize.fromString(JsonUtils.getString(this.f8425a, "ad_size", null));
        }
        return this.f8427c;
    }

    public AppLovinAdType g() {
        if (this.f8428d == null && JsonUtils.valueExists(this.f8425a, "ad_type")) {
            this.f8428d = AppLovinAdType.fromString(JsonUtils.getString(this.f8425a, "ad_type", null));
        }
        return this.f8428d;
    }

    public int hashCode() {
        return this.f8426b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f8426b + ", zoneObject=" + this.f8425a + '}';
    }

    public static q a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static q b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static q a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static q a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        q qVar = new q(appLovinAdSize, appLovinAdType, str, z10, z11);
        synchronized (f8424f) {
            String str2 = qVar.f8426b;
            Map map = f8423e;
            if (map.containsKey(str2)) {
                qVar = (q) map.get(str2);
            } else {
                map.put(str2, qVar);
            }
        }
        return qVar;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f8424f) {
                q qVar = (q) f8423e.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                if (qVar != null) {
                    qVar.f8427c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    qVar.f8428d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
