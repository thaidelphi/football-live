package a3;

import a3.m;
import java.util.List;
/* compiled from: AutoValue_LogRequest.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f317a;

    /* renamed from: b  reason: collision with root package name */
    private final long f318b;

    /* renamed from: c  reason: collision with root package name */
    private final k f319c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f320d;

    /* renamed from: e  reason: collision with root package name */
    private final String f321e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f322f;

    /* renamed from: g  reason: collision with root package name */
    private final p f323g;

    /* compiled from: AutoValue_LogRequest.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f324a;

        /* renamed from: b  reason: collision with root package name */
        private Long f325b;

        /* renamed from: c  reason: collision with root package name */
        private k f326c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f327d;

        /* renamed from: e  reason: collision with root package name */
        private String f328e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f329f;

        /* renamed from: g  reason: collision with root package name */
        private p f330g;

        @Override // a3.m.a
        public m a() {
            String str = "";
            if (this.f324a == null) {
                str = " requestTimeMs";
            }
            if (this.f325b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f324a.longValue(), this.f325b.longValue(), this.f326c, this.f327d, this.f328e, this.f329f, this.f330g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // a3.m.a
        public m.a b(k kVar) {
            this.f326c = kVar;
            return this;
        }

        @Override // a3.m.a
        public m.a c(List<l> list) {
            this.f329f = list;
            return this;
        }

        @Override // a3.m.a
        m.a d(Integer num) {
            this.f327d = num;
            return this;
        }

        @Override // a3.m.a
        m.a e(String str) {
            this.f328e = str;
            return this;
        }

        @Override // a3.m.a
        public m.a f(p pVar) {
            this.f330g = pVar;
            return this;
        }

        @Override // a3.m.a
        public m.a g(long j10) {
            this.f324a = Long.valueOf(j10);
            return this;
        }

        @Override // a3.m.a
        public m.a h(long j10) {
            this.f325b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // a3.m
    public k b() {
        return this.f319c;
    }

    @Override // a3.m
    public List<l> c() {
        return this.f322f;
    }

    @Override // a3.m
    public Integer d() {
        return this.f320d;
    }

    @Override // a3.m
    public String e() {
        return this.f321e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f317a == mVar.g() && this.f318b == mVar.h() && ((kVar = this.f319c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f320d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f321e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f322f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
                p pVar = this.f323g;
                if (pVar == null) {
                    if (mVar.f() == null) {
                        return true;
                    }
                } else if (pVar.equals(mVar.f())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // a3.m
    public p f() {
        return this.f323g;
    }

    @Override // a3.m
    public long g() {
        return this.f317a;
    }

    @Override // a3.m
    public long h() {
        return this.f318b;
    }

    public int hashCode() {
        long j10 = this.f317a;
        long j11 = this.f318b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f319c;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f320d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f321e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f322f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f323g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f317a + ", requestUptimeMs=" + this.f318b + ", clientInfo=" + this.f319c + ", logSource=" + this.f320d + ", logSourceName=" + this.f321e + ", logEvents=" + this.f322f + ", qosTier=" + this.f323g + "}";
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f317a = j10;
        this.f318b = j11;
        this.f319c = kVar;
        this.f320d = num;
        this.f321e = str;
        this.f322f = list;
        this.f323g = pVar;
    }
}
