package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.d7;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* renamed from: b  reason: collision with root package name */
    private static final Map f9870b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f9871c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference f9872d = new WeakReference(null);

    /* renamed from: a  reason: collision with root package name */
    private final MaxRewardedAdImpl f9873a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f9873a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f9873a.logApiCall("destroy()");
        synchronized (f9871c) {
            f9870b.remove(this.f9873a.getAdUnitId());
        }
        this.f9873a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f9873a.logApiCall("getActivity()");
        return (Activity) f9872d.get();
    }

    public String getAdUnitId() {
        return this.f9873a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f9873a.isReady();
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f9873a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f9873a.logApiCall("loadAd()");
        this.f9873a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f9873a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f9873a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f9873a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f9873a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f9873a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f9873a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f9873a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f9873a;
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context != null) {
                if (appLovinSdk != null) {
                    if (context instanceof Activity) {
                        f9872d = new WeakReference((Activity) context);
                    }
                    synchronized (f9871c) {
                        Map map = f9870b;
                        MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    }
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        d7.b(str2, "MaxRewardedAd");
        this.f9873a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, i iVar, Activity activity) {
        showAd((String) null, viewGroup, iVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, i iVar, Activity activity) {
        showAd(str, null, viewGroup, iVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar, Activity activity) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + iVar + ", activity=" + activity + ")");
        this.f9873a.showAd(str, str2, viewGroup, iVar, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        d7.b(str2, "MaxRewardedAd");
        this.f9873a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, i iVar) {
        showAd((String) null, viewGroup, iVar);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, i iVar) {
        showAd(str, (String) null, viewGroup, iVar);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar) {
        MaxRewardedAdImpl maxRewardedAdImpl = this.f9873a;
        maxRewardedAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + iVar + ")");
        this.f9873a.showAd(str, str2, viewGroup, iVar, getActivity());
    }
}
