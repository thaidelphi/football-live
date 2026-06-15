package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.m7;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.n7;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class l7<Smash extends m7<?>, Listener extends AdapterAdInteractionListener> extends n7<Smash, Listener> implements j2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f18162a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Placement f18163b;

        a(Activity activity, Placement placement) {
            this.f18162a = activity;
            this.f18163b = placement;
        }

        @Override // com.ironsource.hr
        public void a() {
            l7.this.b(this.f18162a, this.f18163b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l7(u0 u0Var, qk qkVar, IronSourceSegment ironSourceSegment) {
        super(u0Var, qkVar, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l7(xf xfVar, wf wfVar, u0 u0Var, qk qkVar, IronSourceSegment ironSourceSegment) {
        super(xfVar, wfVar, u0Var, qkVar, ironSourceSegment);
    }

    private String a(List<Smash> list) {
        StringBuilder sb = new StringBuilder();
        for (Smash smash : list) {
            if (smash.e() != null) {
                sb.append(smash.c());
                sb.append(":");
                sb.append(smash.e());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private void a(Activity activity, m7<?> m7Var, Placement placement) {
        if (this.f19360o.h().e()) {
            this.f19363r.a();
        }
        m7Var.a(activity, placement);
    }

    private void a(Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.b(true);
                return;
            }
            smash2.b(false);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(b(smash2.k() + " - not ready to show"));
        }
    }

    private void a(IronSourceError ironSourceError, m7<?> m7Var, String str) {
        this.f19364s.f17170j.a(n(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f19362q.g();
        this.f19365t.a(ironSourceError, m7Var != null ? m7Var.f() : null);
        if (this.f19360o.h().e()) {
            b(false);
        }
    }

    private void a(IronSourceError ironSourceError, String str) {
        a(ironSourceError, (m7<?>) null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(Activity activity, Placement placement) {
        m7 m7Var;
        IronSourceError ironSourceError;
        String a10;
        IronLog.INTERNAL.verbose(b("state = " + this.f19361p));
        synchronized (this.f19369x) {
            this.f19354i = placement;
            this.f19364s.f17170j.a(activity, n());
            n7.f fVar = this.f19361p;
            n7.f fVar2 = n7.f.SHOWING;
            m7Var = null;
            if (fVar == fVar2) {
                ironSourceError = new IronSourceError(a2.g(this.f19360o.b()), "can't show ad while an ad is already showing");
            } else if (fVar != n7.f.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
            } else if (placement == null) {
                ironSourceError = new IronSourceError(a2.b(this.f19360o.b()), "empty default placement");
            } else if (this.E.b(ContextProvider.getInstance().getApplicationContext(), placement, this.f19360o.b())) {
                ironSourceError = new IronSourceError(a2.f(this.f19360o.b()), "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(b(ironSourceError.getErrorMessage()));
                a10 = "";
            } else {
                List b10 = this.f19346a.b();
                fw fwVar = new fw(this.f19360o);
                m7Var = (m7) fwVar.c(b10);
                a((l7<Smash, Listener>) m7Var, (List<l7<Smash, Listener>>) fwVar.b(b10));
                if (m7Var != null) {
                    a(fVar2);
                    i(m7Var);
                } else {
                    ironSourceError = ErrorBuilder.buildNoAdsToShowError(this.f19360o.b().toString());
                    a10 = a(b10);
                }
            }
            a(ironSourceError, a10);
        }
        if (m7Var != null) {
            a(activity, m7Var, this.f19354i);
        }
    }

    public void a(Activity activity, Placement placement) {
        if (c()) {
            a(new a(activity, placement));
        } else {
            b(activity, placement);
        }
    }

    @Override // com.ironsource.j2
    public void a(m7<?> m7Var) {
        IronLog.INTERNAL.verbose(b(m7Var.k()));
        if (this.f19361p == n7.f.SHOWING) {
            a(n7.f.READY_TO_LOAD);
        }
        this.f19362q.f();
        this.f19365t.a(m7Var.f());
    }

    @Override // com.ironsource.j2
    public void a(IronSourceError ironSourceError, m7<?> m7Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(m7Var.k() + " - error = " + ironSourceError));
        this.f19347b.put(m7Var.c(), h.a.ISAuctionPerformanceFailedToShow);
        a(n7.f.READY_TO_LOAD);
        a(ironSourceError, m7Var, "");
    }

    @Override // com.ironsource.j2
    public void b(m7<?> m7Var) {
        IronLog.INTERNAL.verbose(b(m7Var.k()));
        this.f19365t.g(m7Var.f());
    }

    @Override // com.ironsource.j2
    public void c(m7<?> m7Var) {
        IronLog.INTERNAL.verbose(b(m7Var.k()));
        this.f19365t.a();
    }

    @Override // com.ironsource.j2
    public String d() {
        StringBuilder sb = new StringBuilder();
        if (this.f19361p == n7.f.READY_TO_SHOW) {
            for (m7 m7Var : this.f19346a.b()) {
                if (m7Var.y()) {
                    sb.append(m7Var.c());
                    sb.append(";");
                }
            }
        }
        return sb.toString();
    }

    @Override // com.ironsource.j2
    public void d(m7<?> m7Var) {
        IronLog.INTERNAL.verbose(b(m7Var.k()));
        this.f19365t.b();
    }

    @Override // com.ironsource.n7
    public boolean u() {
        if (x()) {
            if (!this.f19355j || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
                for (m7 m7Var : this.f19346a.b()) {
                    if (m7Var.B()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ironsource.n7
    protected boolean v() {
        return false;
    }
}
