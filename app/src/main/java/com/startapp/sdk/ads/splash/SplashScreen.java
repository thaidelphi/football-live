package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.startapp.f0;
import com.startapp.j8;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.y;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SplashScreen {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f22721a;

    /* renamed from: b  reason: collision with root package name */
    public SplashEventHandler f22722b;

    /* renamed from: c  reason: collision with root package name */
    public final SplashConfig f22723c;

    /* renamed from: e  reason: collision with root package name */
    public SplashHtml f22725e;

    /* renamed from: f  reason: collision with root package name */
    public View f22726f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22728h;

    /* renamed from: i  reason: collision with root package name */
    public SplashStartAppAd f22729i;

    /* renamed from: j  reason: collision with root package name */
    public final AdPreferences f22730j;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<CacheKey> f22724d = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    public final Handler f22727g = new Handler();

    /* renamed from: k  reason: collision with root package name */
    public final a f22731k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final b f22732l = new b();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class SplashStartAppAd extends StartAppAd {
        private static final long serialVersionUID = -1792364854785417686L;

        public SplashStartAppAd(Context context) {
            super(context);
            this.placement = AdPreferences.Placement.INAPP_SPLASH;
        }

        @Override // com.startapp.sdk.adsbase.StartAppAd
        public final AdRulesResult a(AdPreferences.Placement placement, String str) {
            return new AdRulesResult("", true);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (SplashScreen.a(SplashScreen.this)) {
                SplashScreen splashScreen = SplashScreen.this;
                Context a10 = f0.a(splashScreen.f22721a);
                if (a10 == null) {
                    a10 = splashScreen.f22721a;
                }
                if (splashScreen.f22723c.getAnimationMode() == SplashConfig.Animation.ALL) {
                    splashScreen.a();
                }
                SplashStartAppAd splashStartAppAd = new SplashStartAppAd(a10);
                splashScreen.f22729i = splashStartAppAd;
                splashScreen.f22724d.set(splashStartAppAd.loadSplash(splashScreen.f22730j, splashScreen.f22723c.isShowFromCacheOnly(), new com.startapp.sdk.ads.splash.c(splashScreen)));
                SplashScreen splashScreen2 = SplashScreen.this;
                splashScreen2.f22727g.postDelayed(new d(splashScreen2), splashScreen2.f22723c.a().longValue());
                if (splashScreen2.f22723c.getAnimationMode() != SplashConfig.Animation.DISABLE) {
                    splashScreen2.f22727g.postDelayed(new e(splashScreen2), splashScreen2.f22723c.getMinSplashTime().getIndex());
                    return;
                }
                return;
            }
            SplashScreen.this.f22721a.finish();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* compiled from: Sta */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a implements j8 {

            /* compiled from: Sta */
            /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$b$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
            public class C0249a implements AdDisplayListener {
                public C0249a() {
                }

                @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
                public final void adClicked(Ad ad) {
                    SplashScreen.this.f22722b.f22704f = true;
                }

                @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
                public final void adDisplayed(Ad ad) {
                    SplashScreen.this.f22722b.f22707i = SplashEventHandler.SplashState.DISPLAYED;
                }

                @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
                public final void adHidden(Ad ad) {
                    SplashEventHandler splashEventHandler = SplashScreen.this.f22722b;
                    splashEventHandler.f22707i = SplashEventHandler.SplashState.HIDDEN;
                    splashEventHandler.a();
                }

                @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
                public final void adNotDisplayed(Ad ad) {
                }
            }

            public a() {
            }

            @Override // com.startapp.j8
            public final void a() {
                SplashStartAppAd splashStartAppAd;
                SplashScreen splashScreen = SplashScreen.this;
                if (splashScreen.f22728h || (splashStartAppAd = splashScreen.f22729i) == null) {
                    return;
                }
                splashStartAppAd.showAd(new C0249a());
                SplashScreen splashScreen2 = SplashScreen.this;
                if (splashScreen2.f22723c.getMaxAdDisplayTime() != SplashConfig.MaxAdDisplayTime.FOR_EVER) {
                    splashScreen2.f22727g.postDelayed(new f(splashScreen2), splashScreen2.f22723c.getMaxAdDisplayTime().getIndex());
                }
                SplashScreen splashScreen3 = SplashScreen.this;
                if (splashScreen3.f22722b.f22707i == SplashEventHandler.SplashState.DISPLAYED) {
                    splashScreen3.f22721a.finish();
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SplashScreen splashScreen = SplashScreen.this;
            SplashEventHandler splashEventHandler = splashScreen.f22722b;
            SplashHtml splashHtml = splashScreen.f22725e;
            a aVar = new a();
            splashEventHandler.getClass();
            if (splashHtml == null) {
                aVar.a();
                return;
            }
            splashHtml.callback = aVar;
            splashHtml.a();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22737a;

        static {
            int[] iArr = new int[SplashConfig.Orientation.values().length];
            f22737a = iArr;
            try {
                iArr[SplashConfig.Orientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22737a[SplashConfig.Orientation.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SplashScreen(Activity activity, SplashConfig splashConfig, AdPreferences adPreferences) {
        this.f22721a = activity;
        this.f22723c = splashConfig;
        this.f22730j = adPreferences;
        try {
            splashConfig.c(activity);
            this.f22722b = new SplashEventHandler(activity);
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r5 = this;
            android.view.View r0 = r5.f22726f
            r1 = -1
            if (r0 == 0) goto L12
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            android.app.Activity r1 = r5.f22721a
            android.view.View r2 = r5.f22726f
            r1.setContentView(r2, r0)
            return
        L12:
            r0 = 1
            com.startapp.sdk.ads.splash.SplashConfig r2 = r5.f22723c     // Catch: java.lang.Throwable -> L53
            boolean r2 = r2.isHtmlSplash()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L26
            com.startapp.sdk.ads.splash.SplashConfig r2 = r5.f22723c     // Catch: java.lang.Throwable -> L53
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L24
            goto L26
        L24:
            r2 = 0
            goto L27
        L26:
            r2 = r0
        L27:
            if (r2 != 0) goto L48
            com.startapp.sdk.ads.splash.SplashConfig r2 = r5.f22723c     // Catch: java.lang.Throwable -> L53
            com.startapp.sdk.ads.splash.SplashConfig$Animation r2 = r2.getAnimationMode()     // Catch: java.lang.Throwable -> L53
            com.startapp.sdk.ads.splash.SplashConfig$Animation r3 = com.startapp.sdk.ads.splash.SplashConfig.Animation.DISABLE     // Catch: java.lang.Throwable -> L53
            if (r2 == r3) goto L48
            com.startapp.sdk.ads.splash.SplashConfig r2 = r5.f22723c     // Catch: java.lang.Throwable -> L53
            android.app.Activity r3 = r5.f22721a     // Catch: java.lang.Throwable -> L53
            com.startapp.sdk.ads.splash.SplashHtml r2 = r2.b(r3)     // Catch: java.lang.Throwable -> L53
            r5.f22725e = r2     // Catch: java.lang.Throwable -> L53
            com.startapp.sdk.ads.splash.SplashEventHandler r3 = r5.f22722b     // Catch: java.lang.Throwable -> L53
            r3.f22708j = r2     // Catch: java.lang.Throwable -> L53
            android.webkit.WebView r2 = r2.b()     // Catch: java.lang.Throwable -> L53
            r5.f22726f = r2     // Catch: java.lang.Throwable -> L53
            goto L6a
        L48:
            com.startapp.sdk.ads.splash.SplashConfig r2 = r5.f22723c     // Catch: java.lang.Throwable -> L53
            android.app.Activity r3 = r5.f22721a     // Catch: java.lang.Throwable -> L53
            android.view.View r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L53
            r5.f22726f = r2     // Catch: java.lang.Throwable -> L53
            goto L6a
        L53:
            r2 = move-exception
            com.startapp.sdk.ads.splash.SplashEventHandler r3 = new com.startapp.sdk.ads.splash.SplashEventHandler
            android.app.Activity r4 = r5.f22721a
            r3.<init>(r4)
            r5.f22722b = r3
            r3.f22701c = r0
            com.startapp.sdk.ads.splash.SplashEventHandler$SplashState r0 = com.startapp.sdk.ads.splash.SplashEventHandler.SplashState.DO_NOT_DISPLAY
            r3.f22707i = r0
            r0 = 0
            r3.a(r0)
            com.startapp.l3.a(r2)
        L6a:
            android.view.View r0 = r5.f22726f
            if (r0 == 0) goto L7a
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            android.app.Activity r1 = r5.f22721a
            android.view.View r2 = r5.f22726f
            r1.setContentView(r2, r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.splash.SplashScreen.a():void");
    }

    public final boolean b() {
        boolean z10;
        int i10 = this.f22721a.getResources().getConfiguration().orientation;
        if (this.f22723c.getOrientation() == SplashConfig.Orientation.AUTO) {
            if (i10 == 2) {
                this.f22723c.setOrientation(SplashConfig.Orientation.LANDSCAPE);
            } else {
                this.f22723c.setOrientation(SplashConfig.Orientation.PORTRAIT);
            }
        }
        int i11 = c.f22737a[this.f22723c.getOrientation().ordinal()];
        if (i11 == 1) {
            z10 = i10 == 2;
            y.b(this.f22721a);
        } else if (i11 != 2) {
            return false;
        } else {
            z10 = i10 == 1;
            y.a(this.f22721a);
        }
        return z10;
    }

    public static boolean a(SplashScreen splashScreen) {
        if (splashScreen.f22723c.d(splashScreen.f22721a)) {
            return true;
        }
        l3 l3Var = new l3(m3.f22275e);
        l3Var.f22228d = splashScreen.f22723c.getErrorMessage();
        l3Var.a();
        return false;
    }
}
