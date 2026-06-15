package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q2 extends q0 {
    public q2(Context context, OfferWallAd offerWallAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, offerWallAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, true);
    }

    @Override // com.startapp.sdk.adsbase.b
    public final void a(boolean z10) {
        super.a(z10);
        c(z10);
    }

    @Override // com.startapp.sdk.adsbase.b
    public final GetAdRequest d() {
        GetAdRequest d10 = super.d();
        if (d10 == null) {
            return null;
        }
        d10.f23127t0 = AdsCommonMetaData.f22889h.t();
        return d10;
    }
}
