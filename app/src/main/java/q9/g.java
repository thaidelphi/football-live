package q9;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import n9.c0;
import n9.j;
import n9.p;
import n9.t;
import n9.v;
import q9.f;
import t9.n;
/* compiled from: StreamAllocation.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final n9.a f30178a;

    /* renamed from: b  reason: collision with root package name */
    private f.a f30179b;

    /* renamed from: c  reason: collision with root package name */
    private c0 f30180c;

    /* renamed from: d  reason: collision with root package name */
    private final j f30181d;

    /* renamed from: e  reason: collision with root package name */
    public final n9.e f30182e;

    /* renamed from: f  reason: collision with root package name */
    public final p f30183f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f30184g;

    /* renamed from: h  reason: collision with root package name */
    private final f f30185h;

    /* renamed from: i  reason: collision with root package name */
    private int f30186i;

    /* renamed from: j  reason: collision with root package name */
    private c f30187j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f30188k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f30189l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f30190m;

    /* renamed from: n  reason: collision with root package name */
    private r9.c f30191n;

    /* compiled from: StreamAllocation.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends WeakReference<g> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f30192a;

        a(g gVar, Object obj) {
            super(gVar);
            this.f30192a = obj;
        }
    }

    public g(j jVar, n9.a aVar, n9.e eVar, p pVar, Object obj) {
        this.f30181d = jVar;
        this.f30178a = aVar;
        this.f30182e = eVar;
        this.f30183f = pVar;
        this.f30185h = new f(aVar, p(), eVar, pVar);
        this.f30184g = obj;
    }

    private Socket e(boolean z10, boolean z11, boolean z12) {
        Socket socket;
        if (z12) {
            this.f30191n = null;
        }
        if (z11) {
            this.f30189l = true;
        }
        c cVar = this.f30187j;
        if (cVar != null) {
            if (z10) {
                cVar.f30160k = true;
            }
            if (this.f30191n == null) {
                if (this.f30189l || cVar.f30160k) {
                    l(cVar);
                    if (this.f30187j.f30163n.isEmpty()) {
                        this.f30187j.f30164o = System.nanoTime();
                        if (o9.a.f29470a.e(this.f30181d, this.f30187j)) {
                            socket = this.f30187j.q();
                            this.f30187j = null;
                            return socket;
                        }
                    }
                    socket = null;
                    this.f30187j = null;
                    return socket;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private c f(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        c cVar;
        Socket n10;
        c cVar2;
        Socket socket;
        c0 c0Var;
        boolean z11;
        boolean z12;
        f.a aVar;
        synchronized (this.f30181d) {
            if (!this.f30189l) {
                if (this.f30191n == null) {
                    if (!this.f30190m) {
                        cVar = this.f30187j;
                        n10 = n();
                        cVar2 = this.f30187j;
                        socket = null;
                        if (cVar2 != null) {
                            cVar = null;
                        } else {
                            cVar2 = null;
                        }
                        if (!this.f30188k) {
                            cVar = null;
                        }
                        if (cVar2 == null) {
                            o9.a.f29470a.h(this.f30181d, this.f30178a, this, null);
                            c cVar3 = this.f30187j;
                            if (cVar3 != null) {
                                z11 = true;
                                cVar2 = cVar3;
                                c0Var = null;
                            } else {
                                c0Var = this.f30180c;
                            }
                        } else {
                            c0Var = null;
                        }
                        z11 = false;
                    } else {
                        throw new IOException("Canceled");
                    }
                } else {
                    throw new IllegalStateException("codec != null");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        o9.c.h(n10);
        if (cVar != null) {
            this.f30183f.h(this.f30182e, cVar);
        }
        if (z11) {
            this.f30183f.g(this.f30182e, cVar2);
        }
        if (cVar2 != null) {
            this.f30180c = this.f30187j.p();
            return cVar2;
        }
        if (c0Var != null || ((aVar = this.f30179b) != null && aVar.b())) {
            z12 = false;
        } else {
            this.f30179b = this.f30185h.e();
            z12 = true;
        }
        synchronized (this.f30181d) {
            if (this.f30190m) {
                throw new IOException("Canceled");
            }
            if (z12) {
                List<c0> a10 = this.f30179b.a();
                int size = a10.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    c0 c0Var2 = a10.get(i14);
                    o9.a.f29470a.h(this.f30181d, this.f30178a, this, c0Var2);
                    c cVar4 = this.f30187j;
                    if (cVar4 != null) {
                        this.f30180c = c0Var2;
                        z11 = true;
                        cVar2 = cVar4;
                        break;
                    }
                    i14++;
                }
            }
            if (!z11) {
                if (c0Var == null) {
                    c0Var = this.f30179b.c();
                }
                this.f30180c = c0Var;
                this.f30186i = 0;
                cVar2 = new c(this.f30181d, c0Var);
                a(cVar2, false);
            }
        }
        if (z11) {
            this.f30183f.g(this.f30182e, cVar2);
            return cVar2;
        }
        cVar2.d(i10, i11, i12, i13, z10, this.f30182e, this.f30183f);
        p().a(cVar2.p());
        synchronized (this.f30181d) {
            this.f30188k = true;
            o9.a.f29470a.i(this.f30181d, cVar2);
            if (cVar2.n()) {
                socket = o9.a.f29470a.f(this.f30181d, this.f30178a, this);
                cVar2 = this.f30187j;
            }
        }
        o9.c.h(socket);
        this.f30183f.g(this.f30182e, cVar2);
        return cVar2;
    }

    private c g(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            c f10 = f(i10, i11, i12, i13, z10);
            synchronized (this.f30181d) {
                if (f10.f30161l == 0 && !f10.n()) {
                    return f10;
                }
                if (f10.m(z11)) {
                    return f10;
                }
                j();
            }
        }
    }

    private void l(c cVar) {
        int size = cVar.f30163n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cVar.f30163n.get(i10).get() == this) {
                cVar.f30163n.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket n() {
        c cVar = this.f30187j;
        if (cVar == null || !cVar.f30160k) {
            return null;
        }
        return e(false, false, true);
    }

    private d p() {
        return o9.a.f29470a.j(this.f30181d);
    }

    public void a(c cVar, boolean z10) {
        if (this.f30187j == null) {
            this.f30187j = cVar;
            this.f30188k = z10;
            cVar.f30163n.add(new a(this, this.f30184g));
            return;
        }
        throw new IllegalStateException();
    }

    public void b() {
        r9.c cVar;
        c cVar2;
        synchronized (this.f30181d) {
            this.f30190m = true;
            cVar = this.f30191n;
            cVar2 = this.f30187j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.c();
        }
    }

    public r9.c c() {
        r9.c cVar;
        synchronized (this.f30181d) {
            cVar = this.f30191n;
        }
        return cVar;
    }

    public synchronized c d() {
        return this.f30187j;
    }

    public boolean h() {
        f.a aVar;
        return this.f30180c != null || ((aVar = this.f30179b) != null && aVar.b()) || this.f30185h.c();
    }

    public r9.c i(v vVar, t.a aVar, boolean z10) {
        try {
            r9.c o10 = g(aVar.d(), aVar.a(), aVar.c(), vVar.w(), vVar.C(), z10).o(vVar, aVar, this);
            synchronized (this.f30181d) {
                this.f30191n = o10;
            }
            return o10;
        } catch (IOException e8) {
            throw new e(e8);
        }
    }

    public void j() {
        c cVar;
        Socket e8;
        synchronized (this.f30181d) {
            cVar = this.f30187j;
            e8 = e(true, false, false);
            if (this.f30187j != null) {
                cVar = null;
            }
        }
        o9.c.h(e8);
        if (cVar != null) {
            this.f30183f.h(this.f30182e, cVar);
        }
    }

    public void k() {
        c cVar;
        Socket e8;
        synchronized (this.f30181d) {
            cVar = this.f30187j;
            e8 = e(false, true, false);
            if (this.f30187j != null) {
                cVar = null;
            }
        }
        o9.c.h(e8);
        if (cVar != null) {
            o9.a.f29470a.k(this.f30182e, null);
            this.f30183f.h(this.f30182e, cVar);
            this.f30183f.a(this.f30182e);
        }
    }

    public Socket m(c cVar) {
        if (this.f30191n == null && this.f30187j.f30163n.size() == 1) {
            Socket e8 = e(true, false, false);
            this.f30187j = cVar;
            cVar.f30163n.add(this.f30187j.f30163n.get(0));
            return e8;
        }
        throw new IllegalStateException();
    }

    public c0 o() {
        return this.f30180c;
    }

    public void q(IOException iOException) {
        c cVar;
        boolean z10;
        Socket e8;
        synchronized (this.f30181d) {
            cVar = null;
            if (iOException instanceof n) {
                t9.b bVar = ((n) iOException).f31250a;
                if (bVar == t9.b.REFUSED_STREAM) {
                    int i10 = this.f30186i + 1;
                    this.f30186i = i10;
                    if (i10 > 1) {
                        this.f30180c = null;
                        z10 = true;
                    }
                    z10 = false;
                } else {
                    if (bVar != t9.b.CANCEL) {
                        this.f30180c = null;
                        z10 = true;
                    }
                    z10 = false;
                }
            } else {
                c cVar2 = this.f30187j;
                if (cVar2 != null && (!cVar2.n() || (iOException instanceof t9.a))) {
                    if (this.f30187j.f30161l == 0) {
                        c0 c0Var = this.f30180c;
                        if (c0Var != null && iOException != null) {
                            this.f30185h.a(c0Var, iOException);
                        }
                        this.f30180c = null;
                    }
                    z10 = true;
                }
                z10 = false;
            }
            c cVar3 = this.f30187j;
            e8 = e(z10, false, true);
            if (this.f30187j == null && this.f30188k) {
                cVar = cVar3;
            }
        }
        o9.c.h(e8);
        if (cVar != null) {
            this.f30183f.h(this.f30182e, cVar);
        }
    }

    public void r(boolean z10, r9.c cVar, long j10, IOException iOException) {
        c cVar2;
        Socket e8;
        boolean z11;
        this.f30183f.p(this.f30182e, j10);
        synchronized (this.f30181d) {
            if (cVar != null) {
                if (cVar == this.f30191n) {
                    if (!z10) {
                        this.f30187j.f30161l++;
                    }
                    cVar2 = this.f30187j;
                    e8 = e(z10, false, true);
                    if (this.f30187j != null) {
                        cVar2 = null;
                    }
                    z11 = this.f30189l;
                }
            }
            throw new IllegalStateException("expected " + this.f30191n + " but was " + cVar);
        }
        o9.c.h(e8);
        if (cVar2 != null) {
            this.f30183f.h(this.f30182e, cVar2);
        }
        if (iOException != null) {
            this.f30183f.b(this.f30182e, o9.a.f29470a.k(this.f30182e, iOException));
        } else if (z11) {
            o9.a.f29470a.k(this.f30182e, null);
            this.f30183f.a(this.f30182e);
        }
    }

    public String toString() {
        c d10 = d();
        return d10 != null ? d10.toString() : this.f30178a.toString();
    }
}
