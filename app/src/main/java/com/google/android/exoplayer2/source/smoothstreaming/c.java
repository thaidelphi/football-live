package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import e4.a0;
import e4.e0;
import e4.f0;
import e4.g;
import e4.m0;
import e4.q;
import g4.i;
import java.io.IOException;
import java.util.ArrayList;
import m4.a;
import n3.d3;
import n3.m1;
import x4.s;
import z4.i0;
import z4.k0;
import z4.s0;
/* compiled from: SsMediaPeriod.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c implements q, f0.a<i<b>> {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f10853a;

    /* renamed from: b  reason: collision with root package name */
    private final s0 f10854b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f10855c;

    /* renamed from: d  reason: collision with root package name */
    private final l f10856d;

    /* renamed from: e  reason: collision with root package name */
    private final k.a f10857e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f10858f;

    /* renamed from: g  reason: collision with root package name */
    private final a0.a f10859g;

    /* renamed from: h  reason: collision with root package name */
    private final z4.b f10860h;

    /* renamed from: i  reason: collision with root package name */
    private final m0 f10861i;

    /* renamed from: j  reason: collision with root package name */
    private final g f10862j;

    /* renamed from: k  reason: collision with root package name */
    private q.a f10863k;

    /* renamed from: l  reason: collision with root package name */
    private m4.a f10864l;

    /* renamed from: m  reason: collision with root package name */
    private i<b>[] f10865m;

    /* renamed from: n  reason: collision with root package name */
    private f0 f10866n;

    public c(m4.a aVar, b.a aVar2, s0 s0Var, g gVar, l lVar, k.a aVar3, i0 i0Var, a0.a aVar4, k0 k0Var, z4.b bVar) {
        this.f10864l = aVar;
        this.f10853a = aVar2;
        this.f10854b = s0Var;
        this.f10855c = k0Var;
        this.f10856d = lVar;
        this.f10857e = aVar3;
        this.f10858f = i0Var;
        this.f10859g = aVar4;
        this.f10860h = bVar;
        this.f10862j = gVar;
        this.f10861i = n(aVar, lVar);
        i<b>[] o10 = o(0);
        this.f10865m = o10;
        this.f10866n = gVar.a(o10);
    }

    private i<b> m(s sVar, long j10) {
        int c10 = this.f10861i.c(sVar.n());
        return new i<>(this.f10864l.f27697f[c10].f27703a, null, null, this.f10853a.a(this.f10855c, this.f10864l, c10, sVar, this.f10854b), this, this.f10860h, j10, this.f10856d, this.f10857e, this.f10858f, this.f10859g);
    }

    private static m0 n(m4.a aVar, l lVar) {
        e4.k0[] k0VarArr = new e4.k0[aVar.f27697f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f27697f;
            if (i10 < bVarArr.length) {
                m1[] m1VarArr = bVarArr[i10].f27712j;
                m1[] m1VarArr2 = new m1[m1VarArr.length];
                for (int i11 = 0; i11 < m1VarArr.length; i11++) {
                    m1 m1Var = m1VarArr[i11];
                    m1VarArr2[i11] = m1Var.c(lVar.d(m1Var));
                }
                k0VarArr[i10] = new e4.k0(Integer.toString(i10), m1VarArr2);
                i10++;
            } else {
                return new m0(k0VarArr);
            }
        }
    }

    private static i<b>[] o(int i10) {
        return new i[i10];
    }

    @Override // e4.q, e4.f0
    public long b() {
        return this.f10866n.b();
    }

    @Override // e4.q, e4.f0
    public boolean c() {
        return this.f10866n.c();
    }

    @Override // e4.q, e4.f0
    public boolean d(long j10) {
        return this.f10866n.d(j10);
    }

    @Override // e4.q
    public long e(long j10, d3 d3Var) {
        i<b>[] iVarArr;
        for (i<b> iVar : this.f10865m) {
            if (iVar.f25746a == 2) {
                return iVar.e(j10, d3Var);
            }
        }
        return j10;
    }

    @Override // e4.q, e4.f0
    public long g() {
        return this.f10866n.g();
    }

    @Override // e4.q, e4.f0
    public void h(long j10) {
        this.f10866n.h(j10);
    }

    @Override // e4.q
    public long j(s[] sVarArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (e0VarArr[i10] != null) {
                i iVar = (i) e0VarArr[i10];
                if (sVarArr[i10] != null && zArr[i10]) {
                    ((b) iVar.D()).b(sVarArr[i10]);
                    arrayList.add(iVar);
                } else {
                    iVar.O();
                    e0VarArr[i10] = null;
                }
            }
            if (e0VarArr[i10] == null && sVarArr[i10] != null) {
                i<b> m7 = m(sVarArr[i10], j10);
                arrayList.add(m7);
                e0VarArr[i10] = m7;
                zArr2[i10] = true;
            }
        }
        i<b>[] o10 = o(arrayList.size());
        this.f10865m = o10;
        arrayList.toArray(o10);
        this.f10866n = this.f10862j.a(this.f10865m);
        return j10;
    }

    @Override // e4.q
    public long k(long j10) {
        for (i<b> iVar : this.f10865m) {
            iVar.R(j10);
        }
        return j10;
    }

    @Override // e4.q
    public long l() {
        return -9223372036854775807L;
    }

    @Override // e4.q
    public void p() throws IOException {
        this.f10855c.a();
    }

    @Override // e4.f0.a
    /* renamed from: q */
    public void f(i<b> iVar) {
        this.f10863k.f(this);
    }

    @Override // e4.q
    public void r(q.a aVar, long j10) {
        this.f10863k = aVar;
        aVar.a(this);
    }

    public void s() {
        for (i<b> iVar : this.f10865m) {
            iVar.O();
        }
        this.f10863k = null;
    }

    @Override // e4.q
    public m0 t() {
        return this.f10861i;
    }

    @Override // e4.q
    public void u(long j10, boolean z10) {
        for (i<b> iVar : this.f10865m) {
            iVar.u(j10, z10);
        }
    }

    public void v(m4.a aVar) {
        this.f10864l = aVar;
        for (i<b> iVar : this.f10865m) {
            iVar.D().d(aVar);
        }
        this.f10863k.f(this);
    }
}
