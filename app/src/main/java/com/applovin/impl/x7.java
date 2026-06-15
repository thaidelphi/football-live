package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x7 {

    /* renamed from: f  reason: collision with root package name */
    private static final Set f9615f = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9616a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9617b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f9618c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f9619d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Timer f9620e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends TimerTask {

        /* renamed from: com.applovin.impl.x7$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0139a implements AppLovinBroadcastManager.Receiver {
            C0139a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                x7.this.c();
            }
        }

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!x7.this.f9617b.e0().isApplicationPaused() || x7.this.f9616a) {
                x7.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0139a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private x7(long j10, boolean z10, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f9620e = timer;
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j10);
        } else if (jVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        } else {
            if (runnable != null) {
                this.f9616a = z10;
                this.f9617b = jVar;
                this.f9618c = runnable;
                f9615f.add(this);
                timer.schedule(b(), j10);
                return;
            }
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
    }

    public static x7 a(long j10, boolean z10, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        return new x7(j10, z10, jVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f9618c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f9619d) {
            this.f9620e.cancel();
            this.f9618c = null;
            f9615f.remove(this);
        }
    }
}
