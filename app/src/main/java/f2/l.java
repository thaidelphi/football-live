package f2;

import android.os.Build;
/* compiled from: DownsampleStrategy.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f25323a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final l f25324b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final l f25325c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final l f25326d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final l f25327e;

    /* renamed from: f  reason: collision with root package name */
    public static final l f25328f;

    /* renamed from: g  reason: collision with root package name */
    public static final l f25329g;

    /* renamed from: h  reason: collision with root package name */
    public static final w1.g<l> f25330h;

    /* renamed from: i  reason: collision with root package name */
    static final boolean f25331i;

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a extends l {
        a() {
        }

        @Override // f2.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // f2.l
        public float b(int i10, int i11, int i12, int i13) {
            int min = Math.min(i11 / i13, i10 / i12);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class b extends l {
        b() {
        }

        @Override // f2.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // f2.l
        public float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return 1.0f / (max << (max >= ceil ? 0 : 1));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class c extends l {
        c() {
        }

        @Override // f2.l
        public g a(int i10, int i11, int i12, int i13) {
            if (b(i10, i11, i12, i13) == 1.0f) {
                return g.QUALITY;
            }
            return l.f25325c.a(i10, i11, i12, i13);
        }

        @Override // f2.l
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, l.f25325c.b(i10, i11, i12, i13));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class d extends l {
        d() {
        }

        @Override // f2.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // f2.l
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class e extends l {
        e() {
        }

        @Override // f2.l
        public g a(int i10, int i11, int i12, int i13) {
            if (l.f25331i) {
                return g.QUALITY;
            }
            return g.MEMORY;
        }

        @Override // f2.l
        public float b(int i10, int i11, int i12, int i13) {
            if (l.f25331i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class f extends l {
        f() {
        }

        @Override // f2.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // f2.l
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f25327e = dVar;
        f25328f = new f();
        f25329g = dVar;
        f25330h = w1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f25331i = Build.VERSION.SDK_INT >= 19;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
