package r;

import java.util.Arrays;
import r.b;
/* compiled from: ArrayLinkedVariables.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f30193l = 0.001f;

    /* renamed from: b  reason: collision with root package name */
    private final b f30195b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f30196c;

    /* renamed from: a  reason: collision with root package name */
    int f30194a = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f30197d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f30198e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f30199f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f30200g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f30201h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f30202i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f30203j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f30204k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        this.f30195b = bVar;
        this.f30196c = cVar;
    }

    @Override // r.b.a
    public i a(int i10) {
        int i11 = this.f30202i;
        for (int i12 = 0; i11 != -1 && i12 < this.f30194a; i12++) {
            if (i12 == i10) {
                return this.f30196c.f30214d[this.f30199f[i11]];
            }
            i11 = this.f30200g[i11];
        }
        return null;
    }

    @Override // r.b.a
    public void b() {
        int i10 = this.f30202i;
        for (int i11 = 0; i10 != -1 && i11 < this.f30194a; i11++) {
            float[] fArr = this.f30201h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f30200g[i10];
        }
    }

    @Override // r.b.a
    public boolean c(i iVar) {
        int i10 = this.f30202i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f30194a; i11++) {
            if (this.f30199f[i10] == iVar.f30257c) {
                return true;
            }
            i10 = this.f30200g[i10];
        }
        return false;
    }

    @Override // r.b.a
    public final void clear() {
        int i10 = this.f30202i;
        for (int i11 = 0; i10 != -1 && i11 < this.f30194a; i11++) {
            i iVar = this.f30196c.f30214d[this.f30199f[i10]];
            if (iVar != null) {
                iVar.c(this.f30195b);
            }
            i10 = this.f30200g[i10];
        }
        this.f30202i = -1;
        this.f30203j = -1;
        this.f30204k = false;
        this.f30194a = 0;
    }

    @Override // r.b.a
    public float d(b bVar, boolean z10) {
        float g10 = g(bVar.f30205a);
        i(bVar.f30205a, z10);
        b.a aVar = bVar.f30209e;
        int e8 = aVar.e();
        for (int i10 = 0; i10 < e8; i10++) {
            i a10 = aVar.a(i10);
            j(a10, aVar.g(a10) * g10, z10);
        }
        return g10;
    }

    @Override // r.b.a
    public int e() {
        return this.f30194a;
    }

    @Override // r.b.a
    public float f(int i10) {
        int i11 = this.f30202i;
        for (int i12 = 0; i11 != -1 && i12 < this.f30194a; i12++) {
            if (i12 == i10) {
                return this.f30201h[i11];
            }
            i11 = this.f30200g[i11];
        }
        return 0.0f;
    }

    @Override // r.b.a
    public final float g(i iVar) {
        int i10 = this.f30202i;
        for (int i11 = 0; i10 != -1 && i11 < this.f30194a; i11++) {
            if (this.f30199f[i10] == iVar.f30257c) {
                return this.f30201h[i10];
            }
            i10 = this.f30200g[i10];
        }
        return 0.0f;
    }

    @Override // r.b.a
    public final void h(i iVar, float f10) {
        if (f10 == 0.0f) {
            i(iVar, true);
            return;
        }
        int i10 = this.f30202i;
        if (i10 == -1) {
            this.f30202i = 0;
            this.f30201h[0] = f10;
            this.f30199f[0] = iVar.f30257c;
            this.f30200g[0] = -1;
            iVar.f30267m++;
            iVar.a(this.f30195b);
            this.f30194a++;
            if (this.f30204k) {
                return;
            }
            int i11 = this.f30203j + 1;
            this.f30203j = i11;
            int[] iArr = this.f30199f;
            if (i11 >= iArr.length) {
                this.f30204k = true;
                this.f30203j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f30194a; i13++) {
            int[] iArr2 = this.f30199f;
            int i14 = iArr2[i10];
            int i15 = iVar.f30257c;
            if (i14 == i15) {
                this.f30201h[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i12 = i10;
            }
            i10 = this.f30200g[i10];
        }
        int i16 = this.f30203j;
        int i17 = i16 + 1;
        if (this.f30204k) {
            int[] iArr3 = this.f30199f;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f30199f;
        if (i16 >= iArr4.length && this.f30194a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f30199f;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f30199f;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f30197d * 2;
            this.f30197d = i19;
            this.f30204k = false;
            this.f30203j = i16 - 1;
            this.f30201h = Arrays.copyOf(this.f30201h, i19);
            this.f30199f = Arrays.copyOf(this.f30199f, this.f30197d);
            this.f30200g = Arrays.copyOf(this.f30200g, this.f30197d);
        }
        this.f30199f[i16] = iVar.f30257c;
        this.f30201h[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f30200g;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f30200g[i16] = this.f30202i;
            this.f30202i = i16;
        }
        iVar.f30267m++;
        iVar.a(this.f30195b);
        int i20 = this.f30194a + 1;
        this.f30194a = i20;
        if (!this.f30204k) {
            this.f30203j++;
        }
        int[] iArr8 = this.f30199f;
        if (i20 >= iArr8.length) {
            this.f30204k = true;
        }
        if (this.f30203j >= iArr8.length) {
            this.f30204k = true;
            this.f30203j = iArr8.length - 1;
        }
    }

    @Override // r.b.a
    public final float i(i iVar, boolean z10) {
        if (this.f30198e == iVar) {
            this.f30198e = null;
        }
        int i10 = this.f30202i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f30194a) {
            if (this.f30199f[i10] == iVar.f30257c) {
                if (i10 == this.f30202i) {
                    this.f30202i = this.f30200g[i10];
                } else {
                    int[] iArr = this.f30200g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.c(this.f30195b);
                }
                iVar.f30267m--;
                this.f30194a--;
                this.f30199f[i10] = -1;
                if (this.f30204k) {
                    this.f30203j = i10;
                }
                return this.f30201h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f30200g[i10];
        }
        return 0.0f;
    }

    @Override // r.b.a
    public void j(i iVar, float f10, boolean z10) {
        float f11 = f30193l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f30202i;
            if (i10 == -1) {
                this.f30202i = 0;
                this.f30201h[0] = f10;
                this.f30199f[0] = iVar.f30257c;
                this.f30200g[0] = -1;
                iVar.f30267m++;
                iVar.a(this.f30195b);
                this.f30194a++;
                if (this.f30204k) {
                    return;
                }
                int i11 = this.f30203j + 1;
                this.f30203j = i11;
                int[] iArr = this.f30199f;
                if (i11 >= iArr.length) {
                    this.f30204k = true;
                    this.f30203j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f30194a; i13++) {
                int[] iArr2 = this.f30199f;
                int i14 = iArr2[i10];
                int i15 = iVar.f30257c;
                if (i14 == i15) {
                    float[] fArr = this.f30201h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f30193l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f30202i) {
                            this.f30202i = this.f30200g[i10];
                        } else {
                            int[] iArr3 = this.f30200g;
                            iArr3[i12] = iArr3[i10];
                        }
                        if (z10) {
                            iVar.c(this.f30195b);
                        }
                        if (this.f30204k) {
                            this.f30203j = i10;
                        }
                        iVar.f30267m--;
                        this.f30194a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i12 = i10;
                }
                i10 = this.f30200g[i10];
            }
            int i16 = this.f30203j;
            int i17 = i16 + 1;
            if (this.f30204k) {
                int[] iArr4 = this.f30199f;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f30199f;
            if (i16 >= iArr5.length && this.f30194a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f30199f;
                    if (i18 >= iArr6.length) {
                        break;
                    } else if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr7 = this.f30199f;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.f30197d * 2;
                this.f30197d = i19;
                this.f30204k = false;
                this.f30203j = i16 - 1;
                this.f30201h = Arrays.copyOf(this.f30201h, i19);
                this.f30199f = Arrays.copyOf(this.f30199f, this.f30197d);
                this.f30200g = Arrays.copyOf(this.f30200g, this.f30197d);
            }
            this.f30199f[i16] = iVar.f30257c;
            this.f30201h[i16] = f10;
            if (i12 != -1) {
                int[] iArr8 = this.f30200g;
                iArr8[i16] = iArr8[i12];
                iArr8[i12] = i16;
            } else {
                this.f30200g[i16] = this.f30202i;
                this.f30202i = i16;
            }
            iVar.f30267m++;
            iVar.a(this.f30195b);
            this.f30194a++;
            if (!this.f30204k) {
                this.f30203j++;
            }
            int i20 = this.f30203j;
            int[] iArr9 = this.f30199f;
            if (i20 >= iArr9.length) {
                this.f30204k = true;
                this.f30203j = iArr9.length - 1;
            }
        }
    }

    @Override // r.b.a
    public void k(float f10) {
        int i10 = this.f30202i;
        for (int i11 = 0; i10 != -1 && i11 < this.f30194a; i11++) {
            float[] fArr = this.f30201h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f30200g[i10];
        }
    }

    public String toString() {
        int i10 = this.f30202i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f30194a; i11++) {
            str = ((str + " -> ") + this.f30201h[i10] + " : ") + this.f30196c.f30214d[this.f30199f[i10]];
            i10 = this.f30200g[i10];
        }
        return str;
    }
}
