package com.startapp.sdk.ads.interstitials;

import android.content.Context;
import com.startapp.sdk.ads.video.VideoEnabledAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.t2;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ReturnAd extends VideoEnabledAd {
    private static final long serialVersionUID = -4485796021684048466L;

    public ReturnAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_RETURN);
    }

    @Override // com.startapp.sdk.ads.video.VideoEnabledAd, com.startapp.sdk.adsbase.Ad
    public final void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new t2(this.f22876a, this, adPreferences, adEventListener).c();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final long e() {
        return CacheMetaData.f23015a.a().e();
    }
}
