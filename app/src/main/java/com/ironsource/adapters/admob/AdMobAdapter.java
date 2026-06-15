package com.ironsource.adapters.admob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.adcolony.sdk.AdColonyAppOptions;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.ironsource.adapters.admob.banner.AdMobBannerAdapter;
import com.ironsource.adapters.admob.interstitial.AdMobInterstitialAdapter;
import com.ironsource.adapters.admob.nativead.AdMobNativeAdAdapter;
import com.ironsource.adapters.admob.rewardedvideo.AdMobRewardedVideoAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AdMobAdapter extends AbstractAdapter {
    private static final String AD_UNIT_ID = "adUnitId";
    private static final String EMPTY_STRING = "";
    private static final String GitHash = "8239362";
    private static final String VERSION = "4.3.43";
    private static Boolean mCCPAValue = null;
    private static Boolean mConsent = null;
    private static String mContentMappingURLValue = "";
    private static Integer mCoppaValue = null;
    private static Integer mEuValue = null;
    private static String mRatingValue = "";
    private final String INIT_RESPONSE_REQUIRED;
    private final String NETWORK_ONLY_INIT;
    private final String PLATFORM_NAME;
    private final String REQUEST_AGENT;
    private static List<String> mNeighboringContentMappingURLValue = new ArrayList();
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    public static InitState mInitState = InitState.INIT_STATE_NONE;
    private static final AtomicBoolean mWasInitCalled = new AtomicBoolean(false);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private interface AdMobMaxContentRating {
        public static final String ADMOB_MAX_AD_CONTENT_RATING_G = "max_ad_content_rating_g";
        public static final String ADMOB_MAX_AD_CONTENT_RATING_MA = "max_ad_content_rating_ma";
        public static final String ADMOB_MAX_AD_CONTENT_RATING_PG = "max_ad_content_rating_pg";
        public static final String ADMOB_MAX_AD_CONTENT_RATING_T = "max_ad_content_rating_t";
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private interface AdMobMetaDataFlags {
        public static final String ADMOB_CONTENT_MAPPING_KEY = "google_content_mapping";
        public static final String ADMOB_MAX_RATING_KEY = "admob_maxcontentrating";
        public static final String ADMOB_TFCD_KEY = "admob_tfcd";
        public static final String ADMOB_TFUA_KEY = "admob_tfua";
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS,
        INIT_STATE_FAILED
    }

    private AdMobAdapter(String str) {
        super(str);
        this.REQUEST_AGENT = "unity";
        this.PLATFORM_NAME = "unity";
        this.NETWORK_ONLY_INIT = "networkOnlyInit";
        this.INIT_RESPONSE_REQUIRED = "initResponseRequired";
        IronLog.INTERNAL.verbose();
        setRewardedVideoAdapter(new AdMobRewardedVideoAdapter(this));
        setInterstitialAdapter(new AdMobInterstitialAdapter(this));
        setBannerAdapter(new AdMobBannerAdapter(this));
        setNativeAdAdapter(new AdMobNativeAdAdapter(this));
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    private int getAdMobCoppaValue(String str) {
        return MetaDataUtils.getMetaDataBooleanValue(str) ? 1 : 0;
    }

    private int getAdMobEuValue(String str) {
        return MetaDataUtils.getMetaDataBooleanValue(str) ? 1 : 0;
    }

    private String getAdMobRatingValue(String str) {
        if (TextUtils.isEmpty(str)) {
            IronLog.INTERNAL.error("The ratingValue is null");
            return null;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1038878193:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_MA)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1038878094:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_PG)) {
                    c10 = 1;
                    break;
                }
                break;
            case 936319116:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_G)) {
                    c10 = 2;
                    break;
                }
                break;
            case 936319129:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_T)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return RequestConfiguration.MAX_AD_CONTENT_RATING_MA;
            case 1:
                return RequestConfiguration.MAX_AD_CONTENT_RATING_PG;
            case 2:
                return RequestConfiguration.MAX_AD_CONTENT_RATING_G;
            case 3:
                return RequestConfiguration.MAX_AD_CONTENT_RATING_T;
            default:
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("The ratingValue = " + str + " is undefine");
                return "";
        }
    }

    public static String getAdapterSDKVersion() {
        return MobileAds.getVersion().toString();
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData(AdColonyAppOptions.ADMOB, "4.3.43");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializationFailure() {
        mInitState = InitState.INIT_STATE_FAILED;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed("AdMob sdk init failed");
        }
        initCallbackListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializationSuccess() {
        mInitState = InitState.INIT_STATE_SUCCESS;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    public static boolean isNoFillError(int i10) {
        return i10 == 3 || i10 == 9;
    }

    private void setAdMobMetaDataValue(String str, String str2) {
        String formatValueForType;
        if (AdMobMetaDataFlags.ADMOB_TFCD_KEY.equals(str) || AdMobMetaDataFlags.ADMOB_TFUA_KEY.equals(str)) {
            formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
            if (TextUtils.isEmpty(formatValueForType)) {
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("MetaData value for key " + str + " is invalid " + str2);
                return;
            }
        } else {
            formatValueForType = str2;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2052944638:
                if (str.equals(AdMobMetaDataFlags.ADMOB_CONTENT_MAPPING_KEY)) {
                    c10 = 0;
                    break;
                }
                break;
            case -139240332:
                if (str.equals(AdMobMetaDataFlags.ADMOB_MAX_RATING_KEY)) {
                    c10 = 1;
                    break;
                }
                break;
            case 1374613845:
                if (str.equals(AdMobMetaDataFlags.ADMOB_TFCD_KEY)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1374614400:
                if (str.equals(AdMobMetaDataFlags.ADMOB_TFUA_KEY)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                mContentMappingURLValue = str2;
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.verbose("key = " + str + ", contentMappingValue = " + mContentMappingURLValue);
                break;
            case 1:
                mRatingValue = getAdMobRatingValue(formatValueForType);
                IronLog ironLog3 = IronLog.ADAPTER_API;
                ironLog3.verbose("key = " + str + ", ratingValue = " + mRatingValue);
                break;
            case 2:
                mCoppaValue = Integer.valueOf(getAdMobCoppaValue(formatValueForType));
                IronLog ironLog4 = IronLog.ADAPTER_API;
                ironLog4.verbose("key = " + str + ", coppaValue = " + mCoppaValue);
                break;
            case 3:
                mEuValue = Integer.valueOf(getAdMobEuValue(formatValueForType));
                IronLog ironLog5 = IronLog.ADAPTER_API;
                ironLog5.verbose("key = " + str + ", euValue = " + mEuValue);
                break;
        }
        setRequestConfiguration();
    }

    private void setCCPAValue(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + z10);
        mCCPAValue = Boolean.valueOf(z10);
    }

    private void setRequestConfiguration() {
        RequestConfiguration.Builder builder = MobileAds.getRequestConfiguration().toBuilder();
        Integer num = mCoppaValue;
        RequestConfiguration build = num != null ? builder.setTagForChildDirectedTreatment(num.intValue()).build() : null;
        Integer num2 = mEuValue;
        if (num2 != null) {
            build = builder.setTagForUnderAgeOfConsent(num2.intValue()).build();
        }
        if (!TextUtils.isEmpty(mRatingValue)) {
            build = builder.setMaxAdContentRating(mRatingValue).build();
        }
        if (build != null) {
            MobileAds.setRequestConfiguration(build);
        }
    }

    public static AdMobAdapter startAdapter(String str) {
        return new AdMobAdapter(str);
    }

    public void collectBiddingData(final BiddingDataCallback biddingDataCallback, AdFormat adFormat, Bundle bundle) {
        if (mInitState == InitState.INIT_STATE_NONE) {
            IronLog.INTERNAL.verbose("returning null as token since init hasn't started");
            biddingDataCallback.onFailure("returning null as token since init hasn't started - AdMob");
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("query_info_type", "requester_type_2");
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        IronLog.ADAPTER_API.verbose(adFormat.toString());
        QueryInfo.generate(ContextProvider.getInstance().getApplicationContext(), adFormat, new AdRequest.Builder().setRequestAgent("unity").addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle2).build(), new QueryInfoGenerationCallback() { // from class: com.ironsource.adapters.admob.AdMobAdapter.2
            @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
            public void onFailure(String str) {
                BiddingDataCallback biddingDataCallback2 = biddingDataCallback;
                biddingDataCallback2.onFailure("failed to receive token - AdMob " + str);
            }

            @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
            public void onSuccess(QueryInfo queryInfo) {
                String query = !TextUtils.isEmpty(queryInfo.getQuery()) ? queryInfo.getQuery() : "";
                String coreSDKVersion = AdMobAdapter.this.getCoreSDKVersion();
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("token = " + query + ", sdkVersion = " + coreSDKVersion);
                HashMap hashMap = new HashMap();
                hashMap.put("token", query);
                hashMap.put("sdkVersion", coreSDKVersion);
                biddingDataCallback.onSuccess(hashMap);
            }
        });
    }

    public AdRequest createAdRequest(JSONObject jSONObject, String str) {
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.setRequestAgent("unity");
        if (str != null) {
            builder.setAdString(str);
        }
        Bundle bundle = new Bundle();
        bundle.putString("platform_name", "unity");
        boolean z10 = false;
        if (jSONObject != null) {
            String optString = jSONObject.optString("requestId", "");
            z10 = jSONObject.optBoolean("isHybrid", false);
            if (!optString.isEmpty()) {
                bundle.putString("placement_req_id", optString);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("adData requestId = " + optString + ", isHybrid = " + z10);
            }
        } else {
            IronLog.INTERNAL.verbose("adData is null, using default hybridMode = false");
        }
        bundle.putString("is_hybrid_setup", String.valueOf(z10));
        setRequestConfiguration();
        Boolean bool = mConsent;
        if (bool != null || mCCPAValue != null) {
            if (bool != null && !bool.booleanValue()) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.verbose("mConsent = " + mConsent);
                bundle.putString("npa", "1");
            }
            if (mCCPAValue != null) {
                IronLog ironLog3 = IronLog.ADAPTER_API;
                ironLog3.verbose("mCCPAValue = " + mCCPAValue);
                bundle.putInt("rdp", mCCPAValue.booleanValue() ? 1 : 0);
            }
        }
        if (!TextUtils.isEmpty(mContentMappingURLValue)) {
            IronLog ironLog4 = IronLog.ADAPTER_API;
            ironLog4.verbose("mContentMappingURLValue = " + mContentMappingURLValue);
            builder.setContentUrl(mContentMappingURLValue);
        }
        if (!mNeighboringContentMappingURLValue.isEmpty()) {
            IronLog ironLog5 = IronLog.ADAPTER_API;
            ironLog5.verbose("mNeighboringContentMappingURLValue = " + mNeighboringContentMappingURLValue);
            builder.setNeighboringContentUrls(mNeighboringContentMappingURLValue);
        }
        builder.addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle);
        return builder.build();
    }

    public String getAdUnitIdKey() {
        return "adUnitId";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    public InitState getInitState() {
        return mInitState;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.3.43";
    }

    public void initSDK(JSONObject jSONObject) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            mInitState = InitState.INIT_STATE_IN_PROGRESS;
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose();
            if (jSONObject.optBoolean("networkOnlyInit", true)) {
                ironLog.verbose("disableMediationAdapterInitialization");
                MobileAds.disableMediationAdapterInitialization(ContextProvider.getInstance().getApplicationContext());
            }
            if (jSONObject.optBoolean("initResponseRequired", false)) {
                ironLog.verbose("init and wait for callback");
                MobileAds.initialize(ContextProvider.getInstance().getApplicationContext(), new OnInitializationCompleteListener() { // from class: com.ironsource.adapters.admob.AdMobAdapter.1
                    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                    public void onInitializationComplete(InitializationStatus initializationStatus) {
                        AdapterStatus adapterStatus = initializationStatus.getAdapterStatusMap().get("com.google.android.gms.ads.MobileAds");
                        if ((adapterStatus != null ? adapterStatus.getInitializationState() : null) == AdapterStatus.State.READY) {
                            IronLog.ADAPTER_API.verbose("initializationStatus = READY");
                            AdMobAdapter.this.initializationSuccess();
                            return;
                        }
                        IronLog.ADAPTER_API.verbose("initializationStatus = NOT READY");
                        AdMobAdapter.this.initializationFailure();
                    }
                });
                return;
            }
            ironLog.verbose("init without callback");
            MobileAds.initialize(ContextProvider.getInstance().getApplicationContext());
            initializationSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("consent = " + z10);
        mConsent = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1 && str.equalsIgnoreCase(AdMobMetaDataFlags.ADMOB_CONTENT_MAPPING_KEY)) {
            mNeighboringContentMappingURLValue = list;
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("key = " + str + ", values = " + list);
            return;
        }
        String str2 = list.get(0);
        IronLog ironLog2 = IronLog.ADAPTER_API;
        ironLog2.verbose("key = " + str + ", value = " + str2);
        if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str2));
        } else {
            setAdMobMetaDataValue(StringUtils.toLowerCase(str), StringUtils.toLowerCase(str2));
        }
    }
}
