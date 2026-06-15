package h4;

import i4.i;
/* compiled from: DashWrappingSegmentIndex.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final s3.c f26217a;

    /* renamed from: b  reason: collision with root package name */
    private final long f26218b;

    public h(s3.c cVar, long j10) {
        this.f26217a = cVar;
        this.f26218b = j10;
    }

    @Override // h4.f
    public long a(long j10) {
        return this.f26217a.f30689e[(int) j10] - this.f26218b;
    }

    @Override // h4.f
    public long b(long j10, long j11) {
        return this.f26217a.f30688d[(int) j10];
    }

    @Override // h4.f
    public long c(long j10, long j11) {
        return 0L;
    }

    @Override // h4.f
    public long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // h4.f
    public i e(long j10) {
        s3.c cVar = this.f26217a;
        int i10 = (int) j10;
        return new i(null, cVar.f30687c[i10], cVar.f30686b[i10]);
    }

    @Override // h4.f
    public long f(long j10, long j11) {
        return this.f26217a.e(j10 + this.f26218b);
    }

    @Override // h4.f
    public long g(long j10) {
        return this.f26217a.f30685a;
    }

    @Override // h4.f
    public boolean h() {
        return true;
    }

    @Override // h4.f
    public long i() {
        return 0L;
    }

    @Override // h4.f
    public long j(long j10, long j11) {
        return this.f26217a.f30685a;
    }
}
