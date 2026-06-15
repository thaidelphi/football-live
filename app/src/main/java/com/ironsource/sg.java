package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class sg extends t7 {

    /* renamed from: d  reason: collision with root package name */
    private static final sg f20658d = new sg();

    /* renamed from: b  reason: collision with root package name */
    private LevelPlayInterstitialListener f20659b = null;

    /* renamed from: c  reason: collision with root package name */
    private LevelPlayInterstitialListener f20660c = null;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20661a;

        a(AdInfo adInfo) {
            this.f20661a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20659b != null) {
                sg.this.f20659b.onAdShowSucceeded(sg.this.a(this.f20661a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowSucceeded() adInfo = " + sg.this.a(this.f20661a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceError f20663a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdInfo f20664b;

        b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f20663a = ironSourceError;
            this.f20664b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20660c != null) {
                sg.this.f20660c.onAdShowFailed(this.f20663a, sg.this.a(this.f20664b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + sg.this.a(this.f20664b) + ", error = " + this.f20663a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceError f20666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdInfo f20667b;

        c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f20666a = ironSourceError;
            this.f20667b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20659b != null) {
                sg.this.f20659b.onAdShowFailed(this.f20666a, sg.this.a(this.f20667b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + sg.this.a(this.f20667b) + ", error = " + this.f20666a.getErrorMessage());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20669a;

        d(AdInfo adInfo) {
            this.f20669a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20660c != null) {
                sg.this.f20660c.onAdClicked(sg.this.a(this.f20669a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + sg.this.a(this.f20669a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20671a;

        e(AdInfo adInfo) {
            this.f20671a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20659b != null) {
                sg.this.f20659b.onAdClicked(sg.this.a(this.f20671a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + sg.this.a(this.f20671a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20673a;

        f(AdInfo adInfo) {
            this.f20673a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20660c != null) {
                sg.this.f20660c.onAdReady(sg.this.a(this.f20673a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + sg.this.a(this.f20673a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20675a;

        g(AdInfo adInfo) {
            this.f20675a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20659b != null) {
                sg.this.f20659b.onAdReady(sg.this.a(this.f20675a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + sg.this.a(this.f20675a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceError f20677a;

        h(IronSourceError ironSourceError) {
            this.f20677a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20660c != null) {
                sg.this.f20660c.onAdLoadFailed(this.f20677a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f20677a.getErrorMessage());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceError f20679a;

        i(IronSourceError ironSourceError) {
            this.f20679a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20659b != null) {
                sg.this.f20659b.onAdLoadFailed(this.f20679a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f20679a.getErrorMessage());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20681a;

        j(AdInfo adInfo) {
            this.f20681a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20660c != null) {
                sg.this.f20660c.onAdOpened(sg.this.a(this.f20681a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + sg.this.a(this.f20681a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20683a;

        k(AdInfo adInfo) {
            this.f20683a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20659b != null) {
                sg.this.f20659b.onAdOpened(sg.this.a(this.f20683a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + sg.this.a(this.f20683a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20685a;

        l(AdInfo adInfo) {
            this.f20685a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20660c != null) {
                sg.this.f20660c.onAdClosed(sg.this.a(this.f20685a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + sg.this.a(this.f20685a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20687a;

        m(AdInfo adInfo) {
            this.f20687a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20659b != null) {
                sg.this.f20659b.onAdClosed(sg.this.a(this.f20687a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + sg.this.a(this.f20687a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20689a;

        n(AdInfo adInfo) {
            this.f20689a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sg.this.f20660c != null) {
                sg.this.f20660c.onAdShowSucceeded(sg.this.a(this.f20689a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowSucceeded() adInfo = " + sg.this.a(this.f20689a));
            }
        }
    }

    private sg() {
    }

    public static synchronized sg a() {
        sg sgVar;
        synchronized (sg.class) {
            sgVar = f20658d;
        }
        return sgVar;
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f20660c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.f20659b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f20660c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.f20659b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    public synchronized void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f20659b = levelPlayInterstitialListener;
    }

    public void b(AdInfo adInfo) {
        if (this.f20660c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f20659b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public synchronized void b(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f20660c = levelPlayInterstitialListener;
    }

    public void c(AdInfo adInfo) {
        if (this.f20660c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f20659b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.f20660c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f20659b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f20660c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.f20659b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f20660c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f20659b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }
}
