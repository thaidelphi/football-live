package d9;

import d9.l1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* compiled from: DefaultExecutor.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class u0 extends l1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h  reason: collision with root package name */
    public static final u0 f24520h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f24521i;

    static {
        Long l10;
        u0 u0Var = new u0();
        f24520h = u0Var;
        k1.Q0(u0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f24521i = timeUnit.toNanos(l10.longValue());
    }

    private u0() {
    }

    private final synchronized void m1() {
        if (p1()) {
            debugStatus = 3;
            g1();
            kotlin.jvm.internal.n.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread n1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean o1() {
        return debugStatus == 4;
    }

    private final boolean p1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean q1() {
        if (p1()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.n.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void r1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // d9.m1
    protected Thread W0() {
        Thread thread = _thread;
        return thread == null ? n1() : thread;
    }

    @Override // d9.l1, d9.y0
    public g1 X(long j10, Runnable runnable, m8.g gVar) {
        return j1(j10, runnable);
    }

    @Override // d9.m1
    protected void X0(long j10, l1.c cVar) {
        r1();
    }

    @Override // d9.l1
    public void c1(Runnable runnable) {
        if (o1()) {
            r1();
        }
        super.c1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean e12;
        w2.f24526a.d(this);
        c.a();
        try {
            if (!q1()) {
                if (e12) {
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long T0 = T0();
                if (T0 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f24521i + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        m1();
                        c.a();
                        if (e1()) {
                            return;
                        }
                        W0();
                        return;
                    }
                    T0 = y8.i.d(T0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (T0 > 0) {
                    if (p1()) {
                        _thread = null;
                        m1();
                        c.a();
                        if (e1()) {
                            return;
                        }
                        W0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, T0);
                }
            }
        } finally {
            _thread = null;
            m1();
            c.a();
            if (!e1()) {
                W0();
            }
        }
    }

    @Override // d9.l1, d9.k1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
