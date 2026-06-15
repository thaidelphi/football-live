package m1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.p;
/* compiled from: WorkForegroundRunnable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    static final String f27652g = p.f("WorkForegroundRunnable");

    /* renamed from: a  reason: collision with root package name */
    final androidx.work.impl.utils.futures.c<Void> f27653a = androidx.work.impl.utils.futures.c.s();

    /* renamed from: b  reason: collision with root package name */
    final Context f27654b;

    /* renamed from: c  reason: collision with root package name */
    final l1.p f27655c;

    /* renamed from: d  reason: collision with root package name */
    final ListenableWorker f27656d;

    /* renamed from: e  reason: collision with root package name */
    final androidx.work.j f27657e;

    /* renamed from: f  reason: collision with root package name */
    final n1.a f27658f;

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f27659a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f27659a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27659a.q(l.this.f27656d.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f27661a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f27661a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.i iVar = (androidx.work.i) this.f27661a.get();
                if (iVar != null) {
                    p.c().a(l.f27652g, String.format("Updating notification for %s", l.this.f27655c.f27434c), new Throwable[0]);
                    l.this.f27656d.setRunInForeground(true);
                    l lVar = l.this;
                    lVar.f27653a.q(lVar.f27657e.a(lVar.f27654b, lVar.f27656d.getId(), iVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", l.this.f27655c.f27434c));
            } catch (Throwable th) {
                l.this.f27653a.p(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public l(Context context, l1.p pVar, ListenableWorker listenableWorker, androidx.work.j jVar, n1.a aVar) {
        this.f27654b = context;
        this.f27655c = pVar;
        this.f27656d = listenableWorker;
        this.f27657e = jVar;
        this.f27658f = aVar;
    }

    public b6.a<Void> b() {
        return this.f27653a;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.f27655c.f27448q && !androidx.core.os.a.c()) {
            androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
            this.f27658f.a().execute(new a(s10));
            s10.addListener(new b(s10), this.f27658f.a());
            return;
        }
        this.f27653a.o(null);
    }
}
