package com.applovin.mediation;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.o3;
import com.applovin.impl.sdk.n;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.t;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxAdFormat {

    /* renamed from: a  reason: collision with root package name */
    private final String f9850a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9851b;
    public static final MaxAdFormat BANNER = new MaxAdFormat("BANNER", "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC", "MREC");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER", "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER", "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat("APPOPEN", "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat("REWARDED", "Rewarded");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");
    @Deprecated
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");

    private MaxAdFormat(String str, String str2) {
        this.f9850a = str;
        this.f9851b = str2;
    }

    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase(IronSourceConstants.EVENTS_NATIVE)) {
            return NATIVE;
        }
        if (!str.equalsIgnoreCase("leaderboard") && !str.equalsIgnoreCase("leader")) {
            if (!str.equalsIgnoreCase("interstitial") && !str.equalsIgnoreCase("inter")) {
                if (!str.equalsIgnoreCase("appopen") && !str.equalsIgnoreCase("app_open")) {
                    if (!str.equalsIgnoreCase("rewarded") && !str.equalsIgnoreCase(t.f20751j)) {
                        n.h("AppLovinSdk", "Unknown ad format: " + str);
                        return null;
                    }
                    return REWARDED;
                }
                return APP_OPEN;
            }
            return INTERSTITIAL;
        }
        return LEADER;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Context context) {
        return getAdaptiveSize(-1, context);
    }

    @Deprecated
    public String getDisplayName() {
        return this.f9851b;
    }

    public String getLabel() {
        return this.f9850a;
    }

    public AppLovinSdkUtils.Size getSize() {
        if (this == BANNER) {
            return new AppLovinSdkUtils.Size(320, 50);
        }
        if (this == LEADER) {
            return new AppLovinSdkUtils.Size(728, 90);
        }
        if (this == MREC) {
            return new AppLovinSdkUtils.Size(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
        }
        return new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED;
    }

    public String toString() {
        return "MaxAdFormat{label='" + this.f9850a + "'}";
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i10, Context context) {
        if (this != BANNER && this != LEADER) {
            return getSize();
        }
        return o3.a(i10, this, context);
    }
}
