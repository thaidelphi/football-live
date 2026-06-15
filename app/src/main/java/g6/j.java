package g6;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequentialExecutor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j implements Executor {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f25805f = Logger.getLogger(j.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final Executor f25806a;

    /* renamed from: b  reason: collision with root package name */
    private final Deque<Runnable> f25807b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private c f25808c = c.IDLE;

    /* renamed from: d  reason: collision with root package name */
    private long f25809d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final b f25810e = new b(this, null);

    /* compiled from: SequentialExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f25811a;

        a(Runnable runnable) {
            this.f25811a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25811a.run();
        }

        public String toString() {
            return this.f25811a.toString();
        }
    }

    /* compiled from: SequentialExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        Runnable f25813a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
            if (r1 == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
            r8.f25813a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
            g6.j.f25805f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f25813a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                g6.j r2 = g6.j.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = g6.j.a(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r0 != 0) goto L2b
                g6.j r0 = g6.j.this     // Catch: java.lang.Throwable -> L7f
                g6.j$c r0 = g6.j.b(r0)     // Catch: java.lang.Throwable -> L7f
                g6.j$c r3 = g6.j.c.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                g6.j r0 = g6.j.this     // Catch: java.lang.Throwable -> L7f
                g6.j.d(r0)     // Catch: java.lang.Throwable -> L7f
                g6.j r0 = g6.j.this     // Catch: java.lang.Throwable -> L7f
                g6.j.c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                r0 = 1
            L2b:
                g6.j r3 = g6.j.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = g6.j.a(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.f25813a = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L4d
                g6.j r0 = g6.j.this     // Catch: java.lang.Throwable -> L7f
                g6.j$c r3 = g6.j.c.IDLE     // Catch: java.lang.Throwable -> L7f
                g6.j.c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L82
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f25813a     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f25813a = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L5c:
                r0 = move-exception
                goto L7c
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = g6.j.e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f25813a     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L7c:
                r8.f25813a = r2     // Catch: java.lang.Throwable -> L82
                throw r0     // Catch: java.lang.Throwable -> L82
            L7f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                throw r0     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g6.j.b.b():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b();
            } catch (Error e8) {
                synchronized (j.this.f25807b) {
                    j.this.f25808c = c.IDLE;
                    throw e8;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f25813a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + j.this.f25808c + "}";
        }

        /* synthetic */ b(j jVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SequentialExecutor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Executor executor) {
        this.f25806a = (Executor) Preconditions.m(executor);
    }

    static /* synthetic */ long d(j jVar) {
        long j10 = jVar.f25809d;
        jVar.f25809d = 1 + j10;
        return j10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        Preconditions.m(runnable);
        synchronized (this.f25807b) {
            c cVar2 = this.f25808c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f25809d;
                a aVar = new a(runnable);
                this.f25807b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f25808c = cVar3;
                try {
                    this.f25806a.execute(this.f25810e);
                    if (this.f25808c != cVar3) {
                        return;
                    }
                    synchronized (this.f25807b) {
                        if (this.f25809d == j10 && this.f25808c == cVar3) {
                            this.f25808c = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e8) {
                    synchronized (this.f25807b) {
                        c cVar4 = this.f25808c;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f25807b.removeLastOccurrence(aVar)) {
                            r0 = false;
                        }
                        if (!(e8 instanceof RejectedExecutionException) || r0) {
                            throw e8;
                        }
                    }
                    return;
                }
            }
            this.f25807b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f25806a + "}";
    }
}
