package e4;

import a5.p0;
import android.os.Handler;
import com.google.android.exoplayer2.drm.k;
import e4.a0;
import e4.t;
import java.io.IOException;
import java.util.HashMap;
import n3.l3;
import z4.s0;
/* compiled from: CompositeMediaSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e<T> extends e4.a {

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<T, b<T>> f25035h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private Handler f25036i;

    /* renamed from: j  reason: collision with root package name */
    private s0 f25037j;

    /* compiled from: CompositeMediaSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class a implements a0, com.google.android.exoplayer2.drm.k {

        /* renamed from: a  reason: collision with root package name */
        private final T f25038a;

        /* renamed from: b  reason: collision with root package name */
        private a0.a f25039b;

        /* renamed from: c  reason: collision with root package name */
        private k.a f25040c;

        public a(T t10) {
            this.f25039b = e.this.v(null);
            this.f25040c = e.this.t(null);
            this.f25038a = t10;
        }

        private boolean a(int i10, t.b bVar) {
            t.b bVar2;
            if (bVar != null) {
                bVar2 = e.this.F(this.f25038a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int H = e.this.H(this.f25038a, i10);
            a0.a aVar = this.f25039b;
            if (aVar.f24975a != H || !p0.c(aVar.f24976b, bVar2)) {
                this.f25039b = e.this.u(H, bVar2, 0L);
            }
            k.a aVar2 = this.f25040c;
            if (aVar2.f10526a == H && p0.c(aVar2.f10527b, bVar2)) {
                return true;
            }
            this.f25040c = e.this.r(H, bVar2);
            return true;
        }

        private p g(p pVar) {
            long G = e.this.G(this.f25038a, pVar.f25137f);
            long G2 = e.this.G(this.f25038a, pVar.f25138g);
            return (G == pVar.f25137f && G2 == pVar.f25138g) ? pVar : new p(pVar.f25132a, pVar.f25133b, pVar.f25134c, pVar.f25135d, pVar.f25136e, G, G2);
        }

        @Override // e4.a0
        public void C(int i10, t.b bVar, l lVar, p pVar) {
            if (a(i10, bVar)) {
                this.f25039b.s(lVar, g(pVar));
            }
        }

        @Override // e4.a0
        public void E(int i10, t.b bVar, l lVar, p pVar) {
            if (a(i10, bVar)) {
                this.f25039b.v(lVar, g(pVar));
            }
        }

        @Override // e4.a0
        public void G(int i10, t.b bVar, p pVar) {
            if (a(i10, bVar)) {
                this.f25039b.E(g(pVar));
            }
        }

        @Override // e4.a0
        public void I(int i10, t.b bVar, l lVar, p pVar) {
            if (a(i10, bVar)) {
                this.f25039b.B(lVar, g(pVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void M(int i10, t.b bVar) {
            if (a(i10, bVar)) {
                this.f25040c.i();
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public /* synthetic */ void S(int i10, t.b bVar) {
            r3.e.a(this, i10, bVar);
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void X(int i10, t.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f25040c.k(i11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void Z(int i10, t.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f25040c.l(exc);
            }
        }

        @Override // e4.a0
        public void c0(int i10, t.b bVar, l lVar, p pVar, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f25039b.y(lVar, g(pVar), iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void e0(int i10, t.b bVar) {
            if (a(i10, bVar)) {
                this.f25040c.h();
            }
        }

        @Override // e4.a0
        public void f0(int i10, t.b bVar, p pVar) {
            if (a(i10, bVar)) {
                this.f25039b.j(g(pVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void j0(int i10, t.b bVar) {
            if (a(i10, bVar)) {
                this.f25040c.m();
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void l0(int i10, t.b bVar) {
            if (a(i10, bVar)) {
                this.f25040c.j();
            }
        }
    }

    /* compiled from: CompositeMediaSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final t f25042a;

        /* renamed from: b  reason: collision with root package name */
        public final t.c f25043b;

        /* renamed from: c  reason: collision with root package name */
        public final e<T>.a f25044c;

        public b(t tVar, t.c cVar, e<T>.a aVar) {
            this.f25042a = tVar;
            this.f25043b = cVar;
            this.f25044c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.a
    public void B(s0 s0Var) {
        this.f25037j = s0Var;
        this.f25036i = p0.v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.a
    public void D() {
        for (b<T> bVar : this.f25035h.values()) {
            bVar.f25042a.c(bVar.f25043b);
            bVar.f25042a.q(bVar.f25044c);
            bVar.f25042a.j(bVar.f25044c);
        }
        this.f25035h.clear();
    }

    protected abstract t.b F(T t10, t.b bVar);

    protected abstract long G(T t10, long j10);

    protected abstract int H(T t10, int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public abstract void I(T t10, t tVar, l3 l3Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K(final T t10, t tVar) {
        a5.a.a(!this.f25035h.containsKey(t10));
        t.c cVar = new t.c() { // from class: e4.d
            @Override // e4.t.c
            public final void a(t tVar2, l3 l3Var) {
                e.this.I(t10, tVar2, l3Var);
            }
        };
        a aVar = new a(t10);
        this.f25035h.put(t10, new b<>(tVar, cVar, aVar));
        tVar.e((Handler) a5.a.e(this.f25036i), aVar);
        tVar.h((Handler) a5.a.e(this.f25036i), aVar);
        tVar.p(cVar, this.f25037j, z());
        if (A()) {
            return;
        }
        tVar.n(cVar);
    }

    @Override // e4.t
    public void k() throws IOException {
        for (b<T> bVar : this.f25035h.values()) {
            bVar.f25042a.k();
        }
    }

    @Override // e4.a
    protected void x() {
        for (b<T> bVar : this.f25035h.values()) {
            bVar.f25042a.n(bVar.f25043b);
        }
    }

    @Override // e4.a
    protected void y() {
        for (b<T> bVar : this.f25035h.values()) {
            bVar.f25042a.b(bVar.f25043b);
        }
    }
}
