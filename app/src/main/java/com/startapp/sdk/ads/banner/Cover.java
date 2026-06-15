package com.startapp.sdk.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Cover extends BannerStandard {
    public Cover(Activity activity) {
        super(activity);
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    public final String d() {
        return "StartApp Cover";
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    public final int getHeightInDp() {
        return 157;
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    public final int getWidthInDp() {
        return 300;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public void loadAd(int i10, int i11) {
        super.loadAd(getWidthInDp(), getHeightInDp());
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard
    public final int n() {
        return 2;
    }

    public Cover(Activity activity, AdPreferences adPreferences) {
        super(activity, adPreferences);
    }

    public Cover(Activity activity, BannerListener bannerListener) {
        super(activity, bannerListener);
    }

    public Cover(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        super(activity, adPreferences, bannerListener);
    }

    public Cover(Activity activity, AttributeSet attributeSet) {
        super(activity, attributeSet);
    }

    public Cover(Activity activity, AttributeSet attributeSet, int i10) {
        super(activity, attributeSet, i10);
    }

    @Deprecated
    public Cover(Context context) {
        super(context);
    }

    @Deprecated
    public Cover(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    @Deprecated
    public Cover(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    @Deprecated
    public Cover(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    @Deprecated
    public Cover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Deprecated
    public Cover(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public Cover(Context context, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
        super(context, false, adPreferences, bannerStandardAd);
    }
}
