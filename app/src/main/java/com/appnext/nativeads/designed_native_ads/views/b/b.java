package com.appnext.nativeads.designed_native_ads.views.b;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.appnext.core.AppnextError;
import com.appnext.nativeads.R;
import com.appnext.nativeads.designed_native_ads.DesignNativeAdsRequest;
import com.appnext.nativeads.designed_native_ads.interfaces.AppnextDesignedNativeAdViewCallbacks;
import com.appnext.nativeads.designed_native_ads.views.models.AppnextSuggestedAppsImageSide;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends com.appnext.nativeads.designed_native_ads.views.a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appnext.nativeads.designed_native_ads.views.b.b$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] gl;

        static {
            int[] iArr = new int[AppnextSuggestedAppsImageSide.values().length];
            gl = iArr;
            try {
                iArr[AppnextSuggestedAppsImageSide.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public b(Context context) {
        super(context);
    }

    private void loadImage(int i10, AppnextSuggestedAppsImageSide appnextSuggestedAppsImageSide) {
        ImageView imageView;
        ImageView imageView2;
        try {
            if (AnonymousClass1.gl[appnextSuggestedAppsImageSide.ordinal()] != 1) {
                imageView = (ImageView) findViewById(R.id.right_image);
                imageView2 = (ImageView) findViewById(R.id.left_image);
            } else {
                imageView = (ImageView) findViewById(R.id.left_image);
                imageView2 = (ImageView) findViewById(R.id.right_image);
            }
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setBackgroundResource(i10);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsWithImageStyleView$loadImage", th);
        }
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    protected int designedNativeAdsContainerResource() {
        return R.id.suggested_apps_with_image_container;
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    protected int getContentResource() {
        return R.layout.suggested_apps_with_image_layout;
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    protected int height() {
        return 100;
    }

    public void loadWithImage(String str, int i10, AppnextSuggestedAppsImageSide appnextSuggestedAppsImageSide, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        try {
            loadDesignedNativeAds(str, null, appnextSuggestedAppsImageSide.getOppositeSide(), appnextDesignedNativeAdViewCallbacks);
            loadImage(i10, appnextSuggestedAppsImageSide);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsWithImageStyleView$loadWithImage", th);
            if (appnextDesignedNativeAdViewCallbacks != null) {
                appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(new AppnextError("Internal error"));
            }
        }
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    protected int maxSuggestedAdsCount() {
        return 4;
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a
    protected int width() {
        return 300;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public b(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void loadWithImage(String str, int i10, AppnextSuggestedAppsImageSide appnextSuggestedAppsImageSide, int i11, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        try {
            loadDesignedNativeAds(str, null, i11, appnextSuggestedAppsImageSide.getOppositeSide(), appnextDesignedNativeAdViewCallbacks);
            loadImage(i10, appnextSuggestedAppsImageSide);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsWithImageStyleView$loadWithImage", th);
            if (appnextDesignedNativeAdViewCallbacks != null) {
                appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(new AppnextError("Internal error"));
            }
        }
    }

    public void loadWithImage(String str, int i10, AppnextSuggestedAppsImageSide appnextSuggestedAppsImageSide, DesignNativeAdsRequest designNativeAdsRequest, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        try {
            loadDesignedNativeAds(str, designNativeAdsRequest, appnextSuggestedAppsImageSide.getOppositeSide(), appnextDesignedNativeAdViewCallbacks);
            loadImage(i10, appnextSuggestedAppsImageSide);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsWithImageStyleView$loadWithImage", th);
            if (appnextDesignedNativeAdViewCallbacks != null) {
                appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(new AppnextError("Internal error"));
            }
        }
    }

    public void loadWithImage(String str, int i10, AppnextSuggestedAppsImageSide appnextSuggestedAppsImageSide, DesignNativeAdsRequest designNativeAdsRequest, int i11, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        try {
            loadDesignedNativeAds(str, designNativeAdsRequest, i11, appnextSuggestedAppsImageSide.getOppositeSide(), appnextDesignedNativeAdViewCallbacks);
            loadImage(i10, appnextSuggestedAppsImageSide);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsWithImageStyleView$loadWithImage", th);
            if (appnextDesignedNativeAdViewCallbacks != null) {
                appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(new AppnextError("Internal error"));
            }
        }
    }
}
