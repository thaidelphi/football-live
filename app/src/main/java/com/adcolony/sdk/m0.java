package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.adcolony.sdk.e0;
import com.ironsource.x8;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m0 {

    /* renamed from: a  reason: collision with root package name */
    private ScheduledExecutorService f6124a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledFuture<?> f6125b;

    /* renamed from: c  reason: collision with root package name */
    private String f6126c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            m0.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements j0 {
        b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            m0.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        String e8 = e();
        if (e8.equals(this.f6126c)) {
            return;
        }
        this.f6126c = e8;
        f1 b10 = c0.b();
        c0.a(b10, "network_type", e8);
        new h0("Network.on_status_change", 1, b10).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ScheduledFuture<?> scheduledFuture = this.f6125b;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f6125b.cancel(false);
            }
            this.f6125b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return a();
    }

    @SuppressLint({"MissingPermission"})
    private String a() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return "none";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a10.getApplicationContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "none";
            }
            int type = activeNetworkInfo.getType();
            return type == 1 ? x8.f21379b : (type == 0 || type >= 2) ? "cell" : "none";
        } catch (SecurityException e8) {
            new e0.a().a("SecurityException - please ensure you added the ").a("ACCESS_NETWORK_STATE permission: ").a(e8.toString()).a(e0.f5980h);
            return "none";
        } catch (Exception e10) {
            new e0.a().a("Exception occurred when retrieving activeNetworkInfo in ").a("ADCNetwork.getConnectivityStatus(): ").a(e10.toString()).a(e0.f5981i);
            return "none";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f6124a == null) {
            this.f6124a = Executors.newSingleThreadScheduledExecutor();
        }
        if (this.f6125b == null) {
            try {
                this.f6125b = this.f6124a.scheduleAtFixedRate(new c(), 0L, 1000L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e8) {
                new e0.a().a("Error when scheduling network checks: ").a(e8.toString()).a(e0.f5981i);
            }
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f6126c = e();
        com.adcolony.sdk.a.a("Network.start_notifications", new a());
        com.adcolony.sdk.a.a("Network.stop_notifications", new b());
    }
}
