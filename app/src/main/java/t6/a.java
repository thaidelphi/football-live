package t6;

import java.util.Objects;
import t6.c;
import t6.d;
/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final String f31043b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f31044c;

    /* renamed from: d  reason: collision with root package name */
    private final String f31045d;

    /* renamed from: e  reason: collision with root package name */
    private final String f31046e;

    /* renamed from: f  reason: collision with root package name */
    private final long f31047f;

    /* renamed from: g  reason: collision with root package name */
    private final long f31048g;

    /* renamed from: h  reason: collision with root package name */
    private final String f31049h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f31050a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f31051b;

        /* renamed from: c  reason: collision with root package name */
        private String f31052c;

        /* renamed from: d  reason: collision with root package name */
        private String f31053d;

        /* renamed from: e  reason: collision with root package name */
        private Long f31054e;

        /* renamed from: f  reason: collision with root package name */
        private Long f31055f;

        /* renamed from: g  reason: collision with root package name */
        private String f31056g;

        @Override // t6.d.a
        public d a() {
            String str = "";
            if (this.f31051b == null) {
                str = " registrationStatus";
            }
            if (this.f31054e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f31055f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f31050a, this.f31051b, this.f31052c, this.f31053d, this.f31054e.longValue(), this.f31055f.longValue(), this.f31056g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t6.d.a
        public d.a b(String str) {
            this.f31052c = str;
            return this;
        }

        @Override // t6.d.a
        public d.a c(long j10) {
            this.f31054e = Long.valueOf(j10);
            return this;
        }

        @Override // t6.d.a
        public d.a d(String str) {
            this.f31050a = str;
            return this;
        }

        @Override // t6.d.a
        public d.a e(String str) {
            this.f31056g = str;
            return this;
        }

        @Override // t6.d.a
        public d.a f(String str) {
            this.f31053d = str;
            return this;
        }

        @Override // t6.d.a
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f31051b = aVar;
            return this;
        }

        @Override // t6.d.a
        public d.a h(long j10) {
            this.f31055f = Long.valueOf(j10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(d dVar) {
            this.f31050a = dVar.d();
            this.f31051b = dVar.g();
            this.f31052c = dVar.b();
            this.f31053d = dVar.f();
            this.f31054e = Long.valueOf(dVar.c());
            this.f31055f = Long.valueOf(dVar.h());
            this.f31056g = dVar.e();
        }
    }

    @Override // t6.d
    public String b() {
        return this.f31045d;
    }

    @Override // t6.d
    public long c() {
        return this.f31047f;
    }

    @Override // t6.d
    public String d() {
        return this.f31043b;
    }

    @Override // t6.d
    public String e() {
        return this.f31049h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str3 = this.f31043b;
            if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                if (this.f31044c.equals(dVar.g()) && ((str = this.f31045d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f31046e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f31047f == dVar.c() && this.f31048g == dVar.h()) {
                    String str4 = this.f31049h;
                    if (str4 == null) {
                        if (dVar.e() == null) {
                            return true;
                        }
                    } else if (str4.equals(dVar.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // t6.d
    public String f() {
        return this.f31046e;
    }

    @Override // t6.d
    public c.a g() {
        return this.f31044c;
    }

    @Override // t6.d
    public long h() {
        return this.f31048g;
    }

    public int hashCode() {
        String str = this.f31043b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f31044c.hashCode()) * 1000003;
        String str2 = this.f31045d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f31046e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f31047f;
        long j11 = this.f31048g;
        int i10 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f31049h;
        return i10 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // t6.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f31043b + ", registrationStatus=" + this.f31044c + ", authToken=" + this.f31045d + ", refreshToken=" + this.f31046e + ", expiresInSecs=" + this.f31047f + ", tokenCreationEpochInSecs=" + this.f31048g + ", fisError=" + this.f31049h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f31043b = str;
        this.f31044c = aVar;
        this.f31045d = str2;
        this.f31046e = str3;
        this.f31047f = j10;
        this.f31048g = j11;
        this.f31049h = str4;
    }
}
