package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l extends GmsClientSupervisor {

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f12558f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Context f12559g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Handler f12560h;

    /* renamed from: i  reason: collision with root package name */
    private final k f12561i;

    /* renamed from: j  reason: collision with root package name */
    private final ConnectionTracker f12562j;

    /* renamed from: k  reason: collision with root package name */
    private final long f12563k;

    /* renamed from: l  reason: collision with root package name */
    private final long f12564l;

    /* renamed from: m  reason: collision with root package name */
    private volatile Executor f12565m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, Looper looper, Executor executor) {
        k kVar = new k(this, null);
        this.f12561i = kVar;
        this.f12559g = context.getApplicationContext();
        this.f12560h = new com.google.android.gms.internal.common.zzi(looper, kVar);
        this.f12562j = ConnectionTracker.b();
        this.f12563k = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
        this.f12564l = 300000L;
        this.f12565m = executor;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void d(zzo zzoVar, ServiceConnection serviceConnection, String str) {
        Preconditions.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f12558f) {
            j jVar = (j) this.f12558f.get(zzoVar);
            if (jVar != null) {
                if (jVar.h(serviceConnection)) {
                    jVar.f(serviceConnection, str);
                    if (jVar.i()) {
                        this.f12560h.sendMessageDelayed(this.f12560h.obtainMessage(0, zzoVar), this.f12563k);
                    }
                } else {
                    String obj = zzoVar.toString();
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj);
                }
            } else {
                String obj2 = zzoVar.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean f(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j10;
        Preconditions.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f12558f) {
            j jVar = (j) this.f12558f.get(zzoVar);
            if (executor == null) {
                executor = this.f12565m;
            }
            if (jVar == null) {
                jVar = new j(this, zzoVar);
                jVar.d(serviceConnection, serviceConnection, str);
                jVar.e(str, executor);
                this.f12558f.put(zzoVar, jVar);
            } else {
                this.f12560h.removeMessages(0, zzoVar);
                if (!jVar.h(serviceConnection)) {
                    jVar.d(serviceConnection, serviceConnection, str);
                    int a10 = jVar.a();
                    if (a10 == 1) {
                        serviceConnection.onServiceConnected(jVar.b(), jVar.c());
                    } else if (a10 == 2) {
                        jVar.e(str, executor);
                    }
                } else {
                    String obj = zzoVar.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j10 = jVar.j();
        }
        return j10;
    }
}
