package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class y6 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9767a;

    /* renamed from: b  reason: collision with root package name */
    private Timer f9768b;

    /* renamed from: c  reason: collision with root package name */
    private long f9769c;

    /* renamed from: d  reason: collision with root package name */
    private long f9770d;

    /* renamed from: e  reason: collision with root package name */
    private long f9771e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9772f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f9773g;

    /* renamed from: h  reason: collision with root package name */
    private long f9774h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f9775i = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                y6.this.f9773g.run();
                synchronized (y6.this.f9775i) {
                    if (!y6.this.f9772f) {
                        y6.this.f9768b = null;
                    } else {
                        y6.this.f9769c = System.currentTimeMillis();
                        y6 y6Var = y6.this;
                        y6Var.f9770d = y6Var.f9771e;
                    }
                }
            } catch (Throwable th) {
                try {
                    if (y6.this.f9767a != null) {
                        y6.this.f9767a.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            y6.this.f9767a.I().a("Timer", "Encountered error while executing timed task", th);
                        }
                        y6.this.f9767a.D().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (y6.this.f9775i) {
                        if (!y6.this.f9772f) {
                            y6.this.f9768b = null;
                        } else {
                            y6.this.f9769c = System.currentTimeMillis();
                            y6 y6Var2 = y6.this;
                            y6Var2.f9770d = y6Var2.f9771e;
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (y6.this.f9775i) {
                        if (!y6.this.f9772f) {
                            y6.this.f9768b = null;
                        } else {
                            y6.this.f9769c = System.currentTimeMillis();
                            y6 y6Var3 = y6.this;
                            y6Var3.f9770d = y6Var3.f9771e;
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    private y6(com.applovin.impl.sdk.j jVar, Runnable runnable) {
        this.f9767a = jVar;
        this.f9773g = runnable;
    }

    public long c() {
        if (this.f9768b != null) {
            return this.f9770d - (System.currentTimeMillis() - this.f9769c);
        }
        return this.f9770d - this.f9774h;
    }

    public void d() {
        synchronized (this.f9775i) {
            Timer timer = this.f9768b;
            if (timer != null) {
                timer.cancel();
                this.f9774h = Math.max(1L, System.currentTimeMillis() - this.f9769c);
                this.f9768b = null;
            }
        }
    }

    public void e() {
        synchronized (this.f9775i) {
            long j10 = this.f9774h;
            if (j10 > 0) {
                long j11 = this.f9770d - j10;
                this.f9770d = j11;
                if (j11 < 0) {
                    this.f9770d = 0L;
                }
                this.f9768b = new Timer();
                a(b(), this.f9770d, this.f9772f, this.f9771e);
                this.f9769c = System.currentTimeMillis();
                this.f9774h = 0L;
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static y6 a(long j10, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        return a(j10, false, jVar, runnable);
    }

    public static y6 a(long j10, boolean z10, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j10 + ".");
        } else if (runnable != null) {
            y6 y6Var = new y6(jVar, runnable);
            y6Var.f9769c = System.currentTimeMillis();
            y6Var.f9770d = j10;
            y6Var.f9772f = z10;
            y6Var.f9771e = j10;
            try {
                y6Var.f9768b = new Timer();
                y6Var.a(y6Var.b(), j10, z10, y6Var.f9771e);
            } catch (OutOfMemoryError e8) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("Timer", "Failed to create timer due to OOM error", e8);
                }
            }
            return y6Var;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }

    public void a() {
        synchronized (this.f9775i) {
            Timer timer = this.f9768b;
            if (timer != null) {
                timer.cancel();
                this.f9768b = null;
                this.f9774h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j10, boolean z10, long j11) {
        if (z10) {
            this.f9768b.schedule(timerTask, j10, j11);
        } else {
            this.f9768b.schedule(timerTask, j10);
        }
    }
}
