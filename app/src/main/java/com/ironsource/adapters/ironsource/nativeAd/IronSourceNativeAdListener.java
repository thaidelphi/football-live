package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.rh;
import com.ironsource.th;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class IronSourceNativeAdListener implements th.a {
    private final IronSourceNativeAdViewBinder binder;
    private final NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(IronSourceNativeAdViewBinder binder, NativeAdSmashListener smashListener) {
        n.f(binder, "binder");
        n.f(smashListener, "smashListener");
        this.binder = binder;
        this.smashListener = smashListener;
    }

    @Override // com.ironsource.th.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.th.a
    public void onNativeAdLoadFailed(String reason) {
        n.f(reason, "reason");
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(510, "Load failed - " + reason));
    }

    @Override // com.ironsource.th.a
    public void onNativeAdLoadSuccess(rh adData) {
        n.f(adData, "adData");
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(adData), this.binder);
    }

    @Override // com.ironsource.th.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}
