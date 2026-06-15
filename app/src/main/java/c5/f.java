package c5;

import a5.b0;
import a5.c0;
import a5.p0;
import c5.e;
import java.util.ArrayList;
import java.util.zip.Inflater;
/* compiled from: ProjectionDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class f {
    public static e a(byte[] bArr, int i10) {
        ArrayList<e.a> arrayList;
        c0 c0Var = new c0(bArr);
        try {
            arrayList = c(c0Var) ? f(c0Var) : e(c0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                return null;
            }
            return new e(arrayList.get(0), arrayList.get(1), i10);
        }
        return new e(arrayList.get(0), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(c0 c0Var) {
        c0Var.L(4);
        int n10 = c0Var.n();
        c0Var.K(0);
        return n10 == 1886547818;
    }

    private static e.a d(c0 c0Var) {
        int n10 = c0Var.n();
        if (n10 > 10000) {
            return null;
        }
        float[] fArr = new float[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            fArr[i10] = c0Var.m();
        }
        int n11 = c0Var.n();
        if (n11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(n10 * 2.0d) / log);
        b0 b0Var = new b0(c0Var.d());
        int i11 = 8;
        b0Var.o(c0Var.e() * 8);
        float[] fArr2 = new float[n11 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < n11) {
            int i15 = 0;
            while (i15 < i12) {
                int b10 = iArr[i15] + b(b0Var.h(ceil));
                if (b10 >= n10 || b10 < 0) {
                    return null;
                }
                fArr2[i14] = fArr[b10];
                iArr[i15] = b10;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        b0Var.o((b0Var.e() + 7) & (-8));
        int i16 = 32;
        int h10 = b0Var.h(32);
        e.b[] bVarArr = new e.b[h10];
        int i17 = 0;
        while (i17 < h10) {
            int h11 = b0Var.h(i11);
            int h12 = b0Var.h(i11);
            int h13 = b0Var.h(i16);
            if (h13 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(n11 * d10) / log);
            float[] fArr3 = new float[h13 * 3];
            float[] fArr4 = new float[h13 * 2];
            int i18 = 0;
            for (int i19 = 0; i19 < h13; i19++) {
                i18 += b(b0Var.h(ceil2));
                if (i18 < 0 || i18 >= n11) {
                    return null;
                }
                int i20 = i19 * 3;
                int i21 = i18 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i19 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
            }
            bVarArr[i17] = new e.b(h11, fArr3, fArr4, h12);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.a(bVarArr);
    }

    private static ArrayList<e.a> e(c0 c0Var) {
        if (c0Var.z() != 0) {
            return null;
        }
        c0Var.L(7);
        int n10 = c0Var.n();
        if (n10 == 1684433976) {
            c0 c0Var2 = new c0();
            Inflater inflater = new Inflater(true);
            try {
                if (!p0.r0(c0Var, c0Var2, inflater)) {
                    return null;
                }
                inflater.end();
                c0Var = c0Var2;
            } finally {
                inflater.end();
            }
        } else if (n10 != 1918990112) {
            return null;
        }
        return g(c0Var);
    }

    private static ArrayList<e.a> f(c0 c0Var) {
        int n10;
        c0Var.L(8);
        int e8 = c0Var.e();
        int f10 = c0Var.f();
        while (e8 < f10 && (n10 = c0Var.n() + e8) > e8 && n10 <= f10) {
            int n11 = c0Var.n();
            if (n11 != 2037673328 && n11 != 1836279920) {
                c0Var.K(n10);
                e8 = n10;
            } else {
                c0Var.J(n10);
                return e(c0Var);
            }
        }
        return null;
    }

    private static ArrayList<e.a> g(c0 c0Var) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int e8 = c0Var.e();
        int f10 = c0Var.f();
        while (e8 < f10) {
            int n10 = c0Var.n() + e8;
            if (n10 <= e8 || n10 > f10) {
                return null;
            }
            if (c0Var.n() == 1835365224) {
                e.a d10 = d(c0Var);
                if (d10 == null) {
                    return null;
                }
                arrayList.add(d10);
            }
            c0Var.K(n10);
            e8 = n10;
        }
        return arrayList;
    }
}
