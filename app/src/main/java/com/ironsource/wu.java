package com.ironsource;

import com.ironsource.i7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class wu extends i7 implements m2, y1 {

    /* renamed from: d  reason: collision with root package name */
    private final o1 f21321d;

    /* renamed from: e  reason: collision with root package name */
    private final w6 f21322e;

    /* renamed from: f  reason: collision with root package name */
    private final j7 f21323f;

    /* renamed from: g  reason: collision with root package name */
    private final n6 f21324g;

    /* renamed from: h  reason: collision with root package name */
    private ev f21325h;

    /* renamed from: i  reason: collision with root package name */
    private final w3 f21326i;

    /* renamed from: j  reason: collision with root package name */
    private final rv f21327j;

    /* renamed from: k  reason: collision with root package name */
    private final km f21328k;

    /* renamed from: l  reason: collision with root package name */
    private a f21329l;

    /* renamed from: m  reason: collision with root package name */
    private a f21330m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f21331n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f21332o;

    /* renamed from: p  reason: collision with root package name */
    private t1 f21333p;

    /* renamed from: q  reason: collision with root package name */
    private IronSourceError f21334q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final l6 f21335a;

        /* renamed from: b  reason: collision with root package name */
        public t1 f21336b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f21337c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ wu f21338d;

        public a(wu wuVar, n6 bannerAdUnitFactory, boolean z10) {
            kotlin.jvm.internal.n.f(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.f21338d = wuVar;
            this.f21335a = bannerAdUnitFactory.a(z10);
            this.f21337c = true;
        }

        public final t1 a() {
            t1 t1Var = this.f21336b;
            if (t1Var != null) {
                return t1Var;
            }
            kotlin.jvm.internal.n.u("adUnitCallback");
            return null;
        }

        public final void a(t1 t1Var) {
            kotlin.jvm.internal.n.f(t1Var, "<set-?>");
            this.f21336b = t1Var;
        }

        public final void a(boolean z10) {
            this.f21335a.a(z10);
        }

        public final l6 b() {
            return this.f21335a;
        }

        public final void b(boolean z10) {
            this.f21337c = z10;
        }

        public final boolean c() {
            return this.f21337c;
        }

        public final boolean d() {
            return this.f21335a.d().a();
        }

        public final void e() {
            this.f21335a.a((m2) this.f21338d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(o1 adTools, w6 bannerContainer, i7.b config, j6 bannerAdProperties, j7 bannerStrategyListener, n6 bannerAdUnitFactory) {
        super(config, bannerAdProperties);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.n.f(bannerStrategyListener, "bannerStrategyListener");
        kotlin.jvm.internal.n.f(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f21321d = adTools;
        this.f21322e = bannerContainer;
        this.f21323f = bannerStrategyListener;
        this.f21324g = bannerAdUnitFactory;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(o1.a(adTools, "refresh interval: " + d() + ", auto refresh: " + e(), (String) null, 2, (Object) null));
        this.f21326i = new w3(adTools.b());
        this.f21327j = new rv(bannerContainer);
        this.f21328k = new km(e() ^ true);
        this.f21330m = new a(this, bannerAdUnitFactory, true);
        this.f21332o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wu this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f21331n = true;
        if (this$0.f21330m.d()) {
            this$0.l();
            return;
        }
        this$0.k();
        if (this$0.f21330m.c()) {
            return;
        }
        this$0.i();
        this$0.a(this$0.f21326i, this$0.f21328k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final wu this$0, gp[] triggers) {
        List u10;
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(triggers, "$triggers");
        this$0.f21331n = false;
        ev evVar = this$0.f21325h;
        if (evVar != null) {
            evVar.c();
        }
        o1 o1Var = this$0.f21321d;
        Runnable runnable = new Runnable() { // from class: com.ironsource.l20
            @Override // java.lang.Runnable
            public final void run() {
                wu.b(wu.this);
            }
        };
        long d10 = this$0.d();
        u10 = j8.m.u(triggers);
        this$0.f21325h = new ev(o1Var, runnable, d10, u10);
    }

    private final void a(final gp... gpVarArr) {
        this.f21321d.c(new Runnable() { // from class: com.ironsource.n20
            @Override // java.lang.Runnable
            public final void run() {
                wu.a(wu.this, gpVarArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(wu this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.j();
    }

    private final void i() {
        if (e()) {
            a aVar = new a(this, this.f21324g, false);
            this.f21330m = aVar;
            aVar.e();
        }
    }

    private final void j() {
        this.f21321d.a(new Runnable() { // from class: com.ironsource.m20
            @Override // java.lang.Runnable
            public final void run() {
                wu.a(wu.this);
            }
        });
    }

    private final void k() {
        this.f21323f.c(this.f21334q);
        this.f21333p = null;
        this.f21334q = null;
    }

    private final void l() {
        this.f21332o = false;
        this.f21330m.b().a(this.f21322e.getViewBinder(), this);
        this.f21323f.a(this.f21330m.a());
        a aVar = this.f21329l;
        if (aVar != null) {
            aVar.a(false);
        }
        this.f21329l = this.f21330m;
        i();
        a(this.f21327j, this.f21326i, this.f21328k);
    }

    @Override // com.ironsource.m2
    public /* synthetic */ void a() {
        pz.a(this);
    }

    @Override // com.ironsource.m2
    public void a(IronSourceError ironSourceError) {
        this.f21330m.b(false);
        this.f21334q = ironSourceError;
        if (this.f21332o) {
            k();
            a(this.f21326i, this.f21328k);
        } else if (this.f21331n) {
            k();
            i();
            a(this.f21326i, this.f21328k);
        }
    }

    @Override // com.ironsource.y1
    public void b() {
        this.f21323f.f();
    }

    @Override // com.ironsource.y1
    public void b(IronSourceError ironSourceError) {
        this.f21323f.d(ironSourceError);
    }

    @Override // com.ironsource.m2
    public /* synthetic */ void b(t1 t1Var) {
        pz.b(this, t1Var);
    }

    @Override // com.ironsource.i7
    public void c() {
        this.f21326i.e();
        this.f21327j.e();
        ev evVar = this.f21325h;
        if (evVar != null) {
            evVar.c();
        }
        this.f21325h = null;
        a aVar = this.f21329l;
        if (aVar != null) {
            aVar.a(true);
        }
        this.f21330m.a(true);
    }

    @Override // com.ironsource.m2
    public void c(t1 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f21330m.a(adUnitCallback);
        this.f21330m.b(false);
        if (this.f21331n || this.f21332o) {
            l();
        }
    }

    @Override // com.ironsource.i7
    public void f() {
        this.f21330m.e();
    }

    @Override // com.ironsource.i7
    public void g() {
        if (e()) {
            this.f21328k.e();
        }
    }

    @Override // com.ironsource.i7
    public void h() {
        if (e()) {
            this.f21328k.f();
        }
    }
}
