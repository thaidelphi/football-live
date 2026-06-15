package com.appnext.banners;

import android.content.Context;
import com.appnext.core.Ad;
import com.appnext.core.callbacks.OnECPMLoaded;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SmallBannerAd extends BannerAd {
    public SmallBannerAd(Context context, String str) {
        super(context, str);
    }

    @Override // com.appnext.banners.BannerAd, com.appnext.core.Ad
    public String getAUID() {
        return "1000";
    }

    @Override // com.appnext.banners.BannerAd, com.appnext.core.Ad
    public /* bridge */ /* synthetic */ void getECPM(OnECPMLoaded onECPMLoaded) {
        super.getECPM(onECPMLoaded);
    }

    @Override // com.appnext.banners.BannerAd, com.appnext.core.Ad
    public /* bridge */ /* synthetic */ String getTID() {
        return super.getTID();
    }

    @Override // com.appnext.banners.BannerAd
    public /* bridge */ /* synthetic */ String getTemId(BannerAdData bannerAdData) {
        return super.getTemId(bannerAdData);
    }

    @Override // com.appnext.banners.BannerAd, com.appnext.core.Ad
    public /* bridge */ /* synthetic */ String getVID() {
        return super.getVID();
    }

    @Override // com.appnext.banners.BannerAd, com.appnext.core.Ad
    public /* bridge */ /* synthetic */ boolean isAdLoaded() {
        return super.isAdLoaded();
    }

    @Override // com.appnext.banners.BannerAd, com.appnext.core.Ad
    public /* bridge */ /* synthetic */ void loadAd() {
        super.loadAd();
    }

    @Override // com.appnext.banners.BannerAd, com.appnext.core.Ad
    public /* bridge */ /* synthetic */ void showAd() {
        super.showAd();
    }

    protected SmallBannerAd(Ad ad) {
        super(ad);
    }
}
