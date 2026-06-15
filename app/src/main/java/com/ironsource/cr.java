package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class cr {

    /* renamed from: a  reason: collision with root package name */
    private o5 f16900a;

    /* renamed from: b  reason: collision with root package name */
    private dr f16901b;

    /* renamed from: c  reason: collision with root package name */
    private Timer f16902c = null;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            cr.this.f16901b.b();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            cr.this.f16901b.b();
        }
    }

    public cr(o5 o5Var, dr drVar) {
        this.f16900a = o5Var;
        this.f16901b = drVar;
    }

    private void d() {
        Timer timer = this.f16902c;
        if (timer != null) {
            timer.cancel();
            this.f16902c = null;
        }
    }

    public synchronized void a() {
        d();
        Timer timer = new Timer();
        this.f16902c = timer;
        timer.schedule(new b(), this.f16900a.b());
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.f16901b.b();
    }

    public synchronized void c() {
        d();
        Timer timer = new Timer();
        this.f16902c = timer;
        timer.schedule(new a(), this.f16900a.j());
    }
}
