package com.applovin.impl;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u5 {

    /* renamed from: o  reason: collision with root package name */
    private static final ExecutorService f9330o = Executors.newFixedThreadPool(4);

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9331a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f9332b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f9333c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f9334d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f9335e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f9336f;

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f9337g;

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f9338h;

    /* renamed from: i  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f9339i;

    /* renamed from: j  reason: collision with root package name */
    private final Map f9340j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final List f9341k = new ArrayList(5);

    /* renamed from: l  reason: collision with root package name */
    private final Object f9342l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private boolean f9343m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9344n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9345a;

        static {
            int[] iArr = new int[b.values().length];
            f9345a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9345a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9345a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9345a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final String f9352a;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                com.applovin.impl.sdk.n unused = u5.this.f9332b;
                if (com.applovin.impl.sdk.n.a()) {
                    u5.this.f9332b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        c(String str) {
            this.f9352a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f9352a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) u5.this.f9331a.a(o4.R)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final com.applovin.impl.sdk.j f9355a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9356b;

        /* renamed from: c  reason: collision with root package name */
        private final com.applovin.impl.sdk.n f9357c;

        /* renamed from: d  reason: collision with root package name */
        private final z4 f9358d;

        /* renamed from: e  reason: collision with root package name */
        private final b f9359e;

        public d(com.applovin.impl.sdk.j jVar, z4 z4Var, b bVar) {
            this.f9355a = jVar;
            this.f9357c = jVar.I();
            this.f9356b = z4Var.c();
            this.f9358d = z4Var;
            this.f9359e = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " queue finished task "
                com.applovin.impl.l0.a()     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.sdk.j r1 = r6.f9355a     // Catch: java.lang.Throwable -> L80
                boolean r1 = r1.v0()     // Catch: java.lang.Throwable -> L80
                if (r1 == 0) goto L35
                com.applovin.impl.z4 r1 = r6.f9358d     // Catch: java.lang.Throwable -> L80
                boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L80
                if (r1 == 0) goto L16
                goto L35
            L16:
                boolean r1 = com.applovin.impl.sdk.n.a()     // Catch: java.lang.Throwable -> L80
                if (r1 == 0) goto L25
                com.applovin.impl.sdk.n r1 = r6.f9357c     // Catch: java.lang.Throwable -> L80
                java.lang.String r2 = r6.f9356b     // Catch: java.lang.Throwable -> L80
                java.lang.String r3 = "Task re-scheduled..."
                r1.d(r2, r3)     // Catch: java.lang.Throwable -> L80
            L25:
                com.applovin.impl.sdk.j r1 = r6.f9355a     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.u5 r1 = r1.i0()     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.z4 r2 = r6.f9358d     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.u5$b r3 = r6.f9359e     // Catch: java.lang.Throwable -> L80
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L80
                goto L58
            L35:
                com.applovin.impl.z4 r1 = r6.f9358d     // Catch: java.lang.Throwable -> L80
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.sdk.j r3 = r6.f9355a     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.o4 r4 = com.applovin.impl.o4.f8250x     // Catch: java.lang.Throwable -> L80
                java.lang.Object r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L80
                java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L80
                long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L80
                java.util.concurrent.ScheduledFuture r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> L80
                com.applovin.impl.z4 r2 = r6.f9358d     // Catch: java.lang.Throwable -> L80
                r2.run()     // Catch: java.lang.Throwable -> L80
                if (r1 == 0) goto L58
                r2 = 0
                r1.cancel(r2)     // Catch: java.lang.Throwable -> L80
            L58:
                boolean r1 = com.applovin.impl.sdk.n.a()
                if (r1 == 0) goto Lbc
                com.applovin.impl.sdk.n r1 = r6.f9357c
                java.lang.String r2 = r6.f9356b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.applovin.impl.u5$b r4 = r6.f9359e
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.z4 r0 = r6.f9358d
                java.lang.String r0 = r0.c()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.d(r2, r0)
                goto Lbc
            L80:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.n.a()     // Catch: java.lang.Throwable -> Lbd
                if (r2 == 0) goto L90
                com.applovin.impl.sdk.n r2 = r6.f9357c     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r3 = r6.f9356b     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r4 = "Task failed execution"
                r2.a(r3, r4, r1)     // Catch: java.lang.Throwable -> Lbd
            L90:
                com.applovin.impl.z4 r2 = r6.f9358d     // Catch: java.lang.Throwable -> Lbd
                r2.a(r1)     // Catch: java.lang.Throwable -> Lbd
                boolean r1 = com.applovin.impl.sdk.n.a()
                if (r1 == 0) goto Lbc
                com.applovin.impl.sdk.n r1 = r6.f9357c
                java.lang.String r2 = r6.f9356b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.applovin.impl.u5$b r4 = r6.f9359e
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.z4 r0 = r6.f9358d
                java.lang.String r0 = r0.c()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.d(r2, r0)
            Lbc:
                return
            Lbd:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.n.a()
                if (r2 == 0) goto Le5
                com.applovin.impl.sdk.n r2 = r6.f9357c
                java.lang.String r3 = r6.f9356b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.u5$b r5 = r6.f9359e
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.z4 r0 = r6.f9358d
                java.lang.String r0 = r0.c()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.d(r3, r0)
            Le5:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.u5.d.run():void");
        }
    }

    public u5(com.applovin.impl.sdk.j jVar) {
        this.f9331a = jVar;
        this.f9332b = jVar.I();
        this.f9344n = ((Boolean) jVar.a(o4.U)).booleanValue();
        this.f9333c = b("auxiliary_operations", ((Integer) jVar.a(o4.P)).intValue());
        this.f9334d = b("shared_thread_pool", ((Integer) jVar.a(o4.O)).intValue());
        this.f9335e = b("core", ((Integer) jVar.a(o4.V)).intValue());
        this.f9337g = b("caching", ((Integer) jVar.a(o4.W)).intValue());
        this.f9338h = b("mediation", ((Integer) jVar.a(o4.X)).intValue());
        this.f9336f = b("timeout", ((Integer) jVar.a(o4.Y)).intValue());
        this.f9339i = b("other", ((Integer) jVar.a(o4.Z)).intValue());
    }

    public Executor c() {
        return this.f9344n ? this.f9335e : this.f9334d;
    }

    public boolean d() {
        return this.f9343m;
    }

    public void e() {
        synchronized (this.f9342l) {
            this.f9343m = true;
            for (d dVar : this.f9341k) {
                a(dVar.f9358d, dVar.f9359e);
            }
            this.f9341k.clear();
        }
    }

    public void f() {
        synchronized (this.f9342l) {
            this.f9343m = false;
        }
    }

    public void a(z4 z4Var, b bVar) {
        a(z4Var, bVar, 0L);
    }

    public ScheduledFuture b(z4 z4Var, b bVar, long j10) {
        if (this.f9344n) {
            return a(new d(this.f9331a, z4Var, bVar)).schedule(z4Var, j10, TimeUnit.MILLISECONDS);
        }
        return this.f9333c.schedule(z4Var, j10, TimeUnit.MILLISECONDS);
    }

    public void a(z4 z4Var, b bVar, long j10) {
        a(z4Var, bVar, j10, false);
    }

    public void a(z4 z4Var, b bVar, long j10, boolean z10) {
        if (z4Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 >= 0) {
            d dVar = new d(this.f9331a, z4Var, bVar);
            if (!b(dVar)) {
                a(dVar, j10, z10);
                return;
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f9332b.d(z4Var.c(), "Task execution delayed until after init");
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("Invalid delay (millis) specified: " + j10);
    }

    public ExecutorService b() {
        return this.f9344n ? this.f9337g : f9330o;
    }

    private boolean b(d dVar) {
        if (dVar.f9358d.d()) {
            return false;
        }
        synchronized (this.f9342l) {
            if (this.f9343m) {
                return false;
            }
            this.f9341k.add(dVar);
            return true;
        }
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f9344n) {
            com.applovin.impl.sdk.j jVar = this.f9331a;
            d dVar = new d(jVar, new k6(jVar, "auxiliaryOperation", runnable), bVar);
            a(dVar).submit(dVar);
            return;
        }
        this.f9333c.submit(runnable);
    }

    private ScheduledThreadPoolExecutor b(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new c(str));
    }

    public ExecutorService a() {
        return this.f9344n ? this.f9339i : this.f9333c;
    }

    public void a(z4 z4Var) {
        if (z4Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f9344n ? this.f9335e : this.f9334d;
            try {
                if (d7.h()) {
                    scheduledThreadPoolExecutor.submit(new d(this.f9331a, z4Var, b.CORE));
                    return;
                }
                ScheduledFuture b10 = z4Var.b(Thread.currentThread(), ((Long) this.f9331a.a(o4.f8250x)).longValue());
                z4Var.run();
                if (b10 != null) {
                    b10.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9332b.a(z4Var.c(), "Task failed execution", th);
                }
                z4Var.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(z4 z4Var, d3 d3Var) {
        String b10 = d3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f9340j.get(b10);
        if (scheduledThreadPoolExecutor == null) {
            scheduledThreadPoolExecutor = b(b10, 1);
            this.f9340j.put(b10, scheduledThreadPoolExecutor);
        }
        scheduledThreadPoolExecutor.submit(new d(this.f9331a, z4Var, b.MEDIATION));
    }

    private void a(final d dVar, long j10, boolean z10) {
        final ScheduledThreadPoolExecutor a10 = this.f9344n ? a(dVar) : this.f9334d;
        if (j10 <= 0) {
            a10.submit(dVar);
        } else if (z10) {
            d0.a(j10, this.f9331a, new Runnable() { // from class: com.applovin.impl.ue
                @Override // java.lang.Runnable
                public final void run() {
                    a10.execute(dVar);
                }
            });
        } else {
            a10.schedule(dVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(d dVar) {
        int i10 = a.f9345a[dVar.f9359e.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return this.f9339i;
                    }
                    return this.f9336f;
                }
                return this.f9338h;
            }
            return this.f9337g;
        }
        return this.f9335e;
    }

    public ExecutorService a(String str, int i10) {
        return Executors.newFixedThreadPool(i10, new c(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9332b;
                nVar.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9332b.a("TaskManager", "Awaiting tasks were interrupted", th);
                return null;
            }
            return null;
        }
    }
}
