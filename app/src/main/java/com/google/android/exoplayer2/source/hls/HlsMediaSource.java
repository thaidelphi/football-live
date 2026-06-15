package com.google.android.exoplayer2.source.hls;

import a5.p0;
import android.os.Looper;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.offline.StreamKey;
import e4.a0;
import e4.h0;
import e4.q;
import e4.t;
import j4.c;
import j4.g;
import j4.h;
import java.io.IOException;
import java.util.List;
import k4.e;
import k4.g;
import k4.k;
import k4.l;
import n3.j1;
import n3.u1;
import r3.o;
import z4.b;
import z4.i0;
import z4.l;
import z4.s0;
import z4.y;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class HlsMediaSource extends e4.a implements l.e {

    /* renamed from: h  reason: collision with root package name */
    private final h f10779h;

    /* renamed from: i  reason: collision with root package name */
    private final u1.h f10780i;

    /* renamed from: j  reason: collision with root package name */
    private final g f10781j;

    /* renamed from: k  reason: collision with root package name */
    private final e4.g f10782k;

    /* renamed from: l  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.l f10783l;

    /* renamed from: m  reason: collision with root package name */
    private final i0 f10784m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f10785n;

    /* renamed from: o  reason: collision with root package name */
    private final int f10786o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f10787p;

    /* renamed from: q  reason: collision with root package name */
    private final l f10788q;

    /* renamed from: r  reason: collision with root package name */
    private final long f10789r;

    /* renamed from: s  reason: collision with root package name */
    private final u1 f10790s;

    /* renamed from: t  reason: collision with root package name */
    private u1.g f10791t;

    /* renamed from: u  reason: collision with root package name */
    private s0 f10792u;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Factory implements t.a {

        /* renamed from: a  reason: collision with root package name */
        private final g f10793a;

        /* renamed from: b  reason: collision with root package name */
        private h f10794b;

        /* renamed from: c  reason: collision with root package name */
        private k f10795c;

        /* renamed from: d  reason: collision with root package name */
        private l.a f10796d;

        /* renamed from: e  reason: collision with root package name */
        private e4.g f10797e;

        /* renamed from: f  reason: collision with root package name */
        private o f10798f;

        /* renamed from: g  reason: collision with root package name */
        private i0 f10799g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10800h;

        /* renamed from: i  reason: collision with root package name */
        private int f10801i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f10802j;

        /* renamed from: k  reason: collision with root package name */
        private long f10803k;

        public Factory(l.a aVar) {
            this(new c(aVar));
        }

        public HlsMediaSource a(u1 u1Var) {
            a5.a.e(u1Var.f28373b);
            k kVar = this.f10795c;
            List<StreamKey> list = u1Var.f28373b.f28441e;
            if (!list.isEmpty()) {
                kVar = new e(kVar, list);
            }
            g gVar = this.f10793a;
            h hVar = this.f10794b;
            e4.g gVar2 = this.f10797e;
            com.google.android.exoplayer2.drm.l a10 = this.f10798f.a(u1Var);
            i0 i0Var = this.f10799g;
            return new HlsMediaSource(u1Var, gVar, hVar, gVar2, a10, i0Var, this.f10796d.a(this.f10793a, i0Var, kVar), this.f10803k, this.f10800h, this.f10801i, this.f10802j);
        }

        public Factory(g gVar) {
            this.f10793a = (g) a5.a.e(gVar);
            this.f10798f = new i();
            this.f10795c = new k4.a();
            this.f10796d = k4.c.f27134p;
            this.f10794b = h.f26980a;
            this.f10799g = new y();
            this.f10797e = new e4.h();
            this.f10801i = 1;
            this.f10803k = -9223372036854775807L;
            this.f10800h = true;
        }
    }

    static {
        j1.a("goog.exo.hls");
    }

    private h0 E(k4.g gVar, long j10, long j11, com.google.android.exoplayer2.source.hls.a aVar) {
        long K;
        long d10 = gVar.f27170h - this.f10788q.d();
        long j12 = gVar.f27177o ? d10 + gVar.f27183u : -9223372036854775807L;
        long I = I(gVar);
        long j13 = this.f10791t.f28427a;
        if (j13 != -9223372036854775807L) {
            K = p0.C0(j13);
        } else {
            K = K(gVar, I);
        }
        L(gVar, p0.r(K, I, gVar.f27183u + I));
        return new h0(j10, j11, -9223372036854775807L, j12, gVar.f27183u, d10, J(gVar, I), true, !gVar.f27177o, gVar.f27166d == 2 && gVar.f27168f, aVar, this.f10790s, this.f10791t);
    }

    private h0 F(k4.g gVar, long j10, long j11, com.google.android.exoplayer2.source.hls.a aVar) {
        long j12;
        if (gVar.f27167e == -9223372036854775807L || gVar.f27180r.isEmpty()) {
            j12 = 0;
        } else {
            if (!gVar.f27169g) {
                long j13 = gVar.f27167e;
                if (j13 != gVar.f27183u) {
                    j12 = H(gVar.f27180r, j13).f27196e;
                }
            }
            j12 = gVar.f27167e;
        }
        long j14 = gVar.f27183u;
        return new h0(j10, j11, -9223372036854775807L, j14, j14, 0L, j12, true, false, true, aVar, this.f10790s, null);
    }

    private static g.b G(List<g.b> list, long j10) {
        g.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            g.b bVar2 = list.get(i10);
            long j11 = bVar2.f27196e;
            if (j11 <= j10 && bVar2.f27185l) {
                bVar = bVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return bVar;
    }

    private static g.d H(List<g.d> list, long j10) {
        return list.get(p0.g(list, Long.valueOf(j10), true, true));
    }

    private long I(k4.g gVar) {
        if (gVar.f27178p) {
            return p0.C0(p0.Z(this.f10789r)) - gVar.e();
        }
        return 0L;
    }

    private long J(k4.g gVar, long j10) {
        long j11 = gVar.f27167e;
        if (j11 == -9223372036854775807L) {
            j11 = (gVar.f27183u + j10) - p0.C0(this.f10791t.f28427a);
        }
        if (gVar.f27169g) {
            return j11;
        }
        g.b G = G(gVar.f27181s, j11);
        if (G != null) {
            return G.f27196e;
        }
        if (gVar.f27180r.isEmpty()) {
            return 0L;
        }
        g.d H = H(gVar.f27180r, j11);
        g.b G2 = G(H.f27191m, j11);
        if (G2 != null) {
            return G2.f27196e;
        }
        return H.f27196e;
    }

    private static long K(k4.g gVar, long j10) {
        long j11;
        g.f fVar = gVar.f27184v;
        long j12 = gVar.f27167e;
        if (j12 != -9223372036854775807L) {
            j11 = gVar.f27183u - j12;
        } else {
            long j13 = fVar.f27206d;
            if (j13 == -9223372036854775807L || gVar.f27176n == -9223372036854775807L) {
                long j14 = fVar.f27205c;
                j11 = j14 != -9223372036854775807L ? j14 : gVar.f27175m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void L(k4.g r5, long r6) {
        /*
            r4 = this;
            n3.u1 r0 = r4.f10790s
            n3.u1$g r0 = r0.f28375d
            float r1 = r0.f28430d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.f28431e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            k4.g$f r5 = r5.f27184v
            long r0 = r5.f27205c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r5.f27206d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            n3.u1$g$a r0 = new n3.u1$g$a
            r0.<init>()
            long r6 = a5.p0.Z0(r6)
            n3.u1$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3c
            r0 = r7
            goto L40
        L3c:
            n3.u1$g r0 = r4.f10791t
            float r0 = r0.f28430d
        L40:
            n3.u1$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L47
            goto L4b
        L47:
            n3.u1$g r5 = r4.f10791t
            float r7 = r5.f28431e
        L4b:
            n3.u1$g$a r5 = r6.h(r7)
            n3.u1$g r5 = r5.f()
            r4.f10791t = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.L(k4.g, long):void");
    }

    @Override // e4.a
    protected void B(s0 s0Var) {
        this.f10792u = s0Var;
        this.f10783l.a();
        this.f10783l.e((Looper) a5.a.e(Looper.myLooper()), z());
        this.f10788q.g(this.f10780i.f28437a, v(null), this);
    }

    @Override // e4.a
    protected void D() {
        this.f10788q.stop();
        this.f10783l.release();
    }

    @Override // e4.t
    public u1 a() {
        return this.f10790s;
    }

    @Override // e4.t
    public q d(t.b bVar, b bVar2, long j10) {
        a0.a v10 = v(bVar);
        return new j4.k(this.f10779h, this.f10788q, this.f10781j, this.f10792u, this.f10783l, t(bVar), this.f10784m, v10, bVar2, this.f10782k, this.f10785n, this.f10786o, this.f10787p, z());
    }

    @Override // k4.l.e
    public void f(k4.g gVar) {
        h0 F;
        long Z0 = gVar.f27178p ? p0.Z0(gVar.f27170h) : -9223372036854775807L;
        int i10 = gVar.f27166d;
        long j10 = (i10 == 2 || i10 == 1) ? Z0 : -9223372036854775807L;
        com.google.android.exoplayer2.source.hls.a aVar = new com.google.android.exoplayer2.source.hls.a((k4.h) a5.a.e(this.f10788q.e()), gVar);
        if (this.f10788q.j()) {
            F = E(gVar, j10, Z0, aVar);
        } else {
            F = F(gVar, j10, Z0, aVar);
        }
        C(F);
    }

    @Override // e4.t
    public void g(q qVar) {
        ((j4.k) qVar).B();
    }

    @Override // e4.t
    public void k() throws IOException {
        this.f10788q.l();
    }

    private HlsMediaSource(u1 u1Var, j4.g gVar, h hVar, e4.g gVar2, com.google.android.exoplayer2.drm.l lVar, i0 i0Var, k4.l lVar2, long j10, boolean z10, int i10, boolean z11) {
        this.f10780i = (u1.h) a5.a.e(u1Var.f28373b);
        this.f10790s = u1Var;
        this.f10791t = u1Var.f28375d;
        this.f10781j = gVar;
        this.f10779h = hVar;
        this.f10782k = gVar2;
        this.f10783l = lVar;
        this.f10784m = i0Var;
        this.f10788q = lVar2;
        this.f10789r = j10;
        this.f10785n = z10;
        this.f10786o = i10;
        this.f10787p = z11;
    }
}
