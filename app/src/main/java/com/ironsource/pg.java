package com.ironsource;

import com.facebook.ads.AdError;
import com.unity3d.services.UnityAdsConstants;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum pg {
    ISErrorInitNetworkFailed(AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE, "Initialization failed due to network failure."),
    ISErrorInitDecryptionFailure(AdError.LOAD_CALLED_WHILE_SHOWING_AD, "Initialization failed due to decryption failure."),
    ISErrorInitHttpRequestFailed(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, "Initialization failed due to HTTP request failure."),
    ISErrorInitInvalidResponse(AdError.INCORRECT_STATE_ERROR, "Initialization failed due to invalid response."),
    ISErrorLoadNetworkFailed(7101, "Loading failed due to network failure."),
    ISErrorLoadADMDecryptionFailure(7102, "Loading failed due to ADM decryption failure."),
    ISErrorLoadADMEmptyServerData(7103, "Loading failed due to empty server data."),
    ISErrorLoadADMEmptyWaterfall(7104, "Loading failed due to empty waterfall."),
    ISErrorLoadADMInvalidJSON(7105, "Loading failed due to invalid ADM JSON."),
    ISErrorLoadADMNoAuctionID(7106, "Loading failed due to missing auction ID."),
    ISErrorLoadADMNoConfigurationForRequestedNetwork(7107, "Loading failed due to no configuration for requested network."),
    ISErrorLoadADMInvalidConfigurationForRequestedNetwork(7108, "Loading failed due to invalid configuration for requested network."),
    ISErrorLoadBiddingInNonBidding(7109, "Loading failed due to non-bidding in bidding context."),
    ISErrorLoadNullADM(7110, "Loading failed due to null ADM."),
    ISErrorLoadInstanceNotInInitResponse(7111, "Loading failed due to instance not being in init response."),
    ISErrorLoadNoAdFormatConfigurations(7112, "Loading failed due to no ad format configurations."),
    ISErrorLoadTimedOut(7113, "Loading failed due to timeout."),
    ISErrorLoadSDKNotInitialized(7115, "Loading failed due to SDK not being initialized."),
    ISErrorLoadBannerNetworkViewIsNull(7116, "Loading failed due to null network banner view."),
    ISErrorLoadBannerSizeIsNull(7117, "Loading failed because the banner size is null."),
    ISErrorLoadBannerNotSupportedSize(7118, "Loading failed due to banner size not supported."),
    ISErrorShowNetworkFailed(7201, "Showing ad failed due to network failure."),
    ISErrorShowNotReadyToShowAd(7202, "Showing ad failed because the ad is not ready to show."),
    ISErrorInterstitialLoadNoConfig(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, "Load failed due to no config"),
    ISErrorBannerLoadNoConfig(10001, "Load failed due to no config"),
    ISErrorRewardedLoadNoConfig(10002, "Load failed due to no config");
    

    /* renamed from: a  reason: collision with root package name */
    private final int f19748a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19749b;

    pg(int i10, String str) {
        this.f19748a = i10;
        this.f19749b = str;
    }

    public final int b() {
        return this.f19748a;
    }

    public final String c() {
        return this.f19749b;
    }
}
