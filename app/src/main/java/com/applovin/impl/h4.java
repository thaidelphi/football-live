package com.applovin.impl;

import android.adservices.AdServicesState;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class h4 {
    public static boolean a(Context context) {
        return l0.a("android.permission.ACCESS_ADSERVICES_AD_ID", context);
    }

    public static boolean b(Context context) {
        return l0.a("android.permission.ACCESS_ADSERVICES_ATTRIBUTION", context);
    }

    public static boolean c(Context context) {
        return l0.a("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE", context);
    }

    public static boolean d(Context context) {
        return l0.a("android.permission.ACCESS_ADSERVICES_TOPICS", context);
    }

    public static boolean e(Context context) {
        return f(context) && AdServicesState.isAdServicesStateEnabled();
    }

    public static boolean f(Context context) {
        return l0.c() && !AppLovinSdkUtils.isFireOS(context);
    }
}
