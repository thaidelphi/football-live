package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.d7;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinSdk;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class MediationAdapterBase implements MaxAdapter, MaxNativeAdAdapter, MaxInterstitialAdViewAdapter, MaxRewardedAdViewAdapter, MaxAppOpenAdapter {
    private boolean alwaysRewardUser;
    private final n mLogger;
    private final j mSdk;
    private final String mTag;
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        j a10 = appLovinSdk.a();
        this.mSdk = a10;
        this.mLogger = a10.I();
        this.mTag = getClass().getSimpleName();
    }

    protected static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    protected void checkActivities(Context context, Class<?>... clsArr) {
    }

    protected void checkExistence(Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        for (Class<?> cls : clsArr) {
            log("Found: " + cls.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i10 = BundleUtils.getInt("amount", 0, serverParameters);
        String string = BundleUtils.getString("currency", "", serverParameters);
        log("Creating reward: " + i10 + " " + string);
        this.reward = MaxRewardImpl.create(i10, string);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Future<Drawable> createDrawableFuture(final String str, final Resources resources) {
        return getCachingExecutorService().submit(new Callable<Drawable>() { // from class: com.applovin.mediation.adapters.MediationAdapterBase.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Drawable call() throws Exception {
                InputStream openStream = new URL(str).openStream();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(openStream));
                openStream.close();
                return bitmapDrawable;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str) {
        if (n.a()) {
            this.mLogger.a(this.mTag, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(String str) {
        if (n.a()) {
            this.mLogger.b(this.mTag, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context getApplicationContext() {
        return j.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ExecutorService getCachingExecutorService() {
        return this.mSdk.i0().b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxRewardImpl.createDefault();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getVersionString(Class cls, String str) {
        String b10 = d7.b(cls, str);
        if (b10 == null) {
            log("Failed to retrieve version string.");
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    protected void i(String str) {
        if (n.a()) {
            this.mLogger.d(this.mTag, str);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public boolean isBeta() {
        return false;
    }

    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support native ads.");
        maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void log(String str) {
        if (n.a()) {
            this.mLogger.d(this.mTag, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldCollectSignalsOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldDestroyOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldInitializeOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return null;
    }

    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, i iVar, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support interstitial ad view ads.");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, i iVar, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support rewarded ad view ads.");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    protected void userError(String str) {
        userError(str, null);
    }

    protected void w(String str) {
        if (n.a()) {
            this.mLogger.k(this.mTag, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(String str, Throwable th) {
        if (n.a()) {
            this.mLogger.a(this.mTag, str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void log(String str, Throwable th) {
        if (n.a()) {
            this.mLogger.a(this.mTag, str, th);
        }
    }

    protected void userError(String str, Throwable th) {
        n.c(this.mTag, str, th);
    }
}
