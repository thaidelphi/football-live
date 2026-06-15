package com.startapp;

import android.webkit.JavascriptInterface;
import com.startapp.sdk.ads.splash.SplashHtml;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q4 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22412a = false;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f22413b;

    public q4(SplashHtml.a aVar) {
        this.f22413b = null;
        this.f22413b = aVar;
    }

    @JavascriptInterface
    public void closeSplash() {
        if (this.f22412a) {
            return;
        }
        this.f22412a = true;
        this.f22413b.run();
    }
}
