package com.ironsource;

import com.ironsource.ew;
import com.ironsource.g0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class vv implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final w2 f21205a;

    /* renamed from: b  reason: collision with root package name */
    private final w1 f21206b;

    /* renamed from: c  reason: collision with root package name */
    private final cw f21207c;

    /* renamed from: d  reason: collision with root package name */
    private final xv f21208d;

    /* renamed from: e  reason: collision with root package name */
    private g0 f21209e;

    /* renamed from: f  reason: collision with root package name */
    private ew f21210f;

    /* renamed from: g  reason: collision with root package name */
    private final List<a0> f21211g;

    /* renamed from: h  reason: collision with root package name */
    private a0 f21212h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21213i;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements yv {
        a() {
        }

        @Override // com.ironsource.yv
        public void a(int i10, String errorReason) {
            kotlin.jvm.internal.n.f(errorReason, "errorReason");
            if (vv.this.f21213i) {
                return;
            }
            vv.this.f21207c.a(i10, errorReason);
        }

        @Override // com.ironsource.yv
        public void a(zv waterfallInstances) {
            kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
            if (vv.this.f21213i) {
                return;
            }
            vv.this.a(waterfallInstances);
        }
    }

    public vv(w2 adTools, w1 adUnitData, cw listener) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(listener, "listener");
        this.f21205a = adTools;
        this.f21206b = adUnitData;
        this.f21207c = listener;
        this.f21208d = xv.f21451d.a(adTools, adUnitData);
        this.f21211g = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(zv zvVar) {
        this.f21209e = g0.f17505c.a(this.f21206b, zvVar);
        ew.a aVar = ew.f17337c;
        w2 w2Var = this.f21205a;
        w1 w1Var = this.f21206b;
        xo a10 = this.f21208d.a();
        g0 g0Var = this.f21209e;
        if (g0Var == null) {
            kotlin.jvm.internal.n.u("adInstanceLoadStrategy");
            g0Var = null;
        }
        this.f21210f = aVar.a(w2Var, w1Var, a10, zvVar, g0Var);
        e();
    }

    private final void c(a0 a0Var) {
        d(a0Var);
        b();
    }

    private final void d(a0 a0Var) {
        this.f21212h = a0Var;
        this.f21211g.remove(a0Var);
    }

    private final boolean d() {
        return this.f21212h != null;
    }

    private final void e() {
        g0 g0Var = this.f21209e;
        ew ewVar = null;
        if (g0Var == null) {
            kotlin.jvm.internal.n.u("adInstanceLoadStrategy");
            g0Var = null;
        }
        g0.b d10 = g0Var.d();
        if (d10.e()) {
            this.f21207c.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
        } else if (!d10.f()) {
            for (a0 a0Var : d10.a()) {
                a0Var.a(this);
            }
        } else {
            ew ewVar2 = this.f21210f;
            if (ewVar2 == null) {
                kotlin.jvm.internal.n.u("waterfallReporter");
            } else {
                ewVar = ewVar2;
            }
            ewVar.a();
        }
    }

    public final void a() {
        this.f21213i = true;
        a0 a0Var = this.f21212h;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // com.ironsource.f0
    public void a(a0 instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        if (this.f21213i || d()) {
            return;
        }
        ew ewVar = this.f21210f;
        g0 g0Var = null;
        ew ewVar2 = null;
        if (ewVar == null) {
            kotlin.jvm.internal.n.u("waterfallReporter");
            ewVar = null;
        }
        ewVar.a(instance);
        this.f21211g.add(instance);
        if (this.f21211g.size() == 1) {
            ew ewVar3 = this.f21210f;
            if (ewVar3 == null) {
                kotlin.jvm.internal.n.u("waterfallReporter");
            } else {
                ewVar2 = ewVar3;
            }
            ewVar2.b(instance);
            this.f21207c.b(instance);
            return;
        }
        g0 g0Var2 = this.f21209e;
        if (g0Var2 == null) {
            kotlin.jvm.internal.n.u("adInstanceLoadStrategy");
        } else {
            g0Var = g0Var2;
        }
        if (g0Var.a(instance)) {
            this.f21207c.a(instance);
        }
    }

    public final void a(d0 adInstanceFactory) {
        kotlin.jvm.internal.n.f(adInstanceFactory, "adInstanceFactory");
        this.f21208d.a(adInstanceFactory, new a());
    }

    public final void a(j0 adInstancePresenter) {
        kotlin.jvm.internal.n.f(adInstancePresenter, "adInstancePresenter");
        g0 g0Var = this.f21209e;
        ew ewVar = null;
        if (g0Var == null) {
            kotlin.jvm.internal.n.u("adInstanceLoadStrategy");
            g0Var = null;
        }
        g0.c c10 = g0Var.c();
        a0 c11 = c10.c();
        if (c11 != null) {
            c(c11);
            ew ewVar2 = this.f21210f;
            if (ewVar2 == null) {
                kotlin.jvm.internal.n.u("waterfallReporter");
            } else {
                ewVar = ewVar2;
            }
            ewVar.a(c10.c(), c10.d());
            c10.c().a(adInstancePresenter);
        }
    }

    @Override // com.ironsource.f0
    public void a(IronSourceError error, a0 instance) {
        kotlin.jvm.internal.n.f(error, "error");
        kotlin.jvm.internal.n.f(instance, "instance");
        if (this.f21213i) {
            return;
        }
        e();
    }

    public final void b() {
        IronLog.INTERNAL.verbose(o1.a(this.f21205a, "dispose", (String) null, 2, (Object) null));
        for (a0 a0Var : this.f21211g) {
            a0Var.c();
        }
        this.f21211g.clear();
        this.f21205a.e().h().a();
    }

    public final void b(a0 instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        ew ewVar = this.f21210f;
        if (ewVar == null) {
            kotlin.jvm.internal.n.u("waterfallReporter");
            ewVar = null;
        }
        ewVar.a(instance, this.f21206b.l(), this.f21206b.o());
    }

    public final boolean c() {
        for (a0 a0Var : this.f21211g) {
            if (a0Var.y()) {
                return true;
            }
        }
        return false;
    }
}
