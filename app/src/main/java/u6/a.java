package u6;

import u6.d;
/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f31576a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31577b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31578c;

    /* renamed from: d  reason: collision with root package name */
    private final f f31579d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f31580e;

    /* compiled from: AutoValue_InstallationResponse.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f31581a;

        /* renamed from: b  reason: collision with root package name */
        private String f31582b;

        /* renamed from: c  reason: collision with root package name */
        private String f31583c;

        /* renamed from: d  reason: collision with root package name */
        private f f31584d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f31585e;

        @Override // u6.d.a
        public d a() {
            return new a(this.f31581a, this.f31582b, this.f31583c, this.f31584d, this.f31585e);
        }

        @Override // u6.d.a
        public d.a b(f fVar) {
            this.f31584d = fVar;
            return this;
        }

        @Override // u6.d.a
        public d.a c(String str) {
            this.f31582b = str;
            return this;
        }

        @Override // u6.d.a
        public d.a d(String str) {
            this.f31583c = str;
            return this;
        }

        @Override // u6.d.a
        public d.a e(d.b bVar) {
            this.f31585e = bVar;
            return this;
        }

        @Override // u6.d.a
        public d.a f(String str) {
            this.f31581a = str;
            return this;
        }
    }

    @Override // u6.d
    public f b() {
        return this.f31579d;
    }

    @Override // u6.d
    public String c() {
        return this.f31577b;
    }

    @Override // u6.d
    public String d() {
        return this.f31578c;
    }

    @Override // u6.d
    public d.b e() {
        return this.f31580e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f31576a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f31577b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f31578c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f31579d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f31580e;
                            if (bVar == null) {
                                if (dVar.e() == null) {
                                    return true;
                                }
                            } else if (bVar.equals(dVar.e())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // u6.d
    public String f() {
        return this.f31576a;
    }

    public int hashCode() {
        String str = this.f31576a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f31577b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f31578c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f31579d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f31580e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f31576a + ", fid=" + this.f31577b + ", refreshToken=" + this.f31578c + ", authToken=" + this.f31579d + ", responseCode=" + this.f31580e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f31576a = str;
        this.f31577b = str2;
        this.f31578c = str3;
        this.f31579d = fVar;
        this.f31580e = bVar;
    }
}
