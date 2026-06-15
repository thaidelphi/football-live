package i3;

import java.util.concurrent.Executor;
/* compiled from: WorkInitializer_Factory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x implements d3.b<w> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<Executor> f26505a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a<j3.d> f26506b;

    /* renamed from: c  reason: collision with root package name */
    private final h8.a<y> f26507c;

    /* renamed from: d  reason: collision with root package name */
    private final h8.a<k3.b> f26508d;

    public x(h8.a<Executor> aVar, h8.a<j3.d> aVar2, h8.a<y> aVar3, h8.a<k3.b> aVar4) {
        this.f26505a = aVar;
        this.f26506b = aVar2;
        this.f26507c = aVar3;
        this.f26508d = aVar4;
    }

    public static x a(h8.a<Executor> aVar, h8.a<j3.d> aVar2, h8.a<y> aVar3, h8.a<k3.b> aVar4) {
        return new x(aVar, aVar2, aVar3, aVar4);
    }

    public static w c(Executor executor, j3.d dVar, y yVar, k3.b bVar) {
        return new w(executor, dVar, yVar, bVar);
    }

    @Override // h8.a
    /* renamed from: b */
    public w get() {
        return c(this.f26505a.get(), this.f26506b.get(), this.f26507c.get(), this.f26508d.get());
    }
}
