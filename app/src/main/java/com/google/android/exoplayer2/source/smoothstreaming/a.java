package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import g4.e;
import g4.g;
import g4.h;
import g4.k;
import g4.n;
import g4.o;
import java.io.IOException;
import java.util.List;
import m4.a;
import n3.d3;
import n3.m1;
import v3.f;
import v3.i;
import v3.j;
import x4.a0;
import x4.s;
import z4.i0;
import z4.k0;
import z4.l;
import z4.p;
import z4.s0;
/* compiled from: DefaultSsChunkSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f10842a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10843b;

    /* renamed from: c  reason: collision with root package name */
    private final g[] f10844c;

    /* renamed from: d  reason: collision with root package name */
    private final l f10845d;

    /* renamed from: e  reason: collision with root package name */
    private s f10846e;

    /* renamed from: f  reason: collision with root package name */
    private m4.a f10847f;

    /* renamed from: g  reason: collision with root package name */
    private int f10848g;

    /* renamed from: h  reason: collision with root package name */
    private IOException f10849h;

    /* compiled from: DefaultSsChunkSource.java */
    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0175a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f10850a;

        public C0175a(l.a aVar) {
            this.f10850a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(k0 k0Var, m4.a aVar, int i10, s sVar, s0 s0Var) {
            l a10 = this.f10850a.a();
            if (s0Var != null) {
                a10.i(s0Var);
            }
            return new a(k0Var, aVar, i10, sVar, a10);
        }
    }

    /* compiled from: DefaultSsChunkSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b extends g4.b {

        /* renamed from: e  reason: collision with root package name */
        private final a.b f10851e;

        /* renamed from: f  reason: collision with root package name */
        private final int f10852f;

        public b(a.b bVar, int i10, int i11) {
            super(i11, bVar.f27713k - 1);
            this.f10851e = bVar;
            this.f10852f = i10;
        }

        @Override // g4.o
        public long a() {
            c();
            return this.f10851e.e((int) d());
        }

        @Override // g4.o
        public long b() {
            return a() + this.f10851e.c((int) d());
        }
    }

    public a(k0 k0Var, m4.a aVar, int i10, s sVar, l lVar) {
        this.f10842a = k0Var;
        this.f10847f = aVar;
        this.f10843b = i10;
        this.f10846e = sVar;
        this.f10845d = lVar;
        a.b bVar = aVar.f27697f[i10];
        this.f10844c = new g[sVar.length()];
        int i11 = 0;
        while (i11 < this.f10844c.length) {
            int g10 = sVar.g(i11);
            m1 m1Var = bVar.f27712j[g10];
            j[] jVarArr = m1Var.f28188o != null ? ((a.C0313a) a5.a.e(aVar.f27696e)).f27702c : null;
            int i12 = bVar.f27703a;
            int i13 = i11;
            this.f10844c[i13] = new e(new f(3, null, new i(g10, i12, bVar.f27705c, -9223372036854775807L, aVar.f27698g, m1Var, 0, jVarArr, i12 == 2 ? 4 : 0, null, null)), bVar.f27703a, m1Var);
            i11 = i13 + 1;
        }
    }

    private static n k(m1 m1Var, l lVar, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, g gVar) {
        return new k(lVar, new p(uri), m1Var, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, gVar);
    }

    private long l(long j10) {
        m4.a aVar = this.f10847f;
        if (aVar.f27695d) {
            a.b bVar = aVar.f27697f[this.f10843b];
            int i10 = bVar.f27713k - 1;
            return (bVar.e(i10) + bVar.c(i10)) - j10;
        }
        return -9223372036854775807L;
    }

    @Override // g4.j
    public void a() throws IOException {
        IOException iOException = this.f10849h;
        if (iOException == null) {
            this.f10842a.a();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void b(s sVar) {
        this.f10846e = sVar;
    }

    @Override // g4.j
    public void c(g4.f fVar) {
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void d(m4.a aVar) {
        a.b[] bVarArr = this.f10847f.f27697f;
        int i10 = this.f10843b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f27713k;
        a.b bVar2 = aVar.f27697f[i10];
        if (i11 != 0 && bVar2.f27713k != 0) {
            int i12 = i11 - 1;
            long e8 = bVar.e(i12) + bVar.c(i12);
            long e10 = bVar2.e(0);
            if (e8 <= e10) {
                this.f10848g += i11;
            } else {
                this.f10848g += bVar.d(e10);
            }
        } else {
            this.f10848g += i11;
        }
        this.f10847f = aVar;
    }

    @Override // g4.j
    public long e(long j10, d3 d3Var) {
        a.b bVar = this.f10847f.f27697f[this.f10843b];
        int d10 = bVar.d(j10);
        long e8 = bVar.e(d10);
        return d3Var.a(j10, e8, (e8 >= j10 || d10 >= bVar.f27713k + (-1)) ? e8 : bVar.e(d10 + 1));
    }

    @Override // g4.j
    public boolean f(g4.f fVar, boolean z10, i0.c cVar, i0 i0Var) {
        i0.b d10 = i0Var.d(a0.c(this.f10846e), cVar);
        if (z10 && d10 != null && d10.f33511a == 2) {
            s sVar = this.f10846e;
            if (sVar.c(sVar.b(fVar.f25738d), d10.f33512b)) {
                return true;
            }
        }
        return false;
    }

    @Override // g4.j
    public boolean g(long j10, g4.f fVar, List<? extends n> list) {
        if (this.f10849h != null) {
            return false;
        }
        return this.f10846e.h(j10, fVar, list);
    }

    @Override // g4.j
    public int h(long j10, List<? extends n> list) {
        if (this.f10849h == null && this.f10846e.length() >= 2) {
            return this.f10846e.q(j10, list);
        }
        return list.size();
    }

    @Override // g4.j
    public final void j(long j10, long j11, List<? extends n> list, h hVar) {
        int g10;
        long j12 = j11;
        if (this.f10849h != null) {
            return;
        }
        m4.a aVar = this.f10847f;
        a.b bVar = aVar.f27697f[this.f10843b];
        if (bVar.f27713k == 0) {
            hVar.f25745b = !aVar.f27695d;
            return;
        }
        if (list.isEmpty()) {
            g10 = bVar.d(j12);
        } else {
            g10 = (int) (list.get(list.size() - 1).g() - this.f10848g);
            if (g10 < 0) {
                this.f10849h = new e4.b();
                return;
            }
        }
        if (g10 >= bVar.f27713k) {
            hVar.f25745b = !this.f10847f.f27695d;
            return;
        }
        long j13 = j12 - j10;
        long l10 = l(j10);
        int length = this.f10846e.length();
        o[] oVarArr = new o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = new b(bVar, this.f10846e.g(i10), g10);
        }
        this.f10846e.m(j10, j13, l10, list, oVarArr);
        long e8 = bVar.e(g10);
        long c10 = e8 + bVar.c(g10);
        if (!list.isEmpty()) {
            j12 = -9223372036854775807L;
        }
        long j14 = j12;
        int i11 = g10 + this.f10848g;
        int a10 = this.f10846e.a();
        g gVar = this.f10844c[a10];
        hVar.f25744a = k(this.f10846e.s(), this.f10845d, bVar.a(this.f10846e.g(a10), g10), i11, e8, c10, j14, this.f10846e.t(), this.f10846e.j(), gVar);
    }

    @Override // g4.j
    public void release() {
        for (g gVar : this.f10844c) {
            gVar.release();
        }
    }
}
