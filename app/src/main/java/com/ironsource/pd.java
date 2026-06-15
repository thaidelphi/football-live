package com.ironsource;

import android.app.Activity;
import c9.b;
import com.ironsource.e2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.q9;
import com.ironsource.rl;
import com.ironsource.ut;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class pd implements jd {

    /* renamed from: a  reason: collision with root package name */
    private final mm f19711a;

    /* renamed from: b  reason: collision with root package name */
    private final w2 f19712b;

    /* renamed from: c  reason: collision with root package name */
    private final w1 f19713c;

    /* renamed from: d  reason: collision with root package name */
    private final sd f19714d;

    /* renamed from: e  reason: collision with root package name */
    private final t8.q<b0, h0, jd, id> f19715e;

    /* renamed from: f  reason: collision with root package name */
    private final ut f19716f;

    /* renamed from: g  reason: collision with root package name */
    private final q9 f19717g;

    /* renamed from: h  reason: collision with root package name */
    private a f19718h;

    /* renamed from: i  reason: collision with root package name */
    private y1 f19719i;

    /* renamed from: j  reason: collision with root package name */
    private final vv f19720j;

    /* renamed from: k  reason: collision with root package name */
    private ut.a f19721k;

    /* renamed from: l  reason: collision with root package name */
    private Long f19722l;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void a();

        void a(IronSourceError ironSourceError);

        void a(LevelPlayAdInfo levelPlayAdInfo);

        void b(LevelPlayAdInfo levelPlayAdInfo);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements cw {
        b() {
        }

        @Override // com.ironsource.cw
        public void a(int i10, String errorReason) {
            Long l10;
            kotlin.jvm.internal.n.f(errorReason, "errorReason");
            Long l11 = pd.this.f19722l;
            if (l11 != null) {
                l10 = Long.valueOf(pd.this.f19717g.a() - l11.longValue());
            } else {
                l10 = null;
            }
            pd.this.f19712b.e().e().a(l10 != null ? l10.longValue() : 0L, i10, errorReason, pd.this.f19713c.u());
            a aVar = pd.this.f19718h;
            if (aVar != null) {
                aVar.a(new IronSourceError(i10, errorReason));
            }
        }

        @Override // com.ironsource.cw
        public void a(a0 instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            pd.this.f19712b.e().a().e(pd.this.c());
            pd.this.e();
            a aVar = pd.this.f19718h;
            if (aVar != null) {
                aVar.a(instance.e());
            }
        }

        @Override // com.ironsource.cw
        public void b(a0 instance) {
            Long l10;
            kotlin.jvm.internal.n.f(instance, "instance");
            Long l11 = pd.this.f19722l;
            if (l11 != null) {
                l10 = Long.valueOf(pd.this.f19717g.a() - l11.longValue());
            } else {
                l10 = null;
            }
            pd.this.f19712b.e().e().a(l10 != null ? l10.longValue() : 0L, pd.this.f19713c.u());
            pd.this.e();
            a aVar = pd.this.f19718h;
            if (aVar != null) {
                aVar.b(instance.e());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class c extends kotlin.jvm.internal.l implements t8.q<b0, h0, jd, id> {
        c(Object obj) {
            super(3, obj, pd.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // t8.q
        /* renamed from: a */
        public final id invoke(b0 p02, h0 p12, jd p22) {
            kotlin.jvm.internal.n.f(p02, "p0");
            kotlin.jvm.internal.n.f(p12, "p1");
            kotlin.jvm.internal.n.f(p22, "p2");
            return ((pd) this.receiver).a(p02, p12, p22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pd(mm mediationServices, w2 adUnitTools, w1 adUnitData, sd fullscreenListener, wv wvVar, t8.q<? super b0, ? super h0, ? super jd, id> qVar, ut taskScheduler, q9 currentTimeProvider) {
        kotlin.jvm.internal.n.f(mediationServices, "mediationServices");
        kotlin.jvm.internal.n.f(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(fullscreenListener, "fullscreenListener");
        kotlin.jvm.internal.n.f(taskScheduler, "taskScheduler");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f19711a = mediationServices;
        this.f19712b = adUnitTools;
        this.f19713c = adUnitData;
        this.f19714d = fullscreenListener;
        this.f19715e = qVar;
        this.f19716f = taskScheduler;
        this.f19717g = currentTimeProvider;
        this.f19720j = a(wvVar);
    }

    public /* synthetic */ pd(mm mmVar, w2 w2Var, w1 w1Var, sd sdVar, wv wvVar, t8.q qVar, ut utVar, q9 q9Var, int i10, kotlin.jvm.internal.h hVar) {
        this(mmVar, w2Var, w1Var, sdVar, (i10 & 16) != 0 ? null : wvVar, (i10 & 32) != 0 ? null : qVar, (i10 & 64) != 0 ? new le(me.a(w2Var.a())) : utVar, (i10 & 128) != 0 ? new q9.a() : q9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 a(pd this$0, b0 instanceData, h0 adInstancePayload) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        t8.q qVar = this$0.f19715e;
        if (qVar == null) {
            qVar = new c(this$0);
        }
        return (a0) qVar.invoke(instanceData, adInstancePayload, this$0);
    }

    private final cw a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final id a(b0 b0Var, h0 h0Var, jd jdVar) {
        return new id(new w2(this.f19712b, e2.b.PROVIDER), b0Var, h0Var, jdVar);
    }

    private final vv a(wv wvVar) {
        cw a10 = a();
        return wvVar != null ? wvVar.a(a10) : new vv(this.f19712b, this.f19713c, a10);
    }

    private final LevelPlay.AdFormat b() {
        return this.f19713c.b().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.f19713c.l();
    }

    private final rl<i8.w> d() {
        if (this.f19720j.c()) {
            if (this.f19711a.y().a(c(), b()).d()) {
                return new rl.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
            } else if (this.f19711a.u().a(this.f19713c.b().c()).d()) {
                return new rl.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.f19713c.b().c() + " is capped"));
            } else {
                return new rl.b(i8.w.f26638a);
            }
        }
        return new rl.a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        ut.a aVar = this.f19721k;
        if (aVar != null) {
            aVar.a();
        }
        long b10 = this.f19712b.b(b());
        ut utVar = this.f19716f;
        Runnable runnable = new Runnable() { // from class: com.ironsource.q00
            @Override // java.lang.Runnable
            public final void run() {
                pd.h(pd.this);
            }
        };
        b.a aVar2 = c9.b.f5600b;
        this.f19721k = utVar.a(runnable, c9.d.o(b10, c9.e.MILLISECONDS));
    }

    private final void f() {
        String c10 = c();
        if (c10.length() > 0) {
            this.f19711a.a().b(c10, b());
            l8 a10 = this.f19711a.y().a(c10, b());
            if (a10.d()) {
                this.f19712b.e().a().b(c10, a10.e());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(pd this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        a aVar = this$0.f19718h;
        if (aVar != null) {
            aVar.a();
        }
        this$0.f19720j.b();
    }

    public final void a(Activity activity, y1 displayListener) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(o1.a(this.f19712b, (String) null, (String) null, 3, (Object) null));
        this.f19719i = displayListener;
        this.f19712b.e().a().a(activity, c());
        rl<i8.w> d10 = d();
        if (d10 instanceof rl.a) {
            IronSourceError b10 = ((rl.a) d10).b();
            ironLog.verbose(o1.a(this.f19712b, b10.getErrorMessage(), (String) null, 2, (Object) null));
            this.f19712b.e().a().a(c(), b10.getErrorCode(), b10.getErrorMessage(), "");
            displayListener.b(b10);
            return;
        }
        ut.a aVar = this.f19721k;
        if (aVar != null) {
            aVar.a();
        }
        this.f19720j.a(new kd(activity));
    }

    @Override // com.ironsource.e0
    public void a(a0 instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        this.f19712b.e().a().a(c());
        this.f19714d.c();
    }

    @Override // com.ironsource.jd
    public void a(id fullscreenInstance) {
        kotlin.jvm.internal.n.f(fullscreenInstance, "fullscreenInstance");
        this.f19712b.e().a().l(c());
        y1 y1Var = this.f19719i;
        if (y1Var != null) {
            y1Var.b();
        }
        f();
        this.f19711a.w().b(this.f19713c.b().c());
    }

    @Override // com.ironsource.jd
    public void a(id fullscreenInstance, IronSourceError error) {
        kotlin.jvm.internal.n.f(fullscreenInstance, "fullscreenInstance");
        kotlin.jvm.internal.n.f(error, "error");
        IronLog.INTERNAL.verbose(o1.a(this.f19712b, error.toString(), (String) null, 2, (Object) null));
        this.f19712b.e().a().a(c(), error.getErrorCode(), error.getErrorMessage(), "");
        y1 y1Var = this.f19719i;
        if (y1Var != null) {
            y1Var.b(error);
        }
    }

    @Override // com.ironsource.jd
    public void a(id fullscreenInstance, LevelPlayReward reward) {
        kotlin.jvm.internal.n.f(fullscreenInstance, "fullscreenInstance");
        kotlin.jvm.internal.n.f(reward, "reward");
        IronLog.INTERNAL.verbose(o1.a(this.f19712b, fullscreenInstance.p(), (String) null, 2, (Object) null));
        this.f19714d.a(reward);
    }

    public final void a(a loadListener) {
        kotlin.jvm.internal.n.f(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(o1.a(this.f19712b, (String) null, (String) null, 3, (Object) null));
        this.f19718h = loadListener;
        this.f19722l = Long.valueOf(this.f19717g.a());
        this.f19712b.a(new r1(this.f19713c.b()));
        d0 d0Var = new d0() { // from class: com.ironsource.p00
            @Override // com.ironsource.d0
            public final a0 a(b0 b0Var, h0 h0Var) {
                a0 a10;
                a10 = pd.a(pd.this, b0Var, h0Var);
                return a10;
            }
        };
        this.f19712b.e().e().a(this.f19713c.u());
        this.f19720j.a(d0Var);
    }

    @Override // com.ironsource.e0
    public void b(a0 instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        this.f19720j.b(instance);
        this.f19712b.e().a().g(c());
        this.f19711a.e().b(com.unity3d.mediation.a.a(b()));
    }

    @Override // com.ironsource.jd
    public void b(id fullscreenInstance) {
        kotlin.jvm.internal.n.f(fullscreenInstance, "fullscreenInstance");
        this.f19712b.e().a().b(c());
        this.f19714d.onClosed();
    }
}
