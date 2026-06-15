package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.ironsource.j3;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: ServiceStarter.java */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class o0 {

    /* renamed from: e  reason: collision with root package name */
    private static o0 f15018e;

    /* renamed from: a  reason: collision with root package name */
    private String f15019a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f15020b = null;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f15021c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Intent> f15022d = new ArrayDeque();

    private o0() {
    }

    private int a(Context context, Intent intent) {
        ComponentName startService;
        String f10 = f(context, intent);
        if (f10 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f10);
            }
            intent.setClassName(context.getPackageName(), f10);
        }
        try {
            if (e(context)) {
                startService = z0.h(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return j3.a.b.f17899d;
            }
            return -1;
        } catch (IllegalStateException e8) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e8);
            return 402;
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            return j3.a.b.f17897b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized o0 b() {
        o0 o0Var;
        synchronized (o0.class) {
            if (f15018e == null) {
                f15018e = new o0();
            }
            o0Var = f15018e;
        }
        return o0Var;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f15019a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    this.f15019a = context.getPackageName() + serviceInfo.name;
                } else {
                    this.f15019a = serviceInfo.name;
                }
                return this.f15019a;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Intent c() {
        return this.f15022d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Context context) {
        if (this.f15021c == null) {
            this.f15021c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f15020b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f15021c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(Context context) {
        if (this.f15020b == null) {
            this.f15020b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f15020b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f15020b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f15022d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
