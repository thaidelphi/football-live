package r9;

import java.io.IOException;
import java.util.List;
import n9.a0;
import n9.p;
import n9.t;
import n9.y;
/* compiled from: RealInterceptorChain.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class g implements t.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<t> f30462a;

    /* renamed from: b  reason: collision with root package name */
    private final q9.g f30463b;

    /* renamed from: c  reason: collision with root package name */
    private final c f30464c;

    /* renamed from: d  reason: collision with root package name */
    private final q9.c f30465d;

    /* renamed from: e  reason: collision with root package name */
    private final int f30466e;

    /* renamed from: f  reason: collision with root package name */
    private final y f30467f;

    /* renamed from: g  reason: collision with root package name */
    private final n9.e f30468g;

    /* renamed from: h  reason: collision with root package name */
    private final p f30469h;

    /* renamed from: i  reason: collision with root package name */
    private final int f30470i;

    /* renamed from: j  reason: collision with root package name */
    private final int f30471j;

    /* renamed from: k  reason: collision with root package name */
    private final int f30472k;

    /* renamed from: l  reason: collision with root package name */
    private int f30473l;

    public g(List<t> list, q9.g gVar, c cVar, q9.c cVar2, int i10, y yVar, n9.e eVar, p pVar, int i11, int i12, int i13) {
        this.f30462a = list;
        this.f30465d = cVar2;
        this.f30463b = gVar;
        this.f30464c = cVar;
        this.f30466e = i10;
        this.f30467f = yVar;
        this.f30468g = eVar;
        this.f30469h = pVar;
        this.f30470i = i11;
        this.f30471j = i12;
        this.f30472k = i13;
    }

    @Override // n9.t.a
    public int a() {
        return this.f30471j;
    }

    @Override // n9.t.a
    public y b() {
        return this.f30467f;
    }

    @Override // n9.t.a
    public int c() {
        return this.f30472k;
    }

    @Override // n9.t.a
    public int d() {
        return this.f30470i;
    }

    @Override // n9.t.a
    public a0 e(y yVar) throws IOException {
        return j(yVar, this.f30463b, this.f30464c, this.f30465d);
    }

    public n9.e f() {
        return this.f30468g;
    }

    public n9.i g() {
        return this.f30465d;
    }

    public p h() {
        return this.f30469h;
    }

    public c i() {
        return this.f30464c;
    }

    public a0 j(y yVar, q9.g gVar, c cVar, q9.c cVar2) throws IOException {
        if (this.f30466e < this.f30462a.size()) {
            this.f30473l++;
            if (this.f30464c != null && !this.f30465d.s(yVar.i())) {
                throw new IllegalStateException("network interceptor " + this.f30462a.get(this.f30466e - 1) + " must retain the same host and port");
            } else if (this.f30464c != null && this.f30473l > 1) {
                throw new IllegalStateException("network interceptor " + this.f30462a.get(this.f30466e - 1) + " must call proceed() exactly once");
            } else {
                g gVar2 = new g(this.f30462a, gVar, cVar, cVar2, this.f30466e + 1, yVar, this.f30468g, this.f30469h, this.f30470i, this.f30471j, this.f30472k);
                t tVar = this.f30462a.get(this.f30466e);
                a0 a10 = tVar.a(gVar2);
                if (cVar != null && this.f30466e + 1 < this.f30462a.size() && gVar2.f30473l != 1) {
                    throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
                } else if (a10 != null) {
                    if (a10.a() != null) {
                        return a10;
                    }
                    throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
                } else {
                    throw new NullPointerException("interceptor " + tVar + " returned null");
                }
            }
        }
        throw new AssertionError();
    }

    public q9.g k() {
        return this.f30463b;
    }
}
