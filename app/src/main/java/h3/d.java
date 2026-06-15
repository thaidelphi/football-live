package h3;

import i3.y;
import java.util.concurrent.Executor;
/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d implements d3.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<Executor> f26200a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a<c3.e> f26201b;

    /* renamed from: c  reason: collision with root package name */
    private final h8.a<y> f26202c;

    /* renamed from: d  reason: collision with root package name */
    private final h8.a<j3.d> f26203d;

    /* renamed from: e  reason: collision with root package name */
    private final h8.a<k3.b> f26204e;

    public d(h8.a<Executor> aVar, h8.a<c3.e> aVar2, h8.a<y> aVar3, h8.a<j3.d> aVar4, h8.a<k3.b> aVar5) {
        this.f26200a = aVar;
        this.f26201b = aVar2;
        this.f26202c = aVar3;
        this.f26203d = aVar4;
        this.f26204e = aVar5;
    }

    public static d a(h8.a<Executor> aVar, h8.a<c3.e> aVar2, h8.a<y> aVar3, h8.a<j3.d> aVar4, h8.a<k3.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, c3.e eVar, y yVar, j3.d dVar, k3.b bVar) {
        return new c(executor, eVar, yVar, dVar, bVar);
    }

    @Override // h8.a
    /* renamed from: b */
    public c get() {
        return c(this.f26200a.get(), this.f26201b.get(), this.f26202c.get(), this.f26203d.get(), this.f26204e.get());
    }
}
