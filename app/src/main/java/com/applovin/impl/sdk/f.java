package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.j3;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.y6;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private y6 f8829a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8830b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f8831c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private boolean f8832d;

    /* renamed from: e  reason: collision with root package name */
    private final j f8833e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference f8834f;

    /* renamed from: g  reason: collision with root package name */
    private long f8835g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void onAdRefresh();
    }

    public f(j jVar, a aVar) {
        this.f8834f = new WeakReference(aVar);
        this.f8833e = jVar;
    }

    private void e() {
        if (((Boolean) this.f8833e.a(j3.S6)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f8833e.a(j3.S6)).booleanValue()) {
            synchronized (this.f8830b) {
                if (this.f8832d) {
                    this.f8833e.I();
                    if (n.a()) {
                        this.f8833e.I().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f8833e.e0().isApplicationPaused()) {
                    this.f8833e.I();
                    if (n.a()) {
                        this.f8833e.I().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    y6 y6Var = this.f8829a;
                    if (y6Var != null) {
                        y6Var.e();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f8834f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f8830b) {
            y6 y6Var = this.f8829a;
            if (y6Var != null) {
                y6Var.d();
            } else {
                this.f8833e.I();
                if (n.a()) {
                    this.f8833e.I().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f8831c.set(true);
            }
        }
    }

    private void l() {
        synchronized (this.f8830b) {
            this.f8829a = null;
            if (!((Boolean) this.f8833e.a(j3.T6)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void n() {
        synchronized (this.f8830b) {
            y6 y6Var = this.f8829a;
            if (y6Var != null) {
                y6Var.e();
            } else {
                this.f8831c.set(false);
            }
        }
    }

    public void a(long j10) {
        synchronized (this.f8830b) {
            a();
            this.f8835g = j10;
            this.f8829a = y6.a(j10, this.f8833e, new Runnable() { // from class: com.applovin.impl.sdk.h0
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.i();
                }
            });
            if (!((Boolean) this.f8833e.a(j3.T6)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f8833e.a(j3.S6)).booleanValue() && (this.f8833e.B().c() || this.f8833e.e0().isApplicationPaused())) {
                this.f8829a.d();
            }
            if (this.f8831c.compareAndSet(true, false) && ((Boolean) this.f8833e.a(j3.U6)).booleanValue()) {
                this.f8833e.I();
                if (n.a()) {
                    this.f8833e.I().a("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f8829a.d();
            }
        }
    }

    public long b() {
        long c10;
        synchronized (this.f8830b) {
            y6 y6Var = this.f8829a;
            c10 = y6Var != null ? y6Var.c() : -1L;
        }
        return c10;
    }

    public void c() {
        if (((Boolean) this.f8833e.a(j3.R6)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z10;
        a aVar;
        if (((Boolean) this.f8833e.a(j3.R6)).booleanValue()) {
            synchronized (this.f8830b) {
                if (this.f8832d) {
                    this.f8833e.I();
                    if (n.a()) {
                        this.f8833e.I().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f8833e.B().c()) {
                    this.f8833e.I();
                    if (n.a()) {
                        this.f8833e.I().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                } else {
                    if (this.f8829a != null) {
                        long b10 = this.f8835g - b();
                        long longValue = ((Long) this.f8833e.a(j3.Q6)).longValue();
                        if (longValue >= 0 && b10 > longValue) {
                            a();
                            z10 = true;
                            if (z10 || (aVar = (a) this.f8834f.get()) == null) {
                            }
                            aVar.onAdRefresh();
                            return;
                        }
                        this.f8829a.e();
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
            }
        }
    }

    public boolean g() {
        return this.f8832d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f8830b) {
            z10 = this.f8829a != null;
        }
        return z10;
    }

    public void j() {
        synchronized (this.f8830b) {
            k();
            this.f8832d = true;
        }
    }

    public void m() {
        synchronized (this.f8830b) {
            n();
            this.f8832d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a() {
        synchronized (this.f8830b) {
            y6 y6Var = this.f8829a;
            if (y6Var != null) {
                y6Var.a();
                l();
            }
        }
    }
}
