package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k {
    public static void a(Context context, Ad ad, AdDisplayListener adDisplayListener) {
        d2.a("adNotDisplayed", null, ad != null ? ad.getErrorMessage() : null, adDisplayListener != null);
        com.startapp.sdk.adsbase.a.a(adDisplayListener != null ? new j(context, ad, adDisplayListener) : null);
    }
}
