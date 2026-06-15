package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzs {

    /* renamed from: e */
    private static zzs f11982e;

    /* renamed from: a */
    private final Context f11983a;

    /* renamed from: b */
    private final ScheduledExecutorService f11984b;

    /* renamed from: c */
    private c f11985c = new c(this, null);

    /* renamed from: d */
    private int f11986d = 1;

    zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11984b = scheduledExecutorService;
        this.f11983a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(zzs zzsVar) {
        return zzsVar.f11983a;
    }

    public static synchronized zzs b(Context context) {
        zzs zzsVar;
        synchronized (zzs.class) {
            if (f11982e == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                f11982e = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
            zzsVar = f11982e;
        }
        return zzsVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(zzs zzsVar) {
        return zzsVar.f11984b;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f11986d;
        this.f11986d = i10 + 1;
        return i10;
    }

    private final synchronized <T> Task<T> g(f<T> fVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(fVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f11985c.g(fVar)) {
            c cVar = new c(this, null);
            this.f11985c = cVar;
            cVar.g(fVar);
        }
        return fVar.f11964b.getTask();
    }

    public final Task<Void> c(int i10, Bundle bundle) {
        return g(new e(f(), 2, bundle));
    }

    public final Task<Bundle> d(int i10, Bundle bundle) {
        return g(new g(f(), 1, bundle));
    }
}
