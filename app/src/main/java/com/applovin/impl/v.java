package com.applovin.impl;

import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v {

    /* renamed from: l  reason: collision with root package name */
    private static final v f9382l = new v();

    /* renamed from: b  reason: collision with root package name */
    private Handler f9384b;

    /* renamed from: d  reason: collision with root package name */
    private Handler f9386d;

    /* renamed from: g  reason: collision with root package name */
    private com.applovin.impl.sdk.j f9389g;

    /* renamed from: h  reason: collision with root package name */
    private Thread f9390h;

    /* renamed from: i  reason: collision with root package name */
    private long f9391i;

    /* renamed from: j  reason: collision with root package name */
    private long f9392j;

    /* renamed from: k  reason: collision with root package name */
    private long f9393k;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f9383a = new AtomicLong(0);

    /* renamed from: c  reason: collision with root package name */
    private final HandlerThread f9385c = new HandlerThread("AppLovinSdk:anr_detector");

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f9387e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f9388f = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (v.this.f9387e.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - v.this.f9383a.get();
            if (currentTimeMillis < 0 || currentTimeMillis > v.this.f9391i) {
                v.this.a();
                if (v.this.f9390h == null || v.this.f9390h.getStackTrace().length <= 0) {
                    str = "None";
                } else {
                    StackTraceElement stackTraceElement = v.this.f9390h.getStackTrace()[0];
                    str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                }
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - com.applovin.impl.sdk.j.l());
                HashMap hashMap = new HashMap(3);
                hashMap.put("top_main_method", str);
                hashMap.put("source", v.this.f9389g.r0() ? "non_first_session" : "first_session");
                hashMap.put("details", "seconds_since_app_launch=" + seconds);
                v.this.f9389g.D().d(y1.f9659c0, hashMap);
            }
            v.this.f9386d.postDelayed(this, v.this.f9393k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v.this.f9387e.get()) {
                return;
            }
            v.this.f9383a.set(System.currentTimeMillis());
            v.this.f9384b.postDelayed(this, v.this.f9392j);
        }
    }

    private v() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f9391i = timeUnit.toMillis(4L);
        this.f9392j = timeUnit.toMillis(3L);
        this.f9393k = timeUnit.toMillis(3L);
    }

    private void a(com.applovin.impl.sdk.j jVar) {
        if (this.f9388f.compareAndSet(false, true)) {
            this.f9389g = jVar;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.we
                @Override // java.lang.Runnable
                public final void run() {
                    v.this.b();
                }
            });
            this.f9391i = ((Long) jVar.a(o4.G5)).longValue();
            this.f9392j = ((Long) jVar.a(o4.H5)).longValue();
            this.f9393k = ((Long) jVar.a(o4.I5)).longValue();
            this.f9384b = new Handler(com.applovin.impl.sdk.j.m().getMainLooper());
            this.f9385c.start();
            this.f9384b.post(new c());
            Handler handler = new Handler(this.f9385c.getLooper());
            this.f9386d = handler;
            handler.postDelayed(new b(), this.f9393k / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f9390h = Thread.currentThread();
    }

    public static void b(com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            if (((Boolean) jVar.a(o4.F5)).booleanValue() && !d7.c(jVar)) {
                f9382l.a(jVar);
            } else {
                f9382l.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f9388f.get()) {
            this.f9387e.set(true);
        }
    }
}
