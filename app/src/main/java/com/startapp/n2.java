package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n2 extends q0 {

    /* renamed from: m  reason: collision with root package name */
    public final int f22314m;

    public n2(Context context, HtmlAd htmlAd, int i10, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, htmlAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, false);
        this.f22314m = 0;
        this.f22314m = i10;
    }

    @Override // com.startapp.sdk.adsbase.b
    public final void a(boolean z10) {
        super.a(z10);
        c(z10);
    }

    @Override // com.startapp.sdk.adsbase.b
    public final GetAdRequest d() {
        BannerStandardAd bannerStandardAd = (BannerStandardAd) this.f23003b;
        i0 i0Var = new i0();
        a((GetAdRequest) i0Var);
        i0Var.L = bannerStandardAd.q();
        i0Var.M = bannerStandardAd.j();
        i0Var.E0 = this.f22314m;
        i0Var.f23127t0 = BannerMetaData.f22541b.a().f();
        i0Var.W0 = bannerStandardAd.w();
        i0Var.X0 = bannerStandardAd.u();
        i0Var.d(this.f23002a);
        return i0Var;
    }
}
