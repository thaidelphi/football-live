package b5;

import java.util.Arrays;
/* compiled from: FixedFrameRateEstimator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class e {

    /* renamed from: c  reason: collision with root package name */
    private boolean f5114c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5115d;

    /* renamed from: f  reason: collision with root package name */
    private int f5117f;

    /* renamed from: a  reason: collision with root package name */
    private a f5112a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f5113b = new a();

    /* renamed from: e  reason: collision with root package name */
    private long f5116e = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FixedFrameRateEstimator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f5118a;

        /* renamed from: b  reason: collision with root package name */
        private long f5119b;

        /* renamed from: c  reason: collision with root package name */
        private long f5120c;

        /* renamed from: d  reason: collision with root package name */
        private long f5121d;

        /* renamed from: e  reason: collision with root package name */
        private long f5122e;

        /* renamed from: f  reason: collision with root package name */
        private long f5123f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f5124g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f5125h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f5122e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f5123f / j10;
        }

        public long b() {
            return this.f5123f;
        }

        public boolean d() {
            long j10 = this.f5121d;
            if (j10 == 0) {
                return false;
            }
            return this.f5124g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f5121d > 15 && this.f5125h == 0;
        }

        public void f(long j10) {
            long j11 = this.f5121d;
            if (j11 == 0) {
                this.f5118a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f5118a;
                this.f5119b = j12;
                this.f5123f = j12;
                this.f5122e = 1L;
            } else {
                long j13 = j10 - this.f5120c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f5119b) <= 1000000) {
                    this.f5122e++;
                    this.f5123f += j13;
                    boolean[] zArr = this.f5124g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        this.f5125h--;
                    }
                } else {
                    boolean[] zArr2 = this.f5124g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        this.f5125h++;
                    }
                }
            }
            this.f5121d++;
            this.f5120c = j10;
        }

        public void g() {
            this.f5121d = 0L;
            this.f5122e = 0L;
            this.f5123f = 0L;
            this.f5125h = 0;
            Arrays.fill(this.f5124g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f5112a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f5112a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f5117f;
    }

    public long d() {
        if (e()) {
            return this.f5112a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f5112a.e();
    }

    public void f(long j10) {
        this.f5112a.f(j10);
        if (this.f5112a.e() && !this.f5115d) {
            this.f5114c = false;
        } else if (this.f5116e != -9223372036854775807L) {
            if (!this.f5114c || this.f5113b.d()) {
                this.f5113b.g();
                this.f5113b.f(this.f5116e);
            }
            this.f5114c = true;
            this.f5113b.f(j10);
        }
        if (this.f5114c && this.f5113b.e()) {
            a aVar = this.f5112a;
            this.f5112a = this.f5113b;
            this.f5113b = aVar;
            this.f5114c = false;
            this.f5115d = false;
        }
        this.f5116e = j10;
        this.f5117f = this.f5112a.e() ? 0 : this.f5117f + 1;
    }

    public void g() {
        this.f5112a.g();
        this.f5113b.g();
        this.f5114c = false;
        this.f5116e = -9223372036854775807L;
        this.f5117f = 0;
    }
}
