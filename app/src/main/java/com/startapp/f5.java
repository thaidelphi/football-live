package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.startapp.hb;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f5 {

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicInteger f21940g = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f21941a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f21942b;

    /* renamed from: c  reason: collision with root package name */
    public Thread f21943c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f21944d;

    /* renamed from: e  reason: collision with root package name */
    public long f21945e;

    /* renamed from: f  reason: collision with root package name */
    public int f21946f;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            f5 f5Var = f5.this;
            synchronized (f5Var) {
                f5Var.f21944d = true;
                f5Var.notifyAll();
            }
            return true;
        }
    }

    public f5(Looper looper) {
        this.f21941a = new Handler(looper, new a());
        this.f21942b = new Handler(looper);
    }

    public final synchronized void a(hb.a aVar) {
        if (this.f21943c != null) {
            return;
        }
        g5 g5Var = new g5(this, aVar);
        Thread thread = new Thread(g5Var, "startapp-lid-" + f21940g.incrementAndGet());
        this.f21943c = thread;
        thread.start();
    }

    public final void a(Runnable runnable) {
        boolean z10;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                long j10 = -SystemClock.elapsedRealtime();
                synchronized (this) {
                    this.f21944d = false;
                    this.f21941a.sendEmptyMessage(0);
                    wait(2000L);
                    z10 = !this.f21944d;
                }
                long elapsedRealtime = j10 + SystemClock.elapsedRealtime();
                int i10 = this.f21946f;
                if (i10 < 8) {
                    this.f21946f = i10 + 1;
                    this.f21945e += elapsedRealtime;
                } else {
                    long j11 = this.f21945e;
                    this.f21945e = (elapsedRealtime - (j11 / i10)) + j11;
                }
                if (z10) {
                    this.f21945e = 0L;
                    this.f21946f = 0;
                    synchronized (this) {
                        wait(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
                    }
                } else if (this.f21945e < 160) {
                    this.f21942b.post(runnable);
                    this.f21945e = 0L;
                    this.f21946f = 0;
                    return;
                } else {
                    synchronized (this) {
                        wait(200L);
                    }
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                l3.a(th);
                return;
            }
        }
    }
}
