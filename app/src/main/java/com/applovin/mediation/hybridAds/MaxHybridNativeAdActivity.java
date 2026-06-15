package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import com.applovin.impl.k6;
import com.applovin.impl.q2;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.j;
import com.applovin.impl.u5;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxHybridNativeAdActivity extends q2 {

    /* renamed from: e  reason: collision with root package name */
    private MaxNativeAdView f9875e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f9876a;

        a(MaxNativeAd maxNativeAd) {
            this.f9876a = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9876a.prepareForInteraction(MaxHybridNativeAdActivity.this.f9875e.getClickableViews(), MaxHybridNativeAdActivity.this.f9875e)) {
                return;
            }
            this.f9876a.prepareViewForInteraction(MaxHybridNativeAdActivity.this.f9875e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.q2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.f9875e, "MaxHybridNativeAdActivity");
    }

    public void a(r2 r2Var, MaxNativeAd maxNativeAd, j jVar, MaxAdapterListener maxAdapterListener) {
        super.a(r2Var, jVar, maxAdapterListener);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAd, new MaxNativeAdViewBinder.Builder(R.layout.max_hybrid_native_ad_view).setTitleTextViewId(R.id.applovin_native_title_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setIconImageViewId(R.id.applovin_native_icon_image_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setCallToActionButtonId(R.id.applovin_native_cta_button).build(), this);
        this.f9875e = maxNativeAdView;
        maxNativeAdView.renderCustomNativeAdView(maxNativeAd);
        a aVar = new a(maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            runOnUiThread(aVar);
        } else {
            jVar.i0().a((z4) new k6(jVar, "MaxHybridNativeAdPrepareForInteraction", aVar), u5.b.MEDIATION);
        }
    }
}
