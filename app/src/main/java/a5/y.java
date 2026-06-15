package a5;

import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: NalUnitUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f526a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f527b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f528c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int[] f529d = new int[10];

    /* compiled from: NalUnitUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f530a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f531b;

        /* renamed from: c  reason: collision with root package name */
        public final int f532c;

        /* renamed from: d  reason: collision with root package name */
        public final int f533d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f534e;

        /* renamed from: f  reason: collision with root package name */
        public final int f535f;

        /* renamed from: g  reason: collision with root package name */
        public final int f536g;

        /* renamed from: h  reason: collision with root package name */
        public final int f537h;

        /* renamed from: i  reason: collision with root package name */
        public final int f538i;

        /* renamed from: j  reason: collision with root package name */
        public final float f539j;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10) {
            this.f530a = i10;
            this.f531b = z10;
            this.f532c = i11;
            this.f533d = i12;
            this.f534e = iArr;
            this.f535f = i13;
            this.f536g = i14;
            this.f537h = i15;
            this.f538i = i16;
            this.f539j = f10;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f540a;

        /* renamed from: b  reason: collision with root package name */
        public final int f541b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f542c;

        public b(int i10, int i11, boolean z10) {
            this.f540a = i10;
            this.f541b = i11;
            this.f542c = z10;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f543a;

        /* renamed from: b  reason: collision with root package name */
        public final int f544b;

        /* renamed from: c  reason: collision with root package name */
        public final int f545c;

        /* renamed from: d  reason: collision with root package name */
        public final int f546d;

        /* renamed from: e  reason: collision with root package name */
        public final int f547e;

        /* renamed from: f  reason: collision with root package name */
        public final int f548f;

        /* renamed from: g  reason: collision with root package name */
        public final int f549g;

        /* renamed from: h  reason: collision with root package name */
        public final float f550h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f551i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f552j;

        /* renamed from: k  reason: collision with root package name */
        public final int f553k;

        /* renamed from: l  reason: collision with root package name */
        public final int f554l;

        /* renamed from: m  reason: collision with root package name */
        public final int f555m;

        /* renamed from: n  reason: collision with root package name */
        public final boolean f556n;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, boolean z10, boolean z11, int i17, int i18, int i19, boolean z12) {
            this.f543a = i10;
            this.f544b = i11;
            this.f545c = i12;
            this.f546d = i13;
            this.f547e = i14;
            this.f548f = i15;
            this.f549g = i16;
            this.f550h = f10;
            this.f551i = z10;
            this.f552j = z11;
            this.f553k = i17;
            this.f554l = i18;
            this.f555m = i19;
            this.f556n = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < position) {
                int i13 = byteBuffer.get(i10) & 255;
                if (i11 == 3) {
                    if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i10 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i13 == 0) {
                    i11++;
                }
                if (i13 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        a5.a.f(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        } else if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        } else {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                if ((bArr[i14] & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && bArr[i14] == 1) {
                        a(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
            zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
            zArr[2] = bArr[i13] == 0;
            return i11;
        }
    }

    private static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(String str, byte b10) {
        if (MimeTypes.VIDEO_H264.equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return MimeTypes.VIDEO_H265.equals(str) && ((b10 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10 + 2, i11);
    }

    public static a i(byte[] bArr, int i10, int i11) {
        d0 d0Var = new d0(bArr, i10, i11);
        d0Var.l(4);
        int e8 = d0Var.e(3);
        d0Var.k();
        int e10 = d0Var.e(2);
        boolean d10 = d0Var.d();
        int e11 = d0Var.e(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (d0Var.d()) {
                i12 |= 1 << i13;
            }
        }
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = d0Var.e(8);
        }
        int e12 = d0Var.e(8);
        int i15 = 0;
        for (int i16 = 0; i16 < e8; i16++) {
            if (d0Var.d()) {
                i15 += 89;
            }
            if (d0Var.d()) {
                i15 += 8;
            }
        }
        d0Var.l(i15);
        if (e8 > 0) {
            d0Var.l((8 - e8) * 2);
        }
        int h10 = d0Var.h();
        int h11 = d0Var.h();
        if (h11 == 3) {
            d0Var.k();
        }
        int h12 = d0Var.h();
        int h13 = d0Var.h();
        if (d0Var.d()) {
            int h14 = d0Var.h();
            int h15 = d0Var.h();
            int h16 = d0Var.h();
            int h17 = d0Var.h();
            h12 -= ((h11 == 1 || h11 == 2) ? 2 : 1) * (h14 + h15);
            h13 -= (h11 == 1 ? 2 : 1) * (h16 + h17);
        }
        d0Var.h();
        d0Var.h();
        int h18 = d0Var.h();
        for (int i17 = d0Var.d() ? 0 : e8; i17 <= e8; i17++) {
            d0Var.h();
            d0Var.h();
            d0Var.h();
        }
        d0Var.h();
        d0Var.h();
        d0Var.h();
        d0Var.h();
        d0Var.h();
        d0Var.h();
        if (d0Var.d() && d0Var.d()) {
            n(d0Var);
        }
        d0Var.l(2);
        if (d0Var.d()) {
            d0Var.l(8);
            d0Var.h();
            d0Var.h();
            d0Var.k();
        }
        p(d0Var);
        if (d0Var.d()) {
            for (int i18 = 0; i18 < d0Var.h(); i18++) {
                d0Var.l(h18 + 4 + 1);
            }
        }
        d0Var.l(2);
        float f10 = 1.0f;
        if (d0Var.d()) {
            if (d0Var.d()) {
                int e13 = d0Var.e(8);
                if (e13 == 255) {
                    int e14 = d0Var.e(16);
                    int e15 = d0Var.e(16);
                    if (e14 != 0 && e15 != 0) {
                        f10 = e14 / e15;
                    }
                } else {
                    float[] fArr = f527b;
                    if (e13 < fArr.length) {
                        f10 = fArr[e13];
                    } else {
                        t.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e13);
                    }
                }
            }
            if (d0Var.d()) {
                d0Var.k();
            }
            if (d0Var.d()) {
                d0Var.l(4);
                if (d0Var.d()) {
                    d0Var.l(24);
                }
            }
            if (d0Var.d()) {
                d0Var.h();
                d0Var.h();
            }
            d0Var.k();
            if (d0Var.d()) {
                h13 *= 2;
            }
        }
        return new a(e10, d10, e11, i12, iArr, e12, h10, h12, h13, f10);
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        d0 d0Var = new d0(bArr, i10, i11);
        int h10 = d0Var.h();
        int h11 = d0Var.h();
        d0Var.k();
        return new b(h10, h11, d0Var.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a5.y.c m(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.y.m(byte[], int, int):a5.y$c");
    }

    private static void n(d0 d0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!d0Var.d()) {
                    d0Var.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        d0Var.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        d0Var.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void o(d0 d0Var, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((d0Var.g() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    private static void p(d0 d0Var) {
        int h10 = d0Var.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i10 = -1;
        int i11 = 0;
        int i12 = -1;
        while (i11 < h10) {
            if (((i11 == 0 || !d0Var.d()) ? null : 1) != null) {
                int i13 = i10 + i12;
                int h11 = (1 - ((d0Var.d() ? 1 : 0) * 2)) * (d0Var.h() + 1);
                int i14 = i13 + 1;
                boolean[] zArr = new boolean[i14];
                for (int i15 = 0; i15 <= i13; i15++) {
                    if (!d0Var.d()) {
                        zArr[i15] = d0Var.d();
                    } else {
                        zArr[i15] = true;
                    }
                }
                int[] iArr3 = new int[i14];
                int[] iArr4 = new int[i14];
                int i16 = 0;
                for (int i17 = i12 - 1; i17 >= 0; i17--) {
                    int i18 = iArr2[i17] + h11;
                    if (i18 < 0 && zArr[i10 + i17]) {
                        iArr3[i16] = i18;
                        i16++;
                    }
                }
                if (h11 < 0 && zArr[i13]) {
                    iArr3[i16] = h11;
                    i16++;
                }
                for (int i19 = 0; i19 < i10; i19++) {
                    int i20 = iArr[i19] + h11;
                    if (i20 < 0 && zArr[i19]) {
                        iArr3[i16] = i20;
                        i16++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i16);
                int i21 = 0;
                for (int i22 = i10 - 1; i22 >= 0; i22--) {
                    int i23 = iArr[i22] + h11;
                    if (i23 > 0 && zArr[i22]) {
                        iArr4[i21] = i23;
                        i21++;
                    }
                }
                if (h11 > 0 && zArr[i13]) {
                    iArr4[i21] = h11;
                    i21++;
                }
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = iArr2[i24] + h11;
                    if (i25 > 0 && zArr[i10 + i24]) {
                        iArr4[i21] = i25;
                        i21++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i21);
                iArr = copyOf;
                i10 = i16;
                i12 = i21;
            } else {
                int h12 = d0Var.h();
                int h13 = d0Var.h();
                int[] iArr5 = new int[h12];
                for (int i26 = 0; i26 < h12; i26++) {
                    iArr5[i26] = d0Var.h() + 1;
                    d0Var.k();
                }
                int[] iArr6 = new int[h13];
                for (int i27 = 0; i27 < h13; i27++) {
                    iArr6[i27] = d0Var.h() + 1;
                    d0Var.k();
                }
                i10 = h12;
                iArr = iArr5;
                i12 = h13;
                iArr2 = iArr6;
            }
            i11++;
        }
    }

    public static int q(byte[] bArr, int i10) {
        int i11;
        synchronized (f528c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f529d;
                        if (iArr.length <= i13) {
                            f529d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f529d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f529d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
