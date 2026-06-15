package y1;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import y1.p;
/* compiled from: ActiveResources.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32826a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f32827b;

    /* renamed from: c  reason: collision with root package name */
    final Map<w1.f, d> f32828c;

    /* renamed from: d  reason: collision with root package name */
    private final ReferenceQueue<p<?>> f32829d;

    /* renamed from: e  reason: collision with root package name */
    private p.a f32830e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f32831f;

    /* renamed from: g  reason: collision with root package name */
    private volatile c f32832g;

    /* compiled from: ActiveResources.java */
    /* renamed from: y1.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class ThreadFactoryC0381a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: y1.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0382a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f32833a;

            RunnableC0382a(Runnable runnable) {
                this.f32833a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f32833a.run();
            }
        }

        ThreadFactoryC0381a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0382a(runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveResources.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveResources.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d extends WeakReference<p<?>> {

        /* renamed from: a  reason: collision with root package name */
        final w1.f f32836a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f32837b;

        /* renamed from: c  reason: collision with root package name */
        v<?> f32838c;

        d(w1.f fVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f32836a = (w1.f) s2.j.d(fVar);
            this.f32838c = (pVar.e() && z10) ? (v) s2.j.d(pVar.d()) : null;
            this.f32837b = pVar.e();
        }

        void a() {
            this.f32838c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0381a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(w1.f fVar, p<?> pVar) {
        d put = this.f32828c.put(fVar, new d(fVar, pVar, this.f32829d, this.f32826a));
        if (put != null) {
            put.a();
        }
    }

    void b() {
        while (!this.f32831f) {
            try {
                c((d) this.f32829d.remove());
                c cVar = this.f32832g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(d dVar) {
        v<?> vVar;
        synchronized (this) {
            this.f32828c.remove(dVar.f32836a);
            if (dVar.f32837b && (vVar = dVar.f32838c) != null) {
                this.f32830e.d(dVar.f32836a, new p<>(vVar, true, false, dVar.f32836a, this.f32830e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(w1.f fVar) {
        d remove = this.f32828c.remove(fVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized p<?> e(w1.f fVar) {
        d dVar = this.f32828c.get(fVar);
        if (dVar == null) {
            return null;
        }
        p<?> pVar = dVar.get();
        if (pVar == null) {
            c(dVar);
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f32830e = aVar;
            }
        }
    }

    a(boolean z10, Executor executor) {
        this.f32828c = new HashMap();
        this.f32829d = new ReferenceQueue<>();
        this.f32826a = z10;
        this.f32827b = executor;
        executor.execute(new b());
    }
}
