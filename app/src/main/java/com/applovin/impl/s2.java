package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.hybridAds.MaxHybridMRecAdActivity;
import com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s2 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f8582a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends com.applovin.impl.b {

        /* renamed from: a  reason: collision with root package name */
        private final w2 f8583a;

        /* renamed from: b  reason: collision with root package name */
        private final com.applovin.impl.sdk.j f8584b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdapterListener f8585c;

        public a(w2 w2Var, com.applovin.impl.sdk.j jVar, MaxAdapterListener maxAdapterListener) {
            this.f8583a = w2Var;
            this.f8584b = jVar;
            this.f8585c = maxAdapterListener;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                ((MaxHybridMRecAdActivity) activity).a(this.f8583a.I(), this.f8583a.y(), this.f8584b, this.f8585c);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && !activity.isChangingConfigurations() && this.f8583a.w().get()) {
                this.f8584b.e().b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends com.applovin.impl.b {

        /* renamed from: a  reason: collision with root package name */
        private final w2 f8586a;

        /* renamed from: b  reason: collision with root package name */
        private final com.applovin.impl.sdk.j f8587b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdapterListener f8588c;

        public b(w2 w2Var, com.applovin.impl.sdk.j jVar, MaxAdapterListener maxAdapterListener) {
            this.f8586a = w2Var;
            this.f8587b = jVar;
            this.f8588c = maxAdapterListener;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                ((MaxHybridNativeAdActivity) activity).a(this.f8586a.I(), this.f8586a.getNativeAd(), this.f8587b, this.f8588c);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && !activity.isChangingConfigurations() && this.f8586a.w().get()) {
                this.f8587b.e().b(this);
            }
        }
    }

    public s2(com.applovin.impl.sdk.j jVar) {
        this.f8582a = jVar;
    }

    public void a(w2 w2Var, Activity activity, MaxAdapterListener maxAdapterListener) {
        d7.b();
        if (activity == null) {
            activity = this.f8582a.e().b();
        }
        if (w2Var.getNativeAd() != null) {
            this.f8582a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f8582a.I().a("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f8582a.e().a(new b(w2Var, this.f8582a, maxAdapterListener));
            activity.startActivity(new Intent(activity, MaxHybridNativeAdActivity.class));
        } else if (w2Var.y() != null) {
            this.f8582a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f8582a.I().a("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f8582a.e().a(new a(w2Var, this.f8582a, maxAdapterListener));
            activity.startActivity(new Intent(activity, MaxHybridMRecAdActivity.class));
        } else if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        } else {
            throw new IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
        }
    }
}
