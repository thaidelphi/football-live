package com.ironsource;

import com.ironsource.i7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class vu extends i7 implements m2, y1 {

    /* renamed from: d  reason: collision with root package name */
    private final o1 f21192d;

    /* renamed from: e  reason: collision with root package name */
    private final w6 f21193e;

    /* renamed from: f  reason: collision with root package name */
    private final j7 f21194f;

    /* renamed from: g  reason: collision with root package name */
    private final n6 f21195g;

    /* renamed from: h  reason: collision with root package name */
    private ev f21196h;

    /* renamed from: i  reason: collision with root package name */
    private final w3 f21197i;

    /* renamed from: j  reason: collision with root package name */
    private final rv f21198j;

    /* renamed from: k  reason: collision with root package name */
    private final km f21199k;

    /* renamed from: l  reason: collision with root package name */
    private a f21200l;

    /* renamed from: m  reason: collision with root package name */
    private a f21201m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final l6 f21202a;

        /* renamed from: b  reason: collision with root package name */
        public t1 f21203b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ vu f21204c;

        public a(vu vuVar, n6 bannerAdUnitFactory, boolean z10) {
            kotlin.jvm.internal.n.f(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.f21204c = vuVar;
            this.f21202a = bannerAdUnitFactory.a(z10);
        }

        public final t1 a() {
            t1 t1Var = this.f21203b;
            if (t1Var != null) {
                return t1Var;
            }
            kotlin.jvm.internal.n.u("adUnitCallback");
            return null;
        }

        public final void a(t1 t1Var) {
            kotlin.jvm.internal.n.f(t1Var, "<set-?>");
            this.f21203b = t1Var;
        }

        public final void a(boolean z10) {
            this.f21202a.a(z10);
        }

        public final l6 b() {
            return this.f21202a;
        }

        public final j1 c() {
            return this.f21202a.d();
        }

        public final void d() {
            this.f21202a.a((m2) this.f21204c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(o1 adTools, w6 bannerContainer, i7.b config, j6 bannerAdProperties, j7 bannerStrategyListener, n6 bannerAdUnitFactory) {
        super(config, bannerAdProperties);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.n.f(bannerStrategyListener, "bannerStrategyListener");
        kotlin.jvm.internal.n.f(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f21192d = adTools;
        this.f21193e = bannerContainer;
        this.f21194f = bannerStrategyListener;
        this.f21195g = bannerAdUnitFactory;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(o1.a(adTools, "refresh interval: " + d() + ", auto refresh: " + e(), (String) null, 2, (Object) null));
        this.f21197i = new w3(adTools.b());
        this.f21198j = new rv(bannerContainer);
        this.f21199k = new km(e() ^ true);
        this.f21201m = new a(this, bannerAdUnitFactory, true);
    }

    private final void a(t1 t1Var) {
        this.f21201m.a(t1Var);
        this.f21201m.b().a(this.f21193e.getViewBinder(), this);
        this.f21194f.a(this.f21201m.a());
        a aVar = this.f21200l;
        if (aVar != null) {
            aVar.a(false);
        }
        this.f21200l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vu this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final vu this$0, gp[] triggers) {
        List u10;
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(triggers, "$triggers");
        o1 o1Var = this$0.f21192d;
        Runnable runnable = new Runnable() { // from class: com.ironsource.c20
            @Override // java.lang.Runnable
            public final void run() {
                vu.b(vu.this);
            }
        };
        long d10 = this$0.d();
        u10 = j8.m.u(triggers);
        this$0.f21196h = new ev(o1Var, runnable, d10, u10);
    }

    private final void a(final gp... gpVarArr) {
        this.f21192d.c(new Runnable() { // from class: com.ironsource.e20
            @Override // java.lang.Runnable
            public final void run() {
                vu.a(vu.this, gpVarArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(vu this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.j();
    }

    private final void i() {
        this.f21200l = this.f21201m;
        a aVar = new a(this, this.f21195g, false);
        this.f21201m = aVar;
        aVar.d();
    }

    private final void j() {
        this.f21192d.a(new Runnable() { // from class: com.ironsource.d20
            @Override // java.lang.Runnable
            public final void run() {
                vu.a(vu.this);
            }
        });
    }

    @Override // com.ironsource.m2
    public /* synthetic */ void a() {
        pz.a(this);
    }

    @Override // com.ironsource.m2
    public void a(IronSourceError ironSourceError) {
        this.f21194f.c(ironSourceError);
        a(this.f21197i, this.f21199k);
    }

    @Override // com.ironsource.y1
    public void b() {
        this.f21194f.f();
    }

    @Override // com.ironsource.y1
    public void b(IronSourceError ironSourceError) {
        this.f21194f.d(ironSourceError);
    }

    @Override // com.ironsource.m2
    public /* synthetic */ void b(t1 t1Var) {
        pz.b(this, t1Var);
    }

    @Override // com.ironsource.i7
    public void c() {
        this.f21197i.e();
        this.f21198j.e();
        ev evVar = this.f21196h;
        if (evVar != null) {
            evVar.c();
        }
        this.f21196h = null;
        a aVar = this.f21200l;
        if (aVar != null) {
            aVar.a(true);
        }
        this.f21200l = null;
        this.f21201m.a(true);
    }

    @Override // com.ironsource.m2
    public void c(t1 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        a(adUnitCallback);
        a(this.f21198j, this.f21197i, this.f21199k);
    }

    @Override // com.ironsource.i7
    public void f() {
        this.f21201m.d();
    }

    @Override // com.ironsource.i7
    public void g() {
        if (e()) {
            this.f21199k.e();
        }
    }

    @Override // com.ironsource.i7
    public void h() {
        if (e()) {
            this.f21199k.f();
        }
    }
}
