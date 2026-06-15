package p3;
/* compiled from: MpegAudioUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f29693a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f29694b = {44100, 48000, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f29695c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f29696d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f29697e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f29698f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f29699g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* compiled from: MpegAudioUtil.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f29700a;

        /* renamed from: b  reason: collision with root package name */
        public String f29701b;

        /* renamed from: c  reason: collision with root package name */
        public int f29702c;

        /* renamed from: d  reason: collision with root package name */
        public int f29703d;

        /* renamed from: e  reason: collision with root package name */
        public int f29704e;

        /* renamed from: f  reason: collision with root package name */
        public int f29705f;

        /* renamed from: g  reason: collision with root package name */
        public int f29706g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!i0.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f29700a = i11;
            this.f29701b = i0.f29693a[3 - i12];
            int i15 = i0.f29694b[i14];
            this.f29703d = i15;
            if (i11 == 2) {
                this.f29703d = i15 / 2;
            } else if (i11 == 0) {
                this.f29703d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f29706g = i0.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? i0.f29695c[i13 - 1] : i0.f29696d[i13 - 1];
                this.f29705f = i17;
                this.f29702c = (((i17 * 12) / this.f29703d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? i0.f29697e[i13 - 1] : i0.f29698f[i13 - 1];
                    this.f29705f = i18;
                    this.f29702c = ((i18 * 144) / this.f29703d) + i16;
                } else {
                    int i19 = i0.f29699g[i13 - 1];
                    this.f29705f = i19;
                    this.f29702c = (((i12 == 1 ? 72 : 144) * i19) / this.f29703d) + i16;
                }
            }
            this.f29704e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f29694b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f29695c[i13 - 1] : f29696d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f29697e[i13 - 1] : f29698f[i13 - 1];
        } else {
            i15 = f29699g[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i15) / i16) + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        } else if (i11 != 2) {
            if (i11 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
