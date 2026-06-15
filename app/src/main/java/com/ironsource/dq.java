package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class dq extends t7 {

    /* renamed from: d  reason: collision with root package name */
    private static final dq f17091d = new dq();

    /* renamed from: b  reason: collision with root package name */
    private LevelPlayRewardedVideoBaseListener f17092b = null;

    /* renamed from: c  reason: collision with root package name */
    private LevelPlayRewardedVideoBaseListener f17093c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f17094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdInfo f17095b;

        a(boolean z10, AdInfo adInfo) {
            this.f17094a = z10;
            this.f17095b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (dq.this.f17092b != null) {
                if (this.f17094a) {
                    ((LevelPlayRewardedVideoListener) dq.this.f17092b).onAdAvailable(dq.this.a(this.f17095b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + dq.this.a(this.f17095b);
                } else {
                    ((LevelPlayRewardedVideoListener) dq.this.f17092b).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Placement f17097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdInfo f17098b;

        b(Placement placement, AdInfo adInfo) {
            this.f17097a = placement;
            this.f17098b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17093c != null) {
                dq.this.f17093c.onAdRewarded(this.f17097a, dq.this.a(this.f17098b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdRewarded() placement = " + this.f17097a + ", adInfo = " + dq.this.a(this.f17098b));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Placement f17100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdInfo f17101b;

        c(Placement placement, AdInfo adInfo) {
            this.f17100a = placement;
            this.f17101b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17092b != null) {
                dq.this.f17092b.onAdRewarded(this.f17100a, dq.this.a(this.f17101b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdRewarded() placement = " + this.f17100a + ", adInfo = " + dq.this.a(this.f17101b));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceError f17103a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdInfo f17104b;

        d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f17103a = ironSourceError;
            this.f17104b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17093c != null) {
                dq.this.f17093c.onAdShowFailed(this.f17103a, dq.this.a(this.f17104b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + dq.this.a(this.f17104b) + ", error = " + this.f17103a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceError f17106a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdInfo f17107b;

        e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f17106a = ironSourceError;
            this.f17107b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17092b != null) {
                dq.this.f17092b.onAdShowFailed(this.f17106a, dq.this.a(this.f17107b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + dq.this.a(this.f17107b) + ", error = " + this.f17106a.getErrorMessage());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Placement f17109a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdInfo f17110b;

        f(Placement placement, AdInfo adInfo) {
            this.f17109a = placement;
            this.f17110b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17093c != null) {
                dq.this.f17093c.onAdClicked(this.f17109a, dq.this.a(this.f17110b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() placement = " + this.f17109a + ", adInfo = " + dq.this.a(this.f17110b));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Placement f17112a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdInfo f17113b;

        g(Placement placement, AdInfo adInfo) {
            this.f17112a = placement;
            this.f17113b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17092b != null) {
                dq.this.f17092b.onAdClicked(this.f17112a, dq.this.a(this.f17113b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() placement = " + this.f17112a + ", adInfo = " + dq.this.a(this.f17113b));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f17115a;

        h(AdInfo adInfo) {
            this.f17115a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17093c != null) {
                ((LevelPlayRewardedVideoManualListener) dq.this.f17093c).onAdReady(dq.this.a(this.f17115a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + dq.this.a(this.f17115a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f17117a;

        i(AdInfo adInfo) {
            this.f17117a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17092b != null) {
                ((LevelPlayRewardedVideoManualListener) dq.this.f17092b).onAdReady(dq.this.a(this.f17117a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + dq.this.a(this.f17117a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceError f17119a;

        j(IronSourceError ironSourceError) {
            this.f17119a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17093c != null) {
                ((LevelPlayRewardedVideoManualListener) dq.this.f17093c).onAdLoadFailed(this.f17119a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f17119a.getErrorMessage());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceError f17121a;

        k(IronSourceError ironSourceError) {
            this.f17121a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17092b != null) {
                ((LevelPlayRewardedVideoManualListener) dq.this.f17092b).onAdLoadFailed(this.f17121a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f17121a.getErrorMessage());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f17123a;

        l(AdInfo adInfo) {
            this.f17123a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17093c != null) {
                dq.this.f17093c.onAdOpened(dq.this.a(this.f17123a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + dq.this.a(this.f17123a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f17125a;

        m(AdInfo adInfo) {
            this.f17125a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17092b != null) {
                dq.this.f17092b.onAdOpened(dq.this.a(this.f17125a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + dq.this.a(this.f17125a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f17127a;

        n(AdInfo adInfo) {
            this.f17127a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17093c != null) {
                dq.this.f17093c.onAdClosed(dq.this.a(this.f17127a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + dq.this.a(this.f17127a));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInfo f17129a;

        o(AdInfo adInfo) {
            this.f17129a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dq.this.f17092b != null) {
                dq.this.f17092b.onAdClosed(dq.this.a(this.f17129a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + dq.this.a(this.f17129a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f17131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdInfo f17132b;

        p(boolean z10, AdInfo adInfo) {
            this.f17131a = z10;
            this.f17132b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (dq.this.f17093c != null) {
                if (this.f17131a) {
                    ((LevelPlayRewardedVideoListener) dq.this.f17093c).onAdAvailable(dq.this.a(this.f17132b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + dq.this.a(this.f17132b);
                } else {
                    ((LevelPlayRewardedVideoListener) dq.this.f17093c).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    private dq() {
    }

    public static dq a() {
        return f17091d;
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f17093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f17092b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f17093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.f17092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(Placement placement, AdInfo adInfo) {
        if (this.f17093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(placement, adInfo));
        } else if (this.f17092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(placement, adInfo));
        }
    }

    public void a(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.f17092b = levelPlayRewardedVideoBaseListener;
    }

    public void a(boolean z10, AdInfo adInfo) {
        if (this.f17093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z10, adInfo));
            return;
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f17092b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z10, adInfo));
    }

    public void b() {
    }

    public void b(AdInfo adInfo) {
        if (this.f17093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f17092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void b(Placement placement, AdInfo adInfo) {
        if (this.f17093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(placement, adInfo));
        } else if (this.f17092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(placement, adInfo));
        }
    }

    public void b(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.f17093c = levelPlayRewardedVideoBaseListener;
    }

    public void c() {
    }

    public void c(AdInfo adInfo) {
        if (this.f17093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f17092b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.f17093c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f17092b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }
}
