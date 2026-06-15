package n3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e4.q;
import e4.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.g2;
import n3.l;
import n3.l3;
import n3.t2;
import n3.u1;
import n3.y2;
import x4.b0;
import y5.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExoPlayerImplInternal.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i1 implements Handler.Callback, q.a, b0.a, g2.d, l.a, t2.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private h K;
    private long L;
    private int M;
    private boolean N;
    private q O;
    private long P;
    private long Q = -9223372036854775807L;

    /* renamed from: a  reason: collision with root package name */
    private final y2[] f28011a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<y2> f28012b;

    /* renamed from: c  reason: collision with root package name */
    private final a3[] f28013c;

    /* renamed from: d  reason: collision with root package name */
    private final x4.b0 f28014d;

    /* renamed from: e  reason: collision with root package name */
    private final x4.c0 f28015e;

    /* renamed from: f  reason: collision with root package name */
    private final s1 f28016f;

    /* renamed from: g  reason: collision with root package name */
    private final z4.f f28017g;

    /* renamed from: h  reason: collision with root package name */
    private final a5.p f28018h;

    /* renamed from: i  reason: collision with root package name */
    private final HandlerThread f28019i;

    /* renamed from: j  reason: collision with root package name */
    private final Looper f28020j;

    /* renamed from: k  reason: collision with root package name */
    private final l3.d f28021k;

    /* renamed from: l  reason: collision with root package name */
    private final l3.b f28022l;

    /* renamed from: m  reason: collision with root package name */
    private final long f28023m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f28024n;

    /* renamed from: o  reason: collision with root package name */
    private final l f28025o;

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList<d> f28026p;

    /* renamed from: q  reason: collision with root package name */
    private final a5.d f28027q;

    /* renamed from: r  reason: collision with root package name */
    private final f f28028r;

    /* renamed from: s  reason: collision with root package name */
    private final d2 f28029s;

    /* renamed from: t  reason: collision with root package name */
    private final g2 f28030t;

    /* renamed from: u  reason: collision with root package name */
    private final r1 f28031u;

    /* renamed from: v  reason: collision with root package name */
    private final long f28032v;

    /* renamed from: w  reason: collision with root package name */
    private d3 f28033w;

    /* renamed from: x  reason: collision with root package name */
    private m2 f28034x;

    /* renamed from: y  reason: collision with root package name */
    private e f28035y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f28036z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements y2.a {
        a() {
        }

        @Override // n3.y2.a
        public void a() {
            i1.this.H = true;
        }

        @Override // n3.y2.a
        public void b() {
            i1.this.f28018h.h(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<g2.c> f28038a;

        /* renamed from: b  reason: collision with root package name */
        private final e4.g0 f28039b;

        /* renamed from: c  reason: collision with root package name */
        private final int f28040c;

        /* renamed from: d  reason: collision with root package name */
        private final long f28041d;

        /* synthetic */ b(List list, e4.g0 g0Var, int i10, long j10, a aVar) {
            this(list, g0Var, i10, j10);
        }

        private b(List<g2.c> list, e4.g0 g0Var, int i10, long j10) {
            this.f28038a = list;
            this.f28039b = g0Var;
            this.f28040c = i10;
            this.f28041d = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f28042a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28043b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28044c;

        /* renamed from: d  reason: collision with root package name */
        public final e4.g0 f28045d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final t2 f28046a;

        /* renamed from: b  reason: collision with root package name */
        public int f28047b;

        /* renamed from: c  reason: collision with root package name */
        public long f28048c;

        /* renamed from: d  reason: collision with root package name */
        public Object f28049d;

        public d(t2 t2Var) {
            this.f28046a = t2Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            Object obj = this.f28049d;
            if ((obj == null) != (dVar.f28049d == null)) {
                return obj != null ? -1 : 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i10 = this.f28047b - dVar.f28047b;
                return i10 != 0 ? i10 : a5.p0.o(this.f28048c, dVar.f28048c);
            }
        }

        public void b(int i10, long j10, Object obj) {
            this.f28047b = i10;
            this.f28048c = j10;
            this.f28049d = obj;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private boolean f28050a;

        /* renamed from: b  reason: collision with root package name */
        public m2 f28051b;

        /* renamed from: c  reason: collision with root package name */
        public int f28052c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28053d;

        /* renamed from: e  reason: collision with root package name */
        public int f28054e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f28055f;

        /* renamed from: g  reason: collision with root package name */
        public int f28056g;

        public e(m2 m2Var) {
            this.f28051b = m2Var;
        }

        public void b(int i10) {
            this.f28050a |= i10 > 0;
            this.f28052c += i10;
        }

        public void c(int i10) {
            this.f28050a = true;
            this.f28055f = true;
            this.f28056g = i10;
        }

        public void d(m2 m2Var) {
            this.f28050a |= this.f28051b != m2Var;
            this.f28051b = m2Var;
        }

        public void e(int i10) {
            if (this.f28053d && this.f28054e != 5) {
                a5.a.a(i10 == 5);
                return;
            }
            this.f28050a = true;
            this.f28053d = true;
            this.f28054e = i10;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final t.b f28057a;

        /* renamed from: b  reason: collision with root package name */
        public final long f28058b;

        /* renamed from: c  reason: collision with root package name */
        public final long f28059c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f28060d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f28061e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f28062f;

        public g(t.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f28057a = bVar;
            this.f28058b = j10;
            this.f28059c = j11;
            this.f28060d = z10;
            this.f28061e = z11;
            this.f28062f = z12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final l3 f28063a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28064b;

        /* renamed from: c  reason: collision with root package name */
        public final long f28065c;

        public h(l3 l3Var, int i10, long j10) {
            this.f28063a = l3Var;
            this.f28064b = i10;
            this.f28065c = j10;
        }
    }

    public i1(y2[] y2VarArr, x4.b0 b0Var, x4.c0 c0Var, s1 s1Var, z4.f fVar, int i10, boolean z10, o3.a aVar, d3 d3Var, r1 r1Var, long j10, boolean z11, Looper looper, a5.d dVar, f fVar2, o3.q1 q1Var) {
        this.f28028r = fVar2;
        this.f28011a = y2VarArr;
        this.f28014d = b0Var;
        this.f28015e = c0Var;
        this.f28016f = s1Var;
        this.f28017g = fVar;
        this.E = i10;
        this.F = z10;
        this.f28033w = d3Var;
        this.f28031u = r1Var;
        this.f28032v = j10;
        this.P = j10;
        this.A = z11;
        this.f28027q = dVar;
        this.f28023m = s1Var.b();
        this.f28024n = s1Var.a();
        m2 j11 = m2.j(c0Var);
        this.f28034x = j11;
        this.f28035y = new e(j11);
        this.f28013c = new a3[y2VarArr.length];
        for (int i11 = 0; i11 < y2VarArr.length; i11++) {
            y2VarArr[i11].h(i11, q1Var);
            this.f28013c[i11] = y2VarArr[i11].n();
        }
        this.f28025o = new l(this, dVar);
        this.f28026p = new ArrayList<>();
        this.f28012b = y5.p0.h();
        this.f28021k = new l3.d();
        this.f28022l = new l3.b();
        b0Var.b(this, fVar);
        this.N = true;
        Handler handler = new Handler(looper);
        this.f28029s = new d2(aVar, handler);
        this.f28030t = new g2(this, aVar, handler, q1Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f28019i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f28020j = looper2;
        this.f28018h = dVar.d(looper2, this);
    }

    private long A0(t.b bVar, long j10, boolean z10) throws q {
        return B0(bVar, j10, this.f28029s.p() != this.f28029s.q(), z10);
    }

    private long B() {
        return C(this.f28034x.f28242p);
    }

    private long B0(t.b bVar, long j10, boolean z10, boolean z11) throws q {
        e1();
        this.C = false;
        if (z11 || this.f28034x.f28231e == 3) {
            V0(2);
        }
        a2 p10 = this.f28029s.p();
        a2 a2Var = p10;
        while (a2Var != null && !bVar.equals(a2Var.f27869f.f27887a)) {
            a2Var = a2Var.j();
        }
        if (z10 || p10 != a2Var || (a2Var != null && a2Var.z(j10) < 0)) {
            for (y2 y2Var : this.f28011a) {
                m(y2Var);
            }
            if (a2Var != null) {
                while (this.f28029s.p() != a2Var) {
                    this.f28029s.b();
                }
                this.f28029s.z(a2Var);
                a2Var.x(1000000000000L);
                p();
            }
        }
        if (a2Var != null) {
            this.f28029s.z(a2Var);
            if (!a2Var.f27867d) {
                a2Var.f27869f = a2Var.f27869f.b(j10);
            } else if (a2Var.f27868e) {
                long k10 = a2Var.f27864a.k(j10);
                a2Var.f27864a.u(k10 - this.f28023m, this.f28024n);
                j10 = k10;
            }
            p0(j10);
            T();
        } else {
            this.f28029s.f();
            p0(j10);
        }
        F(false);
        this.f28018h.h(2);
        return j10;
    }

    private long C(long j10) {
        a2 j11 = this.f28029s.j();
        if (j11 == null) {
            return 0L;
        }
        return Math.max(0L, j10 - j11.y(this.L));
    }

    private void C0(t2 t2Var) throws q {
        if (t2Var.f() == -9223372036854775807L) {
            D0(t2Var);
        } else if (this.f28034x.f28227a.u()) {
            this.f28026p.add(new d(t2Var));
        } else {
            d dVar = new d(t2Var);
            l3 l3Var = this.f28034x.f28227a;
            if (r0(dVar, l3Var, l3Var, this.E, this.F, this.f28021k, this.f28022l)) {
                this.f28026p.add(dVar);
                Collections.sort(this.f28026p);
                return;
            }
            t2Var.k(false);
        }
    }

    private void D(e4.q qVar) {
        if (this.f28029s.v(qVar)) {
            this.f28029s.y(this.L);
            T();
        }
    }

    private void D0(t2 t2Var) throws q {
        if (t2Var.c() == this.f28020j) {
            l(t2Var);
            int i10 = this.f28034x.f28231e;
            if (i10 == 3 || i10 == 2) {
                this.f28018h.h(2);
                return;
            }
            return;
        }
        this.f28018h.d(15, t2Var).a();
    }

    private void E(IOException iOException, int i10) {
        q h10 = q.h(iOException, i10);
        a2 p10 = this.f28029s.p();
        if (p10 != null) {
            h10 = h10.f(p10.f27869f.f27887a);
        }
        a5.t.d("ExoPlayerImplInternal", "Playback error", h10);
        d1(false, false);
        this.f28034x = this.f28034x.e(h10);
    }

    private void E0(final t2 t2Var) {
        Looper c10 = t2Var.c();
        if (!c10.getThread().isAlive()) {
            a5.t.i("TAG", "Trying to send message on a dead thread.");
            t2Var.k(false);
            return;
        }
        this.f28027q.d(c10, null).f(new Runnable() { // from class: n3.h1
            @Override // java.lang.Runnable
            public final void run() {
                i1.this.S(t2Var);
            }
        });
    }

    private void F(boolean z10) {
        long i10;
        a2 j10 = this.f28029s.j();
        t.b bVar = j10 == null ? this.f28034x.f28228b : j10.f27869f.f27887a;
        boolean z11 = !this.f28034x.f28237k.equals(bVar);
        if (z11) {
            this.f28034x = this.f28034x.b(bVar);
        }
        m2 m2Var = this.f28034x;
        if (j10 == null) {
            i10 = m2Var.f28244r;
        } else {
            i10 = j10.i();
        }
        m2Var.f28242p = i10;
        this.f28034x.f28243q = B();
        if ((z11 || z10) && j10 != null && j10.f27867d) {
            g1(j10.n(), j10.o());
        }
    }

    private void F0(long j10) {
        y2[] y2VarArr;
        for (y2 y2Var : this.f28011a) {
            if (y2Var.t() != null) {
                G0(y2Var, j10);
            }
        }
    }

    private void G(l3 l3Var, boolean z10) throws q {
        int i10;
        int i11;
        boolean z11;
        g t02 = t0(l3Var, this.f28034x, this.K, this.f28029s, this.E, this.F, this.f28021k, this.f28022l);
        t.b bVar = t02.f28057a;
        long j10 = t02.f28059c;
        boolean z12 = t02.f28060d;
        long j11 = t02.f28058b;
        boolean z13 = (this.f28034x.f28228b.equals(bVar) && j11 == this.f28034x.f28244r) ? false : true;
        h hVar = null;
        try {
            if (t02.f28061e) {
                if (this.f28034x.f28231e != 1) {
                    V0(4);
                }
                n0(false, false, false, true);
            }
            try {
                if (!z13) {
                    try {
                        i11 = 4;
                        z11 = false;
                        if (!this.f28029s.F(l3Var, this.L, y())) {
                            y0(false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        i10 = 4;
                        m2 m2Var = this.f28034x;
                        h hVar2 = hVar;
                        j1(l3Var, bVar, m2Var.f28227a, m2Var.f28228b, t02.f28062f ? j11 : -9223372036854775807L);
                        if (z13 || j10 != this.f28034x.f28229c) {
                            m2 m2Var2 = this.f28034x;
                            Object obj = m2Var2.f28228b.f25139a;
                            l3 l3Var2 = m2Var2.f28227a;
                            this.f28034x = K(bVar, j11, j10, this.f28034x.f28230d, z13 && z10 && !l3Var2.u() && !l3Var2.l(obj, this.f28022l).f28136f, l3Var.f(obj) == -1 ? i10 : 3);
                        }
                        o0();
                        s0(l3Var, this.f28034x.f28227a);
                        this.f28034x = this.f28034x.i(l3Var);
                        if (!l3Var.u()) {
                            this.K = hVar2;
                        }
                        F(false);
                        throw th;
                    }
                } else {
                    i11 = 4;
                    z11 = false;
                    if (!l3Var.u()) {
                        for (a2 p10 = this.f28029s.p(); p10 != null; p10 = p10.j()) {
                            if (p10.f27869f.f27887a.equals(bVar)) {
                                p10.f27869f = this.f28029s.r(l3Var, p10.f27869f);
                                p10.A();
                            }
                        }
                        j11 = A0(bVar, j11, z12);
                    }
                }
                m2 m2Var3 = this.f28034x;
                j1(l3Var, bVar, m2Var3.f28227a, m2Var3.f28228b, t02.f28062f ? j11 : -9223372036854775807L);
                if (z13 || j10 != this.f28034x.f28229c) {
                    m2 m2Var4 = this.f28034x;
                    Object obj2 = m2Var4.f28228b.f25139a;
                    l3 l3Var3 = m2Var4.f28227a;
                    this.f28034x = K(bVar, j11, j10, this.f28034x.f28230d, (!z13 || !z10 || l3Var3.u() || l3Var3.l(obj2, this.f28022l).f28136f) ? z11 : true, l3Var.f(obj2) == -1 ? i11 : 3);
                }
                o0();
                s0(l3Var, this.f28034x.f28227a);
                this.f28034x = this.f28034x.i(l3Var);
                if (!l3Var.u()) {
                    this.K = null;
                }
                F(z11);
            } catch (Throwable th2) {
                th = th2;
                hVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            i10 = 4;
        }
    }

    private void G0(y2 y2Var, long j10) {
        y2Var.i();
        if (y2Var instanceof n4.o) {
            ((n4.o) y2Var).Z(j10);
        }
    }

    private void H(e4.q qVar) throws q {
        if (this.f28029s.v(qVar)) {
            a2 j10 = this.f28029s.j();
            j10.p(this.f28025o.b().f28262a, this.f28034x.f28227a);
            g1(j10.n(), j10.o());
            if (j10 == this.f28029s.p()) {
                p0(j10.f27869f.f27888b);
                p();
                m2 m2Var = this.f28034x;
                t.b bVar = m2Var.f28228b;
                long j11 = j10.f27869f.f27888b;
                this.f28034x = K(bVar, j11, m2Var.f28229c, j11, false, 5);
            }
            T();
        }
    }

    private void H0(boolean z10, AtomicBoolean atomicBoolean) {
        y2[] y2VarArr;
        if (this.G != z10) {
            this.G = z10;
            if (!z10) {
                for (y2 y2Var : this.f28011a) {
                    if (!P(y2Var) && this.f28012b.remove(y2Var)) {
                        y2Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void I(o2 o2Var, float f10, boolean z10, boolean z11) throws q {
        y2[] y2VarArr;
        if (z10) {
            if (z11) {
                this.f28035y.b(1);
            }
            this.f28034x = this.f28034x.f(o2Var);
        }
        k1(o2Var.f28262a);
        for (y2 y2Var : this.f28011a) {
            if (y2Var != null) {
                y2Var.p(f10, o2Var.f28262a);
            }
        }
    }

    private void I0(b bVar) throws q {
        this.f28035y.b(1);
        if (bVar.f28040c != -1) {
            this.K = new h(new u2(bVar.f28038a, bVar.f28039b), bVar.f28040c, bVar.f28041d);
        }
        G(this.f28030t.C(bVar.f28038a, bVar.f28039b), false);
    }

    private void J(o2 o2Var, boolean z10) throws q {
        I(o2Var, o2Var.f28262a, true, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m2 K(t.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        e4.m0 m0Var;
        x4.c0 c0Var;
        e4.m0 n10;
        x4.c0 o10;
        this.N = (!this.N && j10 == this.f28034x.f28244r && bVar.equals(this.f28034x.f28228b)) ? false : true;
        o0();
        m2 m2Var = this.f28034x;
        e4.m0 m0Var2 = m2Var.f28234h;
        x4.c0 c0Var2 = m2Var.f28235i;
        List list2 = m2Var.f28236j;
        if (this.f28030t.s()) {
            a2 p10 = this.f28029s.p();
            if (p10 == null) {
                n10 = e4.m0.f25104d;
            } else {
                n10 = p10.n();
            }
            if (p10 == null) {
                o10 = this.f28015e;
            } else {
                o10 = p10.o();
            }
            List t10 = t(o10.f32591c);
            if (p10 != null) {
                b2 b2Var = p10.f27869f;
                if (b2Var.f27889c != j11) {
                    p10.f27869f = b2Var.a(j11);
                }
            }
            m0Var = n10;
            c0Var = o10;
            list = t10;
        } else if (bVar.equals(this.f28034x.f28228b)) {
            list = list2;
            m0Var = m0Var2;
            c0Var = c0Var2;
        } else {
            m0Var = e4.m0.f25104d;
            c0Var = this.f28015e;
            list = y5.q.p();
        }
        if (z10) {
            this.f28035y.e(i10);
        }
        return this.f28034x.c(bVar, j10, j11, j12, B(), m0Var, c0Var, list);
    }

    private void K0(boolean z10) {
        if (z10 == this.I) {
            return;
        }
        this.I = z10;
        if (z10 || !this.f28034x.f28241o) {
            return;
        }
        this.f28018h.h(2);
    }

    private boolean L(y2 y2Var, a2 a2Var) {
        a2 j10 = a2Var.j();
        return a2Var.f27869f.f27892f && j10.f27867d && ((y2Var instanceof n4.o) || (y2Var instanceof com.google.android.exoplayer2.metadata.a) || y2Var.u() >= j10.m());
    }

    private void L0(boolean z10) throws q {
        this.A = z10;
        o0();
        if (!this.B || this.f28029s.q() == this.f28029s.p()) {
            return;
        }
        y0(true);
        F(false);
    }

    private boolean M() {
        a2 q10 = this.f28029s.q();
        if (q10.f27867d) {
            int i10 = 0;
            while (true) {
                y2[] y2VarArr = this.f28011a;
                if (i10 >= y2VarArr.length) {
                    return true;
                }
                y2 y2Var = y2VarArr[i10];
                e4.e0 e0Var = q10.f27866c[i10];
                if (y2Var.t() != e0Var || (e0Var != null && !y2Var.g() && !L(y2Var, q10))) {
                    break;
                }
                i10++;
            }
            return false;
        }
        return false;
    }

    private static boolean N(boolean z10, t.b bVar, long j10, t.b bVar2, l3.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f25139a.equals(bVar2.f25139a)) {
            return (bVar.b() && bVar3.t(bVar.f25140b)) ? (bVar3.k(bVar.f25140b, bVar.f25141c) == 4 || bVar3.k(bVar.f25140b, bVar.f25141c) == 2) ? false : true : bVar2.b() && bVar3.t(bVar2.f25140b);
        }
        return false;
    }

    private void N0(boolean z10, int i10, boolean z11, int i11) throws q {
        this.f28035y.b(z11 ? 1 : 0);
        this.f28035y.c(i11);
        this.f28034x = this.f28034x.d(z10, i10);
        this.C = false;
        d0(z10);
        if (!Y0()) {
            e1();
            i1();
            return;
        }
        int i12 = this.f28034x.f28231e;
        if (i12 == 3) {
            b1();
            this.f28018h.h(2);
        } else if (i12 == 2) {
            this.f28018h.h(2);
        }
    }

    private boolean O() {
        a2 j10 = this.f28029s.j();
        return (j10 == null || j10.k() == Long.MIN_VALUE) ? false : true;
    }

    private void O0(o2 o2Var) throws q {
        this.f28025o.d(o2Var);
        J(this.f28025o.b(), true);
    }

    private static boolean P(y2 y2Var) {
        return y2Var.getState() != 0;
    }

    private boolean Q() {
        a2 p10 = this.f28029s.p();
        long j10 = p10.f27869f.f27891e;
        return p10.f27867d && (j10 == -9223372036854775807L || this.f28034x.f28244r < j10 || !Y0());
    }

    private void Q0(int i10) throws q {
        this.E = i10;
        if (!this.f28029s.G(this.f28034x.f28227a, i10)) {
            y0(true);
        }
        F(false);
    }

    private static boolean R(m2 m2Var, l3.b bVar) {
        t.b bVar2 = m2Var.f28228b;
        l3 l3Var = m2Var.f28227a;
        return l3Var.u() || l3Var.l(bVar2.f25139a, bVar).f28136f;
    }

    private void R0(d3 d3Var) {
        this.f28033w = d3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(t2 t2Var) {
        try {
            l(t2Var);
        } catch (q e8) {
            a5.t.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e8);
            throw new RuntimeException(e8);
        }
    }

    private void T() {
        boolean X0 = X0();
        this.D = X0;
        if (X0) {
            this.f28029s.j().d(this.L);
        }
        f1();
    }

    private void T0(boolean z10) throws q {
        this.F = z10;
        if (!this.f28029s.H(this.f28034x.f28227a, z10)) {
            y0(true);
        }
        F(false);
    }

    private void U() {
        this.f28035y.d(this.f28034x);
        if (this.f28035y.f28050a) {
            this.f28028r.a(this.f28035y);
            this.f28035y = new e(this.f28034x);
        }
    }

    private void U0(e4.g0 g0Var) throws q {
        this.f28035y.b(1);
        G(this.f28030t.D(g0Var), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[LOOP:1: B:27:0x0074->B:37:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:14:0x0045). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0073 -> B:27:0x0074). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void V(long r8, long r10) throws n3.q {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.i1.V(long, long):void");
    }

    private void V0(int i10) {
        m2 m2Var = this.f28034x;
        if (m2Var.f28231e != i10) {
            if (i10 != 2) {
                this.Q = -9223372036854775807L;
            }
            this.f28034x = m2Var.g(i10);
        }
    }

    private void W() throws q {
        b2 o10;
        this.f28029s.y(this.L);
        if (this.f28029s.D() && (o10 = this.f28029s.o(this.L, this.f28034x)) != null) {
            a2 g10 = this.f28029s.g(this.f28013c, this.f28014d, this.f28016f.d(), this.f28030t, o10, this.f28015e);
            g10.f27864a.r(this, o10.f27888b);
            if (this.f28029s.p() == g10) {
                p0(o10.f27888b);
            }
            F(false);
        }
        if (this.D) {
            this.D = O();
            f1();
            return;
        }
        T();
    }

    private boolean W0() {
        a2 p10;
        a2 j10;
        return Y0() && !this.B && (p10 = this.f28029s.p()) != null && (j10 = p10.j()) != null && this.L >= j10.m() && j10.f27870g;
    }

    private void X() throws q {
        boolean z10;
        boolean z11 = false;
        while (W0()) {
            if (z11) {
                U();
            }
            a2 a2Var = (a2) a5.a.e(this.f28029s.b());
            if (this.f28034x.f28228b.f25139a.equals(a2Var.f27869f.f27887a.f25139a)) {
                t.b bVar = this.f28034x.f28228b;
                if (bVar.f25140b == -1) {
                    t.b bVar2 = a2Var.f27869f.f27887a;
                    if (bVar2.f25140b == -1 && bVar.f25143e != bVar2.f25143e) {
                        z10 = true;
                        b2 b2Var = a2Var.f27869f;
                        t.b bVar3 = b2Var.f27887a;
                        long j10 = b2Var.f27888b;
                        this.f28034x = K(bVar3, j10, b2Var.f27889c, j10, !z10, 0);
                        o0();
                        i1();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            b2 b2Var2 = a2Var.f27869f;
            t.b bVar32 = b2Var2.f27887a;
            long j102 = b2Var2.f27888b;
            this.f28034x = K(bVar32, j102, b2Var2.f27889c, j102, !z10, 0);
            o0();
            i1();
            z11 = true;
        }
    }

    private boolean X0() {
        long y10;
        if (O()) {
            a2 j10 = this.f28029s.j();
            long C = C(j10.k());
            if (j10 == this.f28029s.p()) {
                y10 = j10.y(this.L);
            } else {
                y10 = j10.y(this.L) - j10.f27869f.f27888b;
            }
            long j11 = y10;
            boolean h10 = this.f28016f.h(j11, C, this.f28025o.b().f28262a);
            if (h10 || C >= 500000) {
                return h10;
            }
            if (this.f28023m > 0 || this.f28024n) {
                this.f28029s.p().f27864a.u(this.f28034x.f28244r, false);
                return this.f28016f.h(j11, C, this.f28025o.b().f28262a);
            }
            return h10;
        }
        return false;
    }

    private void Y() {
        a2 q10 = this.f28029s.q();
        if (q10 == null) {
            return;
        }
        int i10 = 0;
        if (q10.j() != null && !this.B) {
            if (M()) {
                if (q10.j().f27867d || this.L >= q10.j().m()) {
                    x4.c0 o10 = q10.o();
                    a2 c10 = this.f28029s.c();
                    x4.c0 o11 = c10.o();
                    l3 l3Var = this.f28034x.f28227a;
                    j1(l3Var, c10.f27869f.f27887a, l3Var, q10.f27869f.f27887a, -9223372036854775807L);
                    if (c10.f27867d && c10.f27864a.l() != -9223372036854775807L) {
                        F0(c10.m());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f28011a.length; i11++) {
                        boolean c11 = o10.c(i11);
                        boolean c12 = o11.c(i11);
                        if (c11 && !this.f28011a[i11].m()) {
                            boolean z10 = this.f28013c[i11].f() == -2;
                            b3 b3Var = o10.f32590b[i11];
                            b3 b3Var2 = o11.f32590b[i11];
                            if (!c12 || !b3Var2.equals(b3Var) || z10) {
                                G0(this.f28011a[i11], c10.m());
                            }
                        }
                    }
                }
            }
        } else if (q10.f27869f.f27895i || this.B) {
            while (true) {
                y2[] y2VarArr = this.f28011a;
                if (i10 >= y2VarArr.length) {
                    return;
                }
                y2 y2Var = y2VarArr[i10];
                e4.e0 e0Var = q10.f27866c[i10];
                if (e0Var != null && y2Var.t() == e0Var && y2Var.g()) {
                    long j10 = q10.f27869f.f27891e;
                    G0(y2Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : q10.l() + q10.f27869f.f27891e);
                }
                i10++;
            }
        }
    }

    private boolean Y0() {
        m2 m2Var = this.f28034x;
        return m2Var.f28238l && m2Var.f28239m == 0;
    }

    private void Z() throws q {
        a2 q10 = this.f28029s.q();
        if (q10 == null || this.f28029s.p() == q10 || q10.f27870g || !l0()) {
            return;
        }
        p();
    }

    private boolean Z0(boolean z10) {
        if (this.J == 0) {
            return Q();
        }
        if (z10) {
            m2 m2Var = this.f28034x;
            if (m2Var.f28233g) {
                long c10 = a1(m2Var.f28227a, this.f28029s.p().f27869f.f27887a) ? this.f28031u.c() : -9223372036854775807L;
                a2 j10 = this.f28029s.j();
                return (j10.q() && j10.f27869f.f27895i) || (j10.f27869f.f27887a.b() && !j10.f27867d) || this.f28016f.c(B(), this.f28025o.b().f28262a, this.C, c10);
            }
            return true;
        }
        return false;
    }

    private void a0() throws q {
        G(this.f28030t.i(), true);
    }

    private boolean a1(l3 l3Var, t.b bVar) {
        if (bVar.b() || l3Var.u()) {
            return false;
        }
        l3Var.r(l3Var.l(bVar.f25139a, this.f28022l).f28133c, this.f28021k);
        if (this.f28021k.g()) {
            l3.d dVar = this.f28021k;
            return dVar.f28154i && dVar.f28151f != -9223372036854775807L;
        }
        return false;
    }

    private void b0(c cVar) throws q {
        this.f28035y.b(1);
        G(this.f28030t.v(cVar.f28042a, cVar.f28043b, cVar.f28044c, cVar.f28045d), false);
    }

    private void b1() throws q {
        y2[] y2VarArr;
        this.C = false;
        this.f28025o.g();
        for (y2 y2Var : this.f28011a) {
            if (P(y2Var)) {
                y2Var.start();
            }
        }
    }

    private void c0() {
        x4.s[] sVarArr;
        for (a2 p10 = this.f28029s.p(); p10 != null; p10 = p10.j()) {
            for (x4.s sVar : p10.o().f32591c) {
                if (sVar != null) {
                    sVar.k();
                }
            }
        }
    }

    private void d0(boolean z10) {
        x4.s[] sVarArr;
        for (a2 p10 = this.f28029s.p(); p10 != null; p10 = p10.j()) {
            for (x4.s sVar : p10.o().f32591c) {
                if (sVar != null) {
                    sVar.o(z10);
                }
            }
        }
    }

    private void d1(boolean z10, boolean z11) {
        n0(z10 || !this.G, false, true, false);
        this.f28035y.b(z11 ? 1 : 0);
        this.f28016f.e();
        V0(1);
    }

    private void e0() {
        x4.s[] sVarArr;
        for (a2 p10 = this.f28029s.p(); p10 != null; p10 = p10.j()) {
            for (x4.s sVar : p10.o().f32591c) {
                if (sVar != null) {
                    sVar.u();
                }
            }
        }
    }

    private void e1() throws q {
        y2[] y2VarArr;
        this.f28025o.h();
        for (y2 y2Var : this.f28011a) {
            if (P(y2Var)) {
                r(y2Var);
            }
        }
    }

    private void f1() {
        a2 j10 = this.f28029s.j();
        boolean z10 = this.D || (j10 != null && j10.f27864a.c());
        m2 m2Var = this.f28034x;
        if (z10 != m2Var.f28233g) {
            this.f28034x = m2Var.a(z10);
        }
    }

    private void g1(e4.m0 m0Var, x4.c0 c0Var) {
        this.f28016f.f(this.f28011a, m0Var, c0Var.f32591c);
    }

    private void h0() {
        this.f28035y.b(1);
        n0(false, false, false, true);
        this.f28016f.onPrepared();
        V0(this.f28034x.f28227a.u() ? 4 : 2);
        this.f28030t.w(this.f28017g.d());
        this.f28018h.h(2);
    }

    private void h1() throws q, IOException {
        if (this.f28034x.f28227a.u() || !this.f28030t.s()) {
            return;
        }
        W();
        Y();
        Z();
        X();
    }

    private void i0() {
        n0(true, false, true, false);
        this.f28016f.g();
        V0(1);
        this.f28019i.quit();
        synchronized (this) {
            this.f28036z = true;
            notifyAll();
        }
    }

    private void i1() throws q {
        a2 p10 = this.f28029s.p();
        if (p10 == null) {
            return;
        }
        long l10 = p10.f27867d ? p10.f27864a.l() : -9223372036854775807L;
        if (l10 != -9223372036854775807L) {
            p0(l10);
            if (l10 != this.f28034x.f28244r) {
                m2 m2Var = this.f28034x;
                this.f28034x = K(m2Var.f28228b, l10, m2Var.f28229c, l10, true, 5);
            }
        } else {
            long i10 = this.f28025o.i(p10 != this.f28029s.q());
            this.L = i10;
            long y10 = p10.y(i10);
            V(this.f28034x.f28244r, y10);
            this.f28034x.f28244r = y10;
        }
        this.f28034x.f28242p = this.f28029s.j().i();
        this.f28034x.f28243q = B();
        m2 m2Var2 = this.f28034x;
        if (m2Var2.f28238l && m2Var2.f28231e == 3 && a1(m2Var2.f28227a, m2Var2.f28228b) && this.f28034x.f28240n.f28262a == 1.0f) {
            float b10 = this.f28031u.b(u(), B());
            if (this.f28025o.b().f28262a != b10) {
                this.f28025o.d(this.f28034x.f28240n.e(b10));
                I(this.f28034x.f28240n, this.f28025o.b().f28262a, false, false);
            }
        }
    }

    private void j(b bVar, int i10) throws q {
        this.f28035y.b(1);
        g2 g2Var = this.f28030t;
        if (i10 == -1) {
            i10 = g2Var.q();
        }
        G(g2Var.f(i10, bVar.f28038a, bVar.f28039b), false);
    }

    private void j0(int i10, int i11, e4.g0 g0Var) throws q {
        this.f28035y.b(1);
        G(this.f28030t.A(i10, i11, g0Var), false);
    }

    private void j1(l3 l3Var, t.b bVar, l3 l3Var2, t.b bVar2, long j10) {
        if (!a1(l3Var, bVar)) {
            o2 o2Var = bVar.b() ? o2.f28260d : this.f28034x.f28240n;
            if (this.f28025o.b().equals(o2Var)) {
                return;
            }
            this.f28025o.d(o2Var);
            return;
        }
        l3Var.r(l3Var.l(bVar.f25139a, this.f28022l).f28133c, this.f28021k);
        this.f28031u.a((u1.g) a5.p0.j(this.f28021k.f28156k));
        if (j10 != -9223372036854775807L) {
            this.f28031u.e(x(l3Var, bVar.f25139a, j10));
            return;
        }
        if (a5.p0.c(l3Var2.u() ? null : l3Var2.r(l3Var2.l(bVar2.f25139a, this.f28022l).f28133c, this.f28021k).f28146a, this.f28021k.f28146a)) {
            return;
        }
        this.f28031u.e(-9223372036854775807L);
    }

    private void k() throws q {
        y0(true);
    }

    private void k1(float f10) {
        x4.s[] sVarArr;
        for (a2 p10 = this.f28029s.p(); p10 != null; p10 = p10.j()) {
            for (x4.s sVar : p10.o().f32591c) {
                if (sVar != null) {
                    sVar.i(f10);
                }
            }
        }
    }

    private void l(t2 t2Var) throws q {
        if (t2Var.j()) {
            return;
        }
        try {
            t2Var.g().j(t2Var.i(), t2Var.e());
        } finally {
            t2Var.k(true);
        }
    }

    private boolean l0() throws q {
        a2 q10 = this.f28029s.q();
        x4.c0 o10 = q10.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            y2[] y2VarArr = this.f28011a;
            if (i10 >= y2VarArr.length) {
                return !z10;
            }
            y2 y2Var = y2VarArr[i10];
            if (P(y2Var)) {
                boolean z11 = y2Var.t() != q10.f27866c[i10];
                if (!o10.c(i10) || z11) {
                    if (!y2Var.m()) {
                        y2Var.q(v(o10.f32591c[i10]), q10.f27866c[i10], q10.m(), q10.l());
                    } else if (y2Var.c()) {
                        m(y2Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void m(y2 y2Var) throws q {
        if (P(y2Var)) {
            this.f28025o.a(y2Var);
            r(y2Var);
            y2Var.e();
            this.J--;
        }
    }

    private void m0() throws q {
        float f10 = this.f28025o.b().f28262a;
        a2 q10 = this.f28029s.q();
        boolean z10 = true;
        for (a2 p10 = this.f28029s.p(); p10 != null && p10.f27867d; p10 = p10.j()) {
            x4.c0 v10 = p10.v(f10, this.f28034x.f28227a);
            if (!v10.a(p10.o())) {
                if (z10) {
                    a2 p11 = this.f28029s.p();
                    boolean z11 = this.f28029s.z(p11);
                    boolean[] zArr = new boolean[this.f28011a.length];
                    long b10 = p11.b(v10, this.f28034x.f28244r, z11, zArr);
                    m2 m2Var = this.f28034x;
                    boolean z12 = (m2Var.f28231e == 4 || b10 == m2Var.f28244r) ? false : true;
                    m2 m2Var2 = this.f28034x;
                    this.f28034x = K(m2Var2.f28228b, b10, m2Var2.f28229c, m2Var2.f28230d, z12, 5);
                    if (z12) {
                        p0(b10);
                    }
                    boolean[] zArr2 = new boolean[this.f28011a.length];
                    int i10 = 0;
                    while (true) {
                        y2[] y2VarArr = this.f28011a;
                        if (i10 >= y2VarArr.length) {
                            break;
                        }
                        y2 y2Var = y2VarArr[i10];
                        zArr2[i10] = P(y2Var);
                        e4.e0 e0Var = p11.f27866c[i10];
                        if (zArr2[i10]) {
                            if (e0Var != y2Var.t()) {
                                m(y2Var);
                            } else if (zArr[i10]) {
                                y2Var.v(this.L);
                            }
                        }
                        i10++;
                    }
                    q(zArr2);
                } else {
                    this.f28029s.z(p10);
                    if (p10.f27867d) {
                        p10.a(v10, Math.max(p10.f27869f.f27888b, p10.y(this.L)), false);
                    }
                }
                F(true);
                if (this.f28034x.f28231e != 4) {
                    T();
                    i1();
                    this.f28018h.h(2);
                    return;
                }
                return;
            }
            if (p10 == q10) {
                z10 = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n() throws n3.q, java.io.IOException {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.i1.n():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.i1.n0(boolean, boolean, boolean, boolean):void");
    }

    private void o(int i10, boolean z10) throws q {
        y2 y2Var = this.f28011a[i10];
        if (P(y2Var)) {
            return;
        }
        a2 q10 = this.f28029s.q();
        boolean z11 = q10 == this.f28029s.p();
        x4.c0 o10 = q10.o();
        b3 b3Var = o10.f32590b[i10];
        m1[] v10 = v(o10.f32591c[i10]);
        boolean z12 = Y0() && this.f28034x.f28231e == 3;
        boolean z13 = !z10 && z12;
        this.J++;
        this.f28012b.add(y2Var);
        y2Var.k(b3Var, v10, q10.f27866c[i10], this.L, z13, z11, q10.m(), q10.l());
        y2Var.j(11, new a());
        this.f28025o.c(y2Var);
        if (z12) {
            y2Var.start();
        }
    }

    private void o0() {
        a2 p10 = this.f28029s.p();
        this.B = p10 != null && p10.f27869f.f27894h && this.A;
    }

    private void p() throws q {
        q(new boolean[this.f28011a.length]);
    }

    private void p0(long j10) throws q {
        y2[] y2VarArr;
        a2 p10 = this.f28029s.p();
        long z10 = p10 == null ? j10 + 1000000000000L : p10.z(j10);
        this.L = z10;
        this.f28025o.e(z10);
        for (y2 y2Var : this.f28011a) {
            if (P(y2Var)) {
                y2Var.v(this.L);
            }
        }
        c0();
    }

    private void q(boolean[] zArr) throws q {
        a2 q10 = this.f28029s.q();
        x4.c0 o10 = q10.o();
        for (int i10 = 0; i10 < this.f28011a.length; i10++) {
            if (!o10.c(i10) && this.f28012b.remove(this.f28011a[i10])) {
                this.f28011a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f28011a.length; i11++) {
            if (o10.c(i11)) {
                o(i11, zArr[i11]);
            }
        }
        q10.f27870g = true;
    }

    private static void q0(l3 l3Var, d dVar, l3.d dVar2, l3.b bVar) {
        int i10 = l3Var.r(l3Var.l(dVar.f28049d, bVar).f28133c, dVar2).f28161p;
        Object obj = l3Var.k(i10, bVar, true).f28132b;
        long j10 = bVar.f28134d;
        dVar.b(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private void r(y2 y2Var) throws q {
        if (y2Var.getState() == 2) {
            y2Var.stop();
        }
    }

    private static boolean r0(d dVar, l3 l3Var, l3 l3Var2, int i10, boolean z10, l3.d dVar2, l3.b bVar) {
        Object obj = dVar.f28049d;
        if (obj == null) {
            Pair<Object, Long> u02 = u0(l3Var, new h(dVar.f28046a.h(), dVar.f28046a.d(), dVar.f28046a.f() == Long.MIN_VALUE ? -9223372036854775807L : a5.p0.C0(dVar.f28046a.f())), false, i10, z10, dVar2, bVar);
            if (u02 == null) {
                return false;
            }
            dVar.b(l3Var.f(u02.first), ((Long) u02.second).longValue(), u02.first);
            if (dVar.f28046a.f() == Long.MIN_VALUE) {
                q0(l3Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int f10 = l3Var.f(obj);
        if (f10 == -1) {
            return false;
        }
        if (dVar.f28046a.f() == Long.MIN_VALUE) {
            q0(l3Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f28047b = f10;
        l3Var2.l(dVar.f28049d, bVar);
        if (bVar.f28136f && l3Var2.r(bVar.f28133c, dVar2).f28160o == l3Var2.f(dVar.f28049d)) {
            Pair<Object, Long> n10 = l3Var.n(dVar2, bVar, l3Var.l(dVar.f28049d, bVar).f28133c, dVar.f28048c + bVar.q());
            dVar.b(l3Var.f(n10.first), ((Long) n10.second).longValue(), n10.first);
        }
        return true;
    }

    private void s0(l3 l3Var, l3 l3Var2) {
        if (l3Var.u() && l3Var2.u()) {
            return;
        }
        for (int size = this.f28026p.size() - 1; size >= 0; size--) {
            if (!r0(this.f28026p.get(size), l3Var, l3Var2, this.E, this.F, this.f28021k, this.f28022l)) {
                this.f28026p.get(size).f28046a.k(false);
                this.f28026p.remove(size);
            }
        }
        Collections.sort(this.f28026p);
    }

    private y5.q<Metadata> t(x4.s[] sVarArr) {
        q.a aVar = new q.a();
        boolean z10 = false;
        for (x4.s sVar : sVarArr) {
            if (sVar != null) {
                Metadata metadata = sVar.f(0).f28183j;
                if (metadata == null) {
                    aVar.a(new Metadata(new Metadata.Entry[0]));
                } else {
                    aVar.a(metadata);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.h() : y5.q.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static n3.i1.g t0(n3.l3 r30, n3.m2 r31, n3.i1.h r32, n3.d2 r33, int r34, boolean r35, n3.l3.d r36, n3.l3.b r37) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.i1.t0(n3.l3, n3.m2, n3.i1$h, n3.d2, int, boolean, n3.l3$d, n3.l3$b):n3.i1$g");
    }

    private long u() {
        m2 m2Var = this.f28034x;
        return x(m2Var.f28227a, m2Var.f28228b.f25139a, m2Var.f28244r);
    }

    private static Pair<Object, Long> u0(l3 l3Var, h hVar, boolean z10, int i10, boolean z11, l3.d dVar, l3.b bVar) {
        Pair<Object, Long> n10;
        Object v02;
        l3 l3Var2 = hVar.f28063a;
        if (l3Var.u()) {
            return null;
        }
        l3 l3Var3 = l3Var2.u() ? l3Var : l3Var2;
        try {
            n10 = l3Var3.n(dVar, bVar, hVar.f28064b, hVar.f28065c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (l3Var.equals(l3Var3)) {
            return n10;
        }
        if (l3Var.f(n10.first) != -1) {
            return (l3Var3.l(n10.first, bVar).f28136f && l3Var3.r(bVar.f28133c, dVar).f28160o == l3Var3.f(n10.first)) ? l3Var.n(dVar, bVar, l3Var.l(n10.first, bVar).f28133c, hVar.f28065c) : n10;
        }
        if (z10 && (v02 = v0(dVar, bVar, i10, z11, n10.first, l3Var3, l3Var)) != null) {
            return l3Var.n(dVar, bVar, l3Var.l(v02, bVar).f28133c, -9223372036854775807L);
        }
        return null;
    }

    private static m1[] v(x4.s sVar) {
        int length = sVar != null ? sVar.length() : 0;
        m1[] m1VarArr = new m1[length];
        for (int i10 = 0; i10 < length; i10++) {
            m1VarArr[i10] = sVar.f(i10);
        }
        return m1VarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object v0(l3.d dVar, l3.b bVar, int i10, boolean z10, Object obj, l3 l3Var, l3 l3Var2) {
        int f10 = l3Var.f(obj);
        int m7 = l3Var.m();
        int i11 = f10;
        int i12 = -1;
        for (int i13 = 0; i13 < m7 && i12 == -1; i13++) {
            i11 = l3Var.h(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = l3Var2.f(l3Var.q(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return l3Var2.q(i12);
    }

    private void w0(long j10, long j11) {
        this.f28018h.i(2, j10 + j11);
    }

    private long x(l3 l3Var, Object obj, long j10) {
        l3Var.r(l3Var.l(obj, this.f28022l).f28133c, this.f28021k);
        l3.d dVar = this.f28021k;
        if (dVar.f28151f != -9223372036854775807L && dVar.g()) {
            l3.d dVar2 = this.f28021k;
            if (dVar2.f28154i) {
                return a5.p0.C0(dVar2.c() - this.f28021k.f28151f) - (j10 + this.f28022l.q());
            }
        }
        return -9223372036854775807L;
    }

    private long y() {
        a2 q10 = this.f28029s.q();
        if (q10 == null) {
            return 0L;
        }
        long l10 = q10.l();
        if (!q10.f27867d) {
            return l10;
        }
        int i10 = 0;
        while (true) {
            y2[] y2VarArr = this.f28011a;
            if (i10 >= y2VarArr.length) {
                return l10;
            }
            if (P(y2VarArr[i10]) && this.f28011a[i10].t() == q10.f27866c[i10]) {
                long u10 = this.f28011a[i10].u();
                if (u10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l10 = Math.max(u10, l10);
            }
            i10++;
        }
    }

    private void y0(boolean z10) throws q {
        t.b bVar = this.f28029s.p().f27869f.f27887a;
        long B0 = B0(bVar, this.f28034x.f28244r, true, false);
        if (B0 != this.f28034x.f28244r) {
            m2 m2Var = this.f28034x;
            this.f28034x = K(bVar, B0, m2Var.f28229c, m2Var.f28230d, z10, 5);
        }
    }

    private Pair<t.b, Long> z(l3 l3Var) {
        if (l3Var.u()) {
            return Pair.create(m2.k(), 0L);
        }
        Pair<Object, Long> n10 = l3Var.n(this.f28021k, this.f28022l, l3Var.e(this.F), -9223372036854775807L);
        t.b B = this.f28029s.B(l3Var, n10.first, 0L);
        long longValue = ((Long) n10.second).longValue();
        if (B.b()) {
            l3Var.l(B.f25139a, this.f28022l);
            longValue = B.f25141c == this.f28022l.n(B.f25140b) ? this.f28022l.j() : 0L;
        }
        return Pair.create(B, Long.valueOf(longValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void z0(n3.i1.h r19) throws n3.q {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.i1.z0(n3.i1$h):void");
    }

    public Looper A() {
        return this.f28020j;
    }

    public void J0(List<g2.c> list, int i10, long j10, e4.g0 g0Var) {
        this.f28018h.d(17, new b(list, g0Var, i10, j10, null)).a();
    }

    public void M0(boolean z10, int i10) {
        this.f28018h.e(1, z10 ? 1 : 0, i10).a();
    }

    public void P0(int i10) {
        this.f28018h.e(11, i10, 0).a();
    }

    public void S0(boolean z10) {
        this.f28018h.e(12, z10 ? 1 : 0, 0).a();
    }

    @Override // e4.q.a
    public void a(e4.q qVar) {
        this.f28018h.d(8, qVar).a();
    }

    @Override // x4.b0.a
    public void b() {
        this.f28018h.h(10);
    }

    @Override // n3.g2.d
    public void c() {
        this.f28018h.h(22);
    }

    public void c1() {
        this.f28018h.a(6).a();
    }

    @Override // n3.t2.a
    public synchronized void d(t2 t2Var) {
        if (!this.f28036z && this.f28019i.isAlive()) {
            this.f28018h.d(14, t2Var).a();
            return;
        }
        a5.t.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        t2Var.k(false);
    }

    @Override // e4.f0.a
    /* renamed from: f0 */
    public void f(e4.q qVar) {
        this.f28018h.d(9, qVar).a();
    }

    public void g0() {
        this.f28018h.a(0).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a2 q10;
        int i10;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 0:
                    h0();
                    break;
                case 1:
                    N0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    n();
                    break;
                case 3:
                    z0((h) message.obj);
                    break;
                case 4:
                    O0((o2) message.obj);
                    break;
                case 5:
                    R0((d3) message.obj);
                    break;
                case 6:
                    d1(false, true);
                    break;
                case 7:
                    i0();
                    return true;
                case 8:
                    H((e4.q) message.obj);
                    break;
                case 9:
                    D((e4.q) message.obj);
                    break;
                case 10:
                    m0();
                    break;
                case 11:
                    Q0(message.arg1);
                    break;
                case 12:
                    T0(message.arg1 != 0);
                    break;
                case 13:
                    H0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C0((t2) message.obj);
                    break;
                case 15:
                    E0((t2) message.obj);
                    break;
                case 16:
                    J((o2) message.obj, false);
                    break;
                case 17:
                    I0((b) message.obj);
                    break;
                case 18:
                    j((b) message.obj, message.arg1);
                    break;
                case 19:
                    b0((c) message.obj);
                    break;
                case 20:
                    j0(message.arg1, message.arg2, (e4.g0) message.obj);
                    break;
                case 21:
                    U0((e4.g0) message.obj);
                    break;
                case 22:
                    a0();
                    break;
                case 23:
                    L0(message.arg1 != 0);
                    break;
                case 24:
                    K0(message.arg1 == 1);
                    break;
                case 25:
                    k();
                    break;
                default:
                    return false;
            }
        } catch (j.a e8) {
            E(e8, e8.f10525a);
        } catch (e4.b e10) {
            E(e10, 1002);
        } catch (h2 e11) {
            int i12 = e11.f28002b;
            if (i12 == 1) {
                i10 = e11.f28001a ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i10 = e11.f28001a ? 3002 : IronSourceError.ERROR_REWARD_VALIDATION_FAILED;
                }
                E(e11, i11);
            }
            i11 = i10;
            E(e11, i11);
        } catch (q e12) {
            e = e12;
            if (e.f28292d == 1 && (q10 = this.f28029s.q()) != null) {
                e = e.f(q10.f27869f.f27887a);
            }
            if (e.f28298j && this.O == null) {
                a5.t.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.O = e;
                a5.p pVar = this.f28018h;
                pVar.g(pVar.d(25, e));
            } else {
                q qVar = this.O;
                if (qVar != null) {
                    qVar.addSuppressed(e);
                    e = this.O;
                }
                a5.t.d("ExoPlayerImplInternal", "Playback error", e);
                d1(true, false);
                this.f28034x = this.f28034x.e(e);
            }
        } catch (z4.m e13) {
            E(e13, e13.f33548a);
        } catch (IOException e14) {
            E(e14, 2000);
        } catch (RuntimeException e15) {
            q j10 = q.j(e15, ((e15 instanceof IllegalStateException) || (e15 instanceof IllegalArgumentException)) ? 1004 : 1004);
            a5.t.d("ExoPlayerImplInternal", "Playback error", j10);
            d1(true, false);
            this.f28034x = this.f28034x.e(j10);
        }
        U();
        return true;
    }

    public void k0(int i10, int i11, e4.g0 g0Var) {
        this.f28018h.c(20, i10, i11, g0Var).a();
    }

    public void s(long j10) {
        this.P = j10;
    }

    @Override // n3.l.a
    public void w(o2 o2Var) {
        this.f28018h.d(16, o2Var).a();
    }

    public void x0(l3 l3Var, int i10, long j10) {
        this.f28018h.d(3, new h(l3Var, i10, j10)).a();
    }
}
