package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o2;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class q2 {

    /* renamed from: a  reason: collision with root package name */
    private final o2 f19814a;

    /* renamed from: b  reason: collision with root package name */
    private final fm f19815b;

    /* renamed from: c  reason: collision with root package name */
    private final wl f19816c = c();

    /* renamed from: d  reason: collision with root package name */
    private Timer f19817d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q2.this.f19815b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            q2.this.f19815b.b();
        }
    }

    public q2(o2 o2Var, fm fmVar) {
        this.f19814a = o2Var;
        this.f19815b = fmVar;
    }

    private synchronized void b(long j10) {
        j();
        Timer timer = new Timer();
        this.f19817d = timer;
        timer.schedule(new b(), j10);
    }

    private wl c() {
        return new wl(new a(), com.ironsource.lifecycle.b.d(), new yu());
    }

    private synchronized void j() {
        Timer timer = this.f19817d;
        if (timer != null) {
            timer.cancel();
            this.f19817d = null;
        }
    }

    public void a() {
        if (this.f19814a.a() == o2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(long j10) {
        wl wlVar = this.f19816c;
        if (wlVar != null) {
            wlVar.a(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o2 b() {
        return this.f19814a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d() {
        return this.f19814a.c() > 0;
    }

    public void e() {
        if (this.f19814a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f19814a.c());
        }
    }

    public void f() {
        if (this.f19814a.a() == o2.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f19814a.d());
        }
    }

    public void g() {
        if (this.f19814a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f19814a.a() != o2.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f19814a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.f19814a.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
        wl wlVar = this.f19816c;
        if (wlVar != null) {
            wlVar.b();
        }
    }

    public void k() {
        if (this.f19814a.a() != o2.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f19814a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f19814a.b());
    }
}
