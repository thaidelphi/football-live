package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.r0;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends r0 {

    /* renamed from: i  reason: collision with root package name */
    public final NativeAdPreferences f22690i;

    public a(Context context, Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, NativeAdPreferences nativeAdPreferences) {
        super(context, ad, adPreferences, adEventListener, AdPreferences.Placement.INAPP_NATIVE);
        this.f22690i = nativeAdPreferences;
    }

    @Override // com.startapp.r0
    public final void a(JsonAd jsonAd) {
    }

    @Override // com.startapp.sdk.adsbase.b
    public final GetAdRequest d() {
        GetAdRequest d10 = super.d();
        if (d10 == null) {
            return null;
        }
        d10.f23127t0 = this.f22690i.getAdsNumber();
        if (this.f22690i.getImageSize() != null) {
            d10.L = this.f22690i.getImageSize().getWidth();
            d10.M = this.f22690i.getImageSize().getHeight();
        } else {
            int primaryImageSize = this.f22690i.getPrimaryImageSize();
            if (primaryImageSize == -1) {
                primaryImageSize = 2;
            }
            d10.P0 = Integer.toString(primaryImageSize);
            int secondaryImageSize = this.f22690i.getSecondaryImageSize();
            d10.Q0 = Integer.toString(secondaryImageSize != -1 ? secondaryImageSize : 2);
        }
        if (this.f22690i.isContentAd()) {
            d10.R0 = this.f22690i.isContentAd();
        }
        return d10;
    }
}
