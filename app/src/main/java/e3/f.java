package e3;
/* compiled from: TimeWindow.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    private static final f f24963c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f24964a;

    /* renamed from: b  reason: collision with root package name */
    private final long f24965b;

    /* compiled from: TimeWindow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f24966a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f24967b = 0;

        a() {
        }

        public f a() {
            return new f(this.f24966a, this.f24967b);
        }

        public a b(long j10) {
            this.f24967b = j10;
            return this;
        }

        public a c(long j10) {
            this.f24966a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f24964a = j10;
        this.f24965b = j11;
    }

    public static a c() {
        return new a();
    }

    @m6.d(tag = 2)
    public long a() {
        return this.f24965b;
    }

    @m6.d(tag = 1)
    public long b() {
        return this.f24964a;
    }
}
