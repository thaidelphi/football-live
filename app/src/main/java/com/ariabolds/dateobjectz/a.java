package com.ariabolds.dateobjectz;

import android.app.Activity;
import android.util.Log;
import android.widget.FrameLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
/* compiled from: IronSourceBannerAds.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    IronSourceBannerLayout f10234a;

    /* compiled from: IronSourceBannerAds.java */
    /* renamed from: com.ariabolds.dateobjectz.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class C0166a implements LevelPlayBannerListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FrameLayout f10235a;

        /* compiled from: IronSourceBannerAds.java */
        /* renamed from: com.ariabolds.dateobjectz.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0167a implements Runnable {
            RunnableC0167a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0166a.this.f10235a.removeAllViews();
                C0166a.this.f10235a.setVisibility(8);
            }
        }

        C0166a(FrameLayout frameLayout) {
            this.f10235a = frameLayout;
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdClicked(AdInfo adInfo) {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLeftApplication(AdInfo adInfo) {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            Log.e("Applovin ", "IS Banner ad " + ironSourceError.getErrorMessage());
            AppLovinSdkUtils.runOnUiThread(new RunnableC0167a());
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoaded(AdInfo adInfo) {
            this.f10235a.setVisibility(0);
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenDismissed(AdInfo adInfo) {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenPresented(AdInfo adInfo) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FrameLayout frameLayout, Activity activity) {
        if (frameLayout.getVisibility() == 8) {
            frameLayout.removeAllViews();
            this.f10234a = IronSource.createBanner(activity, ISBannerSize.BANNER);
            frameLayout.addView(this.f10234a, 0, new FrameLayout.LayoutParams(-1, -2));
            this.f10234a.setLevelPlayBannerListener(new C0166a(frameLayout));
            IronSource.loadBanner(this.f10234a);
        }
    }
}
