package k4;

import a5.p0;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Api;
import e4.a0;
import e4.p;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.c;
import k4.g;
import k4.h;
import k4.j;
import k4.l;
import n3.h2;
import y5.t;
import z4.e0;
import z4.i0;
import z4.j0;
import z4.m0;
/* compiled from: DefaultHlsPlaylistTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements l, j0.b<m0<i>> {

    /* renamed from: p  reason: collision with root package name */
    public static final l.a f27134p = new l.a() { // from class: k4.b
        @Override // k4.l.a
        public final l a(j4.g gVar, i0 i0Var, k kVar) {
            return new c(gVar, i0Var, kVar);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final j4.g f27135a;

    /* renamed from: b  reason: collision with root package name */
    private final k f27136b;

    /* renamed from: c  reason: collision with root package name */
    private final i0 f27137c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<Uri, C0306c> f27138d;

    /* renamed from: e  reason: collision with root package name */
    private final CopyOnWriteArrayList<l.b> f27139e;

    /* renamed from: f  reason: collision with root package name */
    private final double f27140f;

    /* renamed from: g  reason: collision with root package name */
    private a0.a f27141g;

    /* renamed from: h  reason: collision with root package name */
    private j0 f27142h;

    /* renamed from: i  reason: collision with root package name */
    private Handler f27143i;

    /* renamed from: j  reason: collision with root package name */
    private l.e f27144j;

    /* renamed from: k  reason: collision with root package name */
    private h f27145k;

    /* renamed from: l  reason: collision with root package name */
    private Uri f27146l;

    /* renamed from: m  reason: collision with root package name */
    private g f27147m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f27148n;

    /* renamed from: o  reason: collision with root package name */
    private long f27149o;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultHlsPlaylistTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements l.b {
        private b() {
        }

        @Override // k4.l.b
        public void a() {
            c.this.f27139e.remove(this);
        }

        @Override // k4.l.b
        public boolean f(Uri uri, i0.c cVar, boolean z10) {
            C0306c c0306c;
            if (c.this.f27147m == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<h.b> list = ((h) p0.j(c.this.f27145k)).f27210e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0306c c0306c2 = (C0306c) c.this.f27138d.get(list.get(i11).f27223a);
                    if (c0306c2 != null && elapsedRealtime < c0306c2.f27158h) {
                        i10++;
                    }
                }
                i0.b d10 = c.this.f27137c.d(new i0.a(1, 0, c.this.f27145k.f27210e.size(), i10), cVar);
                if (d10 != null && d10.f33511a == 2 && (c0306c = (C0306c) c.this.f27138d.get(uri)) != null) {
                    c0306c.h(d10.f33512b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultHlsPlaylistTracker.java */
    /* renamed from: k4.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class C0306c implements j0.b<m0<i>> {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f27151a;

        /* renamed from: b  reason: collision with root package name */
        private final j0 f27152b = new j0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c  reason: collision with root package name */
        private final z4.l f27153c;

        /* renamed from: d  reason: collision with root package name */
        private g f27154d;

        /* renamed from: e  reason: collision with root package name */
        private long f27155e;

        /* renamed from: f  reason: collision with root package name */
        private long f27156f;

        /* renamed from: g  reason: collision with root package name */
        private long f27157g;

        /* renamed from: h  reason: collision with root package name */
        private long f27158h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f27159i;

        /* renamed from: j  reason: collision with root package name */
        private IOException f27160j;

        public C0306c(Uri uri) {
            this.f27151a = uri;
            this.f27153c = c.this.f27135a.a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(long j10) {
            this.f27158h = SystemClock.elapsedRealtime() + j10;
            return this.f27151a.equals(c.this.f27146l) && !c.this.L();
        }

        private Uri j() {
            g gVar = this.f27154d;
            if (gVar != null) {
                g.f fVar = gVar.f27184v;
                if (fVar.f27203a != -9223372036854775807L || fVar.f27207e) {
                    Uri.Builder buildUpon = this.f27151a.buildUpon();
                    g gVar2 = this.f27154d;
                    if (gVar2.f27184v.f27207e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f27173k + gVar2.f27180r.size()));
                        g gVar3 = this.f27154d;
                        if (gVar3.f27176n != -9223372036854775807L) {
                            List<g.b> list = gVar3.f27181s;
                            int size = list.size();
                            if (!list.isEmpty() && ((g.b) t.c(list)).f27186m) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    g.f fVar2 = this.f27154d.f27184v;
                    if (fVar2.f27203a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f27204b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f27151a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(Uri uri) {
            this.f27159i = false;
            p(uri);
        }

        private void p(Uri uri) {
            m0 m0Var = new m0(this.f27153c, uri, 4, c.this.f27136b.b(c.this.f27145k, this.f27154d));
            c.this.f27141g.z(new e4.l(m0Var.f33549a, m0Var.f33550b, this.f27152b.n(m0Var, this, c.this.f27137c.a(m0Var.f33551c))), m0Var.f33551c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(final Uri uri) {
            this.f27158h = 0L;
            if (this.f27159i || this.f27152b.j() || this.f27152b.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < this.f27157g) {
                this.f27159i = true;
                c.this.f27143i.postDelayed(new Runnable() { // from class: k4.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.C0306c.this.n(uri);
                    }
                }, this.f27157g - elapsedRealtime);
                return;
            }
            p(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(g gVar, e4.l lVar) {
            IOException dVar;
            boolean z10;
            g gVar2 = this.f27154d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f27155e = elapsedRealtime;
            g G = c.this.G(gVar2, gVar);
            this.f27154d = G;
            boolean z11 = false;
            if (G != gVar2) {
                this.f27160j = null;
                this.f27156f = elapsedRealtime;
                c.this.R(this.f27151a, G);
            } else if (!G.f27177o) {
                g gVar3 = this.f27154d;
                if (gVar.f27173k + gVar.f27180r.size() < gVar3.f27173k) {
                    dVar = new l.c(this.f27151a);
                    z10 = true;
                } else {
                    dVar = ((double) (elapsedRealtime - this.f27156f)) > ((double) p0.Z0(gVar3.f27175m)) * c.this.f27140f ? new l.d(this.f27151a) : null;
                    z10 = false;
                }
                if (dVar != null) {
                    this.f27160j = dVar;
                    c.this.N(this.f27151a, new i0.c(lVar, new p(4), dVar, 1), z10);
                }
            }
            long j10 = 0;
            g gVar4 = this.f27154d;
            if (!gVar4.f27184v.f27207e) {
                if (gVar4 != gVar2) {
                    j10 = gVar4.f27175m;
                } else {
                    j10 = gVar4.f27175m / 2;
                }
            }
            this.f27157g = elapsedRealtime + p0.Z0(j10);
            if (this.f27154d.f27176n != -9223372036854775807L || this.f27151a.equals(c.this.f27146l)) {
                z11 = true;
            }
            if (!z11 || this.f27154d.f27177o) {
                return;
            }
            q(j());
        }

        public g k() {
            return this.f27154d;
        }

        public boolean l() {
            int i10;
            if (this.f27154d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, p0.Z0(this.f27154d.f27183u));
            g gVar = this.f27154d;
            return gVar.f27177o || (i10 = gVar.f27166d) == 2 || i10 == 1 || this.f27155e + max > elapsedRealtime;
        }

        public void o() {
            q(this.f27151a);
        }

        public void r() throws IOException {
            this.f27152b.a();
            IOException iOException = this.f27160j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // z4.j0.b
        /* renamed from: t */
        public void m(m0<i> m0Var, long j10, long j11, boolean z10) {
            e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
            c.this.f27137c.c(m0Var.f33549a);
            c.this.f27141g.q(lVar, 4);
        }

        @Override // z4.j0.b
        /* renamed from: u */
        public void i(m0<i> m0Var, long j10, long j11) {
            i e8 = m0Var.e();
            e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
            if (e8 instanceof g) {
                w((g) e8, lVar);
                c.this.f27141g.t(lVar, 4);
            } else {
                this.f27160j = h2.c("Loaded playlist has unexpected type.", null);
                c.this.f27141g.x(lVar, 4, this.f27160j, true);
            }
            c.this.f27137c.c(m0Var.f33549a);
        }

        @Override // z4.j0.b
        /* renamed from: v */
        public j0.c s(m0<i> m0Var, long j10, long j11, IOException iOException, int i10) {
            j0.c cVar;
            e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
            boolean z10 = iOException instanceof j.a;
            if ((m0Var.f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (iOException instanceof e0) {
                    i11 = ((e0) iOException).f33485d;
                }
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f27157g = SystemClock.elapsedRealtime();
                    o();
                    ((a0.a) p0.j(c.this.f27141g)).x(lVar, m0Var.f33551c, iOException, true);
                    return j0.f33523f;
                }
            }
            i0.c cVar2 = new i0.c(lVar, new p(m0Var.f33551c), iOException, i10);
            if (c.this.N(this.f27151a, cVar2, false)) {
                long b10 = c.this.f27137c.b(cVar2);
                if (b10 != -9223372036854775807L) {
                    cVar = j0.h(false, b10);
                } else {
                    cVar = j0.f33524g;
                }
            } else {
                cVar = j0.f33523f;
            }
            boolean c10 = true ^ cVar.c();
            c.this.f27141g.x(lVar, m0Var.f33551c, iOException, c10);
            if (c10) {
                c.this.f27137c.c(m0Var.f33549a);
            }
            return cVar;
        }

        public void x() {
            this.f27152b.l();
        }
    }

    public c(j4.g gVar, i0 i0Var, k kVar) {
        this(gVar, i0Var, kVar, 3.5d);
    }

    private void E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f27138d.put(uri, new C0306c(uri));
        }
    }

    private static g.d F(g gVar, g gVar2) {
        int i10 = (int) (gVar2.f27173k - gVar.f27173k);
        List<g.d> list = gVar.f27180r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g G(g gVar, g gVar2) {
        if (gVar2.f(gVar)) {
            return gVar2.c(I(gVar, gVar2), H(gVar, gVar2));
        }
        return gVar2.f27177o ? gVar.d() : gVar;
    }

    private int H(g gVar, g gVar2) {
        g.d F;
        if (gVar2.f27171i) {
            return gVar2.f27172j;
        }
        g gVar3 = this.f27147m;
        int i10 = gVar3 != null ? gVar3.f27172j : 0;
        return (gVar == null || (F = F(gVar, gVar2)) == null) ? i10 : (gVar.f27172j + F.f27195d) - gVar2.f27180r.get(0).f27195d;
    }

    private long I(g gVar, g gVar2) {
        if (gVar2.f27178p) {
            return gVar2.f27170h;
        }
        g gVar3 = this.f27147m;
        long j10 = gVar3 != null ? gVar3.f27170h : 0L;
        if (gVar == null) {
            return j10;
        }
        int size = gVar.f27180r.size();
        g.d F = F(gVar, gVar2);
        if (F != null) {
            return gVar.f27170h + F.f27196e;
        }
        return ((long) size) == gVar2.f27173k - gVar.f27173k ? gVar.e() : j10;
    }

    private Uri J(Uri uri) {
        g.c cVar;
        g gVar = this.f27147m;
        if (gVar == null || !gVar.f27184v.f27207e || (cVar = gVar.f27182t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f27188b));
        int i10 = cVar.f27189c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    private boolean K(Uri uri) {
        List<h.b> list = this.f27145k.f27210e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f27223a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        List<h.b> list = this.f27145k.f27210e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0306c c0306c = (C0306c) a5.a.e(this.f27138d.get(list.get(i10).f27223a));
            if (elapsedRealtime > c0306c.f27158h) {
                Uri uri = c0306c.f27151a;
                this.f27146l = uri;
                c0306c.q(J(uri));
                return true;
            }
        }
        return false;
    }

    private void M(Uri uri) {
        if (uri.equals(this.f27146l) || !K(uri)) {
            return;
        }
        g gVar = this.f27147m;
        if (gVar == null || !gVar.f27177o) {
            this.f27146l = uri;
            C0306c c0306c = this.f27138d.get(uri);
            g gVar2 = c0306c.f27154d;
            if (gVar2 == null || !gVar2.f27177o) {
                c0306c.q(J(uri));
                return;
            }
            this.f27147m = gVar2;
            this.f27144j.f(gVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N(Uri uri, i0.c cVar, boolean z10) {
        Iterator<l.b> it = this.f27139e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().f(uri, cVar, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(Uri uri, g gVar) {
        if (uri.equals(this.f27146l)) {
            if (this.f27147m == null) {
                this.f27148n = !gVar.f27177o;
                this.f27149o = gVar.f27170h;
            }
            this.f27147m = gVar;
            this.f27144j.f(gVar);
        }
        Iterator<l.b> it = this.f27139e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // z4.j0.b
    /* renamed from: O */
    public void m(m0<i> m0Var, long j10, long j11, boolean z10) {
        e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
        this.f27137c.c(m0Var.f33549a);
        this.f27141g.q(lVar, 4);
    }

    @Override // z4.j0.b
    /* renamed from: P */
    public void i(m0<i> m0Var, long j10, long j11) {
        h hVar;
        i e8 = m0Var.e();
        boolean z10 = e8 instanceof g;
        if (z10) {
            hVar = h.e(e8.f27229a);
        } else {
            hVar = (h) e8;
        }
        this.f27145k = hVar;
        this.f27146l = hVar.f27210e.get(0).f27223a;
        this.f27139e.add(new b());
        E(hVar.f27209d);
        e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
        C0306c c0306c = this.f27138d.get(this.f27146l);
        if (z10) {
            c0306c.w((g) e8, lVar);
        } else {
            c0306c.o();
        }
        this.f27137c.c(m0Var.f33549a);
        this.f27141g.t(lVar, 4);
    }

    @Override // z4.j0.b
    /* renamed from: Q */
    public j0.c s(m0<i> m0Var, long j10, long j11, IOException iOException, int i10) {
        e4.l lVar = new e4.l(m0Var.f33549a, m0Var.f33550b, m0Var.f(), m0Var.d(), j10, j11, m0Var.c());
        long b10 = this.f27137c.b(new i0.c(lVar, new p(m0Var.f33551c), iOException, i10));
        boolean z10 = b10 == -9223372036854775807L;
        this.f27141g.x(lVar, m0Var.f33551c, iOException, z10);
        if (z10) {
            this.f27137c.c(m0Var.f33549a);
        }
        if (z10) {
            return j0.f33524g;
        }
        return j0.h(false, b10);
    }

    @Override // k4.l
    public void a(Uri uri) throws IOException {
        this.f27138d.get(uri).r();
    }

    @Override // k4.l
    public void b(l.b bVar) {
        this.f27139e.remove(bVar);
    }

    @Override // k4.l
    public void c(l.b bVar) {
        a5.a.e(bVar);
        this.f27139e.add(bVar);
    }

    @Override // k4.l
    public long d() {
        return this.f27149o;
    }

    @Override // k4.l
    public h e() {
        return this.f27145k;
    }

    @Override // k4.l
    public void f(Uri uri) {
        this.f27138d.get(uri).o();
    }

    @Override // k4.l
    public void g(Uri uri, a0.a aVar, l.e eVar) {
        this.f27143i = p0.v();
        this.f27141g = aVar;
        this.f27144j = eVar;
        m0 m0Var = new m0(this.f27135a.a(4), uri, 4, this.f27136b.a());
        a5.a.f(this.f27142h == null);
        j0 j0Var = new j0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f27142h = j0Var;
        aVar.z(new e4.l(m0Var.f33549a, m0Var.f33550b, j0Var.n(m0Var, this, this.f27137c.a(m0Var.f33551c))), m0Var.f33551c);
    }

    @Override // k4.l
    public boolean h(Uri uri) {
        return this.f27138d.get(uri).l();
    }

    @Override // k4.l
    public boolean j() {
        return this.f27148n;
    }

    @Override // k4.l
    public boolean k(Uri uri, long j10) {
        C0306c c0306c = this.f27138d.get(uri);
        if (c0306c != null) {
            return !c0306c.h(j10);
        }
        return false;
    }

    @Override // k4.l
    public void l() throws IOException {
        j0 j0Var = this.f27142h;
        if (j0Var != null) {
            j0Var.a();
        }
        Uri uri = this.f27146l;
        if (uri != null) {
            a(uri);
        }
    }

    @Override // k4.l
    public g n(Uri uri, boolean z10) {
        g k10 = this.f27138d.get(uri).k();
        if (k10 != null && z10) {
            M(uri);
        }
        return k10;
    }

    @Override // k4.l
    public void stop() {
        this.f27146l = null;
        this.f27147m = null;
        this.f27145k = null;
        this.f27149o = -9223372036854775807L;
        this.f27142h.l();
        this.f27142h = null;
        for (C0306c c0306c : this.f27138d.values()) {
            c0306c.x();
        }
        this.f27143i.removeCallbacksAndMessages(null);
        this.f27143i = null;
        this.f27138d.clear();
    }

    public c(j4.g gVar, i0 i0Var, k kVar, double d10) {
        this.f27135a = gVar;
        this.f27136b = kVar;
        this.f27137c = i0Var;
        this.f27140f = d10;
        this.f27139e = new CopyOnWriteArrayList<>();
        this.f27138d = new HashMap<>();
        this.f27149o = -9223372036854775807L;
    }
}
