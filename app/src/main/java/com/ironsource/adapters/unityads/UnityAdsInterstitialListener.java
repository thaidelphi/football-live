package com.ironsource.adapters.unityads;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class UnityAdsInterstitialListener implements IUnityAdsLoadListener, IUnityAdsShowListener {
    private WeakReference<UnityAdsAdapter> mAdapter;
    private InterstitialSmashListener mListener;
    private String mPlacementId;

    /* renamed from: com.ironsource.adapters.unityads.UnityAdsInterstitialListener$1  reason: invalid class name */
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
    public UnityAdsInterstitialListener(UnityAdsAdapter unityAdsAdapter, InterstitialSmashListener interstitialSmashListener, String str) {
        this.mAdapter = new WeakReference<>(unityAdsAdapter);
        this.mPlacementId = str;
        this.mListener = interstitialSmashListener;
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
            this.mAdapter.get().mInterstitialAdsAvailability.put(this.mPlacementId, Boolean.TRUE);
            this.mListener.onInterstitialAdReady();
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
            if (unityAdsLoadError != null) {
                buildLoadFailedError = new IronSourceError(unityAdsLoadError == UnityAds.UnityAdsLoadError.NO_FILL ? 1158 : this.mAdapter.get().getUnityAdsLoadErrorCode(unityAdsLoadError), str2);
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("Interstitial", this.mAdapter.get().getProviderName(), str2);
            }
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.error("placementId = " + this.mPlacementId + " ironSourceError = " + buildLoadFailedError);
            this.mListener.onInterstitialAdLoadFailed(buildLoadFailedError);
            this.mAdapter.get().mInterstitialAdsAvailability.put(this.mPlacementId, Boolean.FALSE);
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
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
        if (i10 == 1 || i10 == 2) {
            this.mListener.onInterstitialAdClosed();
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
                buildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", str2);
            }
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.error("placementId = " + this.mPlacementId + "ironSourceError = " + buildShowFailedError);
            this.mListener.onInterstitialAdShowFailed(buildShowFailedError);
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        interstitialSmashListener.onInterstitialAdOpened();
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
