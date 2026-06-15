package com.startapp.sdk.ads.splash;

import android.content.Context;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.v2;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SplashAd extends InterstitialAd {
    private static final long serialVersionUID = 1805498910943656534L;

    public SplashAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new v2(this.f22876a, this, adPreferences, adEventListener).c();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    @Deprecated
    public final void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        super.load(adPreferences, adEventListener, false);
    }
}
