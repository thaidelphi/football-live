package r;

import java.util.Arrays;
import java.util.HashMap;
import r.i;
import s.d;
/* compiled from: LinearSystem.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f30215r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f30216s = true;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f30217t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f30218u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f30219v = false;

    /* renamed from: w  reason: collision with root package name */
    private static int f30220w = 1000;

    /* renamed from: x  reason: collision with root package name */
    public static e f30221x;

    /* renamed from: y  reason: collision with root package name */
    public static long f30222y;

    /* renamed from: z  reason: collision with root package name */
    public static long f30223z;

    /* renamed from: d  reason: collision with root package name */
    private a f30227d;

    /* renamed from: g  reason: collision with root package name */
    r.b[] f30230g;

    /* renamed from: n  reason: collision with root package name */
    final c f30237n;

    /* renamed from: q  reason: collision with root package name */
    private a f30240q;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30224a = false;

    /* renamed from: b  reason: collision with root package name */
    int f30225b = 0;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, i> f30226c = null;

    /* renamed from: e  reason: collision with root package name */
    private int f30228e = 32;

    /* renamed from: f  reason: collision with root package name */
    private int f30229f = 32;

    /* renamed from: h  reason: collision with root package name */
    public boolean f30231h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f30232i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean[] f30233j = new boolean[32];

    /* renamed from: k  reason: collision with root package name */
    int f30234k = 1;

    /* renamed from: l  reason: collision with root package name */
    int f30235l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f30236m = 32;

    /* renamed from: o  reason: collision with root package name */
    private i[] f30238o = new i[f30220w];

    /* renamed from: p  reason: collision with root package name */
    private int f30239p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends r.b {
        public b(c cVar) {
            this.f30209e = new j(this, cVar);
        }
    }

    public d() {
        this.f30230g = null;
        this.f30230g = new r.b[32];
        C();
        c cVar = new c();
        this.f30237n = cVar;
        this.f30227d = new h(cVar);
        if (f30219v) {
            this.f30240q = new b(cVar);
        } else {
            this.f30240q = new r.b(cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f30234k; i10++) {
            this.f30233j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f30234k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f30233j[aVar.getKey().f30257c] = true;
            }
            i b10 = aVar.b(this, this.f30233j);
            if (b10 != null) {
                boolean[] zArr = this.f30233j;
                int i12 = b10.f30257c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (b10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f30235l; i14++) {
                    r.b bVar = this.f30230g[i14];
                    if (bVar.f30205a.f30264j != i.a.UNRESTRICTED && !bVar.f30210f && bVar.t(b10)) {
                        float g10 = bVar.f30209e.g(b10);
                        if (g10 < 0.0f) {
                            float f11 = (-bVar.f30206b) / g10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    r.b bVar2 = this.f30230g[i13];
                    bVar2.f30205a.f30258d = -1;
                    bVar2.x(b10);
                    i iVar = bVar2.f30205a;
                    iVar.f30258d = i13;
                    iVar.g(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f30219v) {
            while (i10 < this.f30235l) {
                r.b bVar = this.f30230g[i10];
                if (bVar != null) {
                    this.f30237n.f30211a.a(bVar);
                }
                this.f30230g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f30235l) {
            r.b bVar2 = this.f30230g[i10];
            if (bVar2 != null) {
                this.f30237n.f30212b.a(bVar2);
            }
            this.f30230g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i b10 = this.f30237n.f30213c.b();
        if (b10 == null) {
            b10 = new i(aVar, str);
            b10.f(aVar, str);
        } else {
            b10.d();
            b10.f(aVar, str);
        }
        int i10 = this.f30239p;
        int i11 = f30220w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f30220w = i12;
            this.f30238o = (i[]) Arrays.copyOf(this.f30238o, i12);
        }
        i[] iVarArr = this.f30238o;
        int i13 = this.f30239p;
        this.f30239p = i13 + 1;
        iVarArr[i13] = b10;
        return b10;
    }

    private final void l(r.b bVar) {
        int i10;
        if (f30217t && bVar.f30210f) {
            bVar.f30205a.e(this, bVar.f30206b);
        } else {
            r.b[] bVarArr = this.f30230g;
            int i11 = this.f30235l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f30205a;
            iVar.f30258d = i11;
            this.f30235l = i11 + 1;
            iVar.g(this, bVar);
        }
        if (f30217t && this.f30224a) {
            int i12 = 0;
            while (i12 < this.f30235l) {
                if (this.f30230g[i12] == null) {
                    System.out.println("WTF");
                }
                r.b[] bVarArr2 = this.f30230g;
                if (bVarArr2[i12] != null && bVarArr2[i12].f30210f) {
                    r.b bVar2 = bVarArr2[i12];
                    bVar2.f30205a.e(this, bVar2.f30206b);
                    if (f30219v) {
                        this.f30237n.f30211a.a(bVar2);
                    } else {
                        this.f30237n.f30212b.a(bVar2);
                    }
                    this.f30230g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f30235l;
                        if (i13 >= i10) {
                            break;
                        }
                        r.b[] bVarArr3 = this.f30230g;
                        int i15 = i13 - 1;
                        bVarArr3[i15] = bVarArr3[i13];
                        if (bVarArr3[i15].f30205a.f30258d == i13) {
                            bVarArr3[i15].f30205a.f30258d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f30230g[i14] = null;
                    }
                    this.f30235l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f30224a = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f30235l; i10++) {
            r.b bVar = this.f30230g[i10];
            bVar.f30205a.f30260f = bVar.f30206b;
        }
    }

    public static r.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) throws Exception {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f30235l) {
                z10 = false;
                break;
            }
            r.b[] bVarArr = this.f30230g;
            if (bVarArr[i10].f30205a.f30264j != i.a.UNRESTRICTED && bVarArr[i10].f30206b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                i11++;
                float f10 = Float.MAX_VALUE;
                int i12 = -1;
                int i13 = -1;
                int i14 = 0;
                for (int i15 = 0; i15 < this.f30235l; i15++) {
                    r.b bVar = this.f30230g[i15];
                    if (bVar.f30205a.f30264j != i.a.UNRESTRICTED && !bVar.f30210f && bVar.f30206b < 0.0f) {
                        int i16 = 9;
                        if (f30218u) {
                            int e8 = bVar.f30209e.e();
                            int i17 = 0;
                            while (i17 < e8) {
                                i a10 = bVar.f30209e.a(i17);
                                float g10 = bVar.f30209e.g(a10);
                                if (g10 > 0.0f) {
                                    int i18 = 0;
                                    while (i18 < i16) {
                                        float f11 = a10.f30262h[i18] / g10;
                                        if ((f11 < f10 && i18 == i14) || i18 > i14) {
                                            i13 = a10.f30257c;
                                            i14 = i18;
                                            i12 = i15;
                                            f10 = f11;
                                        }
                                        i18++;
                                        i16 = 9;
                                    }
                                }
                                i17++;
                                i16 = 9;
                            }
                        } else {
                            for (int i19 = 1; i19 < this.f30234k; i19++) {
                                i iVar = this.f30237n.f30214d[i19];
                                float g11 = bVar.f30209e.g(iVar);
                                if (g11 > 0.0f) {
                                    for (int i20 = 0; i20 < 9; i20++) {
                                        float f12 = iVar.f30262h[i20] / g11;
                                        if ((f12 < f10 && i20 == i14) || i20 > i14) {
                                            i13 = i19;
                                            i12 = i15;
                                            i14 = i20;
                                            f10 = f12;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i12 != -1) {
                    r.b bVar2 = this.f30230g[i12];
                    bVar2.f30205a.f30258d = -1;
                    bVar2.x(this.f30237n.f30214d[i13]);
                    i iVar2 = bVar2.f30205a;
                    iVar2.f30258d = i12;
                    iVar2.g(this, bVar2);
                } else {
                    z11 = true;
                }
                if (i11 > this.f30234k / 2) {
                    z11 = true;
                }
            }
            return i11;
        }
        return 0;
    }

    public static e w() {
        return f30221x;
    }

    private void y() {
        int i10 = this.f30228e * 2;
        this.f30228e = i10;
        this.f30230g = (r.b[]) Arrays.copyOf(this.f30230g, i10);
        c cVar = this.f30237n;
        cVar.f30214d = (i[]) Arrays.copyOf(cVar.f30214d, this.f30228e);
        int i11 = this.f30228e;
        this.f30233j = new boolean[i11];
        this.f30229f = i11;
        this.f30236m = i11;
    }

    void A(a aVar) throws Exception {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f30237n;
            i[] iVarArr = cVar.f30214d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.d();
            }
            i10++;
        }
        cVar.f30213c.c(this.f30238o, this.f30239p);
        this.f30239p = 0;
        Arrays.fill(this.f30237n.f30214d, (Object) null);
        HashMap<String, i> hashMap = this.f30226c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f30225b = 0;
        this.f30227d.clear();
        this.f30234k = 1;
        for (int i11 = 0; i11 < this.f30235l; i11++) {
            r.b[] bVarArr = this.f30230g;
            if (bVarArr[i11] != null) {
                bVarArr[i11].f30207c = false;
            }
        }
        C();
        this.f30235l = 0;
        if (f30219v) {
            this.f30240q = new b(this.f30237n);
        } else {
            this.f30240q = new r.b(this.f30237n);
        }
    }

    public void b(s.e eVar, s.e eVar2, float f10, int i10) {
        d.b bVar = d.b.LEFT;
        i q10 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q11 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q12 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q13 = q(eVar.m(bVar4));
        i q14 = q(eVar2.m(bVar));
        i q15 = q(eVar2.m(bVar2));
        i q16 = q(eVar2.m(bVar3));
        i q17 = q(eVar2.m(bVar4));
        r.b r10 = r();
        double d10 = f10;
        double d11 = i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        r.b r11 = r();
        r11.q(q10, q12, q14, q16, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        r.b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            r10.d(this, i12);
        }
        d(r10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(r.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f30235l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f30236m
            if (r0 >= r2) goto L12
            int r0 = r5.f30234k
            int r0 = r0 + r1
            int r2 = r5.f30229f
            if (r0 < r2) goto L15
        L12:
            r5.y()
        L15:
            r0 = 0
            boolean r2 = r6.f30210f
            if (r2 != 0) goto L84
            r6.D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L7b
            r.i r2 = r5.p()
            r6.f30205a = r2
            int r3 = r5.f30235l
            r5.l(r6)
            int r4 = r5.f30235l
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            r.d$a r0 = r5.f30240q
            r0.c(r6)
            r.d$a r0 = r5.f30240q
            r5.B(r0, r1)
            int r0 = r2.f30258d
            r3 = -1
            if (r0 != r3) goto L7c
            r.i r0 = r6.f30205a
            if (r0 != r2) goto L59
            r.i r0 = r6.v(r2)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f30210f
            if (r0 != 0) goto L62
            r.i r0 = r6.f30205a
            r0.g(r5, r6)
        L62:
            boolean r0 = r.d.f30219v
            if (r0 == 0) goto L6e
            r.c r0 = r5.f30237n
            r.f<r.b> r0 = r0.f30211a
            r0.a(r6)
            goto L75
        L6e:
            r.c r0 = r5.f30237n
            r.f<r.b> r0 = r0.f30212b
            r0.a(r6)
        L75:
            int r0 = r5.f30235l
            int r0 = r0 - r1
            r5.f30235l = r0
            goto L7c
        L7b:
            r1 = r0
        L7c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L83
            return
        L83:
            r0 = r1
        L84:
            if (r0 != 0) goto L89
            r5.l(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.d.d(r.b):void");
    }

    public r.b e(i iVar, i iVar2, int i10, int i11) {
        if (f30216s && i11 == 8 && iVar2.f30261g && iVar.f30258d == -1) {
            iVar.e(this, iVar2.f30260f + i10);
            return null;
        }
        r.b r10 = r();
        r10.n(iVar, iVar2, i10);
        if (i11 != 8) {
            r10.d(this, i11);
        }
        d(r10);
        return r10;
    }

    public void f(i iVar, int i10) {
        if (f30216s && iVar.f30258d == -1) {
            float f10 = i10;
            iVar.e(this, f10);
            for (int i11 = 0; i11 < this.f30225b + 1; i11++) {
                i iVar2 = this.f30237n.f30214d[i11];
                if (iVar2 != null && iVar2.f30268n && iVar2.f30269o == iVar.f30257c) {
                    iVar2.e(this, iVar2.f30270p + f10);
                }
            }
            return;
        }
        int i12 = iVar.f30258d;
        if (i12 != -1) {
            r.b bVar = this.f30230g[i12];
            if (bVar.f30210f) {
                bVar.f30206b = i10;
                return;
            } else if (bVar.f30209e.e() == 0) {
                bVar.f30210f = true;
                bVar.f30206b = i10;
                return;
            } else {
                r.b r10 = r();
                r10.m(iVar, i10);
                d(r10);
                return;
            }
        }
        r.b r11 = r();
        r11.i(iVar, i10);
        d(r11);
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        r.b r10 = r();
        i t10 = t();
        t10.f30259e = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        r.b r10 = r();
        i t10 = t();
        t10.f30259e = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f30209e.g(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        r.b r10 = r();
        i t10 = t();
        t10.f30259e = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        r.b r10 = r();
        i t10 = t();
        t10.f30259e = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f30209e.g(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        r.b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    void m(r.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f30234k + 1 >= this.f30229f) {
            y();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f30225b + 1;
        this.f30225b = i11;
        this.f30234k++;
        a10.f30257c = i11;
        a10.f30259e = i10;
        this.f30237n.f30214d[i11] = a10;
        this.f30227d.a(a10);
        return a10;
    }

    public i p() {
        if (this.f30234k + 1 >= this.f30229f) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f30225b + 1;
        this.f30225b = i10;
        this.f30234k++;
        a10.f30257c = i10;
        this.f30237n.f30214d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f30234k + 1 >= this.f30229f) {
            y();
        }
        if (obj instanceof s.d) {
            s.d dVar = (s.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.f30237n);
                iVar = dVar.h();
            }
            int i10 = iVar.f30257c;
            if (i10 == -1 || i10 > this.f30225b || this.f30237n.f30214d[i10] == null) {
                if (i10 != -1) {
                    iVar.d();
                }
                int i11 = this.f30225b + 1;
                this.f30225b = i11;
                this.f30234k++;
                iVar.f30257c = i11;
                iVar.f30264j = i.a.UNRESTRICTED;
                this.f30237n.f30214d[i11] = iVar;
            }
        }
        return iVar;
    }

    public r.b r() {
        r.b b10;
        if (f30219v) {
            b10 = this.f30237n.f30211a.b();
            if (b10 == null) {
                b10 = new b(this.f30237n);
                f30223z++;
            } else {
                b10.y();
            }
        } else {
            b10 = this.f30237n.f30212b.b();
            if (b10 == null) {
                b10 = new r.b(this.f30237n);
                f30222y++;
            } else {
                b10.y();
            }
        }
        i.b();
        return b10;
    }

    public i t() {
        if (this.f30234k + 1 >= this.f30229f) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f30225b + 1;
        this.f30225b = i10;
        this.f30234k++;
        a10.f30257c = i10;
        this.f30237n.f30214d[i10] = a10;
        return a10;
    }

    public c v() {
        return this.f30237n;
    }

    public int x(Object obj) {
        i h10 = ((s.d) obj).h();
        if (h10 != null) {
            return (int) (h10.f30260f + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (this.f30227d.isEmpty()) {
            n();
        } else if (!this.f30231h && !this.f30232i) {
            A(this.f30227d);
        } else {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f30235l) {
                    z10 = true;
                    break;
                } else if (!this.f30230g[i10].f30210f) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                A(this.f30227d);
            } else {
                n();
            }
        }
    }
}
