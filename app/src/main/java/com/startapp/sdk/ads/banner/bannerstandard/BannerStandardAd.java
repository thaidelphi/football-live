package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import com.startapp.n2;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BannerStandardAd extends HtmlAd {
    private static final long serialVersionUID = -1808208904457696295L;
    private int bannerType;
    private boolean fixedSize;
    private int offset;

    public BannerStandardAd(Context context, int i10) {
        super(context, AdPreferences.Placement.INAPP_BANNER);
        this.offset = i10;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new n2(this.f22876a, this, this.offset, adPreferences, adEventListener).c();
        this.offset++;
    }

    public final void b(int i10) {
        this.bannerType = i10;
    }

    public final int u() {
        return this.bannerType;
    }

    public final int v() {
        return this.offset;
    }

    public final boolean w() {
        return this.fixedSize;
    }

    public final void x() {
        this.fixedSize = true;
    }
}
