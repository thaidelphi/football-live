package com.ironsource;

import android.app.Activity;
import com.ironsource.e2;
import com.ironsource.j1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o1;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class gl implements gd {

    /* renamed from: m  reason: collision with root package name */
    public static final a f17578m = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final LevelPlay.AdFormat f17579a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17580b;

    /* renamed from: c  reason: collision with root package name */
    private final o1 f17581c;

    /* renamed from: d  reason: collision with root package name */
    private final ed f17582d;

    /* renamed from: e  reason: collision with root package name */
    private final x1 f17583e;

    /* renamed from: f  reason: collision with root package name */
    private final xf f17584f;

    /* renamed from: g  reason: collision with root package name */
    private final q9 f17585g;

    /* renamed from: h  reason: collision with root package name */
    private dd f17586h;

    /* renamed from: i  reason: collision with root package name */
    private hl f17587i;

    /* renamed from: j  reason: collision with root package name */
    private final UUID f17588j;

    /* renamed from: k  reason: collision with root package name */
    private od f17589k;

    /* renamed from: l  reason: collision with root package name */
    private ib f17590l;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final boolean a(String placementName, LevelPlay.AdFormat adFormat) {
            kotlin.jvm.internal.n.f(placementName, "placementName");
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            o1 a10 = o1.a.a(com.unity3d.mediation.a.a(adFormat), e2.b.MEDIATION);
            if (!a10.g()) {
                a10.e().a().a(placementName, "SDK is not initialized", false);
                return false;
            }
            l8 a11 = mm.f19249r.d().y().a(placementName, adFormat);
            boolean d10 = a11.d();
            a10.e().a().a(placementName, a11.e(), d10);
            return d10;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final o1 f17591a;

        /* renamed from: b  reason: collision with root package name */
        private final ed f17592b;

        /* renamed from: c  reason: collision with root package name */
        private final xf f17593c;

        /* renamed from: d  reason: collision with root package name */
        private final q9 f17594d;

        /* renamed from: e  reason: collision with root package name */
        private final lf f17595e;

        public b(o1 adTools, ed adControllerFactory, xf provider, q9 currentTimeProvider, lf idFactory) {
            kotlin.jvm.internal.n.f(adTools, "adTools");
            kotlin.jvm.internal.n.f(adControllerFactory, "adControllerFactory");
            kotlin.jvm.internal.n.f(provider, "provider");
            kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
            kotlin.jvm.internal.n.f(idFactory, "idFactory");
            this.f17591a = adTools;
            this.f17592b = adControllerFactory;
            this.f17593c = provider;
            this.f17594d = currentTimeProvider;
            this.f17595e = idFactory;
        }

        public final ed a() {
            return this.f17592b;
        }

        public final o1 b() {
            return this.f17591a;
        }

        public final q9 c() {
            return this.f17594d;
        }

        public final lf d() {
            return this.f17595e;
        }

        public final xf e() {
            return this.f17593c;
        }
    }

    public gl(LevelPlay.AdFormat adFormat, String adUnitId, o1 adTools, ed fullscreenAdControllerFactory, x1 adUnitDataFactory, xf mediationServicesProvider, q9 currentTimeProvider, lf idFactory) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        kotlin.jvm.internal.n.f(adUnitDataFactory, "adUnitDataFactory");
        kotlin.jvm.internal.n.f(mediationServicesProvider, "mediationServicesProvider");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(idFactory, "idFactory");
        this.f17579a = adFormat;
        this.f17580b = adUnitId;
        this.f17581c = adTools;
        this.f17582d = fullscreenAdControllerFactory;
        this.f17583e = adUnitDataFactory;
        this.f17584f = mediationServicesProvider;
        this.f17585g = currentTimeProvider;
        UUID a10 = idFactory.a();
        this.f17588j = a10;
        this.f17589k = new hd(this, false, 2, null);
        adTools.e().a(new o(com.unity3d.mediation.a.a(adFormat), a10, adUnitId));
    }

    public /* synthetic */ gl(LevelPlay.AdFormat adFormat, String str, o1 o1Var, ed edVar, x1 x1Var, xf xfVar, q9 q9Var, lf lfVar, int i10, kotlin.jvm.internal.h hVar) {
        this(adFormat, str, o1Var, edVar, x1Var, (i10 & 32) != 0 ? mm.f19249r.d() : xfVar, q9Var, lfVar);
    }

    private final od a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        return cb.f16858a.a(qu.f19902a.a(levelPlayAdError)) ? new ld(this, levelPlayAdInfo, this.f17585g) : new hd(this, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f17581c.e().f().a();
        this$0.f17589k.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl this$0, long j10) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f17581c.e().f().a(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl this$0, long j10, LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f17581c.e().f().a(j10, levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0, (levelPlayAdError == null || (r4 = levelPlayAdError.getErrorMessage()) == null) ? "" : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl this$0, Activity activity, String str) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(activity, "$activity");
        this$0.f17581c.e().h().d();
        this$0.f17589k.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl this$0, LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        this$0.f17581c.e().h().a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        hl hlVar = this$0.f17587i;
        if (hlVar != null) {
            hlVar.onAdDisplayFailed(error, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        hl hlVar = this$0.f17587i;
        if (hlVar != null) {
            hlVar.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gl this$0, LevelPlayReward reward) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(reward, "$reward");
        hl hlVar = this$0.f17587i;
        if (hlVar != null) {
            hlVar.onAdRewarded(reward, this$0.f17589k.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, gl this$0) {
        hl hlVar;
        kotlin.jvm.internal.n.f(this$0, "this$0");
        if (levelPlayAdError == null || (hlVar = this$0.f17587i) == null) {
            return;
        }
        hlVar.onAdLoadFailed(levelPlayAdError);
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdInfo levelPlayAdInfo2) {
        this.f17581c.e().h().a(levelPlayAdInfo, levelPlayAdInfo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(gl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        hl hlVar = this$0.f17587i;
        if (hlVar != null) {
            hlVar.onAdClicked(this$0.f17589k.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(gl this$0, LevelPlayAdError error, LevelPlayAdInfo currentAdInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        kotlin.jvm.internal.n.f(currentAdInfo, "$currentAdInfo");
        this$0.a(this$0.a(error, currentAdInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(gl this$0, LevelPlayAdInfo currentAdInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(currentAdInfo, "$currentAdInfo");
        hl hlVar = this$0.f17587i;
        if (hlVar != null) {
            hlVar.onAdClosed(currentAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(gl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.a(new hd(this$0, false, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(gl this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        this$0.a(this$0.f17589k.b(), adInfo);
        this$0.f17589k.onAdInfoChanged(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(gl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f17581c.e().h().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(gl this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        hl hlVar = this$0.f17587i;
        if (hlVar != null) {
            hlVar.onAdInfoChanged(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(gl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        hl hlVar = this$0.f17587i;
        if (hlVar != null) {
            hlVar.onAdDisplayed(this$0.f17589k.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(gl this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        this$0.a(new ld(this$0, adInfo, this$0.f17585g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(gl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f17589k.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(gl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.a(new hd(this$0, false, 2, null));
    }

    @Override // com.ironsource.gd
    public void a() {
        this.f17581c.d(new Runnable() { // from class: com.ironsource.sy
            @Override // java.lang.Runnable
            public final void run() {
                gl.f(gl.this);
            }
        });
    }

    public final void a(final Activity activity, final String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f17581c.d(new Runnable() { // from class: com.ironsource.yy
            @Override // java.lang.Runnable
            public final void run() {
                gl.a(gl.this, activity, str);
            }
        });
    }

    public final void a(dd ddVar) {
        this.f17586h = ddVar;
    }

    public final void a(hl hlVar) {
        this.f17587i = hlVar;
    }

    public final void a(od state) {
        kotlin.jvm.internal.n.f(state, "state");
        this.f17589k = state;
    }

    @Override // com.ironsource.gd
    public void a(final LevelPlayAdError error) {
        kotlin.jvm.internal.n.f(error, "error");
        final LevelPlayAdInfo b10 = this.f17589k.b();
        this.f17581c.d(new Runnable() { // from class: com.ironsource.hy
            @Override // java.lang.Runnable
            public final void run() {
                gl.b(gl.this, error, b10);
            }
        });
        b(error, b10);
    }

    public final void a(final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        IronLog ironLog = IronLog.CALLBACK;
        o1 o1Var = this.f17581c;
        ironLog.verbose(o1.a(o1Var, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        final long a10 = ib.a(this.f17590l);
        this.f17581c.d(new Runnable() { // from class: com.ironsource.wy
            @Override // java.lang.Runnable
            public final void run() {
                gl.a(gl.this, a10);
            }
        });
        this.f17581c.e(new Runnable() { // from class: com.ironsource.ky
            @Override // java.lang.Runnable
            public final void run() {
                gl.a(gl.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.gd
    public void a(final LevelPlayReward reward) {
        kotlin.jvm.internal.n.f(reward, "reward");
        IronLog ironLog = IronLog.CALLBACK;
        o1 o1Var = this.f17581c;
        ironLog.verbose(o1.a(o1Var, "onAdRewarded adInfo: " + this.f17589k.b() + " reward: " + reward, (String) null, 2, (Object) null));
        this.f17581c.e(new Runnable() { // from class: com.ironsource.oy
            @Override // java.lang.Runnable
            public final void run() {
                gl.a(gl.this, reward);
            }
        });
    }

    @Override // com.ironsource.gd
    public void b() {
        IronLog ironLog = IronLog.CALLBACK;
        o1 o1Var = this.f17581c;
        ironLog.verbose(o1.a(o1Var, "onAdDisplayed adInfo: " + this.f17589k.b(), (String) null, 2, (Object) null));
        this.f17581c.d(new Runnable() { // from class: com.ironsource.qy
            @Override // java.lang.Runnable
            public final void run() {
                gl.d(gl.this);
            }
        });
        this.f17581c.e(new Runnable() { // from class: com.ironsource.ry
            @Override // java.lang.Runnable
            public final void run() {
                gl.e(gl.this);
            }
        });
    }

    public final void b(final LevelPlayAdError levelPlayAdError) {
        IronLog ironLog = IronLog.CALLBACK;
        o1 o1Var = this.f17581c;
        ironLog.verbose(o1.a(o1Var, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        final long a10 = ib.a(this.f17590l);
        this.f17581c.d(new Runnable() { // from class: com.ironsource.xy
            @Override // java.lang.Runnable
            public final void run() {
                gl.a(gl.this, a10, levelPlayAdError);
            }
        });
        this.f17581c.e(new Runnable() { // from class: com.ironsource.py
            @Override // java.lang.Runnable
            public final void run() {
                gl.a(LevelPlayAdError.this, this);
            }
        });
    }

    public final void b(final LevelPlayAdError error, final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(error, "error");
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        IronLog ironLog = IronLog.CALLBACK;
        o1 o1Var = this.f17581c;
        ironLog.verbose(o1.a(o1Var, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f17581c.d(new Runnable() { // from class: com.ironsource.gy
            @Override // java.lang.Runnable
            public final void run() {
                gl.a(gl.this, error);
            }
        });
        this.f17581c.e(new Runnable() { // from class: com.ironsource.iy
            @Override // java.lang.Runnable
            public final void run() {
                gl.a(gl.this, error, adInfo);
            }
        });
    }

    public final dd c() {
        return this.f17586h;
    }

    public final LevelPlay.AdFormat d() {
        return this.f17579a;
    }

    public final UUID e() {
        return this.f17588j;
    }

    public final o1 f() {
        return this.f17581c;
    }

    public final x1 g() {
        return this.f17583e;
    }

    public final String h() {
        return this.f17580b;
    }

    public final ed i() {
        return this.f17582d;
    }

    public final hl j() {
        return this.f17587i;
    }

    public final xf k() {
        return this.f17584f;
    }

    public final boolean l() {
        j1 c10 = this.f17589k.c();
        this.f17581c.e().e().a(Boolean.valueOf(c10.a()), c10 instanceof j1.a ? ((j1.a) c10).c() : null);
        return c10.a();
    }

    public final void m() {
        this.f17590l = new ib();
        this.f17581c.d(new Runnable() { // from class: com.ironsource.ty
            @Override // java.lang.Runnable
            public final void run() {
                gl.a(gl.this);
            }
        });
    }

    public final void n() {
        a(new md(this));
        dd ddVar = this.f17586h;
        if (ddVar != null) {
            ddVar.i();
        }
    }

    @Override // com.ironsource.gd
    public void onAdClicked() {
        IronLog ironLog = IronLog.CALLBACK;
        o1 o1Var = this.f17581c;
        ironLog.verbose(o1.a(o1Var, "onAdClicked adInfo: " + this.f17589k.b(), (String) null, 2, (Object) null));
        this.f17581c.e(new Runnable() { // from class: com.ironsource.fy
            @Override // java.lang.Runnable
            public final void run() {
                gl.b(gl.this);
            }
        });
    }

    @Override // com.ironsource.gd
    public void onAdClosed() {
        final LevelPlayAdInfo b10 = this.f17589k.b();
        IronLog ironLog = IronLog.CALLBACK;
        o1 o1Var = this.f17581c;
        ironLog.verbose(o1.a(o1Var, "onAdClosed adInfo: " + b10, (String) null, 2, (Object) null));
        this.f17581c.d(new Runnable() { // from class: com.ironsource.uy
            @Override // java.lang.Runnable
            public final void run() {
                gl.c(gl.this);
            }
        });
        this.f17581c.e(new Runnable() { // from class: com.ironsource.jy
            @Override // java.lang.Runnable
            public final void run() {
                gl.b(gl.this, b10);
            }
        });
    }

    @Override // com.ironsource.gd
    public void onAdInfoChanged(final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        IronLog ironLog = IronLog.CALLBACK;
        o1 o1Var = this.f17581c;
        ironLog.verbose(o1.a(o1Var, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f17581c.d(new Runnable() { // from class: com.ironsource.ny
            @Override // java.lang.Runnable
            public final void run() {
                gl.c(gl.this, adInfo);
            }
        });
        this.f17581c.e(new Runnable() { // from class: com.ironsource.my
            @Override // java.lang.Runnable
            public final void run() {
                gl.d(gl.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.gd
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        this.f17581c.d(new Runnable() { // from class: com.ironsource.vy
            @Override // java.lang.Runnable
            public final void run() {
                gl.g(gl.this);
            }
        });
        b(levelPlayAdError);
    }

    @Override // com.ironsource.gd
    public void onAdLoaded(final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f17581c.d(new Runnable() { // from class: com.ironsource.ly
            @Override // java.lang.Runnable
            public final void run() {
                gl.e(gl.this, adInfo);
            }
        });
        a(adInfo);
    }
}
