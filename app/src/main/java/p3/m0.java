package p3;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.nio.ShortBuffer;
import java.util.Arrays;
/* compiled from: Sonic.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f29729a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29730b;

    /* renamed from: c  reason: collision with root package name */
    private final float f29731c;

    /* renamed from: d  reason: collision with root package name */
    private final float f29732d;

    /* renamed from: e  reason: collision with root package name */
    private final float f29733e;

    /* renamed from: f  reason: collision with root package name */
    private final int f29734f;

    /* renamed from: g  reason: collision with root package name */
    private final int f29735g;

    /* renamed from: h  reason: collision with root package name */
    private final int f29736h;

    /* renamed from: i  reason: collision with root package name */
    private final short[] f29737i;

    /* renamed from: j  reason: collision with root package name */
    private short[] f29738j;

    /* renamed from: k  reason: collision with root package name */
    private int f29739k;

    /* renamed from: l  reason: collision with root package name */
    private short[] f29740l;

    /* renamed from: m  reason: collision with root package name */
    private int f29741m;

    /* renamed from: n  reason: collision with root package name */
    private short[] f29742n;

    /* renamed from: o  reason: collision with root package name */
    private int f29743o;

    /* renamed from: p  reason: collision with root package name */
    private int f29744p;

    /* renamed from: q  reason: collision with root package name */
    private int f29745q;

    /* renamed from: r  reason: collision with root package name */
    private int f29746r;

    /* renamed from: s  reason: collision with root package name */
    private int f29747s;

    /* renamed from: t  reason: collision with root package name */
    private int f29748t;

    /* renamed from: u  reason: collision with root package name */
    private int f29749u;

    /* renamed from: v  reason: collision with root package name */
    private int f29750v;

    public m0(int i10, int i11, float f10, float f11, int i12) {
        this.f29729a = i10;
        this.f29730b = i11;
        this.f29731c = f10;
        this.f29732d = f11;
        this.f29733e = i10 / i12;
        this.f29734f = i10 / CommonGatewayClient.CODE_400;
        int i13 = i10 / 65;
        this.f29735g = i13;
        int i14 = i13 * 2;
        this.f29736h = i14;
        this.f29737i = new short[i14];
        this.f29738j = new short[i14 * i11];
        this.f29740l = new short[i14 * i11];
        this.f29742n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f29741m == i10) {
            return;
        }
        int i13 = this.f29729a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f29743o;
            if (i15 < i16 - 1) {
                while (true) {
                    i11 = this.f29744p;
                    int i17 = (i11 + 1) * i14;
                    i12 = this.f29745q;
                    if (i17 <= i12 * i13) {
                        break;
                    }
                    this.f29740l = f(this.f29740l, this.f29741m, 1);
                    int i18 = 0;
                    while (true) {
                        int i19 = this.f29730b;
                        if (i18 < i19) {
                            this.f29740l[(this.f29741m * i19) + i18] = n(this.f29742n, (i19 * i15) + i18, i13, i14);
                            i18++;
                        }
                    }
                    this.f29745q++;
                    this.f29741m++;
                }
                int i20 = i11 + 1;
                this.f29744p = i20;
                if (i20 == i13) {
                    this.f29744p = 0;
                    a5.a.f(i12 == i14);
                    this.f29745q = 0;
                }
                i15++;
            } else {
                u(i16 - 1);
                return;
            }
        }
    }

    private void b(float f10) {
        int m7;
        int i10 = this.f29739k;
        if (i10 < this.f29736h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f29746r > 0) {
                m7 = c(i11);
            } else {
                int g10 = g(this.f29738j, i11);
                if (f10 > 1.0d) {
                    m7 = g10 + w(this.f29738j, i11, f10, g10);
                } else {
                    m7 = m(this.f29738j, i11, f10, g10);
                }
            }
            i11 += m7;
        } while (this.f29736h + i11 <= i10);
        v(i11);
    }

    private int c(int i10) {
        int min = Math.min(this.f29736h, this.f29746r);
        d(this.f29738j, i10, min);
        this.f29746r -= min;
        return min;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f29740l, this.f29741m, i11);
        this.f29740l = f10;
        int i12 = this.f29730b;
        System.arraycopy(sArr, i10 * i12, f10, this.f29741m * i12, i12 * i11);
        this.f29741m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f29736h / i11;
        int i13 = this.f29730b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f29737i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f29730b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f29729a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f29730b == 1 && i13 == 1) {
            i11 = h(sArr, i10, this.f29734f, this.f29735g);
        } else {
            e(sArr, i10, i13);
            int h10 = h(this.f29737i, 0, this.f29734f / i13, this.f29735g / i13);
            if (i13 != 1) {
                int i14 = h10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f29734f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f29735g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f29730b == 1) {
                    i11 = h(sArr, i10, i16, i17);
                } else {
                    e(sArr, i10, 1);
                    i11 = h(this.f29737i, 0, i16, i17);
                }
            } else {
                i11 = h10;
            }
        }
        int i20 = q(this.f29749u, this.f29750v) ? this.f29747s : i11;
        this.f29748t = this.f29749u;
        this.f29747s = i11;
        return i20;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f29730b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f29749u = i14 / i16;
        this.f29750v = i17 / i15;
        return i16;
    }

    private int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f29746r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] f11 = f(this.f29740l, this.f29741m, i13);
        this.f29740l = f11;
        int i14 = this.f29730b;
        System.arraycopy(sArr, i10 * i14, f11, this.f29741m * i14, i14 * i11);
        p(i12, this.f29730b, this.f29740l, this.f29741m + i11, sArr, i10 + i11, sArr, i10);
        this.f29741m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f29730b];
        int i13 = this.f29745q * i11;
        int i14 = this.f29744p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void o(int i10) {
        int i11 = this.f29741m - i10;
        short[] f10 = f(this.f29742n, this.f29743o, i11);
        this.f29742n = f10;
        short[] sArr = this.f29740l;
        int i12 = this.f29730b;
        System.arraycopy(sArr, i10 * i12, f10, this.f29743o * i12, i12 * i11);
        this.f29741m = i10;
        this.f29743o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f29747s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f29748t * 3;
    }

    private void r() {
        int i10 = this.f29741m;
        float f10 = this.f29731c;
        float f11 = this.f29732d;
        float f12 = f10 / f11;
        float f13 = this.f29733e * f11;
        double d10 = f12;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            d(this.f29738j, 0, this.f29739k);
            this.f29739k = 0;
        } else {
            b(f12);
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f29742n;
        int i11 = this.f29730b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f29743o - i10) * i11);
        this.f29743o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f29739k - i10;
        short[] sArr = this.f29738j;
        int i12 = this.f29730b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f29739k = i11;
    }

    private int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f29746r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] f11 = f(this.f29740l, this.f29741m, i12);
        this.f29740l = f11;
        p(i12, this.f29730b, f11, this.f29741m, sArr, i10, sArr, i10 + i11);
        this.f29741m += i12;
        return i12;
    }

    public void i() {
        this.f29739k = 0;
        this.f29741m = 0;
        this.f29743o = 0;
        this.f29744p = 0;
        this.f29745q = 0;
        this.f29746r = 0;
        this.f29747s = 0;
        this.f29748t = 0;
        this.f29749u = 0;
        this.f29750v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f29730b, this.f29741m);
        shortBuffer.put(this.f29740l, 0, this.f29730b * min);
        int i10 = this.f29741m - min;
        this.f29741m = i10;
        short[] sArr = this.f29740l;
        int i11 = this.f29730b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f29741m * this.f29730b * 2;
    }

    public int l() {
        return this.f29739k * this.f29730b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f29739k;
        float f10 = this.f29731c;
        float f11 = this.f29732d;
        int i12 = this.f29741m + ((int) ((((i11 / (f10 / f11)) + this.f29743o) / (this.f29733e * f11)) + 0.5f));
        this.f29738j = f(this.f29738j, i11, (this.f29736h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f29736h;
            int i14 = this.f29730b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f29738j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f29739k += i10 * 2;
        r();
        if (this.f29741m > i12) {
            this.f29741m = i12;
        }
        this.f29739k = 0;
        this.f29746r = 0;
        this.f29743o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f29730b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f29738j, this.f29739k, i11);
        this.f29738j = f10;
        shortBuffer.get(f10, this.f29739k * this.f29730b, ((i10 * i11) * 2) / 2);
        this.f29739k += i11;
        r();
    }
}
