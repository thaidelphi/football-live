package j3;

import j3.e;
/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private final long f26841b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26842c;

    /* renamed from: d  reason: collision with root package name */
    private final int f26843d;

    /* renamed from: e  reason: collision with root package name */
    private final long f26844e;

    /* renamed from: f  reason: collision with root package name */
    private final int f26845f;

    /* compiled from: AutoValue_EventStoreConfig.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f26846a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f26847b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f26848c;

        /* renamed from: d  reason: collision with root package name */
        private Long f26849d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f26850e;

        @Override // j3.e.a
        e a() {
            String str = "";
            if (this.f26846a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f26847b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f26848c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f26849d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f26850e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f26846a.longValue(), this.f26847b.intValue(), this.f26848c.intValue(), this.f26849d.longValue(), this.f26850e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j3.e.a
        e.a b(int i10) {
            this.f26848c = Integer.valueOf(i10);
            return this;
        }

        @Override // j3.e.a
        e.a c(long j10) {
            this.f26849d = Long.valueOf(j10);
            return this;
        }

        @Override // j3.e.a
        e.a d(int i10) {
            this.f26847b = Integer.valueOf(i10);
            return this;
        }

        @Override // j3.e.a
        e.a e(int i10) {
            this.f26850e = Integer.valueOf(i10);
            return this;
        }

        @Override // j3.e.a
        e.a f(long j10) {
            this.f26846a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // j3.e
    int b() {
        return this.f26843d;
    }

    @Override // j3.e
    long c() {
        return this.f26844e;
    }

    @Override // j3.e
    int d() {
        return this.f26842c;
    }

    @Override // j3.e
    int e() {
        return this.f26845f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f26841b == eVar.f() && this.f26842c == eVar.d() && this.f26843d == eVar.b() && this.f26844e == eVar.c() && this.f26845f == eVar.e();
        }
        return false;
    }

    @Override // j3.e
    long f() {
        return this.f26841b;
    }

    public int hashCode() {
        long j10 = this.f26841b;
        long j11 = this.f26844e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f26842c) * 1000003) ^ this.f26843d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f26845f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f26841b + ", loadBatchSize=" + this.f26842c + ", criticalSectionEnterTimeoutMs=" + this.f26843d + ", eventCleanUpAge=" + this.f26844e + ", maxBlobByteSizePerRow=" + this.f26845f + "}";
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f26841b = j10;
        this.f26842c = i10;
        this.f26843d = i11;
        this.f26844e = j11;
        this.f26845f = i12;
    }
}
