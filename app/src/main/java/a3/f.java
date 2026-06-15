package a3;

import a3.l;
import java.util.Arrays;
/* compiled from: AutoValue_LogEvent.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f303a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f304b;

    /* renamed from: c  reason: collision with root package name */
    private final long f305c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f306d;

    /* renamed from: e  reason: collision with root package name */
    private final String f307e;

    /* renamed from: f  reason: collision with root package name */
    private final long f308f;

    /* renamed from: g  reason: collision with root package name */
    private final o f309g;

    /* compiled from: AutoValue_LogEvent.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f310a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f311b;

        /* renamed from: c  reason: collision with root package name */
        private Long f312c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f313d;

        /* renamed from: e  reason: collision with root package name */
        private String f314e;

        /* renamed from: f  reason: collision with root package name */
        private Long f315f;

        /* renamed from: g  reason: collision with root package name */
        private o f316g;

        @Override // a3.l.a
        public l a() {
            String str = "";
            if (this.f310a == null) {
                str = " eventTimeMs";
            }
            if (this.f312c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f315f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f310a.longValue(), this.f311b, this.f312c.longValue(), this.f313d, this.f314e, this.f315f.longValue(), this.f316g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // a3.l.a
        public l.a b(Integer num) {
            this.f311b = num;
            return this;
        }

        @Override // a3.l.a
        public l.a c(long j10) {
            this.f310a = Long.valueOf(j10);
            return this;
        }

        @Override // a3.l.a
        public l.a d(long j10) {
            this.f312c = Long.valueOf(j10);
            return this;
        }

        @Override // a3.l.a
        public l.a e(o oVar) {
            this.f316g = oVar;
            return this;
        }

        @Override // a3.l.a
        l.a f(byte[] bArr) {
            this.f313d = bArr;
            return this;
        }

        @Override // a3.l.a
        l.a g(String str) {
            this.f314e = str;
            return this;
        }

        @Override // a3.l.a
        public l.a h(long j10) {
            this.f315f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // a3.l
    public Integer b() {
        return this.f304b;
    }

    @Override // a3.l
    public long c() {
        return this.f303a;
    }

    @Override // a3.l
    public long d() {
        return this.f305c;
    }

    @Override // a3.l
    public o e() {
        return this.f309g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f303a == lVar.c() && ((num = this.f304b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f305c == lVar.d()) {
                if (Arrays.equals(this.f306d, lVar instanceof f ? ((f) lVar).f306d : lVar.f()) && ((str = this.f307e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f308f == lVar.h()) {
                    o oVar = this.f309g;
                    if (oVar == null) {
                        if (lVar.e() == null) {
                            return true;
                        }
                    } else if (oVar.equals(lVar.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // a3.l
    public byte[] f() {
        return this.f306d;
    }

    @Override // a3.l
    public String g() {
        return this.f307e;
    }

    @Override // a3.l
    public long h() {
        return this.f308f;
    }

    public int hashCode() {
        long j10 = this.f303a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f304b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f305c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f306d)) * 1000003;
        String str = this.f307e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f308f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f309g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f303a + ", eventCode=" + this.f304b + ", eventUptimeMs=" + this.f305c + ", sourceExtension=" + Arrays.toString(this.f306d) + ", sourceExtensionJsonProto3=" + this.f307e + ", timezoneOffsetSeconds=" + this.f308f + ", networkConnectionInfo=" + this.f309g + "}";
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f303a = j10;
        this.f304b = num;
        this.f305c = j11;
        this.f306d = bArr;
        this.f307e = str;
        this.f308f = j12;
        this.f309g = oVar;
    }
}
