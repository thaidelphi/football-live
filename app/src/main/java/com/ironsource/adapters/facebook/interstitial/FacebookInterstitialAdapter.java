package com.ironsource.adapters.facebook.interstitial;

import android.text.TextUtils;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class FacebookInterstitialAdapter extends AbstractInterstitialAdapter<FacebookAdapter> {
    protected ConcurrentHashMap<String, Boolean> mAdsAvailability;
    private final ConcurrentHashMap<String, InterstitialAd> mPlacementIdToAd;
    private final ConcurrentHashMap<String, FacebookInterstitialAdListener> mPlacementIdToFacebookAdListener;
    protected ConcurrentHashMap<String, Boolean> mPlacementIdToShowAttempts;
    private final ConcurrentHashMap<String, InterstitialSmashListener> mPlacementIdToSmashListener;

    public FacebookInterstitialAdapter(FacebookAdapter facebookAdapter) {
        super(facebookAdapter);
        this.mPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToAd = new ConcurrentHashMap<>();
        this.mPlacementIdToFacebookAdListener = new ConcurrentHashMap<>();
        this.mAdsAvailability = new ConcurrentHashMap<>();
        this.mPlacementIdToShowAttempts = new ConcurrentHashMap<>();
    }

    private void initInterstitialInternal(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String placementIdKey = getAdapter().getPlacementIdKey();
        String allPlacementIdsKey = getAdapter().getAllPlacementIdsKey();
        String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, placementIdKey);
        String configStringValueFromKey2 = getConfigStringValueFromKey(jSONObject, allPlacementIdsKey);
        if (TextUtils.isEmpty(configStringValueFromKey)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(placementIdKey));
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(placementIdKey), "Interstitial"));
        } else if (TextUtils.isEmpty(configStringValueFromKey2)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(allPlacementIdsKey));
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(allPlacementIdsKey), "Interstitial"));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("placementId = " + configStringValueFromKey);
            this.mPlacementIdToSmashListener.put(configStringValueFromKey, interstitialSmashListener);
            if (getAdapter().getInitState() == FacebookAdapter.InitState.INIT_STATE_SUCCESS) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("onInterstitialInitSuccess - placementId = " + configStringValueFromKey);
                interstitialSmashListener.onInterstitialInitSuccess();
            } else if (getAdapter().getInitState() == FacebookAdapter.InitState.INIT_STATE_FAILED) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.verbose("onInterstitialInitFailed - placementId = " + configStringValueFromKey);
                interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", "Interstitial"));
            } else {
                getAdapter().initSDK(configStringValueFromKey2);
            }
        }
    }

    private void loadInterstitialInternal(JSONObject jSONObject, final String str, final InterstitialSmashListener interstitialSmashListener) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, getAdapter().getPlacementIdKey());
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.mPlacementIdToShowAttempts;
        Boolean bool = Boolean.FALSE;
        concurrentHashMap.put(configStringValueFromKey, bool);
        this.mAdsAvailability.put(configStringValueFromKey, bool);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.facebook.interstitial.FacebookInterstitialAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose("placementId = " + configStringValueFromKey);
                    if (FacebookInterstitialAdapter.this.mPlacementIdToAd.containsKey(configStringValueFromKey)) {
                        ironLog.verbose("destroying previous ad with placementId " + configStringValueFromKey);
                        ((InterstitialAd) FacebookInterstitialAdapter.this.mPlacementIdToAd.get(configStringValueFromKey)).destroy();
                        FacebookInterstitialAdapter.this.mPlacementIdToAd.remove(configStringValueFromKey);
                    }
                    InterstitialAd interstitialAd = new InterstitialAd(ContextProvider.getInstance().getApplicationContext(), configStringValueFromKey);
                    FacebookInterstitialAdListener facebookInterstitialAdListener = new FacebookInterstitialAdListener(FacebookInterstitialAdapter.this, configStringValueFromKey, interstitialSmashListener);
                    FacebookInterstitialAdapter.this.mPlacementIdToFacebookAdListener.put(configStringValueFromKey, facebookInterstitialAdListener);
                    InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig = interstitialAd.buildLoadAdConfig();
                    EnumSet<CacheFlag> cacheFlags = FacebookInterstitialAdapter.this.getAdapter().getCacheFlags();
                    buildLoadAdConfig.withCacheFlags(cacheFlags);
                    buildLoadAdConfig.withAdListener(facebookInterstitialAdListener);
                    if (!TextUtils.isEmpty(str)) {
                        buildLoadAdConfig.withBid(str);
                    }
                    ironLog.verbose("loading placementId = " + configStringValueFromKey + " with facebook cache flags = " + cacheFlags.toString());
                    interstitialAd.loadAd(buildLoadAdConfig.build());
                    FacebookInterstitialAdapter.this.mPlacementIdToAd.put(configStringValueFromKey, interstitialAd);
                } catch (Exception e8) {
                    interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(e8.getLocalizedMessage()));
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getAdapter().getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        initInterstitialInternal(jSONObject, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        initInterstitialInternal(jSONObject, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public final boolean isInterstitialReady(JSONObject jSONObject) {
        String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, getAdapter().getPlacementIdKey());
        return this.mAdsAvailability.containsKey(configStringValueFromKey) && Boolean.TRUE.equals(this.mAdsAvailability.get(configStringValueFromKey));
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        loadInterstitialInternal(jSONObject, null, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        loadInterstitialInternal(jSONObject, str, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        for (InterstitialSmashListener interstitialSmashListener : this.mPlacementIdToSmashListener.values()) {
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, "Interstitial"));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (InterstitialSmashListener interstitialSmashListener : this.mPlacementIdToSmashListener.values()) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.ReleaseMemoryAdapterInterface
    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        for (InterstitialAd interstitialAd : this.mPlacementIdToAd.values()) {
            interstitialAd.destroy();
        }
        this.mPlacementIdToAd.clear();
        this.mPlacementIdToFacebookAdListener.clear();
        this.mPlacementIdToSmashListener.clear();
        this.mAdsAvailability.clear();
        this.mPlacementIdToShowAttempts.clear();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, getAdapter().getPlacementIdKey());
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + configStringValueFromKey);
        this.mAdsAvailability.put(configStringValueFromKey, Boolean.FALSE);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.facebook.interstitial.FacebookInterstitialAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    InterstitialAd interstitialAd = (InterstitialAd) FacebookInterstitialAdapter.this.mPlacementIdToAd.get(configStringValueFromKey);
                    if (interstitialAd != null && interstitialAd.isAdLoaded() && !interstitialAd.isAdInvalidated()) {
                        FacebookInterstitialAdapter.this.mPlacementIdToShowAttempts.put(configStringValueFromKey, Boolean.TRUE);
                        interstitialAd.show();
                    } else {
                        interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
                    }
                } catch (Exception e8) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error("ex.getMessage() = " + e8.getMessage());
                    interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", e8.getMessage()));
                }
            }
        });
    }
}
