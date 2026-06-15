package com.google.android.exoplayer2.source.smoothstreaming;

import a5.p0;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.unity3d.services.core.di.ServiceProvider;
import e4.a0;
import e4.g;
import e4.h;
import e4.h0;
import e4.p;
import e4.q;
import e4.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m4.a;
import n3.j1;
import n3.u1;
import r3.o;
import z4.i0;
import z4.j0;
import z4.k0;
import z4.l;
import z4.m0;
import z4.s0;
import z4.y;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SsMediaSource extends e4.a implements j0.b<m0<m4.a>> {
    private Handler A;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f10816h;

    /* renamed from: i  reason: collision with root package name */
    private final Uri f10817i;

    /* renamed from: j  reason: collision with root package name */
    private final u1.h f10818j;

    /* renamed from: k  reason: collision with root package name */
    private final u1 f10819k;

    /* renamed from: l  reason: collision with root package name */
    private final l.a f10820l;

    /* renamed from: m  reason: collision with root package name */
    private final b.a f10821m;

    /* renamed from: n  reason: collision with root package name */
    private final g f10822n;

    /* renamed from: o  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.l f10823o;

    /* renamed from: p  reason: collision with root package name */
    private final i0 f10824p;

    /* renamed from: q  reason: collision with root package name */
    private final long f10825q;

    /* renamed from: r  reason: collision with root package name */
    private final a0.a f10826r;

    /* renamed from: s  reason: collision with root package name */
    private final m0.a<? extends m4.a> f10827s;

    /* renamed from: t  reason: collision with root package name */
    private final ArrayList<c> f10828t;

    /* renamed from: u  reason: collision with root package name */
    private l f10829u;

    /* renamed from: v  reason: collision with root package name */
    private j0 f10830v;

    /* renamed from: w  reason: collision with root package name */
    private k0 f10831w;

    /* renamed from: x  reason: collision with root package name */
    private s0 f10832x;

    /* renamed from: y  reason: collision with root package name */
    private long f10833y;

    /* renamed from: z  reason: collision with root package name */
    private m4.a f10834z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Factory implements t.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.a f10835a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f10836b;

        /* renamed from: c  reason: collision with root package name */
        private g f10837c;

        /* renamed from: d  reason: collision with root package name */
        private o f10838d;

        /* renamed from: e  reason: collision with root package name */
        private i0 f10839e;

        /* renamed from: f  reason: collision with root package name */
        private long f10840f;

        /* renamed from: g  reason: collision with root package name */
        private m0.a<? extends m4.a> f10841g;

        public Factory(l.a aVar) {
            this(new a.C0175a(aVar), aVar);
        }

        public SsMediaSource a(u1 u1Var) {
            a5.a.e(u1Var.f28373b);
            m0.a aVar = this.f10841g;
            if (aVar == null) {
                aVar = new m4.b();
            }
            List<StreamKey> list = u1Var.f28373b.f28441e;
            return new SsMediaSource(u1Var, null, this.f10836b, !list.isEmpty() ? new d4.b(aVar, list) : aVar, this.f10835a, this.f10837c, this.f10838d.a(u1Var), this.f10839e, this.f10840f);
        }

        public Factory(b.a aVar, l.a aVar2) {
            this.f10835a = (b.a) a5.a.e(aVar);
            this.f10836b = aVar2;
            this.f10838d = new i();
            this.f10839e = new y();
            this.f10840f = 30000L;
            this.f10837c = new h();
        }
    }

    static {
        j1.a("goog.exo.smoothstreaming");
    }

    private void I() {
        a.b[] bVarArr;
        h0 h0Var;
        for (int i10 = 0; i10 < this.f10828t.size(); i10++) {
            this.f10828t.get(i10).v(this.f10834z);
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (a.b bVar : this.f10834z.f27697f) {
            if (bVar.f27713k > 0) {
                j11 = Math.min(j11, bVar.e(0));
                j10 = Math.max(j10, bVar.e(bVar.f27713k - 1) + bVar.c(bVar.f27713k - 1));
            }
        }
        if (j11 == Long.MAX_VALUE) {
            long j12 = this.f10834z.f27695d ? -9223372036854775807L : 0L;
            m4.a aVar = this.f10834z;
            boolean z10 = aVar.f27695d;
            h0Var = new h0(j12, 0L, 0L, 0L, true, z10, z10, aVar, this.f10819k);
        } else {
            m4.a aVar2 = this.f10834z;
            if (aVar2.f27695d) {
                long j13 = aVar2.f27699h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long C0 = j15 - p0.C0(this.f10825q);
                if (C0 < 5000000) {
                    C0 = Math.min(5000000L, j15 / 2);
                }
                h0Var = new h0(-9223372036854775807L, j15, j14, C0, true, true, true, this.f10834z, this.f10819k);
            } else {
                long j16 = aVar2.f27698g;
                long j17 = j16 != -9223372036854775807L ? j16 : j10 - j11;
                h0Var = new h0(j11 + j17, j17, j11, 0L, true, false, false, this.f10834z, this.f10819k);
            }
        }
        C(h0Var);
    }

    private void J() {
        if (this.f10834z.f27695d) {
            this.A.postDelayed(new Runnable() { // from class: l4.a
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.K();
                }
            }, Math.max(0L, (this.f10833y + ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        if (this.f10830v.i()) {
            return;
        }
        m0 m0Var = new m0(this.f10829u, this.f10817i, 4, this.f10827s);
        this.f10826r.z(new e4.l(m0Var.f33549a, m0Var.f33550b, this.f10830v.n(m0Var, this, this.f10824p.a(m0Var.f33551c))), m0Var.f33551c);
    }

    @Override // e4.a
    protected void B(s0 s0Var) {
        this.f10832x = s0Var;
        this.f10823o.a();
        this.f10823o.e(Looper.myLooper(), z());
        if (this.f10816h) {
            this.f10831w = new k0.a();
            I();
            return;
        }
        this.f10829u = this.f10820l.a();
        j0 j0Var = new j0("SsMediaSource");
        this.f10830v = j0Var;
        this.f10831w = j0Var;
        this.A = p0.v();
        K();
    }

    @Override // e4.a
    protected void D() {
        this.f10834z = this.f10816h ? this.f10834z : null;
        this.f10829u = null;
        this.f10833y = 0L;
        j0 j0Var = this.f10830v;
        if (j0Var != null) {
            j0Var.l();
            this.f10830v = null;
        }
        Handler handler = this.A;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.A = null;
        }
        this.f10823o.release();
    }

    @Override // z4.j0.b
    /* renamed from: F */
    public void m(m0<m4.a> m0Var, long j10, long j11, boolean z10) {
        e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
        this.f10824p.c(m0Var.f33549a);
        this.f10826r.q(lVar, m0Var.f33551c);
    }

    @Override // z4.j0.b
    /* renamed from: G */
    public void i(m0<m4.a> m0Var, long j10, long j11) {
        e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
        this.f10824p.c(m0Var.f33549a);
        this.f10826r.t(lVar, m0Var.f33551c);
        this.f10834z = m0Var.e();
        this.f10833y = j10 - j11;
        I();
        J();
    }

    @Override // z4.j0.b
    /* renamed from: H */
    public j0.c s(m0<m4.a> m0Var, long j10, long j11, IOException iOException, int i10) {
        j0.c h10;
        e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
        long b10 = this.f10824p.b(new i0.c(lVar, new p(m0Var.f33551c), iOException, i10));
        if (b10 == -9223372036854775807L) {
            h10 = j0.f33524g;
        } else {
            h10 = j0.h(false, b10);
        }
        boolean z10 = !h10.c();
        this.f10826r.x(lVar, m0Var.f33551c, iOException, z10);
        if (z10) {
            this.f10824p.c(m0Var.f33549a);
        }
        return h10;
    }

    @Override // e4.t
    public u1 a() {
        return this.f10819k;
    }

    @Override // e4.t
    public q d(t.b bVar, z4.b bVar2, long j10) {
        a0.a v10 = v(bVar);
        c cVar = new c(this.f10834z, this.f10821m, this.f10832x, this.f10822n, this.f10823o, t(bVar), this.f10824p, v10, this.f10831w, bVar2);
        this.f10828t.add(cVar);
        return cVar;
    }

    @Override // e4.t
    public void g(q qVar) {
        ((c) qVar).s();
        this.f10828t.remove(qVar);
    }

    @Override // e4.t
    public void k() throws IOException {
        this.f10831w.a();
    }

    private SsMediaSource(u1 u1Var, m4.a aVar, l.a aVar2, m0.a<? extends m4.a> aVar3, b.a aVar4, g gVar, com.google.android.exoplayer2.drm.l lVar, i0 i0Var, long j10) {
        a5.a.f(aVar == null || !aVar.f27695d);
        this.f10819k = u1Var;
        u1.h hVar = (u1.h) a5.a.e(u1Var.f28373b);
        this.f10818j = hVar;
        this.f10834z = aVar;
        this.f10817i = hVar.f28437a.equals(Uri.EMPTY) ? null : p0.A(hVar.f28437a);
        this.f10820l = aVar2;
        this.f10827s = aVar3;
        this.f10821m = aVar4;
        this.f10822n = gVar;
        this.f10823o = lVar;
        this.f10824p = i0Var;
        this.f10825q = j10;
        this.f10826r = v(null);
        this.f10816h = aVar != null;
        this.f10828t = new ArrayList<>();
    }
}
