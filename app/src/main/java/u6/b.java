package u6;

import u6.f;
/* compiled from: AutoValue_TokenResult.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f31586a;

    /* renamed from: b  reason: collision with root package name */
    private final long f31587b;

    /* renamed from: c  reason: collision with root package name */
    private final f.b f31588c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: u6.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class C0364b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f31589a;

        /* renamed from: b  reason: collision with root package name */
        private Long f31590b;

        /* renamed from: c  reason: collision with root package name */
        private f.b f31591c;

        @Override // u6.f.a
        public f a() {
            String str = "";
            if (this.f31590b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f31589a, this.f31590b.longValue(), this.f31591c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u6.f.a
        public f.a b(f.b bVar) {
            this.f31591c = bVar;
            return this;
        }

        @Override // u6.f.a
        public f.a c(String str) {
            this.f31589a = str;
            return this;
        }

        @Override // u6.f.a
        public f.a d(long j10) {
            this.f31590b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // u6.f
    public f.b b() {
        return this.f31588c;
    }

    @Override // u6.f
    public String c() {
        return this.f31586a;
    }

    @Override // u6.f
    public long d() {
        return this.f31587b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f31586a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f31587b == fVar.d()) {
                    f.b bVar = this.f31588c;
                    if (bVar == null) {
                        if (fVar.b() == null) {
                            return true;
                        }
                    } else if (bVar.equals(fVar.b())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f31586a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f31587b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f31588c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f31586a + ", tokenExpirationTimestamp=" + this.f31587b + ", responseCode=" + this.f31588c + "}";
    }

    private b(String str, long j10, f.b bVar) {
        this.f31586a = str;
        this.f31587b = j10;
        this.f31588c = bVar;
    }
}
