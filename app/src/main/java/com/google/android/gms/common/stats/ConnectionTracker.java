package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ConnectionTracker {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f12711b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static volatile ConnectionTracker f12712c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f12713a = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    @KeepForSdk
    public static ConnectionTracker b() {
        if (f12712c == null) {
            synchronized (f12711b) {
                if (f12712c == null) {
                    f12712c = new ConnectionTracker();
                }
            }
        }
        ConnectionTracker connectionTracker = f12712c;
        Preconditions.m(connectionTracker);
        return connectionTracker;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (g(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f12713a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean h10 = h(context, intent, serviceConnection, i10, executor);
                if (h10) {
                    return h10;
                }
                return false;
            } finally {
                this.f12713a.remove(serviceConnection, serviceConnection);
            }
        }
        return h(context, intent, serviceConnection, i10, executor);
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzt);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!PlatformVersion.k() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    @KeepForSdk
    public void c(Context context, ServiceConnection serviceConnection) {
        if (g(serviceConnection) && this.f12713a.containsKey(serviceConnection)) {
            try {
                e(context, (ServiceConnection) this.f12713a.get(serviceConnection));
                return;
            } finally {
                this.f12713a.remove(serviceConnection);
            }
        }
        e(context, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
