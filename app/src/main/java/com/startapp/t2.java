package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t2 extends com.startapp.sdk.ads.video.b {
    public t2(Context context, HtmlAd htmlAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, htmlAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_RETURN);
    }

    @Override // com.startapp.sdk.ads.video.b, com.startapp.sdk.adsbase.b
    public final void a(boolean z10) {
        super.a(z10);
        c(z10);
    }
}
