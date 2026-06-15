package com.ironsource.adapters.unityads;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class UnityAdsBannerListener implements BannerView.IListener {
    private WeakReference<UnityAdsAdapter> mAdapter;
    private BannerSmashListener mListener;
    private String mPlacementId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnityAdsBannerListener(UnityAdsAdapter unityAdsAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mAdapter = new WeakReference<>(unityAdsAdapter);
        this.mPlacementId = str;
        this.mListener = bannerSmashListener;
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerClick(BannerView bannerView) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        IronSourceError buildLoadFailedError;
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<UnityAdsAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            String str = this.mAdapter.get().getProviderName() + " banner, onAdLoadFailed placementId " + this.mPlacementId + " with error: " + bannerErrorInfo.errorMessage;
            if (bannerErrorInfo.errorCode == BannerErrorCode.NO_FILL) {
                buildLoadFailedError = new IronSourceError(606, str);
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError(str);
            }
            IronLog.ADAPTER_CALLBACK.error("placementId = " + this.mPlacementId + " ironSourceError = " + buildLoadFailedError);
            this.mListener.onBannerAdLoadFailed(buildLoadFailedError);
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLeftApplication(BannerView bannerView) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdLeftApplication();
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLoaded(BannerView bannerView) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<UnityAdsAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mListener.onBannerAdLoaded(bannerView, this.mAdapter.get().createLayoutParams(bannerView.getSize()));
        } else {
            IronLog.INTERNAL.verbose("adapter is null");
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerShown(BannerView bannerView) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<UnityAdsAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mListener.onBannerAdShown();
        } else {
            IronLog.INTERNAL.verbose("adapter is null");
        }
    }
}
