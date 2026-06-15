package r;

import com.ironsource.b9;
import java.util.Arrays;
import r.b;
/* compiled from: SolverVariableValues.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j implements b.a {

    /* renamed from: n  reason: collision with root package name */
    private static float f30278n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private final int f30279a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f30280b = 16;

    /* renamed from: c  reason: collision with root package name */
    private int f30281c = 16;

    /* renamed from: d  reason: collision with root package name */
    int[] f30282d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f30283e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    int[] f30284f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    float[] f30285g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f30286h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int[] f30287i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    int f30288j = 0;

    /* renamed from: k  reason: collision with root package name */
    int f30289k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final b f30290l;

    /* renamed from: m  reason: collision with root package name */
    protected final c f30291m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b bVar, c cVar) {
        this.f30290l = bVar;
        this.f30291m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f30257c % this.f30281c;
        int[] iArr2 = this.f30282d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f30283e;
                if (iArr[i12] == -1) {
                    break;
                }
                i12 = iArr[i12];
            }
            iArr[i12] = i10;
        }
        this.f30283e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f30284f[i10] = iVar.f30257c;
        this.f30285g[i10] = f10;
        this.f30286h[i10] = -1;
        this.f30287i[i10] = -1;
        iVar.a(this.f30290l);
        iVar.f30267m++;
        this.f30288j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f30280b; i10++) {
            if (this.f30284f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f30280b * 2;
        this.f30284f = Arrays.copyOf(this.f30284f, i10);
        this.f30285g = Arrays.copyOf(this.f30285g, i10);
        this.f30286h = Arrays.copyOf(this.f30286h, i10);
        this.f30287i = Arrays.copyOf(this.f30287i, i10);
        this.f30283e = Arrays.copyOf(this.f30283e, i10);
        for (int i11 = this.f30280b; i11 < i10; i11++) {
            this.f30284f[i11] = -1;
            this.f30283e[i11] = -1;
        }
        this.f30280b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f30286h[n10] = i10;
            int[] iArr = this.f30287i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f30286h[n10] = -1;
            if (this.f30288j > 0) {
                this.f30287i[n10] = this.f30289k;
                this.f30289k = n10;
            } else {
                this.f30287i[n10] = -1;
            }
        }
        int[] iArr2 = this.f30287i;
        if (iArr2[n10] != -1) {
            this.f30286h[iArr2[n10]] = n10;
        }
        l(iVar, n10);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10 = iVar.f30257c;
        int i11 = i10 % this.f30281c;
        int[] iArr2 = this.f30282d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            return;
        }
        if (this.f30284f[i12] == i10) {
            int[] iArr3 = this.f30283e;
            iArr2[i11] = iArr3[i12];
            iArr3[i12] = -1;
            return;
        }
        while (true) {
            iArr = this.f30283e;
            if (iArr[i12] == -1 || this.f30284f[iArr[i12]] == i10) {
                break;
            }
            i12 = iArr[i12];
        }
        int i13 = iArr[i12];
        if (i13 == -1 || this.f30284f[i13] != i10) {
            return;
        }
        iArr[i12] = iArr[i13];
        iArr[i13] = -1;
    }

    @Override // r.b.a
    public i a(int i10) {
        int i11 = this.f30288j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f30289k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f30291m.f30214d[this.f30284f[i12]];
            }
            i12 = this.f30287i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // r.b.a
    public void b() {
        int i10 = this.f30288j;
        int i11 = this.f30289k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f30285g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f30287i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // r.b.a
    public boolean c(i iVar) {
        return p(iVar) != -1;
    }

    @Override // r.b.a
    public void clear() {
        int i10 = this.f30288j;
        for (int i11 = 0; i11 < i10; i11++) {
            i a10 = a(i11);
            if (a10 != null) {
                a10.c(this.f30290l);
            }
        }
        for (int i12 = 0; i12 < this.f30280b; i12++) {
            this.f30284f[i12] = -1;
            this.f30283e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f30281c; i13++) {
            this.f30282d[i13] = -1;
        }
        this.f30288j = 0;
        this.f30289k = -1;
    }

    @Override // r.b.a
    public float d(b bVar, boolean z10) {
        float g10 = g(bVar.f30205a);
        i(bVar.f30205a, z10);
        j jVar = (j) bVar.f30209e;
        int e8 = jVar.e();
        int i10 = 0;
        int i11 = 0;
        while (i10 < e8) {
            int[] iArr = jVar.f30284f;
            if (iArr[i11] != -1) {
                j(this.f30291m.f30214d[iArr[i11]], jVar.f30285g[i11] * g10, z10);
                i10++;
            }
            i11++;
        }
        return g10;
    }

    @Override // r.b.a
    public int e() {
        return this.f30288j;
    }

    @Override // r.b.a
    public float f(int i10) {
        int i11 = this.f30288j;
        int i12 = this.f30289k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f30285g[i12];
            }
            i12 = this.f30287i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // r.b.a
    public float g(i iVar) {
        int p10 = p(iVar);
        if (p10 != -1) {
            return this.f30285g[p10];
        }
        return 0.0f;
    }

    @Override // r.b.a
    public void h(i iVar, float f10) {
        float f11 = f30278n;
        if (f10 > (-f11) && f10 < f11) {
            i(iVar, true);
            return;
        }
        if (this.f30288j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f30289k = 0;
            return;
        }
        int p10 = p(iVar);
        if (p10 != -1) {
            this.f30285g[p10] = f10;
            return;
        }
        if (this.f30288j + 1 >= this.f30280b) {
            o();
        }
        int i10 = this.f30288j;
        int i11 = this.f30289k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int[] iArr = this.f30284f;
            int i14 = iArr[i11];
            int i15 = iVar.f30257c;
            if (i14 == i15) {
                this.f30285g[i11] = f10;
                return;
            }
            if (iArr[i11] < i15) {
                i12 = i11;
            }
            i11 = this.f30287i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // r.b.a
    public float i(i iVar, boolean z10) {
        int p10 = p(iVar);
        if (p10 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f30285g[p10];
        if (this.f30289k == p10) {
            this.f30289k = this.f30287i[p10];
        }
        this.f30284f[p10] = -1;
        int[] iArr = this.f30286h;
        if (iArr[p10] != -1) {
            int[] iArr2 = this.f30287i;
            iArr2[iArr[p10]] = iArr2[p10];
        }
        int[] iArr3 = this.f30287i;
        if (iArr3[p10] != -1) {
            iArr[iArr3[p10]] = iArr[p10];
        }
        this.f30288j--;
        iVar.f30267m--;
        if (z10) {
            iVar.c(this.f30290l);
        }
        return f10;
    }

    @Override // r.b.a
    public void j(i iVar, float f10, boolean z10) {
        float f11 = f30278n;
        if (f10 <= (-f11) || f10 >= f11) {
            int p10 = p(iVar);
            if (p10 == -1) {
                h(iVar, f10);
                return;
            }
            float[] fArr = this.f30285g;
            fArr[p10] = fArr[p10] + f10;
            float f12 = fArr[p10];
            float f13 = f30278n;
            if (f12 <= (-f13) || fArr[p10] >= f13) {
                return;
            }
            fArr[p10] = 0.0f;
            i(iVar, z10);
        }
    }

    @Override // r.b.a
    public void k(float f10) {
        int i10 = this.f30288j;
        int i11 = this.f30289k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f30285g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f30287i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        int[] iArr;
        if (this.f30288j != 0 && iVar != null) {
            int i10 = iVar.f30257c;
            int i11 = this.f30282d[i10 % this.f30281c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f30284f[i11] == i10) {
                return i11;
            }
            while (true) {
                iArr = this.f30283e;
                if (iArr[i11] == -1 || this.f30284f[iArr[i11]] == i10) {
                    break;
                }
                i11 = iArr[i11];
            }
            if (iArr[i11] != -1 && this.f30284f[iArr[i11]] == i10) {
                return iArr[i11];
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f30288j;
        for (int i11 = 0; i11 < i10; i11++) {
            i a10 = a(i11);
            if (a10 != null) {
                String str2 = str + a10 + " = " + f(i11) + " ";
                int p10 = p(a10);
                String str3 = str2 + "[p: ";
                String str4 = (this.f30286h[p10] != -1 ? str3 + this.f30291m.f30214d[this.f30284f[this.f30286h[p10]]] : str3 + "none") + ", n: ";
                str = (this.f30287i[p10] != -1 ? str4 + this.f30291m.f30214d[this.f30284f[this.f30287i[p10]]] : str4 + "none") + b9.i.f16698e;
            }
        }
        return str + " }";
    }
}
