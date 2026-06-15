package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsSyncTask.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class x0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f15075f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static Boolean f15076g;

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f15077h;

    /* renamed from: a  reason: collision with root package name */
    private final Context f15078a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f15079b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager.WakeLock f15080c;

    /* renamed from: d  reason: collision with root package name */
    private final w0 f15081d;

    /* renamed from: e  reason: collision with root package name */
    private final long f15082e;

    /* compiled from: TopicsSyncTask.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private x0 f15083a;

        public a(x0 x0Var) {
            this.f15083a = x0Var;
        }

        public void a() {
            if (x0.b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            x0.this.f15078a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            x0 x0Var = this.f15083a;
            if (x0Var == null) {
                return;
            }
            if (x0Var.i()) {
                if (x0.b()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f15083a.f15081d.m(this.f15083a, 0L);
                context.unregisterReceiver(this);
                this.f15083a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(w0 w0Var, Context context, e0 e0Var, long j10) {
        this.f15081d = w0Var;
        this.f15078a = context;
        this.f15082e = j10;
        this.f15079b = e0Var;
        this.f15080c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    static /* synthetic */ boolean b() {
        return j();
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f15075f) {
            Boolean bool = f15077h;
            if (bool == null) {
                booleanValue = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f15077h = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f15075f) {
            Boolean bool = f15076g;
            if (bool == null) {
                booleanValue = g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f15076g = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f15078a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z10 = activeNetworkInfo.isConnected();
        }
        return z10;
    }

    private static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f15078a)) {
            this.f15080c.acquire(d.f14967a);
        }
        try {
            try {
                try {
                    this.f15081d.o(true);
                } catch (Throwable th) {
                    if (h(this.f15078a)) {
                        try {
                            this.f15080c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e8) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e8.getMessage());
                this.f15081d.o(false);
                if (!h(this.f15078a)) {
                    return;
                }
                wakeLock = this.f15080c;
            }
            if (!this.f15079b.g()) {
                this.f15081d.o(false);
                if (h(this.f15078a)) {
                    try {
                        this.f15080c.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (f(this.f15078a) && !i()) {
                new a(this).a();
                if (h(this.f15078a)) {
                    try {
                        this.f15080c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                if (this.f15081d.s()) {
                    this.f15081d.o(false);
                } else {
                    this.f15081d.t(this.f15082e);
                }
                if (h(this.f15078a)) {
                    wakeLock = this.f15080c;
                    wakeLock.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
