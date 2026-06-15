package e1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.l;
import androidx.work.p;
import androidx.work.z;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import l1.q;
import l1.t;
import m1.m;
import m1.n;
/* compiled from: WorkerWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j implements Runnable {

    /* renamed from: t  reason: collision with root package name */
    static final String f24881t = p.f("WorkerWrapper");

    /* renamed from: a  reason: collision with root package name */
    Context f24882a;

    /* renamed from: b  reason: collision with root package name */
    private String f24883b;

    /* renamed from: c  reason: collision with root package name */
    private List<e> f24884c;

    /* renamed from: d  reason: collision with root package name */
    private WorkerParameters.a f24885d;

    /* renamed from: e  reason: collision with root package name */
    l1.p f24886e;

    /* renamed from: f  reason: collision with root package name */
    ListenableWorker f24887f;

    /* renamed from: g  reason: collision with root package name */
    n1.a f24888g;

    /* renamed from: i  reason: collision with root package name */
    private androidx.work.b f24890i;

    /* renamed from: j  reason: collision with root package name */
    private k1.a f24891j;

    /* renamed from: k  reason: collision with root package name */
    private WorkDatabase f24892k;

    /* renamed from: l  reason: collision with root package name */
    private q f24893l;

    /* renamed from: m  reason: collision with root package name */
    private l1.b f24894m;

    /* renamed from: n  reason: collision with root package name */
    private t f24895n;

    /* renamed from: o  reason: collision with root package name */
    private List<String> f24896o;

    /* renamed from: p  reason: collision with root package name */
    private String f24897p;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f24900s;

    /* renamed from: h  reason: collision with root package name */
    ListenableWorker.a f24889h = ListenableWorker.a.a();

    /* renamed from: q  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<Boolean> f24898q = androidx.work.impl.utils.futures.c.s();

    /* renamed from: r  reason: collision with root package name */
    b6.a<ListenableWorker.a> f24899r = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkerWrapper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b6.a f24901a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f24902b;

        a(b6.a aVar, androidx.work.impl.utils.futures.c cVar) {
            this.f24901a = aVar;
            this.f24902b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f24901a.get();
                p.c().a(j.f24881t, String.format("Starting work for %s", j.this.f24886e.f27434c), new Throwable[0]);
                j jVar = j.this;
                jVar.f24899r = jVar.f24887f.startWork();
                this.f24902b.q(j.this.f24899r);
            } catch (Throwable th) {
                this.f24902b.p(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkerWrapper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f24904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f24905b;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f24904a = cVar;
            this.f24905b = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f24904a.get();
                    if (aVar == null) {
                        p.c().b(j.f24881t, String.format("%s returned a null result. Treating it as a failure.", j.this.f24886e.f27434c), new Throwable[0]);
                    } else {
                        p.c().a(j.f24881t, String.format("%s returned a %s result.", j.this.f24886e.f27434c, aVar), new Throwable[0]);
                        j.this.f24889h = aVar;
                    }
                } catch (InterruptedException e8) {
                    e = e8;
                    p.c().b(j.f24881t, String.format("%s failed because it threw an exception/error", this.f24905b), e);
                } catch (CancellationException e10) {
                    p.c().d(j.f24881t, String.format("%s was cancelled", this.f24905b), e10);
                } catch (ExecutionException e11) {
                    e = e11;
                    p.c().b(j.f24881t, String.format("%s failed because it threw an exception/error", this.f24905b), e);
                }
            } finally {
                j.this.f();
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Context f24907a;

        /* renamed from: b  reason: collision with root package name */
        ListenableWorker f24908b;

        /* renamed from: c  reason: collision with root package name */
        k1.a f24909c;

        /* renamed from: d  reason: collision with root package name */
        n1.a f24910d;

        /* renamed from: e  reason: collision with root package name */
        androidx.work.b f24911e;

        /* renamed from: f  reason: collision with root package name */
        WorkDatabase f24912f;

        /* renamed from: g  reason: collision with root package name */
        String f24913g;

        /* renamed from: h  reason: collision with root package name */
        List<e> f24914h;

        /* renamed from: i  reason: collision with root package name */
        WorkerParameters.a f24915i = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, n1.a aVar, k1.a aVar2, WorkDatabase workDatabase, String str) {
            this.f24907a = context.getApplicationContext();
            this.f24910d = aVar;
            this.f24909c = aVar2;
            this.f24911e = bVar;
            this.f24912f = workDatabase;
            this.f24913g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f24915i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f24914h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f24882a = cVar.f24907a;
        this.f24888g = cVar.f24910d;
        this.f24891j = cVar.f24909c;
        this.f24883b = cVar.f24913g;
        this.f24884c = cVar.f24914h;
        this.f24885d = cVar.f24915i;
        this.f24887f = cVar.f24908b;
        this.f24890i = cVar.f24911e;
        WorkDatabase workDatabase = cVar.f24912f;
        this.f24892k = workDatabase;
        this.f24893l = workDatabase.l();
        this.f24894m = this.f24892k.d();
        this.f24895n = this.f24892k.m();
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f24883b);
        sb.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            p.c().d(f24881t, String.format("Worker result SUCCESS for %s", this.f24897p), new Throwable[0]);
            if (this.f24886e.d()) {
                h();
            } else {
                m();
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            p.c().d(f24881t, String.format("Worker result RETRY for %s", this.f24897p), new Throwable[0]);
            g();
        } else {
            p.c().d(f24881t, String.format("Worker result FAILURE for %s", this.f24897p), new Throwable[0]);
            if (this.f24886e.d()) {
                h();
            } else {
                l();
            }
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f24893l.f(str2) != z.a.CANCELLED) {
                this.f24893l.b(z.a.FAILED, str2);
            }
            linkedList.addAll(this.f24894m.b(str2));
        }
    }

    private void g() {
        this.f24892k.beginTransaction();
        try {
            this.f24893l.b(z.a.ENQUEUED, this.f24883b);
            this.f24893l.v(this.f24883b, System.currentTimeMillis());
            this.f24893l.l(this.f24883b, -1L);
            this.f24892k.setTransactionSuccessful();
        } finally {
            this.f24892k.endTransaction();
            i(true);
        }
    }

    private void h() {
        this.f24892k.beginTransaction();
        try {
            this.f24893l.v(this.f24883b, System.currentTimeMillis());
            this.f24893l.b(z.a.ENQUEUED, this.f24883b);
            this.f24893l.r(this.f24883b);
            this.f24893l.l(this.f24883b, -1L);
            this.f24892k.setTransactionSuccessful();
        } finally {
            this.f24892k.endTransaction();
            i(false);
        }
    }

    private void i(boolean z10) {
        ListenableWorker listenableWorker;
        this.f24892k.beginTransaction();
        try {
            if (!this.f24892k.l().q()) {
                m1.d.a(this.f24882a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f24893l.b(z.a.ENQUEUED, this.f24883b);
                this.f24893l.l(this.f24883b, -1L);
            }
            if (this.f24886e != null && (listenableWorker = this.f24887f) != null && listenableWorker.isRunInForeground()) {
                this.f24891j.a(this.f24883b);
            }
            this.f24892k.setTransactionSuccessful();
            this.f24892k.endTransaction();
            this.f24898q.o(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f24892k.endTransaction();
            throw th;
        }
    }

    private void j() {
        z.a f10 = this.f24893l.f(this.f24883b);
        if (f10 == z.a.RUNNING) {
            p.c().a(f24881t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f24883b), new Throwable[0]);
            i(true);
            return;
        }
        p.c().a(f24881t, String.format("Status for %s is %s; not doing any work", this.f24883b, f10), new Throwable[0]);
        i(false);
    }

    private void k() {
        androidx.work.e b10;
        if (n()) {
            return;
        }
        this.f24892k.beginTransaction();
        try {
            l1.p g10 = this.f24893l.g(this.f24883b);
            this.f24886e = g10;
            if (g10 == null) {
                p.c().b(f24881t, String.format("Didn't find WorkSpec for id %s", this.f24883b), new Throwable[0]);
                i(false);
                this.f24892k.setTransactionSuccessful();
            } else if (g10.f27433b != z.a.ENQUEUED) {
                j();
                this.f24892k.setTransactionSuccessful();
                p.c().a(f24881t, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f24886e.f27434c), new Throwable[0]);
            } else {
                if (g10.d() || this.f24886e.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    l1.p pVar = this.f24886e;
                    if (!(pVar.f27445n == 0) && currentTimeMillis < pVar.a()) {
                        p.c().a(f24881t, String.format("Delaying execution for %s because it is being executed before schedule.", this.f24886e.f27434c), new Throwable[0]);
                        i(true);
                        this.f24892k.setTransactionSuccessful();
                        return;
                    }
                }
                this.f24892k.setTransactionSuccessful();
                this.f24892k.endTransaction();
                if (this.f24886e.d()) {
                    b10 = this.f24886e.f27436e;
                } else {
                    l b11 = this.f24890i.f().b(this.f24886e.f27435d);
                    if (b11 == null) {
                        p.c().b(f24881t, String.format("Could not create Input Merger %s", this.f24886e.f27435d), new Throwable[0]);
                        l();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f24886e.f27436e);
                    arrayList.addAll(this.f24893l.i(this.f24883b));
                    b10 = b11.b(arrayList);
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f24883b), b10, this.f24896o, this.f24885d, this.f24886e.f27442k, this.f24890i.e(), this.f24888g, this.f24890i.m(), new n(this.f24892k, this.f24888g), new m(this.f24892k, this.f24891j, this.f24888g));
                if (this.f24887f == null) {
                    this.f24887f = this.f24890i.m().b(this.f24882a, this.f24886e.f27434c, workerParameters);
                }
                ListenableWorker listenableWorker = this.f24887f;
                if (listenableWorker == null) {
                    p.c().b(f24881t, String.format("Could not create Worker %s", this.f24886e.f27434c), new Throwable[0]);
                    l();
                } else if (listenableWorker.isUsed()) {
                    p.c().b(f24881t, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f24886e.f27434c), new Throwable[0]);
                    l();
                } else {
                    this.f24887f.setUsed();
                    if (o()) {
                        if (n()) {
                            return;
                        }
                        androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
                        m1.l lVar = new m1.l(this.f24882a, this.f24886e, this.f24887f, workerParameters.b(), this.f24888g);
                        this.f24888g.a().execute(lVar);
                        b6.a<Void> b12 = lVar.b();
                        b12.addListener(new a(b12, s10), this.f24888g.a());
                        s10.addListener(new b(s10, this.f24897p), this.f24888g.c());
                        return;
                    }
                    j();
                }
            }
        } finally {
            this.f24892k.endTransaction();
        }
    }

    private void m() {
        this.f24892k.beginTransaction();
        try {
            this.f24893l.b(z.a.SUCCEEDED, this.f24883b);
            this.f24893l.o(this.f24883b, ((ListenableWorker.a.c) this.f24889h).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f24894m.b(this.f24883b)) {
                if (this.f24893l.f(str) == z.a.BLOCKED && this.f24894m.c(str)) {
                    p.c().d(f24881t, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f24893l.b(z.a.ENQUEUED, str);
                    this.f24893l.v(str, currentTimeMillis);
                }
            }
            this.f24892k.setTransactionSuccessful();
        } finally {
            this.f24892k.endTransaction();
            i(false);
        }
    }

    private boolean n() {
        if (this.f24900s) {
            p.c().a(f24881t, String.format("Work interrupted for %s", this.f24897p), new Throwable[0]);
            z.a f10 = this.f24893l.f(this.f24883b);
            if (f10 == null) {
                i(false);
            } else {
                i(!f10.a());
            }
            return true;
        }
        return false;
    }

    private boolean o() {
        this.f24892k.beginTransaction();
        try {
            boolean z10 = true;
            if (this.f24893l.f(this.f24883b) == z.a.ENQUEUED) {
                this.f24893l.b(z.a.RUNNING, this.f24883b);
                this.f24893l.u(this.f24883b);
            } else {
                z10 = false;
            }
            this.f24892k.setTransactionSuccessful();
            return z10;
        } finally {
            this.f24892k.endTransaction();
        }
    }

    public b6.a<Boolean> b() {
        return this.f24898q;
    }

    public void d() {
        boolean z10;
        this.f24900s = true;
        n();
        b6.a<ListenableWorker.a> aVar = this.f24899r;
        if (aVar != null) {
            z10 = aVar.isDone();
            this.f24899r.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = this.f24887f;
        if (listenableWorker != null && !z10) {
            listenableWorker.stop();
        } else {
            p.c().a(f24881t, String.format("WorkSpec %s is already done. Not interrupting.", this.f24886e), new Throwable[0]);
        }
    }

    void f() {
        if (!n()) {
            this.f24892k.beginTransaction();
            try {
                z.a f10 = this.f24893l.f(this.f24883b);
                this.f24892k.k().a(this.f24883b);
                if (f10 == null) {
                    i(false);
                } else if (f10 == z.a.RUNNING) {
                    c(this.f24889h);
                } else if (!f10.a()) {
                    g();
                }
                this.f24892k.setTransactionSuccessful();
            } finally {
                this.f24892k.endTransaction();
            }
        }
        List<e> list = this.f24884c;
        if (list != null) {
            for (e eVar : list) {
                eVar.c(this.f24883b);
            }
            f.b(this.f24890i, this.f24892k, this.f24884c);
        }
    }

    void l() {
        this.f24892k.beginTransaction();
        try {
            e(this.f24883b);
            this.f24893l.o(this.f24883b, ((ListenableWorker.a.C0082a) this.f24889h).e());
            this.f24892k.setTransactionSuccessful();
        } finally {
            this.f24892k.endTransaction();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> a10 = this.f24895n.a(this.f24883b);
        this.f24896o = a10;
        this.f24897p = a(a10);
        k();
    }
}
