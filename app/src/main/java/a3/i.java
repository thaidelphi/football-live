package a3;

import a3.o;
/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f332a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f333b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f334a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f335b;

        @Override // a3.o.a
        public o a() {
            return new i(this.f334a, this.f335b);
        }

        @Override // a3.o.a
        public o.a b(o.b bVar) {
            this.f335b = bVar;
            return this;
        }

        @Override // a3.o.a
        public o.a c(o.c cVar) {
            this.f334a = cVar;
            return this;
        }
    }

    @Override // a3.o
    public o.b b() {
        return this.f333b;
    }

    @Override // a3.o
    public o.c c() {
        return this.f332a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f332a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f333b;
                if (bVar == null) {
                    if (oVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(oVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f332a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f333b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f332a + ", mobileSubtype=" + this.f333b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f332a = cVar;
        this.f333b = bVar;
    }
}
