package com.ironsource.adapters.facebook.rewardedvideo;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class FacebookRewardedVideoAdListener implements RewardedVideoAdExtendedListener {
    private WeakReference<FacebookRewardedVideoAdapter> mAdapter;
    private boolean mDidCallClosed;
    private RewardedVideoSmashListener mListener;
    private String mPlacementId;

    public FacebookRewardedVideoAdListener(FacebookRewardedVideoAdapter facebookRewardedVideoAdapter, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mAdapter = new WeakReference<>(facebookRewardedVideoAdapter);
        this.mPlacementId = str;
        this.mListener = rewardedVideoSmashListener;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
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
        WeakReference<FacebookRewardedVideoAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mAdapter.get().mAdsAvailability.put(this.mPlacementId, Boolean.TRUE);
            this.mListener.onRewardedVideoAvailabilityChanged(true);
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
        WeakReference<FacebookRewardedVideoAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mAdapter.get().mAdsAvailability.put(this.mPlacementId, Boolean.FALSE);
            IronSourceError ironSourceError = new IronSourceError(FacebookAdapter.isNoFillError(adError) ? 1058 : adError.getErrorCode(), adError.getErrorMessage());
            if (this.mAdapter.get().mPlacementIdToShowAttempts.get(this.mPlacementId).booleanValue()) {
                this.mListener.onRewardedVideoAdShowFailed(ironSourceError);
                return;
            }
            this.mListener.onRewardedVideoAvailabilityChanged(false);
            this.mListener.onRewardedVideoLoadFailed(ironSourceError);
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookRewardedVideoAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mDidCallClosed = false;
            this.mListener.onRewardedVideoAdOpened();
            this.mListener.onRewardedVideoAdStarted();
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookRewardedVideoAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            if (this.mDidCallClosed) {
                return;
            }
            this.mListener.onRewardedVideoAdClosed();
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookRewardedVideoAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mDidCallClosed = true;
            this.mListener.onRewardedVideoAdClosed();
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        rewardedVideoSmashListener.onRewardedVideoAdEnded();
        this.mListener.onRewardedVideoAdRewarded();
    }
}
