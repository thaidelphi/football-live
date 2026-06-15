package com.ironsource.adapters.admob.banner;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.ironsource.adapters.admob.AdMobAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AdMobBannerAdapter extends AbstractBannerAdapter<AdMobAdapter> {
    private final String IS_NATIVE;
    private final ConcurrentHashMap<String, AdView> mAdUnitIdToBannerAd;
    private final ConcurrentHashMap<String, BannerSmashListener> mAdUnitIdToListener;
    public final ConcurrentHashMap<String, NativeAd> mAdUnitIdToNativeBannerAd;

    public AdMobBannerAdapter(AdMobAdapter adMobAdapter) {
        super(adMobAdapter);
        this.IS_NATIVE = "isNative";
        this.mAdUnitIdToListener = new ConcurrentHashMap<>();
        this.mAdUnitIdToBannerAd = new ConcurrentHashMap<>();
        this.mAdUnitIdToNativeBannerAd = new ConcurrentHashMap<>();
    }

    private NativeAdOptions createNativeAdOptions(NativeTemplateType nativeTemplateType) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        builder.setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build());
        builder.setAdChoicesPlacement(nativeTemplateType.getAdChoicesPlacement());
        builder.setMediaAspectRatio(nativeTemplateType.getMediaAspectRatio());
        return builder.build();
    }

    private static AdSize getAdaptiveBannerSize(int i10) {
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(ContextProvider.getInstance().getApplicationContext(), i10);
    }

    private void initBannersInternal(JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String adUnitIdKey = getAdapter().getAdUnitIdKey();
        String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, adUnitIdKey);
        if (TextUtils.isEmpty(configStringValueFromKey)) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(adUnitIdKey), "Banner"));
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + configStringValueFromKey);
        this.mAdUnitIdToListener.put(configStringValueFromKey, bannerSmashListener);
        if (getAdapter().getInitState() == AdMobAdapter.InitState.INIT_STATE_SUCCESS) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("onBannerInitSuccess - adUnitId = " + configStringValueFromKey);
            bannerSmashListener.onBannerInitSuccess();
        } else if (getAdapter().getInitState() == AdMobAdapter.InitState.INIT_STATE_FAILED) {
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.verbose("onBannerInitFailed - adUnitId = " + configStringValueFromKey);
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("AdMob sdk init failed", "Banner"));
        } else {
            getAdapter().initSDK(jSONObject);
        }
    }

    private boolean isNativeBannerSizeSupported(ISBannerSize iSBannerSize, boolean z10) {
        String description = iSBannerSize.getDescription();
        description.hashCode();
        char c10 = 65535;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals(l.f18872c)) {
                    c10 = 0;
                    break;
                }
                break;
            case 72205083:
                if (description.equals(l.f18871b)) {
                    c10 = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals(l.f18874e)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals("BANNER")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 3:
                return true;
            case 2:
                return !z10;
            default:
                return false;
        }
    }

    private void loadBannerInternal(final JSONObject jSONObject, final JSONObject jSONObject2, final String str, final IronSourceBannerLayout ironSourceBannerLayout, final BannerSmashListener bannerSmashListener) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, getAdapter().getAdUnitIdKey());
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + configStringValueFromKey);
        if (ironSourceBannerLayout == null) {
            IronLog.INTERNAL.error("banner is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner is null"));
            return;
        }
        final boolean parseBoolean = Boolean.parseBoolean(getConfigStringValueFromKey(jSONObject, "isNative"));
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.banner.AdMobBannerAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdRequest createAdRequest = AdMobBannerAdapter.this.getAdapter().createAdRequest(jSONObject2, str);
                    if (parseBoolean) {
                        AdMobBannerAdapter.this.loadNativeBanner(ironSourceBannerLayout, bannerSmashListener, configStringValueFromKey, createAdRequest, jSONObject);
                        return;
                    }
                    AdSize adSize = AdMobBannerAdapter.this.getAdSize(ironSourceBannerLayout.getSize(), AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()));
                    if (adSize == null) {
                        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(AdMobBannerAdapter.this.getAdapter().getProviderName()));
                        return;
                    }
                    AdView adView = new AdView(ContextProvider.getInstance().getApplicationContext());
                    adView.setAdSize(adSize);
                    adView.setAdUnitId(configStringValueFromKey);
                    adView.setAdListener(new AdMobBannerAdListener(bannerSmashListener, configStringValueFromKey, adView));
                    AdMobBannerAdapter.this.mAdUnitIdToBannerAd.put(configStringValueFromKey, adView);
                    IronLog.ADAPTER_API.verbose("loadAd");
                    adView.loadAd(createAdRequest);
                } catch (Exception e8) {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("AdMobAdapter loadBanner exception " + e8.getMessage()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadNativeBanner(IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener, String str, AdRequest adRequest, JSONObject jSONObject) {
        if (!isNativeBannerSizeSupported(ironSourceBannerLayout.getSize(), AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()))) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("size not supported, size = " + ironSourceBannerLayout.getSize().getDescription());
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getAdapter().getProviderName()));
            return;
        }
        IronLog ironLog2 = IronLog.ADAPTER_API;
        ironLog2.verbose("adUnitId = " + str);
        NativeTemplateType createTemplateType = NativeTemplateType.createTemplateType(jSONObject, ironSourceBannerLayout.getSize());
        AdMobNativeBannerAdListener adMobNativeBannerAdListener = new AdMobNativeBannerAdListener(this, bannerSmashListener, str, ironSourceBannerLayout.getSize(), createTemplateType);
        new AdLoader.Builder(ironSourceBannerLayout.getContext(), str).forNativeAd(adMobNativeBannerAdListener).withNativeAdOptions(createNativeAdOptions(createTemplateType)).withAdListener(adMobNativeBannerAdListener).build().loadAd(adRequest);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        IronSourceBannerLayout ironSourceBannerLayout;
        Bundle bundle = new Bundle();
        if (jSONObject2 != null && (ironSourceBannerLayout = (IronSourceBannerLayout) jSONObject2.opt("bannerLayout")) != null) {
            ISBannerSize size = ironSourceBannerLayout.getSize();
            if (size.isAdaptive()) {
                AdSize adSize = getAdSize(size, AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()));
                bundle.putInt("adaptive_banner_w", adSize.getWidth());
                bundle.putInt("adaptive_banner_h", adSize.getHeight());
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("adaptive banner width = " + adSize.getWidth() + ", height = " + adSize.getHeight());
            }
        }
        getAdapter().collectBiddingData(biddingDataCallback, AdFormat.BANNER, bundle);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(final JSONObject jSONObject) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.banner.AdMobBannerAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdMobBannerAdapter adMobBannerAdapter = AdMobBannerAdapter.this;
                    String configStringValueFromKey = adMobBannerAdapter.getConfigStringValueFromKey(jSONObject, adMobBannerAdapter.getAdapter().getAdUnitIdKey());
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose("adUnitId = " + configStringValueFromKey);
                    if (AdMobBannerAdapter.this.mAdUnitIdToBannerAd.containsKey(configStringValueFromKey)) {
                        AdView adView = (AdView) AdMobBannerAdapter.this.mAdUnitIdToBannerAd.get(configStringValueFromKey);
                        if (adView != null) {
                            adView.destroy();
                        }
                        AdMobBannerAdapter.this.mAdUnitIdToBannerAd.remove(configStringValueFromKey);
                    }
                    if (AdMobBannerAdapter.this.mAdUnitIdToNativeBannerAd.containsKey(configStringValueFromKey)) {
                        NativeAd nativeAd = AdMobBannerAdapter.this.mAdUnitIdToNativeBannerAd.get(configStringValueFromKey);
                        if (nativeAd != null) {
                            nativeAd.destroy();
                        }
                        AdMobBannerAdapter.this.mAdUnitIdToNativeBannerAd.remove(configStringValueFromKey);
                    }
                } catch (Exception e8) {
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    ironLog2.error("e = " + e8);
                }
            }
        });
    }

    public AdSize getAdSize(ISBannerSize iSBannerSize, boolean z10) {
        AdSize adSize;
        String description = iSBannerSize.getDescription();
        description.hashCode();
        char c10 = 65535;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals(l.f18872c)) {
                    c10 = 0;
                    break;
                }
                break;
            case 72205083:
                if (description.equals(l.f18871b)) {
                    c10 = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals(l.f18874e)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals("BANNER")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1999208305:
                if (description.equals(l.f18875f)) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                adSize = AdSize.MEDIUM_RECTANGLE;
                break;
            case 1:
                adSize = AdSize.LARGE_BANNER;
                break;
            case 2:
                if (!z10) {
                    adSize = AdSize.BANNER;
                    break;
                } else {
                    adSize = AdSize.LEADERBOARD;
                    break;
                }
            case 3:
                adSize = AdSize.BANNER;
                break;
            case 4:
                adSize = new AdSize(iSBannerSize.getWidth(), iSBannerSize.getHeight());
                break;
            default:
                adSize = null;
                break;
        }
        try {
            if (iSBannerSize.isAdaptive() && adSize != null) {
                AdSize adaptiveBannerSize = getAdaptiveBannerSize(iSBannerSize.containerParams.getWidth());
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("default height - " + adSize.getHeight() + " adaptive height - " + adaptiveBannerSize.getHeight() + " container height - " + iSBannerSize.containerParams.getHeight() + " default width - " + adSize.getWidth() + " container width - " + iSBannerSize.containerParams.getWidth());
                return adaptiveBannerSize;
            }
        } catch (Exception unused) {
            IronLog.INTERNAL.error("containerParams is not supported");
        }
        return adSize;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int i10) {
        int height = getAdaptiveBannerSize(i10).getHeight();
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("height - " + height + " for width - " + i10);
        return height;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject, jSONObject2, null, ironSourceBannerLayout, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject, jSONObject2, str, ironSourceBannerLayout, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        for (BannerSmashListener bannerSmashListener : this.mAdUnitIdToListener.values()) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (BannerSmashListener bannerSmashListener : this.mAdUnitIdToListener.values()) {
            bannerSmashListener.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.ReleaseMemoryAdapterInterface
    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.banner.AdMobBannerAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                for (AdView adView : AdMobBannerAdapter.this.mAdUnitIdToBannerAd.values()) {
                    adView.destroy();
                }
                for (NativeAd nativeAd : AdMobBannerAdapter.this.mAdUnitIdToNativeBannerAd.values()) {
                    nativeAd.destroy();
                }
                AdMobBannerAdapter.this.mAdUnitIdToBannerAd.clear();
                AdMobBannerAdapter.this.mAdUnitIdToListener.clear();
                AdMobBannerAdapter.this.mAdUnitIdToNativeBannerAd.clear();
            }
        });
    }
}
