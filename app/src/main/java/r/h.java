package r;

import java.util.Arrays;
import java.util.Comparator;
import r.b;
/* compiled from: PriorityGoalRow.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h extends r.b {

    /* renamed from: g  reason: collision with root package name */
    private int f30244g;

    /* renamed from: h  reason: collision with root package name */
    private i[] f30245h;

    /* renamed from: i  reason: collision with root package name */
    private i[] f30246i;

    /* renamed from: j  reason: collision with root package name */
    private int f30247j;

    /* renamed from: k  reason: collision with root package name */
    b f30248k;

    /* renamed from: l  reason: collision with root package name */
    c f30249l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PriorityGoalRow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f30257c - iVar2.f30257c;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        i f30251a;

        /* renamed from: b  reason: collision with root package name */
        h f30252b;

        public b(h hVar) {
            this.f30252b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f30251a.f30255a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f30263i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f30251a.f30263i[i10] = f12;
                    } else {
                        this.f30251a.f30263i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f30251a.f30263i;
                fArr[i11] = fArr[i11] + (iVar.f30263i[i11] * f10);
                if (Math.abs(fArr[i11]) < 1.0E-4f) {
                    this.f30251a.f30263i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f30251a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f30251a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f30251a.f30263i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f30251a.f30257c - ((i) obj).f30257c;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f30263i[i10];
                float f11 = this.f30251a.f30263i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void f() {
            Arrays.fill(this.f30251a.f30263i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f30251a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f30251a.f30263i[i10] + " ";
                }
            }
            return str + "] " + this.f30251a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f30244g = 128;
        this.f30245h = new i[128];
        this.f30246i = new i[128];
        this.f30247j = 0;
        this.f30248k = new b(this);
        this.f30249l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f30247j + 1;
        i[] iVarArr = this.f30245h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f30245h = iVarArr2;
            this.f30246i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f30245h;
        int i12 = this.f30247j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f30247j = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f30257c > iVar.f30257c) {
            int i14 = 0;
            while (true) {
                i10 = this.f30247j;
                if (i14 >= i10) {
                    break;
                }
                this.f30246i[i14] = this.f30245h[i14];
                i14++;
            }
            Arrays.sort(this.f30246i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f30247j; i15++) {
                this.f30245h[i15] = this.f30246i[i15];
            }
        }
        iVar.f30255a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f30247j) {
            if (this.f30245h[i10] == iVar) {
                while (true) {
                    int i11 = this.f30247j;
                    if (i10 < i11 - 1) {
                        i[] iVarArr = this.f30245h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f30247j = i11 - 1;
                        iVar.f30255a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // r.b
    public void B(d dVar, r.b bVar, boolean z10) {
        i iVar = bVar.f30205a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f30209e;
        int e8 = aVar.e();
        for (int i10 = 0; i10 < e8; i10++) {
            i a10 = aVar.a(i10);
            float f10 = aVar.f(i10);
            this.f30248k.b(a10);
            if (this.f30248k.a(iVar, f10)) {
                F(a10);
            }
            this.f30206b += bVar.f30206b * f10;
        }
        G(iVar);
    }

    @Override // r.b, r.d.a
    public void a(i iVar) {
        this.f30248k.b(iVar);
        this.f30248k.f();
        iVar.f30263i[iVar.f30259e] = 1.0f;
        F(iVar);
    }

    @Override // r.b, r.d.a
    public i b(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f30247j; i11++) {
            i iVar = this.f30245h[i11];
            if (!zArr[iVar.f30257c]) {
                this.f30248k.b(iVar);
                if (i10 == -1) {
                    if (!this.f30248k.c()) {
                    }
                    i10 = i11;
                } else {
                    if (!this.f30248k.d(this.f30245h[i10])) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f30245h[i10];
    }

    @Override // r.b, r.d.a
    public void clear() {
        this.f30247j = 0;
        this.f30206b = 0.0f;
    }

    @Override // r.b, r.d.a
    public boolean isEmpty() {
        return this.f30247j == 0;
    }

    @Override // r.b
    public String toString() {
        String str = " goal -> (" + this.f30206b + ") : ";
        for (int i10 = 0; i10 < this.f30247j; i10++) {
            this.f30248k.b(this.f30245h[i10]);
            str = str + this.f30248k + " ";
        }
        return str;
    }
}
