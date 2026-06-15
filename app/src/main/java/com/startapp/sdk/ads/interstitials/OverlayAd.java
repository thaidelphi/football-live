package com.startapp.sdk.ads.interstitials;

import android.content.Context;
import com.startapp.s2;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class OverlayAd extends InterstitialAd {
    private static final long serialVersionUID = -8754609707252409666L;

    public OverlayAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new s2(this.f22876a, this, adPreferences, adEventListener).c();
    }
}
