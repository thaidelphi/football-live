package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class j implements ServiceConnection, zzt {

    /* renamed from: a  reason: collision with root package name */
    private final Map f12550a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f12551b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12552c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f12553d;

    /* renamed from: e  reason: collision with root package name */
    private final zzo f12554e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f12555f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l f12556g;

    public j(l lVar, zzo zzoVar) {
        this.f12556g = lVar;
        this.f12554e = zzoVar;
    }

    public final int a() {
        return this.f12551b;
    }

    public final ComponentName b() {
        return this.f12555f;
    }

    public final IBinder c() {
        return this.f12553d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f12550a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        ConnectionTracker connectionTracker;
        Context context;
        Context context2;
        ConnectionTracker connectionTracker2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        this.f12551b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.m()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            l lVar = this.f12556g;
            connectionTracker = lVar.f12562j;
            context = lVar.f12559g;
            zzo zzoVar = this.f12554e;
            context2 = lVar.f12559g;
            boolean d10 = connectionTracker.d(context, str, zzoVar.b(context2), this, 4225, executor);
            this.f12552c = d10;
            if (d10) {
                handler = this.f12556g.f12560h;
                Message obtainMessage = handler.obtainMessage(1, this.f12554e);
                handler2 = this.f12556g.f12560h;
                j10 = this.f12556g.f12564l;
                handler2.sendMessageDelayed(obtainMessage, j10);
            } else {
                this.f12551b = 2;
                try {
                    l lVar2 = this.f12556g;
                    connectionTracker2 = lVar2.f12562j;
                    context3 = lVar2.f12559g;
                    connectionTracker2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f12550a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        ConnectionTracker connectionTracker;
        Context context;
        zzo zzoVar = this.f12554e;
        handler = this.f12556g.f12560h;
        handler.removeMessages(1, zzoVar);
        l lVar = this.f12556g;
        connectionTracker = lVar.f12562j;
        context = lVar.f12559g;
        connectionTracker.c(context, this);
        this.f12552c = false;
        this.f12551b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f12550a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f12550a.isEmpty();
    }

    public final boolean j() {
        return this.f12552c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f12556g.f12558f;
        synchronized (hashMap) {
            handler = this.f12556g.f12560h;
            handler.removeMessages(1, this.f12554e);
            this.f12553d = iBinder;
            this.f12555f = componentName;
            for (ServiceConnection serviceConnection : this.f12550a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f12551b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f12556g.f12558f;
        synchronized (hashMap) {
            handler = this.f12556g.f12560h;
            handler.removeMessages(1, this.f12554e);
            this.f12553d = null;
            this.f12555f = componentName;
            for (ServiceConnection serviceConnection : this.f12550a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f12551b = 2;
        }
    }
}
