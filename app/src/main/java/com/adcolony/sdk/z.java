package com.adcolony.sdk;

import com.adcolony.sdk.e0;
import com.adcolony.sdk.z0;
import java.util.Date;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6410a = true;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f6411b = new a();

    /* renamed from: c  reason: collision with root package name */
    private Runnable f6412c;

    /* renamed from: d  reason: collision with root package name */
    private c f6413d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            new h0("AdColony.heartbeat", 1).c();
            z.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z0.c f6415a;

        b(z0.c cVar) {
            this.f6415a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f6412c = null;
            if (com.adcolony.sdk.a.d()) {
                k b10 = com.adcolony.sdk.a.b();
                if (this.f6415a.a() && b10.I()) {
                    b10.a();
                    e0.a a10 = new e0.a().a("Controller heartbeat timeout occurred. ");
                    e0.a a11 = a10.a("Timeout set to: " + this.f6415a.b() + " ms. ");
                    a11.a("Interval set to: " + b10.h() + " ms. ").a("Heartbeat last reply: ").a(z.this.f6413d).a(e0.f5981i);
                    z.this.a();
                } else if (b10.F()) {
                    z.this.a();
                } else {
                    z0.a(z.this.f6411b, b10.h());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final f1 f6417a;

        /* synthetic */ c(f1 f1Var, a aVar) {
            this(f1Var);
        }

        public String toString() {
            return this.f6417a.toString();
        }

        private c(f1 f1Var) {
            f1 m7 = f1Var != null ? f1Var.m("payload") : c0.b();
            this.f6417a = m7;
            c0.a(m7, "heartbeatLastTimestamp", f0.f5987e.format(new Date()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (com.adcolony.sdk.a.d()) {
            z0.c cVar = new z0.c(com.adcolony.sdk.a.b().i());
            b bVar = new b(cVar);
            this.f6412c = bVar;
            z0.a(bVar, cVar.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        a();
        this.f6410a = false;
        z0.a(this.f6411b, com.adcolony.sdk.a.b().h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f6410a = true;
        z0.c(this.f6411b);
        z0.c(this.f6412c);
        this.f6412c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(h0 h0Var) {
        if (!com.adcolony.sdk.a.d() || this.f6410a) {
            return;
        }
        this.f6413d = new c(h0Var.a(), null);
        Runnable runnable = this.f6412c;
        if (runnable != null) {
            z0.c(runnable);
            z0.b(this.f6412c);
            return;
        }
        z0.c(this.f6411b);
        z0.a(this.f6411b, com.adcolony.sdk.a.b().h());
    }
}
