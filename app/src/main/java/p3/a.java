package p3;

import n3.h2;
/* compiled from: AacUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f29552a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f29553b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29554a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29555b;

        /* renamed from: c  reason: collision with root package name */
        public final String f29556c;

        private b(int i10, int i11, String str) {
            this.f29554a = i10;
            this.f29555b = i11;
            this.f29556c = str;
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            int[] iArr = f29552a;
            if (i13 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i13]) {
                i14 = i13;
            }
            i13++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f29553b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i14, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int c(a5.b0 b0Var) {
        int h10 = b0Var.h(5);
        return h10 == 31 ? b0Var.h(6) + 32 : h10;
    }

    private static int d(a5.b0 b0Var) throws h2 {
        int h10 = b0Var.h(4);
        if (h10 == 15) {
            return b0Var.h(24);
        }
        if (h10 < 13) {
            return f29552a[h10];
        }
        throw h2.a(null, null);
    }

    public static b e(a5.b0 b0Var, boolean z10) throws h2 {
        int c10 = c(b0Var);
        int d10 = d(b0Var);
        int h10 = b0Var.h(4);
        String str = "mp4a.40." + c10;
        if (c10 == 5 || c10 == 29) {
            d10 = d(b0Var);
            c10 = c(b0Var);
            if (c10 == 22) {
                h10 = b0Var.h(4);
            }
        }
        if (z10) {
            if (c10 != 1 && c10 != 2 && c10 != 3 && c10 != 4 && c10 != 6 && c10 != 7 && c10 != 17) {
                switch (c10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw h2.d("Unsupported audio object type: " + c10);
                }
            }
            g(b0Var, c10, h10);
            switch (c10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h11 = b0Var.h(2);
                    if (h11 == 2 || h11 == 3) {
                        throw h2.d("Unsupported epConfig: " + h11);
                    }
            }
        }
        int i10 = f29553b[h10];
        if (i10 != -1) {
            return new b(d10, i10, str);
        }
        throw h2.a(null, null);
    }

    public static b f(byte[] bArr) throws h2 {
        return e(new a5.b0(bArr), false);
    }

    private static void g(a5.b0 b0Var, int i10, int i11) {
        if (b0Var.g()) {
            a5.t.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (b0Var.g()) {
            b0Var.q(14);
        }
        boolean g10 = b0Var.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            b0Var.q(3);
        }
        if (g10) {
            if (i10 == 22) {
                b0Var.q(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                b0Var.q(3);
            }
            b0Var.q(1);
        }
    }
}
