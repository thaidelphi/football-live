package t;

import java.util.ArrayList;
import s.d;
import s.e;
/* compiled from: BasicMeasure.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<s.e> f30818a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f30819b = new a();

    /* renamed from: c  reason: collision with root package name */
    private s.f f30820c;

    /* compiled from: BasicMeasure.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f30821k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f30822l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f30823m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f30824a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f30825b;

        /* renamed from: c  reason: collision with root package name */
        public int f30826c;

        /* renamed from: d  reason: collision with root package name */
        public int f30827d;

        /* renamed from: e  reason: collision with root package name */
        public int f30828e;

        /* renamed from: f  reason: collision with root package name */
        public int f30829f;

        /* renamed from: g  reason: collision with root package name */
        public int f30830g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f30831h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f30832i;

        /* renamed from: j  reason: collision with root package name */
        public int f30833j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: t.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0356b {
        void a();

        void b(s.e eVar, a aVar);
    }

    public b(s.f fVar) {
        this.f30820c = fVar;
    }

    private boolean a(InterfaceC0356b interfaceC0356b, s.e eVar, int i10) {
        this.f30819b.f30824a = eVar.y();
        this.f30819b.f30825b = eVar.O();
        this.f30819b.f30826c = eVar.R();
        this.f30819b.f30827d = eVar.v();
        a aVar = this.f30819b;
        aVar.f30832i = false;
        aVar.f30833j = i10;
        e.b bVar = aVar.f30824a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f30825b == bVar2;
        boolean z12 = z10 && eVar.W > 0.0f;
        boolean z13 = z11 && eVar.W > 0.0f;
        if (z12 && eVar.f30561r[0] == 4) {
            aVar.f30824a = e.b.FIXED;
        }
        if (z13 && eVar.f30561r[1] == 4) {
            aVar.f30825b = e.b.FIXED;
        }
        interfaceC0356b.b(eVar, aVar);
        eVar.U0(this.f30819b.f30828e);
        eVar.v0(this.f30819b.f30829f);
        eVar.u0(this.f30819b.f30831h);
        eVar.k0(this.f30819b.f30830g);
        a aVar2 = this.f30819b;
        aVar2.f30833j = a.f30821k;
        return aVar2.f30832i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:
        if (r8 != r9) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
        if (r5.W <= 0.0f) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(s.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<s.e> r0 = r13.D0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.B1(r1)
            t.b$b r2 = r13.r1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<s.e> r5 = r13.D0
            java.lang.Object r5 = r5.get(r4)
            s.e r5 = (s.e) r5
            boolean r6 = r5 instanceof s.g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof s.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.c0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            t.l r6 = r5.f30535e
            if (r6 == 0) goto L47
            t.n r7 = r5.f30537f
            if (r7 == 0) goto L47
            t.g r6 = r6.f30900e
            boolean r6 = r6.f30854j
            if (r6 == 0) goto L47
            t.g r6 = r7.f30900e
            boolean r6 = r6.f30854j
            if (r6 == 0) goto L47
            goto La0
        L47:
            s.e$b r6 = r5.s(r3)
            r7 = 1
            s.e$b r8 = r5.s(r7)
            s.e$b r9 = s.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f30557p
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f30559q
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.B1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof s.k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f30557p
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.Z()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f30559q
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.Z()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.W
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = t.b.a.f30821k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.b(s.f):void");
    }

    private void c(s.f fVar, String str, int i10, int i11) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.K0(0);
        fVar.J0(0);
        fVar.U0(i10);
        fVar.v0(i11);
        fVar.K0(G);
        fVar.J0(F);
        this.f30820c.b1();
    }

    public long d(s.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        int i19;
        int i20;
        s.f fVar2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i21;
        boolean z14;
        int i22;
        boolean z15;
        InterfaceC0356b r12 = fVar.r1();
        int size = fVar.D0.size();
        int R = fVar.R();
        int v10 = fVar.v();
        boolean b10 = s.j.b(i10, 128);
        boolean z16 = b10 || s.j.b(i10, 64);
        if (z16) {
            for (int i23 = 0; i23 < size; i23++) {
                s.e eVar = fVar.D0.get(i23);
                e.b y10 = eVar.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z17 = (y10 == bVar) && (eVar.O() == bVar) && eVar.t() > 0.0f;
                if ((eVar.Z() && z17) || ((eVar.b0() && z17) || (eVar instanceof s.k) || eVar.Z() || eVar.b0())) {
                    z16 = false;
                    break;
                }
            }
        }
        if (z16) {
            r.e eVar2 = r.d.f30221x;
        }
        boolean z18 = z16 & ((i13 == 1073741824 && i15 == 1073741824) || b10);
        int i24 = 2;
        if (z18) {
            int min = Math.min(fVar.E(), i14);
            int min2 = Math.min(fVar.D(), i16);
            if (i13 == 1073741824 && fVar.R() != min) {
                fVar.U0(min);
                fVar.u1();
            }
            if (i15 == 1073741824 && fVar.v() != min2) {
                fVar.v0(min2);
                fVar.u1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z10 = fVar.o1(b10);
                i19 = 2;
            } else {
                boolean p12 = fVar.p1(b10);
                if (i13 == 1073741824) {
                    p12 &= fVar.q1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    z10 = fVar.q1(b10, 1) & p12;
                    i19++;
                } else {
                    z10 = p12;
                }
            }
            if (z10) {
                fVar.Y0(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0L;
        }
        int s12 = fVar.s1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.f30818a.size();
        if (size > 0) {
            c(fVar, "First pass", R, v10);
        }
        if (size2 > 0) {
            e.b y11 = fVar.y();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z19 = y11 == bVar2;
            boolean z20 = fVar.O() == bVar2;
            int max = Math.max(fVar.R(), this.f30820c.G());
            int max2 = Math.max(fVar.v(), this.f30820c.F());
            int i25 = 0;
            boolean z21 = false;
            while (i25 < size2) {
                s.e eVar3 = this.f30818a.get(i25);
                if (eVar3 instanceof s.k) {
                    int R2 = eVar3.R();
                    i22 = s12;
                    int v11 = eVar3.v();
                    boolean a10 = a(r12, eVar3, a.f30822l) | z21;
                    int R3 = eVar3.R();
                    int v12 = eVar3.v();
                    if (R3 != R2) {
                        eVar3.U0(R3);
                        if (z19 && eVar3.K() > max) {
                            max = Math.max(max, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                        }
                        z15 = true;
                    } else {
                        z15 = a10;
                    }
                    if (v12 != v11) {
                        eVar3.v0(v12);
                        if (z20 && eVar3.p() > max2) {
                            max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                        }
                        z15 = true;
                    }
                    z21 = z15 | ((s.k) eVar3).d1();
                } else {
                    i22 = s12;
                }
                i25++;
                s12 = i22;
                i24 = 2;
            }
            i20 = s12;
            int i26 = i24;
            int i27 = 0;
            while (i27 < i26) {
                int i28 = 0;
                while (i28 < size2) {
                    s.e eVar4 = this.f30818a.get(i28);
                    if (((eVar4 instanceof s.h) && !(eVar4 instanceof s.k)) || (eVar4 instanceof s.g) || eVar4.Q() == 8 || ((z18 && eVar4.f30535e.f30900e.f30854j && eVar4.f30537f.f30900e.f30854j) || (eVar4 instanceof s.k))) {
                        z13 = z18;
                        i21 = size2;
                    } else {
                        int R4 = eVar4.R();
                        int v13 = eVar4.v();
                        z13 = z18;
                        int n10 = eVar4.n();
                        int i29 = a.f30822l;
                        i21 = size2;
                        if (i27 == 1) {
                            i29 = a.f30823m;
                        }
                        boolean a11 = a(r12, eVar4, i29) | z21;
                        int R5 = eVar4.R();
                        int v14 = eVar4.v();
                        if (R5 != R4) {
                            eVar4.U0(R5);
                            if (z19 && eVar4.K() > max) {
                                max = Math.max(max, eVar4.K() + eVar4.m(d.b.RIGHT).e());
                            }
                            z14 = true;
                        } else {
                            z14 = a11;
                        }
                        if (v14 != v13) {
                            eVar4.v0(v14);
                            if (z20 && eVar4.p() > max2) {
                                max2 = Math.max(max2, eVar4.p() + eVar4.m(d.b.BOTTOM).e());
                            }
                            z14 = true;
                        }
                        z21 = (!eVar4.U() || n10 == eVar4.n()) ? z14 : true;
                    }
                    i28++;
                    size2 = i21;
                    z18 = z13;
                }
                boolean z22 = z18;
                int i30 = size2;
                if (!z21) {
                    break;
                }
                c(fVar, "intermediate pass", R, v10);
                i27++;
                size2 = i30;
                z18 = z22;
                i26 = 2;
                z21 = false;
            }
            fVar2 = fVar;
            if (z21) {
                c(fVar2, "2nd pass", R, v10);
                if (fVar.R() < max) {
                    fVar2.U0(max);
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (fVar.v() < max2) {
                    fVar2.v0(max2);
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (z12) {
                    c(fVar2, "3rd pass", R, v10);
                }
            }
        } else {
            i20 = s12;
            fVar2 = fVar;
        }
        fVar2.E1(i20);
        return 0L;
    }

    public void e(s.f fVar) {
        this.f30818a.clear();
        int size = fVar.D0.size();
        for (int i10 = 0; i10 < size; i10++) {
            s.e eVar = fVar.D0.get(i10);
            e.b y10 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y10 == bVar || eVar.O() == bVar) {
                this.f30818a.add(eVar);
            }
        }
        fVar.u1();
    }
}
