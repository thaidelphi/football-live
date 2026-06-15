package e3;
/* compiled from: LogEventDropped.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final c f24939c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f24940a;

    /* renamed from: b  reason: collision with root package name */
    private final b f24941b;

    /* compiled from: LogEventDropped.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f24942a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f24943b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f24942a, this.f24943b);
        }

        public a b(long j10) {
            this.f24942a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f24943b = bVar;
            return this;
        }
    }

    /* compiled from: LogEventDropped.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b implements m6.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f24952a;

        b(int i10) {
            this.f24952a = i10;
        }

        @Override // m6.c
        public int getNumber() {
            return this.f24952a;
        }
    }

    c(long j10, b bVar) {
        this.f24940a = j10;
        this.f24941b = bVar;
    }

    public static a c() {
        return new a();
    }

    @m6.d(tag = 1)
    public long a() {
        return this.f24940a;
    }

    @m6.d(tag = 3)
    public b b() {
        return this.f24941b;
    }
}
