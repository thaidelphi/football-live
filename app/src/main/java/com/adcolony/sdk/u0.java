package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.e0;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f6311a = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: b  reason: collision with root package name */
    private ScheduledFuture<?> f6312b;

    /* renamed from: c  reason: collision with root package name */
    private ScheduledFuture<?> f6313c;

    /* renamed from: d  reason: collision with root package name */
    private final t0 f6314d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.f6312b = null;
            u0.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (u0.this.f6314d.g()) {
                com.adcolony.sdk.a.b().r().i();
                u0.this.f6313c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(t0 t0Var) {
        this.f6314d = t0Var;
    }

    private void d() {
        if (this.f6312b == null) {
            try {
                this.f6312b = this.f6311a.schedule(new a(), this.f6314d.a(), TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e8) {
                new e0.a().a("RejectedExecutionException when scheduling session stop ").a(e8.toString()).a(e0.f5981i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        new e0.a().a("AdColony session ending, releasing Context.").a(e0.f5976d);
        com.adcolony.sdk.a.b().c(true);
        com.adcolony.sdk.a.a((Context) null);
        this.f6314d.f(true);
        this.f6314d.g(true);
        this.f6314d.j();
        if (com.adcolony.sdk.a.b().r().f()) {
            ScheduledFuture<?> scheduledFuture = this.f6313c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f6313c.cancel(false);
            }
            try {
                this.f6313c = this.f6311a.schedule(new b(), 10L, TimeUnit.SECONDS);
            } catch (RejectedExecutionException e8) {
                new e0.a().a("RejectedExecutionException when scheduling message pumping stop ").a(e8.toString()).a(e0.f5981i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        a();
    }

    private void a() {
        ScheduledFuture<?> scheduledFuture = this.f6312b;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f6312b.cancel(false);
        this.f6312b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        d();
    }
}
