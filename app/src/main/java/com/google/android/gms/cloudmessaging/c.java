package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements ServiceConnection {

    /* renamed from: c  reason: collision with root package name */
    d f11957c;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzs f11960f;

    /* renamed from: a  reason: collision with root package name */
    int f11955a = 0;

    /* renamed from: b  reason: collision with root package name */
    final Messenger f11956b = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzf
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            c cVar = c.this;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i10);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (cVar) {
                f<?> fVar = cVar.f11959e.get(i10);
                if (fVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i10);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                cVar.f11959e.remove(i10);
                cVar.f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    fVar.c(new zzq(4, "Not supported by GmsCore", null));
                    return true;
                }
                fVar.a(data);
                return true;
            }
        }
    }));

    /* renamed from: d  reason: collision with root package name */
    final Queue<f<?>> f11958d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    final SparseArray<f<?>> f11959e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ c(zzs zzsVar, zzl zzlVar) {
        this.f11960f = zzsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.f11955a;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.f11955a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f11955a = 4;
        ConnectionTracker.b().c(zzs.a(this.f11960f), this);
        zzq zzqVar = new zzq(i10, str, th);
        for (f<?> fVar : this.f11958d) {
            fVar.c(zzqVar);
        }
        this.f11958d.clear();
        for (int i12 = 0; i12 < this.f11959e.size(); i12++) {
            this.f11959e.valueAt(i12).c(zzqVar);
        }
        this.f11959e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        zzs.e(this.f11960f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                final f<?> poll;
                final c cVar = c.this;
                while (true) {
                    synchronized (cVar) {
                        if (cVar.f11955a != 2) {
                            return;
                        }
                        if (cVar.f11958d.isEmpty()) {
                            cVar.f();
                            return;
                        }
                        poll = cVar.f11958d.poll();
                        cVar.f11959e.put(poll.f11963a, poll);
                        zzs.e(cVar.f11960f).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                            @Override // java.lang.Runnable
                            public final void run() {
                                c.this.e(poll.f11963a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context a10 = zzs.a(cVar.f11960f);
                    Messenger messenger = cVar.f11956b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f11965c;
                    obtain.arg1 = poll.f11963a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.b());
                    bundle.putString("pkg", a10.getPackageName());
                    bundle.putBundle("data", poll.f11966d);
                    obtain.setData(bundle);
                    try {
                        cVar.f11957c.a(obtain);
                    } catch (RemoteException e8) {
                        cVar.a(2, e8.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f11955a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i10) {
        f<?> fVar = this.f11959e.get(i10);
        if (fVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i10);
            Log.w("MessengerIpcClient", sb.toString());
            this.f11959e.remove(i10);
            fVar.c(new zzq(3, "Timed out waiting for response", null));
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        if (this.f11955a == 2 && this.f11958d.isEmpty() && this.f11959e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f11955a = 3;
            ConnectionTracker.b().c(zzs.a(this.f11960f), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(f<?> fVar) {
        int i10 = this.f11955a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f11958d.add(fVar);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                this.f11958d.add(fVar);
                c();
                return true;
            }
        }
        this.f11958d.add(fVar);
        Preconditions.p(this.f11955a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f11955a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!ConnectionTracker.b().a(zzs.a(this.f11960f), intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                zzs.e(this.f11960f).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e8) {
            b(0, "Unable to bind to service", e8);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        zzs.e(this.f11960f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                IBinder iBinder2 = iBinder;
                synchronized (cVar) {
                    try {
                        if (iBinder2 == null) {
                            cVar.a(0, "Null service connection");
                            return;
                        }
                        try {
                            cVar.f11957c = new d(iBinder2);
                            cVar.f11955a = 2;
                            cVar.c();
                        } catch (RemoteException e8) {
                            cVar.a(0, e8.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        zzs.e(this.f11960f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                c.this.a(2, "Service disconnected");
            }
        });
    }
}
