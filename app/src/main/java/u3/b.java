package u3;

import a5.p0;
import a5.u;
/* compiled from: IndexSeeker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final long f31338a;

    /* renamed from: b  reason: collision with root package name */
    private final u f31339b;

    /* renamed from: c  reason: collision with root package name */
    private final u f31340c;

    /* renamed from: d  reason: collision with root package name */
    private long f31341d;

    public b(long j10, long j11, long j12) {
        this.f31341d = j10;
        this.f31338a = j12;
        u uVar = new u();
        this.f31339b = uVar;
        u uVar2 = new u();
        this.f31340c = uVar2;
        uVar.a(0L);
        uVar2.a(j11);
    }

    @Override // u3.f
    public long a(long j10) {
        return this.f31339b.b(p0.f(this.f31340c, j10, true, true));
    }

    @Override // u3.f
    public long b() {
        return this.f31338a;
    }

    @Override // s3.q
    public boolean c() {
        return true;
    }

    @Override // s3.q
    public long d() {
        return this.f31341d;
    }

    public boolean e(long j10) {
        u uVar = this.f31339b;
        return j10 - uVar.b(uVar.c() - 1) < 100000;
    }

    public void f(long j10, long j11) {
        if (e(j10)) {
            return;
        }
        this.f31339b.a(j10);
        this.f31340c.a(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(long j10) {
        this.f31341d = j10;
    }
}
