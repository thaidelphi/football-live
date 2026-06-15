package androidx.lifecycle;

import androidx.lifecycle.i;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    static final Object f3543k = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f3544a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private l.b<x<? super T>, LiveData<T>.c> f3545b = new l.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f3546c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3547d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f3548e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f3549f;

    /* renamed from: g  reason: collision with root package name */
    private int f3550g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3551h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3552i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f3553j;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.c implements m {

        /* renamed from: e  reason: collision with root package name */
        final p f3554e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LiveData f3555f;

        @Override // androidx.lifecycle.LiveData.c
        void h() {
            this.f3554e.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean i() {
            return this.f3554e.getLifecycle().b().b(i.b.STARTED);
        }

        @Override // androidx.lifecycle.m
        public void onStateChanged(p pVar, i.a aVar) {
            i.b b10 = this.f3554e.getLifecycle().b();
            if (b10 == i.b.DESTROYED) {
                this.f3555f.i(this.f3558a);
                return;
            }
            i.b bVar = null;
            while (bVar != b10) {
                g(i());
                bVar = b10;
                b10 = this.f3554e.getLifecycle().b();
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f3544a) {
                obj = LiveData.this.f3549f;
                LiveData.this.f3549f = LiveData.f3543k;
            }
            LiveData.this.j(obj);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b extends LiveData<T>.c {
        b(x<? super T> xVar) {
            super(xVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean i() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final x<? super T> f3558a;

        /* renamed from: b  reason: collision with root package name */
        boolean f3559b;

        /* renamed from: c  reason: collision with root package name */
        int f3560c = -1;

        c(x<? super T> xVar) {
            this.f3558a = xVar;
        }

        void g(boolean z10) {
            if (z10 == this.f3559b) {
                return;
            }
            this.f3559b = z10;
            LiveData.this.b(z10 ? 1 : -1);
            if (this.f3559b) {
                LiveData.this.d(this);
            }
        }

        void h() {
        }

        abstract boolean i();
    }

    public LiveData() {
        Object obj = f3543k;
        this.f3549f = obj;
        this.f3553j = new a();
        this.f3548e = obj;
        this.f3550g = -1;
    }

    static void a(String str) {
        if (k.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(LiveData<T>.c cVar) {
        if (cVar.f3559b) {
            if (!cVar.i()) {
                cVar.g(false);
                return;
            }
            int i10 = cVar.f3560c;
            int i11 = this.f3550g;
            if (i10 >= i11) {
                return;
            }
            cVar.f3560c = i11;
            cVar.f3558a.a((Object) this.f3548e);
        }
    }

    void b(int i10) {
        int i11 = this.f3546c;
        this.f3546c = i10 + i11;
        if (this.f3547d) {
            return;
        }
        this.f3547d = true;
        while (true) {
            try {
                int i12 = this.f3546c;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    f();
                } else if (z11) {
                    g();
                }
                i11 = i12;
            } finally {
                this.f3547d = false;
            }
        }
    }

    void d(LiveData<T>.c cVar) {
        if (this.f3551h) {
            this.f3552i = true;
            return;
        }
        this.f3551h = true;
        do {
            this.f3552i = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                l.b<x<? super T>, LiveData<T>.c>.d c10 = this.f3545b.c();
                while (c10.hasNext()) {
                    c((c) c10.next().getValue());
                    if (this.f3552i) {
                        break;
                    }
                }
            }
        } while (this.f3552i);
        this.f3551h = false;
    }

    public void e(x<? super T> xVar) {
        a("observeForever");
        b bVar = new b(xVar);
        LiveData<T>.c f10 = this.f3545b.f(xVar, bVar);
        if (f10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f10 != null) {
            return;
        }
        bVar.g(true);
    }

    protected void f() {
    }

    protected void g() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(T t10) {
        boolean z10;
        synchronized (this.f3544a) {
            z10 = this.f3549f == f3543k;
            this.f3549f = t10;
        }
        if (z10) {
            k.c.g().c(this.f3553j);
        }
    }

    public void i(x<? super T> xVar) {
        a("removeObserver");
        LiveData<T>.c g10 = this.f3545b.g(xVar);
        if (g10 == null) {
            return;
        }
        g10.h();
        g10.g(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(T t10) {
        a("setValue");
        this.f3550g++;
        this.f3548e = t10;
        d(null);
    }
}
