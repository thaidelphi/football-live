package c3;

import android.content.Context;
/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l implements d3.b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<Context> f5441a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a<i> f5442b;

    public l(h8.a<Context> aVar, h8.a<i> aVar2) {
        this.f5441a = aVar;
        this.f5442b = aVar2;
    }

    public static l a(h8.a<Context> aVar, h8.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // h8.a
    /* renamed from: b */
    public k get() {
        return c(this.f5441a.get(), this.f5442b.get());
    }
}
