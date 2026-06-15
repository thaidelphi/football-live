package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.d7;
import com.applovin.impl.w2;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends com.applovin.impl.b {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.c f7573a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f7574b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7575c;

    /* renamed from: d  reason: collision with root package name */
    private InterfaceC0125a f7576d;

    /* renamed from: e  reason: collision with root package name */
    private w2 f7577e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7578f;

    /* renamed from: g  reason: collision with root package name */
    private int f7579g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7580h;

    /* renamed from: com.applovin.impl.mediation.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0125a {
        void a(w2 w2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(com.applovin.impl.sdk.j jVar) {
        this.f7574b = jVar.I();
        this.f7573a = jVar.e();
        this.f7575c = d7.a(com.applovin.impl.sdk.j.m(), "AdActivityObserver", jVar);
    }

    public void a(boolean z10) {
        this.f7578f = z10;
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f7575c) && (this.f7577e.x0() || this.f7578f)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f7574b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f7576d != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f7574b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f7576d.a(this.f7577e);
            }
            a();
            return;
        }
        if (!this.f7580h) {
            this.f7580h = true;
        }
        this.f7579g++;
        if (com.applovin.impl.sdk.n.a()) {
            this.f7574b.a("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f7579g);
        }
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f7580h) {
            this.f7579g--;
            if (com.applovin.impl.sdk.n.a()) {
                this.f7574b.a("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f7579g);
            }
            if (this.f7579g <= 0) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f7574b.a("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.f7576d != null) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f7574b.a("AdActivityObserver", "Invoking callback...");
                    }
                    this.f7576d.a(this.f7577e);
                }
                a();
            }
        }
    }

    public void a(w2 w2Var, InterfaceC0125a interfaceC0125a) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f7574b;
            nVar.a("AdActivityObserver", "Starting for ad " + w2Var.getAdUnitId() + "...");
        }
        a();
        this.f7576d = interfaceC0125a;
        this.f7577e = w2Var;
        this.f7573a.a(this);
    }

    public void a() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f7574b.a("AdActivityObserver", "Cancelling...");
        }
        this.f7573a.b(this);
        this.f7576d = null;
        this.f7577e = null;
        this.f7579g = 0;
        this.f7580h = false;
    }
}
