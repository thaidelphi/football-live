package com.ironsource;

import com.ironsource.ai;
import com.ironsource.e2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class w2 extends o1 {

    /* renamed from: g  reason: collision with root package name */
    private final o1 f21242g;

    /* renamed from: h  reason: collision with root package name */
    private final s2 f21243h;

    /* renamed from: i  reason: collision with root package name */
    private g5 f21244i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(o1 adTools, w1 adUnitData, e2.b level) {
        super(adTools, level);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(level, "level");
        this.f21242g = adTools;
        s2 a10 = vt.a(adUnitData, adUnitData.e().c());
        kotlin.jvm.internal.n.e(a10, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.f21243h = a10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(w2 adUnitTools, e2.b level) {
        super(adUnitTools, level);
        kotlin.jvm.internal.n.f(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.n.f(level, "level");
        this.f21242g = adUnitTools.f21242g;
        this.f21243h = adUnitTools.f21243h;
        this.f21244i = adUnitTools.f21244i;
    }

    public final BaseAdAdapter<?, ?> a(b0 instanceData) {
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(instanceData.u(), instanceData.h(), instanceData.i().b().b());
    }

    public final BaseAdAdapter<?, ?> a(NetworkSettings providerSettings, IronSource.AD_UNIT adFormat, UUID adId) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(adId, "adId");
        return com.ironsource.mediationsdk.c.b().a(providerSettings, adFormat, adId);
    }

    public final String a(long j10, String instanceName) {
        kotlin.jvm.internal.n.f(instanceName, "instanceName");
        String transId = IronSourceUtils.getTransId(j10, instanceName);
        kotlin.jvm.internal.n.e(transId, "getTransId(timeStamp, instanceName)");
        return transId;
    }

    public final void a(g5 g5Var) {
        this.f21244i = g5Var;
    }

    public final void c(hr task) {
        kotlin.jvm.internal.n.f(task, "task");
        wt.a(wt.f21318a, task, 0L, 2, null);
    }

    public final String e(String serverData) {
        kotlin.jvm.internal.n.f(serverData, "serverData");
        String c10 = com.ironsource.mediationsdk.d.b().c(serverData);
        kotlin.jvm.internal.n.e(c10, "getInstance().getDynamic…romServerData(serverData)");
        return c10;
    }

    public final s2 h() {
        return this.f21243h;
    }

    public final g5 i() {
        return this.f21244i;
    }

    public final String j() {
        return com.ironsource.mediationsdk.p.m().l();
    }

    public final Map<String, String> k() {
        return com.ironsource.mediationsdk.p.m().s();
    }

    public final IronSourceSegment l() {
        return vt.a();
    }

    public final ai.a m() {
        return mm.f19249r.a().e();
    }
}
