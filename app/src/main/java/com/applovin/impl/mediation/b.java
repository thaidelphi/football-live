package com.applovin.impl.mediation;

import com.applovin.impl.l2;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.w2;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements a.InterfaceC0125a, c.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7708a;

    /* renamed from: b  reason: collision with root package name */
    private final a f7709b;

    /* renamed from: c  reason: collision with root package name */
    private final c f7710c;

    public b(com.applovin.impl.sdk.j jVar) {
        this.f7708a = jVar;
        this.f7709b = new a(jVar);
        this.f7710c = new c(jVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void c(w2 w2Var) {
        g A;
        if (w2Var == null || (A = w2Var.A()) == null || !w2Var.w().compareAndSet(false, true)) {
            return;
        }
        l2.e(A.c(), w2Var);
    }

    public void a() {
        this.f7710c.a();
        this.f7709b.a();
    }

    @Override // com.applovin.impl.mediation.c.a
    public void b(w2 w2Var) {
        c(w2Var);
    }

    public void e(w2 w2Var) {
        long n02 = w2Var.n0();
        if (n02 >= 0) {
            this.f7710c.a(w2Var, n02);
        }
        boolean parseBoolean = Boolean.parseBoolean(this.f7708a.f0().getExtraParameters().get("should_schedule_ad_hidden_on_ad_destroy"));
        if (w2Var.w0() || w2Var.x0() || parseBoolean) {
            this.f7709b.a(parseBoolean);
            this.f7709b.a(w2Var, this);
        }
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0125a
    public void a(final w2 w2Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.q
            @Override // java.lang.Runnable
            public final void run() {
                b.this.c(w2Var);
            }
        }, w2Var.m0());
    }
}
