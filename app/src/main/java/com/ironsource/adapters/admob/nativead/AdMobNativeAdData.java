package com.ironsource.adapters.admob.nativead;

import com.google.android.gms.ads.nativead.NativeAd;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AdMobNativeAdData extends AdapterNativeAdData {
    private NativeAd mNativeAd;

    public AdMobNativeAdData(NativeAd nativeAd) {
        this.mNativeAd = nativeAd;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("advertiser = " + this.mNativeAd.getAdvertiser());
        return this.mNativeAd.getAdvertiser();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("body = " + this.mNativeAd.getBody());
        return this.mNativeAd.getBody();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("cta = " + this.mNativeAd.getCallToAction());
        return this.mNativeAd.getCallToAction();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        NativeAd.Image icon = this.mNativeAd.getIcon();
        if (icon != null) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("icon uri = " + icon.getUri());
            return new NativeAdDataInterface.Image(icon.getDrawable(), icon.getUri());
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("headline = " + this.mNativeAd.getHeadline());
        return this.mNativeAd.getHeadline();
    }
}
