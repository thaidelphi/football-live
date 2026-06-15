package com.startapp.sdk.ads.splash;

import com.startapp.h8;
import com.startapp.i8;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.ads.splash.SplashScreen;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements AdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f22744a;

    public c(SplashScreen splashScreen) {
        this.f22744a = splashScreen;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        SplashEventHandler splashEventHandler = this.f22744a.f22722b;
        splashEventHandler.f22707i = SplashEventHandler.SplashState.DO_NOT_DISPLAY;
        splashEventHandler.a(null);
        if (this.f22744a.f22723c.getAnimationMode() != SplashConfig.Animation.ALL) {
            this.f22744a.f22721a.finish();
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        if (this.f22744a.f22723c.getAnimationMode() == SplashConfig.Animation.AVAILABLE_AD_ONLY) {
            this.f22744a.a();
        }
        SplashScreen splashScreen = this.f22744a;
        SplashEventHandler splashEventHandler = splashScreen.f22722b;
        SplashScreen.b bVar = splashScreen.f22732l;
        if (splashEventHandler.f22707i == SplashEventHandler.SplashState.LOADING) {
            splashEventHandler.f22707i = SplashEventHandler.SplashState.RECEIVED;
        }
        splashEventHandler.a(bVar);
        if (this.f22744a.f22723c.getAnimationMode() == SplashConfig.Animation.DISABLE) {
            SplashScreen splashScreen2 = this.f22744a;
            SplashEventHandler splashEventHandler2 = splashScreen2.f22722b;
            SplashScreen.b bVar2 = splashScreen2.f22732l;
            AtomicReference<CacheKey> atomicReference = splashScreen2.f22724d;
            splashEventHandler2.f22701c = true;
            if (splashEventHandler2.f22707i != SplashEventHandler.SplashState.DO_NOT_DISPLAY) {
                h8 h8Var = new h8(splashEventHandler2, bVar2, atomicReference);
                synchronized (MetaData.f23151d) {
                    if (SplashMetaData.f22718b.f22720a) {
                        MetaData.f23158k.a(h8Var);
                    } else {
                        h8Var.a(null, false);
                    }
                }
                return;
            }
            SplashHtml splashHtml = splashEventHandler2.f22708j;
            i8 i8Var = new i8(splashEventHandler2);
            if (splashHtml == null) {
                i8Var.a();
                return;
            }
            splashHtml.callback = i8Var;
            splashHtml.a();
        }
    }
}
