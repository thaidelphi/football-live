package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class wl {

    /* renamed from: g  reason: collision with root package name */
    private static final String f21303g = "wl";

    /* renamed from: a  reason: collision with root package name */
    private final com.ironsource.lifecycle.b f21304a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f21305b;

    /* renamed from: c  reason: collision with root package name */
    private final yu f21306c;

    /* renamed from: e  reason: collision with root package name */
    private Timer f21308e;

    /* renamed from: d  reason: collision with root package name */
    private final Object f21307d = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final nk f21309f = new a();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements nk {
        a() {
        }

        @Override // com.ironsource.nk
        public void a() {
        }

        @Override // com.ironsource.nk
        public void b() {
            wl.this.f21306c.c(System.currentTimeMillis());
            wl.this.c();
        }

        @Override // com.ironsource.nk
        public void c() {
            wl.this.f21306c.b(System.currentTimeMillis());
            wl wlVar = wl.this;
            wlVar.b(wlVar.f21306c.a());
        }

        @Override // com.ironsource.nk
        public void d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            wl.this.f21304a.b(wl.this.f21309f);
            wl.this.f21306c.b();
            wl.this.f21305b.run();
        }
    }

    public wl(Runnable runnable, com.ironsource.lifecycle.b bVar, yu yuVar) {
        this.f21305b = runnable;
        this.f21304a = bVar;
        this.f21306c = yuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j10) {
        synchronized (this.f21307d) {
            c();
            Timer timer = new Timer();
            this.f21308e = timer;
            timer.schedule(new b(), j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f21307d) {
            Timer timer = this.f21308e;
            if (timer != null) {
                timer.cancel();
                this.f21308e = null;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void a(long j10) {
        if (j10 < 0) {
            Log.d(f21303g, "cannot start timer with delay < 0");
            return;
        }
        this.f21304a.a(this.f21309f);
        this.f21306c.a(j10);
        if (this.f21304a.e()) {
            this.f21306c.c(System.currentTimeMillis());
        } else {
            b(j10);
        }
    }

    public void b() {
        c();
        this.f21304a.b(this.f21309f);
        this.f21306c.b();
    }
}
