package com.ironsource.adapters.facebook.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.ads.NativeAd;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class FacebookNativeAdData extends AdapterNativeAdData {
    private Drawable mIconDrawable;
    private final NativeAd mNativeAd;

    /* JADX INFO: Access modifiers changed from: protected */
    public FacebookNativeAdData(NativeAd nativeAd, Drawable drawable) {
        this.mNativeAd = nativeAd;
        this.mIconDrawable = drawable;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("advertiser = " + this.mNativeAd.getAdvertiserName());
        return this.mNativeAd.getAdvertiserName();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("body = " + this.mNativeAd.getAdBodyText());
        return this.mNativeAd.getAdBodyText();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("cta = " + this.mNativeAd.getAdCallToAction());
        return this.mNativeAd.getAdCallToAction();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        Uri parse = this.mNativeAd.getAdIcon() != null ? Uri.parse(this.mNativeAd.getAdIcon().getUrl()) : null;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("icon uri = " + parse);
        if (this.mNativeAd.getPreloadedIconViewDrawable() != null) {
            this.mIconDrawable = this.mNativeAd.getPreloadedIconViewDrawable();
        }
        return new NativeAdDataInterface.Image(this.mIconDrawable, parse);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("headline = " + this.mNativeAd.getAdHeadline());
        return this.mNativeAd.getAdHeadline();
    }
}
