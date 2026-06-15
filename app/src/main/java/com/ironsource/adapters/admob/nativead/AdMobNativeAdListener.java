package com.ironsource.adapters.admob.nativead;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.ironsource.adapters.admob.AdMobAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AdMobNativeAdListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
    private final String mAdUnitId;
    private final WeakReference<AdMobNativeAdAdapter> mAdapter;
    private final NativeAdSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdMobNativeAdListener(AdMobNativeAdAdapter adMobNativeAdAdapter, String str, NativeAdSmashListener nativeAdSmashListener) {
        this.mAdapter = new WeakReference<>(adMobNativeAdAdapter);
        this.mAdUnitId = str;
        this.mListener = nativeAdSmashListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        NativeAdSmashListener nativeAdSmashListener = this.mListener;
        if (nativeAdSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            nativeAdSmashListener.onNativeAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        IronSourceError buildLoadFailedError;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        String str = loadAdError.getMessage() + "( " + loadAdError.getCode() + " ) ";
        if (loadAdError.getCause() != null) {
            str = str + " Caused by - " + loadAdError.getCause();
        }
        ironLog.error("adapterError = " + str);
        if (AdMobAdapter.isNoFillError(loadAdError.getCode())) {
            buildLoadFailedError = new IronSourceError(IronSourceError.ERROR_NT_LOAD_NO_FILL, str);
        } else {
            buildLoadFailedError = ErrorBuilder.buildLoadFailedError(str);
        }
        this.mListener.onNativeAdLoadFailed(buildLoadFailedError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        NativeAdSmashListener nativeAdSmashListener = this.mListener;
        if (nativeAdSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            nativeAdSmashListener.onNativeAdShown();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<AdMobNativeAdAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mAdapter.get().mAd = new WeakReference<>(nativeAd);
            this.mListener.onNativeAdLoaded(new AdMobNativeAdData(nativeAd), new AdMobNativeAdViewBinder(nativeAd));
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }
}
