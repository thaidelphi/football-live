package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import e1.i;
import h1.c;
import h1.d;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: f  reason: collision with root package name */
    private static final String f4796f = p.f("ConstraintTrkngWrkr");

    /* renamed from: a  reason: collision with root package name */
    private WorkerParameters f4797a;

    /* renamed from: b  reason: collision with root package name */
    final Object f4798b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f4799c;

    /* renamed from: d  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f4800d;

    /* renamed from: e  reason: collision with root package name */
    private ListenableWorker f4801e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b6.a f4803a;

        b(b6.a aVar) {
            this.f4803a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f4798b) {
                if (ConstraintTrackingWorker.this.f4799c) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.f4800d.q(this.f4803a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4797a = workerParameters;
        this.f4798b = new Object();
        this.f4799c = false;
        this.f4800d = androidx.work.impl.utils.futures.c.s();
    }

    public WorkDatabase a() {
        return i.s(getApplicationContext()).w();
    }

    @Override // h1.c
    public void b(List<String> list) {
        p.c().a(f4796f, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f4798b) {
            this.f4799c = true;
        }
    }

    void c() {
        this.f4800d.o(ListenableWorker.a.a());
    }

    void d() {
        this.f4800d.o(ListenableWorker.a.b());
    }

    void e() {
        String j10 = getInputData().j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(j10)) {
            p.c().b(f4796f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker b10 = getWorkerFactory().b(getApplicationContext(), j10, this.f4797a);
        this.f4801e = b10;
        if (b10 == null) {
            p.c().a(f4796f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        l1.p g10 = a().l().g(getId().toString());
        if (g10 == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(g10));
        if (dVar.c(getId().toString())) {
            p.c().a(f4796f, String.format("Constraints met for delegate %s", j10), new Throwable[0]);
            try {
                b6.a<ListenableWorker.a> startWork = this.f4801e.startWork();
                startWork.addListener(new b(startWork), getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                p c10 = p.c();
                String str = f4796f;
                c10.a(str, String.format("Delegated worker %s threw exception in startWork.", j10), th);
                synchronized (this.f4798b) {
                    if (this.f4799c) {
                        p.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                    return;
                }
            }
        }
        p.c().a(f4796f, String.format("Constraints not met for delegate %s. Requesting retry.", j10), new Throwable[0]);
        d();
    }

    @Override // h1.c
    public void f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public n1.a getTaskExecutor() {
        return i.s(getApplicationContext()).x();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f4801e;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f4801e;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f4801e.stop();
    }

    @Override // androidx.work.ListenableWorker
    public b6.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f4800d;
    }
}
