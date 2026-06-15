package com.google.android.exoplayer2.source.dash;

import a5.p0;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import g4.g;
import g4.k;
import g4.m;
import g4.n;
import g4.o;
import g4.p;
import h4.f;
import h4.h;
import i4.i;
import i4.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import n3.d3;
import n3.m1;
import o3.q1;
import x4.s;
import z4.e0;
import z4.i0;
import z4.k0;
import z4.l;
import z4.s0;
/* compiled from: DefaultDashChunkSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f10729a;

    /* renamed from: b  reason: collision with root package name */
    private final h4.b f10730b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f10731c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10732d;

    /* renamed from: e  reason: collision with root package name */
    private final l f10733e;

    /* renamed from: f  reason: collision with root package name */
    private final long f10734f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10735g;

    /* renamed from: h  reason: collision with root package name */
    private final e.c f10736h;

    /* renamed from: i  reason: collision with root package name */
    protected final b[] f10737i;

    /* renamed from: j  reason: collision with root package name */
    private s f10738j;

    /* renamed from: k  reason: collision with root package name */
    private i4.c f10739k;

    /* renamed from: l  reason: collision with root package name */
    private int f10740l;

    /* renamed from: m  reason: collision with root package name */
    private IOException f10741m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10742n;

    /* compiled from: DefaultDashChunkSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements a.InterfaceC0173a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f10743a;

        /* renamed from: b  reason: collision with root package name */
        private final int f10744b;

        /* renamed from: c  reason: collision with root package name */
        private final g.a f10745c;

        public a(l.a aVar) {
            this(aVar, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0173a
        public com.google.android.exoplayer2.source.dash.a a(k0 k0Var, i4.c cVar, h4.b bVar, int i10, int[] iArr, s sVar, int i11, long j10, boolean z10, List<m1> list, e.c cVar2, s0 s0Var, q1 q1Var) {
            l a10 = this.f10743a.a();
            if (s0Var != null) {
                a10.i(s0Var);
            }
            return new c(this.f10745c, k0Var, cVar, bVar, i10, iArr, sVar, i11, a10, j10, this.f10744b, z10, list, cVar2, q1Var);
        }

        public a(l.a aVar, int i10) {
            this(g4.e.f25717j, aVar, i10);
        }

        public a(g.a aVar, l.a aVar2, int i10) {
            this.f10745c = aVar;
            this.f10743a = aVar2;
            this.f10744b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: DefaultDashChunkSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final g f10746a;

        /* renamed from: b  reason: collision with root package name */
        public final j f10747b;

        /* renamed from: c  reason: collision with root package name */
        public final i4.b f10748c;

        /* renamed from: d  reason: collision with root package name */
        public final f f10749d;

        /* renamed from: e  reason: collision with root package name */
        private final long f10750e;

        /* renamed from: f  reason: collision with root package name */
        private final long f10751f;

        b(long j10, j jVar, i4.b bVar, g gVar, long j11, f fVar) {
            this.f10750e = j10;
            this.f10747b = jVar;
            this.f10748c = bVar;
            this.f10751f = j11;
            this.f10746a = gVar;
            this.f10749d = fVar;
        }

        b b(long j10, j jVar) throws e4.b {
            long f10;
            long f11;
            f l10 = this.f10747b.l();
            f l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f10748c, this.f10746a, this.f10751f, l10);
            }
            if (!l10.h()) {
                return new b(j10, jVar, this.f10748c, this.f10746a, this.f10751f, l11);
            }
            long g10 = l10.g(j10);
            if (g10 == 0) {
                return new b(j10, jVar, this.f10748c, this.f10746a, this.f10751f, l11);
            }
            long i10 = l10.i();
            long a10 = l10.a(i10);
            long j11 = (g10 + i10) - 1;
            long i11 = l11.i();
            long a11 = l11.a(i11);
            long j12 = this.f10751f;
            int i12 = ((l10.a(j11) + l10.b(j11, j10)) > a11 ? 1 : ((l10.a(j11) + l10.b(j11, j10)) == a11 ? 0 : -1));
            if (i12 == 0) {
                f10 = j11 + 1;
            } else if (i12 < 0) {
                throw new e4.b();
            } else {
                if (a11 < a10) {
                    f11 = j12 - (l11.f(a10, j10) - i10);
                    return new b(j10, jVar, this.f10748c, this.f10746a, f11, l11);
                }
                f10 = l10.f(a11, j10);
            }
            f11 = j12 + (f10 - i11);
            return new b(j10, jVar, this.f10748c, this.f10746a, f11, l11);
        }

        b c(f fVar) {
            return new b(this.f10750e, this.f10747b, this.f10748c, this.f10746a, this.f10751f, fVar);
        }

        b d(i4.b bVar) {
            return new b(this.f10750e, this.f10747b, bVar, this.f10746a, this.f10751f, this.f10749d);
        }

        public long e(long j10) {
            return this.f10749d.c(this.f10750e, j10) + this.f10751f;
        }

        public long f() {
            return this.f10749d.i() + this.f10751f;
        }

        public long g(long j10) {
            return (e(j10) + this.f10749d.j(this.f10750e, j10)) - 1;
        }

        public long h() {
            return this.f10749d.g(this.f10750e);
        }

        public long i(long j10) {
            return k(j10) + this.f10749d.b(j10 - this.f10751f, this.f10750e);
        }

        public long j(long j10) {
            return this.f10749d.f(j10, this.f10750e) + this.f10751f;
        }

        public long k(long j10) {
            return this.f10749d.a(j10 - this.f10751f);
        }

        public i l(long j10) {
            return this.f10749d.e(j10 - this.f10751f);
        }

        public boolean m(long j10, long j11) {
            return this.f10749d.h() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    /* compiled from: DefaultDashChunkSource.java */
    /* renamed from: com.google.android.exoplayer2.source.dash.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected static final class C0174c extends g4.b {

        /* renamed from: e  reason: collision with root package name */
        private final b f10752e;

        /* renamed from: f  reason: collision with root package name */
        private final long f10753f;

        public C0174c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f10752e = bVar;
            this.f10753f = j12;
        }

        @Override // g4.o
        public long a() {
            c();
            return this.f10752e.k(d());
        }

        @Override // g4.o
        public long b() {
            c();
            return this.f10752e.i(d());
        }
    }

    public c(g.a aVar, k0 k0Var, i4.c cVar, h4.b bVar, int i10, int[] iArr, s sVar, int i11, l lVar, long j10, int i12, boolean z10, List<m1> list, e.c cVar2, q1 q1Var) {
        this.f10729a = k0Var;
        this.f10739k = cVar;
        this.f10730b = bVar;
        this.f10731c = iArr;
        this.f10738j = sVar;
        this.f10732d = i11;
        this.f10733e = lVar;
        this.f10740l = i10;
        this.f10734f = j10;
        this.f10735g = i12;
        this.f10736h = cVar2;
        long g10 = cVar.g(i10);
        ArrayList<j> n10 = n();
        this.f10737i = new b[sVar.length()];
        int i13 = 0;
        while (i13 < this.f10737i.length) {
            j jVar = n10.get(sVar.g(i13));
            i4.b j11 = bVar.j(jVar.f26570c);
            b[] bVarArr = this.f10737i;
            if (j11 == null) {
                j11 = jVar.f26570c.get(0);
            }
            int i14 = i13;
            bVarArr[i14] = new b(g10, jVar, j11, aVar.a(i11, jVar.f26569b, z10, list, cVar2, q1Var), 0L, jVar.l());
            i13 = i14 + 1;
        }
    }

    private i0.a k(s sVar, List<i4.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (sVar.d(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int f10 = h4.b.f(list);
        return new i0.a(f10, f10 - this.f10730b.g(list), length, i10);
    }

    private long l(long j10, long j11) {
        if (this.f10739k.f26522d) {
            return Math.max(0L, Math.min(m(j10), this.f10737i[0].i(this.f10737i[0].g(j10))) - j11);
        }
        return -9223372036854775807L;
    }

    private long m(long j10) {
        i4.c cVar = this.f10739k;
        long j11 = cVar.f26519a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - p0.C0(j11 + cVar.d(this.f10740l).f26555b);
    }

    private ArrayList<j> n() {
        List<i4.a> list = this.f10739k.d(this.f10740l).f26556c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i10 : this.f10731c) {
            arrayList.addAll(list.get(i10).f26511c);
        }
        return arrayList;
    }

    private long o(b bVar, n nVar, long j10, long j11, long j12) {
        if (nVar != null) {
            return nVar.g();
        }
        return p0.r(bVar.j(j10), j11, j12);
    }

    private b r(int i10) {
        b bVar = this.f10737i[i10];
        i4.b j10 = this.f10730b.j(bVar.f10747b.f26570c);
        if (j10 == null || j10.equals(bVar.f10748c)) {
            return bVar;
        }
        b d10 = bVar.d(j10);
        this.f10737i[i10] = d10;
        return d10;
    }

    @Override // g4.j
    public void a() throws IOException {
        IOException iOException = this.f10741m;
        if (iOException == null) {
            this.f10729a.a();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void b(s sVar) {
        this.f10738j = sVar;
    }

    @Override // g4.j
    public void c(g4.f fVar) {
        s3.c c10;
        if (fVar instanceof m) {
            int b10 = this.f10738j.b(((m) fVar).f25738d);
            b bVar = this.f10737i[b10];
            if (bVar.f10749d == null && (c10 = bVar.f10746a.c()) != null) {
                this.f10737i[b10] = bVar.c(new h(c10, bVar.f10747b.f26571d));
            }
        }
        e.c cVar = this.f10736h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    @Override // g4.j
    public long e(long j10, d3 d3Var) {
        b[] bVarArr;
        for (b bVar : this.f10737i) {
            if (bVar.f10749d != null) {
                long j11 = bVar.j(j10);
                long k10 = bVar.k(j11);
                long h10 = bVar.h();
                return d3Var.a(j10, k10, (k10 >= j10 || (h10 != -1 && j11 >= (bVar.f() + h10) - 1)) ? k10 : bVar.k(j11 + 1));
            }
        }
        return j10;
    }

    @Override // g4.j
    public boolean f(g4.f fVar, boolean z10, i0.c cVar, i0 i0Var) {
        i0.b d10;
        if (z10) {
            e.c cVar2 = this.f10736h;
            if (cVar2 == null || !cVar2.j(fVar)) {
                if (!this.f10739k.f26522d && (fVar instanceof n)) {
                    IOException iOException = cVar.f33515c;
                    if ((iOException instanceof e0) && ((e0) iOException).f33485d == 404) {
                        b bVar = this.f10737i[this.f10738j.b(fVar.f25738d)];
                        long h10 = bVar.h();
                        if (h10 != -1 && h10 != 0) {
                            if (((n) fVar).g() > (bVar.f() + h10) - 1) {
                                this.f10742n = true;
                                return true;
                            }
                        }
                    }
                }
                b bVar2 = this.f10737i[this.f10738j.b(fVar.f25738d)];
                i4.b j10 = this.f10730b.j(bVar2.f10747b.f26570c);
                if (j10 == null || bVar2.f10748c.equals(j10)) {
                    i0.a k10 = k(this.f10738j, bVar2.f10747b.f26570c);
                    if ((k10.a(2) || k10.a(1)) && (d10 = i0Var.d(k10, cVar)) != null && k10.a(d10.f33511a)) {
                        int i10 = d10.f33511a;
                        if (i10 == 2) {
                            s sVar = this.f10738j;
                            return sVar.c(sVar.b(fVar.f25738d), d10.f33512b);
                        } else if (i10 == 1) {
                            this.f10730b.e(bVar2.f10748c, d10.f33512b);
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // g4.j
    public boolean g(long j10, g4.f fVar, List<? extends n> list) {
        if (this.f10741m != null) {
            return false;
        }
        return this.f10738j.h(j10, fVar, list);
    }

    @Override // g4.j
    public int h(long j10, List<? extends n> list) {
        if (this.f10741m == null && this.f10738j.length() >= 2) {
            return this.f10738j.q(j10, list);
        }
        return list.size();
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void i(i4.c cVar, int i10) {
        try {
            this.f10739k = cVar;
            this.f10740l = i10;
            long g10 = cVar.g(i10);
            ArrayList<j> n10 = n();
            for (int i11 = 0; i11 < this.f10737i.length; i11++) {
                b[] bVarArr = this.f10737i;
                bVarArr[i11] = bVarArr[i11].b(g10, n10.get(this.f10738j.g(i11)));
            }
        } catch (e4.b e8) {
            this.f10741m = e8;
        }
    }

    @Override // g4.j
    public void j(long j10, long j11, List<? extends n> list, g4.h hVar) {
        int i10;
        int i11;
        o[] oVarArr;
        long j12;
        long j13;
        if (this.f10741m != null) {
            return;
        }
        long j14 = j11 - j10;
        long C0 = p0.C0(this.f10739k.f26519a) + p0.C0(this.f10739k.d(this.f10740l).f26555b) + j11;
        e.c cVar = this.f10736h;
        if (cVar == null || !cVar.h(C0)) {
            long C02 = p0.C0(p0.Z(this.f10734f));
            long m7 = m(C02);
            n nVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f10738j.length();
            o[] oVarArr2 = new o[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f10737i[i12];
                if (bVar.f10749d == null) {
                    oVarArr2[i12] = o.f25787a;
                    i10 = i12;
                    i11 = length;
                    oVarArr = oVarArr2;
                    j12 = j14;
                    j13 = C02;
                } else {
                    long e8 = bVar.e(C02);
                    long g10 = bVar.g(C02);
                    i10 = i12;
                    i11 = length;
                    oVarArr = oVarArr2;
                    j12 = j14;
                    j13 = C02;
                    long o10 = o(bVar, nVar, j11, e8, g10);
                    if (o10 < e8) {
                        oVarArr[i10] = o.f25787a;
                    } else {
                        oVarArr[i10] = new C0174c(r(i10), o10, g10, m7);
                    }
                }
                i12 = i10 + 1;
                C02 = j13;
                oVarArr2 = oVarArr;
                length = i11;
                j14 = j12;
            }
            long j15 = j14;
            long j16 = C02;
            this.f10738j.m(j10, j15, l(j16, j10), list, oVarArr2);
            b r10 = r(this.f10738j.a());
            g gVar = r10.f10746a;
            if (gVar != null) {
                j jVar = r10.f10747b;
                i n10 = gVar.d() == null ? jVar.n() : null;
                i m10 = r10.f10749d == null ? jVar.m() : null;
                if (n10 != null || m10 != null) {
                    hVar.f25744a = p(r10, this.f10733e, this.f10738j.s(), this.f10738j.t(), this.f10738j.j(), n10, m10);
                    return;
                }
            }
            long j17 = r10.f10750e;
            int i13 = (j17 > (-9223372036854775807L) ? 1 : (j17 == (-9223372036854775807L) ? 0 : -1));
            boolean z10 = i13 != 0;
            if (r10.h() == 0) {
                hVar.f25745b = z10;
                return;
            }
            long e10 = r10.e(j16);
            long g11 = r10.g(j16);
            long o11 = o(r10, nVar, j11, e10, g11);
            if (o11 < e10) {
                this.f10741m = new e4.b();
                return;
            }
            int i14 = (o11 > g11 ? 1 : (o11 == g11 ? 0 : -1));
            if (i14 <= 0 && (!this.f10742n || i14 < 0)) {
                if (z10 && r10.k(o11) >= j17) {
                    hVar.f25745b = true;
                    return;
                }
                int min = (int) Math.min(this.f10735g, (g11 - o11) + 1);
                if (i13 != 0) {
                    while (min > 1 && r10.k((min + o11) - 1) >= j17) {
                        min--;
                    }
                }
                hVar.f25744a = q(r10, this.f10733e, this.f10732d, this.f10738j.s(), this.f10738j.t(), this.f10738j.j(), o11, min, list.isEmpty() ? j11 : -9223372036854775807L, m7);
                return;
            }
            hVar.f25745b = z10;
        }
    }

    protected g4.f p(b bVar, l lVar, m1 m1Var, int i10, Object obj, i iVar, i iVar2) {
        i iVar3 = iVar;
        j jVar = bVar.f10747b;
        if (iVar3 != null) {
            i a10 = iVar3.a(iVar2, bVar.f10748c.f26515a);
            if (a10 != null) {
                iVar3 = a10;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(lVar, h4.g.a(jVar, bVar.f10748c.f26515a, iVar3, 0), m1Var, i10, obj, bVar.f10746a);
    }

    protected g4.f q(b bVar, l lVar, int i10, m1 m1Var, int i11, Object obj, long j10, int i12, long j11, long j12) {
        j jVar = bVar.f10747b;
        long k10 = bVar.k(j10);
        i l10 = bVar.l(j10);
        if (bVar.f10746a == null) {
            return new p(lVar, h4.g.a(jVar, bVar.f10748c.f26515a, l10, bVar.m(j10, j12) ? 0 : 8), m1Var, i11, obj, k10, bVar.i(j10), j10, i10, m1Var);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            i a10 = l10.a(bVar.l(i13 + j10), bVar.f10748c.f26515a);
            if (a10 == null) {
                break;
            }
            i14++;
            i13++;
            l10 = a10;
        }
        long j13 = (i14 + j10) - 1;
        long i15 = bVar.i(j13);
        long j14 = bVar.f10750e;
        return new k(lVar, h4.g.a(jVar, bVar.f10748c.f26515a, l10, bVar.m(j13, j12) ? 0 : 8), m1Var, i11, obj, k10, i15, j11, (j14 == -9223372036854775807L || j14 > i15) ? -9223372036854775807L : j14, j10, i14, -jVar.f26571d, bVar.f10746a);
    }

    @Override // g4.j
    public void release() {
        for (b bVar : this.f10737i) {
            g gVar = bVar.f10746a;
            if (gVar != null) {
                gVar.release();
            }
        }
    }
}
