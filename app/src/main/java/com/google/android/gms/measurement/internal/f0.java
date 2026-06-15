package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f0 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final Object f12940a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue f12941b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12942c = false;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzfv f12943d;

    public f0(zzfv zzfvVar, String str, BlockingQueue blockingQueue) {
        this.f12943d = zzfvVar;
        Preconditions.m(str);
        Preconditions.m(blockingQueue);
        this.f12940a = new Object();
        this.f12941b = blockingQueue;
        setName(str);
    }

    private final void c() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        f0 f0Var;
        f0 f0Var2;
        obj = this.f12943d.f13549i;
        synchronized (obj) {
            if (!this.f12942c) {
                semaphore = this.f12943d.f13550j;
                semaphore.release();
                obj2 = this.f12943d.f13549i;
                obj2.notifyAll();
                zzfv zzfvVar = this.f12943d;
                f0Var = zzfvVar.f13543c;
                if (this == f0Var) {
                    zzfvVar.f13543c = null;
                } else {
                    f0Var2 = zzfvVar.f13544d;
                    if (this == f0Var2) {
                        zzfvVar.f13544d = null;
                    } else {
                        zzfvVar.f13220a.zzay().m().a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f12942c = true;
            }
        }
    }

    private final void d(InterruptedException interruptedException) {
        this.f12943d.f13220a.zzay().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void b() {
        synchronized (this.f12940a) {
            this.f12940a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.f12943d.f13550j;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e8) {
                d(e8);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                e0 e0Var = (e0) this.f12941b.poll();
                if (e0Var != null) {
                    Process.setThreadPriority(true != e0Var.f12910b ? 10 : threadPriority);
                    e0Var.run();
                } else {
                    synchronized (this.f12940a) {
                        if (this.f12941b.peek() == null) {
                            zzfv.w(this.f12943d);
                            try {
                                this.f12940a.wait(30000L);
                            } catch (InterruptedException e10) {
                                d(e10);
                            }
                        }
                    }
                    obj = this.f12943d.f13549i;
                    synchronized (obj) {
                        if (this.f12941b.peek() == null) {
                            c();
                            return;
                        }
                    }
                }
            }
        } finally {
            c();
        }
    }
}
