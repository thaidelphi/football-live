package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.a5;
import com.ironsource.ai;
import com.ironsource.c3;
import com.ironsource.c5;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.ib;
import com.ironsource.m5;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.b;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mm;
import com.ironsource.nb;
import com.ironsource.o9;
import com.ironsource.oj;
import com.ironsource.zb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends m implements BannerSmashListener, a5 {

    /* renamed from: n  reason: collision with root package name */
    private ib f18638n;

    /* renamed from: o  reason: collision with root package name */
    private ib f18639o;

    /* renamed from: p  reason: collision with root package name */
    private String f18640p;

    /* renamed from: q  reason: collision with root package name */
    private String f18641q;

    /* renamed from: r  reason: collision with root package name */
    private c5 f18642r;

    /* renamed from: s  reason: collision with root package name */
    private com.ironsource.mediationsdk.e f18643s;

    /* renamed from: t  reason: collision with root package name */
    private ISDemandOnlyBannerLayout f18644t;

    /* renamed from: u  reason: collision with root package name */
    private final ai f18645u;

    /* renamed from: v  reason: collision with root package name */
    private final ai.a f18646v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.i f18647a;

        a(com.ironsource.mediationsdk.i iVar) {
            this.f18647a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(83500, (Object[][]) null);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("auction waterfallString = " + this.f18647a.q());
            d.this.a(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f18647a.q()}});
            d.this.f18643s.a(ContextProvider.getInstance().getApplicationContext(), this.f18647a, d.this);
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
            ironLog.verbose("load timed out state=" + d.this.k());
            d.this.a(new IronSourceError(608, "load timed out"));
        }
    }

    public d(String str, String str2, NetworkSettings networkSettings, long j10, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new c3(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f18645u = mm.S().k();
        this.f18646v = mm.M().e();
        this.f18770f = j10;
        this.f18640p = str;
        this.f18641q = str2;
        this.f18642r = new c5();
        this.f18765a.initBannerForBidding(str, str2, this.f18767c, this);
        this.f18643s = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Object[][] objArr) {
        Map<String, Object> j10 = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        j10.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }
        oj.i().a(new zb(i10, new JSONObject(j10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, ib.a(this.f18638n));
            a(this.f18642r.b(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.f18644t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j10) {
        if (ironSourceError.getErrorCode() == 606) {
            a(3306, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        } else {
            a(3300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f18774j, str);
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
                return;
            }
            a(83302, (Object[][]) null);
            this.f18639o = new ib();
            this.f18765a.initBannerForBidding(this.f18640p, this.f18641q, this.f18767c, this);
            this.f18765a.loadBannerForDemandOnlyForBidding(this.f18767c, str, this.f18644t, this);
        }
    }

    private boolean t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f18644t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(q()));
    }

    private void v() {
        this.f18771g = null;
        this.f18772h = null;
        this.f18642r = new c5();
    }

    private void w() {
        IronLog.INTERNAL.verbose();
        a(new b());
    }

    @Override // com.ironsource.s4
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Auction failed. error " + i10 + " - " + str);
        this.f18771g = null;
        this.f18772h = null;
        a(b.c.f18631g, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(621, "No available ad to load"));
        }
    }

    @Override // com.ironsource.a5
    public void a(d.a aVar, int i10, long j10, int i11, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f18771g = aVar.a();
        this.f18772h = aVar.f();
        a.C0226a c0226a = new a.C0226a(aVar.h());
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}});
        }
        a(b.c.f18632h, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
        a(b.c.f18634j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0226a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0226a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(3306, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            m5 m5Var = c0226a.get(0);
            this.f18642r.a(m5Var.b());
            this.f18642r.c(m5Var.h());
            this.f18642r.b(m5Var.g());
            String k10 = m5Var.k();
            b(k10);
            c(k10);
        }
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.f18629e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a a10 = a(aVarArr, aVar);
        if (a10 == aVar || a10 == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(b.c.f18629e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(b.c.f18629e, new Object[][]{new Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (Object[][]) null);
        if (!o()) {
            ironLog.verbose("can't load banner when isOneFlow = false");
            a(new IronSourceError(1063, "Missing configuration settings"));
            return;
        }
        this.f18644t = iSDemandOnlyBannerLayout;
        this.f18638n = new ib();
        w();
        if (this.f18643s.a()) {
            u();
            return;
        }
        ironLog.verbose("can't load the banner the auction isn't enabled");
        a(new IronSourceError(1063, "Missing server configuration"));
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, o oVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.f18629e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a a10 = a(aVarArr, aVar);
        if (a10 == aVar || a10 == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(b.c.f18629e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(b.c.f18629e, new Object[][]{new Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.f18644t = iSDemandOnlyBannerLayout;
        if (!n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (Object[][]) null);
            a(buildLoadFailedError);
            return;
        }
        try {
            d.a aVar2 = (d.a) oVar.a(new nb());
            m5 a11 = new a.C0226a(aVar2.h()).a(h());
            if (a11 == null) {
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (Object[][]) null);
                a(buildLoadFailedError2);
                return;
            }
            String k10 = a11.k();
            if (k10 == null) {
                ironLog.error("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
                return;
            }
            b(k10);
            a(aVar2.a());
            a(aVar2.f());
            a(83302, (Object[][]) null);
            this.f18642r.a(a11.b());
            this.f18638n = new ib();
            w();
            this.f18765a.initBannerForBidding(this.f18640p, this.f18641q, this.f18767c, this);
            this.f18765a.loadBannerForDemandOnlyForBidding(this.f18767c, k10, iSDemandOnlyBannerLayout, this);
        } catch (Exception e8) {
            o9.d().a(e8);
            a(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e8.getMessage()));
        }
    }

    @Override // com.ironsource.s4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.m
    public Map<String, Object> j() {
        HashMap hashMap = new HashMap();
        try {
            if (t()) {
                hashMap.put("reason", "banner is destroyed");
            } else {
                com.ironsource.mediationsdk.l.a(hashMap, this.f18644t.getSize());
            }
            AbstractAdapter abstractAdapter = this.f18765a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f18765a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.f18766b.i());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f18766b.a());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (o()) {
                hashMap.put("isOneFlow", 1);
            }
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", Integer.valueOf(this.f18766b.d()));
            if (!TextUtils.isEmpty(this.f18771g)) {
                hashMap.put("auctionId", this.f18771g);
            }
            JSONObject jSONObject = this.f18772h;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put("genericParams", this.f18772h);
            }
            if (!TextUtils.isEmpty(this.f18774j)) {
                hashMap.put("dynamicDemandSource", this.f18774j);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Instance: " + h() + " " + e8.getMessage());
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + s());
        a(3008, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f18644t.getListener().a(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + s());
        a(3304, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f18644t.getListener().b(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + s());
        a(83300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18639o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + s());
        ai aiVar = this.f18645u;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        int a10 = aiVar.a(ad_unit);
        a(b.c.f18628d, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(a10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18639o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            p();
            if (!t()) {
                this.f18644t.a(view, layoutParams);
            }
            a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(a10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18638n))}});
            this.f18646v.b(ad_unit);
            a(this.f18642r.c(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.f18644t.getListener().c(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("smash - " + s());
            a(3009, (Object[][]) null);
            a(this.f18642r.a(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.f18644t.getListener().d(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + s() + " " + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + s());
    }

    com.ironsource.mediationsdk.i q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(IronSource.AD_UNIT.BANNER);
        iVar.a(arrayList);
        iVar.d("" + i() + h());
        iVar.c(l());
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(true);
        iVar.c(true);
        iVar.a(this.f18644t.getSize());
        return iVar;
    }

    public void r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(new m.a[]{m.a.LOADED, m.a.LOAD_IN_PROGRESS, m.a.SHOW_IN_PROGRESS}, m.a.NOT_LOADED);
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        p();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f18644t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.f18644t = null;
        AbstractAdapter abstractAdapter = this.f18765a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f18767c);
        }
        a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public String s() {
        return this.f18766b.h().isMultipleInstances() ? this.f18766b.h().getProviderTypeForReflection() : this.f18766b.h().getProviderName();
    }
}
