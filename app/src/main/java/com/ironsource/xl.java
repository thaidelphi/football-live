package com.ironsource;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class xl implements nk {

    /* renamed from: b  reason: collision with root package name */
    private Timer f21406b;

    /* renamed from: e  reason: collision with root package name */
    private long f21409e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f21410f;

    /* renamed from: a  reason: collision with root package name */
    private String f21405a = "INTERNAL";

    /* renamed from: c  reason: collision with root package name */
    private boolean f21407c = false;

    /* renamed from: d  reason: collision with root package name */
    private Long f21408d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            xl.this.f21410f.run();
        }
    }

    public xl(long j10, Runnable runnable, boolean z10) {
        this.f21409e = j10;
        this.f21410f = runnable;
        if (z10) {
            g();
        }
    }

    private synchronized void f() {
        Timer timer = this.f21406b;
        if (timer != null) {
            timer.cancel();
            this.f21406b = null;
        }
    }

    private synchronized void h() {
        if (this.f21406b == null) {
            Timer timer = new Timer();
            this.f21406b = timer;
            timer.schedule(new a(), this.f21409e);
            Calendar.getInstance().setTimeInMillis(this.f21408d.longValue());
        }
    }

    @Override // com.ironsource.nk
    public void a() {
    }

    @Override // com.ironsource.nk
    public void b() {
        if (this.f21406b != null) {
            f();
        }
    }

    @Override // com.ironsource.nk
    public void c() {
        Long l10;
        if (this.f21406b == null && (l10 = this.f21408d) != null) {
            long longValue = l10.longValue() - System.currentTimeMillis();
            this.f21409e = longValue;
            if (longValue > 0) {
                h();
                return;
            }
            e();
            this.f21410f.run();
        }
    }

    @Override // com.ironsource.nk
    public void d() {
    }

    public void e() {
        f();
        this.f21407c = false;
        this.f21408d = null;
        com.ironsource.lifecycle.b.d().b(this);
    }

    public void g() {
        if (this.f21407c) {
            return;
        }
        this.f21407c = true;
        com.ironsource.lifecycle.b.d().a(this);
        this.f21408d = Long.valueOf(System.currentTimeMillis() + this.f21409e);
        if (com.ironsource.lifecycle.b.d().e()) {
            return;
        }
        h();
    }
}
