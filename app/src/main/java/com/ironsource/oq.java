package com.ironsource;

import com.ironsource.j3;
import com.ironsource.m3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.xu;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class oq implements bm, bd {

    /* renamed from: a  reason: collision with root package name */
    private final RewardedAdRequest f19617a;

    /* renamed from: b  reason: collision with root package name */
    private final cm f19618b;

    /* renamed from: c  reason: collision with root package name */
    private final t0<RewardedAd> f19619c;

    /* renamed from: d  reason: collision with root package name */
    private final l5 f19620d;

    /* renamed from: e  reason: collision with root package name */
    private final vn f19621e;

    /* renamed from: f  reason: collision with root package name */
    private final q3 f19622f;

    /* renamed from: g  reason: collision with root package name */
    private final c1<RewardedAd> f19623g;

    /* renamed from: h  reason: collision with root package name */
    private final xu.c f19624h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f19625i;

    /* renamed from: j  reason: collision with root package name */
    private ib f19626j;

    /* renamed from: k  reason: collision with root package name */
    private xu f19627k;

    /* renamed from: l  reason: collision with root package name */
    private w4 f19628l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f19629m;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements xu.a {
        a() {
        }

        @Override // com.ironsource.xu.a
        public void a() {
            oq.this.a(wb.f21282a.s());
        }
    }

    public oq(RewardedAdRequest adRequest, cm loadTaskConfig, t0<RewardedAd> adLoadTaskListener, l5 auctionResponseFetcher, vn networkLoadApi, q3 analytics, c1<RewardedAd> adObjectFactory, xu.c timerFactory, Executor taskFinishedExecutor) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.n.f(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.n.f(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.n.f(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(adObjectFactory, "adObjectFactory");
        kotlin.jvm.internal.n.f(timerFactory, "timerFactory");
        kotlin.jvm.internal.n.f(taskFinishedExecutor, "taskFinishedExecutor");
        this.f19617a = adRequest;
        this.f19618b = loadTaskConfig;
        this.f19619c = adLoadTaskListener;
        this.f19620d = auctionResponseFetcher;
        this.f19621e = networkLoadApi;
        this.f19622f = analytics;
        this.f19623g = adObjectFactory;
        this.f19624h = timerFactory;
        this.f19625i = taskFinishedExecutor;
    }

    public /* synthetic */ oq(RewardedAdRequest rewardedAdRequest, cm cmVar, t0 t0Var, l5 l5Var, vn vnVar, q3 q3Var, c1 c1Var, xu.c cVar, Executor executor, int i10, kotlin.jvm.internal.h hVar) {
        this(rewardedAdRequest, cmVar, t0Var, l5Var, vnVar, q3Var, c1Var, (i10 & 128) != 0 ? new xu.d() : cVar, (i10 & 256) != 0 ? hg.f17676a.c() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(oq this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        if (this$0.f19629m) {
            return;
        }
        this$0.f19629m = true;
        xu xuVar = this$0.f19627k;
        if (xuVar != null) {
            xuVar.cancel();
        }
        j3.c.a aVar = j3.c.f17909a;
        m3.j jVar = new m3.j(error.getErrorCode());
        m3.k kVar = new m3.k(error.getErrorMessage());
        ib ibVar = this$0.f19626j;
        if (ibVar == null) {
            kotlin.jvm.internal.n.u("taskStartedTime");
            ibVar = null;
        }
        aVar.a(jVar, kVar, new m3.f(ib.a(ibVar))).a(this$0.f19622f);
        w4 w4Var = this$0.f19628l;
        if (w4Var != null) {
            w4Var.a("onAdInstanceLoadFail");
        }
        this$0.f19619c.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(oq this$0, rj adInstance) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInstance, "$adInstance");
        if (this$0.f19629m) {
            return;
        }
        this$0.f19629m = true;
        xu xuVar = this$0.f19627k;
        if (xuVar != null) {
            xuVar.cancel();
        }
        ib ibVar = this$0.f19626j;
        if (ibVar == null) {
            kotlin.jvm.internal.n.u("taskStartedTime");
            ibVar = null;
        }
        j3.c.f17909a.a(new m3.f(ib.a(ibVar))).a(this$0.f19622f);
        w4 w4Var = this$0.f19628l;
        if (w4Var != null) {
            w4Var.b("onAdInstanceLoadSuccess");
        }
        c1<RewardedAd> c1Var = this$0.f19623g;
        w4 w4Var2 = this$0.f19628l;
        kotlin.jvm.internal.n.c(w4Var2);
        this$0.f19619c.a(c1Var.a(adInstance, w4Var2));
    }

    public final void a(final IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f19625i.execute(new Runnable() { // from class: com.ironsource.f00
            @Override // java.lang.Runnable
            public final void run() {
                oq.a(oq.this, error);
            }
        });
    }

    @Override // com.ironsource.bd
    public void a(final rj adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        this.f19625i.execute(new Runnable() { // from class: com.ironsource.g00
            @Override // java.lang.Runnable
            public final void run() {
                oq.a(oq.this, adInstance);
            }
        });
    }

    @Override // com.ironsource.bd
    public void a(String description) {
        kotlin.jvm.internal.n.f(description, "description");
        a(wb.f21282a.c(description));
    }

    @Override // com.ironsource.bm
    public void start() {
        Map<String, String> l10;
        this.f19626j = new ib();
        this.f19622f.a(new m3.s(this.f19618b.f()), new m3.n(this.f19618b.g().b()), new m3.b(this.f19617a.getAdId$mediationsdk_release()));
        j3.c.f17909a.a().a(this.f19622f);
        long h10 = this.f19618b.h();
        xu.c cVar = this.f19624h;
        xu.b bVar = new xu.b();
        bVar.b(h10);
        i8.w wVar = i8.w.f26638a;
        xu a10 = cVar.a(bVar);
        this.f19627k = a10;
        if (a10 != null) {
            a10.a(new a());
        }
        Object a11 = this.f19620d.a();
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
        q3 q3Var = this.f19622f;
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
        wi g10 = this.f19618b.g();
        ad adVar = new ad();
        adVar.a(this);
        Map<String, String> a13 = new on().a();
        Map<String, String> a14 = qc.f19885a.a(this.f19617a.getExtraParams());
        sj a15 = new sj(this.f19617a.getProviderName$mediationsdk_release().value(), adVar).a(g10.b(wi.Bidder)).b(this.f19618b.i()).c().a(this.f19617a.getAdId$mediationsdk_release());
        l10 = j8.j0.l(a13, a14);
        rj adInstance = a15.a(l10).a();
        q3 q3Var2 = this.f19622f;
        String e8 = adInstance.e();
        kotlin.jvm.internal.n.e(e8, "adInstance.id");
        q3Var2.a(new m3.b(e8));
        xn xnVar = new xn(i5Var, this.f19618b.j());
        this.f19628l = new w4(new vi(this.f19617a.getInstanceId(), g10.b(), i5Var.a()), new com.ironsource.mediationsdk.d(), i5Var.c());
        j3.d.f17917a.c().a(this.f19622f);
        vn vnVar = this.f19621e;
        kotlin.jvm.internal.n.e(adInstance, "adInstance");
        vnVar.a(adInstance, xnVar);
    }
}
