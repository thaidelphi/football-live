package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.j;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: DisplayNotification.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f14969a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f14970b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f14971c;

    public e(Context context, f0 f0Var, ExecutorService executorService) {
        this.f14969a = executorService;
        this.f14970b = context;
        this.f14971c = f0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f14970b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f14970b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.importance == 100;
                }
            }
            return false;
        }
        return false;
    }

    private void c(c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f14970b.getSystemService("notification")).notify(aVar.f14963b, aVar.f14964c, aVar.f14962a.b());
    }

    private b0 d() {
        b0 j10 = b0.j(this.f14971c.p("gcm.n.image"));
        if (j10 != null) {
            j10.w(this.f14969a);
        }
        return j10;
    }

    private void e(j.e eVar, b0 b0Var) {
        if (b0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(b0Var.k(), 5L, TimeUnit.SECONDS);
            eVar.o(bitmap);
            eVar.x(new j.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            b0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e8) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e8.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            b0Var.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f14971c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        b0 d10 = d();
        c.a e8 = c.e(this.f14970b, this.f14971c);
        e(e8.f14962a, d10);
        c(e8);
        return true;
    }
}
