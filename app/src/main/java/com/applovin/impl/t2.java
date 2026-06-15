package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.d;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.LinkedList;
import java.util.Queue;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a  reason: collision with root package name */
    private final int f9240a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxNativeAdLoader f9241b;

    /* renamed from: c  reason: collision with root package name */
    private final Queue f9242c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f9243d = false;

    /* renamed from: e  reason: collision with root package name */
    private final Object f9244e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private a f9245f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public t2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f9240a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f9245f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f9241b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, d.b.NATIVE_AD_PLACER);
    }

    public void a(MaxAd maxAd) {
        this.f9241b.destroy(maxAd);
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f9244e) {
            maxAd = null;
            while (!this.f9242c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = (MaxAd) this.f9242c.remove();
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f9245f = null;
        a();
        this.f9241b.destroy();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f9244e) {
            z10 = !this.f9242c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f9244e) {
            if (!this.f9243d && this.f9242c.size() < this.f9240a) {
                this.f9243d = true;
                this.f9241b.loadAd();
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f9245f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f9245f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f9245f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f9244e) {
            this.f9242c.add(maxAd);
            this.f9243d = false;
            e();
        }
        a aVar = this.f9245f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a() {
        synchronized (this.f9244e) {
            for (MaxAd maxAd : this.f9242c) {
                a(maxAd);
            }
            this.f9242c.clear();
        }
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f9241b.render(maxNativeAdView, maxAd);
    }
}
