package j4;

import a5.n0;
import a5.p0;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import e4.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.g;
import n3.d3;
import n3.m1;
import o3.q1;
import y5.t;
import z4.p;
import z4.s0;
/* compiled from: HlsChunkSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private final h f26949a;

    /* renamed from: b  reason: collision with root package name */
    private final z4.l f26950b;

    /* renamed from: c  reason: collision with root package name */
    private final z4.l f26951c;

    /* renamed from: d  reason: collision with root package name */
    private final r f26952d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri[] f26953e;

    /* renamed from: f  reason: collision with root package name */
    private final m1[] f26954f;

    /* renamed from: g  reason: collision with root package name */
    private final k4.l f26955g;

    /* renamed from: h  reason: collision with root package name */
    private final k0 f26956h;

    /* renamed from: i  reason: collision with root package name */
    private final List<m1> f26957i;

    /* renamed from: k  reason: collision with root package name */
    private final q1 f26959k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f26960l;

    /* renamed from: n  reason: collision with root package name */
    private IOException f26962n;

    /* renamed from: o  reason: collision with root package name */
    private Uri f26963o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f26964p;

    /* renamed from: q  reason: collision with root package name */
    private x4.s f26965q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f26967s;

    /* renamed from: j  reason: collision with root package name */
    private final j4.e f26958j = new j4.e(4);

    /* renamed from: m  reason: collision with root package name */
    private byte[] f26961m = p0.f487f;

    /* renamed from: r  reason: collision with root package name */
    private long f26966r = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HlsChunkSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends g4.l {

        /* renamed from: l  reason: collision with root package name */
        private byte[] f26968l;

        public a(z4.l lVar, z4.p pVar, m1 m1Var, int i10, Object obj, byte[] bArr) {
            super(lVar, pVar, 3, m1Var, i10, obj, bArr);
        }

        @Override // g4.l
        protected void g(byte[] bArr, int i10) {
            this.f26968l = Arrays.copyOf(bArr, i10);
        }

        public byte[] j() {
            return this.f26968l;
        }
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public g4.f f26969a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f26970b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f26971c;

        public b() {
            a();
        }

        public void a() {
            this.f26969a = null;
            this.f26970b = false;
            this.f26971c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HlsChunkSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c extends g4.b {

        /* renamed from: e  reason: collision with root package name */
        private final List<g.e> f26972e;

        /* renamed from: f  reason: collision with root package name */
        private final long f26973f;

        /* renamed from: g  reason: collision with root package name */
        private final String f26974g;

        public c(String str, long j10, List<g.e> list) {
            super(0L, list.size() - 1);
            this.f26974g = str;
            this.f26973f = j10;
            this.f26972e = list;
        }

        @Override // g4.o
        public long a() {
            c();
            return this.f26973f + this.f26972e.get((int) d()).f27196e;
        }

        @Override // g4.o
        public long b() {
            c();
            g.e eVar = this.f26972e.get((int) d());
            return this.f26973f + eVar.f27196e + eVar.f27194c;
        }
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class d extends x4.c {

        /* renamed from: h  reason: collision with root package name */
        private int f26975h;

        public d(k0 k0Var, int[] iArr) {
            super(k0Var, iArr);
            this.f26975h = b(k0Var.b(iArr[0]));
        }

        @Override // x4.s
        public int a() {
            return this.f26975h;
        }

        @Override // x4.s
        public Object j() {
            return null;
        }

        @Override // x4.s
        public void m(long j10, long j11, long j12, List<? extends g4.n> list, g4.o[] oVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (d(this.f26975h, elapsedRealtime)) {
                for (int i10 = this.f32583b - 1; i10 >= 0; i10--) {
                    if (!d(i10, elapsedRealtime)) {
                        this.f26975h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // x4.s
        public int t() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HlsChunkSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final g.e f26976a;

        /* renamed from: b  reason: collision with root package name */
        public final long f26977b;

        /* renamed from: c  reason: collision with root package name */
        public final int f26978c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f26979d;

        public e(g.e eVar, long j10, int i10) {
            this.f26976a = eVar;
            this.f26977b = j10;
            this.f26978c = i10;
            this.f26979d = (eVar instanceof g.b) && ((g.b) eVar).f27186m;
        }
    }

    public f(h hVar, k4.l lVar, Uri[] uriArr, m1[] m1VarArr, g gVar, s0 s0Var, r rVar, List<m1> list, q1 q1Var) {
        this.f26949a = hVar;
        this.f26955g = lVar;
        this.f26953e = uriArr;
        this.f26954f = m1VarArr;
        this.f26952d = rVar;
        this.f26957i = list;
        this.f26959k = q1Var;
        z4.l a10 = gVar.a(1);
        this.f26950b = a10;
        if (s0Var != null) {
            a10.i(s0Var);
        }
        this.f26951c = gVar.a(3);
        this.f26956h = new k0(m1VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((m1VarArr[i10].f28178e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f26965q = new d(this.f26956h, a6.b.k(arrayList));
    }

    private static Uri d(k4.g gVar, g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f27198g) == null) {
            return null;
        }
        return n0.e(gVar.f27229a, str);
    }

    private Pair<Long, Integer> f(i iVar, boolean z10, k4.g gVar, long j10, long j11) {
        List<g.b> list;
        long j12;
        if (iVar != null && !z10) {
            if (iVar.h()) {
                if (iVar.f26985o == -1) {
                    j12 = iVar.g();
                } else {
                    j12 = iVar.f25786j;
                }
                Long valueOf = Long.valueOf(j12);
                int i10 = iVar.f26985o;
                return new Pair<>(valueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
            return new Pair<>(Long.valueOf(iVar.f25786j), Integer.valueOf(iVar.f26985o));
        }
        long j13 = gVar.f27183u + j10;
        if (iVar != null && !this.f26964p) {
            j11 = iVar.f25741g;
        }
        if (!gVar.f27177o && j11 >= j13) {
            return new Pair<>(Long.valueOf(gVar.f27173k + gVar.f27180r.size()), -1);
        }
        long j14 = j11 - j10;
        int i11 = 0;
        int g10 = p0.g(gVar.f27180r, Long.valueOf(j14), true, !this.f26955g.j() || iVar == null);
        long j15 = g10 + gVar.f27173k;
        if (g10 >= 0) {
            g.d dVar = gVar.f27180r.get(g10);
            if (j14 < dVar.f27196e + dVar.f27194c) {
                list = dVar.f27191m;
            } else {
                list = gVar.f27181s;
            }
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                g.b bVar = list.get(i11);
                if (j14 >= bVar.f27196e + bVar.f27194c) {
                    i11++;
                } else if (bVar.f27185l) {
                    j15 += list == gVar.f27181s ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair<>(Long.valueOf(j15), Integer.valueOf(r1));
    }

    private static e g(k4.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f27173k);
        if (i11 == gVar.f27180r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < gVar.f27181s.size()) {
                return new e(gVar.f27181s.get(i10), j10, i10);
            }
            return null;
        }
        g.d dVar = gVar.f27180r.get(i11);
        if (i10 == -1) {
            return new e(dVar, j10, -1);
        }
        if (i10 < dVar.f27191m.size()) {
            return new e(dVar.f27191m.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < gVar.f27180r.size()) {
            return new e(gVar.f27180r.get(i12), j10 + 1, -1);
        }
        if (gVar.f27181s.isEmpty()) {
            return null;
        }
        return new e(gVar.f27181s.get(0), j10 + 1, 0);
    }

    static List<g.e> i(k4.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f27173k);
        if (i11 >= 0 && gVar.f27180r.size() >= i11) {
            ArrayList arrayList = new ArrayList();
            if (i11 < gVar.f27180r.size()) {
                if (i10 != -1) {
                    g.d dVar = gVar.f27180r.get(i11);
                    if (i10 == 0) {
                        arrayList.add(dVar);
                    } else if (i10 < dVar.f27191m.size()) {
                        List<g.b> list = dVar.f27191m;
                        arrayList.addAll(list.subList(i10, list.size()));
                    }
                    i11++;
                }
                List<g.d> list2 = gVar.f27180r;
                arrayList.addAll(list2.subList(i11, list2.size()));
                i10 = 0;
            }
            if (gVar.f27176n != -9223372036854775807L) {
                int i12 = i10 != -1 ? i10 : 0;
                if (i12 < gVar.f27181s.size()) {
                    List<g.b> list3 = gVar.f27181s;
                    arrayList.addAll(list3.subList(i12, list3.size()));
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        return y5.q.p();
    }

    private g4.f l(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] c10 = this.f26958j.c(uri);
        if (c10 != null) {
            this.f26958j.b(uri, c10);
            return null;
        }
        return new a(this.f26951c, new p.b().i(uri).b(1).a(), this.f26954f[i10], this.f26965q.t(), this.f26965q.j(), this.f26961m);
    }

    private long s(long j10) {
        long j11 = this.f26966r;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void w(k4.g gVar) {
        this.f26966r = gVar.f27177o ? -9223372036854775807L : gVar.e() - this.f26955g.d();
    }

    public g4.o[] a(i iVar, long j10) {
        int i10;
        int c10 = iVar == null ? -1 : this.f26956h.c(iVar.f25738d);
        int length = this.f26965q.length();
        g4.o[] oVarArr = new g4.o[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int g10 = this.f26965q.g(i11);
            Uri uri = this.f26953e[g10];
            if (!this.f26955g.h(uri)) {
                oVarArr[i11] = g4.o.f25787a;
                i10 = i11;
            } else {
                k4.g n10 = this.f26955g.n(uri, z10);
                a5.a.e(n10);
                long d10 = n10.f27170h - this.f26955g.d();
                i10 = i11;
                Pair<Long, Integer> f10 = f(iVar, g10 != c10 ? true : z10, n10, d10, j10);
                oVarArr[i10] = new c(n10.f27229a, d10, i(n10, ((Long) f10.first).longValue(), ((Integer) f10.second).intValue()));
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return oVarArr;
    }

    public long b(long j10, d3 d3Var) {
        int a10 = this.f26965q.a();
        Uri[] uriArr = this.f26953e;
        k4.g n10 = (a10 >= uriArr.length || a10 == -1) ? null : this.f26955g.n(uriArr[this.f26965q.r()], true);
        if (n10 == null || n10.f27180r.isEmpty() || !n10.f27231c) {
            return j10;
        }
        long d10 = n10.f27170h - this.f26955g.d();
        long j11 = j10 - d10;
        int g10 = p0.g(n10.f27180r, Long.valueOf(j11), true, true);
        long j12 = n10.f27180r.get(g10).f27196e;
        return d3Var.a(j11, j12, g10 != n10.f27180r.size() - 1 ? n10.f27180r.get(g10 + 1).f27196e : j12) + d10;
    }

    public int c(i iVar) {
        List<g.b> list;
        if (iVar.f26985o == -1) {
            return 1;
        }
        k4.g gVar = (k4.g) a5.a.e(this.f26955g.n(this.f26953e[this.f26956h.c(iVar.f25738d)], false));
        int i10 = (int) (iVar.f25786j - gVar.f27173k);
        if (i10 < 0) {
            return 1;
        }
        if (i10 < gVar.f27180r.size()) {
            list = gVar.f27180r.get(i10).f27191m;
        } else {
            list = gVar.f27181s;
        }
        if (iVar.f26985o >= list.size()) {
            return 2;
        }
        g.b bVar = list.get(iVar.f26985o);
        if (bVar.f27186m) {
            return 0;
        }
        return p0.c(Uri.parse(n0.d(gVar.f27229a, bVar.f27192a)), iVar.f25736b.f33569a) ? 1 : 2;
    }

    public void e(long j10, long j11, List<i> list, boolean z10, b bVar) {
        k4.g gVar;
        long j12;
        Uri uri;
        int i10;
        i iVar = list.isEmpty() ? null : (i) t.c(list);
        int c10 = iVar == null ? -1 : this.f26956h.c(iVar.f25738d);
        long j13 = j11 - j10;
        long s10 = s(j10);
        if (iVar != null && !this.f26964p) {
            long d10 = iVar.d();
            j13 = Math.max(0L, j13 - d10);
            if (s10 != -9223372036854775807L) {
                s10 = Math.max(0L, s10 - d10);
            }
        }
        this.f26965q.m(j10, j13, s10, list, a(iVar, j11));
        int r10 = this.f26965q.r();
        boolean z11 = c10 != r10;
        Uri uri2 = this.f26953e[r10];
        if (!this.f26955g.h(uri2)) {
            bVar.f26971c = uri2;
            this.f26967s &= uri2.equals(this.f26963o);
            this.f26963o = uri2;
            return;
        }
        k4.g n10 = this.f26955g.n(uri2, true);
        a5.a.e(n10);
        this.f26964p = n10.f27231c;
        w(n10);
        long d11 = n10.f27170h - this.f26955g.d();
        Pair<Long, Integer> f10 = f(iVar, z11, n10, d11, j11);
        long longValue = ((Long) f10.first).longValue();
        int intValue = ((Integer) f10.second).intValue();
        if (longValue >= n10.f27173k || iVar == null || !z11) {
            gVar = n10;
            j12 = d11;
            uri = uri2;
            i10 = r10;
        } else {
            Uri uri3 = this.f26953e[c10];
            k4.g n11 = this.f26955g.n(uri3, true);
            a5.a.e(n11);
            j12 = n11.f27170h - this.f26955g.d();
            Pair<Long, Integer> f11 = f(iVar, false, n11, j12, j11);
            longValue = ((Long) f11.first).longValue();
            intValue = ((Integer) f11.second).intValue();
            i10 = c10;
            uri = uri3;
            gVar = n11;
        }
        if (longValue < gVar.f27173k) {
            this.f26962n = new e4.b();
            return;
        }
        e g10 = g(gVar, longValue, intValue);
        if (g10 == null) {
            if (!gVar.f27177o) {
                bVar.f26971c = uri;
                this.f26967s &= uri.equals(this.f26963o);
                this.f26963o = uri;
                return;
            } else if (!z10 && !gVar.f27180r.isEmpty()) {
                g10 = new e((g.e) t.c(gVar.f27180r), (gVar.f27173k + gVar.f27180r.size()) - 1, -1);
            } else {
                bVar.f26970b = true;
                return;
            }
        }
        this.f26967s = false;
        this.f26963o = null;
        Uri d12 = d(gVar, g10.f26976a.f27193b);
        g4.f l10 = l(d12, i10);
        bVar.f26969a = l10;
        if (l10 != null) {
            return;
        }
        Uri d13 = d(gVar, g10.f26976a);
        g4.f l11 = l(d13, i10);
        bVar.f26969a = l11;
        if (l11 != null) {
            return;
        }
        boolean w10 = i.w(iVar, uri, gVar, g10, j12);
        if (w10 && g10.f26979d) {
            return;
        }
        bVar.f26969a = i.j(this.f26949a, this.f26950b, this.f26954f[i10], j12, gVar, g10, uri, this.f26957i, this.f26965q.t(), this.f26965q.j(), this.f26960l, this.f26952d, iVar, this.f26958j.a(d13), this.f26958j.a(d12), w10, this.f26959k);
    }

    public int h(long j10, List<? extends g4.n> list) {
        if (this.f26962n == null && this.f26965q.length() >= 2) {
            return this.f26965q.q(j10, list);
        }
        return list.size();
    }

    public k0 j() {
        return this.f26956h;
    }

    public x4.s k() {
        return this.f26965q;
    }

    public boolean m(g4.f fVar, long j10) {
        x4.s sVar = this.f26965q;
        return sVar.c(sVar.l(this.f26956h.c(fVar.f25738d)), j10);
    }

    public void n() throws IOException {
        IOException iOException = this.f26962n;
        if (iOException == null) {
            Uri uri = this.f26963o;
            if (uri == null || !this.f26967s) {
                return;
            }
            this.f26955g.a(uri);
            return;
        }
        throw iOException;
    }

    public boolean o(Uri uri) {
        return p0.s(this.f26953e, uri);
    }

    public void p(g4.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f26961m = aVar.h();
            this.f26958j.b(aVar.f25736b.f33569a, (byte[]) a5.a.e(aVar.j()));
        }
    }

    public boolean q(Uri uri, long j10) {
        int l10;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f26953e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            } else if (uriArr[i10].equals(uri)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1 || (l10 = this.f26965q.l(i10)) == -1) {
            return true;
        }
        this.f26967s |= uri.equals(this.f26963o);
        return j10 == -9223372036854775807L || (this.f26965q.c(l10, j10) && this.f26955g.k(uri, j10));
    }

    public void r() {
        this.f26962n = null;
    }

    public void t(boolean z10) {
        this.f26960l = z10;
    }

    public void u(x4.s sVar) {
        this.f26965q = sVar;
    }

    public boolean v(long j10, g4.f fVar, List<? extends g4.n> list) {
        if (this.f26962n != null) {
            return false;
        }
        return this.f26965q.h(j10, fVar, list);
    }
}
