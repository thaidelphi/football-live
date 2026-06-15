package com.adcolony.sdk;

import android.os.SystemClock;
import com.adcolony.sdk.e0;
import com.ironsource.ug;
import java.util.LinkedHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t0 {

    /* renamed from: b  reason: collision with root package name */
    private int f6267b;

    /* renamed from: c  reason: collision with root package name */
    private long f6268c;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6271f;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6274i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6275j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6276k;

    /* renamed from: l  reason: collision with root package name */
    private u0 f6277l;

    /* renamed from: a  reason: collision with root package name */
    private long f6266a = 1800000;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6269d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6270e = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6272g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6273h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            t0.this.f6275j = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f6279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f6280b;

        b(t0 t0Var, l lVar, k kVar) {
            this.f6279a = lVar;
            this.f6280b = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6279a.b();
            this.f6280b.q().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6281a;

        c(boolean z10) {
            this.f6281a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinkedHashMap<Integer, k0> d10 = com.adcolony.sdk.a.b().r().d();
            synchronized (d10) {
                for (k0 k0Var : d10.values()) {
                    f1 b10 = c0.b();
                    c0.b(b10, "from_window_focus", this.f6281a);
                    if (t0.this.f6273h && !t0.this.f6272g) {
                        c0.b(b10, "app_in_foreground", false);
                        t0.this.f6273h = false;
                    }
                    new h0("SessionInfo.on_pause", k0Var.getModuleId(), b10).c();
                }
            }
            com.adcolony.sdk.a.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6283a;

        d(boolean z10) {
            this.f6283a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            k b10 = com.adcolony.sdk.a.b();
            LinkedHashMap<Integer, k0> d10 = b10.r().d();
            synchronized (d10) {
                for (k0 k0Var : d10.values()) {
                    f1 b11 = c0.b();
                    c0.b(b11, "from_window_focus", this.f6283a);
                    if (t0.this.f6273h && t0.this.f6272g) {
                        c0.b(b11, "app_in_foreground", true);
                        t0.this.f6273h = false;
                    }
                    new h0("SessionInfo.on_resume", k0Var.getModuleId(), b11).c();
                }
            }
            b10.q().d();
        }
    }

    private void h() {
        a(false);
    }

    private void i() {
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z10) {
        k b10 = com.adcolony.sdk.a.b();
        if (this.f6271f) {
            return;
        }
        if (this.f6274i) {
            b10.c(false);
            this.f6274i = false;
        }
        this.f6267b = 0;
        this.f6268c = SystemClock.uptimeMillis();
        this.f6269d = true;
        this.f6271f = true;
        this.f6272g = true;
        this.f6273h = false;
        AdColony.c();
        if (z10) {
            f1 b11 = c0.b();
            c0.a(b11, ug.f21009x, z0.a());
            new h0("SessionInfo.on_start", 1, b11).c();
            l c10 = com.adcolony.sdk.a.b().r().c();
            if (c10 != null && !AdColony.a(new b(this, c10, b10))) {
                new e0.a().a("RejectedExecutionException on controller update.").a(e0.f5981i);
            }
        }
        b10.r().h();
        v.a().b();
    }

    public void d() {
        com.adcolony.sdk.a.a("SessionInfo.stopped", new a());
        this.f6277l = new u0(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f6269d;
    }

    public void f(boolean z10) {
        this.f6274i = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(boolean z10) {
        this.f6276k = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        s0 a10 = com.adcolony.sdk.a.b().q().a();
        this.f6271f = false;
        this.f6269d = false;
        if (a10 != null) {
            a10.b();
        }
        f1 b10 = c0.b();
        c0.a(b10, "session_length", (SystemClock.uptimeMillis() - this.f6268c) / 1000.0d);
        new h0("SessionInfo.on_stop", 1, b10).c();
        com.adcolony.sdk.a.f();
        AdColony.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z10) {
        if (this.f6272g != z10) {
            this.f6272g = z10;
            this.f6273h = true;
            if (z10) {
                return;
            }
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f6271f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f6276k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f6270e = true;
        this.f6277l.b();
        if (AdColony.a(new c(z10))) {
            return;
        }
        new e0.a().a("RejectedExecutionException on session pause.").a(e0.f5981i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z10) {
        this.f6270e = false;
        this.f6277l.c();
        if (AdColony.a(new d(z10))) {
            return;
        }
        new e0.a().a("RejectedExecutionException on session resume.").a(e0.f5981i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z10) {
        if (z10 && this.f6270e) {
            i();
        } else if (!z10 && !this.f6270e) {
            h();
        }
        this.f6269d = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f6266a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f6267b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10) {
        this.f6266a = i10 <= 0 ? this.f6266a : i10 * 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f6267b++;
    }
}
