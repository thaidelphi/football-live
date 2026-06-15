package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r2 extends r0 {
    public r2(Context context, OfferWall3DAd offerWall3DAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, offerWall3DAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL);
    }

    @Override // com.startapp.r0
    public final void a(JsonAd jsonAd) {
        OfferWall3DAd offerWall3DAd = (OfferWall3DAd) jsonAd;
        List<AdDetails> g10 = offerWall3DAd.g();
        a5 a10 = com.startapp.sdk.components.a.a(this.f23002a).O.a().a(offerWall3DAd.h());
        a10.getClass();
        a10.f21758b = new ArrayList();
        a10.f21759c = "";
        if (g10 != null) {
            for (AdDetails adDetails : g10) {
                y4 y4Var = new y4(adDetails);
                a10.f21758b.add(y4Var);
                a10.f21757a.a(y4Var.f23564a, a10.f21758b.size() - 1, y4Var.f23572i);
            }
        }
    }

    @Override // com.startapp.sdk.adsbase.b
    public final GetAdRequest d() {
        GetAdRequest d10 = super.d();
        if (d10 == null) {
            return null;
        }
        d10.f23127t0 = AdsCommonMetaData.f22889h.t();
        return d10;
    }
}
