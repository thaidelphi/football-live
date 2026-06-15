package com.startapp.sdk.ads.splash;

import com.startapp.h8;
import com.startapp.i8;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.ads.splash.SplashScreen;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f22746a;

    public e(SplashScreen splashScreen) {
        this.f22746a = splashScreen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SplashScreen splashScreen = this.f22746a;
        SplashEventHandler splashEventHandler = splashScreen.f22722b;
        SplashScreen.b bVar = splashScreen.f22732l;
        AtomicReference<CacheKey> atomicReference = splashScreen.f22724d;
        splashEventHandler.f22701c = true;
        if (splashEventHandler.f22707i != SplashEventHandler.SplashState.DO_NOT_DISPLAY) {
            h8 h8Var = new h8(splashEventHandler, bVar, atomicReference);
            synchronized (MetaData.f23151d) {
                if (SplashMetaData.f22718b.f22720a) {
                    MetaData.f23158k.a(h8Var);
                } else {
                    h8Var.a(null, false);
                }
            }
            return;
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
