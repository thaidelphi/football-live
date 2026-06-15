package com.appnext.nativeads.designed_native_ads.views.b;

import android.content.Context;
import android.util.AttributeSet;
import com.appnext.nativeads.R;
import com.appnext.nativeads.designed_native_ads.DesignNativeAdsRequest;
import com.appnext.nativeads.designed_native_ads.interfaces.AppnextDesignedNativeAdViewCallbacks;
import com.appnext.nativeads.designed_native_ads.views.models.AppnextSuggestedAppsImageSide;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends com.appnext.nativeads.designed_native_ads.views.a {
    public a(Context context) {
        super(context);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    protected int designedNativeAdsContainerResource() {
        return R.id.regular_suggested_apps_container;
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    protected int getContentResource() {
        return R.layout.suggested_apps_regular_layout;
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    protected int height() {
        return 105;
    }

    public void load(String str, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        loadDesignedNativeAds(str, null, AppnextSuggestedAppsImageSide.Right, appnextDesignedNativeAdViewCallbacks);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    protected int maxSuggestedAdsCount() {
        return 5;
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    protected int width() {
        return -1;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void load(String str, int i10, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        loadDesignedNativeAds(str, null, i10, AppnextSuggestedAppsImageSide.Right, appnextDesignedNativeAdViewCallbacks);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void load(String str, DesignNativeAdsRequest designNativeAdsRequest, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        loadDesignedNativeAds(str, designNativeAdsRequest, AppnextSuggestedAppsImageSide.Right, appnextDesignedNativeAdViewCallbacks);
    }

    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void load(String str, DesignNativeAdsRequest designNativeAdsRequest, int i10, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        loadDesignedNativeAds(str, designNativeAdsRequest, i10, AppnextSuggestedAppsImageSide.Right, appnextDesignedNativeAdViewCallbacks);
    }
}
