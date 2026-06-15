package j4;

import e4.e0;
import java.io.IOException;
import n3.n1;
/* compiled from: HlsSampleStream.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class l implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f27023a;

    /* renamed from: b  reason: collision with root package name */
    private final p f27024b;

    /* renamed from: c  reason: collision with root package name */
    private int f27025c = -1;

    public l(p pVar, int i10) {
        this.f27024b = pVar;
        this.f27023a = i10;
    }

    private boolean c() {
        int i10 = this.f27025c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // e4.e0
    public void a() throws IOException {
        int i10 = this.f27025c;
        if (i10 == -2) {
            throw new q(this.f27024b.t().b(this.f27023a).b(0).f28185l);
        }
        if (i10 == -1) {
            this.f27024b.U();
        } else if (i10 != -3) {
            this.f27024b.V(i10);
        }
    }

    public void b() {
        a5.a.a(this.f27025c == -1);
        this.f27025c = this.f27024b.y(this.f27023a);
    }

    public void d() {
        if (this.f27025c != -1) {
            this.f27024b.p0(this.f27023a);
            this.f27025c = -1;
        }
    }

    @Override // e4.e0
    public int f(n1 n1Var, q3.g gVar, int i10) {
        if (this.f27025c == -3) {
            gVar.f(4);
            return -4;
        } else if (c()) {
            return this.f27024b.e0(this.f27025c, n1Var, gVar, i10);
        } else {
            return -3;
        }
    }

    @Override // e4.e0
    public boolean isReady() {
        return this.f27025c == -3 || (c() && this.f27024b.Q(this.f27025c));
    }

    @Override // e4.e0
    public int o(long j10) {
        if (c()) {
            return this.f27024b.o0(this.f27025c, j10);
        }
        return 0;
    }
}
