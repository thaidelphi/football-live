package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfv extends y0 {

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicLong f13542l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c  reason: collision with root package name */
    private f0 f13543c;

    /* renamed from: d  reason: collision with root package name */
    private f0 f13544d;

    /* renamed from: e  reason: collision with root package name */
    private final PriorityBlockingQueue f13545e;

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue f13546f;

    /* renamed from: g  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f13547g;

    /* renamed from: h  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f13548h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f13549i;

    /* renamed from: j  reason: collision with root package name */
    private final Semaphore f13550j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f13551k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfv(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13549i = new Object();
        this.f13550j = new Semaphore(2);
        this.f13545e = new PriorityBlockingQueue();
        this.f13546f = new LinkedBlockingQueue();
        this.f13547g = new d0(this, "Thread death: Uncaught exception on worker thread");
        this.f13548h = new d0(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean w(zzfv zzfvVar) {
        boolean z10 = zzfvVar.f13551k;
        return false;
    }

    private final void y(e0 e0Var) {
        synchronized (this.f13549i) {
            this.f13545e.add(e0Var);
            f0 f0Var = this.f13543c;
            if (f0Var == null) {
                f0 f0Var2 = new f0(this, "Measurement Worker", this.f13545e);
                this.f13543c = f0Var2;
                f0Var2.setUncaughtExceptionHandler(this.f13547g);
                this.f13543c.start();
            } else {
                f0Var.b();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.x0
    public final void b() {
        if (Thread.currentThread() != this.f13544d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.x0
    public final void c() {
        if (Thread.currentThread() != this.f13543c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.y0
    protected final boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object m(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f13220a.zzaz().u(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                zzem r10 = this.f13220a.zzay().r();
                r10.a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f13220a.zzay().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future n(Callable callable) throws IllegalStateException {
        f();
        Preconditions.m(callable);
        e0 e0Var = new e0(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f13543c) {
            if (!this.f13545e.isEmpty()) {
                this.f13220a.zzay().r().a("Callable skipped the worker queue.");
            }
            e0Var.run();
        } else {
            y(e0Var);
        }
        return e0Var;
    }

    public final Future o(Callable callable) throws IllegalStateException {
        f();
        Preconditions.m(callable);
        e0 e0Var = new e0(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f13543c) {
            e0Var.run();
        } else {
            y(e0Var);
        }
        return e0Var;
    }

    public final void t(Runnable runnable) throws IllegalStateException {
        f();
        Preconditions.m(runnable);
        e0 e0Var = new e0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f13549i) {
            this.f13546f.add(e0Var);
            f0 f0Var = this.f13544d;
            if (f0Var == null) {
                f0 f0Var2 = new f0(this, "Measurement Network", this.f13546f);
                this.f13544d = f0Var2;
                f0Var2.setUncaughtExceptionHandler(this.f13548h);
                this.f13544d.start();
            } else {
                f0Var.b();
            }
        }
    }

    public final void u(Runnable runnable) throws IllegalStateException {
        f();
        Preconditions.m(runnable);
        y(new e0(this, runnable, false, "Task exception on worker thread"));
    }

    public final void v(Runnable runnable) throws IllegalStateException {
        f();
        Preconditions.m(runnable);
        y(new e0(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean x() {
        return Thread.currentThread() == this.f13543c;
    }
}
