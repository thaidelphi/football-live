package com.appnext.nativeads.designed_native_ads.views;

import android.content.Context;
import android.util.AttributeSet;
import com.appnext.nativeads.designed_native_ads.DesignNativeAdsRequest;
import com.appnext.nativeads.designed_native_ads.interfaces.AppnextDesignedNativeAdViewCallbacks;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppnextDesignedNativeAdView extends com.appnext.nativeads.designed_native_ads.views.b.a {
    public AppnextDesignedNativeAdView(Context context) {
        this(context, null, 0);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.b.a
    public void load(String str, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        super.load(str, (DesignNativeAdsRequest) null, appnextDesignedNativeAdViewCallbacks);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    public void setAppTitleColor(int i10) {
        super.setAppTitleColor(i10);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a, android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    public void setLocalDirection(boolean z10) {
        super.setLocalDirection(z10);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    public void setPresentAppTitles(boolean z10) {
        super.setPresentAppTitles(z10);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    public void setTitle(String str) {
        super.setTitle(str);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    public void setTitleColor(int i10) {
        super.setTitleColor(i10);
    }

    public void setTitleTextSizeInSP(float f10) {
        super.setTitleTextSize(f10);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    public void setTransparency(int i10) {
        super.setTransparency(i10);
    }

    public AppnextDesignedNativeAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.b.a
    public void load(String str, int i10, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        super.load(str, null, i10, appnextDesignedNativeAdViewCallbacks);
    }

    public AppnextDesignedNativeAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.b.a
    public void load(String str, DesignNativeAdsRequest designNativeAdsRequest, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        super.load(str, designNativeAdsRequest, appnextDesignedNativeAdViewCallbacks);
    }

    public AppnextDesignedNativeAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.b.a
    public void load(String str, DesignNativeAdsRequest designNativeAdsRequest, int i10, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        super.load(str, designNativeAdsRequest, i10, appnextDesignedNativeAdViewCallbacks);
    }
}
