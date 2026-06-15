package a3;

import a3.k;
/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f299a;

    /* renamed from: b  reason: collision with root package name */
    private final a3.a f300b;

    /* compiled from: AutoValue_ClientInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f301a;

        /* renamed from: b  reason: collision with root package name */
        private a3.a f302b;

        @Override // a3.k.a
        public k a() {
            return new e(this.f301a, this.f302b);
        }

        @Override // a3.k.a
        public k.a b(a3.a aVar) {
            this.f302b = aVar;
            return this;
        }

        @Override // a3.k.a
        public k.a c(k.b bVar) {
            this.f301a = bVar;
            return this;
        }
    }

    @Override // a3.k
    public a3.a b() {
        return this.f300b;
    }

    @Override // a3.k
    public k.b c() {
        return this.f299a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f299a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                a3.a aVar = this.f300b;
                if (aVar == null) {
                    if (kVar.b() == null) {
                        return true;
                    }
                } else if (aVar.equals(kVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f299a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a3.a aVar = this.f300b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f299a + ", androidClientInfo=" + this.f300b + "}";
    }

    private e(k.b bVar, a3.a aVar) {
        this.f299a = bVar;
        this.f300b = aVar;
    }
}
