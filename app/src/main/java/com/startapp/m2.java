package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.banner3d.Banner3DAd;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m2 extends r0 {

    /* renamed from: i  reason: collision with root package name */
    public final int f22272i;

    public m2(Context context, Banner3DAd banner3DAd, int i10, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, banner3DAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER);
        this.f22272i = 0;
        this.f22272i = i10;
    }

    @Override // com.startapp.r0
    public final void a(JsonAd jsonAd) {
    }

    @Override // com.startapp.sdk.adsbase.b
    public final GetAdRequest d() {
        i0 i0Var = new i0();
        a((GetAdRequest) i0Var);
        i0Var.f23127t0 = BannerMetaData.f22541b.a().a();
        i0Var.E0 = this.f22272i;
        i0Var.W0 = ((Banner3DAd) this.f23003b).i();
        i0Var.d(this.f23002a);
        return i0Var;
    }
}
