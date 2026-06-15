package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.m0;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinPrivacySettings {
    public static Boolean getAdditionalConsentStatus(int i10) {
        j jVar = j.f8884u0;
        if (jVar == null) {
            n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getAdditionalConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return jVar.j0().a(i10);
    }

    public static Boolean getPurposeConsentStatus(int i10) {
        j jVar = j.f8884u0;
        if (jVar == null) {
            n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getPurposeConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return jVar.j0().b(i10);
    }

    public static Boolean getSpecialFeatureOptInStatus(int i10) {
        j jVar = j.f8884u0;
        if (jVar == null) {
            n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getSpecialFeatureOptInStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return jVar.j0().c(i10);
    }

    public static Boolean getTcfVendorConsentStatus(int i10) {
        j jVar = j.f8884u0;
        if (jVar == null) {
            n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getTcfVendorConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return jVar.j0().d(i10);
    }

    public static boolean hasUserConsent(Context context) {
        Boolean b10 = m0.b().b(context);
        if (b10 != null) {
            return b10.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSell(Context context) {
        Boolean b10 = m0.a().b(context);
        if (b10 != null) {
            return b10.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        return m0.a().b(context) != null;
    }

    public static boolean isUserConsentSet(Context context) {
        return m0.b().b(context) != null;
    }

    public static void setDoNotSell(boolean z10, Context context) {
        n.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (m0.a(z10, context)) {
            AppLovinSdk.reinitializeAll(null, Boolean.valueOf(z10));
        }
    }

    public static void setHasUserConsent(boolean z10, Context context) {
        n.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (m0.b(z10, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z10), null);
        }
    }
}
