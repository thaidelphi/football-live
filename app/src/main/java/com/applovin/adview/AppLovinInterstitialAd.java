package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.h2;
import com.applovin.sdk.AppLovinSdk;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinInterstitialAd {
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk != null) {
            if (context != null) {
                return new h2(appLovinSdk, context);
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }
}
