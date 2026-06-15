package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class f<T> {

    /* renamed from: a  reason: collision with root package name */
    private Object f17343a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Timer f17344b;

    /* renamed from: c  reason: collision with root package name */
    protected long f17345c;

    /* renamed from: d  reason: collision with root package name */
    protected T f17346d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            f.this.b();
        }
    }

    public f() {
    }

    public f(long j10) {
        this.f17345c = j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(T t10) {
        if (a() || t10 == null) {
            return;
        }
        this.f17346d = t10;
        c();
        synchronized (this.f17343a) {
            Timer timer = new Timer();
            this.f17344b = timer;
            timer.schedule(new a(), this.f17345c);
        }
    }

    protected boolean a() {
        return this.f17345c <= 0;
    }

    protected abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        synchronized (this.f17343a) {
            Timer timer = this.f17344b;
            if (timer != null) {
                timer.cancel();
                this.f17344b = null;
            }
        }
    }

    public void d() {
        this.f17346d = null;
    }
}
