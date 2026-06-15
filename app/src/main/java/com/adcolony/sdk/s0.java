package com.adcolony.sdk;

import android.util.Log;
import com.adcolony.sdk.f0;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.fe;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s0 {

    /* renamed from: a  reason: collision with root package name */
    d0 f6250a;

    /* renamed from: b  reason: collision with root package name */
    ScheduledExecutorService f6251b;

    /* renamed from: d  reason: collision with root package name */
    HashMap<String, Object> f6253d;

    /* renamed from: c  reason: collision with root package name */
    List<f0> f6252c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private b0 f6254e = new b0("adcolony_android", "4.8.0", "Production");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f0 f6256a;

        b(f0 f0Var) {
            this.f6256a = f0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.this.f6252c.add(this.f6256a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(d0 d0Var, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.f6250a = d0Var;
        this.f6251b = scheduledExecutorService;
        this.f6253d = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(long j10, TimeUnit timeUnit) {
        try {
            if (!this.f6251b.isShutdown() && !this.f6251b.isTerminated()) {
                this.f6251b.scheduleAtFixedRate(new a(), j10, j10, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        this.f6251b.shutdown();
        try {
            ScheduledExecutorService scheduledExecutorService = this.f6251b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!scheduledExecutorService.awaitTermination(1L, timeUnit)) {
                this.f6251b.shutdownNow();
                if (!this.f6251b.awaitTermination(1L, timeUnit)) {
                    PrintStream printStream = System.err;
                    printStream.println(s0.class.getSimpleName() + ": ScheduledExecutorService did not terminate");
                }
            }
        } catch (InterruptedException unused) {
            this.f6251b.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void c(String str) {
        b(new f0.a().a(2).a(this.f6254e).a(str).a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(String str) {
        b(new f0.a().a(1).a(this.f6254e).a(str).a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void e(String str) {
        this.f6253d.put("controllerVersion", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void f(String str) {
        this.f6253d.put(JsonStorageKeyNames.SESSION_ID_KEY, str);
    }

    void a() {
        synchronized (this) {
            try {
                if (this.f6252c.size() > 0) {
                    this.f6250a.a(a(this.f6254e, this.f6252c));
                    this.f6252c.clear();
                }
            } catch (IOException unused) {
                this.f6252c.clear();
            } catch (JSONException unused2) {
                this.f6252c.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b(String str) {
        b(new f0.a().a(0).a(this.f6254e).a(str).a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(String str) {
        b(new f0.a().a(3).a(this.f6254e).a(str).a());
    }

    synchronized void b(f0 f0Var) {
        try {
            if (!this.f6251b.isShutdown() && !this.f6251b.isTerminated()) {
                this.f6251b.submit(new b(f0Var));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
    }

    String a(b0 b0Var, List<f0> list) throws JSONException {
        f1 f1Var = new f1();
        f1Var.a("index", b0Var.b());
        f1Var.a("environment", b0Var.a());
        f1Var.a("version", b0Var.c());
        e1 e1Var = new e1();
        for (f0 f0Var : list) {
            e1Var.a(a(f0Var));
        }
        f1Var.a("logs", e1Var);
        return f1Var.toString();
    }

    private synchronized f1 a(f0 f0Var) throws JSONException {
        f1 f1Var;
        f1Var = new f1(this.f6253d);
        f1Var.a("environment", f0Var.a().a());
        f1Var.a(AppLovinEventTypes.USER_COMPLETED_LEVEL, f0Var.b());
        f1Var.a("message", f0Var.c());
        f1Var.a("clientTimestamp", f0Var.d());
        f1 f1Var2 = new f1(com.adcolony.sdk.a.b().u().getMediationInfo());
        f1 f1Var3 = new f1(com.adcolony.sdk.a.b().u().getPluginInfo());
        f1Var.a("mediation_network", c0.h(f1Var2, "name"));
        f1Var.a("mediation_network_version", c0.h(f1Var2, "version"));
        f1Var.a(fe.K, c0.h(f1Var3, "name"));
        f1Var.a("plugin_version", c0.h(f1Var3, "version"));
        e1 b10 = com.adcolony.sdk.a.b().q().b();
        if (b10 == null || b10.a("batteryInfo")) {
            f1Var.b("batteryInfo", com.adcolony.sdk.a.b().n().l());
        }
        if (b10 != null) {
            f1Var.a(b10);
        }
        return f1Var;
    }
}
