package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.d7;
import com.applovin.impl.o4;
import com.applovin.impl.v1;
import com.ironsource.b9;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: a  reason: collision with root package name */
    final j f8702a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f8703b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f8704c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f8705d = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f8706e = new AtomicLong();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicLong f8707f = new AtomicLong();

    /* renamed from: g  reason: collision with root package name */
    private Date f8708g;

    /* renamed from: h  reason: collision with root package name */
    private Date f8709h;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements ComponentCallbacks2 {
        b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            SessionTracker.this.f8705d.set(i10);
            if (i10 == 20) {
                SessionTracker.this.a();
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (d7.g()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionTracker(j jVar) {
        this.f8702a = jVar;
        Application application = (Application) j.m();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f8702a.I();
        if (n.a()) {
            this.f8702a.I().a("SessionTracker", "Application Resumed");
        }
        this.f8707f.set(System.currentTimeMillis());
        boolean booleanValue = ((Boolean) this.f8702a.a(o4.f8230u3)).booleanValue();
        long longValue = ((Long) this.f8702a.a(o4.f8238v3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f8703b.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(longValue);
        if (this.f8709h == null || System.currentTimeMillis() - this.f8709h.getTime() >= millis) {
            this.f8702a.z().trackEvent("resumed");
            if (booleanValue) {
                this.f8709h = new Date();
            }
        }
        if (!booleanValue) {
            this.f8709h = new Date();
        }
        this.f8702a.C().c(v1.f9442p);
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f8706e.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f8707f.get();
    }

    public int getLastTrimMemoryLevel() {
        return this.f8705d.get();
    }

    public boolean isApplicationPaused() {
        return this.f8704c.get();
    }

    public void pauseForClick() {
        this.f8703b.set(true);
    }

    public void resumeForClick() {
        this.f8703b.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f8704c.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f8704c.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f8702a.I();
        if (n.a()) {
            this.f8702a.I().a("SessionTracker", "Application Paused");
        }
        this.f8706e.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f8703b.get()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.f8702a.a(o4.f8230u3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f8702a.a(o4.f8246w3)).longValue());
        if (this.f8708g == null || System.currentTimeMillis() - this.f8708g.getTime() >= millis) {
            this.f8702a.z().trackEvent(b9.h.f16647e0);
            if (booleanValue) {
                this.f8708g = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.f8708g = new Date();
    }
}
