package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsSubscriber.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class w0 {

    /* renamed from: i  reason: collision with root package name */
    private static final long f15065i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    private final Context f15066a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f15067b;

    /* renamed from: c  reason: collision with root package name */
    private final z f15068c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseMessaging f15069d;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f15071f;

    /* renamed from: h  reason: collision with root package name */
    private final u0 f15073h;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f15070e = new androidx.collection.a();

    /* renamed from: g  reason: collision with root package name */
    private boolean f15072g = false;

    private w0(FirebaseMessaging firebaseMessaging, e0 e0Var, u0 u0Var, z zVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f15069d = firebaseMessaging;
        this.f15067b = e0Var;
        this.f15073h = u0Var;
        this.f15068c = zVar;
        this.f15066a = context;
        this.f15071f = scheduledExecutorService;
    }

    private void b(t0 t0Var, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.f15070e) {
            String e8 = t0Var.e();
            if (this.f15070e.containsKey(e8)) {
                arrayDeque = this.f15070e.get(e8);
            } else {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f15070e.put(e8, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    private static <T> void c(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            e = e8;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e10);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e11) {
            e = e11;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void d(String str) throws IOException {
        c(this.f15068c.k(this.f15069d.i(), str));
    }

    private void e(String str) throws IOException {
        c(this.f15068c.l(this.f15069d.i(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Task<w0> f(final FirebaseMessaging firebaseMessaging, final e0 e0Var, final z zVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                w0 j10;
                j10 = w0.j(context, scheduledExecutorService, firebaseMessaging, e0Var, zVar);
                return j10;
            }
        });
    }

    static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w0 j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, e0 e0Var, z zVar) throws Exception {
        return new w0(firebaseMessaging, e0Var, u0.b(context, scheduledExecutorService), zVar, context, scheduledExecutorService);
    }

    private void k(t0 t0Var) {
        synchronized (this.f15070e) {
            String e8 = t0Var.e();
            if (this.f15070e.containsKey(e8)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f15070e.get(e8);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f15070e.remove(e8);
                }
            }
        }
    }

    private void p() {
        if (i()) {
            return;
        }
        t(0L);
    }

    boolean g() {
        return this.f15073h.c() != null;
    }

    synchronized boolean i() {
        return this.f15072g;
    }

    boolean l(t0 t0Var) throws IOException {
        try {
            String b10 = t0Var.b();
            char c10 = 65535;
            int hashCode = b10.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && b10.equals("U")) {
                    c10 = 1;
                }
            } else if (b10.equals("S")) {
                c10 = 0;
            }
            if (c10 == 0) {
                d(t0Var.c());
                if (h()) {
                    Log.d("FirebaseMessaging", "Subscribe to topic: " + t0Var.c() + " succeeded.");
                }
            } else if (c10 != 1) {
                if (h()) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + t0Var + ".");
                }
            } else {
                e(t0Var.c());
                if (h()) {
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + t0Var.c() + " succeeded.");
                }
            }
            return true;
        } catch (IOException e8) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e8.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e8.getMessage())) {
                if (e8.getMessage() == null) {
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                throw e8;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e8.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Runnable runnable, long j10) {
        this.f15071f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    Task<Void> n(t0 t0Var) {
        this.f15073h.a(t0Var);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        b(t0Var, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void o(boolean z10) {
        this.f15072g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        if (g()) {
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> r(String str) {
        Task<Void> n10 = n(t0.f(str));
        q();
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (h() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.u0 r0 = r2.f15073h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.t0 r0 = r0.c()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = h()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.l(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.u0 r1 = r2.f15073h
            r1.e(r0)
            r2.k(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.w0.s():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(long j10) {
        m(new x0(this, this.f15066a, this.f15067b, Math.min(Math.max(30L, 2 * j10), f15065i)), j10);
        o(true);
    }
}
