package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.a5;
import com.ironsource.ai;
import com.ironsource.ar;
import com.ironsource.c3;
import com.ironsource.c5;
import com.ironsource.environment.ContextProvider;
import com.ironsource.f5;
import com.ironsource.ib;
import com.ironsource.m5;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mm;
import com.ironsource.nb;
import com.ironsource.o9;
import com.ironsource.zb;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l extends m implements n.b, RewardedVideoSmashListener, a5 {

    /* renamed from: n  reason: collision with root package name */
    private ib f18756n;

    /* renamed from: o  reason: collision with root package name */
    private ib f18757o;

    /* renamed from: p  reason: collision with root package name */
    private ISDemandOnlyRewardedVideoListener f18758p;

    /* renamed from: q  reason: collision with root package name */
    private c5 f18759q;

    /* renamed from: r  reason: collision with root package name */
    private com.ironsource.mediationsdk.e f18760r;

    /* renamed from: s  reason: collision with root package name */
    private p f18761s;

    /* renamed from: t  reason: collision with root package name */
    private final ai f18762t;

    /* renamed from: u  reason: collision with root package name */
    private final ai.a f18763u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("load timed out state=" + l.this.k());
            l.this.a(new IronSourceError(1055, "load timed out"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new c3(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f18761s = new p.b();
        this.f18762t = mm.S().k();
        this.f18763u = mm.M().e();
        this.f18758p = iSDemandOnlyRewardedVideoListener;
        this.f18770f = j10;
        this.f18760r = eVar;
        this.f18765a.initRewardedVideoForDemandOnly(str, str2, this.f18767c, this);
    }

    private void a(int i10, Object[][] objArr) {
        Map<String, Object> j10 = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    j10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e8));
            }
        }
        ar.i().a(new zb(i10, new JSONObject(j10)));
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(1213, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f18774j, str);
    }

    private void c(o oVar) {
        this.f18756n = new ib();
        a(s());
        if (!n()) {
            a(new IronSourceError(j.a.f18725k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new nb());
            m5 a10 = new a.C0226a(aVar.h()).a(h());
            if (a10 == null) {
                IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(j.a.f18725k, (Object[][]) null);
                a(buildLoadFailedError);
                return;
            }
            String k10 = a10.k();
            if (k10 == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            b(k10);
            a(aVar.a());
            a(aVar.f());
            a(81002, (Object[][]) null);
            this.f18759q.a(a10.b());
            this.f18757o = new ib();
            this.f18765a.loadRewardedVideoForBidding(this.f18767c, null, k10, this);
        } catch (Exception e8) {
            o9.d().a(e8);
            a(ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e8.getMessage()));
        }
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            a(81002, (Object[][]) null);
            this.f18765a.loadRewardedVideoForBidding(this.f18767c, null, str, this);
        }
    }

    private IronSourceError q() {
        return a(m.a.SHOW_IN_PROGRESS) ? new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private com.ironsource.mediationsdk.i r() {
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f18777m);
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(true);
        iVar.c(true);
        iVar.d(i() + h());
        iVar.c(l());
        iVar.a(this.f18762t.a(this.f18777m));
        f5 f5Var = new f5(h(), false);
        f5Var.a(this.f18761s.value());
        Map<String, Object> rewardedVideoBiddingData = this.f18765a.getRewardedVideoBiddingData(this.f18767c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            f5Var.b(rewardedVideoBiddingData);
        }
        iVar.a(f5Var);
        return iVar;
    }

    private TimerTask s() {
        return new a();
    }

    private void t() {
        this.f18757o = new ib();
        this.f18765a.loadRewardedVideo(this.f18767c, null, this);
    }

    private void u() {
        if (!this.f18760r.a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(81500, (Object[][]) null);
        com.ironsource.mediationsdk.i r10 = r();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + r10.q());
        a(81510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, r10.q()}});
        this.f18760r.a(ContextProvider.getInstance().getApplicationContext(), r10, this);
    }

    private void v() {
        this.f18771g = null;
        this.f18772h = null;
        this.f18774j = null;
        this.f18759q = new c5();
    }

    private void w() {
        this.f18756n = new ib();
        a(s());
        if (n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(j.a.f18725k, (Object[][]) null);
            a(buildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.ironsource.s4
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Auction failed. error " + i10 + " - " + str);
        this.f18771g = null;
        this.f18772h = null;
        a(81300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(j.a.f18724j, "No available ad to load"));
        }
    }

    @Override // com.ironsource.a5
    public void a(d.a aVar, int i10, long j10, int i11, String str) {
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f18771g = aVar.a();
        this.f18772h = aVar.f();
        this.f18761s = aVar.a(l());
        a.C0226a c0226a = new a.C0226a(aVar.h());
        if (c0226a.isEmpty()) {
            str2 = "";
        } else {
            m5 m5Var = c0226a.get(0);
            this.f18759q.a(m5Var.b());
            this.f18759q.c(m5Var.h());
            this.f18759q.b(m5Var.g());
            str2 = m5Var.k();
            b(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(81301, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        a(81302, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0226a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (!c0226a.isEmpty()) {
                c(str2);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
            ironLog.error("rewardedVideo - empty waterfall");
            a(ironSourceError);
        }
    }

    void a(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, ib.a(this.f18756n));
            a(this.f18759q.b(), IronSourceUtils.getCurrentMethodName());
            this.f18758p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
        }
    }

    @Override // com.ironsource.s4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean z10 = false;
        if (!a(m.a.LOADED)) {
            a(1211, (Object[][]) null);
            return false;
        }
        try {
            z10 = this.f18765a.isRewardedVideoAvailable(this.f18767c);
            a(z10 ? 1210 : 1211, (Object[][]) null);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception=" + e8.getMessage());
        }
        return z10;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void b(o oVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a10 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a10 != aVar && a10 != aVar2) {
            a(new IronSourceError(1053, a10 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(1001, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a10 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a10 != aVar && a10 != aVar2) {
            this.f18758p.onRewardedVideoAdLoadFailed(l(), new IronSourceError(1053, a10 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(1001, (Object[][]) null);
        w();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void e() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("instanceName = " + h() + ", state=" + k());
        a(1201, (Object[][]) null);
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            this.f18765a.showRewardedVideo(this.f18767c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h());
        a(1006, new Object[0]);
        this.f18758p.onRewardedVideoAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h());
        a(1203, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f18762t.a(this.f18777m))}});
        this.f18763u.b(this.f18777m);
        this.f18758p.onRewardedVideoAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h());
        a(1005, new Object[0]);
        a(this.f18759q.a(), IronSourceUtils.getCurrentMethodName());
        this.f18758p.onRewardedVideoAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h());
        Map<String, Object> j10 = j();
        if (!TextUtils.isEmpty(com.ironsource.mediationsdk.p.m().l())) {
            j10.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, com.ironsource.mediationsdk.p.m().l());
        }
        if (com.ironsource.mediationsdk.p.m().s() != null) {
            for (String str : com.ironsource.mediationsdk.p.m().s().keySet()) {
                j10.put("custom_" + str, com.ironsource.mediationsdk.p.m().s().get(str));
            }
        }
        Placement a10 = com.ironsource.mediationsdk.p.m().h().c().f().a();
        if (a10 != null) {
            j10.put("placement", a10.getPlacementName());
            j10.put(IronSourceConstants.EVENTS_REWARD_NAME, a10.getRewardName());
            j10.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(a10.getRewardAmount()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        zb zbVar = new zb(1010, new JSONObject(j10));
        zbVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(zbVar.d(), h()));
        ar.i().a(zbVar);
        this.f18758p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(1202, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f18758p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h());
        a(1206, new Object[0]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(j.c.f18746d, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18757o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h() + " state=" + k());
        p();
        a(j.c.f18745c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18757o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(1002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18756n))}});
            a(this.f18759q.c(), IronSourceUtils.getCurrentMethodName());
            this.f18758p.onRewardedVideoAdLoadSuccess(l());
        }
    }
}
