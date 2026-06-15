package i3;

import i3.g;
import java.util.Objects;
import java.util.Set;
/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class d extends g.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f26439a;

    /* renamed from: b  reason: collision with root package name */
    private final long f26440b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<g.c> f26441c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends g.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f26442a;

        /* renamed from: b  reason: collision with root package name */
        private Long f26443b;

        /* renamed from: c  reason: collision with root package name */
        private Set<g.c> f26444c;

        @Override // i3.g.b.a
        public g.b a() {
            String str = "";
            if (this.f26442a == null) {
                str = " delta";
            }
            if (this.f26443b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f26444c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f26442a.longValue(), this.f26443b.longValue(), this.f26444c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i3.g.b.a
        public g.b.a b(long j10) {
            this.f26442a = Long.valueOf(j10);
            return this;
        }

        @Override // i3.g.b.a
        public g.b.a c(Set<g.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f26444c = set;
            return this;
        }

        @Override // i3.g.b.a
        public g.b.a d(long j10) {
            this.f26443b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // i3.g.b
    long b() {
        return this.f26439a;
    }

    @Override // i3.g.b
    Set<g.c> c() {
        return this.f26441c;
    }

    @Override // i3.g.b
    long d() {
        return this.f26440b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g.b) {
            g.b bVar = (g.b) obj;
            return this.f26439a == bVar.b() && this.f26440b == bVar.d() && this.f26441c.equals(bVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f26439a;
        long j11 = this.f26440b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f26441c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f26439a + ", maxAllowedDelay=" + this.f26440b + ", flags=" + this.f26441c + "}";
    }

    private d(long j10, long j11, Set<g.c> set) {
        this.f26439a = j10;
        this.f26440b = j11;
        this.f26441c = set;
    }
}
