package m1;

import androidx.work.p;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: WorkTimer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o {

    /* renamed from: f  reason: collision with root package name */
    private static final String f27679f = p.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f27680a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f27681b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, c> f27682c;

    /* renamed from: d  reason: collision with root package name */
    final Map<String, b> f27683d;

    /* renamed from: e  reason: collision with root package name */
    final Object f27684e;

    /* compiled from: WorkTimer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private int f27685a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f27685a);
            this.f27685a = this.f27685a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final o f27687a;

        /* renamed from: b  reason: collision with root package name */
        private final String f27688b;

        c(o oVar, String str) {
            this.f27687a = oVar;
            this.f27688b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f27687a.f27684e) {
                if (this.f27687a.f27682c.remove(this.f27688b) != null) {
                    b remove = this.f27687a.f27683d.remove(this.f27688b);
                    if (remove != null) {
                        remove.a(this.f27688b);
                    }
                } else {
                    p.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f27688b), new Throwable[0]);
                }
            }
        }
    }

    public o() {
        a aVar = new a();
        this.f27680a = aVar;
        this.f27682c = new HashMap();
        this.f27683d = new HashMap();
        this.f27684e = new Object();
        this.f27681b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f27681b.isShutdown()) {
            return;
        }
        this.f27681b.shutdownNow();
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f27684e) {
            p.c().a(f27679f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f27682c.put(str, cVar);
            this.f27683d.put(str, bVar);
            this.f27681b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f27684e) {
            if (this.f27682c.remove(str) != null) {
                p.c().a(f27679f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f27683d.remove(str);
            }
        }
    }
}
