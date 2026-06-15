package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class s2 extends q0 {
    public s2(Context context, HtmlAd htmlAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, htmlAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OVERLAY, true);
    }

    @Override // com.startapp.sdk.adsbase.b
    public final void a(boolean z10) {
        super.a(z10);
        c(z10);
    }
}
