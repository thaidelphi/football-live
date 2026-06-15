package com.startapp.sdk.ads.splash;

import com.startapp.i8;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f22738a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CacheKey f22739b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SplashEventHandler f22740c;

    public a(SplashEventHandler splashEventHandler, Runnable runnable, CacheKey cacheKey) {
        this.f22740c = splashEventHandler;
        this.f22738a = runnable;
        this.f22739b = cacheKey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr;
        SplashEventHandler splashEventHandler = this.f22740c;
        splashEventHandler.f22706h = true;
        SplashEventHandler.SplashState splashState = splashEventHandler.f22707i;
        SplashEventHandler.SplashState splashState2 = SplashEventHandler.SplashState.DO_NOT_DISPLAY;
        if (splashState != splashState2) {
            Runnable runnable = this.f22738a;
            CacheKey cacheKey = this.f22739b;
            AdRulesResult a10 = AdaptMetaData.f23001a.a().a(AdPreferences.Placement.INAPP_SPLASH, null);
            if (a10.b()) {
                splashEventHandler.a(runnable);
                return;
            }
            splashEventHandler.f22707i = splashState2;
            if (cacheKey != null) {
                com.startapp.sdk.adsbase.d a11 = com.startapp.sdk.adsbase.cache.d.f23020h.a(cacheKey);
                if (a11 instanceof HtmlAd) {
                    strArr = ((HtmlAd) a11).trackingUrls;
                } else if (a11 instanceof JsonAd) {
                    List<AdDetails> g10 = ((JsonAd) a11).g();
                    ArrayList arrayList = new ArrayList();
                    if (g10 != null) {
                        for (AdDetails adDetails : g10) {
                            arrayList.addAll(Arrays.asList(adDetails.r()));
                        }
                    }
                    strArr = (String[]) arrayList.toArray(new String[0]);
                } else {
                    strArr = new String[0];
                }
                com.startapp.sdk.adsbase.a.a(strArr, (String) null, 0, a10.a());
            }
            SplashHtml splashHtml = splashEventHandler.f22708j;
            i8 i8Var = new i8(splashEventHandler);
            if (splashHtml == null) {
                i8Var.a();
                return;
            }
            splashHtml.callback = i8Var;
            splashHtml.a();
        }
    }
}
