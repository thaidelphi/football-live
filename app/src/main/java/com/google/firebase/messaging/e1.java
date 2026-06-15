package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.e1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: WithinAppServiceConnection.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class e1 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14977a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f14978b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f14979c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<a> f14980d;

    /* renamed from: e  reason: collision with root package name */
    private b1 f14981e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14982f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WithinAppServiceConnection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f14983a;

        /* renamed from: b  reason: collision with root package name */
        private final TaskCompletionSource<Void> f14984b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f14983a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f14983a.getAction() + " Releasing WakeLock.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.d1
                @Override // java.lang.Runnable
                public final void run() {
                    e1.a.this.f();
                }
            }, (this.f14983a.getFlags() & 268435456) != 0 ? z0.f15093a : 9000L, TimeUnit.MILLISECONDS);
            e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.c1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f14984b.trySetResult(null);
        }

        Task<Void> e() {
            return this.f14984b.getTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public e1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f14980d.isEmpty()) {
            this.f14980d.poll().d();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f14980d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            b1 b1Var = this.f14981e;
            if (b1Var != null && b1Var.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f14981e.c(this.f14980d.poll());
            } else {
                d();
                return;
            }
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f14982f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f14982f) {
            return;
        }
        this.f14982f = true;
        try {
        } catch (SecurityException e8) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e8);
        }
        if (ConnectionTracker.b().a(this.f14977a, this.f14978b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f14982f = false;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Task<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.c(this.f14979c);
        this.f14980d.add(aVar);
        b();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f14982f = false;
        if (!(iBinder instanceof b1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
            return;
        }
        this.f14981e = (b1) iBinder;
        b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    e1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f14980d = new ArrayDeque();
        this.f14982f = false;
        Context applicationContext = context.getApplicationContext();
        this.f14977a = applicationContext;
        this.f14978b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f14979c = scheduledExecutorService;
    }
}
