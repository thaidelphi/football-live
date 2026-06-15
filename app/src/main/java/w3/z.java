package w3;

import a5.l0;
import a5.p0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n3.h2;
import s3.q;
import w3.a0;
/* compiled from: TsExtractor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z implements s3.i {

    /* renamed from: t  reason: collision with root package name */
    public static final s3.m f32283t = t3.d.f30956a;

    /* renamed from: a  reason: collision with root package name */
    private final int f32284a;

    /* renamed from: b  reason: collision with root package name */
    private final int f32285b;

    /* renamed from: c  reason: collision with root package name */
    private final List<l0> f32286c;

    /* renamed from: d  reason: collision with root package name */
    private final a5.c0 f32287d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseIntArray f32288e;

    /* renamed from: f  reason: collision with root package name */
    private final a0.c f32289f;

    /* renamed from: g  reason: collision with root package name */
    private final SparseArray<a0> f32290g;

    /* renamed from: h  reason: collision with root package name */
    private final SparseBooleanArray f32291h;

    /* renamed from: i  reason: collision with root package name */
    private final SparseBooleanArray f32292i;

    /* renamed from: j  reason: collision with root package name */
    private final y f32293j;

    /* renamed from: k  reason: collision with root package name */
    private x f32294k;

    /* renamed from: l  reason: collision with root package name */
    private s3.k f32295l;

    /* renamed from: m  reason: collision with root package name */
    private int f32296m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f32297n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f32298o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f32299p;

    /* renamed from: q  reason: collision with root package name */
    private a0 f32300q;

    /* renamed from: r  reason: collision with root package name */
    private int f32301r;

    /* renamed from: s  reason: collision with root package name */
    private int f32302s;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TsExtractor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements u {

        /* renamed from: a  reason: collision with root package name */
        private final a5.b0 f32303a = new a5.b0(new byte[4]);

        public a() {
        }

        @Override // w3.u
        public void a(a5.c0 c0Var) {
            if (c0Var.z() == 0 && (c0Var.z() & 128) != 0) {
                c0Var.L(6);
                int a10 = c0Var.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    c0Var.i(this.f32303a, 4);
                    int h10 = this.f32303a.h(16);
                    this.f32303a.q(3);
                    if (h10 == 0) {
                        this.f32303a.q(13);
                    } else {
                        int h11 = this.f32303a.h(13);
                        if (z.this.f32290g.get(h11) == null) {
                            z.this.f32290g.put(h11, new v(new b(h11)));
                            z.j(z.this);
                        }
                    }
                }
                if (z.this.f32284a != 2) {
                    z.this.f32290g.remove(0);
                }
            }
        }

        @Override // w3.u
        public void b(l0 l0Var, s3.k kVar, a0.d dVar) {
        }
    }

    /* compiled from: TsExtractor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b implements u {

        /* renamed from: a  reason: collision with root package name */
        private final a5.b0 f32305a = new a5.b0(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<a0> f32306b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        private final SparseIntArray f32307c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        private final int f32308d;

        public b(int i10) {
            this.f32308d = i10;
        }

        private a0.b c(a5.c0 c0Var, int i10) {
            int e8 = c0Var.e();
            int i11 = i10 + e8;
            String str = null;
            int i12 = -1;
            ArrayList arrayList = null;
            while (c0Var.e() < i11) {
                int z10 = c0Var.z();
                int e10 = c0Var.e() + c0Var.z();
                if (e10 > i11) {
                    break;
                }
                if (z10 == 5) {
                    long B = c0Var.B();
                    if (B != 1094921523) {
                        if (B != 1161904947) {
                            if (B != 1094921524) {
                                if (B == 1212503619) {
                                    i12 = 36;
                                }
                            }
                            i12 = 172;
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                } else {
                    if (z10 != 106) {
                        if (z10 != 122) {
                            if (z10 == 127) {
                                if (c0Var.z() != 21) {
                                }
                                i12 = 172;
                            } else if (z10 == 123) {
                                i12 = 138;
                            } else if (z10 == 10) {
                                str = c0Var.w(3).trim();
                            } else if (z10 == 89) {
                                arrayList = new ArrayList();
                                while (c0Var.e() < e10) {
                                    String trim = c0Var.w(3).trim();
                                    int z11 = c0Var.z();
                                    byte[] bArr = new byte[4];
                                    c0Var.j(bArr, 0, 4);
                                    arrayList.add(new a0.a(trim, z11, bArr));
                                }
                                i12 = 89;
                            } else if (z10 == 111) {
                                i12 = 257;
                            }
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                }
                c0Var.L(e10 - c0Var.e());
            }
            c0Var.K(i11);
            return new a0.b(i12, str, arrayList, Arrays.copyOfRange(c0Var.d(), e8, i11));
        }

        @Override // w3.u
        public void a(a5.c0 c0Var) {
            l0 l0Var;
            if (c0Var.z() != 2) {
                return;
            }
            if (z.this.f32284a == 1 || z.this.f32284a == 2 || z.this.f32296m == 1) {
                l0Var = (l0) z.this.f32286c.get(0);
            } else {
                l0Var = new l0(((l0) z.this.f32286c.get(0)).c());
                z.this.f32286c.add(l0Var);
            }
            if ((c0Var.z() & 128) == 0) {
                return;
            }
            c0Var.L(1);
            int F = c0Var.F();
            int i10 = 3;
            c0Var.L(3);
            c0Var.i(this.f32305a, 2);
            this.f32305a.q(3);
            int i11 = 13;
            z.this.f32302s = this.f32305a.h(13);
            c0Var.i(this.f32305a, 2);
            int i12 = 4;
            this.f32305a.q(4);
            c0Var.L(this.f32305a.h(12));
            if (z.this.f32284a == 2 && z.this.f32300q == null) {
                a0.b bVar = new a0.b(21, null, null, p0.f487f);
                z zVar = z.this;
                zVar.f32300q = zVar.f32289f.b(21, bVar);
                if (z.this.f32300q != null) {
                    z.this.f32300q.b(l0Var, z.this.f32295l, new a0.d(F, 21, 8192));
                }
            }
            this.f32306b.clear();
            this.f32307c.clear();
            int a10 = c0Var.a();
            while (a10 > 0) {
                c0Var.i(this.f32305a, 5);
                int h10 = this.f32305a.h(8);
                this.f32305a.q(i10);
                int h11 = this.f32305a.h(i11);
                this.f32305a.q(i12);
                int h12 = this.f32305a.h(12);
                a0.b c10 = c(c0Var, h12);
                if (h10 == 6 || h10 == 5) {
                    h10 = c10.f31985a;
                }
                a10 -= h12 + 5;
                int i13 = z.this.f32284a == 2 ? h10 : h11;
                if (!z.this.f32291h.get(i13)) {
                    a0 b10 = (z.this.f32284a == 2 && h10 == 21) ? z.this.f32300q : z.this.f32289f.b(h10, c10);
                    if (z.this.f32284a != 2 || h11 < this.f32307c.get(i13, 8192)) {
                        this.f32307c.put(i13, h11);
                        this.f32306b.put(i13, b10);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f32307c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = this.f32307c.keyAt(i14);
                int valueAt = this.f32307c.valueAt(i14);
                z.this.f32291h.put(keyAt, true);
                z.this.f32292i.put(valueAt, true);
                a0 valueAt2 = this.f32306b.valueAt(i14);
                if (valueAt2 != null) {
                    if (valueAt2 != z.this.f32300q) {
                        valueAt2.b(l0Var, z.this.f32295l, new a0.d(F, keyAt, 8192));
                    }
                    z.this.f32290g.put(valueAt, valueAt2);
                }
            }
            if (z.this.f32284a == 2) {
                if (z.this.f32297n) {
                    return;
                }
                z.this.f32295l.q();
                z.this.f32296m = 0;
                z.this.f32297n = true;
                return;
            }
            z.this.f32290g.remove(this.f32308d);
            z zVar2 = z.this;
            zVar2.f32296m = zVar2.f32284a == 1 ? 0 : z.this.f32296m - 1;
            if (z.this.f32296m == 0) {
                z.this.f32295l.q();
                z.this.f32297n = true;
            }
        }

        @Override // w3.u
        public void b(l0 l0Var, s3.k kVar, a0.d dVar) {
        }
    }

    public z(int i10, l0 l0Var, a0.c cVar) {
        this(i10, l0Var, cVar, 112800);
    }

    static /* synthetic */ int j(z zVar) {
        int i10 = zVar.f32296m;
        zVar.f32296m = i10 + 1;
        return i10;
    }

    private boolean t(s3.j jVar) throws IOException {
        byte[] d10 = this.f32287d.d();
        if (9400 - this.f32287d.e() < 188) {
            int a10 = this.f32287d.a();
            if (a10 > 0) {
                System.arraycopy(d10, this.f32287d.e(), d10, 0, a10);
            }
            this.f32287d.I(d10, a10);
        }
        while (this.f32287d.a() < 188) {
            int f10 = this.f32287d.f();
            int b10 = jVar.b(d10, f10, 9400 - f10);
            if (b10 == -1) {
                return false;
            }
            this.f32287d.J(f10 + b10);
        }
        return true;
    }

    private int u() throws h2 {
        int e8 = this.f32287d.e();
        int f10 = this.f32287d.f();
        int a10 = b0.a(this.f32287d.d(), e8, f10);
        this.f32287d.K(a10);
        int i10 = a10 + 188;
        if (i10 > f10) {
            int i11 = this.f32301r + (a10 - e8);
            this.f32301r = i11;
            if (this.f32284a == 2 && i11 > 376) {
                throw h2.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f32301r = 0;
        }
        return i10;
    }

    private void v(long j10) {
        if (this.f32298o) {
            return;
        }
        this.f32298o = true;
        if (this.f32293j.b() != -9223372036854775807L) {
            x xVar = new x(this.f32293j.c(), this.f32293j.b(), j10, this.f32302s, this.f32285b);
            this.f32294k = xVar;
            this.f32295l.o(xVar.b());
            return;
        }
        this.f32295l.o(new q.b(this.f32293j.b()));
    }

    private void w() {
        this.f32291h.clear();
        this.f32290g.clear();
        SparseArray<a0> a10 = this.f32289f.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32290g.put(a10.keyAt(i10), a10.valueAt(i10));
        }
        this.f32290g.put(0, new v(new a()));
        this.f32300q = null;
    }

    private boolean x(int i10) {
        return this.f32284a == 2 || this.f32297n || !this.f32292i.get(i10, false);
    }

    @Override // s3.i
    public int a(s3.j jVar, s3.p pVar) throws IOException {
        long a10 = jVar.a();
        if (this.f32297n) {
            if (((a10 == -1 || this.f32284a == 2) ? false : true) && !this.f32293j.d()) {
                return this.f32293j.e(jVar, pVar, this.f32302s);
            }
            v(a10);
            if (this.f32299p) {
                this.f32299p = false;
                d(0L, 0L);
                if (jVar.getPosition() != 0) {
                    pVar.f30719a = 0L;
                    return 1;
                }
            }
            x xVar = this.f32294k;
            if (xVar != null && xVar.d()) {
                return this.f32294k.c(jVar, pVar);
            }
        }
        if (t(jVar)) {
            int u10 = u();
            int f10 = this.f32287d.f();
            if (u10 > f10) {
                return 0;
            }
            int n10 = this.f32287d.n();
            if ((8388608 & n10) != 0) {
                this.f32287d.K(u10);
                return 0;
            }
            int i10 = ((4194304 & n10) != 0 ? 1 : 0) | 0;
            int i11 = (2096896 & n10) >> 8;
            boolean z10 = (n10 & 32) != 0;
            a0 a0Var = (n10 & 16) != 0 ? this.f32290g.get(i11) : null;
            if (a0Var == null) {
                this.f32287d.K(u10);
                return 0;
            }
            if (this.f32284a != 2) {
                int i12 = n10 & 15;
                int i13 = this.f32288e.get(i11, i12 - 1);
                this.f32288e.put(i11, i12);
                if (i13 == i12) {
                    this.f32287d.K(u10);
                    return 0;
                } else if (i12 != ((i13 + 1) & 15)) {
                    a0Var.c();
                }
            }
            if (z10) {
                int z11 = this.f32287d.z();
                i10 |= (this.f32287d.z() & 64) != 0 ? 2 : 0;
                this.f32287d.L(z11 - 1);
            }
            boolean z12 = this.f32297n;
            if (x(i11)) {
                this.f32287d.J(u10);
                a0Var.a(this.f32287d, i10);
                this.f32287d.J(f10);
            }
            if (this.f32284a != 2 && !z12 && this.f32297n && a10 != -1) {
                this.f32299p = true;
            }
            this.f32287d.K(u10);
            return 0;
        }
        return -1;
    }

    @Override // s3.i
    public void b(s3.k kVar) {
        this.f32295l = kVar;
    }

    @Override // s3.i
    public boolean c(s3.j jVar) throws IOException {
        boolean z10;
        byte[] d10 = this.f32287d.d();
        jVar.n(d10, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                } else if (d10[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                jVar.j(i10);
                return true;
            }
        }
        return false;
    }

    @Override // s3.i
    public void d(long j10, long j11) {
        x xVar;
        a5.a.f(this.f32284a != 2);
        int size = this.f32286c.size();
        for (int i10 = 0; i10 < size; i10++) {
            l0 l0Var = this.f32286c.get(i10);
            boolean z10 = l0Var.e() == -9223372036854775807L;
            if (!z10) {
                long c10 = l0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                l0Var.g(j11);
            }
        }
        if (j11 != 0 && (xVar = this.f32294k) != null) {
            xVar.h(j11);
        }
        this.f32287d.G(0);
        this.f32288e.clear();
        for (int i11 = 0; i11 < this.f32290g.size(); i11++) {
            this.f32290g.valueAt(i11).c();
        }
        this.f32301r = 0;
    }

    @Override // s3.i
    public void release() {
    }

    public z(int i10, l0 l0Var, a0.c cVar, int i11) {
        this.f32289f = (a0.c) a5.a.e(cVar);
        this.f32285b = i11;
        this.f32284a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f32286c = arrayList;
            arrayList.add(l0Var);
        } else {
            this.f32286c = Collections.singletonList(l0Var);
        }
        this.f32287d = new a5.c0(new byte[9400], 0);
        this.f32291h = new SparseBooleanArray();
        this.f32292i = new SparseBooleanArray();
        this.f32290g = new SparseArray<>();
        this.f32288e = new SparseIntArray();
        this.f32293j = new y(i11);
        this.f32295l = s3.k.f30714w0;
        this.f32302s = -1;
        w();
    }
}
