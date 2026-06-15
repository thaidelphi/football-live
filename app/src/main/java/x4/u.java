package x4;

import a5.p0;
import android.util.Pair;
import e4.k0;
import e4.m0;
import e4.t;
import java.util.Arrays;
import n3.a3;
import n3.b3;
import n3.l3;
import n3.z2;
/* compiled from: MappingTrackSelector.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class u extends b0 {

    /* renamed from: c  reason: collision with root package name */
    private a f32683c;

    /* compiled from: MappingTrackSelector.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f32684a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f32685b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f32686c;

        /* renamed from: d  reason: collision with root package name */
        private final m0[] f32687d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f32688e;

        /* renamed from: f  reason: collision with root package name */
        private final int[][][] f32689f;

        /* renamed from: g  reason: collision with root package name */
        private final m0 f32690g;

        a(String[] strArr, int[] iArr, m0[] m0VarArr, int[] iArr2, int[][][] iArr3, m0 m0Var) {
            this.f32685b = strArr;
            this.f32686c = iArr;
            this.f32687d = m0VarArr;
            this.f32689f = iArr3;
            this.f32688e = iArr2;
            this.f32690g = m0Var;
            this.f32684a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f32687d[i10].b(i11).f25083a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int g10 = g(i10, i11, i14);
                if (g10 == 4 || (z10 && g10 == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f32687d[i10].b(i11).b(iArr[i12]).f28185l;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !p0.c(str, str2);
                }
                i13 = Math.min(i13, z2.d(this.f32689f[i10][i11][i12]));
                i12++;
                i14 = i15;
            }
            return z10 ? Math.min(i13, this.f32688e[i10]) : i13;
        }

        public int c(int i10, int i11, int i12) {
            return this.f32689f[i10][i11][i12];
        }

        public int d() {
            return this.f32684a;
        }

        public int e(int i10) {
            return this.f32686c[i10];
        }

        public m0 f(int i10) {
            return this.f32687d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return z2.f(c(i10, i11, i12));
        }

        public m0 h() {
            return this.f32690g;
        }
    }

    private static int h(a3[] a3VarArr, k0 k0Var, int[] iArr, boolean z10) throws n3.q {
        int length = a3VarArr.length;
        boolean z11 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < a3VarArr.length; i11++) {
            a3 a3Var = a3VarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < k0Var.f25083a; i13++) {
                i12 = Math.max(i12, z2.f(a3Var.a(k0Var.b(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] i(a3 a3Var, k0 k0Var) throws n3.q {
        int[] iArr = new int[k0Var.f25083a];
        for (int i10 = 0; i10 < k0Var.f25083a; i10++) {
            iArr[i10] = a3Var.a(k0Var.b(i10));
        }
        return iArr;
    }

    private static int[] j(a3[] a3VarArr) throws n3.q {
        int length = a3VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = a3VarArr[i10].r();
        }
        return iArr;
    }

    @Override // x4.b0
    public final void e(Object obj) {
        this.f32683c = (a) obj;
    }

    @Override // x4.b0
    public final c0 f(a3[] a3VarArr, m0 m0Var, t.b bVar, l3 l3Var) throws n3.q {
        int[] i10;
        int[] iArr = new int[a3VarArr.length + 1];
        int length = a3VarArr.length + 1;
        k0[][] k0VarArr = new k0[length];
        int[][][] iArr2 = new int[a3VarArr.length + 1][];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = m0Var.f25106a;
            k0VarArr[i11] = new k0[i12];
            iArr2[i11] = new int[i12];
        }
        int[] j10 = j(a3VarArr);
        for (int i13 = 0; i13 < m0Var.f25106a; i13++) {
            k0 b10 = m0Var.b(i13);
            int h10 = h(a3VarArr, b10, iArr, b10.f25085c == 5);
            if (h10 == a3VarArr.length) {
                i10 = new int[b10.f25083a];
            } else {
                i10 = i(a3VarArr[h10], b10);
            }
            int i14 = iArr[h10];
            k0VarArr[h10][i14] = b10;
            iArr2[h10][i14] = i10;
            iArr[h10] = iArr[h10] + 1;
        }
        m0[] m0VarArr = new m0[a3VarArr.length];
        String[] strArr = new String[a3VarArr.length];
        int[] iArr3 = new int[a3VarArr.length];
        for (int i15 = 0; i15 < a3VarArr.length; i15++) {
            int i16 = iArr[i15];
            m0VarArr[i15] = new m0((k0[]) p0.H0(k0VarArr[i15], i16));
            iArr2[i15] = (int[][]) p0.H0(iArr2[i15], i16);
            strArr[i15] = a3VarArr[i15].getName();
            iArr3[i15] = a3VarArr[i15].f();
        }
        a aVar = new a(strArr, iArr3, m0VarArr, j10, iArr2, new m0((k0[]) p0.H0(k0VarArr[a3VarArr.length], iArr[a3VarArr.length])));
        Pair<b3[], s[]> k10 = k(aVar, iArr2, j10, bVar, l3Var);
        return new c0((b3[]) k10.first, (s[]) k10.second, a0.b(aVar, (v[]) k10.second), aVar);
    }

    protected abstract Pair<b3[], s[]> k(a aVar, int[][][] iArr, int[] iArr2, t.b bVar, l3 l3Var) throws n3.q;
}
