package com.applovin.mediation.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.GoogleMediationAdapter;
import com.applovin.mediation.adapters.google.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GoogleMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final String ADAPTIVE_BANNER_TYPE_INLINE = "inline";
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int ICON_VIEW_TAG = 3;
    private static final int MEDIA_VIEW_CONTAINER_TAG = 2;
    private static final int TITLE_LABEL_TAG = 1;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private AdView adView;
    private AppOpenAd appOpenAd;
    private AppOpenAdListener appOpenAdListener;
    private InterstitialAd interstitialAd;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private RewardedAd rewardedAd;
    private RewardedAdListener rewardedAdListener;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class AdViewListener extends AdListener {
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final String placementId;

        AdViewListener(String str, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = str;
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log(this.adFormat.getLabel() + " ad closed");
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log(this.adFormat.getLabel() + " ad (" + this.placementId + ") failed to load with error code: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log(this.adFormat.getLabel() + " ad shown: " + this.placementId);
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log(this.adFormat.getLabel() + " ad loaded: " + this.placementId);
            Bundle bundle = new Bundle(3);
            ResponseInfo responseInfo = GoogleMediationAdapter.this.adView.getResponseInfo();
            String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
            if (AppLovinSdkUtils.isValidString(responseId)) {
                bundle.putString("creative_id", responseId);
            }
            AdSize adSize = GoogleMediationAdapter.this.adView.getAdSize();
            if (adSize != null) {
                bundle.putInt("ad_width", adSize.getWidth());
                bundle.putInt("ad_height", adSize.getHeight());
            }
            this.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.adView, bundle);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log(this.adFormat.getLabel() + " ad opened");
            this.listener.onAdViewAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class AppOpenAdListener extends FullScreenContentCallback {
        private final MaxAppOpenAdapterListener listener;
        private final String placementId;

        AppOpenAdListener(String str, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
            this.placementId = str;
            this.listener = maxAppOpenAdapterListener;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("App open ad clicked: " + this.placementId);
            this.listener.onAppOpenAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("App open ad hidden: " + this.placementId);
            this.listener.onAppOpenAdHidden();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("App open ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onAppOpenAdDisplayFailed(maxAdapterError);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("App open ad impression recorded: " + this.placementId);
            this.listener.onAppOpenAdDisplayed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("App open ad shown: " + this.placementId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class AutoMeasuringMediaView extends MediaView {
        AutoMeasuringMediaView(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$requestLayout$0() {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            layout(getLeft(), getTop(), getRight(), getBottom());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            requestLayout();
        }

        @Override // android.view.View, android.view.ViewParent
        public void requestLayout() {
            super.requestLayout();
            post(new Runnable() { // from class: com.applovin.mediation.adapters.d
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleMediationAdapter.AutoMeasuringMediaView.this.lambda$requestLayout$0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class InterstitialAdListener extends FullScreenContentCallback {
        private final MaxInterstitialAdapterListener listener;
        private final String placementId;

        InterstitialAdListener(String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.placementId = str;
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Interstitial ad clicked: " + this.placementId);
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Interstitial ad hidden: " + this.placementId);
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Interstitial ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Interstitial ad impression recorded: " + this.placementId);
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Interstitial ad shown: " + this.placementId);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class MaxGoogleNativeAd extends MaxNativeAd {
        public MaxGoogleNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            MediaView mediaView;
            MediaContent mediaContent;
            NativeAd nativeAd = GoogleMediationAdapter.this.nativeAd;
            if (nativeAd != null) {
                GoogleMediationAdapter.this.nativeAdView = new NativeAdView(viewGroup.getContext());
                if (viewGroup instanceof MaxNativeAdView) {
                    MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
                    View mainView = maxNativeAdView.getMainView();
                    maxNativeAdView.removeView(mainView);
                    GoogleMediationAdapter.this.nativeAdView.addView(mainView);
                    maxNativeAdView.addView(GoogleMediationAdapter.this.nativeAdView);
                    GoogleMediationAdapter.this.nativeAdView.setIconView(maxNativeAdView.getIconImageView());
                    GoogleMediationAdapter.this.nativeAdView.setHeadlineView(maxNativeAdView.getTitleTextView());
                    GoogleMediationAdapter.this.nativeAdView.setAdvertiserView(maxNativeAdView.getAdvertiserTextView());
                    GoogleMediationAdapter.this.nativeAdView.setBodyView(maxNativeAdView.getBodyTextView());
                    GoogleMediationAdapter.this.nativeAdView.setCallToActionView(maxNativeAdView.getCallToActionButton());
                    View mediaView2 = getMediaView();
                    if (mediaView2 instanceof MediaView) {
                        GoogleMediationAdapter.this.nativeAdView.setMediaView((MediaView) mediaView2);
                    } else if (mediaView2 instanceof ImageView) {
                        GoogleMediationAdapter.this.nativeAdView.setImageView(mediaView2);
                    }
                    GoogleMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
                } else {
                    View view = null;
                    for (View view2 : list) {
                        Object tag = view2.getTag();
                        if (tag != null) {
                            int intValue = ((Integer) tag).intValue();
                            if (intValue == 1) {
                                GoogleMediationAdapter.this.nativeAdView.setHeadlineView(view2);
                            } else if (intValue == 3) {
                                GoogleMediationAdapter.this.nativeAdView.setIconView(view2);
                            } else if (intValue == 4) {
                                GoogleMediationAdapter.this.nativeAdView.setBodyView(view2);
                            } else if (intValue == 5) {
                                GoogleMediationAdapter.this.nativeAdView.setCallToActionView(view2);
                            } else if (intValue == 8) {
                                GoogleMediationAdapter.this.nativeAdView.setAdvertiserView(view2);
                            } else if (intValue == 2) {
                                view = getMediaView();
                            }
                        }
                    }
                    if (view != null) {
                        viewGroup = (ViewGroup) view.getParent();
                    }
                    if (viewGroup == null) {
                        return true;
                    }
                    boolean z10 = (viewGroup instanceof RelativeLayout) || (viewGroup instanceof FrameLayout);
                    if (view != null) {
                        viewGroup.removeView(view);
                        if (!z10 && (view instanceof MediaView) && (mediaContent = (mediaView = (MediaView) view).getMediaContent()) != null && mediaContent.hasVideoContent()) {
                            view = new AutoMeasuringMediaView(viewGroup.getContext());
                            mediaView.setMediaContent(nativeAd.getMediaContent());
                        }
                        GoogleMediationAdapter.this.nativeAdView.addView(view, new ViewGroup.LayoutParams(-1, -1));
                        if (view instanceof MediaView) {
                            GoogleMediationAdapter.this.nativeAdView.setMediaView((MediaView) view);
                        } else if (view instanceof ImageView) {
                            GoogleMediationAdapter.this.nativeAdView.setImageView((ImageView) view);
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        View view3 = new View(viewGroup.getContext());
                        GoogleMediationAdapter.this.nativeAdView.addView(view3, layoutParams);
                        GoogleMediationAdapter.this.nativeAdView.setStoreView(view3);
                    }
                    GoogleMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
                    if (z10) {
                        viewGroup.addView(GoogleMediationAdapter.this.nativeAdView, new ViewGroup.LayoutParams(-1, -1));
                    } else {
                        GoogleMediationAdapter.this.nativeAdView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 1073741824));
                        GoogleMediationAdapter.this.nativeAdView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                        viewGroup.addView(GoogleMediationAdapter.this.nativeAdView);
                    }
                }
                return true;
            }
            GoogleMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
            return false;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class NativeAdListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
        final Context context;
        final MaxNativeAdAdapterListener listener;
        final String placementId;
        final Bundle serverParameters;

        public NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            GoogleMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleMediationAdapter.this.log("Native ad closed");
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native ad (" + this.placementId + ") failed to load with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleMediationAdapter.this.log("Native ad shown");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleMediationAdapter.this.log("Native ad opened");
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(final NativeAd nativeAd) {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native ad loaded: " + this.placementId);
            GoogleMediationAdapter.this.nativeAd = nativeAd;
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) && TextUtils.isEmpty(nativeAd.getHeadline())) {
                GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
                googleMediationAdapter2.e("Native ad (" + nativeAd + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.NativeAdListener.1
                @Override // java.lang.Runnable
                public void run() {
                    float f10;
                    MediaView mediaView;
                    Drawable drawable;
                    MaxNativeAd.MaxNativeAdImage maxNativeAdImage;
                    MediaContent mediaContent = nativeAd.getMediaContent();
                    List<NativeAd.Image> images = nativeAd.getImages();
                    if (mediaContent != null) {
                        MediaView mediaView2 = new MediaView(NativeAdListener.this.context);
                        mediaView2.setMediaContent(mediaContent);
                        drawable = mediaContent.getMainImage();
                        f10 = mediaContent.getAspectRatio();
                        mediaView = mediaView2;
                    } else {
                        if (images != null && images.size() > 0) {
                            ImageView imageView = new ImageView(NativeAdListener.this.context);
                            Drawable drawable2 = images.get(0).getDrawable();
                            if (drawable2 != null) {
                                imageView.setImageDrawable(drawable2);
                                f10 = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
                                drawable = null;
                                mediaView = imageView;
                            }
                        }
                        f10 = 0.0f;
                        mediaView = null;
                        drawable = null;
                    }
                    NativeAd.Image icon = nativeAd.getIcon();
                    if (icon == null) {
                        maxNativeAdImage = null;
                    } else if (icon.getDrawable() != null) {
                        maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(icon.getDrawable());
                    } else {
                        maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(icon.getUri());
                    }
                    MaxGoogleNativeAd maxGoogleNativeAd = new MaxGoogleNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(nativeAd.getHeadline()).setAdvertiser(nativeAd.getAdvertiser()).setBody(nativeAd.getBody()).setCallToAction(nativeAd.getCallToAction()).setIcon(maxNativeAdImage).setMediaView(mediaView).setMainImage(new MaxNativeAd.MaxNativeAdImage(drawable)).setMediaContentAspectRatio(f10).setStarRating(nativeAd.getStarRating()));
                    ResponseInfo responseInfo = nativeAd.getResponseInfo();
                    String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                    Bundle bundle = new Bundle(1);
                    bundle.putString("creative_id", responseId);
                    NativeAdListener.this.listener.onNativeAdLoaded(maxGoogleNativeAd, bundle);
                }
            });
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class NativeAdViewListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
        final WeakReference<Activity> activityRef;
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final String placementId;
        final Bundle serverParameters;

        NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.activityRef = new WeakReference<>(activity);
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad closed");
            this.listener.onAdViewAdCollapsed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad (" + this.placementId + ") failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad shown");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad opened");
            this.listener.onAdViewAdExpanded();
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(final NativeAd nativeAd) {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Native " + this.adFormat.getLabel() + " ad loaded: " + this.placementId);
            if (!TextUtils.isEmpty(nativeAd.getHeadline())) {
                GoogleMediationAdapter.this.nativeAd = nativeAd;
                final Context context = GoogleMediationAdapter.this.getContext(this.activityRef.get());
                final MediaView mediaView = new MediaView(context);
                MediaContent mediaContent = nativeAd.getMediaContent();
                if (mediaContent != null) {
                    mediaView.setMediaContent(mediaContent);
                }
                NativeAd.Image icon = nativeAd.getIcon();
                MaxNativeAd.MaxNativeAdImage maxNativeAdImage = null;
                if (icon != null) {
                    if (icon.getDrawable() != null) {
                        maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(icon.getDrawable());
                    } else {
                        maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(icon.getUri());
                    }
                }
                final MaxNativeAd build = new MaxNativeAd.Builder().setAdFormat(this.adFormat).setTitle(nativeAd.getHeadline()).setBody(nativeAd.getBody()).setCallToAction(nativeAd.getCallToAction()).setIcon(maxNativeAdImage).setMediaView(mediaView).build();
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.NativeAdViewListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(build, BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters), context);
                        GoogleMediationAdapter.this.nativeAdView = new NativeAdView(context);
                        GoogleMediationAdapter.this.nativeAdView.setIconView(maxNativeAdView.getIconImageView());
                        GoogleMediationAdapter.this.nativeAdView.setHeadlineView(maxNativeAdView.getTitleTextView());
                        GoogleMediationAdapter.this.nativeAdView.setBodyView(maxNativeAdView.getBodyTextView());
                        GoogleMediationAdapter.this.nativeAdView.setMediaView(mediaView);
                        GoogleMediationAdapter.this.nativeAdView.setCallToActionView(maxNativeAdView.getCallToActionButton());
                        GoogleMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
                        GoogleMediationAdapter.this.nativeAdView.addView(maxNativeAdView);
                        ResponseInfo responseInfo = nativeAd.getResponseInfo();
                        String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                        if (AppLovinSdkUtils.isValidString(responseId)) {
                            Bundle bundle = new Bundle(1);
                            bundle.putString("creative_id", responseId);
                            NativeAdViewListener nativeAdViewListener = NativeAdViewListener.this;
                            nativeAdViewListener.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.nativeAdView, bundle);
                            return;
                        }
                        NativeAdViewListener nativeAdViewListener2 = NativeAdViewListener.this;
                        nativeAdViewListener2.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.nativeAdView);
                    }
                });
                return;
            }
            GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
            googleMediationAdapter2.log("Native " + this.adFormat.getLabel() + " ad failed to load: Google native ad is missing one or more required assets");
            this.listener.onAdViewAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
            nativeAd.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class RewardedAdListener extends FullScreenContentCallback {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;
        private final String placementId;

        RewardedAdListener(String str, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.placementId = str;
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Rewarded ad clicked: " + this.placementId);
            this.listener.onRewardedAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            if (this.hasGrantedReward || GoogleMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = GoogleMediationAdapter.this.getReward();
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
            googleMediationAdapter2.log("Rewarded ad hidden: " + this.placementId);
            this.listener.onRewardedAdHidden();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Rewarded ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Rewarded ad impression recorded: " + this.placementId);
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            googleMediationAdapter.log("Rewarded ad shown: " + this.placementId);
        }
    }

    public GoogleMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    @SuppressLint({"ApplySharedPref"})
    private AdRequest createAdRequestWithParameters(boolean z10, MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters, Context context) {
        boolean z11;
        AdRequest.Builder builder = new AdRequest.Builder();
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        Bundle bundle = new Bundle(6);
        if (z10) {
            z11 = "dv360".equalsIgnoreCase(BundleUtils.getString("bidder", "", serverParameters));
            bundle.putString("query_info_type", z11 ? "requester_type_3" : "requester_type_2");
            if (maxAdFormat.isAdViewAd()) {
                Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner");
                if ((obj instanceof String) && com.ironsource.mediationsdk.metadata.a.f18924g.equalsIgnoreCase((String) obj)) {
                    AdSize adSize = toAdSize(maxAdFormat, true, maxAdapterParameters, context);
                    bundle.putInt("adaptive_banner_w", adSize.getWidth());
                    bundle.putInt("adaptive_banner_h", adSize.getHeight());
                }
            }
            if (maxAdapterParameters instanceof MaxAdapterResponseParameters) {
                String bidResponse = ((MaxAdapterResponseParameters) maxAdapterParameters).getBidResponse();
                if (AppLovinSdkUtils.isValidString(bidResponse)) {
                    builder.setAdString(bidResponse);
                }
            }
        } else {
            z11 = false;
        }
        builder.setRequestAgent(z11 ? "applovin_dv360" : "applovin");
        String string = BundleUtils.getString("event_id", serverParameters);
        if (AppLovinSdkUtils.isValidString(string)) {
            bundle.putString("placement_req_id", string);
        }
        Boolean hasUserConsent = maxAdapterParameters.hasUserConsent();
        if (hasUserConsent != null && !hasUserConsent.booleanValue()) {
            bundle.putString("npa", "1");
        }
        Boolean isDoNotSell = maxAdapterParameters.isDoNotSell();
        if (isDoNotSell != null && isDoNotSell.booleanValue()) {
            bundle.putInt("rdp", 1);
            PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("gad_rdp", 1).apply();
        } else {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove("gad_rdp").apply();
        }
        Map<String, Object> localExtraParameters = maxAdapterParameters.getLocalExtraParameters();
        Object obj2 = localExtraParameters.get("google_max_ad_content_rating");
        if (obj2 instanceof String) {
            bundle.putString("max_ad_content_rating", (String) obj2);
        }
        Object obj3 = localExtraParameters.get("google_content_url");
        if (obj3 instanceof String) {
            builder.setContentUrl((String) obj3);
        }
        Object obj4 = localExtraParameters.get("google_neighbouring_content_url_strings");
        if (obj4 instanceof List) {
            try {
                builder.setNeighboringContentUrls((List) obj4);
            } catch (Throwable th) {
                e("Neighbouring content URL strings extra param needs to be of type List<String>.", th);
            }
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        return builder.build();
    }

    private int getAdChoicesPlacement(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        Object obj = localExtraParameters != null ? localExtraParameters.get("admob_ad_choices_placement") : null;
        if (isValidAdChoicesPlacement(obj)) {
            return ((Integer) obj).intValue();
        }
        return 1;
    }

    private AdSize getAdaptiveAdSize(MaxAdapterParameters maxAdapterParameters, Context context) {
        int adaptiveBannerWidth = getAdaptiveBannerWidth(maxAdapterParameters, context);
        if (isInlineAdaptiveBanner(maxAdapterParameters)) {
            int inlineAdaptiveBannerMaxHeight = getInlineAdaptiveBannerMaxHeight(maxAdapterParameters);
            if (inlineAdaptiveBannerMaxHeight > 0) {
                return AdSize.getInlineAdaptiveBannerAdSize(adaptiveBannerWidth, inlineAdaptiveBannerMaxHeight);
            }
            return AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, adaptiveBannerWidth);
        }
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adaptiveBannerWidth);
    }

    private int getAdaptiveBannerWidth(MaxAdapterParameters maxAdapterParameters, Context context) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_width");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj != null) {
            e("Expected parameter \"adaptive_banner_width\" to be of type Integer, received: " + obj.getClass());
        }
        return AppLovinSdkUtils.pxToDp(context, getApplicationWindowWidth(context));
    }

    public static int getApplicationWindowWidth(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private int getInlineAdaptiveBannerMaxHeight(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("inline_adaptive_banner_max_height");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    private boolean isAdaptiveAdFormat(MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters) {
        return (maxAdFormat == MaxAdFormat.MREC && isInlineAdaptiveBanner(maxAdapterParameters)) || maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER;
    }

    private boolean isInlineAdaptiveBanner(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_type");
        return (obj instanceof String) && ADAPTIVE_BANNER_TYPE_INLINE.equalsIgnoreCase((String) obj);
    }

    private boolean isValidAdChoicesPlacement(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0(MaxAdapter.OnCompletionListener onCompletionListener, InitializationStatus initializationStatus) {
        AdapterStatus adapterStatus = initializationStatus.getAdapterStatusMap().get("com.google.android.gms.ads.MobileAds");
        AdapterStatus.State initializationState = adapterStatus != null ? adapterStatus.getInitializationState() : null;
        log("Initialization complete with status " + initializationState);
        MaxAdapter.InitializationStatus initializationStatus2 = AdapterStatus.State.READY == initializationState ? MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS : MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN;
        status = initializationStatus2;
        onCompletionListener.onCompletion(initializationStatus2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showRewardedAd$1(String str, RewardItem rewardItem) {
        log("Rewarded ad user earned reward: " + str);
        this.rewardedAdListener.hasGrantedReward = true;
    }

    private AdFormat toAdFormat(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters) {
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        if (maxAdapterSignalCollectionParameters.getServerParameters().getBoolean("is_native") || adFormat == MaxAdFormat.NATIVE) {
            return AdFormat.NATIVE;
        }
        if (adFormat.isAdViewAd()) {
            return AdFormat.BANNER;
        }
        if (adFormat == MaxAdFormat.INTERSTITIAL) {
            return AdFormat.INTERSTITIAL;
        }
        if (adFormat == MaxAdFormat.REWARDED) {
            return AdFormat.REWARDED;
        }
        if (adFormat == MaxAdFormat.APP_OPEN) {
            return AdFormat.APP_OPEN_AD;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + adFormat);
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat, boolean z10, MaxAdapterParameters maxAdapterParameters, Context context) {
        if (z10 && isAdaptiveAdFormat(maxAdFormat, maxAdapterParameters)) {
            return getAdaptiveAdSize(maxAdapterParameters, context);
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.LEADERBOARD;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(AdError adError) {
        int code = adError.getCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (code != 0) {
            if (code != 1) {
                if (code != 2) {
                    if (code != 3) {
                        switch (code) {
                            case 8:
                            case 11:
                                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                                break;
                        }
                    }
                    maxAdapterError = MaxAdapterError.NO_FILL;
                } else {
                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                }
            }
            maxAdapterError = MaxAdapterError.BAD_REQUEST;
        } else {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), code, adError.getMessage());
    }

    private static void updateMuteState(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        if (serverParameters.containsKey("is_muted")) {
            MobileAds.setAppMuted(serverParameters.getBoolean("is_muted"));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        Context context = getContext(activity);
        QueryInfo.generate(context, toAdFormat(maxAdapterSignalCollectionParameters), createAdRequestWithParameters(true, maxAdapterSignalCollectionParameters.getAdFormat(), maxAdapterSignalCollectionParameters, context), new QueryInfoGenerationCallback() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.1
            @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
            public void onFailure(String str) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Signal collection failed with error: " + str);
                maxSignalCollectionListener.onSignalCollectionFailed(str);
            }

            @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
            public void onSuccess(QueryInfo queryInfo) {
                GoogleMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(queryInfo.getQuery());
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return String.valueOf(MobileAds.getVersion());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    @SuppressLint({"MissingPermission"})
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        log("Initializing Google SDK...");
        if (initialized.compareAndSet(false, true)) {
            Context context = getContext(activity);
            MobileAds.disableMediationAdapterInitialization(context);
            if (maxAdapterInitializationParameters.getServerParameters().getBoolean("init_without_callback", false)) {
                status = MaxAdapter.InitializationStatus.DOES_NOT_APPLY;
                MobileAds.initialize(context);
                onCompletionListener.onCompletion(status, null);
                return;
            }
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            MobileAds.initialize(context, new OnInitializationCompleteListener() { // from class: com.applovin.mediation.adapters.c
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    GoogleMediationAdapter.this.lambda$initialize$0(onCompletionListener, initializationStatus);
                }
            });
            return;
        }
        onCompletionListener.onCompletion(status, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    @SuppressLint({"MissingPermission"})
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append(z10 ? "native " : "");
        sb.append(maxAdFormat.getLabel());
        sb.append(" ad for placement id: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        Context context = getContext(activity);
        AdRequest createAdRequestWithParameters = createAdRequestWithParameters(isValidString, maxAdFormat, maxAdapterResponseParameters, context);
        if (z10) {
            NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
            builder.setAdChoicesPlacement(getAdChoicesPlacement(maxAdapterResponseParameters));
            builder.setRequestMultipleImages(maxAdFormat == MaxAdFormat.MREC);
            NativeAdViewListener nativeAdViewListener = new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, activity, maxAdViewAdapterListener);
            new AdLoader.Builder(context, thirdPartyAdPlacementId).withNativeAdOptions(builder.build()).forNativeAd(nativeAdViewListener).withAdListener(nativeAdViewListener).build().loadAd(createAdRequestWithParameters);
            return;
        }
        AdView adView = new AdView(context);
        this.adView = adView;
        adView.setAdUnitId(thirdPartyAdPlacementId);
        this.adView.setAdListener(new AdViewListener(thirdPartyAdPlacementId, maxAdFormat, maxAdViewAdapterListener));
        this.adView.setAdSize(toAdSize(maxAdFormat, maxAdapterResponseParameters.getServerParameters().getBoolean("adaptive_banner", false), maxAdapterResponseParameters, context));
        this.adView.loadAd(createAdRequestWithParameters);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("app open ad: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        updateMuteState(maxAdapterResponseParameters);
        Context context = getContext(activity);
        AppOpenAd.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(isValidString, MaxAdFormat.APP_OPEN, maxAdapterResponseParameters, context), new AppOpenAd.AppOpenAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.3
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("App open ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + maxError);
                maxAppOpenAdapterListener.onAppOpenAdLoadFailed(maxError);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(AppOpenAd appOpenAd) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("App open ad loaded: " + thirdPartyAdPlacementId + "...");
                GoogleMediationAdapter.this.appOpenAd = appOpenAd;
                GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
                googleMediationAdapter2.appOpenAdListener = new AppOpenAdListener(thirdPartyAdPlacementId, maxAppOpenAdapterListener);
                appOpenAd.setFullScreenContentCallback(GoogleMediationAdapter.this.appOpenAdListener);
                ResponseInfo responseInfo = GoogleMediationAdapter.this.appOpenAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdkUtils.isValidString(responseId)) {
                    Bundle bundle = new Bundle(1);
                    bundle.putString("creative_id", responseId);
                    maxAppOpenAdapterListener.onAppOpenAdLoaded(bundle);
                    return;
                }
                maxAppOpenAdapterListener.onAppOpenAdLoaded();
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("interstitial ad: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        updateMuteState(maxAdapterResponseParameters);
        Context context = getContext(activity);
        InterstitialAd.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(isValidString, MaxAdFormat.INTERSTITIAL, maxAdapterResponseParameters, context), new InterstitialAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.2
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Interstitial ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + maxError);
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(maxError);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Interstitial ad loaded: " + thirdPartyAdPlacementId + "...");
                GoogleMediationAdapter.this.interstitialAd = interstitialAd;
                GoogleMediationAdapter.this.interstitialAd.setFullScreenContentCallback(new InterstitialAdListener(thirdPartyAdPlacementId, maxInterstitialAdapterListener));
                ResponseInfo responseInfo = GoogleMediationAdapter.this.interstitialAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdkUtils.isValidString(responseId)) {
                    Bundle bundle = new Bundle(1);
                    bundle.putString("creative_id", responseId);
                    maxInterstitialAdapterListener.onInterstitialAdLoaded(bundle);
                    return;
                }
                maxInterstitialAdapterListener.onInterstitialAdLoaded();
            }
        });
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    @SuppressLint({"MissingPermission"})
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append(" native ad for placement id: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        Context context = getContext(activity);
        AdRequest createAdRequestWithParameters = createAdRequestWithParameters(isValidString, MaxAdFormat.NATIVE, maxAdapterResponseParameters, context);
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        builder.setAdChoicesPlacement(getAdChoicesPlacement(maxAdapterResponseParameters));
        builder.setRequestMultipleImages(BundleUtils.getString("template", "", maxAdapterResponseParameters.getServerParameters()).contains("medium"));
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, context, maxNativeAdAdapterListener);
        new AdLoader.Builder(context, thirdPartyAdPlacementId).withNativeAdOptions(builder.build()).forNativeAd(nativeAdListener).withAdListener(nativeAdListener).build().loadAd(createAdRequestWithParameters);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean isValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("rewarded ad: ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        updateMuteState(maxAdapterResponseParameters);
        Context context = getContext(activity);
        RewardedAd.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(isValidString, MaxAdFormat.REWARDED, maxAdapterResponseParameters, context), new RewardedAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.4
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + maxError);
                maxRewardedAdapterListener.onRewardedAdLoadFailed(maxError);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedAd rewardedAd) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.log("Rewarded ad loaded: " + thirdPartyAdPlacementId + "...");
                GoogleMediationAdapter.this.rewardedAd = rewardedAd;
                GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
                googleMediationAdapter2.rewardedAdListener = new RewardedAdListener(thirdPartyAdPlacementId, maxRewardedAdapterListener);
                GoogleMediationAdapter.this.rewardedAd.setFullScreenContentCallback(GoogleMediationAdapter.this.rewardedAdListener);
                ResponseInfo responseInfo = GoogleMediationAdapter.this.rewardedAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdkUtils.isValidString(responseId)) {
                    Bundle bundle = new Bundle(1);
                    bundle.putString("creative_id", responseId);
                    maxRewardedAdapterListener.onRewardedAdLoaded(bundle);
                    return;
                }
                maxRewardedAdapterListener.onRewardedAdLoaded();
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        log("Destroy called for adapter " + this);
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(null);
            this.interstitialAd = null;
        }
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd != null) {
            appOpenAd.setFullScreenContentCallback(null);
            this.appOpenAd = null;
            this.appOpenAdListener = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.rewardedAd = null;
            this.rewardedAdListener = null;
        }
        AdView adView = this.adView;
        if (adView != null) {
            adView.destroy();
            this.adView = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.nativeAd = null;
        }
        NativeAdView nativeAdView = this.nativeAdView;
        if (nativeAdView != null) {
            nativeAdView.destroy();
            this.nativeAdView = null;
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing app open ad: " + thirdPartyAdPlacementId + "...");
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd != null) {
            appOpenAd.show(activity);
            return;
        }
        log("App open ad failed to show: " + thirdPartyAdPlacementId);
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, "App open ad not ready"));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad: " + thirdPartyAdPlacementId + "...");
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(activity);
            return;
        }
        log("Interstitial ad failed to show: " + thirdPartyAdPlacementId);
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, "Interstitial ad not ready"));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad: " + thirdPartyAdPlacementId + "...");
        if (this.rewardedAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show(activity, new OnUserEarnedRewardListener() { // from class: com.applovin.mediation.adapters.b
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    GoogleMediationAdapter.this.lambda$showRewardedAd$1(thirdPartyAdPlacementId, rewardItem);
                }
            });
            return;
        }
        log("Rewarded ad failed to show: " + thirdPartyAdPlacementId);
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, "Rewarded ad not ready"));
    }
}
