package com.startapp;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.ads.splash.SplashScreen;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h8 implements com.startapp.sdk.adsbase.remoteconfig.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f22038a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f22039b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SplashEventHandler f22040c;

    public h8(SplashEventHandler splashEventHandler, SplashScreen.b bVar, AtomicReference atomicReference) {
        this.f22040c = splashEventHandler;
        this.f22038a = bVar;
        this.f22039b = atomicReference;
    }

    @Override // com.startapp.sdk.adsbase.remoteconfig.c
    public final void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
        SplashEventHandler splashEventHandler = this.f22040c;
        splashEventHandler.getClass();
        new Handler(Looper.getMainLooper()).post(new com.startapp.sdk.ads.splash.a(splashEventHandler, this.f22038a, (CacheKey) this.f22039b.get()));
    }

    @Override // com.startapp.sdk.adsbase.remoteconfig.c
    public final void a() {
        SplashEventHandler splashEventHandler = this.f22040c;
        splashEventHandler.getClass();
        new Handler(Looper.getMainLooper()).post(new com.startapp.sdk.ads.splash.a(splashEventHandler, this.f22038a, (CacheKey) this.f22039b.get()));
    }
}
