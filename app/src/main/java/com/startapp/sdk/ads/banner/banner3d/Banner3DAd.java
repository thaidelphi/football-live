package com.startapp.sdk.ads.banner.banner3d;

import android.content.Context;
import com.startapp.m2;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Banner3DAd extends JsonAd {
    private static final long serialVersionUID = -3073776063544193196L;
    private boolean fixedSize;
    private int offset;

    public Banner3DAd(Context context, int i10) {
        super(context, AdPreferences.Placement.INAPP_BANNER);
        this.offset = i10;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new m2(this.f22876a, this, this.offset, adPreferences, adEventListener).c();
        this.offset++;
    }

    public final int h() {
        return this.offset;
    }

    public final boolean i() {
        return this.fixedSize;
    }

    public final void j() {
        this.fixedSize = true;
    }
}
