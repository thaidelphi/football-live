package com.ariabolds.dateobjectz;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.lifecycle.a0;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.sdk.AppLovinSdk;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ApplovinAppOpenManager implements o, MaxAdListener {

    /* renamed from: a  reason: collision with root package name */
    MaxAppOpenAd f10072a;

    /* renamed from: b  reason: collision with root package name */
    Context f10073b;

    /* renamed from: c  reason: collision with root package name */
    SharedPreferences f10074c;

    public ApplovinAppOpenManager(Context context) {
        a0.l().getLifecycle().a(this);
        this.f10073b = context;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f10074c = defaultSharedPreferences;
        MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(defaultSharedPreferences.getString("applovin_app_open", ""), context);
        this.f10072a = maxAppOpenAd;
        maxAppOpenAd.setListener(this);
        this.f10072a.loadAd();
    }

    private void g() {
        if (this.f10072a == null || !AppLovinSdk.getInstance(this.f10073b).isInitialized()) {
            return;
        }
        if (this.f10072a.isReady()) {
            this.f10072a.showAd();
        } else {
            this.f10072a.loadAd();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f10072a.loadAd();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        this.f10072a.loadAd();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
    }

    @y(i.a.ON_START)
    public void onStart() {
        g();
    }
}
