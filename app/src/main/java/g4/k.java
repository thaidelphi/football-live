package g4;

import g4.g;
import java.io.IOException;
import n3.m1;
import z4.r0;
/* compiled from: ContainerMediaChunk.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f25774o;

    /* renamed from: p  reason: collision with root package name */
    private final long f25775p;

    /* renamed from: q  reason: collision with root package name */
    private final g f25776q;

    /* renamed from: r  reason: collision with root package name */
    private long f25777r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f25778s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f25779t;

    public k(z4.l lVar, z4.p pVar, m1 m1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(lVar, pVar, m1Var, i10, obj, j10, j11, j12, j13, j14);
        this.f25774o = i11;
        this.f25775p = j15;
        this.f25776q = gVar;
    }

    @Override // z4.j0.e
    public final void a() throws IOException {
        if (this.f25777r == 0) {
            c j10 = j();
            j10.b(this.f25775p);
            g gVar = this.f25776q;
            g.b l10 = l(j10);
            long j11 = this.f25707k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f25775p;
            long j13 = this.f25708l;
            gVar.b(l10, j12, j13 == -9223372036854775807L ? -9223372036854775807L : j13 - this.f25775p);
        }
        try {
            z4.p e8 = this.f25736b.e(this.f25777r);
            r0 r0Var = this.f25743i;
            s3.e eVar = new s3.e(r0Var, e8.f33575g, r0Var.l(e8));
            while (!this.f25778s && this.f25776q.a(eVar)) {
            }
            this.f25777r = eVar.getPosition() - this.f25736b.f33575g;
            z4.o.a(this.f25743i);
            this.f25779t = !this.f25778s;
        } catch (Throwable th) {
            z4.o.a(this.f25743i);
            throw th;
        }
    }

    @Override // z4.j0.e
    public final void b() {
        this.f25778s = true;
    }

    @Override // g4.n
    public long g() {
        return this.f25786j + this.f25774o;
    }

    @Override // g4.n
    public boolean h() {
        return this.f25779t;
    }

    protected g.b l(c cVar) {
        return cVar;
    }
}
