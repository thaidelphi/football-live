package n3;

import android.os.Handler;
import com.google.android.exoplayer2.drm.k;
import e4.a0;
import e4.g0;
import e4.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaSourceList.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g2 {

    /* renamed from: a  reason: collision with root package name */
    private final o3.q1 f27964a;

    /* renamed from: e  reason: collision with root package name */
    private final d f27968e;

    /* renamed from: f  reason: collision with root package name */
    private final a0.a f27969f;

    /* renamed from: g  reason: collision with root package name */
    private final k.a f27970g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<c, b> f27971h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<c> f27972i;

    /* renamed from: k  reason: collision with root package name */
    private boolean f27974k;

    /* renamed from: l  reason: collision with root package name */
    private z4.s0 f27975l;

    /* renamed from: j  reason: collision with root package name */
    private e4.g0 f27973j = new g0.a(0);

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap<e4.q, c> f27966c = new IdentityHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Object, c> f27967d = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f27965b = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaSourceList.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class a implements e4.a0, com.google.android.exoplayer2.drm.k {

        /* renamed from: a  reason: collision with root package name */
        private final c f27976a;

        /* renamed from: b  reason: collision with root package name */
        private a0.a f27977b;

        /* renamed from: c  reason: collision with root package name */
        private k.a f27978c;

        public a(c cVar) {
            this.f27977b = g2.this.f27969f;
            this.f27978c = g2.this.f27970g;
            this.f27976a = cVar;
        }

        private boolean a(int i10, t.b bVar) {
            t.b bVar2;
            if (bVar != null) {
                bVar2 = g2.n(this.f27976a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int r10 = g2.r(this.f27976a, i10);
            a0.a aVar = this.f27977b;
            if (aVar.f24975a != r10 || !a5.p0.c(aVar.f24976b, bVar2)) {
                this.f27977b = g2.this.f27969f.F(r10, bVar2, 0L);
            }
            k.a aVar2 = this.f27978c;
            if (aVar2.f10526a == r10 && a5.p0.c(aVar2.f10527b, bVar2)) {
                return true;
            }
            this.f27978c = g2.this.f27970g.u(r10, bVar2);
            return true;
        }

        @Override // e4.a0
        public void C(int i10, t.b bVar, e4.l lVar, e4.p pVar) {
            if (a(i10, bVar)) {
                this.f27977b.s(lVar, pVar);
            }
        }

        @Override // e4.a0
        public void E(int i10, t.b bVar, e4.l lVar, e4.p pVar) {
            if (a(i10, bVar)) {
                this.f27977b.v(lVar, pVar);
            }
        }

        @Override // e4.a0
        public void G(int i10, t.b bVar, e4.p pVar) {
            if (a(i10, bVar)) {
                this.f27977b.E(pVar);
            }
        }

        @Override // e4.a0
        public void I(int i10, t.b bVar, e4.l lVar, e4.p pVar) {
            if (a(i10, bVar)) {
                this.f27977b.B(lVar, pVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void M(int i10, t.b bVar) {
            if (a(i10, bVar)) {
                this.f27978c.i();
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public /* synthetic */ void S(int i10, t.b bVar) {
            r3.e.a(this, i10, bVar);
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void X(int i10, t.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f27978c.k(i11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void Z(int i10, t.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f27978c.l(exc);
            }
        }

        @Override // e4.a0
        public void c0(int i10, t.b bVar, e4.l lVar, e4.p pVar, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f27977b.y(lVar, pVar, iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void e0(int i10, t.b bVar) {
            if (a(i10, bVar)) {
                this.f27978c.h();
            }
        }

        @Override // e4.a0
        public void f0(int i10, t.b bVar, e4.p pVar) {
            if (a(i10, bVar)) {
                this.f27977b.j(pVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void j0(int i10, t.b bVar) {
            if (a(i10, bVar)) {
                this.f27978c.m();
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void l0(int i10, t.b bVar) {
            if (a(i10, bVar)) {
                this.f27978c.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaSourceList.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final e4.t f27980a;

        /* renamed from: b  reason: collision with root package name */
        public final t.c f27981b;

        /* renamed from: c  reason: collision with root package name */
        public final a f27982c;

        public b(e4.t tVar, t.c cVar, a aVar) {
            this.f27980a = tVar;
            this.f27981b = cVar;
            this.f27982c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediaSourceList.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c implements e2 {

        /* renamed from: a  reason: collision with root package name */
        public final e4.o f27983a;

        /* renamed from: d  reason: collision with root package name */
        public int f27986d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f27987e;

        /* renamed from: c  reason: collision with root package name */
        public final List<t.b> f27985c = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f27984b = new Object();

        public c(e4.t tVar, boolean z10) {
            this.f27983a = new e4.o(tVar, z10);
        }

        @Override // n3.e2
        public Object a() {
            return this.f27984b;
        }

        @Override // n3.e2
        public l3 b() {
            return this.f27983a.Y();
        }

        public void c(int i10) {
            this.f27986d = i10;
            this.f27987e = false;
            this.f27985c.clear();
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void c();
    }

    public g2(d dVar, o3.a aVar, Handler handler, o3.q1 q1Var) {
        this.f27964a = q1Var;
        this.f27968e = dVar;
        a0.a aVar2 = new a0.a();
        this.f27969f = aVar2;
        k.a aVar3 = new k.a();
        this.f27970g = aVar3;
        this.f27971h = new HashMap<>();
        this.f27972i = new HashSet();
        aVar2.g(handler, aVar);
        aVar3.g(handler, aVar);
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f27965b.remove(i12);
            this.f27967d.remove(remove.f27984b);
            g(i12, -remove.f27983a.Y().t());
            remove.f27987e = true;
            if (this.f27974k) {
                u(remove);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f27965b.size()) {
            this.f27965b.get(i10).f27986d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f27971h.get(cVar);
        if (bVar != null) {
            bVar.f27980a.n(bVar.f27981b);
        }
    }

    private void k() {
        Iterator<c> it = this.f27972i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f27985c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f27972i.add(cVar);
        b bVar = this.f27971h.get(cVar);
        if (bVar != null) {
            bVar.f27980a.b(bVar.f27981b);
        }
    }

    private static Object m(Object obj) {
        return n3.a.A(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t.b n(c cVar, t.b bVar) {
        for (int i10 = 0; i10 < cVar.f27985c.size(); i10++) {
            if (cVar.f27985c.get(i10).f25142d == bVar.f25142d) {
                return bVar.c(p(cVar, bVar.f25139a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return n3.a.B(obj);
    }

    private static Object p(c cVar, Object obj) {
        return n3.a.D(cVar.f27984b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(c cVar, int i10) {
        return i10 + cVar.f27986d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(e4.t tVar, l3 l3Var) {
        this.f27968e.c();
    }

    private void u(c cVar) {
        if (cVar.f27987e && cVar.f27985c.isEmpty()) {
            b bVar = (b) a5.a.e(this.f27971h.remove(cVar));
            bVar.f27980a.c(bVar.f27981b);
            bVar.f27980a.q(bVar.f27982c);
            bVar.f27980a.j(bVar.f27982c);
            this.f27972i.remove(cVar);
        }
    }

    private void x(c cVar) {
        e4.o oVar = cVar.f27983a;
        t.c cVar2 = new t.c() { // from class: n3.f2
            @Override // e4.t.c
            public final void a(e4.t tVar, l3 l3Var) {
                g2.this.t(tVar, l3Var);
            }
        };
        a aVar = new a(cVar);
        this.f27971h.put(cVar, new b(oVar, cVar2, aVar));
        oVar.e(a5.p0.x(), aVar);
        oVar.h(a5.p0.x(), aVar);
        oVar.p(cVar2, this.f27975l, this.f27964a);
    }

    public l3 A(int i10, int i11, e4.g0 g0Var) {
        a5.a.a(i10 >= 0 && i10 <= i11 && i11 <= q());
        this.f27973j = g0Var;
        B(i10, i11);
        return i();
    }

    public l3 C(List<c> list, e4.g0 g0Var) {
        B(0, this.f27965b.size());
        return f(this.f27965b.size(), list, g0Var);
    }

    public l3 D(e4.g0 g0Var) {
        int q10 = q();
        if (g0Var.a() != q10) {
            g0Var = g0Var.f().h(0, q10);
        }
        this.f27973j = g0Var;
        return i();
    }

    public l3 f(int i10, List<c> list, e4.g0 g0Var) {
        if (!list.isEmpty()) {
            this.f27973j = g0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f27965b.get(i11 - 1);
                    cVar.c(cVar2.f27986d + cVar2.f27983a.Y().t());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f27983a.Y().t());
                this.f27965b.add(i11, cVar);
                this.f27967d.put(cVar.f27984b, cVar);
                if (this.f27974k) {
                    x(cVar);
                    if (this.f27966c.isEmpty()) {
                        this.f27972i.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public e4.q h(t.b bVar, z4.b bVar2, long j10) {
        Object o10 = o(bVar.f25139a);
        t.b c10 = bVar.c(m(bVar.f25139a));
        c cVar = (c) a5.a.e(this.f27967d.get(o10));
        l(cVar);
        cVar.f27985c.add(c10);
        e4.n d10 = cVar.f27983a.d(c10, bVar2, j10);
        this.f27966c.put(d10, cVar);
        k();
        return d10;
    }

    public l3 i() {
        if (this.f27965b.isEmpty()) {
            return l3.f28128a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f27965b.size(); i11++) {
            c cVar = this.f27965b.get(i11);
            cVar.f27986d = i10;
            i10 += cVar.f27983a.Y().t();
        }
        return new u2(this.f27965b, this.f27973j);
    }

    public int q() {
        return this.f27965b.size();
    }

    public boolean s() {
        return this.f27974k;
    }

    public l3 v(int i10, int i11, int i12, e4.g0 g0Var) {
        a5.a.a(i10 >= 0 && i10 <= i11 && i11 <= q() && i12 >= 0);
        this.f27973j = g0Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = this.f27965b.get(min).f27986d;
            a5.p0.B0(this.f27965b, i10, i11, i12);
            while (min <= max) {
                c cVar = this.f27965b.get(min);
                cVar.f27986d = i13;
                i13 += cVar.f27983a.Y().t();
                min++;
            }
            return i();
        }
        return i();
    }

    public void w(z4.s0 s0Var) {
        a5.a.f(!this.f27974k);
        this.f27975l = s0Var;
        for (int i10 = 0; i10 < this.f27965b.size(); i10++) {
            c cVar = this.f27965b.get(i10);
            x(cVar);
            this.f27972i.add(cVar);
        }
        this.f27974k = true;
    }

    public void y() {
        for (b bVar : this.f27971h.values()) {
            try {
                bVar.f27980a.c(bVar.f27981b);
            } catch (RuntimeException e8) {
                a5.t.d("MediaSourceList", "Failed to release child source.", e8);
            }
            bVar.f27980a.q(bVar.f27982c);
            bVar.f27980a.j(bVar.f27982c);
        }
        this.f27971h.clear();
        this.f27972i.clear();
        this.f27974k = false;
    }

    public void z(e4.q qVar) {
        c cVar = (c) a5.a.e(this.f27966c.remove(qVar));
        cVar.f27983a.g(qVar);
        cVar.f27985c.remove(((e4.n) qVar).f25109a);
        if (!this.f27966c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
