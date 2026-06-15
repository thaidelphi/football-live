package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.m0;
import com.google.firebase.messaging.r0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p6.a;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class FirebaseMessaging {

    /* renamed from: o  reason: collision with root package name */
    private static final long f14878o = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: p  reason: collision with root package name */
    private static r0 f14879p;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: q  reason: collision with root package name */
    static z2.g f14880q;

    /* renamed from: r  reason: collision with root package name */
    static ScheduledExecutorService f14881r;

    /* renamed from: a  reason: collision with root package name */
    private final c6.e f14882a;

    /* renamed from: b  reason: collision with root package name */
    private final p6.a f14883b;

    /* renamed from: c  reason: collision with root package name */
    private final r6.e f14884c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f14885d;

    /* renamed from: e  reason: collision with root package name */
    private final z f14886e;

    /* renamed from: f  reason: collision with root package name */
    private final m0 f14887f;

    /* renamed from: g  reason: collision with root package name */
    private final a f14888g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f14889h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f14890i;

    /* renamed from: j  reason: collision with root package name */
    private final Executor f14891j;

    /* renamed from: k  reason: collision with root package name */
    private final Task<w0> f14892k;

    /* renamed from: l  reason: collision with root package name */
    private final e0 f14893l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f14894m;

    /* renamed from: n  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f14895n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private final n6.d f14896a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f14897b;

        /* renamed from: c  reason: collision with root package name */
        private n6.b<c6.b> f14898c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f14899d;

        a(n6.d dVar) {
            this.f14896a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(n6.a aVar) {
            if (c()) {
                FirebaseMessaging.this.B();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j10 = FirebaseMessaging.this.f14882a.j();
            SharedPreferences sharedPreferences = j10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            if (this.f14897b) {
                return;
            }
            Boolean e8 = e();
            this.f14899d = e8;
            if (e8 == null) {
                n6.b<c6.b> bVar = new n6.b() { // from class: com.google.firebase.messaging.w
                    @Override // n6.b
                    public final void a(n6.a aVar) {
                        FirebaseMessaging.a.this.d(aVar);
                    }
                };
                this.f14898c = bVar;
                this.f14896a.a(c6.b.class, bVar);
            }
            this.f14897b = true;
        }

        synchronized boolean c() {
            boolean s10;
            b();
            Boolean bool = this.f14899d;
            if (bool == null) {
                s10 = FirebaseMessaging.this.f14882a.s();
            } else {
                s10 = bool.booleanValue();
            }
            return s10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(c6.e eVar, p6.a aVar, q6.b<z6.i> bVar, q6.b<o6.j> bVar2, r6.e eVar2, z2.g gVar, n6.d dVar) {
        this(eVar, aVar, bVar, bVar2, eVar2, gVar, dVar, new e0(eVar.j()));
    }

    private synchronized void A() {
        if (!this.f14894m) {
            D(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        p6.a aVar = this.f14883b;
        if (aVar != null) {
            aVar.getToken();
        } else if (E(o())) {
            A();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(c6.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.i(FirebaseMessaging.class);
            Preconditions.n(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging l() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(c6.e.k());
        }
        return firebaseMessaging;
    }

    private static synchronized r0 m(Context context) {
        r0 r0Var;
        synchronized (FirebaseMessaging.class) {
            if (f14879p == null) {
                f14879p = new r0(context);
            }
            r0Var = f14879p;
        }
        return r0Var;
    }

    private String n() {
        return "[DEFAULT]".equals(this.f14882a.l()) ? "" : this.f14882a.n();
    }

    public static z2.g p() {
        return f14880q;
    }

    private void q(String str) {
        if ("[DEFAULT]".equals(this.f14882a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f14882a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new l(this.f14885d).i(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task t(final String str, final r0.a aVar) {
        return this.f14886e.e().onSuccessTask(this.f14891j, new SuccessContinuation() { // from class: com.google.firebase.messaging.q
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task u10;
                u10 = FirebaseMessaging.this.u(str, aVar, (String) obj);
                return u10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task u(String str, r0.a aVar, String str2) throws Exception {
        m(this.f14885d).f(n(), str, str2, this.f14893l.a());
        if (aVar == null || !str2.equals(aVar.f15037a)) {
            q(str2);
        }
        return Tasks.forResult(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        if (r()) {
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(w0 w0Var) {
        if (r()) {
            w0Var.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        i0.c(this.f14885d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task y(String str, w0 w0Var) throws Exception {
        return w0Var.r(str);
    }

    @SuppressLint({"TaskMainThread"})
    public Task<Void> C(final String str) {
        return this.f14892k.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.r
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task y10;
                y10 = FirebaseMessaging.y(str, (w0) obj);
                return y10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void D(long j10) {
        j(new s0(this, Math.min(Math.max(30L, 2 * j10), f14878o)), j10);
        this.f14894m = true;
    }

    boolean E(r0.a aVar) {
        return aVar == null || aVar.b(this.f14893l.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() throws IOException {
        p6.a aVar = this.f14883b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.b());
            } catch (InterruptedException | ExecutionException e8) {
                throw new IOException(e8);
            }
        }
        final r0.a o10 = o();
        if (!E(o10)) {
            return o10.f15037a;
        }
        final String c10 = e0.c(this.f14882a);
        try {
            return (String) Tasks.await(this.f14887f.b(c10, new m0.a() { // from class: com.google.firebase.messaging.s
                @Override // com.google.firebase.messaging.m0.a
                public final Task start() {
                    Task t10;
                    t10 = FirebaseMessaging.this.t(c10, o10);
                    return t10;
                }
            }));
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public void j(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f14881r == null) {
                f14881r = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f14881r.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context k() {
        return this.f14885d;
    }

    r0.a o() {
        return m(this.f14885d).d(n(), e0.c(this.f14882a));
    }

    public boolean r() {
        return this.f14888g.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        return this.f14893l.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void z(boolean z10) {
        this.f14894m = z10;
    }

    FirebaseMessaging(c6.e eVar, p6.a aVar, q6.b<z6.i> bVar, q6.b<o6.j> bVar2, r6.e eVar2, z2.g gVar, n6.d dVar, e0 e0Var) {
        this(eVar, aVar, eVar2, gVar, dVar, e0Var, new z(eVar, e0Var, bVar, bVar2, eVar2), m.f(), m.c(), m.b());
    }

    FirebaseMessaging(c6.e eVar, p6.a aVar, r6.e eVar2, z2.g gVar, n6.d dVar, e0 e0Var, z zVar, Executor executor, Executor executor2, Executor executor3) {
        this.f14894m = false;
        f14880q = gVar;
        this.f14882a = eVar;
        this.f14883b = aVar;
        this.f14884c = eVar2;
        this.f14888g = new a(dVar);
        Context j10 = eVar.j();
        this.f14885d = j10;
        o oVar = new o();
        this.f14895n = oVar;
        this.f14893l = e0Var;
        this.f14890i = executor;
        this.f14886e = zVar;
        this.f14887f = new m0(executor);
        this.f14889h = executor2;
        this.f14891j = executor3;
        Context j11 = eVar.j();
        if (j11 instanceof Application) {
            ((Application) j11).registerActivityLifecycleCallbacks(oVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + j11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0337a() { // from class: com.google.firebase.messaging.v
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.v();
            }
        });
        Task<w0> f10 = w0.f(this, e0Var, zVar, j10, m.g());
        this.f14892k = f10;
        f10.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.p
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.w((w0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.x();
            }
        });
    }
}
