package com.ironsource;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.environment.ContextProvider;
import com.ironsource.j3;
import com.ironsource.m3;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.xu;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c7 implements bm, a6 {

    /* renamed from: a  reason: collision with root package name */
    private final BannerAdRequest f16828a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSize f16829b;

    /* renamed from: c  reason: collision with root package name */
    private final l5 f16830c;

    /* renamed from: d  reason: collision with root package name */
    private final cm f16831d;

    /* renamed from: e  reason: collision with root package name */
    private final vn f16832e;

    /* renamed from: f  reason: collision with root package name */
    private final q3 f16833f;

    /* renamed from: g  reason: collision with root package name */
    private final t0<BannerAdView> f16834g;

    /* renamed from: h  reason: collision with root package name */
    private final d6 f16835h;

    /* renamed from: i  reason: collision with root package name */
    private final xu.c f16836i;

    /* renamed from: j  reason: collision with root package name */
    private final Executor f16837j;

    /* renamed from: k  reason: collision with root package name */
    private ib f16838k;

    /* renamed from: l  reason: collision with root package name */
    private xu f16839l;

    /* renamed from: m  reason: collision with root package name */
    private w4 f16840m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f16841n;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements xu.a {
        a() {
        }

        @Override // com.ironsource.xu.a
        public void a() {
            c7.this.a(wb.f21282a.s());
        }
    }

    public c7(BannerAdRequest adRequest, AdSize size, l5 auctionResponseFetcher, cm loadTaskConfig, vn networkLoadApi, q3 analytics, t0<BannerAdView> adLoadTaskListener, d6 adLayoutFactory, xu.c timerFactory, Executor taskFinishedExecutor) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(size, "size");
        kotlin.jvm.internal.n.f(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.n.f(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.n.f(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.n.f(adLayoutFactory, "adLayoutFactory");
        kotlin.jvm.internal.n.f(timerFactory, "timerFactory");
        kotlin.jvm.internal.n.f(taskFinishedExecutor, "taskFinishedExecutor");
        this.f16828a = adRequest;
        this.f16829b = size;
        this.f16830c = auctionResponseFetcher;
        this.f16831d = loadTaskConfig;
        this.f16832e = networkLoadApi;
        this.f16833f = analytics;
        this.f16834g = adLoadTaskListener;
        this.f16835h = adLayoutFactory;
        this.f16836i = timerFactory;
        this.f16837j = taskFinishedExecutor;
    }

    public /* synthetic */ c7(BannerAdRequest bannerAdRequest, AdSize adSize, l5 l5Var, cm cmVar, vn vnVar, q3 q3Var, t0 t0Var, d6 d6Var, xu.c cVar, Executor executor, int i10, kotlin.jvm.internal.h hVar) {
        this(bannerAdRequest, adSize, l5Var, cmVar, vnVar, q3Var, t0Var, d6Var, (i10 & 256) != 0 ? new xu.d() : cVar, (i10 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? hg.f17676a.c() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c7 this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        if (this$0.f16841n) {
            return;
        }
        this$0.f16841n = true;
        xu xuVar = this$0.f16839l;
        if (xuVar != null) {
            xuVar.cancel();
        }
        j3.c.a aVar = j3.c.f17909a;
        m3.j jVar = new m3.j(error.getErrorCode());
        m3.k kVar = new m3.k(error.getErrorMessage());
        ib ibVar = this$0.f16838k;
        if (ibVar == null) {
            kotlin.jvm.internal.n.u("taskStartedTime");
            ibVar = null;
        }
        aVar.a(jVar, kVar, new m3.f(ib.a(ibVar))).a(this$0.f16833f);
        w4 w4Var = this$0.f16840m;
        if (w4Var != null) {
            w4Var.a("onBannerLoadFail");
        }
        this$0.f16834g.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c7 this$0, rj adInstance, vg adContainer) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInstance, "$adInstance");
        kotlin.jvm.internal.n.f(adContainer, "$adContainer");
        if (this$0.f16841n) {
            return;
        }
        this$0.f16841n = true;
        xu xuVar = this$0.f16839l;
        if (xuVar != null) {
            xuVar.cancel();
        }
        ib ibVar = this$0.f16838k;
        if (ibVar == null) {
            kotlin.jvm.internal.n.u("taskStartedTime");
            ibVar = null;
        }
        j3.c.f17909a.a(new m3.f(ib.a(ibVar))).a(this$0.f16833f);
        w4 w4Var = this$0.f16840m;
        if (w4Var != null) {
            w4Var.b("onBannerLoadSuccess");
        }
        d6 d6Var = this$0.f16835h;
        w4 w4Var2 = this$0.f16840m;
        kotlin.jvm.internal.n.c(w4Var2);
        this$0.f16834g.a(d6Var.a(adInstance, adContainer, w4Var2));
    }

    public final void a(final IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f16837j.execute(new Runnable() { // from class: com.ironsource.yw
            @Override // java.lang.Runnable
            public final void run() {
                c7.a(c7.this, error);
            }
        });
    }

    @Override // com.ironsource.a6
    public void onBannerLoadFail(String description) {
        kotlin.jvm.internal.n.f(description, "description");
        a(wb.f21282a.c(description));
    }

    @Override // com.ironsource.a6
    public void onBannerLoadSuccess(final rj adInstance, final vg adContainer) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(adContainer, "adContainer");
        this.f16837j.execute(new Runnable() { // from class: com.ironsource.zw
            @Override // java.lang.Runnable
            public final void run() {
                c7.a(c7.this, adInstance, adContainer);
            }
        });
    }

    @Override // com.ironsource.bm
    public void start() {
        this.f16838k = new ib();
        this.f16833f.a(new m3.s(this.f16831d.f()), new m3.n(this.f16831d.g().b()), new m3.c(this.f16829b), new m3.b(this.f16828a.getAdId$mediationsdk_release()));
        j3.c.f17909a.a().a(this.f16833f);
        long h10 = this.f16831d.h();
        xu.c cVar = this.f16836i;
        xu.b bVar = new xu.b();
        bVar.b(h10);
        i8.w wVar = i8.w.f26638a;
        xu a10 = cVar.a(bVar);
        this.f16839l = a10;
        if (a10 != null) {
            a10.a(new a());
        }
        Object a11 = this.f16830c.a();
        Throwable d10 = i8.o.d(a11);
        if (d10 != null) {
            kotlin.jvm.internal.n.d(d10, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((qg) d10).a());
            a11 = null;
        }
        i5 i5Var = (i5) a11;
        if (i5Var == null) {
            return;
        }
        q3 q3Var = this.f16833f;
        String b10 = i5Var.b();
        if (b10 != null) {
            q3Var.a(new m3.d(b10));
        }
        JSONObject f10 = i5Var.f();
        if (f10 != null) {
            q3Var.a(new m3.m(f10));
        }
        String a12 = i5Var.a();
        if (a12 != null) {
            q3Var.a(new m3.g(a12));
        }
        wi g10 = this.f16831d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        tg tgVar = new tg(AdapterUtils.dpToPixels(applicationContext, this.f16829b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.f16829b.getHeight()), this.f16829b.getSizeDescription());
        ko koVar = new ko();
        koVar.a(this);
        rj adInstance = new sj(this.f16828a.getProviderName$mediationsdk_release().value(), koVar).a(g10.b(wi.Bidder)).a(tgVar).b(this.f16831d.i()).a(this.f16828a.getAdId$mediationsdk_release()).a(new on().a()).a();
        xn xnVar = new xn(i5Var, this.f16831d.j());
        this.f16840m = new w4(new vi(this.f16828a.getInstanceId(), g10.b(), i5Var.a()), new com.ironsource.mediationsdk.d(), i5Var.c());
        j3.d.f17917a.c().a(this.f16833f);
        vn vnVar = this.f16832e;
        kotlin.jvm.internal.n.e(adInstance, "adInstance");
        vnVar.a(adInstance, xnVar);
    }
}
