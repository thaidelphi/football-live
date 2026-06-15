package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d0 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c  reason: collision with root package name */
    private static final Set f6787c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final y6 f6788a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6789b;

    private d0(long j10, final boolean z10, com.applovin.impl.sdk.j jVar, final Runnable runnable) {
        this.f6788a = y6.a(j10, z10, jVar, new Runnable() { // from class: com.applovin.impl.u9
            @Override // java.lang.Runnable
            public final void run() {
                d0.this.a(z10, runnable);
            }
        });
        this.f6789b = jVar;
        f6787c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public static d0 a(long j10, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        return a(j10, false, jVar, runnable);
    }

    public long b() {
        return this.f6788a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f6788a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f6788a.e();
        }
    }

    public static d0 a(long j10, boolean z10, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        return new d0(j10, z10, jVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Runnable runnable) {
        if (!z10) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.f6788a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f6787c.remove(this);
    }
}
