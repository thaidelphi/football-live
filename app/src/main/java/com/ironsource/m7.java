package com.ironsource;

import android.app.Activity;
import com.ironsource.j2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.q7;
import java.util.Locale;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class m7<Listener extends j2> extends q7<Listener> implements AdapterAdInteractionListener {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends hr {
        a() {
        }

        @Override // com.ironsource.hr
        public void a() {
            m7.this.P();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b extends hr {
        b() {
        }

        @Override // com.ironsource.hr
        public void a() {
            m7.this.S();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c extends hr {
        c() {
        }

        @Override // com.ironsource.hr
        public void a() {
            m7.this.Q();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d extends hr {
        d() {
        }

        @Override // com.ironsource.hr
        public void a() {
            m7.this.T();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class e extends hr {
        e() {
        }

        @Override // com.ironsource.hr
        public void a() {
            m7.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class f extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f18450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f18451b;

        f(int i10, String str) {
            this.f18450a = i10;
            this.f18451b = str;
        }

        @Override // com.ironsource.hr
        public void a() {
            m7.this.b(this.f18450a, this.f18451b);
        }
    }

    public m7(tp tpVar, m1 m1Var, BaseAdAdapter<?, ?> baseAdAdapter, c3 c3Var, m5 m5Var, Listener listener) {
        super(tpVar, m1Var, baseAdAdapter, c3Var, m5Var, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.f19857q) {
            if (this.f19845e != q7.h.SHOWING) {
                ironLog.error("unexpected ad closed for " + k() + " - state = " + this.f19845e);
                e2 e2Var = this.f19844d;
                if (e2Var != null) {
                    e2Var.f17171k.k("unexpected ad closed - state = " + this.f19845e);
                }
                return;
            }
            a(q7.h.NONE);
            if (this.f19844d != null) {
                String str2 = "";
                if (this.f19841a.a() == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    String d10 = ((j2) this.f19842b).d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("otherInstanceAvailable = ");
                    if (d10.length() > 0) {
                        str = "true|" + d10;
                    } else {
                        str = "false";
                    }
                    sb.append(str);
                    str2 = sb.toString();
                }
                this.f19844d.f17170j.a(j(), str2);
            }
            ((j2) this.f19842b).a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IronLog.INTERNAL.verbose(d());
        e2 e2Var = this.f19844d;
        if (e2Var != null) {
            e2Var.f17170j.d(j());
        }
        ((j2) this.f19842b).c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        IronLog.INTERNAL.verbose(d());
        e2 e2Var = this.f19844d;
        if (e2Var != null) {
            e2Var.f17170j.l(j());
        }
        ((j2) this.f19842b).b((m7<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        IronLog.INTERNAL.verbose(d());
        e2 e2Var = this.f19844d;
        if (e2Var != null) {
            e2Var.f17170j.i(j());
        }
        ((j2) this.f19842b).d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        IronLog.INTERNAL.verbose(d());
        e2 e2Var = this.f19844d;
        if (e2Var != null) {
            e2Var.f17170j.k(j());
        }
    }

    static String a(q7.h hVar, int i10, String str) {
        return String.format(Locale.ENGLISH, "unexpected show failed, state - %s, error - %d %s", hVar, Integer.valueOf(i10), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        q7.h hVar = this.f19845e;
        if (hVar == q7.h.SHOWING) {
            a(q7.h.FAILED);
            e2 e2Var = this.f19844d;
            if (e2Var != null) {
                e2Var.f17170j.a(j(), i10, str, "");
            }
            ((j2) this.f19842b).a(new IronSourceError(i10, str), (m7<?>) this);
            return;
        }
        String a10 = a(hVar, i10, str);
        ironLog.error(a(a10));
        e2 e2Var2 = this.f19844d;
        if (e2Var2 != null) {
            e2Var2.f17171k.s(a10);
        }
    }

    @Override // com.ironsource.q7
    public boolean B() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter;
        if (this.f19851k == null || !y()) {
            return false;
        }
        try {
            baseAdAdapter = this.f19843c;
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "isReadyToShow - exception = " + th.getMessage() + " - state = " + this.f19845e;
            IronLog.INTERNAL.error(a(str));
            e2 e2Var = this.f19844d;
            if (e2Var != null) {
                e2Var.f17171k.g(str);
            }
        }
        if (baseAdAdapter instanceof AdapterAdFullScreenInterface) {
            return ((AdapterAdFullScreenInterface) baseAdAdapter).isAdAvailable(this.f19851k);
        }
        IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
        e2 e2Var2 = this.f19844d;
        if (e2Var2 != null) {
            e2Var2.f17171k.g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
        }
        return false;
    }

    public void a(Activity activity, Placement placement) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + placement.getPlacementName()));
        try {
            this.f19847g = placement;
            a(q7.h.SHOWING);
            this.f19844d.f17170j.a(activity, j());
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f19843c;
            if (baseAdAdapter instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) baseAdAdapter).showAd(this.f19851k, this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                e2 e2Var = this.f19844d;
                if (e2Var != null) {
                    e2Var.f17171k.g("showAd - adapter not instance of AdapterAdFullScreenInterface");
                }
            }
        } catch (Throwable th) {
            o9.d().a(th);
            a(q7.h.FAILED);
            String str = "showAd - exception = " + th.getMessage() + " - state = " + this.f19845e;
            IronLog.INTERNAL.error(a(str));
            e2 e2Var2 = this.f19844d;
            if (e2Var2 != null) {
                e2Var2.f17171k.g(str);
            }
            onAdShowFailed(a2.h(this.f19841a.a()), str);
        }
    }

    public void b(boolean z10) {
        e2 e2Var = this.f19844d;
        if (e2Var != null) {
            e2Var.f17170j.a(z10);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (u().c()) {
            u().a(new a());
        } else {
            P();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (u().c()) {
            u().a(new c());
        } else {
            Q();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i10, String str) {
        if (u().c()) {
            u().a(new f(i10, str));
        } else {
            b(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        if (u().c()) {
            u().a(new e());
        } else {
            R();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (u().c()) {
            u().a(new b());
        } else {
            S();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (u().c()) {
            u().a(new d());
        } else {
            T();
        }
    }
}
