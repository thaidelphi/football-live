package com.ironsource.adapters.facebook;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.CacheFlag;
import com.ironsource.adapters.facebook.banner.FacebookBannerAdapter;
import com.ironsource.adapters.facebook.interstitial.FacebookInterstitialAdapter;
import com.ironsource.adapters.facebook.nativead.FacebookNativeAdAdapter;
import com.ironsource.adapters.facebook.rewardedvideo.FacebookRewardedVideoAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class FacebookAdapter extends AbstractAdapter implements AudienceNetworkAds.InitListener {
    private static final String GitHash = "55bf00d";
    private static final String MEDIATION_NAME = "ironSource";
    protected static final String META_NETWORK_NAME = "Facebook";
    private static final String VERSION = "4.3.46";
    protected final String ALL_PLACEMENT_IDS;
    protected final String FACEBOOK_INTERSTITIAL_CACHE_FLAG;
    protected final String META_INTERSTITIAL_CACHE_FLAG;
    protected final String META_MIXED_AUDIENCE;
    protected final String PLACEMENT_ID;
    protected static EnumSet<CacheFlag> mInterstitialFacebookCacheFlags = EnumSet.allOf(CacheFlag.class);
    protected static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    protected static InitState mInitState = InitState.INIT_STATE_NONE;
    protected static AtomicBoolean mWasInitCalled = new AtomicBoolean(false);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS,
        INIT_STATE_FAILED
    }

    private FacebookAdapter(String str) {
        super(str);
        this.PLACEMENT_ID = "placementId";
        this.ALL_PLACEMENT_IDS = "placementIds";
        this.FACEBOOK_INTERSTITIAL_CACHE_FLAG = "facebook_is_cacheflag";
        this.META_INTERSTITIAL_CACHE_FLAG = "meta_is_cacheflag";
        this.META_MIXED_AUDIENCE = "meta_mixed_audience";
        IronLog.INTERNAL.verbose();
        setRewardedVideoAdapter(new FacebookRewardedVideoAdapter(this));
        setInterstitialAdapter(new FacebookInterstitialAdapter(this));
        setBannerAdapter(new FacebookBannerAdapter(this));
        setNativeAdAdapter(new FacebookNativeAdAdapter(this));
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public static String getAdapterSDKVersion() {
        return "6.17.0";
    }

    private EnumSet<CacheFlag> getFacebookAllCacheFlags() {
        IronLog.ADAPTER_API.verbose();
        return EnumSet.allOf(CacheFlag.class);
    }

    private CacheFlag getFacebookCacheFlag(String str) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + str);
        return CacheFlag.valueOf(StringUtils.toUpperCase(str));
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData(META_NETWORK_NAME, "4.3.46");
    }

    private String getMediationServiceInfo() {
        String format = String.format("%s_%s:%s", "ironSource", IronSourceUtils.getSDKVersion(), "4.3.46");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("mediationServiceInfo = " + format);
        return format;
    }

    public static boolean isNoFillError(AdError adError) {
        return adError.getErrorCode() == 1001;
    }

    private boolean isValidMixedAudienceMetaData(String str) {
        return !TextUtils.isEmpty(str);
    }

    private void setMixedAudience(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("isMixedAudience = " + z10);
        AdSettings.setMixedAudience(z10);
    }

    public static FacebookAdapter startAdapter(String str) {
        return new FacebookAdapter(str);
    }

    public String getAllPlacementIdsKey() {
        return "placementIds";
    }

    public Map<String, Object> getBiddingData() {
        if (mInitState == InitState.INIT_STATE_FAILED) {
            IronLog.INTERNAL.verbose("returning null as token since init failed");
            return null;
        }
        String bidderToken = BidderTokenProvider.getBidderToken(ContextProvider.getInstance().getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("token = " + bidderToken);
        HashMap hashMap = new HashMap();
        hashMap.put("token", bidderToken);
        return hashMap;
    }

    public EnumSet<CacheFlag> getCacheFlags() {
        return mInterstitialFacebookCacheFlags;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    public InitState getInitState() {
        return mInitState;
    }

    public String getPlacementIdKey() {
        return "placementId";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.3.46";
    }

    public void initSDK(String str) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            List<String> asList = Arrays.asList(str.split(","));
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("Initialize Meta with placement ids = " + asList.toString());
            AudienceNetworkAds.buildInitSettings(ContextProvider.getInstance().getApplicationContext()).withInitListener(this).withMediationService(getMediationServiceInfo()).withPlacementIds(asList).initialize();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return false;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("init SDK is completed with status: " + initResult.isSuccess() + ", " + initResult.getMessage());
        if (initResult.isSuccess()) {
            mInitState = InitState.INIT_STATE_SUCCESS;
            Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
            while (it.hasNext()) {
                it.next().onNetworkInitCallbackSuccess();
            }
        } else {
            mInitState = InitState.INIT_STATE_FAILED;
            Iterator<INetworkInitCallbackListener> it2 = initCallbackListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onNetworkInitCallbackFailed(initResult.getMessage());
            }
        }
        initCallbackListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        String lowerCase = StringUtils.toLowerCase(str);
        lowerCase.hashCode();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case -2119383230:
                if (lowerCase.equals("meta_mixed_audience")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1227342573:
                if (lowerCase.equals("meta_is_cacheflag")) {
                    c10 = 1;
                    break;
                }
                break;
            case 5585394:
                if (lowerCase.equals("facebook_is_cacheflag")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String str2 = list.get(0);
                IronLog.ADAPTER_API.verbose("key = " + str + ", value = " + str2);
                String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
                if (isValidMixedAudienceMetaData(formatValueForType)) {
                    setMixedAudience(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
                    return;
                }
                return;
            case 1:
            case 2:
                IronLog.ADAPTER_API.verbose("key = " + str + ", values = " + list);
                mInterstitialFacebookCacheFlags.clear();
                try {
                    for (String str3 : list) {
                        CacheFlag facebookCacheFlag = getFacebookCacheFlag(str3);
                        IronLog.ADAPTER_API.verbose("flag for value " + str3 + " is " + facebookCacheFlag.name());
                        mInterstitialFacebookCacheFlags.add(facebookCacheFlag);
                    }
                    return;
                } catch (Exception unused) {
                    IronLog.INTERNAL.error("flag is unknown or all, set all as default");
                    mInterstitialFacebookCacheFlags = getFacebookAllCacheFlags();
                    return;
                }
            default:
                return;
        }
    }
}
