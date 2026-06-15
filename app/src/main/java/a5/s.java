package a5;

import a5.m;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ListenerSet.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class s<T> {

    /* renamed from: a  reason: collision with root package name */
    private final d f501a;

    /* renamed from: b  reason: collision with root package name */
    private final p f502b;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f503c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f504d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<Runnable> f505e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<Runnable> f506f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f507g;

    /* compiled from: ListenerSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a<T> {
        void invoke(T t10);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b<T> {
        void a(T t10, m mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListenerSet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f508a;

        /* renamed from: b  reason: collision with root package name */
        private m.b f509b = new m.b();

        /* renamed from: c  reason: collision with root package name */
        private boolean f510c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f511d;

        public c(T t10) {
            this.f508a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f511d) {
                return;
            }
            if (i10 != -1) {
                this.f509b.a(i10);
            }
            this.f510c = true;
            aVar.invoke(this.f508a);
        }

        public void b(b<T> bVar) {
            if (this.f511d || !this.f510c) {
                return;
            }
            m e8 = this.f509b.e();
            this.f509b = new m.b();
            this.f510c = false;
            bVar.a(this.f508a, e8);
        }

        public void c(b<T> bVar) {
            this.f511d = true;
            if (this.f510c) {
                this.f510c = false;
                bVar.a(this.f508a, this.f509b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f508a.equals(((c) obj).f508a);
        }

        public int hashCode() {
            return this.f508a.hashCode();
        }
    }

    public s(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f504d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f503c);
            if (this.f502b.b(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(T t10) {
        if (this.f507g) {
            return;
        }
        a5.a.e(t10);
        this.f504d.add(new c<>(t10));
    }

    public s<T> d(Looper looper, d dVar, b<T> bVar) {
        return new s<>(this.f504d, looper, dVar, bVar);
    }

    public s<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f501a, bVar);
    }

    public void f() {
        if (this.f506f.isEmpty()) {
            return;
        }
        if (!this.f502b.b(0)) {
            p pVar = this.f502b;
            pVar.g(pVar.a(0));
        }
        boolean z10 = !this.f505e.isEmpty();
        this.f505e.addAll(this.f506f);
        this.f506f.clear();
        if (z10) {
            return;
        }
        while (!this.f505e.isEmpty()) {
            this.f505e.peekFirst().run();
            this.f505e.removeFirst();
        }
    }

    public void i(final int i10, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f504d);
        this.f506f.add(new Runnable() { // from class: a5.r
            @Override // java.lang.Runnable
            public final void run() {
                s.h(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j(T t10) {
        Iterator<c<T>> it = this.f504d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f508a.equals(t10)) {
                next.c(this.f503c);
                this.f504d.remove(next);
            }
        }
    }

    public void k(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }

    private s(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f501a = dVar;
        this.f504d = copyOnWriteArraySet;
        this.f503c = bVar;
        this.f505e = new ArrayDeque<>();
        this.f506f = new ArrayDeque<>();
        this.f502b = dVar.d(looper, new Handler.Callback() { // from class: a5.q
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean g10;
                g10 = s.this.g(message);
                return g10;
            }
        });
    }
}
