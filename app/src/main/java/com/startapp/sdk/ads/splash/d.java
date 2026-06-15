package com.startapp.sdk.ads.splash;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f22745a;

    public d(SplashScreen splashScreen) {
        this.f22745a = splashScreen;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            com.startapp.sdk.ads.splash.SplashScreen r0 = r8.f22745a
            com.startapp.sdk.ads.splash.SplashEventHandler r1 = r0.f22722b
            com.startapp.sdk.ads.splash.SplashScreen$b r2 = r0.f22732l
            java.util.concurrent.atomic.AtomicReference<com.startapp.sdk.adsbase.cache.CacheKey> r0 = r0.f22724d
            boolean r3 = r1.f22705g
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 != 0) goto Lb8
            com.startapp.sdk.ads.splash.SplashEventHandler$SplashState r3 = r1.f22707i
            com.startapp.sdk.ads.splash.SplashEventHandler$SplashState r7 = com.startapp.sdk.ads.splash.SplashEventHandler.SplashState.LOADING
            if (r3 != r7) goto L30
            r1.f22702d = r6
            com.startapp.sdk.ads.splash.SplashEventHandler$SplashState r0 = com.startapp.sdk.ads.splash.SplashEventHandler.SplashState.DO_NOT_DISPLAY
            r1.f22707i = r0
            com.startapp.sdk.ads.splash.SplashHtml r0 = r1.f22708j
            com.startapp.i8 r2 = new com.startapp.i8
            r2.<init>(r1)
            if (r0 != 0) goto L29
            r2.a()
            goto Lb9
        L29:
            r0.callback = r2
            r0.a()
            goto Lb9
        L30:
            com.startapp.sdk.ads.splash.SplashEventHandler$SplashState r7 = com.startapp.sdk.ads.splash.SplashEventHandler.SplashState.RECEIVED
            if (r3 != r7) goto Lb8
            r1.f22706h = r4
            java.lang.Object r0 = r0.get()
            com.startapp.sdk.adsbase.cache.CacheKey r0 = (com.startapp.sdk.adsbase.cache.CacheKey) r0
            com.startapp.sdk.adsbase.adrules.AdaptMetaData r3 = com.startapp.sdk.adsbase.adrules.AdaptMetaData.f23001a
            com.startapp.sdk.adsbase.adrules.AdRules r3 = r3.a()
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r4 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_SPLASH
            com.startapp.sdk.adsbase.adrules.AdRulesResult r3 = r3.a(r4, r5)
            boolean r4 = r3.b()
            if (r4 == 0) goto L52
            r1.a(r2)
            goto Lb8
        L52:
            com.startapp.sdk.ads.splash.SplashEventHandler$SplashState r2 = com.startapp.sdk.ads.splash.SplashEventHandler.SplashState.DO_NOT_DISPLAY
            r1.f22707i = r2
            if (r0 == 0) goto La6
            com.startapp.sdk.adsbase.cache.d r2 = com.startapp.sdk.adsbase.cache.d.f23020h
            com.startapp.sdk.adsbase.d r0 = r2.a(r0)
            boolean r2 = r0 instanceof com.startapp.sdk.adsbase.HtmlAd
            if (r2 == 0) goto L67
            com.startapp.sdk.adsbase.HtmlAd r0 = (com.startapp.sdk.adsbase.HtmlAd) r0
            java.lang.String[] r0 = r0.trackingUrls
            goto L9f
        L67:
            boolean r2 = r0 instanceof com.startapp.sdk.adsbase.JsonAd
            if (r2 == 0) goto L9d
            com.startapp.sdk.adsbase.JsonAd r0 = (com.startapp.sdk.adsbase.JsonAd) r0
            java.util.List r0 = r0.g()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r0 == 0) goto L94
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L94
            java.lang.Object r4 = r0.next()
            com.startapp.sdk.adsbase.model.AdDetails r4 = (com.startapp.sdk.adsbase.model.AdDetails) r4
            java.lang.String[] r4 = r4.r()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.addAll(r4)
            goto L7c
        L94:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            goto L9f
        L9d:
            java.lang.String[] r0 = new java.lang.String[r6]
        L9f:
            java.lang.String r2 = r3.a()
            com.startapp.sdk.adsbase.a.a(r0, r5, r6, r2)
        La6:
            com.startapp.sdk.ads.splash.SplashHtml r0 = r1.f22708j
            com.startapp.i8 r2 = new com.startapp.i8
            r2.<init>(r1)
            if (r0 != 0) goto Lb3
            r2.a()
            goto Lb8
        Lb3:
            r0.callback = r2
            r0.a()
        Lb8:
            r4 = r6
        Lb9:
            if (r4 == 0) goto Lc4
            com.startapp.sdk.ads.splash.SplashScreen r0 = r8.f22745a
            r0.f22729i = r5
            java.util.concurrent.atomic.AtomicReference<com.startapp.sdk.adsbase.cache.CacheKey> r0 = r0.f22724d
            r0.set(r5)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.splash.d.run():void");
    }
}
