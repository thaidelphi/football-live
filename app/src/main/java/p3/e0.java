package p3;

import a5.p0;
import p3.c0;
/* compiled from: DefaultAudioTrackBufferSizeProvider.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e0 implements c0.e {

    /* renamed from: b  reason: collision with root package name */
    protected final int f29663b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f29664c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f29665d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f29666e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f29667f;

    /* renamed from: g  reason: collision with root package name */
    public final int f29668g;

    /* compiled from: DefaultAudioTrackBufferSizeProvider.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f29669a = 250000;

        /* renamed from: b  reason: collision with root package name */
        private int f29670b = 750000;

        /* renamed from: c  reason: collision with root package name */
        private int f29671c = 4;

        /* renamed from: d  reason: collision with root package name */
        private int f29672d = 250000;

        /* renamed from: e  reason: collision with root package name */
        private int f29673e = 50000000;

        /* renamed from: f  reason: collision with root package name */
        private int f29674f = 2;

        public e0 g() {
            return new e0(this);
        }
    }

    protected e0(a aVar) {
        this.f29663b = aVar.f29669a;
        this.f29664c = aVar.f29670b;
        this.f29665d = aVar.f29671c;
        this.f29666e = aVar.f29672d;
        this.f29667f = aVar.f29673e;
        this.f29668g = aVar.f29674f;
    }

    protected static int b(int i10, int i11, int i12) {
        return a6.b.d(((i10 * i11) * i12) / 1000000);
    }

    protected static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    @Override // p3.c0.e
    public int a(int i10, int i11, int i12, int i13, int i14, double d10) {
        return (((Math.max(i10, (int) (c(i10, i11, i12, i13, i14) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int c(int i10, int i11, int i12, int i13, int i14) {
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return f(i11);
                }
                throw new IllegalArgumentException();
            }
            return e(i11);
        }
        return g(i10, i14, i13);
    }

    protected int e(int i10) {
        return a6.b.d((this.f29667f * d(i10)) / 1000000);
    }

    protected int f(int i10) {
        int i11 = this.f29666e;
        if (i10 == 5) {
            i11 *= this.f29668g;
        }
        return a6.b.d((i11 * d(i10)) / 1000000);
    }

    protected int g(int i10, int i11, int i12) {
        return p0.q(i10 * this.f29665d, b(this.f29663b, i11, i12), b(this.f29664c, i11, i12));
    }
}
