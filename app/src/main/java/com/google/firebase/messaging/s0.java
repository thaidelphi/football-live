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
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SyncTask.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f15043a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f15044b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseMessaging f15045c;
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: d  reason: collision with root package name */
    ExecutorService f15046d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* compiled from: SyncTask.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private s0 f15047a;

        public a(s0 s0Var) {
            this.f15047a = s0Var;
        }

        public void a() {
            if (s0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f15047a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            s0 s0Var = this.f15047a;
            if (s0Var != null && s0Var.d()) {
                if (s0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f15047a.f15045c.j(this.f15047a, 0L);
                this.f15047a.b().unregisterReceiver(this);
                this.f15047a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public s0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f15045c = firebaseMessaging;
        this.f15043a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f15044b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    Context b() {
        return this.f15045c.k();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() throws IOException {
        try {
            if (this.f15045c.i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e8) {
            if (z.g(e8.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e8.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e8.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e8;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (o0.b().e(b())) {
            this.f15044b.acquire();
        }
        try {
            try {
                this.f15045c.z(true);
            } catch (IOException e8) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e8.getMessage() + ". Won't retry the operation.");
                this.f15045c.z(false);
                if (!o0.b().e(b())) {
                    return;
                }
            }
            if (!this.f15045c.s()) {
                this.f15045c.z(false);
                if (o0.b().e(b())) {
                    this.f15044b.release();
                }
            } else if (o0.b().d(b()) && !d()) {
                new a(this).a();
                if (o0.b().e(b())) {
                    this.f15044b.release();
                }
            } else {
                if (e()) {
                    this.f15045c.z(false);
                } else {
                    this.f15045c.D(this.f15043a);
                }
                if (!o0.b().e(b())) {
                    return;
                }
                this.f15044b.release();
            }
        } catch (Throwable th) {
            if (o0.b().e(b())) {
                this.f15044b.release();
            }
            throw th;
        }
    }
}
