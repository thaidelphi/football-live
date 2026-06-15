package e1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.b;
import androidx.work.b0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.p;
import androidx.work.r;
import androidx.work.s;
import androidx.work.u;
import androidx.work.w;
import androidx.work.y;
import androidx.work.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* compiled from: WorkManagerImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i extends a0 {

    /* renamed from: j  reason: collision with root package name */
    private static final String f24868j = p.f("WorkManagerImpl");

    /* renamed from: k  reason: collision with root package name */
    private static i f24869k = null;

    /* renamed from: l  reason: collision with root package name */
    private static i f24870l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f24871m = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f24872a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.work.b f24873b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f24874c;

    /* renamed from: d  reason: collision with root package name */
    private n1.a f24875d;

    /* renamed from: e  reason: collision with root package name */
    private List<e> f24876e;

    /* renamed from: f  reason: collision with root package name */
    private d f24877f;

    /* renamed from: g  reason: collision with root package name */
    private m1.e f24878g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f24879h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f24880i;

    public i(Context context, androidx.work.b bVar, n1.a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(w.f4828a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (e1.i.f24870l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        e1.i.f24870l = new e1.i(r4, r5, new n1.b(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        e1.i.f24869k = e1.i.f24870l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(android.content.Context r4, androidx.work.b r5) {
        /*
            java.lang.Object r0 = e1.i.f24871m
            monitor-enter(r0)
            e1.i r1 = e1.i.f24869k     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            e1.i r2 = e1.i.f24870l     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            e1.i r1 = e1.i.f24870l     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            e1.i r1 = new e1.i     // Catch: java.lang.Throwable -> L34
            n1.b r2 = new n1.b     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.l()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            e1.i.f24870l = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            e1.i r4 = e1.i.f24870l     // Catch: java.lang.Throwable -> L34
            e1.i.f24869k = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.i.l(android.content.Context, androidx.work.b):void");
    }

    @Deprecated
    public static i r() {
        synchronized (f24871m) {
            i iVar = f24869k;
            if (iVar != null) {
                return iVar;
            }
            return f24870l;
        }
    }

    public static i s(Context context) {
        i r10;
        synchronized (f24871m) {
            r10 = r();
            if (r10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.c) {
                    l(applicationContext, ((b.c) applicationContext).a());
                    r10 = s(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return r10;
    }

    private void y(Context context, androidx.work.b bVar, n1.a aVar, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f24872a = applicationContext;
        this.f24873b = bVar;
        this.f24875d = aVar;
        this.f24874c = workDatabase;
        this.f24876e = list;
        this.f24877f = dVar;
        this.f24878g = new m1.e(workDatabase);
        this.f24879h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f24875d.b(new ForceStopRunnable(applicationContext, this));
    }

    public void A() {
        if (Build.VERSION.SDK_INT >= 23) {
            g1.b.b(p());
        }
        w().l().k();
        f.b(q(), w(), v());
    }

    public void B(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f24871m) {
            this.f24880i = pendingResult;
            if (this.f24879h) {
                pendingResult.finish();
                this.f24880i = null;
            }
        }
    }

    public void C(String str) {
        D(str, null);
    }

    public void D(String str, WorkerParameters.a aVar) {
        this.f24875d.b(new m1.h(this, str, aVar));
    }

    public void E(String str) {
        this.f24875d.b(new m1.j(this, str, true));
    }

    public void F(String str) {
        this.f24875d.b(new m1.j(this, str, false));
    }

    @Override // androidx.work.a0
    public y b(List<r> list) {
        if (!list.isEmpty()) {
            return new g(this, list);
        }
        throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }

    @Override // androidx.work.a0
    public s c(String str) {
        m1.a d10 = m1.a.d(str, this);
        this.f24875d.b(d10);
        return d10.e();
    }

    @Override // androidx.work.a0
    public s d(String str) {
        m1.a c10 = m1.a.c(str, this, true);
        this.f24875d.b(c10);
        return c10.e();
    }

    @Override // androidx.work.a0
    public s f(List<? extends b0> list) {
        if (!list.isEmpty()) {
            return new g(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // androidx.work.a0
    public s g(String str, androidx.work.g gVar, u uVar) {
        return o(str, gVar, uVar).a();
    }

    @Override // androidx.work.a0
    public s i(String str, androidx.work.h hVar, List<r> list) {
        return new g(this, str, hVar, list).a();
    }

    @Override // androidx.work.a0
    public b6.a<List<z>> k(String str) {
        m1.i<List<z>> a10 = m1.i.a(this, str);
        this.f24875d.c().execute(a10);
        return a10.b();
    }

    public s m(UUID uuid) {
        m1.a b10 = m1.a.b(uuid, this);
        this.f24875d.b(b10);
        return b10.e();
    }

    public List<e> n(Context context, androidx.work.b bVar, n1.a aVar) {
        return Arrays.asList(f.a(context, this), new f1.b(context, bVar, aVar, this));
    }

    public g o(String str, androidx.work.g gVar, u uVar) {
        androidx.work.h hVar;
        if (gVar == androidx.work.g.KEEP) {
            hVar = androidx.work.h.KEEP;
        } else {
            hVar = androidx.work.h.REPLACE;
        }
        return new g(this, str, hVar, Collections.singletonList(uVar));
    }

    public Context p() {
        return this.f24872a;
    }

    public androidx.work.b q() {
        return this.f24873b;
    }

    public m1.e t() {
        return this.f24878g;
    }

    public d u() {
        return this.f24877f;
    }

    public List<e> v() {
        return this.f24876e;
    }

    public WorkDatabase w() {
        return this.f24874c;
    }

    public n1.a x() {
        return this.f24875d;
    }

    public void z() {
        synchronized (f24871m) {
            this.f24879h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f24880i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f24880i = null;
            }
        }
    }

    public i(Context context, androidx.work.b bVar, n1.a aVar, boolean z10) {
        this(context, bVar, aVar, WorkDatabase.c(context.getApplicationContext(), aVar.c(), z10));
    }

    public i(Context context, androidx.work.b bVar, n1.a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        p.e(new p.a(bVar.j()));
        List<e> n10 = n(applicationContext, bVar, aVar);
        y(context, bVar, aVar, workDatabase, n10, new d(context, bVar, aVar, workDatabase, n10));
    }
}
