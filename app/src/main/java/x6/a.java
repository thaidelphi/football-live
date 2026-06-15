package x6;
/* compiled from: MessagingClientEvent.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a {

    /* renamed from: p  reason: collision with root package name */
    private static final a f32755p = new C0378a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f32756a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32757b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32758c;

    /* renamed from: d  reason: collision with root package name */
    private final c f32759d;

    /* renamed from: e  reason: collision with root package name */
    private final d f32760e;

    /* renamed from: f  reason: collision with root package name */
    private final String f32761f;

    /* renamed from: g  reason: collision with root package name */
    private final String f32762g;

    /* renamed from: h  reason: collision with root package name */
    private final int f32763h;

    /* renamed from: i  reason: collision with root package name */
    private final int f32764i;

    /* renamed from: j  reason: collision with root package name */
    private final String f32765j;

    /* renamed from: k  reason: collision with root package name */
    private final long f32766k;

    /* renamed from: l  reason: collision with root package name */
    private final b f32767l;

    /* renamed from: m  reason: collision with root package name */
    private final String f32768m;

    /* renamed from: n  reason: collision with root package name */
    private final long f32769n;

    /* renamed from: o  reason: collision with root package name */
    private final String f32770o;

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: x6.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class C0378a {

        /* renamed from: a  reason: collision with root package name */
        private long f32771a = 0;

        /* renamed from: b  reason: collision with root package name */
        private String f32772b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f32773c = "";

        /* renamed from: d  reason: collision with root package name */
        private c f32774d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f32775e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f32776f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f32777g = "";

        /* renamed from: h  reason: collision with root package name */
        private int f32778h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f32779i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f32780j = "";

        /* renamed from: k  reason: collision with root package name */
        private long f32781k = 0;

        /* renamed from: l  reason: collision with root package name */
        private b f32782l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        private String f32783m = "";

        /* renamed from: n  reason: collision with root package name */
        private long f32784n = 0;

        /* renamed from: o  reason: collision with root package name */
        private String f32785o = "";

        C0378a() {
        }

        public a a() {
            return new a(this.f32771a, this.f32772b, this.f32773c, this.f32774d, this.f32775e, this.f32776f, this.f32777g, this.f32778h, this.f32779i, this.f32780j, this.f32781k, this.f32782l, this.f32783m, this.f32784n, this.f32785o);
        }

        public C0378a b(String str) {
            this.f32783m = str;
            return this;
        }

        public C0378a c(String str) {
            this.f32777g = str;
            return this;
        }

        public C0378a d(String str) {
            this.f32785o = str;
            return this;
        }

        public C0378a e(b bVar) {
            this.f32782l = bVar;
            return this;
        }

        public C0378a f(String str) {
            this.f32773c = str;
            return this;
        }

        public C0378a g(String str) {
            this.f32772b = str;
            return this;
        }

        public C0378a h(c cVar) {
            this.f32774d = cVar;
            return this;
        }

        public C0378a i(String str) {
            this.f32776f = str;
            return this;
        }

        public C0378a j(long j10) {
            this.f32771a = j10;
            return this;
        }

        public C0378a k(d dVar) {
            this.f32775e = dVar;
            return this;
        }

        public C0378a l(String str) {
            this.f32780j = str;
            return this;
        }

        public C0378a m(int i10) {
            this.f32779i = i10;
            return this;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum b implements m6.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f32790a;

        b(int i10) {
            this.f32790a = i10;
        }

        @Override // m6.c
        public int getNumber() {
            return this.f32790a;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum c implements m6.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f32796a;

        c(int i10) {
            this.f32796a = i10;
        }

        @Override // m6.c
        public int getNumber() {
            return this.f32796a;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum d implements m6.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f32802a;

        d(int i10) {
            this.f32802a = i10;
        }

        @Override // m6.c
        public int getNumber() {
            return this.f32802a;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f32756a = j10;
        this.f32757b = str;
        this.f32758c = str2;
        this.f32759d = cVar;
        this.f32760e = dVar;
        this.f32761f = str3;
        this.f32762g = str4;
        this.f32763h = i10;
        this.f32764i = i11;
        this.f32765j = str5;
        this.f32766k = j11;
        this.f32767l = bVar;
        this.f32768m = str6;
        this.f32769n = j12;
        this.f32770o = str7;
    }

    public static C0378a p() {
        return new C0378a();
    }

    @m6.d(tag = 13)
    public String a() {
        return this.f32768m;
    }

    @m6.d(tag = 11)
    public long b() {
        return this.f32766k;
    }

    @m6.d(tag = 14)
    public long c() {
        return this.f32769n;
    }

    @m6.d(tag = 7)
    public String d() {
        return this.f32762g;
    }

    @m6.d(tag = 15)
    public String e() {
        return this.f32770o;
    }

    @m6.d(tag = 12)
    public b f() {
        return this.f32767l;
    }

    @m6.d(tag = 3)
    public String g() {
        return this.f32758c;
    }

    @m6.d(tag = 2)
    public String h() {
        return this.f32757b;
    }

    @m6.d(tag = 4)
    public c i() {
        return this.f32759d;
    }

    @m6.d(tag = 6)
    public String j() {
        return this.f32761f;
    }

    @m6.d(tag = 8)
    public int k() {
        return this.f32763h;
    }

    @m6.d(tag = 1)
    public long l() {
        return this.f32756a;
    }

    @m6.d(tag = 5)
    public d m() {
        return this.f32760e;
    }

    @m6.d(tag = 10)
    public String n() {
        return this.f32765j;
    }

    @m6.d(tag = 9)
    public int o() {
        return this.f32764i;
    }
}
