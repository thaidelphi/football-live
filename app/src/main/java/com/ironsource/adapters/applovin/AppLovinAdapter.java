package com.ironsource.adapters.applovin;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
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
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AppLovinAdapter extends AbstractAdapter implements INetworkInitCallbackListener {
    private static final String DEFAULT_ZONE_ID = "defaultZoneId";
    private static final String GitHash = "2f1cc83";
    private static final String META_DATA_APPLOVIN_AGE_RESTRICTION_KEY = "AppLovin_AgeRestrictedUser";
    private static final String SDK_KEY = "sdkKey";
    private static final String VERSION = "4.3.42";
    private static final String ZONE_ID = "zoneId";
    private static AppLovinSdk mAppLovinSdk;
    protected final CopyOnWriteArraySet<String> mRewardedVideoZoneIdsForInitCallbacks;
    protected final ConcurrentHashMap<String, AppLovinBannerListener> mZoneIdToAppLovinBannerListener;
    protected final ConcurrentHashMap<String, AppLovinInterstitialListener> mZoneIdToAppLovinInterstitialListener;
    protected final ConcurrentHashMap<String, AppLovinRewardedVideoListener> mZoneIdToAppLovinRewardedVideoListener;
    protected final ConcurrentHashMap<String, AppLovinAdView> mZoneIdToBannerAd;
    protected final ConcurrentHashMap<String, FrameLayout.LayoutParams> mZoneIdToBannerLayout;
    protected final ConcurrentHashMap<String, AppLovinAdSize> mZoneIdToBannerSize;
    protected final ConcurrentHashMap<String, BannerSmashListener> mZoneIdToBannerSmashListener;
    protected final ConcurrentHashMap<String, AppLovinAd> mZoneIdToInterstitialAd;
    protected final ConcurrentHashMap<String, Boolean> mZoneIdToInterstitialAdReadyStatus;
    protected final ConcurrentHashMap<String, InterstitialSmashListener> mZoneIdToInterstitialSmashListener;
    protected final ConcurrentHashMap<String, AppLovinIncentivizedInterstitial> mZoneIdToRewardedVideoAd;
    protected final ConcurrentHashMap<String, RewardedVideoSmashListener> mZoneIdToRewardedVideoSmashListener;
    private static final AtomicBoolean mWasInitCalled = new AtomicBoolean(false);
    private static InitState mInitState = InitState.INIT_STATE_NONE;
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    /* renamed from: com.ironsource.adapters.applovin.AppLovinAdapter$9  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] $SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState;

        static {
            int[] iArr = new int[InitState.values().length];
            $SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState = iArr;
            try {
                iArr[InitState.INIT_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[InitState.INIT_STATE_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS
    }

    private AppLovinAdapter(String str) {
        super(str);
        IronLog.INTERNAL.verbose();
        this.mZoneIdToAppLovinRewardedVideoListener = new ConcurrentHashMap<>();
        this.mZoneIdToRewardedVideoAd = new ConcurrentHashMap<>();
        this.mZoneIdToRewardedVideoSmashListener = new ConcurrentHashMap<>();
        this.mRewardedVideoZoneIdsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mZoneIdToAppLovinInterstitialListener = new ConcurrentHashMap<>();
        this.mZoneIdToInterstitialAd = new ConcurrentHashMap<>();
        this.mZoneIdToInterstitialSmashListener = new ConcurrentHashMap<>();
        this.mZoneIdToInterstitialAdReadyStatus = new ConcurrentHashMap<>();
        this.mZoneIdToAppLovinBannerListener = new ConcurrentHashMap<>();
        this.mZoneIdToBannerSmashListener = new ConcurrentHashMap<>();
        this.mZoneIdToBannerLayout = new ConcurrentHashMap<>();
        this.mZoneIdToBannerAd = new ConcurrentHashMap<>();
        this.mZoneIdToBannerSize = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private AppLovinAdSize calculateBannerSize(ISBannerSize iSBannerSize, boolean z10) {
        if (iSBannerSize == null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error(getProviderName() + " calculateLayoutParams - bannerSize is null");
            return null;
        }
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
                return AppLovinAdSize.MREC;
            case 1:
            case 3:
                return AppLovinAdSize.BANNER;
            case 2:
                return z10 ? AppLovinAdSize.LEADER : AppLovinAdSize.BANNER;
            case 4:
                if (iSBannerSize.getHeight() >= 40 && iSBannerSize.getHeight() <= 60) {
                    return AppLovinAdSize.BANNER;
                }
                break;
        }
        return null;
    }

    public static String getAdapterSDKVersion() {
        return AppLovinSdk.VERSION;
    }

    private AppLovinSdkSettings getAppLovinSDKSetting() {
        AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings(ContextProvider.getInstance().getApplicationContext());
        appLovinSdkSettings.setVerboseLogging(isAdaptersDebugEnabled());
        return appLovinSdkSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r3.equals(com.ironsource.mediationsdk.l.f18872c) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.FrameLayout.LayoutParams getBannerLayoutParams(com.ironsource.mediationsdk.ISBannerSize r7) {
        /*
            r6 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 0
            r0.<init>(r1, r1)
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r3 = r7.getDescription()
            r3.hashCode()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case -387072689: goto L4b;
                case 72205083: goto L40;
                case 79011241: goto L35;
                case 1951953708: goto L2a;
                case 1999208305: goto L1f;
                default: goto L1d;
            }
        L1d:
            r1 = r5
            goto L54
        L1f:
            java.lang.String r1 = "CUSTOM"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L28
            goto L1d
        L28:
            r1 = 4
            goto L54
        L2a:
            java.lang.String r1 = "BANNER"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L33
            goto L1d
        L33:
            r1 = 3
            goto L54
        L35:
            java.lang.String r1 = "SMART"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            goto L1d
        L3e:
            r1 = 2
            goto L54
        L40:
            java.lang.String r1 = "LARGE"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L49
            goto L1d
        L49:
            r1 = 1
            goto L54
        L4b:
            java.lang.String r4 = "RECTANGLE"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L54
            goto L1d
        L54:
            r3 = 50
            r4 = 320(0x140, float:4.48E-43)
            switch(r1) {
                case 0: goto Lae;
                case 1: goto La0;
                case 2: goto L7a;
                case 3: goto La0;
                case 4: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto Lbf
        L5c:
            int r1 = r7.getHeight()
            r5 = 40
            if (r1 < r5) goto Lbf
            int r7 = r7.getHeight()
            r1 = 60
            if (r7 > r1) goto Lbf
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r7 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r4)
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r3)
            r0.<init>(r7, r1)
            goto Lbf
        L7a:
            boolean r7 = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(r2)
            if (r7 == 0) goto L92
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r7 = 728(0x2d8, float:1.02E-42)
            int r7 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r7)
            r1 = 90
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r1)
            r0.<init>(r7, r1)
            goto Lbf
        L92:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r7 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r4)
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r3)
            r0.<init>(r7, r1)
            goto Lbf
        La0:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r7 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r4)
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r3)
            r0.<init>(r7, r1)
            goto Lbf
        Lae:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r7 = 300(0x12c, float:4.2E-43)
            int r7 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r7)
            r1 = 250(0xfa, float:3.5E-43)
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r1)
            r0.<init>(r7, r1)
        Lbf:
            r7 = 17
            r0.gravity = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.applovin.AppLovinAdapter.getBannerLayoutParams(com.ironsource.mediationsdk.ISBannerSize):android.widget.FrameLayout$LayoutParams");
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData("AppLovin", "4.3.42");
    }

    private String getZoneId(JSONObject jSONObject) {
        return !TextUtils.isEmpty(jSONObject.optString(ZONE_ID)) ? jSONObject.optString(ZONE_ID) : DEFAULT_ZONE_ID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initSdk(String str, String str2) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("sdkKey = " + str);
            mInitState = InitState.INIT_STATE_IN_PROGRESS;
            AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(str, getAppLovinSDKSetting(), ContextProvider.getInstance().getApplicationContext());
            mAppLovinSdk = appLovinSdk;
            appLovinSdk.setMediationProvider(AppLovinMediationProvider.IRONSOURCE);
            if (!TextUtils.isEmpty(str2)) {
                ironLog.verbose("setUserIdentifier to " + str2);
                mAppLovinSdk.setUserIdentifier(str2);
            }
            mAppLovinSdk.initializeSdk(new AppLovinSdk.SdkInitializationListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.1
                @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
                public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                    AppLovinAdapter.this.initializationSuccess();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = InitState.INIT_STATE_SUCCESS;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    private void loadRewardedVideoInternal(String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        AppLovinIncentivizedInterstitial create;
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + str);
        if (this.mZoneIdToRewardedVideoAd.containsKey(str)) {
            create = this.mZoneIdToRewardedVideoAd.get(str);
        } else {
            if (!str.equals(DEFAULT_ZONE_ID)) {
                create = AppLovinIncentivizedInterstitial.create(str, mAppLovinSdk);
            } else {
                create = AppLovinIncentivizedInterstitial.create(mAppLovinSdk);
            }
            this.mZoneIdToRewardedVideoAd.put(str, create);
        }
        AppLovinRewardedVideoListener appLovinRewardedVideoListener = new AppLovinRewardedVideoListener(this, rewardedVideoSmashListener, str);
        this.mZoneIdToAppLovinRewardedVideoListener.put(str, appLovinRewardedVideoListener);
        create.preload(appLovinRewardedVideoListener);
    }

    private void setAgeRestrictionValue(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + z10);
        AppLovinPrivacySettings.setIsAgeRestrictedUser(z10, ContextProvider.getInstance().getApplicationContext());
    }

    private void setCCPAValue(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + z10);
        AppLovinPrivacySettings.setDoNotSell(z10, ContextProvider.getInstance().getApplicationContext());
    }

    public static AppLovinAdapter startAdapter(String str) {
        return new AppLovinAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject jSONObject) {
        final String zoneId = getZoneId(jSONObject);
        final AppLovinAdView appLovinAdView = this.mZoneIdToBannerAd.get(zoneId);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.7
            @Override // java.lang.Runnable
            public void run() {
                AppLovinAdView appLovinAdView2 = appLovinAdView;
                if (appLovinAdView2 != null) {
                    appLovinAdView2.destroy();
                }
                AppLovinAdapter.this.mZoneIdToBannerAd.remove(zoneId);
                AppLovinAdapter.this.mZoneIdToBannerLayout.remove(zoneId);
                AppLovinAdapter.this.mZoneIdToAppLovinBannerListener.remove(zoneId);
                AppLovinAdapter.this.mZoneIdToBannerSize.remove(zoneId);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getErrorString(int i10) {
        if (i10 != -8) {
            if (i10 != -7) {
                if (i10 != -6) {
                    switch (i10) {
                        case -1009:
                            return "The device had no network connectivity at the time of an ad request, either due to airplane mode or no service.";
                        case -1001:
                            return "The network conditions prevented the SDK from receiving an ad.";
                        case AppLovinErrorCodes.INVALID_URL /* -900 */:
                            return "A postback URL you attempted to dispatch was empty or nil.";
                        case AppLovinErrorCodes.INVALID_RESPONSE /* -800 */:
                            return "The AppLovin servers have returned an invalid response";
                        case AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO /* -600 */:
                            return "The user exited out of the ad early. You may or may not wish to grant a reward depending on your preference.";
                        case AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT /* -500 */:
                            return "A reward validation requested timed out (usually due to poor connectivity).";
                        case AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR /* -400 */:
                            return "An unknown server-side error occurred.";
                        case AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED /* -300 */:
                            return "The developer called for a rewarded video before one was available.";
                        case AppLovinErrorCodes.SDK_DISABLED /* -22 */:
                            return "The SDK is currently disabled.";
                        case -1:
                            return "The system is in unexpected state.";
                        case 204:
                            return "No ads are currently eligible for your device.";
                        default:
                            switch (i10) {
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                                    return "An attempt to cache a video resource to the filesystem failed; the device may be out of space.";
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                                    return "An attempt to cache an image resource to the filesystem failed; the device may be out of space.";
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES /* -200 */:
                                    return "An attempt to cache a resource to the filesystem failed; the device may be out of space.";
                                default:
                                    return "Unknown error";
                            }
                    }
                }
                return "There has been a failure to render an ad on screen.";
            }
            return "The zone provided is invalid; the zone needs to be added to your AppLovin account or may still be propagating to our servers.";
        }
        return "The provided ad token is invalid; ad token must be returned from AppLovin S2S integration.";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.3.42";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, final String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String zoneId = getZoneId(jSONObject);
        final String optString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("Missing param - sdkKey");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else if (TextUtils.isEmpty(zoneId)) {
            IronLog.INTERNAL.error("Missing param - zoneId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("zoneId = " + zoneId);
            this.mZoneIdToRewardedVideoSmashListener.put(zoneId, rewardedVideoSmashListener);
            int i10 = AnonymousClass9.$SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[mInitState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AppLovinAdapter.this.initSdk(optString, str2);
                    }
                });
            } else if (i10 != 3) {
            } else {
                loadRewardedVideoInternal(zoneId, rewardedVideoSmashListener);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String str, final String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String zoneId = getZoneId(jSONObject);
        final String optString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("Missing param - sdkKey");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing param - sdkKey", "Banner"));
        } else if (TextUtils.isEmpty(zoneId)) {
            IronLog.INTERNAL.error("Missing param - zoneId");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing param - zoneId", "Banner"));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("zoneId = " + zoneId);
            this.mZoneIdToBannerSmashListener.put(zoneId, bannerSmashListener);
            int i10 = AnonymousClass9.$SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[mInitState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.5
                    @Override // java.lang.Runnable
                    public void run() {
                        AppLovinAdapter.this.initSdk(optString, str2);
                    }
                });
            } else if (i10 != 3) {
            } else {
                bannerSmashListener.onBannerInitSuccess();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, final String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String zoneId = getZoneId(jSONObject);
        final String optString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("Missing param - sdkKey");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing param - sdkKey", "Interstitial"));
        } else if (TextUtils.isEmpty(zoneId)) {
            IronLog.INTERNAL.error("Missing param - zoneId");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing param - zoneId", "Interstitial"));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("zoneId = " + zoneId);
            this.mZoneIdToInterstitialSmashListener.put(zoneId, interstitialSmashListener);
            int i10 = AnonymousClass9.$SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[mInitState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.4
                    @Override // java.lang.Runnable
                    public void run() {
                        AppLovinAdapter.this.initSdk(optString, str2);
                    }
                });
            } else if (i10 != 3) {
            } else {
                interstitialSmashListener.onInterstitialInitSuccess();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, final String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String zoneId = getZoneId(jSONObject);
        final String optString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("error - missing param - sdkKey");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing param - sdkKey", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else if (TextUtils.isEmpty(zoneId)) {
            IronLog.INTERNAL.error("Missing param - zoneId");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing param - zoneId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("zoneId = " + zoneId);
            this.mZoneIdToRewardedVideoSmashListener.put(zoneId, rewardedVideoSmashListener);
            this.mRewardedVideoZoneIdsForInitCallbacks.add(zoneId);
            int i10 = AnonymousClass9.$SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[mInitState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AppLovinAdapter.this.initSdk(optString, str2);
                    }
                });
            } else if (i10 != 3) {
            } else {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        String zoneId = getZoneId(jSONObject);
        return this.mZoneIdToInterstitialAd.containsKey(zoneId) && this.mZoneIdToInterstitialAdReadyStatus.containsKey(zoneId) && this.mZoneIdToInterstitialAdReadyStatus.get(zoneId).booleanValue();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.mZoneIdToRewardedVideoAd.get(getZoneId(jSONObject));
        return appLovinIncentivizedInterstitial != null && appLovinIncentivizedInterstitial.isAdReadyToDisplay();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, final IronSourceBannerLayout ironSourceBannerLayout, final BannerSmashListener bannerSmashListener) {
        final String zoneId = getZoneId(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        if (ironSourceBannerLayout == null) {
            IronLog.INTERNAL.error("banner layout is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner layout is null"));
            return;
        }
        final AppLovinAdSize calculateBannerSize = calculateBannerSize(ironSourceBannerLayout.getSize(), AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()));
        if (calculateBannerSize == null) {
            IronLog.INTERNAL.error("size not supported, size is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
            return;
        }
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FrameLayout.LayoutParams bannerLayoutParams = AppLovinAdapter.this.getBannerLayoutParams(ironSourceBannerLayout.getSize());
                    AppLovinBannerListener appLovinBannerListener = new AppLovinBannerListener(AppLovinAdapter.this, bannerSmashListener, zoneId, bannerLayoutParams);
                    AppLovinAdView appLovinAdView = new AppLovinAdView(AppLovinAdapter.mAppLovinSdk, calculateBannerSize, ContextProvider.getInstance().getApplicationContext());
                    appLovinAdView.setAdDisplayListener(appLovinBannerListener);
                    appLovinAdView.setAdClickListener(appLovinBannerListener);
                    appLovinAdView.setAdViewEventListener(appLovinBannerListener);
                    AppLovinAdapter.this.mZoneIdToBannerAd.put(zoneId, appLovinAdView);
                    AppLovinAdapter.this.mZoneIdToBannerLayout.put(zoneId, bannerLayoutParams);
                    AppLovinAdapter.this.mZoneIdToAppLovinBannerListener.put(zoneId, appLovinBannerListener);
                    AppLovinAdapter.this.mZoneIdToBannerSize.put(zoneId, calculateBannerSize);
                    if (!zoneId.equals(AppLovinAdapter.DEFAULT_ZONE_ID)) {
                        AppLovinAdapter.mAppLovinSdk.getAdService().loadNextAdForZoneId(zoneId, appLovinBannerListener);
                    } else {
                        AppLovinAdapter.mAppLovinSdk.getAdService().loadNextAd(calculateBannerSize, appLovinBannerListener);
                    }
                } catch (Exception e8) {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(AppLovinAdapter.this.getProviderName() + " loadBanner exception " + e8.getMessage()));
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        String zoneId = getZoneId(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        AppLovinInterstitialListener appLovinInterstitialListener = new AppLovinInterstitialListener(this, interstitialSmashListener, zoneId);
        this.mZoneIdToAppLovinInterstitialListener.put(zoneId, appLovinInterstitialListener);
        if (!zoneId.equals(DEFAULT_ZONE_ID)) {
            mAppLovinSdk.getAdService().loadNextAdForZoneId(zoneId, appLovinInterstitialListener);
        } else {
            mAppLovinSdk.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinInterstitialListener);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        loadRewardedVideoInternal(getZoneId(jSONObject), rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (String str : this.mZoneIdToRewardedVideoSmashListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mZoneIdToRewardedVideoSmashListener.get(str);
            if (this.mRewardedVideoZoneIdsForInitCallbacks.contains(str)) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoInternal(str, rewardedVideoSmashListener);
            }
        }
        for (InterstitialSmashListener interstitialSmashListener : this.mZoneIdToInterstitialSmashListener.values()) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
        for (BannerSmashListener bannerSmashListener : this.mZoneIdToBannerSmashListener.values()) {
            bannerSmashListener.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.ReleaseMemoryAdapterInterface
    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + ad_unit);
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.mZoneIdToAppLovinRewardedVideoListener.clear();
            this.mZoneIdToRewardedVideoAd.clear();
            this.mZoneIdToRewardedVideoSmashListener.clear();
            this.mRewardedVideoZoneIdsForInitCallbacks.clear();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.mZoneIdToAppLovinInterstitialListener.clear();
            this.mZoneIdToInterstitialAdReadyStatus.clear();
            this.mZoneIdToInterstitialAd.clear();
            this.mZoneIdToInterstitialSmashListener.clear();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.8
                @Override // java.lang.Runnable
                public void run() {
                    for (AppLovinAdView appLovinAdView : AppLovinAdapter.this.mZoneIdToBannerAd.values()) {
                        appLovinAdView.destroy();
                    }
                    AppLovinAdapter.this.mZoneIdToAppLovinBannerListener.clear();
                    AppLovinAdapter.this.mZoneIdToBannerSmashListener.clear();
                    AppLovinAdapter.this.mZoneIdToBannerLayout.clear();
                    AppLovinAdapter.this.mZoneIdToBannerAd.clear();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("consent = " + z10);
        AppLovinPrivacySettings.setHasUserConsent(z10, ContextProvider.getInstance().getApplicationContext());
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
        if (MetaDataUtils.isValidMetaData(str, META_DATA_APPLOVIN_AGE_RESTRICTION_KEY, formatValueForType)) {
            setAgeRestrictionValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String zoneId = getZoneId(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        if (isInterstitialReady(jSONObject)) {
            AppLovinInterstitialListener appLovinInterstitialListener = this.mZoneIdToAppLovinInterstitialListener.get(zoneId);
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(mAppLovinSdk, ContextProvider.getInstance().getCurrentActiveActivity());
            create.setAdClickListener(appLovinInterstitialListener);
            create.setAdDisplayListener(appLovinInterstitialListener);
            create.setAdVideoPlaybackListener(appLovinInterstitialListener);
            create.showAndRender(this.mZoneIdToInterstitialAd.get(zoneId));
            this.mZoneIdToInterstitialAdReadyStatus.put(zoneId, Boolean.FALSE);
            return;
        }
        interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String zoneId = getZoneId(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        if (isRewardedVideoAvailable(jSONObject)) {
            if (!TextUtils.isEmpty(getDynamicUserId())) {
                mAppLovinSdk.setUserIdentifier(getDynamicUserId());
            }
            AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.mZoneIdToRewardedVideoAd.get(zoneId);
            AppLovinRewardedVideoListener appLovinRewardedVideoListener = this.mZoneIdToAppLovinRewardedVideoListener.get(zoneId);
            appLovinIncentivizedInterstitial.show(ContextProvider.getInstance().getCurrentActiveActivity(), appLovinRewardedVideoListener, appLovinRewardedVideoListener, appLovinRewardedVideoListener, appLovinRewardedVideoListener);
            return;
        }
        rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
    }
}
