package com.ironsource.adapters.unityads;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class UnityAdsRewardedVideoListener implements IUnityAdsLoadListener, IUnityAdsShowListener {
    private WeakReference<UnityAdsAdapter> mAdapter;
    private RewardedVideoSmashListener mListener;
    private String mPlacementId;

    /* renamed from: com.ironsource.adapters.unityads.UnityAdsRewardedVideoListener$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowCompletionState;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowCompletionState.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowCompletionState = iArr;
            try {
                iArr[UnityAds.UnityAdsShowCompletionState.SKIPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowCompletionState[UnityAds.UnityAdsShowCompletionState.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnityAdsRewardedVideoListener(UnityAdsAdapter unityAdsAdapter, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        this.mAdapter = new WeakReference<>(unityAdsAdapter);
        this.mPlacementId = str;
        this.mListener = rewardedVideoSmashListener;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<UnityAdsAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mAdapter.get().mRewardedVideoAdsAvailability.put(this.mPlacementId, Boolean.TRUE);
            this.mListener.onRewardedVideoAvailabilityChanged(true);
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        IronSourceError buildLoadFailedError;
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<UnityAdsAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mAdapter.get().mRewardedVideoAdsAvailability.put(this.mPlacementId, Boolean.FALSE);
            this.mListener.onRewardedVideoAvailabilityChanged(false);
            if (unityAdsLoadError != null) {
                buildLoadFailedError = new IronSourceError(unityAdsLoadError == UnityAds.UnityAdsLoadError.NO_FILL ? 1058 : this.mAdapter.get().getUnityAdsLoadErrorCode(unityAdsLoadError), str2);
                this.mListener.onRewardedVideoLoadFailed(buildLoadFailedError);
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, this.mAdapter.get().getProviderName(), str2);
            }
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.error("placementId = " + this.mPlacementId + " ironSourceError = " + buildLoadFailedError);
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId + " completionState: " + unityAdsShowCompletionState);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowCompletionState[unityAdsShowCompletionState.ordinal()];
        if (i10 == 1) {
            this.mListener.onRewardedVideoAdClosed();
        } else if (i10 != 2) {
        } else {
            this.mListener.onRewardedVideoAdEnded();
            this.mListener.onRewardedVideoAdRewarded();
            this.mListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        IronSourceError buildShowFailedError;
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<UnityAdsAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            if (unityAdsShowError != null) {
                buildShowFailedError = new IronSourceError(this.mAdapter.get().getUnityAdsShowErrorCode(unityAdsShowError), str2);
            } else {
                buildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str2);
            }
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.error("placementId = " + this.mPlacementId + " ironSourceError = " + buildShowFailedError);
            this.mListener.onRewardedVideoAdShowFailed(buildShowFailedError);
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        rewardedVideoSmashListener.onRewardedVideoAdOpened();
        this.mListener.onRewardedVideoAdStarted();
    }
}
