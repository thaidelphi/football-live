package g4;

import g4.g;
import java.io.IOException;
import n3.m1;
import z4.r0;
/* compiled from: InitializationChunk.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m extends f {

    /* renamed from: j  reason: collision with root package name */
    private final g f25782j;

    /* renamed from: k  reason: collision with root package name */
    private g.b f25783k;

    /* renamed from: l  reason: collision with root package name */
    private long f25784l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f25785m;

    public m(z4.l lVar, z4.p pVar, m1 m1Var, int i10, Object obj, g gVar) {
        super(lVar, pVar, 2, m1Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f25782j = gVar;
    }

    @Override // z4.j0.e
    public void a() throws IOException {
        if (this.f25784l == 0) {
            this.f25782j.b(this.f25783k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            z4.p e8 = this.f25736b.e(this.f25784l);
            r0 r0Var = this.f25743i;
            s3.e eVar = new s3.e(r0Var, e8.f33575g, r0Var.l(e8));
            while (!this.f25785m && this.f25782j.a(eVar)) {
            }
            this.f25784l = eVar.getPosition() - this.f25736b.f33575g;
        } finally {
            z4.o.a(this.f25743i);
        }
    }

    @Override // z4.j0.e
    public void b() {
        this.f25785m = true;
    }

    public void g(g.b bVar) {
        this.f25783k = bVar;
    }
}
