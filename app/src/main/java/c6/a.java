package c6;
/* compiled from: AutoValue_StartupTime.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f5538a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5539b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5540c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j10, long j11, long j12) {
        this.f5538a = j10;
        this.f5539b = j11;
        this.f5540c = j12;
    }

    @Override // c6.l
    public long b() {
        return this.f5539b;
    }

    @Override // c6.l
    public long c() {
        return this.f5538a;
    }

    @Override // c6.l
    public long d() {
        return this.f5540c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f5538a == lVar.c() && this.f5539b == lVar.b() && this.f5540c == lVar.d();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f5538a;
        long j11 = this.f5539b;
        long j12 = this.f5540c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f5538a + ", elapsedRealtime=" + this.f5539b + ", uptimeMillis=" + this.f5540c + "}";
    }
}
