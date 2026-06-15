package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class t5 extends t7 {

    /* renamed from: d  reason: collision with root package name */
    private static final t5 f20790d = new t5();

    /* renamed from: b  reason: collision with root package name */
    private LevelPlayBannerListener f20791b = null;

    /* renamed from: c  reason: collision with root package name */
    private LevelPlayBannerListener f20792c = null;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20793a;

        a(AdInfo adInfo) {
            this.f20793a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20791b != null) {
                t5.this.f20791b.onAdLeftApplication(t5.this.a(this.f20793a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLeftApplication() adInfo = " + t5.this.a(this.f20793a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20795a;

        b(AdInfo adInfo) {
            this.f20795a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20792c != null) {
                t5.this.f20792c.onAdClicked(t5.this.a(this.f20795a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + t5.this.a(this.f20795a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20797a;

        c(AdInfo adInfo) {
            this.f20797a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20791b != null) {
                t5.this.f20791b.onAdClicked(t5.this.a(this.f20797a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + t5.this.a(this.f20797a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20799a;

        d(AdInfo adInfo) {
            this.f20799a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20792c != null) {
                t5.this.f20792c.onAdLoaded(t5.this.a(this.f20799a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoaded() adInfo = " + t5.this.a(this.f20799a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20801a;

        e(AdInfo adInfo) {
            this.f20801a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20791b != null) {
                t5.this.f20791b.onAdLoaded(t5.this.a(this.f20801a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoaded() adInfo = " + t5.this.a(this.f20801a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceError f20803a;

        f(IronSourceError ironSourceError) {
            this.f20803a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20792c != null) {
                t5.this.f20792c.onAdLoadFailed(this.f20803a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f20803a.getErrorMessage());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceError f20805a;

        g(IronSourceError ironSourceError) {
            this.f20805a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20791b != null) {
                t5.this.f20791b.onAdLoadFailed(this.f20805a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f20805a.getErrorMessage());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20807a;

        h(AdInfo adInfo) {
            this.f20807a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20792c != null) {
                t5.this.f20792c.onAdScreenPresented(t5.this.a(this.f20807a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenPresented() adInfo = " + t5.this.a(this.f20807a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20809a;

        i(AdInfo adInfo) {
            this.f20809a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20791b != null) {
                t5.this.f20791b.onAdScreenPresented(t5.this.a(this.f20809a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenPresented() adInfo = " + t5.this.a(this.f20809a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20811a;

        j(AdInfo adInfo) {
            this.f20811a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20792c != null) {
                t5.this.f20792c.onAdScreenDismissed(t5.this.a(this.f20811a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenDismissed() adInfo = " + t5.this.a(this.f20811a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20813a;

        k(AdInfo adInfo) {
            this.f20813a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20791b != null) {
                t5.this.f20791b.onAdScreenDismissed(t5.this.a(this.f20813a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenDismissed() adInfo = " + t5.this.a(this.f20813a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f20815a;

        l(AdInfo adInfo) {
            this.f20815a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f20792c != null) {
                t5.this.f20792c.onAdLeftApplication(t5.this.a(this.f20815a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLeftApplication() adInfo = " + t5.this.a(this.f20815a));
            }
        }
    }

    private t5() {
    }

    public static t5 a() {
        return f20790d;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f20792c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.f20791b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public void a(LevelPlayBannerListener levelPlayBannerListener) {
        this.f20791b = levelPlayBannerListener;
    }

    public LevelPlayBannerListener b() {
        return this.f20791b;
    }

    public void b(AdInfo adInfo) {
        if (this.f20792c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.f20791b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }

    public void b(LevelPlayBannerListener levelPlayBannerListener) {
        this.f20792c = levelPlayBannerListener;
    }

    public void c(AdInfo adInfo) {
        if (this.f20792c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f20791b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.f20792c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f20791b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f20792c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f20791b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f20792c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.f20791b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }
}
