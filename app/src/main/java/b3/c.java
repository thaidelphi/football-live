package b3;

import b3.n;
import java.util.Objects;
/* compiled from: AutoValue_SendRequest.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c extends n {

    /* renamed from: a  reason: collision with root package name */
    private final o f5031a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5032b;

    /* renamed from: c  reason: collision with root package name */
    private final z2.c<?> f5033c;

    /* renamed from: d  reason: collision with root package name */
    private final z2.e<?, byte[]> f5034d;

    /* renamed from: e  reason: collision with root package name */
    private final z2.b f5035e;

    /* compiled from: AutoValue_SendRequest.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends n.a {

        /* renamed from: a  reason: collision with root package name */
        private o f5036a;

        /* renamed from: b  reason: collision with root package name */
        private String f5037b;

        /* renamed from: c  reason: collision with root package name */
        private z2.c<?> f5038c;

        /* renamed from: d  reason: collision with root package name */
        private z2.e<?, byte[]> f5039d;

        /* renamed from: e  reason: collision with root package name */
        private z2.b f5040e;

        @Override // b3.n.a
        public n a() {
            String str = "";
            if (this.f5036a == null) {
                str = " transportContext";
            }
            if (this.f5037b == null) {
                str = str + " transportName";
            }
            if (this.f5038c == null) {
                str = str + " event";
            }
            if (this.f5039d == null) {
                str = str + " transformer";
            }
            if (this.f5040e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f5036a, this.f5037b, this.f5038c, this.f5039d, this.f5040e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b3.n.a
        n.a b(z2.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f5040e = bVar;
            return this;
        }

        @Override // b3.n.a
        n.a c(z2.c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f5038c = cVar;
            return this;
        }

        @Override // b3.n.a
        n.a d(z2.e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f5039d = eVar;
            return this;
        }

        @Override // b3.n.a
        public n.a e(o oVar) {
            Objects.requireNonNull(oVar, "Null transportContext");
            this.f5036a = oVar;
            return this;
        }

        @Override // b3.n.a
        public n.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f5037b = str;
            return this;
        }
    }

    @Override // b3.n
    public z2.b b() {
        return this.f5035e;
    }

    @Override // b3.n
    z2.c<?> c() {
        return this.f5033c;
    }

    @Override // b3.n
    z2.e<?, byte[]> e() {
        return this.f5034d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f5031a.equals(nVar.f()) && this.f5032b.equals(nVar.g()) && this.f5033c.equals(nVar.c()) && this.f5034d.equals(nVar.e()) && this.f5035e.equals(nVar.b());
        }
        return false;
    }

    @Override // b3.n
    public o f() {
        return this.f5031a;
    }

    @Override // b3.n
    public String g() {
        return this.f5032b;
    }

    public int hashCode() {
        return ((((((((this.f5031a.hashCode() ^ 1000003) * 1000003) ^ this.f5032b.hashCode()) * 1000003) ^ this.f5033c.hashCode()) * 1000003) ^ this.f5034d.hashCode()) * 1000003) ^ this.f5035e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f5031a + ", transportName=" + this.f5032b + ", event=" + this.f5033c + ", transformer=" + this.f5034d + ", encoding=" + this.f5035e + "}";
    }

    private c(o oVar, String str, z2.c<?> cVar, z2.e<?, byte[]> eVar, z2.b bVar) {
        this.f5031a = oVar;
        this.f5032b = str;
        this.f5033c = cVar;
        this.f5034d = eVar;
        this.f5035e = bVar;
    }
}
