package com.ironsource;

import com.ironsource.a0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.q1;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class a0 implements AdapterAdListener {

    /* renamed from: a  reason: collision with root package name */
    private final w2 f16213a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f16214b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f16215c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<e0> f16216d;

    /* renamed from: e  reason: collision with root package name */
    private f0 f16217e;

    /* renamed from: f  reason: collision with root package name */
    private final BaseAdAdapter<?, ?> f16218f;

    /* renamed from: g  reason: collision with root package name */
    private ib f16219g;

    /* renamed from: h  reason: collision with root package name */
    private hr f16220h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16221i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16222j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f16223k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f16224l;

    /* renamed from: m  reason: collision with root package name */
    private final AdData f16225m;

    /* renamed from: n  reason: collision with root package name */
    private final m5 f16226n;

    /* renamed from: o  reason: collision with root package name */
    private final m5 f16227o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f16228p;

    /* renamed from: q  reason: collision with root package name */
    private final String f16229q;

    /* renamed from: r  reason: collision with root package name */
    private final int f16230r;

    /* renamed from: s  reason: collision with root package name */
    private final String f16231s;

    /* renamed from: t  reason: collision with root package name */
    private final IronSource.AD_UNIT f16232t;

    /* renamed from: u  reason: collision with root package name */
    private final int f16233u;

    /* renamed from: v  reason: collision with root package name */
    private final i0 f16234v;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private final class a implements NetworkInitializationListener {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a0 this$0) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            this$0.E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a0 this$0, int i10, String str) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            this$0.a(i10, str);
        }

        @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
        public void onInitFailed(final int i10, final String str) {
            final a0 a0Var = a0.this;
            a0Var.a(new Runnable() { // from class: com.ironsource.pw
                @Override // java.lang.Runnable
                public final void run() {
                    a0.a.a(a0.this, i10, str);
                }
            });
        }

        @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
        public void onInitSuccess() {
            final a0 a0Var = a0.this;
            a0Var.a(new Runnable() { // from class: com.ironsource.ow
                @Override // java.lang.Runnable
                public final void run() {
                    a0.a.a(a0.this);
                }
            });
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b extends hr {
        b() {
        }

        @Override // com.ironsource.hr
        public void a() {
            long a10 = ib.a(a0.this.f16219g);
            IronLog ironLog = IronLog.INTERNAL;
            a0 a0Var = a0.this;
            ironLog.verbose(a0Var.a("Load duration = " + a10 + ", isBidder = " + a0.this.t()));
            a0.this.f16224l = true;
            a0.this.f().e().e().a(a10, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
            a0.this.f().e().e().a(a10, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
            a0 a0Var2 = a0.this;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            kotlin.jvm.internal.n.e(buildLoadFailedError, "buildLoadFailedError(errorMessage)");
            a0Var2.a(buildLoadFailedError);
        }
    }

    public a0(w2 adTools, b0 instanceData, h0 adInstancePayload, e0 listener) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f16213a = adTools;
        this.f16214b = instanceData;
        this.f16215c = adInstancePayload;
        this.f16216d = new WeakReference<>(listener);
        this.f16225m = instanceData.g();
        this.f16226n = instanceData.n();
        this.f16227o = instanceData.p();
        this.f16228p = instanceData.j().j();
        this.f16229q = instanceData.r();
        this.f16230r = instanceData.s();
        this.f16231s = instanceData.w();
        this.f16232t = instanceData.h();
        this.f16233u = instanceData.v();
        this.f16234v = instanceData.t();
        BaseAdAdapter<?, ?> a10 = a(instanceData);
        this.f16218f = a10;
        adTools.e().a(new c0(adTools, instanceData, a10));
        adTools.e().a(new u4(instanceData.k()));
    }

    private final void A() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            F();
            z();
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage();
            IronLog.INTERNAL.error(a(str));
            this.f16213a.e().h().g(str);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    private final void B() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.f16213a.e().a().a(k());
        e0 e0Var = this.f16216d.get();
        if (e0Var != null) {
            e0Var.a(this);
        }
    }

    private final void C() {
        IronLog ironLog = IronLog.INTERNAL;
        f0 f0Var = null;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        G();
        if (this.f16224l) {
            c();
        } else if (this.f16222j) {
        } else {
            this.f16222j = true;
            long a10 = ib.a(this.f16219g);
            ironLog.verbose(a("Load duration = " + a10));
            this.f16213a.e().e().a(a10, false);
            a(q1.a.LoadedSuccessfully);
            f0 f0Var2 = this.f16217e;
            if (f0Var2 == null) {
                kotlin.jvm.internal.n.u("loadListener");
            } else {
                f0Var = f0Var2;
            }
            f0Var.a(this);
        }
    }

    private final void D() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.f16223k) {
            return;
        }
        this.f16223k = true;
        this.f16213a.e().a().g(k());
        a(q1.a.ShowedSuccessfully);
        e0 e0Var = this.f16216d.get();
        if (e0Var != null) {
            e0Var.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        G();
        if (this.f16224l) {
            return;
        }
        A();
    }

    private final void F() {
        G();
        b a10 = a();
        this.f16220h = a10;
        if (a10 != null) {
            this.f16213a.a((hr) a10, TimeUnit.SECONDS.toMillis(n()));
        }
    }

    private final void G() {
        hr hrVar = this.f16220h;
        if (hrVar != null) {
            this.f16213a.b(hrVar);
            this.f16220h = null;
        }
    }

    private final b a() {
        return new b();
    }

    private final BaseAdAdapter<?, ?> a(b0 b0Var) {
        return b0Var.i().e().p() ? this.f16215c.b() : this.f16213a.a(b0Var);
    }

    public static /* synthetic */ String a(a0 a0Var, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return a0Var.a(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        G();
        this.f16224l = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, ib.a(this.f16219g));
        a(new IronSourceError(i10, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a0 this$0, AdapterErrorType adapterErrorType, int i10, String errorMessage) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adapterErrorType, "$adapterErrorType");
        kotlin.jvm.internal.n.f(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i10, errorMessage);
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str) {
        long a10 = ib.a(this.f16219g);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a10 + ", error = " + i10 + ", " + str));
        G();
        c();
        a(adapterErrorType, i10, str, a10);
        this.f16224l = true;
        a(new IronSourceError(i10, str));
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f16213a.e().e().a(j10, i10);
        } else {
            this.f16213a.e().e().a(j10, i10, str, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(q1.a.FailedToLoad);
        f0 f0Var = this.f16217e;
        if (f0Var == null) {
            kotlin.jvm.internal.n.u("loadListener");
            f0Var = null;
        }
        f0Var.a(ironSourceError, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a0 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a0 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(a0 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.D();
    }

    private final int n() {
        Integer f10 = this.f16214b.n().f();
        return (f10 == null || f10.intValue() <= 0) ? this.f16214b.i().h() : f10.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str) {
        return this.f16213a.a(str, this.f16231s);
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public final void a(f0 listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.f16217e = listener;
        this.f16221i = true;
        try {
            this.f16213a.e().e().a(false);
            this.f16219g = new ib();
            F();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f16218f;
            kotlin.jvm.internal.n.c(baseAdAdapter);
            ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.f16214b.g(), ContextProvider.getInstance().getApplicationContext(), new a());
            } else {
                String str = "loadAd - network adapter not available " + this.f16231s;
                ironLog.error(a(str));
                a(a2.c(this.f16214b.h()), str);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str2 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            this.f16213a.e().h().g(str2);
            a(a2.c(this.f16214b.h()), str2);
        }
    }

    public abstract void a(j0 j0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(q1.a performance) {
        kotlin.jvm.internal.n.f(performance, "performance");
        this.f16214b.a(performance);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        this.f16213a.a(callback);
    }

    public final void a(boolean z10) {
        this.f16213a.e().a().a(z10);
    }

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        G();
        this.f16213a.e().e().a(this.f16233u);
    }

    public void c() {
    }

    public final IronSource.AD_UNIT d() {
        return this.f16232t;
    }

    public LevelPlayAdInfo e() {
        String uuid = this.f16214b.i().b().b().toString();
        kotlin.jvm.internal.n.e(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        String c10 = this.f16214b.i().b().c();
        String ad_unit = this.f16214b.h().toString();
        kotlin.jvm.internal.n.e(ad_unit, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c10, ad_unit, this.f16214b.n().a(k()), this.f16214b.n().d(), null, null, 96, null);
    }

    public final w2 f() {
        return this.f16213a;
    }

    public final BaseAdAdapter<?, ?> g() {
        return this.f16218f;
    }

    public final m5 h() {
        return this.f16226n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AdData i() {
        return this.f16225m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Placement j() {
        return this.f16214b.i().b().e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String k() {
        return this.f16214b.i().l();
    }

    public final m5 l() {
        return this.f16227o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b0 m() {
        return this.f16214b;
    }

    public final String o() {
        return this.f16229q;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new Runnable() { // from class: com.ironsource.mw
            @Override // java.lang.Runnable
            public final void run() {
                a0.c(a0.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(final AdapterErrorType adapterErrorType, final int i10, final String errorMessage) {
        kotlin.jvm.internal.n.f(adapterErrorType, "adapterErrorType");
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.nw
            @Override // java.lang.Runnable
            public final void run() {
                a0.a(a0.this, adapterErrorType, i10, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        a(new Runnable() { // from class: com.ironsource.lw
            @Override // java.lang.Runnable
            public final void run() {
                a0.d(a0.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        a(new Runnable() { // from class: com.ironsource.it
            @Override // java.lang.Runnable
            public final void run() {
                a0.e(a0.this);
            }
        });
    }

    public final String p() {
        return this.f16231s;
    }

    public final int q() {
        return this.f16230r;
    }

    public final i0 r() {
        return this.f16234v;
    }

    public final int s() {
        return this.f16233u;
    }

    public final boolean t() {
        return this.f16228p;
    }

    public final boolean u() {
        return this.f16224l;
    }

    public final boolean v() {
        return this.f16222j;
    }

    public final boolean w() {
        return this.f16221i;
    }

    public final boolean x() {
        return this.f16223k;
    }

    public boolean y() {
        return this.f16222j;
    }

    protected abstract void z();
}
