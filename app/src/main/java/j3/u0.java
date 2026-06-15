package j3;

import android.content.Context;
/* compiled from: SchemaManager_Factory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u0 implements d3.b<t0> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<Context> f26926a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a<String> f26927b;

    /* renamed from: c  reason: collision with root package name */
    private final h8.a<Integer> f26928c;

    public u0(h8.a<Context> aVar, h8.a<String> aVar2, h8.a<Integer> aVar3) {
        this.f26926a = aVar;
        this.f26927b = aVar2;
        this.f26928c = aVar3;
    }

    public static u0 a(h8.a<Context> aVar, h8.a<String> aVar2, h8.a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // h8.a
    /* renamed from: b */
    public t0 get() {
        return c(this.f26926a.get(), this.f26927b.get(), this.f26928c.get().intValue());
    }
}
