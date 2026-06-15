package com.startapp;

import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k1 extends j1 {
    public k1(com.startapp.sdk.adsbase.cache.g gVar) {
        super(gVar);
    }

    @Override // com.startapp.j1
    public final boolean a() {
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.c.f22944a;
        return startAppSDKInternal.f22911c && !startAppSDKInternal.f22914f && (!startAppSDKInternal.f22912d || (this.f22119a.f23039a == AdPreferences.Placement.INAPP_RETURN && CacheMetaData.f23015a.a().g()));
    }

    @Override // com.startapp.j1
    public final long b() {
        com.startapp.sdk.adsbase.d dVar = this.f22119a.f23043e;
        if (dVar == null) {
            return -1L;
        }
        Long b10 = dVar.b();
        Long d10 = dVar.d();
        if (b10 == null || d10 == null) {
            return -1L;
        }
        long longValue = b10.longValue() - (System.currentTimeMillis() - d10.longValue());
        if (longValue >= 0) {
            return longValue;
        }
        return 0L;
    }
}
