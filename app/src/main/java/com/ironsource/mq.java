package com.ironsource;

import android.app.Activity;
import com.ironsource.ai;
import com.ironsource.j3;
import com.ironsource.m3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class mq implements cd {

    /* renamed from: a  reason: collision with root package name */
    private rj f19289a;

    /* renamed from: b  reason: collision with root package name */
    private a1 f19290b;

    /* renamed from: c  reason: collision with root package name */
    private x4 f19291c;

    /* renamed from: d  reason: collision with root package name */
    private q3 f19292d;

    /* renamed from: e  reason: collision with root package name */
    private mn f19293e;

    /* renamed from: f  reason: collision with root package name */
    private uu f19294f;

    /* renamed from: g  reason: collision with root package name */
    private ai f19295g;

    /* renamed from: h  reason: collision with root package name */
    private ai.a f19296h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, mq> f19297i;

    /* renamed from: j  reason: collision with root package name */
    private RewardedAdInfo f19298j;

    /* renamed from: k  reason: collision with root package name */
    private nq f19299k;

    public mq(rj adInstance, a1 adNetworkShow, x4 auctionDataReporter, q3 analytics, mn networkDestroyAPI, uu threadManager, ai sessionDepthService, ai.a sessionDepthServiceEditor, Map<String, mq> retainer) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.n.f(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.n.f(retainer, "retainer");
        this.f19289a = adInstance;
        this.f19290b = adNetworkShow;
        this.f19291c = auctionDataReporter;
        this.f19292d = analytics;
        this.f19293e = networkDestroyAPI;
        this.f19294f = threadManager;
        this.f19295g = sessionDepthService;
        this.f19296h = sessionDepthServiceEditor;
        this.f19297i = retainer;
        String f10 = adInstance.f();
        kotlin.jvm.internal.n.e(f10, "adInstance.instanceId");
        String e8 = this.f19289a.e();
        kotlin.jvm.internal.n.e(e8, "adInstance.id");
        this.f19298j = new RewardedAdInfo(f10, e8);
        ad adVar = new ad();
        this.f19289a.a(adVar);
        adVar.a(this);
    }

    public /* synthetic */ mq(rj rjVar, a1 a1Var, x4 x4Var, q3 q3Var, mn mnVar, uu uuVar, ai aiVar, ai.a aVar, Map map, int i10, kotlin.jvm.internal.h hVar) {
        this(rjVar, a1Var, x4Var, q3Var, (i10 & 16) != 0 ? new nn() : mnVar, (i10 & 32) != 0 ? hg.f17676a : uuVar, (i10 & 64) != 0 ? mm.f19249r.d().k() : aiVar, (i10 & 128) != 0 ? mm.f19249r.a().e() : aVar, map);
    }

    private final void a(final IronSourceError ironSourceError) {
        this.f19297i.remove(this.f19298j.getAdId());
        j3.a.f17895a.a(new m3.j(ironSourceError.getErrorCode()), new m3.k(ironSourceError.getErrorMessage())).a(this.f19292d);
        this.f19294f.a(new Runnable() { // from class: com.ironsource.vz
            @Override // java.lang.Runnable
            public final void run() {
                mq.a(mq.this, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(mq this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        j3.d.f17917a.b().a(this$0.f19292d);
        this$0.f19293e.a(this$0.f19289a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(mq this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        nq nqVar = this$0.f19299k;
        if (nqVar != null) {
            nqVar.onRewardedAdFailedToShow(error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(mq this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        nq nqVar = this$0.f19299k;
        if (nqVar != null) {
            nqVar.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(mq this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        nq nqVar = this$0.f19299k;
        if (nqVar != null) {
            nqVar.onRewardedAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(mq this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        nq nqVar = this$0.f19299k;
        if (nqVar != null) {
            nqVar.onUserEarnedReward();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(mq this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        nq nqVar = this$0.f19299k;
        if (nqVar != null) {
            nqVar.onRewardedAdShown();
        }
    }

    public final void a() {
        u10.a(this.f19294f, new Runnable() { // from class: com.ironsource.rz
            @Override // java.lang.Runnable
            public final void run() {
                mq.a(mq.this);
            }
        }, 0L, 2, null);
    }

    public final void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f19297i.put(this.f19298j.getAdId(), this);
        if (!this.f19290b.a(this.f19289a)) {
            a(wb.f21282a.t());
            return;
        }
        j3.a.f17895a.d(new n3[0]).a(this.f19292d);
        this.f19290b.a(activity, this.f19289a);
    }

    public final void a(nq nqVar) {
        this.f19299k = nqVar;
    }

    public final void a(RewardedAdInfo rewardedAdInfo) {
        kotlin.jvm.internal.n.f(rewardedAdInfo, "<set-?>");
        this.f19298j = rewardedAdInfo;
    }

    @Override // com.ironsource.cd
    public void a(String str) {
        a(wb.f21282a.c(new IronSourceError(0, str)));
    }

    public final RewardedAdInfo b() {
        return this.f19298j;
    }

    public final nq c() {
        return this.f19299k;
    }

    public final boolean d() {
        boolean a10 = this.f19290b.a(this.f19289a);
        j3.a.f17895a.a(a10).a(this.f19292d);
        return a10;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidBecomeVisible() {
        j3.a.f17895a.f(new n3[0]).a(this.f19292d);
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidClick() {
        j3.a.f17895a.a().a(this.f19292d);
        this.f19294f.a(new Runnable() { // from class: com.ironsource.qz
            @Override // java.lang.Runnable
            public final void run() {
                mq.b(mq.this);
            }
        });
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidDismiss() {
        this.f19297i.remove(this.f19298j.getAdId());
        j3.a.f17895a.a(new n3[0]).a(this.f19292d);
        this.f19294f.a(new Runnable() { // from class: com.ironsource.sz
            @Override // java.lang.Runnable
            public final void run() {
                mq.c(mq.this);
            }
        });
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidReward(String str, int i10) {
        m3.u uVar = new m3.u("Virtual Item");
        m3.t tVar = new m3.t(1);
        m3.q qVar = new m3.q("DefaultRewardedVideo");
        String transId = IronSourceUtils.getTransId(System.currentTimeMillis(), this.f19289a.g());
        kotlin.jvm.internal.n.e(transId, "getTransId(System.curren…illis(), adInstance.name)");
        j3.a.f17895a.c(uVar, tVar, qVar, new m3.y(transId)).a(this.f19292d);
        this.f19294f.a(new Runnable() { // from class: com.ironsource.tz
            @Override // java.lang.Runnable
            public final void run() {
                mq.d(mq.this);
            }
        });
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidShow() {
        ai aiVar = this.f19295g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        j3.a.f17895a.b(new m3.w(aiVar.a(ad_unit))).a(this.f19292d);
        this.f19296h.b(ad_unit);
        this.f19291c.c("onAdInstanceDidShow");
        this.f19294f.a(new Runnable() { // from class: com.ironsource.uz
            @Override // java.lang.Runnable
            public final void run() {
                mq.e(mq.this);
            }
        });
    }
}
