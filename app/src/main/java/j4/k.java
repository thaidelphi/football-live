package j4;

import a5.p0;
import a5.x;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.b9;
import e4.a0;
import e4.e0;
import e4.f0;
import e4.k0;
import e4.m0;
import e4.q;
import j4.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k4.h;
import k4.l;
import n3.d3;
import n3.m1;
import o3.q1;
import z4.i0;
import z4.s0;
/* compiled from: HlsMediaPeriod.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k implements e4.q, l.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f26997a;

    /* renamed from: b  reason: collision with root package name */
    private final k4.l f26998b;

    /* renamed from: c  reason: collision with root package name */
    private final g f26999c;

    /* renamed from: d  reason: collision with root package name */
    private final s0 f27000d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.l f27001e;

    /* renamed from: f  reason: collision with root package name */
    private final k.a f27002f;

    /* renamed from: g  reason: collision with root package name */
    private final i0 f27003g;

    /* renamed from: h  reason: collision with root package name */
    private final a0.a f27004h;

    /* renamed from: i  reason: collision with root package name */
    private final z4.b f27005i;

    /* renamed from: l  reason: collision with root package name */
    private final e4.g f27008l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f27009m;

    /* renamed from: n  reason: collision with root package name */
    private final int f27010n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f27011o;

    /* renamed from: p  reason: collision with root package name */
    private final q1 f27012p;

    /* renamed from: r  reason: collision with root package name */
    private q.a f27014r;

    /* renamed from: s  reason: collision with root package name */
    private int f27015s;

    /* renamed from: t  reason: collision with root package name */
    private m0 f27016t;

    /* renamed from: x  reason: collision with root package name */
    private int f27020x;

    /* renamed from: y  reason: collision with root package name */
    private f0 f27021y;

    /* renamed from: q  reason: collision with root package name */
    private final p.b f27013q = new b();

    /* renamed from: j  reason: collision with root package name */
    private final IdentityHashMap<e0, Integer> f27006j = new IdentityHashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private final r f27007k = new r();

    /* renamed from: u  reason: collision with root package name */
    private p[] f27017u = new p[0];

    /* renamed from: v  reason: collision with root package name */
    private p[] f27018v = new p[0];

    /* renamed from: w  reason: collision with root package name */
    private int[][] f27019w = new int[0];

    /* compiled from: HlsMediaPeriod.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b implements p.b {
        private b() {
        }

        @Override // e4.f0.a
        /* renamed from: b */
        public void f(p pVar) {
            k.this.f27014r.f(k.this);
        }

        @Override // j4.p.b
        public void i(Uri uri) {
            k.this.f26998b.f(uri);
        }

        @Override // j4.p.b
        public void onPrepared() {
            p[] pVarArr;
            if (k.i(k.this) > 0) {
                return;
            }
            int i10 = 0;
            for (p pVar : k.this.f27017u) {
                i10 += pVar.t().f25106a;
            }
            k0[] k0VarArr = new k0[i10];
            int i11 = 0;
            for (p pVar2 : k.this.f27017u) {
                int i12 = pVar2.t().f25106a;
                int i13 = 0;
                while (i13 < i12) {
                    k0VarArr[i11] = pVar2.t().b(i13);
                    i13++;
                    i11++;
                }
            }
            k.this.f27016t = new m0(k0VarArr);
            k.this.f27014r.a(k.this);
        }
    }

    public k(h hVar, k4.l lVar, g gVar, s0 s0Var, com.google.android.exoplayer2.drm.l lVar2, k.a aVar, i0 i0Var, a0.a aVar2, z4.b bVar, e4.g gVar2, boolean z10, int i10, boolean z11, q1 q1Var) {
        this.f26997a = hVar;
        this.f26998b = lVar;
        this.f26999c = gVar;
        this.f27000d = s0Var;
        this.f27001e = lVar2;
        this.f27002f = aVar;
        this.f27003g = i0Var;
        this.f27004h = aVar2;
        this.f27005i = bVar;
        this.f27008l = gVar2;
        this.f27009m = z10;
        this.f27010n = i10;
        this.f27011o = z11;
        this.f27012p = q1Var;
        this.f27021y = gVar2.a(new f0[0]);
    }

    private static m1 A(m1 m1Var) {
        String K = p0.K(m1Var.f28182i, 2);
        return new m1.b().S(m1Var.f28174a).U(m1Var.f28175b).K(m1Var.f28184k).e0(x.g(K)).I(K).X(m1Var.f28183j).G(m1Var.f28179f).Z(m1Var.f28180g).j0(m1Var.f28190q).Q(m1Var.f28191r).P(m1Var.f28192s).g0(m1Var.f28177d).c0(m1Var.f28178e).E();
    }

    static /* synthetic */ int i(k kVar) {
        int i10 = kVar.f27015s - 1;
        kVar.f27015s = i10;
        return i10;
    }

    private void s(long j10, List<h.a> list, List<p> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f27222d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (p0.c(str, list.get(i11).f27222d)) {
                        h.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f27219a);
                        arrayList2.add(aVar.f27220b);
                        z10 &= p0.J(aVar.f27220b.f28182i, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                p x10 = x(str2, 1, (Uri[]) arrayList.toArray((Uri[]) p0.k(new Uri[0])), (m1[]) arrayList2.toArray(new m1[0]), null, Collections.emptyList(), map, j10);
                list3.add(a6.b.k(arrayList3));
                list2.add(x10);
                if (this.f27009m && z10) {
                    x10.d0(new k0[]{new k0(str2, (m1[]) arrayList2.toArray(new m1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void v(k4.h hVar, long j10, List<p> list, List<int[]> list2, Map<String, DrmInitData> map) {
        boolean z10;
        boolean z11;
        int size = hVar.f27210e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < hVar.f27210e.size(); i12++) {
            m1 m1Var = hVar.f27210e.get(i12).f27224b;
            if (m1Var.f28191r <= 0 && p0.K(m1Var.f28182i, 2) == null) {
                if (p0.K(m1Var.f28182i, 1) != null) {
                    iArr[i12] = 1;
                    i11++;
                } else {
                    iArr[i12] = -1;
                }
            } else {
                iArr[i12] = 2;
                i10++;
            }
        }
        if (i10 > 0) {
            size = i10;
            z10 = true;
            z11 = false;
        } else if (i11 < size) {
            size -= i11;
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[size];
        m1[] m1VarArr = new m1[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < hVar.f27210e.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                h.b bVar = hVar.f27210e.get(i14);
                uriArr[i13] = bVar.f27223a;
                m1VarArr[i13] = bVar.f27224b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = m1VarArr[0].f28182i;
        int J = p0.J(str, 2);
        int J2 = p0.J(str, 1);
        boolean z12 = (J2 == 1 || (J2 == 0 && hVar.f27212g.isEmpty())) && J <= 1 && J2 + J > 0;
        p x10 = x(b9.h.Z, (z10 || J2 <= 0) ? 0 : 1, uriArr, m1VarArr, hVar.f27215j, hVar.f27216k, map, j10);
        list.add(x10);
        list2.add(iArr2);
        if (this.f27009m && z12) {
            ArrayList arrayList = new ArrayList();
            if (J > 0) {
                m1[] m1VarArr2 = new m1[size];
                for (int i15 = 0; i15 < size; i15++) {
                    m1VarArr2[i15] = A(m1VarArr[i15]);
                }
                arrayList.add(new k0(b9.h.Z, m1VarArr2));
                if (J2 > 0 && (hVar.f27215j != null || hVar.f27212g.isEmpty())) {
                    arrayList.add(new k0(b9.h.Z + ":audio", y(m1VarArr[0], hVar.f27215j, false)));
                }
                List<m1> list3 = hVar.f27216k;
                if (list3 != null) {
                    for (int i16 = 0; i16 < list3.size(); i16++) {
                        arrayList.add(new k0(b9.h.Z + ":cc:" + i16, list3.get(i16)));
                    }
                }
            } else {
                m1[] m1VarArr3 = new m1[size];
                for (int i17 = 0; i17 < size; i17++) {
                    m1VarArr3[i17] = y(m1VarArr[i17], hVar.f27215j, true);
                }
                arrayList.add(new k0(b9.h.Z, m1VarArr3));
            }
            k0 k0Var = new k0(b9.h.Z + ":id3", new m1.b().S("ID3").e0("application/id3").E());
            arrayList.add(k0Var);
            x10.d0((k0[]) arrayList.toArray(new k0[0]), 0, arrayList.indexOf(k0Var));
        }
    }

    private void w(long j10) {
        Map<String, DrmInitData> emptyMap;
        k4.h hVar = (k4.h) a5.a.e(this.f26998b.e());
        if (this.f27011o) {
            emptyMap = z(hVar.f27218m);
        } else {
            emptyMap = Collections.emptyMap();
        }
        Map<String, DrmInitData> map = emptyMap;
        boolean z10 = !hVar.f27210e.isEmpty();
        List<h.a> list = hVar.f27212g;
        List<h.a> list2 = hVar.f27213h;
        this.f27015s = 0;
        ArrayList arrayList = new ArrayList();
        List<int[]> arrayList2 = new ArrayList<>();
        if (z10) {
            v(hVar, j10, arrayList, arrayList2, map);
        }
        s(j10, list, arrayList, arrayList2, map);
        this.f27020x = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            h.a aVar = list2.get(i10);
            String str = "subtitle:" + i10 + ":" + aVar.f27222d;
            ArrayList arrayList3 = arrayList2;
            int i11 = i10;
            p x10 = x(str, 3, new Uri[]{aVar.f27219a}, new m1[]{aVar.f27220b}, null, Collections.emptyList(), map, j10);
            arrayList3.add(new int[]{i11});
            arrayList.add(x10);
            x10.d0(new k0[]{new k0(str, aVar.f27220b)}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
        }
        this.f27017u = (p[]) arrayList.toArray(new p[0]);
        this.f27019w = (int[][]) arrayList2.toArray(new int[0]);
        this.f27015s = this.f27017u.length;
        for (int i12 = 0; i12 < this.f27020x; i12++) {
            this.f27017u[i12].m0(true);
        }
        for (p pVar : this.f27017u) {
            pVar.B();
        }
        this.f27018v = this.f27017u;
    }

    private p x(String str, int i10, Uri[] uriArr, m1[] m1VarArr, m1 m1Var, List<m1> list, Map<String, DrmInitData> map, long j10) {
        return new p(str, i10, this.f27013q, new f(this.f26997a, this.f26998b, uriArr, m1VarArr, this.f26999c, this.f27000d, this.f27007k, list, this.f27012p), map, this.f27005i, j10, m1Var, this.f27001e, this.f27002f, this.f27003g, this.f27004h, this.f27010n);
    }

    private static m1 y(m1 m1Var, m1 m1Var2, boolean z10) {
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        Metadata metadata;
        int i12;
        if (m1Var2 != null) {
            str2 = m1Var2.f28182i;
            metadata = m1Var2.f28183j;
            int i13 = m1Var2.f28198y;
            i10 = m1Var2.f28177d;
            int i14 = m1Var2.f28178e;
            String str4 = m1Var2.f28176c;
            str3 = m1Var2.f28175b;
            i11 = i13;
            i12 = i14;
            str = str4;
        } else {
            String K = p0.K(m1Var.f28182i, 1);
            Metadata metadata2 = m1Var.f28183j;
            if (z10) {
                int i15 = m1Var.f28198y;
                int i16 = m1Var.f28177d;
                int i17 = m1Var.f28178e;
                str = m1Var.f28176c;
                str2 = K;
                str3 = m1Var.f28175b;
                i11 = i15;
                i10 = i16;
                metadata = metadata2;
                i12 = i17;
            } else {
                str = null;
                i10 = 0;
                i11 = -1;
                str2 = K;
                str3 = null;
                metadata = metadata2;
                i12 = 0;
            }
        }
        return new m1.b().S(m1Var.f28174a).U(str3).K(m1Var.f28184k).e0(x.g(str2)).I(str2).X(metadata).G(z10 ? m1Var.f28179f : -1).Z(z10 ? m1Var.f28180g : -1).H(i11).g0(i10).c0(i12).V(str).E();
    }

    private static Map<String, DrmInitData> z(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitData = list.get(i10);
            String str = drmInitData.f10433c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData2 = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData2.f10433c, str)) {
                    drmInitData = drmInitData.g(drmInitData2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, drmInitData);
        }
        return hashMap;
    }

    public void B() {
        this.f26998b.b(this);
        for (p pVar : this.f27017u) {
            pVar.f0();
        }
        this.f27014r = null;
    }

    @Override // k4.l.b
    public void a() {
        for (p pVar : this.f27017u) {
            pVar.b0();
        }
        this.f27014r.f(this);
    }

    @Override // e4.q, e4.f0
    public long b() {
        return this.f27021y.b();
    }

    @Override // e4.q, e4.f0
    public boolean c() {
        return this.f27021y.c();
    }

    @Override // e4.q, e4.f0
    public boolean d(long j10) {
        if (this.f27016t == null) {
            for (p pVar : this.f27017u) {
                pVar.B();
            }
            return false;
        }
        return this.f27021y.d(j10);
    }

    @Override // e4.q
    public long e(long j10, d3 d3Var) {
        p[] pVarArr;
        for (p pVar : this.f27018v) {
            if (pVar.R()) {
                return pVar.e(j10, d3Var);
            }
        }
        return j10;
    }

    @Override // k4.l.b
    public boolean f(Uri uri, i0.c cVar, boolean z10) {
        boolean z11 = true;
        for (p pVar : this.f27017u) {
            z11 &= pVar.a0(uri, cVar, z10);
        }
        this.f27014r.f(this);
        return z11;
    }

    @Override // e4.q, e4.f0
    public long g() {
        return this.f27021y.g();
    }

    @Override // e4.q, e4.f0
    public void h(long j10) {
        this.f27021y.h(j10);
    }

    @Override // e4.q
    public long j(x4.s[] sVarArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j10) {
        e0[] e0VarArr2 = e0VarArr;
        int[] iArr = new int[sVarArr.length];
        int[] iArr2 = new int[sVarArr.length];
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            iArr[i10] = e0VarArr2[i10] == null ? -1 : this.f27006j.get(e0VarArr2[i10]).intValue();
            iArr2[i10] = -1;
            if (sVarArr[i10] != null) {
                k0 n10 = sVarArr[i10].n();
                int i11 = 0;
                while (true) {
                    p[] pVarArr = this.f27017u;
                    if (i11 >= pVarArr.length) {
                        break;
                    } else if (pVarArr[i11].t().c(n10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.f27006j.clear();
        int length = sVarArr.length;
        e0[] e0VarArr3 = new e0[length];
        e0[] e0VarArr4 = new e0[sVarArr.length];
        x4.s[] sVarArr2 = new x4.s[sVarArr.length];
        p[] pVarArr2 = new p[this.f27017u.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.f27017u.length) {
            for (int i14 = 0; i14 < sVarArr.length; i14++) {
                x4.s sVar = null;
                e0VarArr4[i14] = iArr[i14] == i13 ? e0VarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    sVar = sVarArr[i14];
                }
                sVarArr2[i14] = sVar;
            }
            p pVar = this.f27017u[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            x4.s[] sVarArr3 = sVarArr2;
            p[] pVarArr3 = pVarArr2;
            boolean j02 = pVar.j0(sVarArr2, zArr, e0VarArr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= sVarArr.length) {
                    break;
                }
                e0 e0Var = e0VarArr4[i18];
                if (iArr2[i18] == i17) {
                    a5.a.e(e0Var);
                    e0VarArr3[i18] = e0Var;
                    this.f27006j.put(e0Var, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    a5.a.f(e0Var == null);
                }
                i18++;
            }
            if (z11) {
                pVarArr3[i15] = pVar;
                i12 = i15 + 1;
                if (i15 == 0) {
                    pVar.m0(true);
                    if (!j02) {
                        p[] pVarArr4 = this.f27018v;
                        if (pVarArr4.length != 0 && pVar == pVarArr4[0]) {
                        }
                    }
                    this.f27007k.b();
                    z10 = true;
                } else {
                    pVar.m0(i17 < this.f27020x);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            pVarArr2 = pVarArr3;
            length = i16;
            sVarArr2 = sVarArr3;
            e0VarArr2 = e0VarArr;
        }
        System.arraycopy(e0VarArr3, 0, e0VarArr2, 0, length);
        p[] pVarArr5 = (p[]) p0.H0(pVarArr2, i12);
        this.f27018v = pVarArr5;
        this.f27021y = this.f27008l.a(pVarArr5);
        return j10;
    }

    @Override // e4.q
    public long k(long j10) {
        p[] pVarArr = this.f27018v;
        if (pVarArr.length > 0) {
            boolean i02 = pVarArr[0].i0(j10, false);
            int i10 = 1;
            while (true) {
                p[] pVarArr2 = this.f27018v;
                if (i10 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i10].i0(j10, i02);
                i10++;
            }
            if (i02) {
                this.f27007k.b();
            }
        }
        return j10;
    }

    @Override // e4.q
    public long l() {
        return -9223372036854775807L;
    }

    @Override // e4.q
    public void p() throws IOException {
        for (p pVar : this.f27017u) {
            pVar.p();
        }
    }

    @Override // e4.q
    public void r(q.a aVar, long j10) {
        this.f27014r = aVar;
        this.f26998b.c(this);
        w(j10);
    }

    @Override // e4.q
    public m0 t() {
        return (m0) a5.a.e(this.f27016t);
    }

    @Override // e4.q
    public void u(long j10, boolean z10) {
        for (p pVar : this.f27018v) {
            pVar.u(j10, z10);
        }
    }
}
