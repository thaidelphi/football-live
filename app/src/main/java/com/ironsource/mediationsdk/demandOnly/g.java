package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.a5;
import com.ironsource.ai;
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
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mm;
import com.ironsource.nb;
import com.ironsource.o9;
import com.ironsource.oj;
import com.ironsource.zb;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends m implements n.a, InterstitialSmashListener, a5 {

    /* renamed from: n  reason: collision with root package name */
    private ib f18691n;

    /* renamed from: o  reason: collision with root package name */
    private ib f18692o;

    /* renamed from: p  reason: collision with root package name */
    private ISDemandOnlyInterstitialListener f18693p;

    /* renamed from: q  reason: collision with root package name */
    private c5 f18694q;

    /* renamed from: r  reason: collision with root package name */
    private com.ironsource.mediationsdk.e f18695r;

    /* renamed from: s  reason: collision with root package name */
    private p f18696s;

    /* renamed from: t  reason: collision with root package name */
    private final ai f18697t;

    /* renamed from: u  reason: collision with root package name */
    private final ai.a f18698u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    public g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new c3(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f18696s = new p.b();
        this.f18697t = mm.S().k();
        this.f18698u = mm.M().e();
        this.f18693p = iSDemandOnlyInterstitialListener;
        this.f18770f = j10;
        this.f18695r = eVar;
        this.f18765a.initInterstitial(str, str2, this.f18767c, this);
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
        oj.i().a(new zb(i10, new JSONObject(j10)));
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 1158) {
            a(2213, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(2200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f18774j, str);
    }

    private void c(o oVar) {
        this.f18691n = new ib();
        a(new a());
        if (!n()) {
            a(new IronSourceError(2303, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new nb());
            m5 a10 = new a.C0226a(aVar.h()).a(h());
            if (a10 == null) {
                IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(2303, (Object[][]) null);
                a(buildLoadFailedError);
                return;
            }
            String k10 = a10.k();
            if (k10 == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(e.a.f18658i, "No available ad to load"));
                return;
            }
            b(k10);
            a(aVar.a());
            a(aVar.f());
            a(82002, (Object[][]) null);
            this.f18694q.a(a10.b());
            this.f18692o = new ib();
            this.f18765a.loadInterstitialForBidding(this.f18767c, null, k10, this);
        } catch (Exception e8) {
            o9.d().a(e8);
            a(ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e8.getMessage()));
        }
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(e.a.f18658i, "No available ad to load"));
                return;
            }
            a(82002, (Object[][]) null);
            this.f18765a.loadInterstitialForBidding(this.f18767c, null, str, this);
        }
    }

    private com.ironsource.mediationsdk.i q() {
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f18777m);
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(true);
        iVar.c(true);
        iVar.d(i() + h());
        iVar.c(l());
        iVar.a(this.f18697t.a(this.f18777m));
        f5 f5Var = new f5(h(), false);
        f5Var.a(this.f18696s.value());
        Map<String, Object> interstitialBiddingData = this.f18765a.getInterstitialBiddingData(this.f18767c, new JSONObject());
        if (interstitialBiddingData != null) {
            f5Var.b(interstitialBiddingData);
        }
        iVar.a(f5Var);
        return iVar;
    }

    private void r() {
        this.f18692o = new ib();
        this.f18765a.loadInterstitial(this.f18767c, null, this);
    }

    private void s() {
        if (!this.f18695r.a()) {
            IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(82500, (Object[][]) null);
        com.ironsource.mediationsdk.i q10 = q();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + q10.q());
        a(82510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, q10.q()}});
        this.f18695r.a(ContextProvider.getInstance().getApplicationContext(), q10, this);
    }

    private void t() {
        this.f18771g = null;
        this.f18772h = null;
        this.f18774j = null;
        this.f18694q = new c5();
    }

    private void u() {
        this.f18691n = new ib();
        a(new b());
        if (n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            a(2303, (Object[][]) null);
            a(buildLoadFailedError);
        } else if (o()) {
            s();
        } else {
            r();
        }
    }

    @Override // com.ironsource.s4
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error " + i10 + " - " + str);
        this.f18771g = null;
        this.f18772h = null;
        a(82300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(e.a.f18659j, "No available ad to load"));
        }
    }

    @Override // com.ironsource.a5
    public void a(d.a aVar, int i10, long j10, int i11, String str) {
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f18771g = aVar.a();
        this.f18772h = aVar.f();
        this.f18696s = aVar.a(l());
        a.C0226a c0226a = new a.C0226a(aVar.h());
        if (c0226a.isEmpty()) {
            str2 = "";
        } else {
            m5 m5Var = c0226a.get(0);
            this.f18694q.a(m5Var.b());
            this.f18694q.c(m5Var.h());
            this.f18694q.b(m5Var.g());
            str2 = m5Var.k();
            b(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(82301, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        a(82302, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0226a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (!c0226a.isEmpty()) {
                c(str2);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1158, "There is no available ad to load");
            ironLog.error("interstitial - empty waterfall");
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void a(o oVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a10 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a10 != aVar && a10 != aVar2) {
            a(new IronSourceError(1050, a10 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(2002, (Object[][]) null);
        c(oVar);
    }

    void a(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, ib.a(this.f18691n));
            a(this.f18694q.b(), IronSourceUtils.getCurrentMethodName());
            this.f18693p.onInterstitialAdLoadFailed(l(), ironSourceError);
        }
    }

    @Override // com.ironsource.s4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public boolean a() {
        boolean z10 = false;
        if (!a(m.a.LOADED)) {
            a(2212, (Object[][]) null);
            return false;
        }
        try {
            z10 = this.f18765a.isInterstitialReady(this.f18767c);
            a(z10 ? 2211 : 2212, (Object[][]) null);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception=" + e8.getMessage());
        }
        return z10;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("instanceName = " + h() + ", state=" + k());
        a(2201, (Object[][]) null);
        m.a aVar = m.a.LOADED;
        m.a aVar2 = m.a.SHOW_IN_PROGRESS;
        if (a(aVar, aVar2)) {
            this.f18765a.showInterstitial(this.f18767c, this);
        } else {
            onInterstitialAdShowFailed(a(aVar2) ? new IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new IronSourceError(1066, "showInterstitial error: no available ads to show"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void c() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a10 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a10 != aVar && a10 != aVar2) {
            this.f18693p.onInterstitialAdLoadFailed(l(), new IronSourceError(1050, a10 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(2002, (Object[][]) null);
        u();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h());
        a(2006, new Object[0]);
        this.f18693p.onInterstitialAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h());
        a(2204, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f18697t.a(this.f18777m))}});
        this.f18698u.b(this.f18777m);
        this.f18693p.onInterstitialAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + h() + " state=" + k());
        a(e.c.f18681d, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18692o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h());
        a(2005, new Object[0]);
        a(this.f18694q.a(), IronSourceUtils.getCurrentMethodName());
        this.f18693p.onInterstitialAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h() + " state=" + k());
        p();
        a(e.c.f18680c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18692o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(2003, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18691n))}});
            a(this.f18694q.c(), IronSourceUtils.getCurrentMethodName());
            this.f18693p.onInterstitialAdReady(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(2203, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f18693p.onInterstitialAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("instance name= " + h());
        a(2210, new Object[0]);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }
}
