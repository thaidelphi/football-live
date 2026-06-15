package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o9;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NetworkSettings {

    /* renamed from: r  reason: collision with root package name */
    private static final String f18936r = "customNetwork";

    /* renamed from: s  reason: collision with root package name */
    private static final String f18937s = "customNetworkPackage";

    /* renamed from: t  reason: collision with root package name */
    private static final String f18938t = "customNetworkAdapterName";

    /* renamed from: a  reason: collision with root package name */
    private String f18939a;

    /* renamed from: b  reason: collision with root package name */
    private String f18940b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f18941c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f18942d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f18943e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f18944f;

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f18945g;

    /* renamed from: h  reason: collision with root package name */
    private String f18946h;

    /* renamed from: i  reason: collision with root package name */
    private String f18947i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f18948j;

    /* renamed from: k  reason: collision with root package name */
    private String f18949k;

    /* renamed from: l  reason: collision with root package name */
    private int f18950l;

    /* renamed from: m  reason: collision with root package name */
    private int f18951m;

    /* renamed from: n  reason: collision with root package name */
    private int f18952n;

    /* renamed from: o  reason: collision with root package name */
    private int f18953o;

    /* renamed from: p  reason: collision with root package name */
    private String f18954p;

    /* renamed from: q  reason: collision with root package name */
    private String f18955q;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f18939a = networkSettings.getProviderName();
        this.f18949k = networkSettings.getProviderName();
        this.f18940b = networkSettings.getProviderTypeForReflection();
        this.f18942d = networkSettings.getRewardedVideoSettings();
        this.f18943e = networkSettings.getInterstitialSettings();
        this.f18944f = networkSettings.getBannerSettings();
        this.f18945g = networkSettings.getNativeAdSettings();
        this.f18941c = networkSettings.getApplicationSettings();
        this.f18950l = networkSettings.getRewardedVideoPriority();
        this.f18951m = networkSettings.getInterstitialPriority();
        this.f18952n = networkSettings.getBannerPriority();
        this.f18953o = networkSettings.getNativeAdPriority();
        this.f18954p = networkSettings.getProviderDefaultInstance();
        this.f18955q = networkSettings.getProviderNetworkKey();
    }

    public NetworkSettings(String str) {
        this.f18939a = str;
        this.f18949k = str;
        this.f18940b = str;
        this.f18954p = str;
        this.f18955q = str;
        this.f18942d = new JSONObject();
        this.f18943e = new JSONObject();
        this.f18944f = new JSONObject();
        this.f18945g = new JSONObject();
        this.f18941c = new JSONObject();
        this.f18950l = -1;
        this.f18951m = -1;
        this.f18952n = -1;
        this.f18953o = -1;
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f18939a = str;
        this.f18949k = str;
        this.f18940b = str2;
        this.f18954p = str3;
        this.f18955q = str4;
        this.f18942d = jSONObject2;
        this.f18943e = jSONObject3;
        this.f18944f = jSONObject4;
        this.f18945g = jSONObject5;
        this.f18941c = jSONObject;
        this.f18950l = -1;
        this.f18951m = -1;
        this.f18952n = -1;
        this.f18953o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f18947i;
    }

    public JSONObject getApplicationSettings() {
        return this.f18941c;
    }

    public int getBannerPriority() {
        return this.f18952n;
    }

    public JSONObject getBannerSettings() {
        return this.f18944f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f18941c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit != null || (jSONObject2 = this.f18941c) == null) && ((!ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) || (jSONObject2 = this.f18942d) == null) && ((!ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) || (jSONObject2 = this.f18943e) == null) && (!ad_unit.equals(IronSource.AD_UNIT.BANNER) || (jSONObject2 = this.f18944f) == null)))) {
            if (!ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD) || (jSONObject = this.f18945g) == null) {
                return null;
            }
            return jSONObject.optString(f18938t);
        }
        return jSONObject2.optString(f18938t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f18941c;
        return jSONObject != null ? jSONObject.optString(f18937s, "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
            return 1;
        } else {
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f18951m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f18943e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
            return 99;
        } else {
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("maxAdsPerSession", 99);
    }

    public int getNativeAdPriority() {
        return this.f18953o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f18945g;
    }

    public String getProviderDefaultInstance() {
        return this.f18954p;
    }

    public String getProviderInstanceName() {
        return this.f18949k;
    }

    public String getProviderName() {
        return this.f18939a;
    }

    public String getProviderNetworkKey() {
        return this.f18955q;
    }

    public String getProviderTypeForReflection() {
        return this.f18940b;
    }

    public int getRewardedVideoPriority() {
        return this.f18950l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f18942d;
    }

    public String getSubProviderId() {
        return this.f18946h;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.f18948j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f18947i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f18941c = jSONObject;
    }

    public void setBannerPriority(int i10) {
        this.f18952n = i10;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f18944f.put(str, obj);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f18944f = jSONObject;
    }

    public void setInterstitialPriority(int i10) {
        this.f18951m = i10;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f18943e.put(str, obj);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f18943e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z10) {
        this.f18948j = z10;
    }

    public void setNativeAdPriority(int i10) {
        this.f18953o = i10;
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f18945g.put(str, obj);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f18945g = jSONObject;
    }

    public void setProviderNetworkKey(String str) {
        this.f18955q = str;
    }

    public void setRewardedVideoPriority(int i10) {
        this.f18950l = i10;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f18942d.put(str, obj);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f18942d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f18946h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f18941c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }
}
