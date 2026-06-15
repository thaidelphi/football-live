package com.ironsource.adapters.unityads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.adcolony.sdk.AdColonyAppOptions;
import com.ironsource.b9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.ads.metadata.PlayerMetaData;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class UnityAdsAdapter extends AbstractAdapter implements IUnityAdsInitializationListener, INetworkInitCallbackListener {
    private static final String GitHash = "0f3b881";
    private static final String VERSION = "4.3.37";
    private final String ADAPTER_VERSION_KEY;
    private final String ADS_GATEWAY_ENABLED;
    private final String CONSENT_CCPA;
    private final String CONSENT_GDPR;
    private final String GAME_DESIGNATION;
    private final String GAME_ID;
    private final String LWS_SUPPORT_STATE;
    private final String MEDIATION_NAME;
    private final String MIXED_AUDIENCE;
    private final String PLACEMENT_ID;
    private final String UNITYADS_COPPA;
    private final String UNITYADS_METADATA_COPPA_KEY;
    private boolean isAdsGateway;
    protected ConcurrentHashMap<String, Boolean> mInterstitialAdsAvailability;
    private ConcurrentHashMap<String, String> mInterstitialPlacementIdToLoadedAdObjectId;
    private ConcurrentHashMap<String, BannerView> mPlacementIdToBannerAd;
    private ConcurrentHashMap<String, UnityAdsBannerListener> mPlacementIdToBannerListener;
    private ConcurrentHashMap<String, BannerSmashListener> mPlacementIdToBannerSmashListener;
    private ConcurrentHashMap<String, UnityAdsInterstitialListener> mPlacementIdToInterstitialListener;
    private ConcurrentHashMap<String, InterstitialSmashListener> mPlacementIdToInterstitialSmashListener;
    private ConcurrentHashMap<String, UnityAdsRewardedVideoListener> mPlacementIdToRewardedVideoListener;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mPlacementIdToRewardedVideoSmashListener;
    protected ConcurrentHashMap<String, Boolean> mRewardedVideoAdsAvailability;
    private ConcurrentHashMap<String, String> mRewardedVideoPlacementIdToLoadedAdObjectId;
    private CopyOnWriteArraySet<String> mRewardedVideoPlacementIdsForInitCallbacks;
    private final Object mUnityAdsStorageLock;
    private static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    private static InitState mInitState = InitState.INIT_STATE_NONE;
    private static AtomicBoolean mWasInitCalled = new AtomicBoolean(false);
    private static String asyncToken = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.adapters.unityads.UnityAdsAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$InitState;

        static {
            int[] iArr = new int[InitState.values().length];
            $SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$InitState = iArr;
            try {
                iArr[InitState.INIT_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$InitState[InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$InitState[InitState.INIT_STATE_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$InitState[InitState.INIT_STATE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS,
        INIT_STATE_FAILED
    }

    private UnityAdsAdapter(String str) {
        super(str);
        this.MEDIATION_NAME = AdColonyAppOptions.IRONSOURCE;
        this.ADAPTER_VERSION_KEY = "adapter_version";
        this.GAME_ID = "sourceId";
        this.PLACEMENT_ID = "zoneId";
        this.CONSENT_GDPR = "gdpr.consent";
        this.CONSENT_CCPA = "privacy.consent";
        this.UNITYADS_COPPA = JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY;
        this.UNITYADS_METADATA_COPPA_KEY = "unityads_coppa";
        this.GAME_DESIGNATION = b9.a.f16549t;
        this.MIXED_AUDIENCE = "mixed";
        this.ADS_GATEWAY_ENABLED = "adsGatewayV2";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.mUnityAdsStorageLock = new Object();
        this.isAdsGateway = false;
        IronLog.INTERNAL.verbose();
        this.mPlacementIdToRewardedVideoSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToRewardedVideoListener = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdToLoadedAdObjectId = new ConcurrentHashMap<>();
        this.mRewardedVideoAdsAvailability = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mPlacementIdToInterstitialSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToInterstitialListener = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToLoadedAdObjectId = new ConcurrentHashMap<>();
        this.mInterstitialAdsAvailability = new ConcurrentHashMap<>();
        this.mPlacementIdToBannerSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToBannerListener = new ConcurrentHashMap<>();
        this.mPlacementIdToBannerAd = new ConcurrentHashMap<>();
    }

    private IronSourceError errorForUnsupportedAdapter(String str) {
        return ErrorBuilder.buildInitFailedError("UnityAds SDK version is not supported", str);
    }

    public static String getAdapterSDKVersion() {
        return UnityAds.getVersion();
    }

    private UnityBannerSize getBannerSize(ISBannerSize iSBannerSize, boolean z10) {
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
                return new UnityBannerSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
            case 1:
            case 3:
                return new UnityBannerSize(320, 50);
            case 2:
                return z10 ? new UnityBannerSize(728, 90) : new UnityBannerSize(320, 50);
            default:
                return null;
        }
    }

    private BannerView getBannerView(IronSourceBannerLayout ironSourceBannerLayout, String str, BannerSmashListener bannerSmashListener) {
        if (this.mPlacementIdToBannerAd.get(str) != null) {
            this.mPlacementIdToBannerAd.get(str).destroy();
            this.mPlacementIdToBannerAd.remove(str);
        }
        BannerView bannerView = new BannerView(ContextProvider.getInstance().getCurrentActiveActivity(), str, getBannerSize(ironSourceBannerLayout.getSize(), AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())));
        UnityAdsBannerListener unityAdsBannerListener = new UnityAdsBannerListener(this, bannerSmashListener, str);
        this.mPlacementIdToBannerListener.put(str, unityAdsBannerListener);
        bannerView.setListener(unityAdsBannerListener);
        this.mPlacementIdToBannerAd.put(str, bannerView);
        return bannerView;
    }

    private Map<String, Object> getBiddingData() {
        String str;
        if (this.isAdsGateway) {
            str = UnityAds.getToken();
        } else if (InitState.INIT_STATE_SUCCESS == mInitState) {
            str = UnityAds.getToken();
        } else if (!TextUtils.isEmpty(asyncToken)) {
            str = asyncToken;
            getAsyncToken();
        } else {
            IronLog.INTERNAL.verbose("returning null as token since init did not finish successfully and async token did not return");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("token = " + str);
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        return hashMap;
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData("UnityAds", "4.3.37");
    }

    private int getUnityAdsInitializationErrorCode(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        if (unityAdsInitializationError != null) {
            for (UnityAds.UnityAdsInitializationError unityAdsInitializationError2 : UnityAds.UnityAdsInitializationError.values()) {
                if (unityAdsInitializationError2.name().equalsIgnoreCase(unityAdsInitializationError.toString())) {
                    return UnityAds.UnityAdsInitializationError.valueOf(unityAdsInitializationError.toString()).ordinal();
                }
            }
            return 510;
        }
        return 510;
    }

    private void initSDK(String str, JSONObject jSONObject) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            IronLog.ADAPTER_API.verbose();
            mInitState = InitState.INIT_STATE_IN_PROGRESS;
            synchronized (this.mUnityAdsStorageLock) {
                MediationMetaData mediationMetaData = new MediationMetaData(ContextProvider.getInstance().getApplicationContext());
                mediationMetaData.setName(AdColonyAppOptions.IRONSOURCE);
                mediationMetaData.setVersion(IronSourceUtils.getSDKVersion());
                mediationMetaData.set("adapter_version", "4.3.37");
                mediationMetaData.commit();
            }
            boolean optBoolean = jSONObject.optBoolean("adsGatewayV2", false);
            this.isAdsGateway = optBoolean;
            setUnityAdsMetaData("adsGatewayV2", optBoolean);
            UnityAds.setDebugMode(isAdaptersDebugEnabled());
            UnityAds.initialize(ContextProvider.getInstance().getApplicationContext(), str, false, this);
            if (this.isAdsGateway) {
                return;
            }
            getAsyncToken();
        }
    }

    private Boolean isBannerSizeSupported(ISBannerSize iSBannerSize) {
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
            case 2:
            case 3:
                return Boolean.TRUE;
            default:
                return Boolean.FALSE;
        }
    }

    private boolean isOSSupported() {
        return Build.VERSION.SDK_INT >= 19;
    }

    private void loadInterstitialInternal(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str, String str2) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + str2);
        this.mInterstitialAdsAvailability.put(str2, Boolean.FALSE);
        UnityAdsInterstitialListener unityAdsInterstitialListener = new UnityAdsInterstitialListener(this, interstitialSmashListener, str2);
        this.mPlacementIdToInterstitialListener.put(str2, unityAdsInterstitialListener);
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        String uuid = UUID.randomUUID().toString();
        unityAdsLoadOptions.setObjectId(uuid);
        if (!TextUtils.isEmpty(str)) {
            unityAdsLoadOptions.setAdMarkup(str);
        }
        this.mInterstitialPlacementIdToLoadedAdObjectId.put(str2, uuid);
        UnityAds.load(str2, unityAdsLoadOptions, unityAdsInterstitialListener);
    }

    private void loadRewardedVideoInternal(String str, String str2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + str);
        this.mRewardedVideoAdsAvailability.put(str, Boolean.FALSE);
        UnityAdsRewardedVideoListener unityAdsRewardedVideoListener = new UnityAdsRewardedVideoListener(this, rewardedVideoSmashListener, str);
        this.mPlacementIdToRewardedVideoListener.put(str, unityAdsRewardedVideoListener);
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        String uuid = UUID.randomUUID().toString();
        unityAdsLoadOptions.setObjectId(uuid);
        if (!TextUtils.isEmpty(str2)) {
            unityAdsLoadOptions.setAdMarkup(str2);
        }
        this.mRewardedVideoPlacementIdToLoadedAdObjectId.put(str, uuid);
        UnityAds.load(str, unityAdsLoadOptions, unityAdsRewardedVideoListener);
    }

    private void setCCPAValue(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + z10);
        setUnityAdsMetaData("privacy.consent", z10 ^ true);
    }

    private void setCOPPAValue(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + z10);
        setUnityAdsMetaData(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY, z10);
    }

    private void setUnityAdsMetaData(String str, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("key = " + str + "value = " + z10);
        synchronized (this.mUnityAdsStorageLock) {
            MetaData metaData = new MetaData(ContextProvider.getInstance().getApplicationContext());
            metaData.set(str, Boolean.valueOf(z10));
            if (str.equals(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY)) {
                metaData.set(b9.a.f16549t, "mixed");
            }
            metaData.commit();
        }
    }

    public static UnityAdsAdapter startAdapter(String str) {
        return new UnityAdsAdapter(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FrameLayout.LayoutParams createLayoutParams(UnityBannerSize unityBannerSize) {
        return new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(ContextProvider.getInstance().getApplicationContext(), unityBannerSize.getWidth()), -2, 17);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject jSONObject) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        if (this.mPlacementIdToBannerAd.get(optString) != null) {
            this.mPlacementIdToBannerAd.get(optString).destroy();
            this.mPlacementIdToBannerAd.remove(optString);
        }
    }

    public void getAsyncToken() {
        IronLog.INTERNAL.verbose();
        UnityAds.getToken(new IUnityAdsTokenListener() { // from class: com.ironsource.adapters.unityads.UnityAdsAdapter.1
            @Override // com.unity3d.ads.IUnityAdsTokenListener
            public void onUnityAdsTokenReady(String str) {
                IronLog.ADAPTER_CALLBACK.verbose("async token returned");
                String unused = UnityAdsAdapter.asyncToken = str;
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return UnityAds.getVersion();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        LoadWhileShowSupportState loadWhileShowSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
        return (jSONObject == null || jSONObject.optBoolean("isSupportedLWS", true)) ? loadWhileShowSupportState : LoadWhileShowSupportState.NONE;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getBiddingData();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getUnityAdsLoadErrorCode(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        if (unityAdsLoadError != null) {
            for (UnityAds.UnityAdsLoadError unityAdsLoadError2 : UnityAds.UnityAdsLoadError.values()) {
                if (unityAdsLoadError2.name().equalsIgnoreCase(unityAdsLoadError.toString())) {
                    return UnityAds.UnityAdsLoadError.valueOf(unityAdsLoadError.toString()).ordinal();
                }
            }
            return 510;
        }
        return 510;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getUnityAdsShowErrorCode(UnityAds.UnityAdsShowError unityAdsShowError) {
        if (unityAdsShowError != null) {
            for (UnityAds.UnityAdsShowError unityAdsShowError2 : UnityAds.UnityAdsShowError.values()) {
                if (unityAdsShowError2.name().equalsIgnoreCase(unityAdsShowError.toString())) {
                    return UnityAds.UnityAdsShowError.valueOf(unityAdsShowError.toString()).ordinal();
                }
            }
            return 510;
        }
        return 510;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.3.37";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("sourceId");
        String optString2 = jSONObject.optString("zoneId");
        if (!isOSSupported()) {
            IronLog.INTERNAL.error(errorForUnsupportedAdapter(IronSourceConstants.REWARDED_VIDEO_AD_UNIT).getErrorMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params = sourceId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params = zoneId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("gameId = " + optString + ", placementId = " + optString2);
            this.mPlacementIdToRewardedVideoSmashListener.put(optString2, rewardedVideoSmashListener);
            int i10 = AnonymousClass2.$SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$InitState[mInitState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                initSDK(optString, jSONObject);
            } else if (i10 == 3) {
                loadRewardedVideoInternal(optString2, null, rewardedVideoSmashListener);
            } else if (i10 != 4) {
            } else {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        initBanners(str, str2, jSONObject, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString("sourceId");
        String optString2 = jSONObject.optString("zoneId");
        if (!isOSSupported()) {
            IronSourceError errorForUnsupportedAdapter = errorForUnsupportedAdapter("Banner");
            IronLog.INTERNAL.error(errorForUnsupportedAdapter.getErrorMessage());
            bannerSmashListener.onBannerInitFailed(errorForUnsupportedAdapter);
        } else if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params = sourceId");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - sourceId", "Banner"));
        } else if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params = zoneId");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - zoneId", "Banner"));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("gameId = " + optString + ", placementId = " + optString2);
            this.mPlacementIdToBannerSmashListener.put(optString2, bannerSmashListener);
            int i10 = AnonymousClass2.$SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$InitState[mInitState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                initSDK(optString, jSONObject);
            } else if (i10 == 3) {
                bannerSmashListener.onBannerInitSuccess();
            } else if (i10 != 4) {
            } else {
                bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("UnityAds SDK init failed", "Banner"));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString("sourceId");
        String optString2 = jSONObject.optString("zoneId");
        if (!isOSSupported()) {
            IronSourceError errorForUnsupportedAdapter = errorForUnsupportedAdapter("Interstitial");
            IronLog.INTERNAL.error(errorForUnsupportedAdapter.getErrorMessage());
            interstitialSmashListener.onInterstitialInitFailed(errorForUnsupportedAdapter);
        } else if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params = sourceId");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - sourceId", "Interstitial"));
        } else if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params = zoneId");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - zoneId", "Interstitial"));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("gameId = " + optString + ", placementId = " + optString2);
            this.mPlacementIdToInterstitialSmashListener.put(optString2, interstitialSmashListener);
            int i10 = AnonymousClass2.$SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$InitState[mInitState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                initSDK(optString, jSONObject);
            } else if (i10 == 3) {
                interstitialSmashListener.onInterstitialInitSuccess();
            } else if (i10 != 4) {
            } else {
                interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("UnityAds SDK init failed", "Interstitial"));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose();
        initInterstitial(str, str2, jSONObject, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("sourceId");
        String optString2 = jSONObject.optString("zoneId");
        if (!isOSSupported()) {
            IronSourceError errorForUnsupportedAdapter = errorForUnsupportedAdapter(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            IronLog.INTERNAL.error(errorForUnsupportedAdapter.getErrorMessage());
            rewardedVideoSmashListener.onRewardedVideoInitFailed(errorForUnsupportedAdapter);
        } else if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params = sourceId");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - sourceId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params = zoneId");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - zoneId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("gameId = " + optString + ", placementId = " + optString2);
            this.mPlacementIdToRewardedVideoSmashListener.put(optString2, rewardedVideoSmashListener);
            this.mRewardedVideoPlacementIdsForInitCallbacks.add(optString2);
            int i10 = AnonymousClass2.$SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$InitState[mInitState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                initSDK(optString, jSONObject);
            } else if (i10 == 3) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else if (i10 != 4) {
            } else {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("UnityAds SDK init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        if (!isOSSupported()) {
            IronLog.INTERNAL.error(errorForUnsupportedAdapter("Interstitial").getErrorMessage());
            return false;
        }
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        return this.mInterstitialAdsAvailability.containsKey(optString) && this.mInterstitialAdsAvailability.get(optString).booleanValue();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        if (!isOSSupported()) {
            IronLog.INTERNAL.error(errorForUnsupportedAdapter(IronSourceConstants.REWARDED_VIDEO_AD_UNIT).getErrorMessage());
            return false;
        }
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        return this.mRewardedVideoAdsAvailability.containsKey(optString) && this.mRewardedVideoAdsAvailability.get(optString).booleanValue();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject, jSONObject2, ironSourceBannerLayout, bannerSmashListener, null);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject, jSONObject2, ironSourceBannerLayout, bannerSmashListener, str);
    }

    public void loadBannerInternal(JSONObject jSONObject, JSONObject jSONObject2, IronSourceBannerLayout ironSourceBannerLayout, BannerSmashListener bannerSmashListener, String str) {
        String optString = jSONObject.optString("zoneId");
        if (ironSourceBannerLayout == null) {
            IronLog.INTERNAL.error("banner is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner is null"));
        } else if (!isBannerSizeSupported(ironSourceBannerLayout.getSize()).booleanValue()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("size not supported, size = " + ironSourceBannerLayout.getSize().getDescription());
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
        } else {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.verbose("placementId = " + optString);
            BannerView bannerView = getBannerView(ironSourceBannerLayout, optString, bannerSmashListener);
            UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
            unityAdsLoadOptions.setObjectId(UUID.randomUUID().toString());
            if (!TextUtils.isEmpty(str)) {
                unityAdsLoadOptions.setAdMarkup(str);
            }
            bannerView.load(unityAdsLoadOptions);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        loadInterstitialInternal(jSONObject, interstitialSmashListener, null, optString);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        loadInterstitialInternal(jSONObject, interstitialSmashListener, str, optString);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        loadRewardedVideoInternal(optString, null, rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        loadRewardedVideoInternal(optString, str, rewardedVideoSmashListener);
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public void onInitializationComplete() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = InitState.INIT_STATE_SUCCESS;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = InitState.INIT_STATE_FAILED;
        String str2 = getUnityAdsInitializationErrorCode(unityAdsInitializationError) + str;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed(str2);
        }
        initCallbackListeners.clear();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose();
        for (String str2 : this.mPlacementIdToRewardedVideoSmashListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str2);
            if (this.mRewardedVideoPlacementIdsForInitCallbacks.contains(str2)) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
        for (InterstitialSmashListener interstitialSmashListener : this.mPlacementIdToInterstitialSmashListener.values()) {
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, "Interstitial"));
        }
        for (BannerSmashListener bannerSmashListener : this.mPlacementIdToBannerSmashListener.values()) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        for (String str : this.mPlacementIdToRewardedVideoSmashListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str);
            if (this.mRewardedVideoPlacementIdsForInitCallbacks.contains(str)) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoInternal(str, null, rewardedVideoSmashListener);
            }
        }
        for (InterstitialSmashListener interstitialSmashListener : this.mPlacementIdToInterstitialSmashListener.values()) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
        for (BannerSmashListener bannerSmashListener : this.mPlacementIdToBannerSmashListener.values()) {
            bannerSmashListener.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.ReleaseMemoryAdapterInterface
    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + ad_unit);
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.mPlacementIdToRewardedVideoSmashListener.clear();
            this.mPlacementIdToRewardedVideoListener.clear();
            this.mRewardedVideoPlacementIdToLoadedAdObjectId.clear();
            this.mRewardedVideoAdsAvailability.clear();
            this.mRewardedVideoPlacementIdsForInitCallbacks.clear();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.mPlacementIdToInterstitialSmashListener.clear();
            this.mPlacementIdToInterstitialListener.clear();
            this.mInterstitialPlacementIdToLoadedAdObjectId.clear();
            this.mInterstitialAdsAvailability.clear();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            for (BannerView bannerView : this.mPlacementIdToBannerAd.values()) {
                bannerView.destroy();
            }
            this.mPlacementIdToBannerSmashListener.clear();
            this.mPlacementIdToBannerListener.clear();
            this.mPlacementIdToBannerAd.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("setConsent = " + z10);
        setUnityAdsMetaData("gdpr.consent", z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        String str2 = list.get(0);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("key = " + str + ", value = " + str2);
        if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str2));
            return;
        }
        String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (MetaDataUtils.isValidMetaData(str, "unityads_coppa", formatValueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        if (isInterstitialReady(jSONObject)) {
            this.mInterstitialAdsAvailability.put(optString, Boolean.FALSE);
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(this.mInterstitialPlacementIdToLoadedAdObjectId.get(optString));
            UnityAds.show(ContextProvider.getInstance().getCurrentActiveActivity(), optString, unityAdsShowOptions, this.mPlacementIdToInterstitialListener.get(optString));
            return;
        }
        interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        if (isRewardedVideoAvailable(jSONObject)) {
            this.mRewardedVideoAdsAvailability.put(optString, Boolean.FALSE);
            if (!TextUtils.isEmpty(getDynamicUserId())) {
                synchronized (this.mUnityAdsStorageLock) {
                    PlayerMetaData playerMetaData = new PlayerMetaData(ContextProvider.getInstance().getApplicationContext());
                    playerMetaData.setServerId(getDynamicUserId());
                    playerMetaData.commit();
                }
            }
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(this.mRewardedVideoPlacementIdToLoadedAdObjectId.get(optString));
            UnityAds.show(ContextProvider.getInstance().getCurrentActiveActivity(), optString, unityAdsShowOptions, this.mPlacementIdToRewardedVideoListener.get(optString));
            return;
        }
        rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
    }
}
