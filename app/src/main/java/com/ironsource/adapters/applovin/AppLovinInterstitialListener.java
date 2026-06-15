package com.ironsource.adapters.applovin;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AppLovinInterstitialListener implements AppLovinAdLoadListener, AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
    private final WeakReference<AppLovinAdapter> mAdapter;
    private final InterstitialSmashListener mListener;
    private final String mZoneId;

    public AppLovinInterstitialListener(AppLovinAdapter appLovinAdapter, InterstitialSmashListener interstitialSmashListener, String str) {
        this.mAdapter = new WeakReference<>(appLovinAdapter);
        this.mZoneId = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("zoneId = " + this.mZoneId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("zoneId = " + this.mZoneId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        interstitialSmashListener.onInterstitialAdShowSucceeded();
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("zoneId = " + this.mZoneId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("zoneId = " + this.mZoneId);
        WeakReference<AppLovinAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            WeakReference<AppLovinAdapter> weakReference2 = this.mAdapter;
            if (weakReference2 != null && weakReference2.get() != null) {
                this.mAdapter.get().mZoneIdToInterstitialAd.put(this.mZoneId, appLovinAd);
                this.mAdapter.get().mZoneIdToInterstitialAdReadyStatus.put(this.mZoneId, Boolean.TRUE);
                this.mListener.onInterstitialAdReady();
                return;
            }
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        IronLog.INTERNAL.verbose("listener is null");
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("zoneId = " + this.mZoneId + ", errorCode = " + i10);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else if (this.mAdapter.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            IronSourceError ironSourceError = new IronSourceError(i10 == 204 ? 1158 : i10, this.mAdapter.get().getErrorString(i10));
            this.mAdapter.get().mZoneIdToInterstitialAdReadyStatus.put(this.mZoneId, Boolean.FALSE);
            this.mListener.onInterstitialAdLoadFailed(ironSourceError);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("zoneId = " + this.mZoneId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        }
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("zoneId = " + this.mZoneId);
    }
}
