package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.ads.splash.SplashScreen;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f22747a;

    public f(SplashScreen splashScreen) {
        this.f22747a = splashScreen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SplashScreen splashScreen = this.f22747a;
        SplashEventHandler splashEventHandler = splashScreen.f22722b;
        SplashScreen.SplashStartAppAd splashStartAppAd = splashScreen.f22729i;
        if (splashEventHandler.f22707i != SplashEventHandler.SplashState.DISPLAYED || splashEventHandler.f22704f) {
            return;
        }
        splashStartAppAd.close();
        splashEventHandler.f22707i = SplashEventHandler.SplashState.HIDDEN;
        splashEventHandler.a();
    }
}
