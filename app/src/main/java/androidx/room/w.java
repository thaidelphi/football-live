package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.q;
import androidx.room.r;
import androidx.room.v;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiInstanceInvalidationClient.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    final Context f4330a;

    /* renamed from: b  reason: collision with root package name */
    final String f4331b;

    /* renamed from: c  reason: collision with root package name */
    int f4332c;

    /* renamed from: d  reason: collision with root package name */
    final v f4333d;

    /* renamed from: e  reason: collision with root package name */
    final v.c f4334e;

    /* renamed from: f  reason: collision with root package name */
    r f4335f;

    /* renamed from: g  reason: collision with root package name */
    final Executor f4336g;

    /* renamed from: h  reason: collision with root package name */
    final q f4337h = new a();

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f4338i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    final ServiceConnection f4339j;

    /* renamed from: k  reason: collision with root package name */
    final Runnable f4340k;

    /* renamed from: l  reason: collision with root package name */
    final Runnable f4341l;

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends q.a {

        /* compiled from: MultiInstanceInvalidationClient.java */
        /* renamed from: androidx.room.w$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0076a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String[] f4343a;

            RunnableC0076a(String[] strArr) {
                this.f4343a = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.f4333d.f(this.f4343a);
            }
        }

        a() {
        }

        @Override // androidx.room.q
        public void f(String[] strArr) {
            w.this.f4336g.execute(new RunnableC0076a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            w.this.f4335f = r.a.Z(iBinder);
            w wVar = w.this;
            wVar.f4336g.execute(wVar.f4340k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            w wVar = w.this;
            wVar.f4336g.execute(wVar.f4341l);
            w.this.f4335f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                w wVar = w.this;
                r rVar = wVar.f4335f;
                if (rVar != null) {
                    wVar.f4332c = rVar.O(wVar.f4337h, wVar.f4331b);
                    w wVar2 = w.this;
                    wVar2.f4333d.a(wVar2.f4334e);
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e8);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = w.this;
            wVar.f4333d.i(wVar.f4334e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e extends v.c {
        e(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.v.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.v.c
        public void b(Set<String> set) {
            if (w.this.f4338i.get()) {
                return;
            }
            try {
                w wVar = w.this;
                r rVar = wVar.f4335f;
                if (rVar != null) {
                    rVar.z(wVar.f4332c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot broadcast invalidation", e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Context context, String str, Intent intent, v vVar, Executor executor) {
        b bVar = new b();
        this.f4339j = bVar;
        this.f4340k = new c();
        this.f4341l = new d();
        Context applicationContext = context.getApplicationContext();
        this.f4330a = applicationContext;
        this.f4331b = str;
        this.f4333d = vVar;
        this.f4336g = executor;
        this.f4334e = new e((String[]) vVar.f4302a.keySet().toArray(new String[0]));
        applicationContext.bindService(intent, bVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.f4338i.compareAndSet(false, true)) {
            this.f4333d.i(this.f4334e);
            try {
                r rVar = this.f4335f;
                if (rVar != null) {
                    rVar.r0(this.f4337h, this.f4332c);
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e8);
            }
            this.f4330a.unbindService(this.f4339j);
        }
    }
}
