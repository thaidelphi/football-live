package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v2 extends q0 {
    public v2(Context context, SplashAd splashAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, splashAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_SPLASH, true);
    }

    @Override // com.startapp.sdk.adsbase.b
    public final void a(boolean z10) {
        super.a(z10);
        c(z10);
    }
}
