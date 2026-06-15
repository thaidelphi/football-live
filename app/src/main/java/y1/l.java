package y1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import t2.a;
import y1.h;
import y1.p;
/* compiled from: EngineJob.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class l<R> implements h.b<R>, a.f {

    /* renamed from: z  reason: collision with root package name */
    private static final c f32955z = new c();

    /* renamed from: a  reason: collision with root package name */
    final e f32956a;

    /* renamed from: b  reason: collision with root package name */
    private final t2.c f32957b;

    /* renamed from: c  reason: collision with root package name */
    private final p.a f32958c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.core.util.f<l<?>> f32959d;

    /* renamed from: e  reason: collision with root package name */
    private final c f32960e;

    /* renamed from: f  reason: collision with root package name */
    private final m f32961f;

    /* renamed from: g  reason: collision with root package name */
    private final b2.a f32962g;

    /* renamed from: h  reason: collision with root package name */
    private final b2.a f32963h;

    /* renamed from: i  reason: collision with root package name */
    private final b2.a f32964i;

    /* renamed from: j  reason: collision with root package name */
    private final b2.a f32965j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f32966k;

    /* renamed from: l  reason: collision with root package name */
    private w1.f f32967l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f32968m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f32969n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f32970o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f32971p;

    /* renamed from: q  reason: collision with root package name */
    private v<?> f32972q;

    /* renamed from: r  reason: collision with root package name */
    w1.a f32973r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f32974s;

    /* renamed from: t  reason: collision with root package name */
    q f32975t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f32976u;

    /* renamed from: v  reason: collision with root package name */
    p<?> f32977v;

    /* renamed from: w  reason: collision with root package name */
    private h<R> f32978w;

    /* renamed from: x  reason: collision with root package name */
    private volatile boolean f32979x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f32980y;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EngineJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final o2.g f32981a;

        a(o2.g gVar) {
            this.f32981a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f32981a.f()) {
                synchronized (l.this) {
                    if (l.this.f32956a.b(this.f32981a)) {
                        l.this.f(this.f32981a);
                    }
                    l.this.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EngineJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final o2.g f32983a;

        b(o2.g gVar) {
            this.f32983a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f32983a.f()) {
                synchronized (l.this) {
                    if (l.this.f32956a.b(this.f32983a)) {
                        l.this.f32977v.c();
                        l.this.g(this.f32983a);
                        l.this.r(this.f32983a);
                    }
                    l.this.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {
        c() {
        }

        public <R> p<R> a(v<R> vVar, boolean z10, w1.f fVar, p.a aVar) {
            return new p<>(vVar, z10, true, fVar, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final o2.g f32985a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f32986b;

        d(o2.g gVar, Executor executor) {
            this.f32985a = gVar;
            this.f32986b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f32985a.equals(((d) obj).f32985a);
            }
            return false;
        }

        public int hashCode() {
            return this.f32985a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineJob.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f32987a;

        e() {
            this(new ArrayList(2));
        }

        private static d d(o2.g gVar) {
            return new d(gVar, s2.e.a());
        }

        void a(o2.g gVar, Executor executor) {
            this.f32987a.add(new d(gVar, executor));
        }

        boolean b(o2.g gVar) {
            return this.f32987a.contains(d(gVar));
        }

        e c() {
            return new e(new ArrayList(this.f32987a));
        }

        void clear() {
            this.f32987a.clear();
        }

        void e(o2.g gVar) {
            this.f32987a.remove(d(gVar));
        }

        boolean isEmpty() {
            return this.f32987a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f32987a.iterator();
        }

        int size() {
            return this.f32987a.size();
        }

        e(List<d> list) {
            this.f32987a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(b2.a aVar, b2.a aVar2, b2.a aVar3, b2.a aVar4, m mVar, p.a aVar5, androidx.core.util.f<l<?>> fVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, fVar, f32955z);
    }

    private b2.a j() {
        if (this.f32969n) {
            return this.f32964i;
        }
        return this.f32970o ? this.f32965j : this.f32963h;
    }

    private boolean m() {
        return this.f32976u || this.f32974s || this.f32979x;
    }

    private synchronized void q() {
        if (this.f32967l != null) {
            this.f32956a.clear();
            this.f32967l = null;
            this.f32977v = null;
            this.f32972q = null;
            this.f32976u = false;
            this.f32979x = false;
            this.f32974s = false;
            this.f32980y = false;
            this.f32978w.x(false);
            this.f32978w = null;
            this.f32975t = null;
            this.f32973r = null;
            this.f32959d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // y1.h.b
    public void a(q qVar) {
        synchronized (this) {
            this.f32975t = qVar;
        }
        n();
    }

    @Override // y1.h.b
    public void b(h<?> hVar) {
        j().execute(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y1.h.b
    public void c(v<R> vVar, w1.a aVar, boolean z10) {
        synchronized (this) {
            this.f32972q = vVar;
            this.f32973r = aVar;
            this.f32980y = z10;
        }
        o();
    }

    @Override // t2.a.f
    public t2.c d() {
        return this.f32957b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void e(o2.g gVar, Executor executor) {
        this.f32957b.c();
        this.f32956a.a(gVar, executor);
        boolean z10 = true;
        if (this.f32974s) {
            k(1);
            executor.execute(new b(gVar));
        } else if (this.f32976u) {
            k(1);
            executor.execute(new a(gVar));
        } else {
            if (this.f32979x) {
                z10 = false;
            }
            s2.j.a(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    void f(o2.g gVar) {
        try {
            gVar.a(this.f32975t);
        } catch (Throwable th) {
            throw new y1.b(th);
        }
    }

    void g(o2.g gVar) {
        try {
            gVar.c(this.f32977v, this.f32973r, this.f32980y);
        } catch (Throwable th) {
            throw new y1.b(th);
        }
    }

    void h() {
        if (m()) {
            return;
        }
        this.f32979x = true;
        this.f32978w.f();
        this.f32961f.c(this, this.f32967l);
    }

    void i() {
        p<?> pVar;
        synchronized (this) {
            this.f32957b.c();
            s2.j.a(m(), "Not yet complete!");
            int decrementAndGet = this.f32966k.decrementAndGet();
            s2.j.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.f32977v;
                q();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.f();
        }
    }

    synchronized void k(int i10) {
        p<?> pVar;
        s2.j.a(m(), "Not yet complete!");
        if (this.f32966k.getAndAdd(i10) == 0 && (pVar = this.f32977v) != null) {
            pVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized l<R> l(w1.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f32967l = fVar;
        this.f32968m = z10;
        this.f32969n = z11;
        this.f32970o = z12;
        this.f32971p = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            this.f32957b.c();
            if (this.f32979x) {
                q();
            } else if (!this.f32956a.isEmpty()) {
                if (!this.f32976u) {
                    this.f32976u = true;
                    w1.f fVar = this.f32967l;
                    e c10 = this.f32956a.c();
                    k(c10.size() + 1);
                    this.f32961f.b(this, fVar, null);
                    Iterator<d> it = c10.iterator();
                    while (it.hasNext()) {
                        d next = it.next();
                        next.f32986b.execute(new a(next.f32985a));
                    }
                    i();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
    }

    void o() {
        synchronized (this) {
            this.f32957b.c();
            if (this.f32979x) {
                this.f32972q.a();
                q();
            } else if (!this.f32956a.isEmpty()) {
                if (!this.f32974s) {
                    this.f32977v = this.f32960e.a(this.f32972q, this.f32968m, this.f32967l, this.f32958c);
                    this.f32974s = true;
                    e c10 = this.f32956a.c();
                    k(c10.size() + 1);
                    this.f32961f.b(this, this.f32967l, this.f32977v);
                    Iterator<d> it = c10.iterator();
                    while (it.hasNext()) {
                        d next = it.next();
                        next.f32986b.execute(new b(next.f32985a));
                    }
                    i();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f32971p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void r(o2.g gVar) {
        boolean z10;
        this.f32957b.c();
        this.f32956a.e(gVar);
        if (this.f32956a.isEmpty()) {
            h();
            if (!this.f32974s && !this.f32976u) {
                z10 = false;
                if (z10 && this.f32966k.get() == 0) {
                    q();
                }
            }
            z10 = true;
            if (z10) {
                q();
            }
        }
    }

    public synchronized void s(h<R> hVar) {
        this.f32978w = hVar;
        (hVar.D() ? this.f32962g : j()).execute(hVar);
    }

    l(b2.a aVar, b2.a aVar2, b2.a aVar3, b2.a aVar4, m mVar, p.a aVar5, androidx.core.util.f<l<?>> fVar, c cVar) {
        this.f32956a = new e();
        this.f32957b = t2.c.a();
        this.f32966k = new AtomicInteger();
        this.f32962g = aVar;
        this.f32963h = aVar2;
        this.f32964i = aVar3;
        this.f32965j = aVar4;
        this.f32961f = mVar;
        this.f32958c = aVar5;
        this.f32959d = fVar;
        this.f32960e = cVar;
    }
}
