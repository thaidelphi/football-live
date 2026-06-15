package o2;

import o2.d;
/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements d, c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f29089a;

    /* renamed from: b  reason: collision with root package name */
    private final d f29090b;

    /* renamed from: c  reason: collision with root package name */
    private volatile c f29091c;

    /* renamed from: d  reason: collision with root package name */
    private volatile c f29092d;

    /* renamed from: e  reason: collision with root package name */
    private d.a f29093e;

    /* renamed from: f  reason: collision with root package name */
    private d.a f29094f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f29093e = aVar;
        this.f29094f = aVar;
        this.f29089a = obj;
        this.f29090b = dVar;
    }

    private boolean k(c cVar) {
        return cVar.equals(this.f29091c) || (this.f29093e == d.a.FAILED && cVar.equals(this.f29092d));
    }

    private boolean l() {
        d dVar = this.f29090b;
        return dVar == null || dVar.a(this);
    }

    private boolean m() {
        d dVar = this.f29090b;
        return dVar == null || dVar.d(this);
    }

    private boolean n() {
        d dVar = this.f29090b;
        return dVar == null || dVar.c(this);
    }

    @Override // o2.d
    public boolean a(c cVar) {
        boolean z10;
        synchronized (this.f29089a) {
            z10 = l() && k(cVar);
        }
        return z10;
    }

    @Override // o2.d, o2.c
    public boolean b() {
        boolean z10;
        synchronized (this.f29089a) {
            z10 = this.f29091c.b() || this.f29092d.b();
        }
        return z10;
    }

    @Override // o2.d
    public boolean c(c cVar) {
        boolean z10;
        synchronized (this.f29089a) {
            z10 = n() && k(cVar);
        }
        return z10;
    }

    @Override // o2.c
    public void clear() {
        synchronized (this.f29089a) {
            d.a aVar = d.a.CLEARED;
            this.f29093e = aVar;
            this.f29091c.clear();
            if (this.f29094f != aVar) {
                this.f29094f = aVar;
                this.f29092d.clear();
            }
        }
    }

    @Override // o2.d
    public boolean d(c cVar) {
        boolean z10;
        synchronized (this.f29089a) {
            z10 = m() && k(cVar);
        }
        return z10;
    }

    @Override // o2.c
    public boolean e() {
        boolean z10;
        synchronized (this.f29089a) {
            d.a aVar = this.f29093e;
            d.a aVar2 = d.a.CLEARED;
            z10 = aVar == aVar2 && this.f29094f == aVar2;
        }
        return z10;
    }

    @Override // o2.d
    public void f(c cVar) {
        synchronized (this.f29089a) {
            if (!cVar.equals(this.f29092d)) {
                this.f29093e = d.a.FAILED;
                d.a aVar = this.f29094f;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f29094f = aVar2;
                    this.f29092d.j();
                }
                return;
            }
            this.f29094f = d.a.FAILED;
            d dVar = this.f29090b;
            if (dVar != null) {
                dVar.f(this);
            }
        }
    }

    @Override // o2.c
    public boolean g(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            return this.f29091c.g(bVar.f29091c) && this.f29092d.g(bVar.f29092d);
        }
        return false;
    }

    @Override // o2.d
    public d getRoot() {
        d root;
        synchronized (this.f29089a) {
            d dVar = this.f29090b;
            root = dVar != null ? dVar.getRoot() : this;
        }
        return root;
    }

    @Override // o2.c
    public boolean h() {
        boolean z10;
        synchronized (this.f29089a) {
            d.a aVar = this.f29093e;
            d.a aVar2 = d.a.SUCCESS;
            z10 = aVar == aVar2 || this.f29094f == aVar2;
        }
        return z10;
    }

    @Override // o2.d
    public void i(c cVar) {
        synchronized (this.f29089a) {
            if (cVar.equals(this.f29091c)) {
                this.f29093e = d.a.SUCCESS;
            } else if (cVar.equals(this.f29092d)) {
                this.f29094f = d.a.SUCCESS;
            }
            d dVar = this.f29090b;
            if (dVar != null) {
                dVar.i(this);
            }
        }
    }

    @Override // o2.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f29089a) {
            d.a aVar = this.f29093e;
            d.a aVar2 = d.a.RUNNING;
            z10 = aVar == aVar2 || this.f29094f == aVar2;
        }
        return z10;
    }

    @Override // o2.c
    public void j() {
        synchronized (this.f29089a) {
            d.a aVar = this.f29093e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                this.f29093e = aVar2;
                this.f29091c.j();
            }
        }
    }

    public void o(c cVar, c cVar2) {
        this.f29091c = cVar;
        this.f29092d = cVar2;
    }

    @Override // o2.c
    public void pause() {
        synchronized (this.f29089a) {
            d.a aVar = this.f29093e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar == aVar2) {
                this.f29093e = d.a.PAUSED;
                this.f29091c.pause();
            }
            if (this.f29094f == aVar2) {
                this.f29094f = d.a.PAUSED;
                this.f29092d.pause();
            }
        }
    }
}
