package com.applovin.impl.mediation;

import com.applovin.impl.w2;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7714a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f7715b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7716c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.d0 f7717d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void b(w2 w2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(com.applovin.impl.sdk.j jVar, a aVar) {
        this.f7714a = jVar;
        this.f7715b = jVar.I();
        this.f7716c = aVar;
    }

    public void a(final w2 w2Var, long j10) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f7715b;
            nVar.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j10 + "ms...");
        }
        this.f7717d = com.applovin.impl.d0.a(j10, this.f7714a, new Runnable() { // from class: com.applovin.impl.mediation.r
            @Override // java.lang.Runnable
            public final void run() {
                c.this.a(w2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(w2 w2Var) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f7715b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f7716c.b(w2Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f7715b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.d0 d0Var = this.f7717d;
        if (d0Var != null) {
            d0Var.a();
            this.f7717d = null;
        }
    }
}
