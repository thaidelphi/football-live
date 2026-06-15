package com.applovin.impl;

import android.webkit.WebView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class y3 extends v3 {
    public y3(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.v3
    protected AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f9452b.V().b(), this.f9452b.V().a(), this.f9451a.getOpenMeasurementVerificationScriptResources(), this.f9451a.getOpenMeasurementContentUrl(), this.f9451a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9453c.a(this.f9454d, "Failed to create ad session context", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.v3
    protected AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9453c.a(this.f9454d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }
}
