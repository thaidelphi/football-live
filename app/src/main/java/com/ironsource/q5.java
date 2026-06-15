package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.q4;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class q5 {

    /* renamed from: a  reason: collision with root package name */
    private final w2 f19833a;

    /* renamed from: b  reason: collision with root package name */
    private final w1 f19834b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ironsource.mediationsdk.e f19835c;

    /* renamed from: d  reason: collision with root package name */
    private final d5 f19836d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements q4.d {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r5 f19838b;

        a(r5 r5Var) {
            this.f19838b = r5Var;
        }

        @Override // com.ironsource.q4.d
        public void a(q4 auction) {
            kotlin.jvm.internal.n.f(auction, "auction");
            q5.this.b(auction, this.f19838b);
        }

        @Override // com.ironsource.q4.d
        public void a(q4 auction, String error) {
            kotlin.jvm.internal.n.f(auction, "auction");
            kotlin.jvm.internal.n.f(error, "error");
            q5.this.b(auction, this.f19838b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements s4 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r5 f19839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q4 f19840b;

        b(r5 r5Var, q4 q4Var) {
            this.f19839a = r5Var;
            this.f19840b = q4Var;
        }

        @Override // com.ironsource.s4
        public void a(int i10, String errorMessage, int i11, String auctionFallback, long j10) {
            kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
            kotlin.jvm.internal.n.f(auctionFallback, "auctionFallback");
            this.f19839a.a(i10, errorMessage, i11, auctionFallback, j10);
        }

        @Override // com.ironsource.s4
        public void a(List<m5> newWaterfall, String auctionId, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str) {
            kotlin.jvm.internal.n.f(newWaterfall, "newWaterfall");
            kotlin.jvm.internal.n.f(auctionId, "auctionId");
            this.f19839a.a(newWaterfall, this.f19840b.c(), auctionId, m5Var, jSONObject, jSONObject2, i10, j10, i11, str);
        }
    }

    public q5(w2 adTools, w1 adUnitData) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f19833a = adTools;
        this.f19834b = adUnitData;
        o5 e8 = adUnitData.e();
        String sessionId = IronSourceUtils.getSessionId();
        kotlin.jvm.internal.n.e(sessionId, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(e8, sessionId));
        this.f19835c = eVar;
        this.f19836d = new d5(adTools, eVar);
    }

    private final com.ironsource.mediationsdk.i a(q4 q4Var, int i10) {
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f19834b.b().a());
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(q4Var.d().a());
        iVar.a(q4Var.d().b());
        iVar.a(this.f19833a.h());
        iVar.a(i10);
        iVar.a(this.f19833a.l());
        eu f10 = this.f19834b.b().f();
        iVar.e(f10 != null ? f10.b() : false);
        g5 i11 = this.f19833a.i();
        if (i11 != null) {
            i11.a(iVar);
        }
        return iVar;
    }

    private final String a() {
        return o1.a(this.f19833a, (String) null, (String) null, 2, (Object) null);
    }

    private final String a(String str) {
        return o1.a(this.f19833a, str, (String) null, 2, (Object) null);
    }

    private final void a(q4 q4Var, r5 r5Var) {
        if (q4Var.f()) {
            q4Var.a(new a(r5Var));
        } else {
            b(q4Var, r5Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(q4 q4Var, r5 r5Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((Object) q4Var.d().c())));
        if (!q4Var.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.f19833a.e().b().a(1005, "No candidates available for auctioning");
            r5Var.a(a2.e(this.f19834b.b().a()), "no available ad to load");
            return;
        }
        this.f19833a.e().b().b(q4Var.d().c().toString());
        int f10 = this.f19833a.f();
        this.f19835c.a(ContextProvider.getInstance().getApplicationContext(), a(q4Var, f10), new b(r5Var, q4Var));
    }

    public void a(r5 completionListener) {
        kotlin.jvm.internal.n.f(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.f19833a.e().b().a();
        a(new q4(this.f19833a, this.f19834b), completionListener);
    }

    public final d5 b() {
        return this.f19836d;
    }
}
