package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zm extends l2 {

    /* renamed from: a  reason: collision with root package name */
    private final InternalNativeAdListener f21663a;

    public zm(InternalNativeAdListener mNativeAdListener) {
        kotlin.jvm.internal.n.f(mNativeAdListener, "mNativeAdListener");
        this.f21663a = mNativeAdListener;
    }

    @Override // com.ironsource.l2
    public void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        kotlin.jvm.internal.n.f(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.n.f(nativeAdViewBinder, "nativeAdViewBinder");
        this.f21663a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.l2
    public void a(IronSourceError ironSourceError) {
        this.f21663a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.l2
    public void a(Placement placement, AdInfo adInfo) {
        kotlin.jvm.internal.n.f(placement, "placement");
        this.f21663a.onNativeAdClicked(adInfo);
    }

    @Override // com.ironsource.l2
    public void d(AdInfo adInfo) {
        this.f21663a.onNativeAdImpression(adInfo);
    }
}
