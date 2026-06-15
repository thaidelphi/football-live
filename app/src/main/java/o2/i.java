package o2;

import o2.d;
/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i implements d, c {

    /* renamed from: a  reason: collision with root package name */
    private final d f29135a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f29136b;

    /* renamed from: c  reason: collision with root package name */
    private volatile c f29137c;

    /* renamed from: d  reason: collision with root package name */
    private volatile c f29138d;

    /* renamed from: e  reason: collision with root package name */
    private d.a f29139e;

    /* renamed from: f  reason: collision with root package name */
    private d.a f29140f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f29141g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f29139e = aVar;
        this.f29140f = aVar;
        this.f29136b = obj;
        this.f29135a = dVar;
    }

    private boolean k() {
        d dVar = this.f29135a;
        return dVar == null || dVar.a(this);
    }

    private boolean l() {
        d dVar = this.f29135a;
        return dVar == null || dVar.d(this);
    }

    private boolean m() {
        d dVar = this.f29135a;
        return dVar == null || dVar.c(this);
    }

    @Override // o2.d
    public boolean a(c cVar) {
        boolean z10;
        synchronized (this.f29136b) {
            z10 = k() && cVar.equals(this.f29137c) && this.f29139e != d.a.PAUSED;
        }
        return z10;
    }

    @Override // o2.d, o2.c
    public boolean b() {
        boolean z10;
        synchronized (this.f29136b) {
            z10 = this.f29138d.b() || this.f29137c.b();
        }
        return z10;
    }

    @Override // o2.d
    public boolean c(c cVar) {
        boolean z10;
        synchronized (this.f29136b) {
            z10 = m() && (cVar.equals(this.f29137c) || this.f29139e != d.a.SUCCESS);
        }
        return z10;
    }

    @Override // o2.c
    public void clear() {
        synchronized (this.f29136b) {
            this.f29141g = false;
            d.a aVar = d.a.CLEARED;
            this.f29139e = aVar;
            this.f29140f = aVar;
            this.f29138d.clear();
            this.f29137c.clear();
        }
    }

    @Override // o2.d
    public boolean d(c cVar) {
        boolean z10;
        synchronized (this.f29136b) {
            z10 = l() && cVar.equals(this.f29137c) && !b();
        }
        return z10;
    }

    @Override // o2.c
    public boolean e() {
        boolean z10;
        synchronized (this.f29136b) {
            z10 = this.f29139e == d.a.CLEARED;
        }
        return z10;
    }

    @Override // o2.d
    public void f(c cVar) {
        synchronized (this.f29136b) {
            if (!cVar.equals(this.f29137c)) {
                this.f29140f = d.a.FAILED;
                return;
            }
            this.f29139e = d.a.FAILED;
            d dVar = this.f29135a;
            if (dVar != null) {
                dVar.f(this);
            }
        }
    }

    @Override // o2.c
    public boolean g(c cVar) {
        if (cVar instanceof i) {
            i iVar = (i) cVar;
            if (this.f29137c == null) {
                if (iVar.f29137c != null) {
                    return false;
                }
            } else if (!this.f29137c.g(iVar.f29137c)) {
                return false;
            }
            if (this.f29138d == null) {
                if (iVar.f29138d != null) {
                    return false;
                }
            } else if (!this.f29138d.g(iVar.f29138d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // o2.d
    public d getRoot() {
        d root;
        synchronized (this.f29136b) {
            d dVar = this.f29135a;
            root = dVar != null ? dVar.getRoot() : this;
        }
        return root;
    }

    @Override // o2.c
    public boolean h() {
        boolean z10;
        synchronized (this.f29136b) {
            z10 = this.f29139e == d.a.SUCCESS;
        }
        return z10;
    }

    @Override // o2.d
    public void i(c cVar) {
        synchronized (this.f29136b) {
            if (cVar.equals(this.f29138d)) {
                this.f29140f = d.a.SUCCESS;
                return;
            }
            this.f29139e = d.a.SUCCESS;
            d dVar = this.f29135a;
            if (dVar != null) {
                dVar.i(this);
            }
            if (!this.f29140f.a()) {
                this.f29138d.clear();
            }
        }
    }

    @Override // o2.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f29136b) {
            z10 = this.f29139e == d.a.RUNNING;
        }
        return z10;
    }

    @Override // o2.c
    public void j() {
        synchronized (this.f29136b) {
            this.f29141g = true;
            if (this.f29139e != d.a.SUCCESS) {
                d.a aVar = this.f29140f;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f29140f = aVar2;
                    this.f29138d.j();
                }
            }
            if (this.f29141g) {
                d.a aVar3 = this.f29139e;
                d.a aVar4 = d.a.RUNNING;
                if (aVar3 != aVar4) {
                    this.f29139e = aVar4;
                    this.f29137c.j();
                }
            }
            this.f29141g = false;
        }
    }

    public void n(c cVar, c cVar2) {
        this.f29137c = cVar;
        this.f29138d = cVar2;
    }

    @Override // o2.c
    public void pause() {
        synchronized (this.f29136b) {
            if (!this.f29140f.a()) {
                this.f29140f = d.a.PAUSED;
                this.f29138d.pause();
            }
            if (!this.f29139e.a()) {
                this.f29139e = d.a.PAUSED;
                this.f29137c.pause();
            }
        }
    }
}
