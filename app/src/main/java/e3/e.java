package e3;
/* compiled from: StorageMetrics.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    private static final e f24958c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f24959a;

    /* renamed from: b  reason: collision with root package name */
    private final long f24960b;

    /* compiled from: StorageMetrics.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f24961a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f24962b = 0;

        a() {
        }

        public e a() {
            return new e(this.f24961a, this.f24962b);
        }

        public a b(long j10) {
            this.f24961a = j10;
            return this;
        }

        public a c(long j10) {
            this.f24962b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f24959a = j10;
        this.f24960b = j11;
    }

    public static a c() {
        return new a();
    }

    @m6.d(tag = 1)
    public long a() {
        return this.f24959a;
    }

    @m6.d(tag = 2)
    public long b() {
        return this.f24960b;
    }
}
