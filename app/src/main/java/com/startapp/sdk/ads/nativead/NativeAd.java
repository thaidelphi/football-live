package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NativeAd extends JsonAd {
    private static final long serialVersionUID = 7310462914813630357L;
    private NativeAdPreferences config;

    public NativeAd(Context context, NativeAdPreferences nativeAdPreferences) {
        super(context, AdPreferences.Placement.INAPP_NATIVE);
        this.config = nativeAdPreferences;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new a(this.f22876a, this, adPreferences, adEventListener, this.config).c();
    }
}
