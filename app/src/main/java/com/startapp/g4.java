package com.startapp;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.c;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g4 implements AdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.c f21983a = c.a.f23014a;

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        if (this.f21983a.f23013e.showAd()) {
            com.startapp.sdk.adsbase.c cVar = this.f21983a;
            cVar.getClass();
            cVar.f23011c = System.currentTimeMillis();
            cVar.f23012d = 0;
        }
    }
}
