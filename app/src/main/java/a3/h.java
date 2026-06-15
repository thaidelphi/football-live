package a3;
/* compiled from: AutoValue_LogResponse.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f331a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(long j10) {
        this.f331a = j10;
    }

    @Override // a3.n
    public long c() {
        return this.f331a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f331a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f331a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f331a + "}";
    }
}
