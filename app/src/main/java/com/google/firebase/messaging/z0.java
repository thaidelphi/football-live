package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WakeLockHolder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    static final long f15093a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f15094b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static WakeLock f15095c;

    private static void b(Context context) {
        if (f15095c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f15095c = wakeLock;
            wakeLock.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f15094b) {
            if (f15095c != null && d(intent)) {
                g(intent, false);
                f15095c.c();
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"TaskMainThread"})
    public static void f(Context context, e1 e1Var, final Intent intent) {
        synchronized (f15094b) {
            b(context);
            boolean d10 = d(intent);
            g(intent, true);
            if (!d10) {
                f15095c.a(f15093a);
            }
            e1Var.c(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.y0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    z0.c(intent);
                }
            });
        }
    }

    private static void g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName h(Context context, Intent intent) {
        synchronized (f15094b) {
            b(context);
            boolean d10 = d(intent);
            g(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!d10) {
                f15095c.a(f15093a);
            }
            return startService;
        }
    }
}
