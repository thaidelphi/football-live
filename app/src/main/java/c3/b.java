package c3;

import c3.g;
import java.util.Objects;
/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f5419a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5420b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f5419a = aVar;
        this.f5420b = j10;
    }

    @Override // c3.g
    public long b() {
        return this.f5420b;
    }

    @Override // c3.g
    public g.a c() {
        return this.f5419a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f5419a.equals(gVar.c()) && this.f5420b == gVar.b();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f5420b;
        return ((this.f5419a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f5419a + ", nextRequestWaitMillis=" + this.f5420b + "}";
    }
}
