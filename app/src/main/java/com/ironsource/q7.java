package com.ironsource;

import android.text.TextUtils;
import com.ironsource.e2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.qt;
import com.ironsource.r2;
import com.ironsource.zh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class q7<Listener extends r2> implements NetworkInitializationListener, qt.a, d2, AdapterAdListener, zh.b {

    /* renamed from: a  reason: collision with root package name */
    protected m1 f19841a;

    /* renamed from: b  reason: collision with root package name */
    protected Listener f19842b;

    /* renamed from: c  reason: collision with root package name */
    protected BaseAdAdapter<?, AdapterAdListener> f19843c;

    /* renamed from: d  reason: collision with root package name */
    protected e2 f19844d;

    /* renamed from: e  reason: collision with root package name */
    protected h f19845e;

    /* renamed from: g  reason: collision with root package name */
    protected Placement f19847g;

    /* renamed from: h  reason: collision with root package name */
    protected c3 f19848h;

    /* renamed from: i  reason: collision with root package name */
    protected JSONObject f19849i;

    /* renamed from: j  reason: collision with root package name */
    protected String f19850j;

    /* renamed from: k  reason: collision with root package name */
    protected AdData f19851k;

    /* renamed from: l  reason: collision with root package name */
    protected Long f19852l;

    /* renamed from: m  reason: collision with root package name */
    protected ib f19853m;

    /* renamed from: o  reason: collision with root package name */
    private final m5 f19855o;

    /* renamed from: p  reason: collision with root package name */
    private final tp f19856p;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f19846f = new AtomicBoolean(false);

    /* renamed from: n  reason: collision with root package name */
    private qt f19854n = new qt(TimeUnit.SECONDS.toMillis(s()));

    /* renamed from: q  reason: collision with root package name */
    protected final Object f19857q = new Object();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends hr {
        a() {
        }

        @Override // com.ironsource.hr
        public void a() {
            q7.this.L();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b extends hr {
        b() {
        }

        @Override // com.ironsource.hr
        public void a() {
            q7.this.K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f19860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f19861b;

        c(int i10, String str) {
            this.f19860a = i10;
            this.f19861b = str;
        }

        @Override // com.ironsource.hr
        public void a() {
            q7.this.a(this.f19860a, this.f19861b);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d extends hr {
        d() {
        }

        @Override // com.ironsource.hr
        public void a() {
            q7.this.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdapterErrorType f19864a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f19865b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f19866c;

        e(AdapterErrorType adapterErrorType, int i10, String str) {
            this.f19864a = adapterErrorType;
            this.f19865b = i10;
            this.f19866c = str;
        }

        @Override // com.ironsource.hr
        public void a() {
            q7.this.a(this.f19864a, this.f19865b, this.f19866c);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class f extends hr {
        f() {
        }

        @Override // com.ironsource.hr
        public void a() {
            q7.this.J();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class g extends hr {
        g() {
        }

        @Override // com.ironsource.hr
        public void a() {
            q7.this.H();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q7(tp tpVar, m1 m1Var, BaseAdAdapter<?, ?> baseAdAdapter, c3 c3Var, m5 m5Var, Listener listener) {
        this.f19841a = m1Var;
        this.f19842b = listener;
        this.f19844d = new e2(m1Var.a(), e2.b.PROVIDER, this);
        this.f19848h = c3Var;
        this.f19849i = c3Var.c();
        this.f19843c = baseAdAdapter;
        this.f19855o = m5Var;
        this.f19856p = tpVar;
        a(h.NONE);
    }

    private boolean D() {
        return this.f19845e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.f19854n.a((qt.a) this);
            G();
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.f19845e;
            IronLog.INTERNAL.error(a(str));
            e2 e2Var = this.f19844d;
            if (e2Var != null) {
                e2Var.f17171k.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        e2 e2Var = this.f19844d;
        if (e2Var != null) {
            e2Var.f17170j.a(j());
        }
        this.f19842b.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean z10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        qt qtVar = this.f19854n;
        if (qtVar != null) {
            qtVar.e();
        }
        synchronized (this.f19857q) {
            h hVar = this.f19845e;
            z10 = false;
            if (hVar == h.LOADING) {
                long a10 = ib.a(this.f19853m);
                ironLog.verbose(a("Load duration = " + a10));
                if (this.f19844d != null) {
                    if (v()) {
                        this.f19844d.f17167g.a(a10);
                    } else {
                        this.f19844d.f17167g.a(a10, false);
                    }
                }
                a(h.LOADED);
                z10 = O();
            } else if (hVar != h.FAILED) {
                ironLog.error(a(String.format("unexpected load success for %s, state - %s", k(), this.f19845e)));
                String format = String.format("unexpected load success, state - %s", this.f19845e);
                if (this.f19844d != null) {
                    if (v()) {
                        this.f19844d.f17171k.r(format);
                    } else {
                        this.f19844d.f17171k.o(format);
                    }
                }
            }
        }
        if (z10) {
            this.f19842b.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        e2 e2Var = this.f19844d;
        if (e2Var != null) {
            e2Var.f17170j.g(j());
        }
        this.f19842b.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            qt qtVar = this.f19854n;
            if (qtVar != null) {
                qtVar.e();
            }
            a(h.READY_TO_LOAD);
            F();
        } else if (this.f19845e == h.FAILED) {
        } else {
            ironLog.error(a(String.format("unexpected init success for %s, state - %s", k(), this.f19845e)));
            if (this.f19844d != null) {
                this.f19844d.f17171k.m(String.format("unexpected init success, state - %s", this.f19845e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long a10 = ib.a(this.f19853m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a10 + ", state = " + this.f19845e + ", isBidder = " + w()));
        synchronized (this.f19857q) {
            if (!z()) {
                ironLog.error(a(String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.f19845e, Integer.valueOf((int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT))));
                if (this.f19844d != null) {
                    this.f19844d.f17171k.t(String.format("unexpected timeout, state - %s, error - %s", this.f19845e, Integer.valueOf((int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)));
                }
                return;
            }
            a(h.FAILED);
            e2 e2Var = this.f19844d;
            if (e2Var != null) {
                e2Var.f17167g.a(a10, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
                this.f19844d.f17167g.a(a10, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
            }
            this.f19842b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        if (D()) {
            qt qtVar = this.f19854n;
            if (qtVar != null) {
                qtVar.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, ib.a(this.f19853m));
            this.f19842b.a(new IronSourceError(i10, str), this);
        } else if (this.f19845e == h.FAILED) {
        } else {
            ironLog.error(a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.f19845e, Integer.valueOf(i10), str)));
            if (this.f19844d != null) {
                this.f19844d.f17171k.l(String.format("unexpected init failed, state - %s, error - %s, %s", this.f19845e, Integer.valueOf(i10), str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdapterErrorType adapterErrorType, int i10, String str) {
        long a10 = ib.a(this.f19853m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a10 + ", error = " + i10 + ", " + str));
        qt qtVar = this.f19854n;
        if (qtVar != null) {
            qtVar.e();
        }
        synchronized (this.f19857q) {
            h hVar = this.f19845e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i10, str, a10);
                a(h.FAILED);
                this.f19842b.a(new IronSourceError(i10, str), this);
            } else if (hVar == h.FAILED) {
                a(adapterErrorType, i10, str, a10);
            } else if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.f19852l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a(String.format("ad expired for %s, state = %s", this.f19848h.f(), this.f19845e)));
                e2 e2Var = this.f19844d;
                if (e2Var != null) {
                    e2Var.f17171k.a(String.format("ad expired, state = %s", this.f19845e));
                }
            } else {
                ironLog.error(a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.f19845e, Integer.valueOf(i10), str)));
                String format = String.format("unexpected load failed, state - %s, error - %s, %s", this.f19845e, Integer.valueOf(i10), str);
                if (this.f19844d != null) {
                    if (v()) {
                        this.f19844d.f17171k.q(format);
                    } else if (this.f19841a.a() != IronSource.AD_UNIT.REWARDED_VIDEO || this.f19845e != h.SHOWING) {
                        this.f19844d.f17171k.n(format);
                    }
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (this.f19844d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.f19844d.f17167g.b(j10, i10);
                } else {
                    this.f19844d.f17167g.a(j10, i10);
                }
            } else if (TextUtils.isEmpty(str)) {
                this.f19844d.f17167g.a(j10, i10, false);
            } else if (v()) {
                this.f19844d.f17167g.a(j10, i10, str);
            } else {
                this.f19844d.f17167g.a(j10, i10, str, false);
            }
        }
    }

    private boolean b(b2 b2Var) {
        return new ArrayList(Arrays.asList(b2.LOAD_AD, b2.LOAD_AD_SUCCESS, b2.LOAD_AD_FAILED, b2.LOAD_AD_FAILED_WITH_REASON, b2.LOAD_AD_NO_FILL, b2.RELOAD_AD, b2.RELOAD_AD_SUCCESS, b2.RELOAD_AD_FAILED_WITH_REASON, b2.RELOAD_AD_NO_FILL, b2.DESTROY_AD, b2.AD_PRESENT_SCREEN, b2.AD_DISMISS_SCREEN, b2.AD_LEFT_APPLICATION, b2.AD_OPENED, b2.AD_CLOSED, b2.SHOW_AD, b2.SHOW_AD_FAILED, b2.AD_CLICKED, b2.AD_REWARDED)).contains(b2Var);
    }

    private int o() {
        return 1;
    }

    private int s() {
        m5 m5Var = this.f19855o;
        if (m5Var == null) {
            return this.f19841a.f();
        }
        Integer f10 = m5Var.f();
        int f11 = (f10 == null || f10.intValue() <= 0) ? this.f19841a.f() : f10.intValue();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load timeout for " + this.f19855o.c() + " - " + f11 + " seconds"));
        return f11;
    }

    public AtomicBoolean A() {
        return this.f19846f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.f19845e == h.SHOWING;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        m5 i10 = i();
        String k10 = i10.k();
        Map<String, Object> a10 = mk.a(i10.a());
        a10.put("adUnit", this.f19841a.a());
        b(k10);
        try {
            boolean z10 = false;
            if (v()) {
                this.f19844d.f17167g.a();
            } else {
                this.f19844d.f17167g.a(false);
            }
            this.f19852l = null;
            this.f19853m = new ib();
            this.f19851k = a(k10, a10);
            synchronized (this.f19857q) {
                if (this.f19845e != h.NONE) {
                    z10 = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z10) {
                String str = "loadAd - incorrect state while loading, state = " + this.f19845e;
                ironLog.error(a(str));
                this.f19844d.f17171k.g(str);
                onInitFailed(a2.c(this.f19841a.a()), str);
                return;
            }
            this.f19854n.a((qt.a) this);
            ?? networkAdapter = this.f19843c.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.f19851k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(a2.c(this.f19841a.a()), str2);
        } catch (Throwable th) {
            o9.d().a(th);
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            e2 e2Var = this.f19844d;
            if (e2Var != null) {
                e2Var.f17171k.g(str3);
            }
            onInitFailed(a2.c(this.f19841a.a()), str3);
        }
    }

    protected void G() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f19843c;
        if (baseAdAdapter instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) baseAdAdapter).loadAd(this.f19851k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    public void M() {
        synchronized (this) {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f19843c;
            if (baseAdAdapter != null) {
                try {
                    baseAdAdapter.releaseMemory();
                    this.f19843c = null;
                } catch (Exception e8) {
                    o9.d().a(e8);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.f19848h.f() + " - " + e8.getMessage() + " - state = " + this.f19845e;
                    IronLog.INTERNAL.error(a(str));
                    e2 e2Var = this.f19844d;
                    if (e2Var != null) {
                        e2Var.f17171k.g(str);
                    }
                }
            }
            e2 e2Var2 = this.f19844d;
            if (e2Var2 != null) {
                e2Var2.f();
                this.f19844d = null;
            }
            qt qtVar = this.f19854n;
            if (qtVar != null) {
                qtVar.d();
                this.f19854n = null;
            }
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        e2 e2Var = this.f19844d;
        if (e2Var != null) {
            e2Var.f17170j.a();
        }
    }

    protected boolean O() {
        return true;
    }

    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(String str) {
        String str2 = this.f19841a.a().name() + " - " + k() + " - state = " + this.f19845e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public Map<String, Object> a(b2 b2Var) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f19843c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f19843c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        hashMap.put("spId", this.f19848h.i());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f19848h.a());
        hashMap.put("instanceType", Integer.valueOf(l()));
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.f19850j)) {
            hashMap.put("dynamicDemandSource", this.f19850j);
        }
        hashMap.put("sessionDepth", r());
        if (this.f19841a.e() != null && this.f19841a.e().length() > 0) {
            hashMap.put("genericParams", this.f19841a.e());
        }
        if (!TextUtils.isEmpty(this.f19841a.c())) {
            hashMap.put("auctionId", this.f19841a.c());
        }
        if (b(b2Var)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f19841a.d()));
            if (!TextUtils.isEmpty(this.f19841a.b())) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f19841a.b());
            }
        }
        if (!TextUtils.isEmpty(this.f19841a.g().getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f19841a.g().getCustomNetwork());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f19841a.i());
        return map;
    }

    @Override // com.ironsource.qt.a
    public void a() {
        if (this.f19856p.c()) {
            this.f19856p.a(new a());
        } else {
            L();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.f19845e = hVar;
    }

    public void a(boolean z10) {
        this.f19846f.set(z10);
    }

    @Override // com.ironsource.zh.b
    public int b() {
        return this.f19848h.e();
    }

    public void b(String str) {
        this.f19850j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.zh.b
    public String c() {
        return this.f19848h.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d() {
        return a((String) null);
    }

    public Long e() {
        return this.f19852l;
    }

    public AdInfo f() {
        return new AdInfo(this.f19855o.a(j()), this.f19855o.d());
    }

    public IronSource.AD_UNIT g() {
        return this.f19841a.a();
    }

    public String h() {
        return this.f19841a.c();
    }

    public m5 i() {
        return this.f19855o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String j() {
        Placement placement = this.f19847g;
        return placement == null ? "" : placement.getPlacementName();
    }

    public String k() {
        return String.format("%s %s", c(), Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.f19848h.d();
    }

    public String m() {
        return this.f19848h.h().isMultipleInstances() ? this.f19848h.h().getProviderTypeForReflection() : this.f19848h.f();
    }

    public String n() {
        return this.f19848h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.f19856p.c()) {
            this.f19856p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str) {
        if (this.f19856p.c()) {
            this.f19856p.a(new e(adapterErrorType, i10, str));
        } else {
            a(adapterErrorType, i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.f19856p.c()) {
            this.f19856p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.f19856p.c()) {
            this.f19856p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i10, String str) {
        if (this.f19856p.c()) {
            this.f19856p.a(new c(i10, str));
        } else {
            a(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.f19856p.c()) {
            this.f19856p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.f19841a.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, Object> q() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(mk.a(this.f19849i));
        return hashMap;
    }

    public Integer r() {
        m1 m1Var = this.f19841a;
        if (m1Var != null) {
            return Integer.valueOf(m1Var.h());
        }
        return null;
    }

    public h t() {
        return this.f19845e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public tp u() {
        return this.f19856p;
    }

    protected boolean v() {
        return false;
    }

    public boolean w() {
        return this.f19848h.j();
    }

    public boolean x() {
        return this.f19845e == h.FAILED;
    }

    public boolean y() {
        return this.f19845e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.f19845e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }
}
