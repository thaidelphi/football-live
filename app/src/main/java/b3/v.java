package b3;

import i3.w;
/* compiled from: TransportRuntime_Factory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v implements d3.b<t> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<l3.a> f5081a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a<l3.a> f5082b;

    /* renamed from: c  reason: collision with root package name */
    private final h8.a<h3.e> f5083c;

    /* renamed from: d  reason: collision with root package name */
    private final h8.a<i3.s> f5084d;

    /* renamed from: e  reason: collision with root package name */
    private final h8.a<w> f5085e;

    public v(h8.a<l3.a> aVar, h8.a<l3.a> aVar2, h8.a<h3.e> aVar3, h8.a<i3.s> aVar4, h8.a<w> aVar5) {
        this.f5081a = aVar;
        this.f5082b = aVar2;
        this.f5083c = aVar3;
        this.f5084d = aVar4;
        this.f5085e = aVar5;
    }

    public static v a(h8.a<l3.a> aVar, h8.a<l3.a> aVar2, h8.a<h3.e> aVar3, h8.a<i3.s> aVar4, h8.a<w> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(l3.a aVar, l3.a aVar2, h3.e eVar, i3.s sVar, w wVar) {
        return new t(aVar, aVar2, eVar, sVar, wVar);
    }

    @Override // h8.a
    /* renamed from: b */
    public t get() {
        return c(this.f5081a.get(), this.f5082b.get(), this.f5083c.get(), this.f5084d.get(), this.f5085e.get());
    }
}
