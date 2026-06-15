package j3;

import android.content.Context;
/* compiled from: EventStoreModule_PackageNameFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h implements d3.b<String> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<Context> f26864a;

    public h(h8.a<Context> aVar) {
        this.f26864a = aVar;
    }

    public static h a(h8.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) d3.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h8.a
    /* renamed from: b */
    public String get() {
        return c(this.f26864a.get());
    }
}
