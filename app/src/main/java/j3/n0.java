package j3;
/* compiled from: SQLiteEventStore_Factory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n0 implements d3.b<m0> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<l3.a> f26893a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a<l3.a> f26894b;

    /* renamed from: c  reason: collision with root package name */
    private final h8.a<e> f26895c;

    /* renamed from: d  reason: collision with root package name */
    private final h8.a<t0> f26896d;

    /* renamed from: e  reason: collision with root package name */
    private final h8.a<String> f26897e;

    public n0(h8.a<l3.a> aVar, h8.a<l3.a> aVar2, h8.a<e> aVar3, h8.a<t0> aVar4, h8.a<String> aVar5) {
        this.f26893a = aVar;
        this.f26894b = aVar2;
        this.f26895c = aVar3;
        this.f26896d = aVar4;
        this.f26897e = aVar5;
    }

    public static n0 a(h8.a<l3.a> aVar, h8.a<l3.a> aVar2, h8.a<e> aVar3, h8.a<t0> aVar4, h8.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(l3.a aVar, l3.a aVar2, Object obj, Object obj2, h8.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // h8.a
    /* renamed from: b */
    public m0 get() {
        return c(this.f26893a.get(), this.f26894b.get(), this.f26895c.get(), this.f26896d.get(), this.f26897e);
    }
}
