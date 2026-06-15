package w3;

import java.util.Arrays;
import w3.a0;
/* compiled from: H262Reader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k implements j {

    /* renamed from: q  reason: collision with root package name */
    private static final double[] f32079q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f32080a;

    /* renamed from: b  reason: collision with root package name */
    private s3.t f32081b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f32082c;

    /* renamed from: d  reason: collision with root package name */
    private final a5.c0 f32083d;

    /* renamed from: e  reason: collision with root package name */
    private final r f32084e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f32085f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    private final a f32086g = new a(128);

    /* renamed from: h  reason: collision with root package name */
    private long f32087h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f32088i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f32089j;

    /* renamed from: k  reason: collision with root package name */
    private long f32090k;

    /* renamed from: l  reason: collision with root package name */
    private long f32091l;

    /* renamed from: m  reason: collision with root package name */
    private long f32092m;

    /* renamed from: n  reason: collision with root package name */
    private long f32093n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f32094o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f32095p;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: H262Reader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        private static final byte[] f32096e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f32097a;

        /* renamed from: b  reason: collision with root package name */
        public int f32098b;

        /* renamed from: c  reason: collision with root package name */
        public int f32099c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f32100d;

        public a(int i10) {
            this.f32100d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f32097a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f32100d;
                int length = bArr2.length;
                int i13 = this.f32098b;
                if (length < i13 + i12) {
                    this.f32100d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f32100d, this.f32098b, i12);
                this.f32098b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f32097a) {
                int i12 = this.f32098b - i11;
                this.f32098b = i12;
                if (this.f32099c == 0 && i10 == 181) {
                    this.f32099c = i12;
                } else {
                    this.f32097a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f32097a = true;
            }
            byte[] bArr = f32096e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f32097a = false;
            this.f32098b = 0;
            this.f32099c = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(c0 c0Var) {
        this.f32082c = c0Var;
        if (c0Var != null) {
            this.f32084e = new r(178, 128);
            this.f32083d = new a5.c0();
        } else {
            this.f32084e = null;
            this.f32083d = null;
        }
        this.f32091l = -9223372036854775807L;
        this.f32093n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<n3.m1, java.lang.Long> b(w3.k.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f32100d
            int r1 = r8.f32098b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            n3.m1$b r6 = new n3.m1$b
            r6.<init>()
            n3.m1$b r9 = r6.S(r9)
            java.lang.String r6 = "video/mpeg2"
            n3.m1$b r9 = r9.e0(r6)
            n3.m1$b r9 = r9.j0(r2)
            n3.m1$b r9 = r9.Q(r4)
            n3.m1$b r9 = r9.a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            n3.m1$b r9 = r9.T(r1)
            n3.m1 r9 = r9.E()
            r1 = 0
            r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + (-1)
            if (r4 < 0) goto L9c
            double[] r5 = w3.k.f32079q
            int r6 = r5.length
            if (r4 >= r6) goto L9c
            r1 = r5[r4]
            int r8 = r8.f32099c
            int r8 = r8 + 9
            r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L95
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L95:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L9c:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.k.b(w3.k$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    @Override // w3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(a5.c0 r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.k.a(a5.c0):void");
    }

    @Override // w3.j
    public void c() {
        a5.y.a(this.f32085f);
        this.f32086g.c();
        r rVar = this.f32084e;
        if (rVar != null) {
            rVar.d();
        }
        this.f32087h = 0L;
        this.f32088i = false;
        this.f32091l = -9223372036854775807L;
        this.f32093n = -9223372036854775807L;
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        this.f32080a = dVar.b();
        this.f32081b = kVar.f(dVar.c(), 2);
        c0 c0Var = this.f32082c;
        if (c0Var != null) {
            c0Var.b(kVar, dVar);
        }
    }

    @Override // w3.j
    public void e() {
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        this.f32091l = j10;
    }
}
