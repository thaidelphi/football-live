package b3;

import b3.i;
import java.util.Map;
import java.util.Objects;
/* compiled from: AutoValue_EventInternal.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f5019a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f5020b;

    /* renamed from: c  reason: collision with root package name */
    private final h f5021c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5022d;

    /* renamed from: e  reason: collision with root package name */
    private final long f5023e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f5024f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_EventInternal.java */
    /* renamed from: b3.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0102b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f5025a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f5026b;

        /* renamed from: c  reason: collision with root package name */
        private h f5027c;

        /* renamed from: d  reason: collision with root package name */
        private Long f5028d;

        /* renamed from: e  reason: collision with root package name */
        private Long f5029e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f5030f;

        @Override // b3.i.a
        public i d() {
            String str = "";
            if (this.f5025a == null) {
                str = " transportName";
            }
            if (this.f5027c == null) {
                str = str + " encodedPayload";
            }
            if (this.f5028d == null) {
                str = str + " eventMillis";
            }
            if (this.f5029e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f5030f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f5025a, this.f5026b, this.f5027c, this.f5028d.longValue(), this.f5029e.longValue(), this.f5030f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b3.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f5030f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // b3.i.a
        public i.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f5030f = map;
            return this;
        }

        @Override // b3.i.a
        public i.a g(Integer num) {
            this.f5026b = num;
            return this;
        }

        @Override // b3.i.a
        public i.a h(h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f5027c = hVar;
            return this;
        }

        @Override // b3.i.a
        public i.a i(long j10) {
            this.f5028d = Long.valueOf(j10);
            return this;
        }

        @Override // b3.i.a
        public i.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f5025a = str;
            return this;
        }

        @Override // b3.i.a
        public i.a k(long j10) {
            this.f5029e = Long.valueOf(j10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b3.i
    public Map<String, String> c() {
        return this.f5024f;
    }

    @Override // b3.i
    public Integer d() {
        return this.f5020b;
    }

    @Override // b3.i
    public h e() {
        return this.f5021c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f5019a.equals(iVar.j()) && ((num = this.f5020b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f5021c.equals(iVar.e()) && this.f5022d == iVar.f() && this.f5023e == iVar.k() && this.f5024f.equals(iVar.c());
        }
        return false;
    }

    @Override // b3.i
    public long f() {
        return this.f5022d;
    }

    public int hashCode() {
        int hashCode = (this.f5019a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5020b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f5022d;
        long j11 = this.f5023e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f5021c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f5024f.hashCode();
    }

    @Override // b3.i
    public String j() {
        return this.f5019a;
    }

    @Override // b3.i
    public long k() {
        return this.f5023e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f5019a + ", code=" + this.f5020b + ", encodedPayload=" + this.f5021c + ", eventMillis=" + this.f5022d + ", uptimeMillis=" + this.f5023e + ", autoMetadata=" + this.f5024f + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f5019a = str;
        this.f5020b = num;
        this.f5021c = hVar;
        this.f5022d = j10;
        this.f5023e = j11;
        this.f5024f = map;
    }
}
