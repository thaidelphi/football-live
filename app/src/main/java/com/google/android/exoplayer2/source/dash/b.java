package com.google.android.exoplayer2.source.dash;

import a5.p0;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import e4.a0;
import e4.e0;
import e4.f0;
import e4.g;
import e4.m0;
import e4.q;
import g4.i;
import i4.f;
import i4.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.d3;
import n3.m1;
import o3.q1;
import x4.s;
import z4.i0;
import z4.k0;
import z4.s0;
/* compiled from: DashMediaPeriod.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b implements q, f0.a<i<com.google.android.exoplayer2.source.dash.a>>, i.b<com.google.android.exoplayer2.source.dash.a> {

    /* renamed from: y  reason: collision with root package name */
    private static final Pattern f10696y = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: z  reason: collision with root package name */
    private static final Pattern f10697z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a  reason: collision with root package name */
    final int f10698a;

    /* renamed from: b  reason: collision with root package name */
    private final a.InterfaceC0173a f10699b;

    /* renamed from: c  reason: collision with root package name */
    private final s0 f10700c;

    /* renamed from: d  reason: collision with root package name */
    private final l f10701d;

    /* renamed from: e  reason: collision with root package name */
    private final i0 f10702e;

    /* renamed from: f  reason: collision with root package name */
    private final h4.b f10703f;

    /* renamed from: g  reason: collision with root package name */
    private final long f10704g;

    /* renamed from: h  reason: collision with root package name */
    private final k0 f10705h;

    /* renamed from: i  reason: collision with root package name */
    private final z4.b f10706i;

    /* renamed from: j  reason: collision with root package name */
    private final m0 f10707j;

    /* renamed from: k  reason: collision with root package name */
    private final a[] f10708k;

    /* renamed from: l  reason: collision with root package name */
    private final g f10709l;

    /* renamed from: m  reason: collision with root package name */
    private final e f10710m;

    /* renamed from: o  reason: collision with root package name */
    private final a0.a f10712o;

    /* renamed from: p  reason: collision with root package name */
    private final k.a f10713p;

    /* renamed from: q  reason: collision with root package name */
    private final q1 f10714q;

    /* renamed from: r  reason: collision with root package name */
    private q.a f10715r;

    /* renamed from: u  reason: collision with root package name */
    private f0 f10718u;

    /* renamed from: v  reason: collision with root package name */
    private i4.c f10719v;

    /* renamed from: w  reason: collision with root package name */
    private int f10720w;

    /* renamed from: x  reason: collision with root package name */
    private List<f> f10721x;

    /* renamed from: s  reason: collision with root package name */
    private i<com.google.android.exoplayer2.source.dash.a>[] f10716s = E(0);

    /* renamed from: t  reason: collision with root package name */
    private d[] f10717t = new d[0];

    /* renamed from: n  reason: collision with root package name */
    private final IdentityHashMap<i<com.google.android.exoplayer2.source.dash.a>, e.c> f10711n = new IdentityHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DashMediaPeriod.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f10722a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10723b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10724c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10725d;

        /* renamed from: e  reason: collision with root package name */
        public final int f10726e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10727f;

        /* renamed from: g  reason: collision with root package name */
        public final int f10728g;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f10723b = i10;
            this.f10722a = iArr;
            this.f10724c = i11;
            this.f10726e = i12;
            this.f10727f = i13;
            this.f10728g = i14;
            this.f10725d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public b(int i10, i4.c cVar, h4.b bVar, int i11, a.InterfaceC0173a interfaceC0173a, s0 s0Var, l lVar, k.a aVar, i0 i0Var, a0.a aVar2, long j10, k0 k0Var, z4.b bVar2, g gVar, e.b bVar3, q1 q1Var) {
        this.f10698a = i10;
        this.f10719v = cVar;
        this.f10703f = bVar;
        this.f10720w = i11;
        this.f10699b = interfaceC0173a;
        this.f10700c = s0Var;
        this.f10701d = lVar;
        this.f10713p = aVar;
        this.f10702e = i0Var;
        this.f10712o = aVar2;
        this.f10704g = j10;
        this.f10705h = k0Var;
        this.f10706i = bVar2;
        this.f10709l = gVar;
        this.f10714q = q1Var;
        this.f10710m = new e(cVar, bVar3, bVar2);
        this.f10718u = gVar.a(this.f10716s);
        i4.g d10 = cVar.d(i11);
        List<f> list = d10.f26557d;
        this.f10721x = list;
        Pair<m0, a[]> s10 = s(lVar, d10.f26556c, list);
        this.f10707j = (m0) s10.first;
        this.f10708k = (a[]) s10.second;
    }

    private int A(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f10708k[i11].f10726e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f10708k[i14].f10724c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] B(s[] sVarArr) {
        int[] iArr = new int[sVarArr.length];
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (sVarArr[i10] != null) {
                iArr[i10] = this.f10707j.c(sVarArr[i10].n());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean C(List<i4.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<j> list2 = list.get(i10).f26511c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f26572e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int D(int i10, List<i4.a> list, int[][] iArr, boolean[] zArr, m1[][] m1VarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (C(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            m1VarArr[i12] = y(list, iArr[i12]);
            if (m1VarArr[i12].length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static i<com.google.android.exoplayer2.source.dash.a>[] E(int i10) {
        return new i[i10];
    }

    private static m1[] G(i4.e eVar, Pattern pattern, m1 m1Var) {
        String str = eVar.f26547b;
        if (str == null) {
            return new m1[]{m1Var};
        }
        String[] R0 = p0.R0(str, ";");
        m1[] m1VarArr = new m1[R0.length];
        for (int i10 = 0; i10 < R0.length; i10++) {
            Matcher matcher = pattern.matcher(R0[i10]);
            if (!matcher.matches()) {
                return new m1[]{m1Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            m1VarArr[i10] = m1Var.b().S(m1Var.f28174a + ":" + parseInt).F(parseInt).V(matcher.group(2)).E();
        }
        return m1VarArr;
    }

    private void I(s[] sVarArr, boolean[] zArr, e0[] e0VarArr) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (sVarArr[i10] == null || !zArr[i10]) {
                if (e0VarArr[i10] instanceof i) {
                    ((i) e0VarArr[i10]).P(this);
                } else if (e0VarArr[i10] instanceof i.a) {
                    ((i.a) e0VarArr[i10]).c();
                }
                e0VarArr[i10] = null;
            }
        }
    }

    private void J(s[] sVarArr, e0[] e0VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if ((e0VarArr[i10] instanceof e4.j) || (e0VarArr[i10] instanceof i.a)) {
                int A = A(i10, iArr);
                if (A == -1) {
                    z10 = e0VarArr[i10] instanceof e4.j;
                } else {
                    z10 = (e0VarArr[i10] instanceof i.a) && ((i.a) e0VarArr[i10]).f25769a == e0VarArr[A];
                }
                if (!z10) {
                    if (e0VarArr[i10] instanceof i.a) {
                        ((i.a) e0VarArr[i10]).c();
                    }
                    e0VarArr[i10] = null;
                }
            }
        }
    }

    private void K(s[] sVarArr, e0[] e0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null) {
                if (e0VarArr[i10] == null) {
                    zArr[i10] = true;
                    a aVar = this.f10708k[iArr[i10]];
                    int i11 = aVar.f10724c;
                    if (i11 == 0) {
                        e0VarArr[i10] = q(aVar, sVar, j10);
                    } else if (i11 == 2) {
                        e0VarArr[i10] = new d(this.f10721x.get(aVar.f10725d), sVar.n().b(0), this.f10719v.f26522d);
                    }
                } else if (e0VarArr[i10] instanceof i) {
                    ((com.google.android.exoplayer2.source.dash.a) ((i) e0VarArr[i10]).D()).b(sVar);
                }
            }
        }
        for (int i12 = 0; i12 < sVarArr.length; i12++) {
            if (e0VarArr[i12] == null && sVarArr[i12] != null) {
                a aVar2 = this.f10708k[iArr[i12]];
                if (aVar2.f10724c == 1) {
                    int A = A(i12, iArr);
                    if (A == -1) {
                        e0VarArr[i12] = new e4.j();
                    } else {
                        e0VarArr[i12] = ((i) e0VarArr[A]).S(j10, aVar2.f10723b);
                    }
                }
            }
        }
    }

    private static void n(List<f> list, e4.k0[] k0VarArr, a[] aVarArr, int i10) {
        f fVar;
        int i11 = 0;
        while (i11 < list.size()) {
            k0VarArr[i10] = new e4.k0(fVar.a() + ":" + i11, new m1.b().S(list.get(i11).a()).e0("application/x-emsg").E());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int o(l lVar, List<i4.a> list, int[][] iArr, int i10, boolean[] zArr, m1[][] m1VarArr, e4.k0[] k0VarArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f26511c);
            }
            int size = arrayList.size();
            m1[] m1VarArr2 = new m1[size];
            for (int i16 = 0; i16 < size; i16++) {
                m1 m1Var = ((j) arrayList.get(i16)).f26569b;
                m1VarArr2[i16] = m1Var.c(lVar.d(m1Var));
            }
            i4.a aVar = list.get(iArr2[0]);
            int i17 = aVar.f26509a;
            String num = i17 != -1 ? Integer.toString(i17) : "unset:" + i13;
            int i18 = i14 + 1;
            if (zArr[i13]) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
                i18 = -1;
            }
            if (m1VarArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            k0VarArr[i14] = new e4.k0(num, m1VarArr2);
            aVarArr[i14] = a.d(aVar.f26510b, iArr2, i14, i18, i11);
            if (i18 != -1) {
                String str = num + ":emsg";
                k0VarArr[i18] = new e4.k0(str, new m1.b().S(str).e0("application/x-emsg").E());
                aVarArr[i18] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                k0VarArr[i11] = new e4.k0(num + ":cc", m1VarArr[i13]);
                aVarArr[i11] = a.a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    private i<com.google.android.exoplayer2.source.dash.a> q(a aVar, s sVar, long j10) {
        int i10;
        e4.k0 k0Var;
        e4.k0 k0Var2;
        int i11;
        int i12 = aVar.f10727f;
        boolean z10 = i12 != -1;
        e.c cVar = null;
        if (z10) {
            k0Var = this.f10707j.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            k0Var = null;
        }
        int i13 = aVar.f10728g;
        boolean z11 = i13 != -1;
        if (z11) {
            k0Var2 = this.f10707j.b(i13);
            i10 += k0Var2.f25083a;
        } else {
            k0Var2 = null;
        }
        m1[] m1VarArr = new m1[i10];
        int[] iArr = new int[i10];
        if (z10) {
            m1VarArr[0] = k0Var.b(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < k0Var2.f25083a; i14++) {
                m1VarArr[i11] = k0Var2.b(i14);
                iArr[i11] = 3;
                arrayList.add(m1VarArr[i11]);
                i11++;
            }
        }
        if (this.f10719v.f26522d && z10) {
            cVar = this.f10710m.k();
        }
        e.c cVar2 = cVar;
        i<com.google.android.exoplayer2.source.dash.a> iVar = new i<>(aVar.f10723b, iArr, m1VarArr, this.f10699b.a(this.f10705h, this.f10719v, this.f10703f, this.f10720w, aVar.f10722a, sVar, aVar.f10723b, this.f10704g, z10, arrayList, cVar2, this.f10700c, this.f10714q), this, this.f10706i, j10, this.f10701d, this.f10713p, this.f10702e, this.f10712o);
        synchronized (this) {
            this.f10711n.put(iVar, cVar2);
        }
        return iVar;
    }

    private static Pair<m0, a[]> s(l lVar, List<i4.a> list, List<f> list2) {
        int[][] z10 = z(list);
        int length = z10.length;
        boolean[] zArr = new boolean[length];
        m1[][] m1VarArr = new m1[length];
        int D = D(length, list, z10, zArr, m1VarArr) + length + list2.size();
        e4.k0[] k0VarArr = new e4.k0[D];
        a[] aVarArr = new a[D];
        n(list2, k0VarArr, aVarArr, o(lVar, list, z10, length, zArr, m1VarArr, k0VarArr, aVarArr));
        return Pair.create(new m0(k0VarArr), aVarArr);
    }

    private static i4.e v(List<i4.e> list) {
        return w(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static i4.e w(List<i4.e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            i4.e eVar = list.get(i10);
            if (str.equals(eVar.f26546a)) {
                return eVar;
            }
        }
        return null;
    }

    private static i4.e x(List<i4.e> list) {
        return w(list, "http://dashif.org/guidelines/trickmode");
    }

    private static m1[] y(List<i4.a> list, int[] iArr) {
        for (int i10 : iArr) {
            i4.a aVar = list.get(i10);
            List<i4.e> list2 = list.get(i10).f26512d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                i4.e eVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f26546a)) {
                    return G(eVar, f10696y, new m1.b().e0("application/cea-608").S(aVar.f26509a + ":cea608").E());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f26546a)) {
                    return G(eVar, f10697z, new m1.b().e0("application/cea-708").S(aVar.f26509a + ":cea708").E());
                }
            }
        }
        return new m1[0];
    }

    private static int[][] z(List<i4.a> list) {
        int i10;
        i4.e v10;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(list.get(i11).f26509a, i11);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            i4.a aVar = list.get(i12);
            i4.e x10 = x(aVar.f26513e);
            if (x10 == null) {
                x10 = x(aVar.f26514f);
            }
            if (x10 == null || (i10 = sparseIntArray.get(Integer.parseInt(x10.f26547b), -1)) == -1) {
                i10 = i12;
            }
            if (i10 == i12 && (v10 = v(aVar.f26514f)) != null) {
                for (String str : p0.R0(v10.f26547b, ",")) {
                    int i13 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(i10);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            iArr[i14] = a6.b.k((Collection) arrayList.get(i14));
            Arrays.sort(iArr[i14]);
        }
        return iArr;
    }

    @Override // e4.f0.a
    /* renamed from: F */
    public void f(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        this.f10715r.f(this);
    }

    public void H() {
        this.f10710m.o();
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.f10716s) {
            iVar.P(this);
        }
        this.f10715r = null;
    }

    public void L(i4.c cVar, int i10) {
        d[] dVarArr;
        this.f10719v = cVar;
        this.f10720w = i10;
        this.f10710m.q(cVar);
        i<com.google.android.exoplayer2.source.dash.a>[] iVarArr = this.f10716s;
        if (iVarArr != null) {
            for (i<com.google.android.exoplayer2.source.dash.a> iVar : iVarArr) {
                iVar.D().i(cVar, i10);
            }
            this.f10715r.f(this);
        }
        this.f10721x = cVar.d(i10).f26557d;
        for (d dVar : this.f10717t) {
            Iterator<f> it = this.f10721x.iterator();
            while (true) {
                if (it.hasNext()) {
                    f next = it.next();
                    if (next.a().equals(dVar.b())) {
                        boolean z10 = true;
                        dVar.d(next, (cVar.f26522d && i10 == cVar.e() - 1) ? false : false);
                    }
                }
            }
        }
    }

    @Override // e4.q, e4.f0
    public long b() {
        return this.f10718u.b();
    }

    @Override // e4.q, e4.f0
    public boolean c() {
        return this.f10718u.c();
    }

    @Override // e4.q, e4.f0
    public boolean d(long j10) {
        return this.f10718u.d(j10);
    }

    @Override // e4.q
    public long e(long j10, d3 d3Var) {
        i<com.google.android.exoplayer2.source.dash.a>[] iVarArr;
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.f10716s) {
            if (iVar.f25746a == 2) {
                return iVar.e(j10, d3Var);
            }
        }
        return j10;
    }

    @Override // e4.q, e4.f0
    public long g() {
        return this.f10718u.g();
    }

    @Override // e4.q, e4.f0
    public void h(long j10) {
        this.f10718u.h(j10);
    }

    @Override // e4.q
    public long j(s[] sVarArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j10) {
        int[] B = B(sVarArr);
        I(sVarArr, zArr, e0VarArr);
        J(sVarArr, e0VarArr, B);
        K(sVarArr, e0VarArr, zArr2, j10, B);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (e0 e0Var : e0VarArr) {
            if (e0Var instanceof i) {
                arrayList.add((i) e0Var);
            } else if (e0Var instanceof d) {
                arrayList2.add((d) e0Var);
            }
        }
        i<com.google.android.exoplayer2.source.dash.a>[] E = E(arrayList.size());
        this.f10716s = E;
        arrayList.toArray(E);
        d[] dVarArr = new d[arrayList2.size()];
        this.f10717t = dVarArr;
        arrayList2.toArray(dVarArr);
        this.f10718u = this.f10709l.a(this.f10716s);
        return j10;
    }

    @Override // e4.q
    public long k(long j10) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.f10716s) {
            iVar.R(j10);
        }
        for (d dVar : this.f10717t) {
            dVar.c(j10);
        }
        return j10;
    }

    @Override // e4.q
    public long l() {
        return -9223372036854775807L;
    }

    @Override // g4.i.b
    public synchronized void m(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        e.c remove = this.f10711n.remove(iVar);
        if (remove != null) {
            remove.n();
        }
    }

    @Override // e4.q
    public void p() throws IOException {
        this.f10705h.a();
    }

    @Override // e4.q
    public void r(q.a aVar, long j10) {
        this.f10715r = aVar;
        aVar.a(this);
    }

    @Override // e4.q
    public m0 t() {
        return this.f10707j;
    }

    @Override // e4.q
    public void u(long j10, boolean z10) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.f10716s) {
            iVar.u(j10, z10);
        }
    }
}
