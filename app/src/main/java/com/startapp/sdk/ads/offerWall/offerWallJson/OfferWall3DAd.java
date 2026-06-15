package com.startapp.sdk.ads.offerWall.offerWallJson;

import android.content.Context;
import android.content.Intent;
import com.ironsource.b9;
import com.startapp.l3;
import com.startapp.o9;
import com.startapp.q;
import com.startapp.r2;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.a;
import java.util.UUID;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class OfferWall3DAd extends JsonAd implements d {

    /* renamed from: c  reason: collision with root package name */
    public static String f22691c = null;
    private static final long serialVersionUID = -8943331518623080551L;
    private final String uuid;

    public OfferWall3DAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OFFER_WALL);
        this.uuid = UUID.randomUUID().toString();
        if (f22691c == null) {
            f22691c = o9.a(context);
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new r2(this.f22876a, this, adPreferences, adEventListener).c();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    public final Long b() {
        return super.b();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    public final boolean c() {
        return super.c();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    public final Long d() {
        return super.d();
    }

    public final String h() {
        return this.uuid;
    }

    @Override // com.startapp.sdk.adsbase.d
    @Deprecated
    public final boolean a(String str) {
        a.a(this.f22876a).O.a().a(this.uuid).f21759c = "&position=".concat(com.startapp.sdk.adsbase.a.a());
        ActivityExtra activityExtra = this.activityExtra;
        boolean a10 = activityExtra != null ? activityExtra.a() : false;
        if (super.c()) {
            a(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        Intent intent = new Intent(this.f22876a, List3DActivity.class);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("fullscreen", a10);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.d());
        intent.putExtra("adCacheTtl", super.b());
        intent.putExtra(b9.h.L, com.startapp.sdk.adsbase.a.a());
        intent.putExtra("listModelUuid", this.uuid);
        intent.addFlags(343932928);
        try {
            this.f22876a.startActivity(intent);
            if (q.f22400f.booleanValue()) {
                return true;
            }
            setState(Ad.AdState.UN_INITIALIZED);
            return true;
        } catch (Throwable th) {
            l3.a(th);
            return false;
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    public final boolean a() {
        return super.a();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.d
    public final void a(boolean z10) {
        super.a(z10);
    }
}
