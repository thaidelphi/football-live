package com.ironsource;

import c9.b;
import com.ironsource.e2;
import com.ironsource.j1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.ut;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class p1 {

    /* renamed from: a  reason: collision with root package name */
    private final w1 f19647a;

    /* renamed from: b  reason: collision with root package name */
    private final le f19648b;

    /* renamed from: c  reason: collision with root package name */
    private final w2 f19649c;

    /* renamed from: d  reason: collision with root package name */
    private m2 f19650d;

    /* renamed from: e  reason: collision with root package name */
    private y1 f19651e;

    /* renamed from: f  reason: collision with root package name */
    private final vv f19652f;

    /* renamed from: g  reason: collision with root package name */
    private final WeakReference<k2> f19653g;

    /* renamed from: h  reason: collision with root package name */
    private ib f19654h;

    /* renamed from: i  reason: collision with root package name */
    private ut.a f19655i;

    /* renamed from: j  reason: collision with root package name */
    private final ac f19656j;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    protected class a implements e0 {
        public a() {
        }

        @Override // com.ironsource.e0
        public void a(a0 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            p1.this.f19656j.a().a(p1.this.h());
            k2 k2Var = (k2) p1.this.f19653g.get();
            if (k2Var != null) {
                k2Var.c();
            }
        }

        @Override // com.ironsource.e0
        public void b(a0 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            IronLog.INTERNAL.verbose(p1.this.a(instance.p()));
            p1.this.k().b(instance);
            p1.this.f19656j.a().g(p1.this.h());
            p1.this.f().m().b(p1.this.e().b().a());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements cw {
        b() {
        }

        @Override // com.ironsource.cw
        public void a(int i10, String errorReason) {
            kotlin.jvm.internal.n.f(errorReason, "errorReason");
            p1.this.a(i10, errorReason);
        }

        @Override // com.ironsource.cw
        public void a(a0 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            p1.this.f().e().a().e(p1.this.h());
            m2 j10 = p1.this.j();
            if (j10 != null) {
                j10.b(new t1(p1.this, instance.e()));
            }
            p1.this.l();
        }

        @Override // com.ironsource.cw
        public void b(a0 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            p1.this.f19656j.e().a(ib.a(p1.this.f19654h), p1.this.e().u());
            m2 j10 = p1.this.j();
            if (j10 != null) {
                j10.c(new t1(p1.this, instance.e()));
            }
            p1.this.l();
        }
    }

    public p1(o1 adTools, w1 adUnitData, k2 listener, le taskScheduler) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(listener, "listener");
        kotlin.jvm.internal.n.f(taskScheduler, "taskScheduler");
        this.f19647a = adUnitData;
        this.f19648b = taskScheduler;
        w2 w2Var = new w2(adTools, adUnitData, e2.b.MEDIATION);
        this.f19649c = w2Var;
        this.f19652f = new vv(w2Var, adUnitData, c());
        this.f19653g = new WeakReference<>(listener);
        this.f19656j = w2Var.e();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    public /* synthetic */ p1(o1 o1Var, w1 w1Var, k2 k2Var, le leVar, int i10, kotlin.jvm.internal.h hVar) {
        this(o1Var, w1Var, k2Var, (i10 & 8) != 0 ? new le(me.a(o1Var.a())) : leVar);
    }

    private final b c() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p1 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        m2 m2Var = this$0.f19650d;
        if (m2Var != null) {
            m2Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        IronLog.INTERNAL.verbose(a("starting expiration scheduled task"));
        ut.a aVar = this.f19655i;
        if (aVar != null) {
            aVar.a();
        }
        long b10 = this.f19649c.b(this.f19647a.b().d());
        le leVar = this.f19648b;
        Runnable runnable = new Runnable() { // from class: com.ironsource.j00
            @Override // java.lang.Runnable
            public final void run() {
                p1.e(p1.this);
            }
        };
        b.a aVar2 = c9.b.f5600b;
        this.f19655i = leVar.a(runnable, c9.d.o(b10, c9.e.MILLISECONDS));
    }

    protected abstract d0 a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str) {
        return o1.a(this.f19649c, str, (String) null, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i10, String errorReason) {
        kotlin.jvm.internal.n.f(errorReason, "errorReason");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("errorCode = " + i10 + ", errorReason = " + errorReason));
        this.f19656j.e().a(ib.a(this.f19654h), i10, errorReason, this.f19647a.u());
        m2 m2Var = this.f19650d;
        if (m2Var != null) {
            m2Var.a(new IronSourceError(i10, errorReason));
        }
    }

    public final void a(j0 adInstancePresenter, y1 displayListener) {
        kotlin.jvm.internal.n.f(adInstancePresenter, "adInstancePresenter");
        kotlin.jvm.internal.n.f(displayListener, "displayListener");
        this.f19651e = displayListener;
        ut.a aVar = this.f19655i;
        if (aVar != null) {
            aVar.a();
        }
        this.f19652f.a(adInstancePresenter);
    }

    public final void a(m2 loadListener) {
        kotlin.jvm.internal.n.f(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(o1.a(this.f19649c, (String) null, (String) null, 3, (Object) null));
        this.f19649c.a(b());
        this.f19650d = loadListener;
        this.f19656j.a(this.f19647a.u());
        this.f19654h = new ib();
        this.f19652f.a(a());
    }

    protected final void a(y1 y1Var) {
        this.f19651e = y1Var;
    }

    public final void a(boolean z10) {
        IronLog.INTERNAL.verbose(o1.a(this.f19649c, (String) null, (String) null, 3, (Object) null));
        this.f19652f.a();
        if (z10) {
            this.f19649c.e().e().a(this.f19649c.f());
        }
    }

    public r1 b() {
        return new r1(this.f19647a.b());
    }

    protected final void b(m2 m2Var) {
        this.f19650d = m2Var;
    }

    public j1 d() {
        return this.f19652f.c() ? j1.b.f17889a : new j1.a(null, 1, null);
    }

    protected final w1 e() {
        return this.f19647a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final w2 f() {
        return this.f19649c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Placement g() {
        return this.f19647a.b().e();
    }

    protected final String h() {
        return this.f19647a.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final y1 i() {
        return this.f19651e;
    }

    protected final m2 j() {
        return this.f19650d;
    }

    protected final vv k() {
        return this.f19652f;
    }
}
