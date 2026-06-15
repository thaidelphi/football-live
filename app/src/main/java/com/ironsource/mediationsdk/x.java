package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.c3;
import com.ironsource.h7;
import com.ironsource.ib;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mk;
import com.ironsource.o9;
import com.ironsource.oj;
import com.ironsource.qt;
import com.ironsource.vp;
import com.ironsource.y7;
import com.ironsource.zb;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x extends y implements BannerSmashListener, qt.a, y7 {

    /* renamed from: h  reason: collision with root package name */
    private k f19198h;

    /* renamed from: i  reason: collision with root package name */
    private qt f19199i;

    /* renamed from: j  reason: collision with root package name */
    private a f19200j;

    /* renamed from: k  reason: collision with root package name */
    private vp f19201k;

    /* renamed from: l  reason: collision with root package name */
    private IronSourceBannerLayout f19202l;

    /* renamed from: m  reason: collision with root package name */
    private String f19203m;

    /* renamed from: n  reason: collision with root package name */
    private JSONObject f19204n;

    /* renamed from: o  reason: collision with root package name */
    private int f19205o;

    /* renamed from: p  reason: collision with root package name */
    private String f19206p;

    /* renamed from: q  reason: collision with root package name */
    private h7 f19207q;

    /* renamed from: r  reason: collision with root package name */
    private final Object f19208r;

    /* renamed from: s  reason: collision with root package name */
    private ib f19209s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f19210t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f19211u;

    /* renamed from: v  reason: collision with root package name */
    private JSONObject f19212v;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(k kVar, vp vpVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2, boolean z10) {
        super(new c3(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f19208r = new Object();
        this.f19200j = a.NONE;
        this.f19198h = kVar;
        this.f19199i = new qt(kVar.e());
        this.f19201k = vpVar;
        this.f19226f = i10;
        this.f19203m = str;
        this.f19205o = i11;
        this.f19206p = str2;
        this.f19204n = jSONObject;
        this.f19210t = z10;
        this.f19212v = null;
        if (r()) {
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(k kVar, vp vpVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, boolean z10) {
        this(kVar, vpVar, networkSettings, abstractAdapter, i10, "", null, 0, "", z10);
    }

    private void A() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        F();
        try {
            if (this.f19221a != null) {
                if (p()) {
                    this.f19221a.initBannerForBidding(this.f19198h.a(), this.f19198h.i(), this.f19224d, this);
                } else {
                    this.f19221a.initBanners(this.f19198h.a(), this.f19198h.i(), this.f19224d, this);
                }
            }
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to init banner from " + this.f19221a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z10;
        synchronized (this.f19208r) {
            z10 = this.f19200j == a.DESTROYED;
        }
        return z10;
    }

    private boolean C() {
        boolean z10;
        synchronized (this.f19208r) {
            z10 = this.f19200j == a.LOADED;
        }
        return z10;
    }

    private void F() {
        if (this.f19221a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f19221a.setPluginData(pluginType);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to set custom params from " + this.f19221a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private void a(IronSourceError ironSourceError) {
        boolean z10 = ironSourceError.getErrorCode() == 606;
        boolean z11 = this.f19210t;
        if (z10) {
            a(z11 ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : 3306, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f19209s))}});
        } else {
            a(z11 ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : 3300, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f19209s))}});
        }
        vp vpVar = this.f19201k;
        if (vpVar != null) {
            vpVar.a(ironSourceError, this, z10);
        }
    }

    private void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "state = " + aVar.name());
        synchronized (this.f19208r) {
            this.f19200j = aVar;
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (!a(a.READY_TO_LOAD, a.LOADING)) {
            ironLog.error("wrong state - state = " + this.f19200j);
            return;
        }
        this.f19209s = new ib();
        a(this.f19210t ? IronSourceConstants.BN_INSTANCE_RELOAD : 3002);
        if (this.f19221a != null) {
            try {
                if (p()) {
                    this.f19221a.loadBannerForBidding(this.f19224d, this.f19212v, str, this.f19202l, this);
                } else {
                    this.f19221a.loadBanner(this.f19224d, this.f19212v, this.f19202l, this);
                }
            } catch (Throwable th) {
                o9.d().a(th);
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("Exception while trying to load banner from " + this.f19221a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            }
        }
    }

    private boolean a(a aVar, a aVar2) {
        boolean z10;
        synchronized (this.f19208r) {
            if (this.f19200j == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(y() + "set state from '" + this.f19200j + "' to '" + aVar2 + "'");
                z10 = true;
                this.f19200j = aVar2;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private boolean b(int i10) {
        return i10 == 3005 || i10 == 3002 || i10 == 3012 || i10 == 3015 || i10 == 3008 || i10 == 3305 || i10 == 3300 || i10 == 3306 || i10 == 3307 || i10 == 3302 || i10 == 3303 || i10 == 3304 || i10 == 3009;
    }

    private void u() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.f19211u = true;
        A();
    }

    public void D() {
        this.f19221a.onBannerViewBound(this.f19222b.h().getBannerSettings());
    }

    public void E() {
        this.f19221a.onBannerViewWillBind(this.f19222b.h().getBannerSettings());
    }

    @Override // com.ironsource.y7
    public Map<String, Object> a(AdData adData) {
        AbstractAdapter abstractAdapter;
        JSONObject a10 = adData != null ? mk.a(adData.getAdUnitData()) : null;
        if (!p() || (abstractAdapter = this.f19221a) == null) {
            return null;
        }
        return abstractAdapter.getBannerBiddingData(this.f19224d, a10);
    }

    @Override // com.ironsource.qt.a
    public void a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else if (!a(a.LOADING, aVar2)) {
            ironLog.error("unexpected state - " + this.f19200j);
            return;
        } else {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        }
        a(ironSourceError);
    }

    public void a(int i10) {
        a(i10, (Object[][]) null);
    }

    public void a(int i10, Object[][] objArr) {
        Map<String, Object> m7 = m();
        if (B()) {
            m7.put("reason", "banner is destroyed");
        } else {
            IronSourceBannerLayout ironSourceBannerLayout = this.f19202l;
            if (ironSourceBannerLayout != null) {
                l.a(m7, ironSourceBannerLayout.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f19203m)) {
            m7.put("auctionId", this.f19203m);
        }
        JSONObject jSONObject = this.f19204n;
        if (jSONObject != null && jSONObject.length() > 0) {
            m7.put("genericParams", this.f19204n);
        }
        h7 h7Var = this.f19207q;
        if (h7Var != null) {
            m7.put("placement", h7Var.getPlacementName());
        }
        if (b(i10)) {
            oj.i().a(m7, this.f19205o, this.f19206p);
        }
        m7.put("sessionDepth", Integer.valueOf(this.f19226f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    m7.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e8));
            }
        }
        oj.i().a(new zb(i10, new JSONObject(m7)));
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, h7 h7Var, String str, JSONObject jSONObject) {
        vp vpVar;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        this.f19207q = h7Var;
        this.f19212v = jSONObject;
        if (!l.c(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            vpVar = this.f19201k;
            ironSourceError = new IronSourceError(610, str2);
        } else if (this.f19221a != null) {
            this.f19202l = ironSourceBannerLayout;
            this.f19199i.a((qt.a) this);
            try {
                if (p()) {
                    a(str, this.f19212v);
                } else {
                    A();
                }
                return;
            } catch (Throwable th) {
                o9.d().a(th);
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("exception = " + th.getLocalizedMessage());
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                return;
            }
        } else {
            ironLog.verbose("mAdapter is null");
            vpVar = this.f19201k;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        }
        vpVar.a(ironSourceError, this, false);
    }

    @Override // com.ironsource.y7
    public void a(AdData adData, BiddingDataCallback biddingDataCallback) {
        a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f19221a.collectBannerBiddingData(this.f19224d, adData != null ? mk.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to collectBannerBiddingData from " + this.f19221a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.y
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.BANNER;
    }

    @Override // com.ironsource.mediationsdk.y
    public String k() {
        return "ProgBannerSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(f());
        a(3008);
        vp vpVar = this.f19201k;
        if (vpVar != null) {
            vpVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(f());
        a(3304);
        vp vpVar = this.f19201k;
        if (vpVar != null) {
            vpVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.f19199i.e();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(f());
        this.f19199i.e();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.f19210t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        a(this.f19210t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : 3005, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f19209s))}});
        vp vpVar = this.f19201k;
        if (vpVar != null) {
            vpVar.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(f());
        a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN);
        vp vpVar = this.f19201k;
        if (vpVar != null) {
            vpVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(f());
        a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN);
        vp vpVar = this.f19201k;
        if (vpVar != null) {
            vpVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (C()) {
            a(3009);
            vp vpVar = this.f19201k;
            if (vpVar != null) {
                vpVar.a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f19200j);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "Wrong State - " + this.f19200j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.f19199i.e();
        if (a(a.INIT_IN_PROGRESS, a.NONE)) {
            vp vpVar = this.f19201k;
            if (vpVar != null) {
                vpVar.a(ironSourceError, this, false);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f19200j);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(f());
        if (a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.f19211u) {
                this.f19211u = false;
            } else if (p()) {
            } else {
                if (l.c(this.f19202l)) {
                    a((String) null, this.f19212v);
                } else {
                    this.f19201k.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f19202l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.y
    public void q() {
        this.f19199i.d();
        super.q();
    }

    public void t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a(3305);
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f19221a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f19222b.h().getBannerSettings());
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to destroy banner from " + this.f19221a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    public String v() {
        return !TextUtils.isEmpty(this.f19222b.h().getAdSourceNameForEvents()) ? this.f19222b.h().getAdSourceNameForEvents() : i();
    }

    public AbstractAdapter w() {
        return this.f19221a;
    }

    public String x() {
        return this.f19203m;
    }

    public String y() {
        return String.format("%s - ", f());
    }

    public String z() {
        return this.f19222b.i();
    }
}
