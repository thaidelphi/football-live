package c3;

import android.content.Context;
/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j implements d3.b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<Context> f5433a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a<l3.a> f5434b;

    /* renamed from: c  reason: collision with root package name */
    private final h8.a<l3.a> f5435c;

    public j(h8.a<Context> aVar, h8.a<l3.a> aVar2, h8.a<l3.a> aVar3) {
        this.f5433a = aVar;
        this.f5434b = aVar2;
        this.f5435c = aVar3;
    }

    public static j a(h8.a<Context> aVar, h8.a<l3.a> aVar2, h8.a<l3.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, l3.a aVar, l3.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // h8.a
    /* renamed from: b */
    public i get() {
        return c(this.f5433a.get(), this.f5434b.get(), this.f5435c.get());
    }
}
