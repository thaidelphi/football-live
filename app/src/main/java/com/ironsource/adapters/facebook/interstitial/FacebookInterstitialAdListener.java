package com.ironsource.adapters.facebook.interstitial;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class FacebookInterstitialAdListener implements InterstitialAdExtendedListener {
    private WeakReference<FacebookInterstitialAdapter> mAdapter;
    private boolean mDidCallClosed;
    private InterstitialSmashListener mListener;
    private String mPlacementId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FacebookInterstitialAdListener(FacebookInterstitialAdapter facebookInterstitialAdapter, String str, InterstitialSmashListener interstitialSmashListener) {
        this.mAdapter = new WeakReference<>(facebookInterstitialAdapter);
        this.mListener = interstitialSmashListener;
        this.mPlacementId = str;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookInterstitialAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mAdapter.get().mAdsAvailability.put(this.mPlacementId, Boolean.TRUE);
            this.mListener.onInterstitialAdReady();
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId + " error = " + adError.getErrorCode() + ", " + adError.getErrorMessage());
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookInterstitialAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mAdapter.get().mAdsAvailability.put(this.mPlacementId, Boolean.FALSE);
            IronSourceError ironSourceError = new IronSourceError(FacebookAdapter.isNoFillError(adError) ? 1158 : adError.getErrorCode(), adError.getErrorMessage());
            if (this.mAdapter.get().mPlacementIdToShowAttempts.get(this.mPlacementId).booleanValue()) {
                this.mListener.onInterstitialAdShowFailed(ironSourceError);
                return;
            } else {
                this.mListener.onInterstitialAdLoadFailed(ironSourceError);
                return;
            }
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookInterstitialAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            if (this.mDidCallClosed) {
                return;
            }
            this.mListener.onInterstitialAdClosed();
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookInterstitialAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mDidCallClosed = true;
            this.mListener.onInterstitialAdClosed();
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookInterstitialAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mDidCallClosed = false;
            this.mListener.onInterstitialAdOpened();
            this.mListener.onInterstitialAdShowSucceeded();
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
    }
}
