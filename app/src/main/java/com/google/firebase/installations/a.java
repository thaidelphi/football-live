package com.google.firebase.installations;

import com.google.firebase.installations.g;
import java.util.Objects;
/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final String f14841a;

    /* renamed from: b  reason: collision with root package name */
    private final long f14842b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14843c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class b extends g.a {

        /* renamed from: a  reason: collision with root package name */
        private String f14844a;

        /* renamed from: b  reason: collision with root package name */
        private Long f14845b;

        /* renamed from: c  reason: collision with root package name */
        private Long f14846c;

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f14844a == null) {
                str = " token";
            }
            if (this.f14845b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f14846c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f14844a, this.f14845b.longValue(), this.f14846c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f14844a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j10) {
            this.f14846c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j10) {
            this.f14845b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f14841a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f14843c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f14842b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f14841a.equals(gVar.b()) && this.f14842b == gVar.d() && this.f14843c == gVar.c();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f14842b;
        long j11 = this.f14843c;
        return ((((this.f14841a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f14841a + ", tokenExpirationTimestamp=" + this.f14842b + ", tokenCreationTimestamp=" + this.f14843c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f14841a = str;
        this.f14842b = j10;
        this.f14843c = j11;
    }
}
