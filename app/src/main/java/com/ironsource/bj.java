package com.ironsource;

import android.app.Activity;
import com.ironsource.ai;
import com.ironsource.j3;
import com.ironsource.m3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class bj implements cd {

    /* renamed from: a  reason: collision with root package name */
    private rj f16753a;

    /* renamed from: b  reason: collision with root package name */
    private a1 f16754b;

    /* renamed from: c  reason: collision with root package name */
    private x4 f16755c;

    /* renamed from: d  reason: collision with root package name */
    private q3 f16756d;

    /* renamed from: e  reason: collision with root package name */
    private mn f16757e;

    /* renamed from: f  reason: collision with root package name */
    private uu f16758f;

    /* renamed from: g  reason: collision with root package name */
    private ai f16759g;

    /* renamed from: h  reason: collision with root package name */
    private ai.a f16760h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, bj> f16761i;

    /* renamed from: j  reason: collision with root package name */
    private InterstitialAdInfo f16762j;

    /* renamed from: k  reason: collision with root package name */
    private cj f16763k;

    public bj(rj adInstance, a1 adNetworkShow, x4 auctionDataReporter, q3 analytics, mn networkDestroyAPI, uu threadManager, ai sessionDepthService, ai.a sessionDepthServiceEditor, Map<String, bj> retainer) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.n.f(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.n.f(retainer, "retainer");
        this.f16753a = adInstance;
        this.f16754b = adNetworkShow;
        this.f16755c = auctionDataReporter;
        this.f16756d = analytics;
        this.f16757e = networkDestroyAPI;
        this.f16758f = threadManager;
        this.f16759g = sessionDepthService;
        this.f16760h = sessionDepthServiceEditor;
        this.f16761i = retainer;
        String f10 = adInstance.f();
        kotlin.jvm.internal.n.e(f10, "adInstance.instanceId");
        String e8 = this.f16753a.e();
        kotlin.jvm.internal.n.e(e8, "adInstance.id");
        this.f16762j = new InterstitialAdInfo(f10, e8);
        ad adVar = new ad();
        this.f16753a.a(adVar);
        adVar.a(this);
    }

    public /* synthetic */ bj(rj rjVar, a1 a1Var, x4 x4Var, q3 q3Var, mn mnVar, uu uuVar, ai aiVar, ai.a aVar, Map map, int i10, kotlin.jvm.internal.h hVar) {
        this(rjVar, a1Var, x4Var, q3Var, (i10 & 16) != 0 ? new nn() : mnVar, (i10 & 32) != 0 ? hg.f17676a : uuVar, (i10 & 64) != 0 ? mm.f19249r.d().k() : aiVar, (i10 & 128) != 0 ? mm.f19249r.a().e() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bj this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        j3.d.f17917a.b().a(this$0.f16756d);
        this$0.f16757e.a(this$0.f16753a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bj this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        cj cjVar = this$0.f16763k;
        if (cjVar != null) {
            cjVar.onAdInstanceDidFailedToShow(error);
        }
    }

    private final void a(final IronSourceError ironSourceError) {
        this.f16761i.remove(this.f16762j.getAdId());
        j3.a.f17895a.a(new m3.j(ironSourceError.getErrorCode()), new m3.k(ironSourceError.getErrorMessage())).a(this.f16756d);
        this.f16758f.a(new Runnable() { // from class: com.ironsource.xw
            @Override // java.lang.Runnable
            public final void run() {
                bj.a(bj.this, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(bj this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        cj cjVar = this$0.f16763k;
        if (cjVar != null) {
            cjVar.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bj this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        cj cjVar = this$0.f16763k;
        if (cjVar != null) {
            cjVar.onAdInstanceDidDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(bj this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        cj cjVar = this$0.f16763k;
        if (cjVar != null) {
            cjVar.onAdInstanceDidShow();
        }
    }

    public final void a() {
        u10.a(this.f16758f, new Runnable() { // from class: com.ironsource.uw
            @Override // java.lang.Runnable
            public final void run() {
                bj.a(bj.this);
            }
        }, 0L, 2, null);
    }

    public final void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f16761i.put(this.f16762j.getAdId(), this);
        if (!this.f16754b.a(this.f16753a)) {
            a(wb.f21282a.t());
            return;
        }
        j3.a.f17895a.d(new n3[0]).a(this.f16756d);
        this.f16754b.a(activity, this.f16753a);
    }

    public final void a(cj cjVar) {
        this.f16763k = cjVar;
    }

    public final void a(InterstitialAdInfo interstitialAdInfo) {
        kotlin.jvm.internal.n.f(interstitialAdInfo, "<set-?>");
        this.f16762j = interstitialAdInfo;
    }

    @Override // com.ironsource.cd
    public void a(String str) {
        a(wb.f21282a.c(new IronSourceError(0, str)));
    }

    public final InterstitialAdInfo b() {
        return this.f16762j;
    }

    public final cj c() {
        return this.f16763k;
    }

    public final boolean d() {
        boolean a10 = this.f16754b.a(this.f16753a);
        j3.a.f17895a.a(a10).a(this.f16756d);
        return a10;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidBecomeVisible() {
        j3.a.f17895a.f(new n3[0]).a(this.f16756d);
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidClick() {
        j3.a.f17895a.a().a(this.f16756d);
        this.f16758f.a(new Runnable() { // from class: com.ironsource.vw
            @Override // java.lang.Runnable
            public final void run() {
                bj.b(bj.this);
            }
        });
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidDismiss() {
        this.f16761i.remove(this.f16762j.getAdId());
        j3.a.f17895a.a(new n3[0]).a(this.f16756d);
        this.f16758f.a(new Runnable() { // from class: com.ironsource.tw
            @Override // java.lang.Runnable
            public final void run() {
                bj.c(bj.this);
            }
        });
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidReward(String str, int i10) {
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidShow() {
        ai aiVar = this.f16759g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        j3.a.f17895a.b(new m3.w(aiVar.a(ad_unit))).a(this.f16756d);
        this.f16760h.b(ad_unit);
        this.f16755c.c("onAdInstanceDidShow");
        this.f16758f.a(new Runnable() { // from class: com.ironsource.ww
            @Override // java.lang.Runnable
            public final void run() {
                bj.d(bj.this);
            }
        });
    }
}
